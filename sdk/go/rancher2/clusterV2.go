// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 Cluster v2 resource. This can be used to create RKE2 and K3S Clusters for Rancher v2 environments and retrieve their information. This resource is supported as tech preview from Rancher v2.6.0 and above.
//
// ## Example Usage
// ### Creating Rancher v2 custom cluster v2
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-rancher2/sdk/v3/go/rancher2"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := rancher2.NewClusterV2(ctx, "foo", &rancher2.ClusterV2Args{
// 			DefaultClusterRoleForProjectMembers: pulumi.String("user"),
// 			EnableNetworkPolicy:                 pulumi.Bool(false),
// 			FleetNamespace:                      pulumi.String("fleet-ns"),
// 			KubernetesVersion:                   pulumi.String("v1.21.4+k3s1"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// **Note** Once created, get the node command from `rancher2_cluster_v2.foo.cluster_registration_token`
//
// ## Import
//
// Clusters v2 can be imported using the Rancher Cluster v2 ID, that is in the form &lt;FLEET_NAMESPACE&gt;/&lt;CLUSTER_NAME&gt;
//
// ```sh
//  $ pulumi import rancher2:index/clusterV2:ClusterV2 foo &lt;FLEET_NAMESPACE&gt;/&lt;CLUSTER_NAME&gt;
// ```
type ClusterV2 struct {
	pulumi.CustomResourceState

	// Optional Agent Env Vars for Rancher agent (list)
	AgentEnvVars ClusterV2AgentEnvVarArrayOutput `pulumi:"agentEnvVars"`
	// Annotations for cluster registration token object (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// Cluster V2 cloud credential secret name (string)
	CloudCredentialSecretName pulumi.StringPtrOutput `pulumi:"cloudCredentialSecretName"`
	// (Computed/Sensitive) Cluster Registration Token generated for the cluster v2 (list maxitems:1)
	ClusterRegistrationToken ClusterV2ClusterRegistrationTokenOutput `pulumi:"clusterRegistrationToken"`
	// (Computed) Cluster v1 id for cluster v2. (e.g to be used with `rancher2Sync`) (string)
	ClusterV1Id pulumi.StringOutput `pulumi:"clusterV1Id"`
	// Cluster V2 default cluster role for project members (string)
	DefaultClusterRoleForProjectMembers pulumi.StringPtrOutput `pulumi:"defaultClusterRoleForProjectMembers"`
	// Cluster V2 default pod security policy template name (string)
	DefaultPodSecurityPolicyTemplateName pulumi.StringPtrOutput `pulumi:"defaultPodSecurityPolicyTemplateName"`
	// Enable k8s network policy at Cluster V2 (bool)
	EnableNetworkPolicy pulumi.BoolOutput `pulumi:"enableNetworkPolicy"`
	// The fleet namespace of the Cluster v2. Default: `\"fleet-default\"` (string)
	FleetNamespace pulumi.StringPtrOutput `pulumi:"fleetNamespace"`
	// (Computed/Sensitive) Kube Config generated for the cluster v2. Note: When the cluster has `localAuthEndpoint` enabled, the kubeConfig will not be available until the cluster is `connected` (string)
	KubeConfig pulumi.StringOutput `pulumi:"kubeConfig"`
	// The kubernetes version of the Cluster v2 (list maxitems:1)
	KubernetesVersion pulumi.StringOutput `pulumi:"kubernetesVersion"`
	// Labels for cluster registration token object (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// Use rancher2_cluster_v2.local_auth_endpoint instead
	LocalAuthEndpoint ClusterV2LocalAuthEndpointPtrOutput `pulumi:"localAuthEndpoint"`
	// Name of cluster registration token (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// (Computed) Cluster v2 k8s resource version (string)
	ResourceVersion pulumi.StringOutput `pulumi:"resourceVersion"`
	// The RKE configuration for `k3s` and `rke2` Clusters v2. (list maxitems:1)
	RkeConfig ClusterV2RkeConfigOutput `pulumi:"rkeConfig"`
}

