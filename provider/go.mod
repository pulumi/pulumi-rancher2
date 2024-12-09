module github.com/pulumi/pulumi-rancher2/provider/v8

go 1.22.0

toolchain go1.22.7

replace (
	// tfinstall was removed from terraform-exec in v0.16.0.
	//
	// Pinning avoids this error:
	//
	//	go: finding module for package github.com/hashicorp/terraform-exec/tfinstall
	//	go: github.com/pulumi/pulumi-rancher2/provider/v6 imports
	//	        github.com/rancher/terraform-provider-rancher2/rancher2 imports
	//	        github.com/hashicorp/terraform-plugin-sdk/helper/resource imports
	//	        github.com/hashicorp/terraform-plugin-test/v2 imports
	//	        github.com/hashicorp/terraform-exec/tfinstall: module github.com/hashicorp/terraform-exec@latest found (v0.20.0), but does not contain package github.com/hashicorp/terraform-exec/tfinstall
	github.com/hashicorp/terraform-exec => github.com/hashicorp/terraform-exec v0.15.0
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20240520223432-0c0bf0d65f10
)

// Replace block copied from upstream
replace (
	github.com/crewjam/saml => github.com/crewjam/saml v0.4.5
	github.com/docker/distribution => github.com/docker/distribution v2.8.1+incompatible
	github.com/docker/docker => github.com/docker/docker v20.10.17+incompatible
	github.com/rancher/rancher/pkg/apis => github.com/rancher/rancher/pkg/apis v0.0.0-20240716141526-e0d2afd007d8
	github.com/rancher/rancher/pkg/client => github.com/rancher/rancher/pkg/client v0.0.0-20240716141526-e0d2afd007d8
	github.com/spf13/afero => github.com/spf13/afero v1.2.2
	go.opentelemetry.io/otel/metric => go.opentelemetry.io/otel/metric v1.19.0
	go.qase.io/client => github.com/rancher/qase-go/client v0.0.0-20231114201952-65195ec001fa
	helm.sh/helm/v3 => github.com/rancher/helm/v3 v3.9.0-rancher1

	k8s.io/api => k8s.io/api v0.30.1
	k8s.io/apiextensions-apiserver => k8s.io/apiextensions-apiserver v0.30.1
	k8s.io/apimachinery => k8s.io/apimachinery v0.30.1
	k8s.io/apiserver => k8s.io/apiserver v0.30.1
	k8s.io/cli-runtime => k8s.io/cli-runtime v0.30.1
	k8s.io/client-go => k8s.io/client-go v0.30.1
	k8s.io/cloud-provider => k8s.io/cloud-provider v0.30.1
	k8s.io/cluster-bootstrap => k8s.io/cluster-bootstrap v0.30.1
	k8s.io/code-generator => k8s.io/code-generator v0.30.1
	k8s.io/component-base => k8s.io/component-base v0.30.1
	k8s.io/component-helpers => k8s.io/component-helpers v0.30.1
	k8s.io/controller-manager => k8s.io/controller-manager v0.30.1
	k8s.io/cri-api => k8s.io/cri-api v0.30.1
	k8s.io/csi-translation-lib => k8s.io/csi-translation-lib v0.30.1
	k8s.io/dynamic-resource-allocation => k8s.io/dynamic-resource-allocation v0.30.1
	k8s.io/endpointslice => k8s.io/endpointslice v0.30.1
	k8s.io/kms => k8s.io/kms v0.30.1
	k8s.io/kube-aggregator => k8s.io/kube-aggregator v0.30.1
	k8s.io/kube-controller-manager => k8s.io/kube-controller-manager v0.30.1
	k8s.io/kube-openapi => k8s.io/kube-openapi v0.0.0-20230717233707-2695361300d9
	k8s.io/kube-proxy => k8s.io/kube-proxy v0.30.1
	k8s.io/kube-scheduler => k8s.io/kube-scheduler v0.30.1
	k8s.io/kubectl => k8s.io/kubectl v0.30.1
	k8s.io/kubelet => k8s.io/kubelet v0.30.1
	k8s.io/kubernetes => k8s.io/kubernetes v1.30.1
	k8s.io/legacy-cloud-providers => k8s.io/legacy-cloud-providers v0.30.1
	k8s.io/metrics => k8s.io/metrics v0.30.1
	k8s.io/mount-utils => k8s.io/mount-utils v0.30.1
	k8s.io/pod-security-admission => k8s.io/pod-security-admission v0.30.1
	k8s.io/sample-apiserver => k8s.io/sample-apiserver v0.30.1
	launchpad.net/gocheck => github.com/go-check/check v0.0.0-20200227125254-8fa46927fb4f
)

