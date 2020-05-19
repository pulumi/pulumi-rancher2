import * as std from '@jkcfg/std';
import * as param from '@jkcfg/std/param';

const provider = param.String('provider')

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
        PROVIDER: provider,
        GITHUB_TOKEN: "${{ secrets.GITHUB_TOKEN }}"
    }
}

const runsOn = "ubuntu-latest"

const baseSetupSteps = [
    {
        name: 'Checkout',
        uses: 'actions/checkout@v2',
    },
    {
        name: "Unshallow clone",
        run: "git fetch --prune --unshallow",
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
        uses: 'jaxxstorm/action-install-gh-release@release/v1-alpha',
        with: {
            'repo': 'pulumi/tf2pulumi',
        }
    },
    {
        name: 'Install pulumictl',
        uses: 'jaxxstorm/action-install-gh-release@release/v1-alpha',
        with: {
            'repo': 'pulumi/pulumictl',
            'tag': 'v0.0.1-alpha.2',
        }
    }
]

const sdkSetupSteps = [
    {
        name: "Set up Node",
        uses: "actions/setup-node@v1",
        with: {
            "node-version": "13.x",
            "registry-url": "https://registry.npmjs.org",
        }
    },
    {
        name: "Set up dotnet",
        uses: "actions/setup-dotnet@v1",
        with: {
            "dotnet-version": '3.1.201'
        }
    },
    {
        name: "Set up Python",
        uses: "actions/setup-python@v1",
        with: {
            "python-version": '3.x',
        },
    }
]
const jobs = {
    jobs: {
        lint: {
            'runs-on': runsOn,
            'container': 'golangci/golangci-lint:v1.25.1',
            steps: [...baseSetupSteps, {
                name: "Run GolangCI",
                run: "make lint_provider"
            }]
        },
        prerequisites: {
            'runs-on': runsOn,
            steps: [...baseSetupSteps, {
                name: "Build tfgen & provider binaries",
                run: "make provider"}, {
                name: "Upload artifacts",
                uses: "actions/upload-artifact@v2",
                with: {
                    name: "pulumi-${{ env.PROVIDER }}",
                    path: "${{ github.workspace }}/bin",
                }
            }]
        },
        build_sdk: {
            'runs-on': runsOn,
            needs: 'prerequisites',
            strategy: {
                'fail-fast': true,
                matrix: {
                    language: [ "nodejs", "python", "dotnet"]
                }
            },
            steps: [...baseSetupSteps, ...sdkSetupSteps,
                {
                    name: "Build SDK",
                    run: "make build_${{ matrix.language }}",
                }, {
                    name: "Upload artifacts",
                    uses: "actions/upload-artifact@v2",
                    with: {
                        name: "${{ matrix.language  }}-sdk",
                        path: "${{ github.workspace}}/sdk/${{ matrix.language }}"
                    }
                }]
        },
    },
}

const manifest = {...base, ...jobs}

const out = [
    manifest
]


std.write(out, `.github/workflows/ci.yaml`, { format: std.Format.YAMLStream});