// NewClusterV2 registers a new resource with the given unique name, arguments, and options.
func NewClusterV2(ctx *pulumi.Context,
	name string, args *ClusterV2Args, opts ...pulumi.ResourceOption) (*ClusterV2, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.KubernetesVersion == nil {
		return nil, errors.New("invalid value for required argument 'KubernetesVersion'")
	}
	var resource ClusterV2
	err := ctx.RegisterResource("rancher2:index/clusterV2:ClusterV2", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClusterV2 gets an existing ClusterV2 resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClusterV2(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClusterV2State, opts ...pulumi.ResourceOption) (*ClusterV2, error) {
	var resource ClusterV2
	err := ctx.ReadResource("rancher2:index/clusterV2:ClusterV2", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClusterV2 resources.
type clusterV2State struct {
	// Optional Agent Env Vars for Rancher agent (list)
	AgentEnvVars []ClusterV2AgentEnvVar `pulumi:"agentEnvVars"`
	// Annotations for cluster registration token object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Cluster V2 cloud credential secret name (string)
	CloudCredentialSecretName *string `pulumi:"cloudCredentialSecretName"`
	// (Computed/Sensitive) Cluster Registration Token generated for the cluster v2 (list maxitems:1)
	ClusterRegistrationToken *ClusterV2ClusterRegistrationToken `pulumi:"clusterRegistrationToken"`
	// (Computed) Cluster v1 id for cluster v2. (e.g to be used with `rancher2Sync`) (string)
	ClusterV1Id *string `pulumi:"clusterV1Id"`
	// Cluster V2 default cluster role for project members (string)
	DefaultClusterRoleForProjectMembers *string `pulumi:"defaultClusterRoleForProjectMembers"`
	// Cluster V2 default pod security policy template name (string)
	DefaultPodSecurityPolicyTemplateName *string `pulumi:"defaultPodSecurityPolicyTemplateName"`
	// Enable k8s network policy at Cluster V2 (bool)
	EnableNetworkPolicy *bool `pulumi:"enableNetworkPolicy"`
	// The fleet namespace of the Cluster v2. Default: `\"fleet-default\"` (string)
	FleetNamespace *string `pulumi:"fleetNamespace"`
	// (Computed/Sensitive) Kube Config generated for the cluster v2. Note: When the cluster has `localAuthEndpoint` enabled, the kubeConfig will not be available until the cluster is `connected` (string)
	KubeConfig *string `pulumi:"kubeConfig"`
	// The kubernetes version of the Cluster v2 (list maxitems:1)
	KubernetesVersion *string `pulumi:"kubernetesVersion"`
	// Labels for cluster registration token object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Use rancher2_cluster_v2.local_auth_endpoint instead
	LocalAuthEndpoint *ClusterV2LocalAuthEndpoint `pulumi:"localAuthEndpoint"`
	// Name of cluster registration token (string)
	Name *string `pulumi:"name"`
	// (Computed) Cluster v2 k8s resource version (string)
	ResourceVersion *string `pulumi:"resourceVersion"`
	// The RKE configuration for `k3s` and `rke2` Clusters v2. (list maxitems:1)
	RkeConfig *ClusterV2RkeConfig `pulumi:"rkeConfig"`
}

type ClusterV2State struct {
	// Optional Agent Env Vars for Rancher agent (list)
	AgentEnvVars ClusterV2AgentEnvVarArrayInput
	// Annotations for cluster registration token object (map)
	Annotations pulumi.MapInput
	// Cluster V2 cloud credential secret name (string)
	CloudCredentialSecretName pulumi.StringPtrInput
	// (Computed/Sensitive) Cluster Registration Token generated for the cluster v2 (list maxitems:1)
	ClusterRegistrationToken ClusterV2ClusterRegistrationTokenPtrInput
	// (Computed) Cluster v1 id for cluster v2. (e.g to be used with `rancher2Sync`) (string)
	ClusterV1Id pulumi.StringPtrInput
	// Cluster V2 default cluster role for project members (string)
	DefaultClusterRoleForProjectMembers pulumi.StringPtrInput
	// Cluster V2 default pod security policy template name (string)
	DefaultPodSecurityPolicyTemplateName pulumi.StringPtrInput
	// Enable k8s network policy at Cluster V2 (bool)
	EnableNetworkPolicy pulumi.BoolPtrInput
	// The fleet namespace of the Cluster v2. Default: `\"fleet-default\"` (string)
	FleetNamespace pulumi.StringPtrInput
	// (Computed/Sensitive) Kube Config generated for the cluster v2. Note: When the cluster has `localAuthEndpoint` enabled, the kubeConfig will not be available until the cluster is `connected` (string)
	KubeConfig pulumi.StringPtrInput
	// The kubernetes version of the Cluster v2 (list maxitems:1)
	KubernetesVersion pulumi.StringPtrInput
	// Labels for cluster registration token object (map)
	Labels pulumi.MapInput
	// Use rancher2_cluster_v2.local_auth_endpoint instead
	LocalAuthEndpoint ClusterV2LocalAuthEndpointPtrInput
	// Name of cluster registration token (string)
	Name pulumi.StringPtrInput
	// (Computed) Cluster v2 k8s resource version (string)
	ResourceVersion pulumi.StringPtrInput
	// The RKE configuration for `k3s` and `rke2` Clusters v2. (list maxitems:1)
	RkeConfig ClusterV2RkeConfigPtrInput
}

func (ClusterV2State) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterV2State)(nil)).Elem()
}

type clusterV2Args struct {
	// Optional Agent Env Vars for Rancher agent (list)
	AgentEnvVars []ClusterV2AgentEnvVar `pulumi:"agentEnvVars"`
	// Annotations for cluster registration token object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Cluster V2 cloud credential secret name (string)
	CloudCredentialSecretName *string `pulumi:"cloudCredentialSecretName"`
	// Cluster V2 default cluster role for project members (string)
	DefaultClusterRoleForProjectMembers *string `pulumi:"defaultClusterRoleForProjectMembers"`
	// Cluster V2 default pod security policy template name (string)
	DefaultPodSecurityPolicyTemplateName *string `pulumi:"defaultPodSecurityPolicyTemplateName"`
	// Enable k8s network policy at Cluster V2 (bool)
	EnableNetworkPolicy *bool `pulumi:"enableNetworkPolicy"`
	// The fleet namespace of the Cluster v2. Default: `\"fleet-default\"` (string)
	FleetNamespace *string `pulumi:"fleetNamespace"`
	// The kubernetes version of the Cluster v2 (list maxitems:1)
	KubernetesVersion string `pulumi:"kubernetesVersion"`
	// Labels for cluster registration token object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Use rancher2_cluster_v2.local_auth_endpoint instead
	LocalAuthEndpoint *ClusterV2LocalAuthEndpoint `pulumi:"localAuthEndpoint"`
	// Name of cluster registration token (string)
	Name *string `pulumi:"name"`
	// The RKE configuration for `k3s` and `rke2` Clusters v2. (list maxitems:1)
	RkeConfig *ClusterV2RkeConfig `pulumi:"rkeConfig"`
}

// The set of arguments for constructing a ClusterV2 resource.
type ClusterV2Args struct {
	// Optional Agent Env Vars for Rancher agent (list)
	AgentEnvVars ClusterV2AgentEnvVarArrayInput
	// Annotations for cluster registration token object (map)
	Annotations pulumi.MapInput
	// Cluster V2 cloud credential secret name (string)
	CloudCredentialSecretName pulumi.StringPtrInput
	// Cluster V2 default cluster role for project members (string)
	DefaultClusterRoleForProjectMembers pulumi.StringPtrInput
	// Cluster V2 default pod security policy template name (string)
	DefaultPodSecurityPolicyTemplateName pulumi.StringPtrInput
	// Enable k8s network policy at Cluster V2 (bool)
	EnableNetworkPolicy pulumi.BoolPtrInput
	// The fleet namespace of the Cluster v2. Default: `\"fleet-default\"` (string)
	FleetNamespace pulumi.StringPtrInput
	// The kubernetes version of the Cluster v2 (list maxitems:1)
	KubernetesVersion pulumi.StringInput
	// Labels for cluster registration token object (map)
	Labels pulumi.MapInput
	// Use rancher2_cluster_v2.local_auth_endpoint instead
	LocalAuthEndpoint ClusterV2LocalAuthEndpointPtrInput
	// Name of cluster registration token (string)
	Name pulumi.StringPtrInput
	// The RKE configuration for `k3s` and `rke2` Clusters v2. (list maxitems:1)
	RkeConfig ClusterV2RkeConfigPtrInput
}

func (ClusterV2Args) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterV2Args)(nil)).Elem()
}