require (
	github.com/hashicorp/terraform-plugin-sdk v1.17.2
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.96.1-0.20241209153914-c1171a037064
	github.com/pulumi/pulumi/sdk/v3 v3.142.0
	github.com/rancher/terraform-provider-rancher2 v1.25.1-0.20241125192454-e9c7b7043209
)

require (
	cloud.google.com/go v0.112.1 // indirect
	cloud.google.com/go/compute/metadata v0.5.0 // indirect
	cloud.google.com/go/iam v1.1.6 // indirect
	cloud.google.com/go/storage v1.39.1 // indirect
	dario.cat/mergo v1.0.0 // indirect
	github.com/BurntSushi/toml v1.3.2 // indirect
	github.com/Masterminds/goutils v1.1.1 // indirect
	github.com/Masterminds/semver v1.5.0 // indirect
	github.com/Masterminds/semver/v3 v3.2.1 // indirect
	github.com/Masterminds/sprig/v3 v3.2.3 // indirect
	github.com/Microsoft/go-winio v0.6.2 // indirect
	github.com/ProtonMail/go-crypto v1.1.0-alpha.0 // indirect
	github.com/aead/chacha20 v0.0.0-20180709150244-8b13a72661da // indirect
	github.com/agext/levenshtein v1.2.3 // indirect
	github.com/apparentlymart/go-cidr v1.1.0 // indirect
	github.com/apparentlymart/go-textseg/v15 v15.0.0 // indirect
	github.com/armon/go-radix v1.0.0 // indirect
	github.com/atotto/clipboard v0.1.4 // indirect
	github.com/aws/aws-sdk-go v1.50.38 // indirect
	github.com/aymanbagabas/go-osc52/v2 v2.0.1 // indirect
	github.com/beorn7/perks v1.0.1 // indirect
	github.com/bgentry/go-netrc v0.0.0-20140422174119-9fd32a8b3d3d // indirect
	github.com/bgentry/speakeasy v0.1.0 // indirect
	github.com/blang/semver v3.5.1+incompatible // indirect
	github.com/blang/semver/v4 v4.0.0 // indirect
	github.com/cespare/xxhash/v2 v2.3.0 // indirect
	github.com/charmbracelet/bubbles v0.16.1 // indirect
	github.com/charmbracelet/bubbletea v0.25.0 // indirect
	github.com/charmbracelet/lipgloss v0.7.1 // indirect
	github.com/cheggaaa/pb v1.0.29 // indirect
	github.com/cloudflare/circl v1.3.7 // indirect
	github.com/containerd/console v1.0.4-0.20230313162750-1ae8d489ac81 // indirect
	github.com/cyphar/filepath-securejoin v0.2.5 // indirect
	github.com/davecgh/go-spew v1.1.2-0.20180830191138-d8f796af33cc // indirect
	github.com/deckarep/golang-set/v2 v2.5.0 // indirect
	github.com/djherbis/times v1.5.0 // indirect
	github.com/edsrzf/mmap-go v1.1.0 // indirect
	github.com/emicklei/go-restful/v3 v3.11.0 // indirect
	github.com/emirpasic/gods v1.18.1 // indirect
	github.com/ettle/strcase v0.1.1 // indirect
	github.com/evanphx/json-patch v5.7.0+incompatible // indirect
	github.com/fatih/color v1.16.0 // indirect
	github.com/felixge/httpsnoop v1.0.4 // indirect
	github.com/ghodss/yaml v1.0.0 // indirect
	github.com/go-git/gcfg v1.5.1-0.20230307220236-3a3c6141e376 // indirect
	github.com/go-git/go-billy/v5 v5.5.0 // indirect
	github.com/go-git/go-git/v5 v5.12.0 // indirect
	github.com/go-logr/logr v1.4.1 // indirect
	github.com/go-logr/stdr v1.2.2 // indirect
	github.com/go-openapi/jsonpointer v0.19.6 // indirect
	github.com/go-openapi/jsonreference v0.20.2 // indirect
	github.com/go-openapi/swag v0.22.10 // indirect
	github.com/gofrs/uuid v4.4.0+incompatible // indirect
	github.com/gogo/protobuf v1.3.2 // indirect
	github.com/golang/glog v1.2.2 // indirect
	github.com/golang/groupcache v0.0.0-20210331224755-41bb18bfe9da // indirect
	github.com/golang/protobuf v1.5.4 // indirect
	github.com/google/gnostic-models v0.6.8 // indirect
	github.com/google/go-cmp v0.6.0 // indirect
	github.com/google/go-github/v29 v29.0.3 // indirect
	github.com/google/go-querystring v1.1.0 // indirect
	github.com/google/gofuzz v1.2.0 // indirect
	github.com/google/s2a-go v0.1.7 // indirect
	github.com/google/shlex v0.0.0-20191202100458-e7afc7fbc510 // indirect
	github.com/google/uuid v1.6.0 // indirect
	github.com/googleapis/enterprise-certificate-proxy v0.3.2 // indirect
	github.com/googleapis/gax-go/v2 v2.12.2 // indirect
	github.com/gorilla/handlers v1.5.1 // indirect
	github.com/gorilla/mux v1.8.1 // indirect
	github.com/gorilla/websocket v1.5.1 // indirect
	github.com/grpc-ecosystem/grpc-opentracing v0.0.0-20180507213350-8e809c8a8645 // indirect
	github.com/hashicorp/errwrap v1.1.0 // indirect
	github.com/hashicorp/go-checkpoint v0.5.0 // indirect
	github.com/hashicorp/go-cleanhttp v0.5.2 // indirect
	github.com/hashicorp/go-cty v1.4.1-0.20200414143053-d3edf31b6320 // indirect
	github.com/hashicorp/go-getter v1.7.5 // indirect
	github.com/hashicorp/go-hclog v1.6.3 // indirect
	github.com/hashicorp/go-multierror v1.1.1 // indirect
	github.com/hashicorp/go-plugin v1.6.2 // indirect
	github.com/hashicorp/go-safetemp v1.0.0 // indirect
	github.com/hashicorp/go-uuid v1.0.3 // indirect
	github.com/hashicorp/go-version v1.6.0 // indirect
	github.com/hashicorp/hcl v1.0.0 // indirect
	github.com/hashicorp/hcl/v2 v2.22.0 // indirect
	github.com/hashicorp/hil v0.0.0-20190212132231-97b3a9cdfa93 // indirect
	github.com/hashicorp/logutils v1.0.0 // indirect
	github.com/hashicorp/terraform-config-inspect v0.0.0-20191212124732-c6ae6269b9d7 // indirect
	github.com/hashicorp/terraform-exec v0.20.0 // indirect
	github.com/hashicorp/terraform-json v0.21.0 // indirect
	github.com/hashicorp/terraform-plugin-go v0.25.0 // indirect
	github.com/hashicorp/terraform-plugin-log v0.9.0 // indirect
	github.com/hashicorp/terraform-plugin-test/v2 v2.2.1 // indirect
	github.com/hashicorp/terraform-svchost v0.1.1 // indirect
	github.com/hashicorp/yamux v0.1.1 // indirect
	github.com/huandu/xstrings v1.4.0 // indirect
	github.com/iancoleman/strcase v0.2.0 // indirect
	github.com/imdario/mergo v0.3.16 // indirect
	github.com/inconshreveable/mousetrap v1.1.0 // indirect
	github.com/jbenet/go-context v0.0.0-20150711004518-d14ea06fba99 // indirect
	github.com/jmespath/go-jmespath v0.4.0 // indirect
	github.com/josharian/intern v1.0.0 // indirect
	github.com/json-iterator/go v1.1.12 // indirect
	github.com/kevinburke/ssh_config v1.2.0 // indirect
	github.com/klauspost/compress v1.17.7 // indirect
	github.com/lucasb-eyer/go-colorful v1.2.0 // indirect
	github.com/mailru/easyjson v0.7.7 // indirect
	github.com/matryer/moq v0.3.4 // indirect
	github.com/mattn/go-colorable v0.1.13 // indirect
	github.com/mattn/go-isatty v0.0.20 // indirect
	github.com/mattn/go-localereader v0.0.1 // indirect
	github.com/mattn/go-runewidth v0.0.15 // indirect
	github.com/matttproud/golang_protobuf_extensions/v2 v2.0.0 // indirect
	github.com/mitchellh/cli v1.1.5 // indirect
	github.com/mitchellh/colorstring v0.0.0-20190213212951-d06e56a500db // indirect
	github.com/mitchellh/copystructure v1.2.0 // indirect
	github.com/mitchellh/go-homedir v1.1.0 // indirect
	github.com/mitchellh/go-ps v1.0.0 // indirect
	github.com/mitchellh/go-testing-interface v1.14.1 // indirect
	github.com/mitchellh/go-wordwrap v1.0.1 // indirect
	github.com/mitchellh/hashstructure v1.0.0 // indirect
	github.com/mitchellh/mapstructure v1.5.0 // indirect
	github.com/mitchellh/reflectwalk v1.0.2 // indirect
	github.com/moby/locker v1.0.1 // indirect
	github.com/modern-go/concurrent v0.0.0-20180306012644-bacd9c7ef1dd // indirect
	github.com/modern-go/reflect2 v1.0.2 // indirect
	github.com/muesli/ansi v0.0.0-20230316100256-276c6243b2f6 // indirect
	github.com/muesli/cancelreader v0.2.2 // indirect
	github.com/muesli/reflow v0.3.0 // indirect
	github.com/muesli/termenv v0.15.2 // indirect
	github.com/munnerz/goautoneg v0.0.0-20191010083416-a7dc8b61c822 // indirect
	github.com/natefinch/atomic v1.0.1 // indirect
	github.com/oklog/run v1.1.0 // indirect
	github.com/olekukonko/tablewriter v0.0.5 // indirect
	github.com/opentracing/basictracer-go v1.1.0 // indirect
	github.com/opentracing/opentracing-go v1.2.0 // indirect
	github.com/pgavlin/fx v0.1.6 // indirect
	github.com/pgavlin/goldmark v1.1.33-0.20200616210433-b5eb04559386 // indirect
	github.com/pjbgf/sha1cd v0.3.0 // indirect
	github.com/pkg/errors v0.9.1 // indirect
	github.com/pkg/term v1.1.0 // indirect
	github.com/posener/complete v1.2.3 // indirect
	github.com/prometheus/client_golang v1.18.0 // indirect
	github.com/prometheus/client_model v0.5.0 // indirect
	github.com/prometheus/common v0.45.0 // indirect
	github.com/prometheus/procfs v0.12.0 // indirect
	github.com/pulumi/appdash v0.0.0-20231130102222-75f619a67231 // indirect
	github.com/pulumi/esc v0.10.0 // indirect
	github.com/pulumi/inflector v0.1.1 // indirect
	github.com/pulumi/pulumi-java/pkg v0.18.0 // indirect
	github.com/pulumi/pulumi-yaml v1.12.0 // indirect
	github.com/pulumi/pulumi/pkg/v3 v3.142.0 // indirect
	github.com/pulumi/schema-tools v0.1.2 // indirect
	github.com/pulumi/terraform-diff-reader v0.0.2 // indirect
	github.com/rancher/aks-operator v1.9.0-rc.9 // indirect
	github.com/rancher/apiserver v0.0.0-20240708202538-39a6f2535146 // indirect
	github.com/rancher/channelserver v0.7.0 // indirect
	github.com/rancher/eks-operator v1.9.0-rc.9 // indirect
	github.com/rancher/fleet/pkg/apis v0.10.0-rc.19 // indirect
	github.com/rancher/gke-operator v1.9.0-rc.8 // indirect
	github.com/rancher/lasso v0.0.0-20240705194423-b2a060d103c1 // indirect
	github.com/rancher/norman v0.0.0-20240708202514-a0127673d1b9 // indirect
	github.com/rancher/rancher v0.0.0-20240716141526-e0d2afd007d8 // indirect
	github.com/rancher/rancher/pkg/apis v0.0.0 // indirect
	github.com/rancher/rancher/pkg/client v0.0.0 // indirect
	github.com/rancher/rke v1.6.0-rc9 // indirect
	github.com/rancher/wrangler/v3 v3.0.0 // indirect
	github.com/rivo/uniseg v0.4.4 // indirect
	github.com/rogpeppe/go-internal v1.12.0 // indirect
	github.com/russross/blackfriday/v2 v2.1.0 // indirect
	github.com/sabhiram/go-gitignore v0.0.0-20210923224102-525f6e181f06 // indirect
	github.com/santhosh-tekuri/jsonschema/v5 v5.0.0 // indirect
	github.com/segmentio/asm v1.1.3 // indirect
	github.com/segmentio/encoding v0.3.5 // indirect
	github.com/sergi/go-diff v1.3.2-0.20230802210424-5b0b94c5c0d3 // indirect
	github.com/shopspring/decimal v1.3.1 // indirect
	github.com/sirupsen/logrus v1.9.3 // indirect
	github.com/skeema/knownhosts v1.2.2 // indirect
	github.com/spf13/afero v1.11.0 // indirect
	github.com/spf13/cast v1.6.0 // indirect
	github.com/spf13/cobra v1.8.0 // indirect
	github.com/spf13/pflag v1.0.5 // indirect
	github.com/teekennedy/goldmark-markdown v0.3.0 // indirect
	github.com/texttheater/golang-levenshtein v1.0.1 // indirect
	github.com/uber/jaeger-client-go v2.30.0+incompatible // indirect
	github.com/uber/jaeger-lib v2.4.1+incompatible // indirect
	github.com/ulikunitz/xz v0.5.11 // indirect
	github.com/vmihailenco/msgpack/v5 v5.4.1 // indirect
	github.com/vmihailenco/tagparser/v2 v2.0.0 // indirect
	github.com/xanzy/ssh-agent v0.3.3 // indirect
	github.com/yuin/goldmark v1.7.4 // indirect
	github.com/zclconf/go-cty v1.14.2 // indirect
	github.com/zclconf/go-cty-yaml v1.0.2 // indirect
	go.opencensus.io v0.24.0 // indirect
	go.opentelemetry.io/contrib/instrumentation/google.golang.org/grpc/otelgrpc v0.49.0 // indirect
	go.opentelemetry.io/contrib/instrumentation/net/http/otelhttp v0.49.0 // indirect
	go.opentelemetry.io/otel v1.24.0 // indirect
	go.opentelemetry.io/otel/metric v1.24.0 // indirect
	go.opentelemetry.io/otel/trace v1.24.0 // indirect
	go.uber.org/atomic v1.11.0 // indirect
	golang.org/x/crypto v0.26.0 // indirect
	golang.org/x/exp v0.0.0-20240604190554-fc45aab8b7f8 // indirect
	golang.org/x/mod v0.19.0 // indirect
	golang.org/x/net v0.28.0 // indirect
	golang.org/x/oauth2 v0.22.0 // indirect
	golang.org/x/sync v0.8.0 // indirect
	golang.org/x/sys v0.24.0 // indirect
	golang.org/x/term v0.23.0 // indirect
	golang.org/x/text v0.17.0 // indirect
	golang.org/x/time v0.5.0 // indirect
	golang.org/x/tools v0.23.0 // indirect
	google.golang.org/api v0.169.0 // indirect
	google.golang.org/genproto v0.0.0-20240311173647-c811ad7063a7 // indirect
	google.golang.org/genproto/googleapis/api v0.0.0-20240814211410-ddb44dafa142 // indirect
	google.golang.org/genproto/googleapis/rpc v0.0.0-20240814211410-ddb44dafa142 // indirect
	google.golang.org/grpc v1.67.1 // indirect
	google.golang.org/protobuf v1.35.1 // indirect
	gopkg.in/inf.v0 v0.9.1 // indirect
	gopkg.in/warnings.v0 v0.1.2 // indirect
	gopkg.in/yaml.v2 v2.4.0 // indirect
	gopkg.in/yaml.v3 v3.0.1 // indirect
	k8s.io/api v0.30.2 // indirect
	k8s.io/apiextensions-apiserver v0.30.1 // indirect
	k8s.io/apimachinery v0.30.2 // indirect
	k8s.io/apiserver v0.30.1 // indirect
	k8s.io/client-go v12.0.0+incompatible // indirect
	k8s.io/component-base v0.30.1 // indirect
	k8s.io/klog/v2 v2.120.1 // indirect
	k8s.io/kube-openapi v0.0.0-20240411171206-dc4e619f62f3 // indirect
	k8s.io/kubernetes v1.30.1 // indirect
	k8s.io/utils v0.0.0-20240102154912-e7106e64919e // indirect
	lukechampine.com/frand v1.4.2 // indirect
	sigs.k8s.io/cli-utils v0.35.0 // indirect
	sigs.k8s.io/cluster-api v1.7.3 // indirect
	sigs.k8s.io/json v0.0.0-20221116044647-bc3834ca7abd // indirect
	sigs.k8s.io/structured-merge-diff/v4 v4.4.1 // indirect
	sigs.k8s.io/yaml v1.4.0 // indirect
)
