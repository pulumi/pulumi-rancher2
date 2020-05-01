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

DOTNET_PREFIX  := $(firstword $(subst -, ,${VERSION:v%=%})) # e.g. 1.5.0
DOTNET_SUFFIX  := $(word 2,$(subst -, ,${VERSION:v%=%}))    # e.g. alpha.1

ifeq ($(strip ${DOTNET_SUFFIX}),)
	DOTNET_VERSION := $(strip ${DOTNET_PREFIX})
else
	DOTNET_VERSION := $(strip ${DOTNET_PREFIX})-$(strip ${DOTNET_SUFFIX})
endif

TESTPARALLELISM := 4

development:: tfgen generate_schema provider build_node build_python build_dotnet build_go # Build the provider & SDK for a development environment

tfgen:: # build the tfgen binary
	cd provider && go build -a -o $(WORKSPACE)/bin/${TFGEN} -ldflags "-X ${PROJECT}/${VERSION_PATH}=${VERSION}" ${PROJECT}/${PROVIDER_PATH}/cmd/${TFGEN}

generate_schema:: tfgen # generate the provider schema
	$(WORKSPACE)/bin/${TFGEN} schema --out $(WORKSPACE)/provider/cmd/${PROVIDER}

provider:: generate_schema # build the provider binary
	cd provider && go generate cmd/${PROVIDER}/main.go
	cd provider && go build -a -o $(WORKSPACE)/bin/${PROVIDER} -ldflags "-X ${PROJECT}/${VERSION_PATH}=${VERSION}" ${PROJECT}/${PROVIDER_PATH}/cmd/${PROVIDER}

build_node:: # build the node sdk
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

lint_provider:: # lint the provider code
	cd provider && golangci-lint run -c ../.golangci.yml

help::
	@grep '^[^.#]\+:\s\+.*#' Makefile | \
 	sed "s/\(.\+\):\s*\(.*\) #\s*\(.*\)/`printf "\033[93m"`\1`printf "\033[0m"`	\3 [\2]/" | \
 	expand -t20

.PHONY: clean
clean::
	rm -rf sdk/{dotnet,nodejs,go,python}


# The travis_* targets are entrypoints for CI.
.PHONY: travis_cron travis_push travis_pull_request travis_api
travis_cron: ;
travis_push: ;
travis_pull_request: ;
travis_api: ;