type ClusterV2Input interface {
	pulumi.Input

	ToClusterV2Output() ClusterV2Output
	ToClusterV2OutputWithContext(ctx context.Context) ClusterV2Output
}

func (*ClusterV2) ElementType() reflect.Type {
	return reflect.TypeOf((*ClusterV2)(nil))
}

func (i *ClusterV2) ToClusterV2Output() ClusterV2Output {
	return i.ToClusterV2OutputWithContext(context.Background())
}

func (i *ClusterV2) ToClusterV2OutputWithContext(ctx context.Context) ClusterV2Output {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterV2Output)
}

func (i *ClusterV2) ToClusterV2PtrOutput() ClusterV2PtrOutput {
	return i.ToClusterV2PtrOutputWithContext(context.Background())
}

func (i *ClusterV2) ToClusterV2PtrOutputWithContext(ctx context.Context) ClusterV2PtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterV2PtrOutput)
}

type ClusterV2PtrInput interface {
	pulumi.Input

	ToClusterV2PtrOutput() ClusterV2PtrOutput
	ToClusterV2PtrOutputWithContext(ctx context.Context) ClusterV2PtrOutput
}

type clusterV2PtrType ClusterV2Args

func (*clusterV2PtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterV2)(nil))
}

func (i *clusterV2PtrType) ToClusterV2PtrOutput() ClusterV2PtrOutput {
	return i.ToClusterV2PtrOutputWithContext(context.Background())
}

