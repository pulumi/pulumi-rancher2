import * as std from '@jkcfg/std';

const base = {
    name: "ci",
    on: {
        pull_request: {
            branches: [ 'master' ]
        },
        push: {
            tags: [ "v*" ]
        }
    },
    env: {
        GO111MODULE: "on",
        PROVIDER: "rancher2",
    }
}

const runsOn = "ubuntu-latest"

const setupSteps = [
    {
        name: 'Checkout',
        uses: 'actions/checkout@v2',
    },
    {
        name: 'Install Go 1.13',
        uses: 'actions/setup-go@v2',
        with: {
            'go-version': '1.13.x',
        },
    },
    {
        name: 'Install tf2pulumi',
        uses: 'pulumi/action-install-tf2pulumi@releases/v1',
        with: {
            'tf2pulumi-version': '0.7.0',
        }
    }
]

const jobs = {
    jobs: {
        lint: {
            'runs-on': runsOn,
            'container': 'golangci/golangci-lint:v1.25.1',
            steps: setupSteps,
        },
        prerequisites: {
            'runs-on': runsOn
        },
        build_sdk: {
            'runs-on': runsOn
        },
        test: {
            'runs-on': runsOn
        },
    },
}

const manifest = {...base, ...jobs}

const out = [
    manifest
]


std.write(out, `.github/workflows/ci.yaml`, { format: std.Format.YAMLStream});
