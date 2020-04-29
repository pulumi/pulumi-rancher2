PROJECT_NAME := Rancher2 Package

PACK             := rancher2
PACKDIR          := sdk
PROJECT          := github.com/pulumi/pulumi-${PACK}
NODE_MODULE_NAME := @pulumi/${PACK}
TF_NAME          := ${PACK}
ORG              := pulumi

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

build:: tfgen generate_schema provider build_node

tfgen::
	cd provider && go build -o $(WORKSPACE)/bin/${TFGEN} -ldflags "-X github.com/${ORG}/pulumi-${PACK}/provider/pkg/version.Version=${VERSION}" ${PROJECT}/provider/cmd/${TFGEN}

generate_schema:: tfgen
	$(WORKSPACE)/bin/${TFGEN} schema --out $(WORKSPACE)/provider/cmd/${PROVIDER}

provider:: generate_schema
	cd provider && go generate cmd/${PROVIDER}/main.go
	cd provider && go build -o $(WORKSPACE)/bin/${PROVIDER} -ldflags "-X github.com/${ORG}/pulumi-${PACK}/provider/v2/pkg/version.Version=${VERSION}" ${PROJECT}/provider/v2/cmd/${PROVIDER}

build_node::
	$(WORKSPACE)/bin/$(TFGEN) nodejs --overlays overlays/nodejs --out ${PACKDIR}/nodejs/
	cd ${PACKDIR}/nodejs/ && \
        yarn install && \
        yarn run tsc && \
        cp ../../README.md ../../LICENSE package.json yarn.lock ./bin/ && \
		sed -i.bak -e "s/\$${VERSION}/$(VERSION)/g" ./bin/package.json

# The travis_* targets are entrypoints for CI.
.PHONY: travis_cron travis_push travis_pull_request travis_api
travis_cron: ;
travis_push: ;
travis_pull_request: ;
travis_api: ;