func (i *clusterV2PtrType) ToClusterV2PtrOutputWithContext(ctx context.Context) ClusterV2PtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterV2PtrOutput)
}

// ClusterV2ArrayInput is an input type that accepts ClusterV2Array and ClusterV2ArrayOutput values.
// You can construct a concrete instance of `ClusterV2ArrayInput` via:
//
//          ClusterV2Array{ ClusterV2Args{...} }
type ClusterV2ArrayInput interface {
	pulumi.Input

	ToClusterV2ArrayOutput() ClusterV2ArrayOutput
	ToClusterV2ArrayOutputWithContext(context.Context) ClusterV2ArrayOutput
}

type ClusterV2Array []ClusterV2Input

func (ClusterV2Array) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterV2)(nil)).Elem()
}

func (i ClusterV2Array) ToClusterV2ArrayOutput() ClusterV2ArrayOutput {
	return i.ToClusterV2ArrayOutputWithContext(context.Background())
}

func (i ClusterV2Array) ToClusterV2ArrayOutputWithContext(ctx context.Context) ClusterV2ArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterV2ArrayOutput)
}

// ClusterV2MapInput is an input type that accepts ClusterV2Map and ClusterV2MapOutput values.
// You can construct a concrete instance of `ClusterV2MapInput` via:
//
//          ClusterV2Map{ "key": ClusterV2Args{...} }
type ClusterV2MapInput interface {
	pulumi.Input

	ToClusterV2MapOutput() ClusterV2MapOutput
	ToClusterV2MapOutputWithContext(context.Context) ClusterV2MapOutput
}

