PACK             := rancher2
ORG              := pulumi
PROJECT          := github.com/${ORG}/pulumi-${PACK}
NODE_MODULE_NAME := @pulumi/${PACK}
TF_NAME          := ${PACK}
PROVIDER_PATH    := provider/v2
VERSION_PATH     := ${PROVIDER_PATH}/pkg/version.Version

TFGEN           := pulumi-tfgen-${PACK}
PROVIDER        := pulumi-resource-${PACK}
VERSION         := $(shell scripts/get-version)
PYPI_VERSION    := $(shell scripts/get-py-version)
WORKSPACE       := $(shell scripts/get-workspace)

TEST_TAGS       := all

DOTNET_PREFIX  := $(firstword $(subst -, ,${VERSION:v%=%})) # e.g. 1.5.0
DOTNET_SUFFIX  := $(word 2,$(subst -, ,${VERSION:v%=%}))    # e.g. alpha.1

ifeq ($(strip ${DOTNET_SUFFIX}),)
	DOTNET_VERSION := $(strip ${DOTNET_PREFIX})
else
	DOTNET_VERSION := $(strip ${DOTNET_PREFIX})-$(strip ${DOTNET_SUFFIX})
endif

ifeq ($(PULUMI_ROOT),)
	PULUMI_ROOT:=/opt/pulumi
endif

PULUMI_BIN          := $(PULUMI_ROOT)/bin
PULUMI_NODE_MODULES := $(PULUMI_ROOT)/node_modules
PULUMI_NUGET        := $(PULUMI_ROOT)/nuget

TESTPARALLELISM := 4

.PHONY: clean lint_provider build_dotnet build_go build_python build_nodejs provider generate generate_provider generate_schema tfgen development

development:: tfgen generate_schema provider build_nodejs build_python build_dotnet build_go # Build the provider & SDK for a development environment

tfgen:: # build the tfgen binary
	cd provider && go build -a -o $(WORKSPACE)/bin/${TFGEN} -ldflags "-X ${PROJECT}/${VERSION_PATH}=${VERSION}" ${PROJECT}/${PROVIDER_PATH}/cmd/${TFGEN}

generate_schema:: tfgen # generate the provider schema
	$(WORKSPACE)/bin/${TFGEN} schema --out $(WORKSPACE)/provider/cmd/${PROVIDER}

generate_provider:: # generate the provider (go generate)
	cd provider && go generate cmd/${PROVIDER}/main.go

generate:: generate_schema generate_provider # generate the schema and the provider

provider:: generate # build the provider binary
	cd provider && go build -a -o $(WORKSPACE)/bin/${PROVIDER} -ldflags "-X ${PROJECT}/${VERSION_PATH}=${VERSION}" ${PROJECT}/${PROVIDER_PATH}/cmd/${PROVIDER}

build_nodejs:: # build the node sdk
	$(WORKSPACE)/bin/$(TFGEN) nodejs --overlays provider/overlays/nodejs --out sdk/nodejs/
	cd sdk/nodejs/ && \
        yarn install && \
        yarn run tsc && \
        cp ../../README.md ../../LICENSE package.json yarn.lock ./bin/ && \
    	sed -i.bak -e "s/\$${VERSION}/$(VERSION)/g" ./bin/package.json

build_python:: # build the python sdk
	$(WORKSPACE)/bin/$(TFGEN) python --overlays provider/overlays/python --out sdk/python/
	cd sdk/python/ && \
        cp ../../README.md . && \
        python3 setup.py clean --all 2>/dev/null && \
        rm -rf ./bin/ ../python.bin/ && cp -R . ../python.bin && mv ../python.bin ./bin && \
        sed -i.bak -e "s/\$${VERSION}/$(PYPI_VERSION)/g" -e "s/\$${PLUGIN_VERSION}/$(VERSION)/g" ./bin/setup.py && \
        rm ./bin/setup.py.bak && \
        cd ./bin && python3 setup.py build sdist

build_go:: # build the go sdk
	$(WORKSPACE)/bin/$(TFGEN) go --overlays provider/overlays/go --out sdk/go/

build_dotnet:: # build the dotnet sdk
	$(WORKSPACE)/bin/$(TFGEN) dotnet --overlays provider/overlays/dotnet --out sdk/dotnet/
	cd sdk/dotnet/ && \
		echo "${VERSION:v%=%}" >version.txt && \
        dotnet build /p:Version=${DOTNET_VERSION}

install::
	[ ! -e "$(PULUMI_NODE_MODULES)/$(NODE_MODULE_NAME)" ] || rm -rf "$(PULUMI_NODE_MODULES)/$(NODE_MODULE_NAME)"
	mkdir -p "$(PULUMI_NODE_MODULES)/$(NODE_MODULE_NAME)"
	cp -r sdk/nodejs/bin/. "$(PULUMI_NODE_MODULES)/$(NODE_MODULE_NAME)"
	rm -rf "$(PULUMI_NODE_MODULES)/$(NODE_MODULE_NAME)/node_modules"
	rm -rf "$(PULUMI_NODE_MODULES)/$(NODE_MODULE_NAME)/tests"
	cd "$(PULUMI_NODE_MODULES)/$(NODE_MODULE_NAME)" && \
		yarn install --offline --production && \
		(yarn unlink > /dev/null 2>&1 || true) && \
		yarn link
	echo "Copying ${NUGET_PKG_NAME} NuGet packages to ${PULUMI_NUGET}"
	mkdir -p $(PULUMI_NUGET)
	rm -rf "$(PULUMI_NUGET)/$(NUGET_PKG_NAME).*.nupkg"
	find . -name '$(NUGET_PKG_NAME).*.nupkg' -exec cp -p {} ${PULUMI_NUGET} \;

lint_provider:: generate # lint the provider code
	cd provider && golangci-lint run -c ../.golangci.yml

test_fast:: install # Run fast tests
	cd examples && go test -short -v -count=1 -cover -timeout 2h -parallel ${TESTPARALLELISM} -tags=$(TEST_TAGS) .

test_all:: install # Run all tests
	cd examples && go test -v -count=1 -cover -timeout 2h -parallel ${TESTPARALLELISM} -tags=$(TEST_TAGS) .

help::
	@grep '^[^.#]\+:\s\+.*#' Makefile | \
 	sed "s/\(.\+\):\s*\(.*\) #\s*\(.*\)/`printf "\033[93m"`\1`printf "\033[0m"`	\3 [\2]/" | \
 	expand -t20

clean::
	rm -rf sdk/{dotnet,nodejs,go,python}