type ClusterV2Map map[string]ClusterV2Input

func (ClusterV2Map) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterV2)(nil)).Elem()
}

func (i ClusterV2Map) ToClusterV2MapOutput() ClusterV2MapOutput {
	return i.ToClusterV2MapOutputWithContext(context.Background())
}

func (i ClusterV2Map) ToClusterV2MapOutputWithContext(ctx context.Context) ClusterV2MapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterV2MapOutput)
}

type ClusterV2Output struct{ *pulumi.OutputState }

func (ClusterV2Output) ElementType() reflect.Type {
	return reflect.TypeOf((*ClusterV2)(nil))
}

func (o ClusterV2Output) ToClusterV2Output() ClusterV2Output {
	return o
}

func (o ClusterV2Output) ToClusterV2OutputWithContext(ctx context.Context) ClusterV2Output {
	return o
}

func (o ClusterV2Output) ToClusterV2PtrOutput() ClusterV2PtrOutput {
	return o.ToClusterV2PtrOutputWithContext(context.Background())
}

func (o ClusterV2Output) ToClusterV2PtrOutputWithContext(ctx context.Context) ClusterV2PtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v ClusterV2) *ClusterV2 {
		return &v
	}).(ClusterV2PtrOutput)
}

type ClusterV2PtrOutput struct{ *pulumi.OutputState }

func (ClusterV2PtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterV2)(nil))
}

func (o ClusterV2PtrOutput) ToClusterV2PtrOutput() ClusterV2PtrOutput {
	return o
}

func (o ClusterV2PtrOutput) ToClusterV2PtrOutputWithContext(ctx context.Context) ClusterV2PtrOutput {
	return o
}

func (o ClusterV2PtrOutput) Elem() ClusterV2Output {
	return o.ApplyT(func(v *ClusterV2) ClusterV2 {
		if v != nil {
			return *v
		}
		var ret ClusterV2
		return ret
	}).(ClusterV2Output)
}

type ClusterV2ArrayOutput struct{ *pulumi.OutputState }

func (ClusterV2ArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ClusterV2)(nil))
}

func (o ClusterV2ArrayOutput) ToClusterV2ArrayOutput() ClusterV2ArrayOutput {
	return o
}

func (o ClusterV2ArrayOutput) ToClusterV2ArrayOutputWithContext(ctx context.Context) ClusterV2ArrayOutput {
	return o
}

func (o ClusterV2ArrayOutput) Index(i pulumi.IntInput) ClusterV2Output {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ClusterV2 {
		return vs[0].([]ClusterV2)[vs[1].(int)]
	}).(ClusterV2Output)
}

type ClusterV2MapOutput struct{ *pulumi.OutputState }

func (ClusterV2MapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]ClusterV2)(nil))
}

func (o ClusterV2MapOutput) ToClusterV2MapOutput() ClusterV2MapOutput {
	return o
}

func (o ClusterV2MapOutput) ToClusterV2MapOutputWithContext(ctx context.Context) ClusterV2MapOutput {
	return o
}

func (o ClusterV2MapOutput) MapIndex(k pulumi.StringInput) ClusterV2Output {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) ClusterV2 {
		return vs[0].(map[string]ClusterV2)[vs[1].(string)]
	}).(ClusterV2Output)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterV2Input)(nil)).Elem(), &ClusterV2{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterV2PtrInput)(nil)).Elem(), &ClusterV2{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterV2ArrayInput)(nil)).Elem(), ClusterV2Array{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterV2MapInput)(nil)).Elem(), ClusterV2Map{})
	pulumi.RegisterOutputType(ClusterV2Output{})
	pulumi.RegisterOutputType(ClusterV2PtrOutput{})
	pulumi.RegisterOutputType(ClusterV2ArrayOutput{})
	pulumi.RegisterOutputType(ClusterV2MapOutput{})
}