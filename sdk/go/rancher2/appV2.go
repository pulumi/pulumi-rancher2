// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-rancher2/sdk/v9/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher App v2 resource. This can be used to manage helm charts for Rancher v2 environments and retrieve their information. App v2 resource is available at Rancher v2.5.x and above.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-rancher2/sdk/v9/go/rancher2"
//	"github.com/pulumi/pulumi-std/sdk/go/std"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			invokeFile, err := std.File(ctx, &std.FileArgs{
//				Input: "values.yaml",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// Create a new Rancher2 App V2 using
//			_, err = rancher2.NewAppV2(ctx, "foo", &rancher2.AppV2Args{
//				ClusterId:    pulumi.String("<CLUSTER_ID>"),
//				Name:         pulumi.String("rancher-monitoring"),
//				Namespace:    pulumi.String("cattle-monitoring-system"),
//				RepoName:     pulumi.String("rancher-charts"),
//				ChartName:    pulumi.String("rancher-monitoring"),
//				ChartVersion: pulumi.String("9.4.200"),
//				Values:       pulumi.String(invokeFile.Result),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ### Create an App from a Helm Chart using a different registry
//
// The `systemDefaultRegistry` argument can override the global value at App installation. If argument is not provided, the global value for System Default Registry will be used instead.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-rancher2/sdk/v9/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := rancher2.NewAppV2(ctx, "cis_benchmark", &rancher2.AppV2Args{
//				ClusterId:             pulumi.String("<CLUSTER_ID>"),
//				Name:                  pulumi.String("rancher-cis-benchmark"),
//				Namespace:             pulumi.String("cis-operator-system"),
//				RepoName:              pulumi.String("rancher-charts"),
//				ChartName:             pulumi.String("rancher-cis-benchmark"),
//				SystemDefaultRegistry: pulumi.String("<some.dns.here>:<PORT>"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// V2 apps can be imported using the Rancher cluster ID and App V2 name, which is composed of `<namespace>/<application_name>`.
//
// ```sh
// $ pulumi import rancher2:index/appV2:AppV2 foo &lt;CLUSTER_ID&gt;.&lt;APP_V2_NAME&gt;
// ```
type AppV2 struct {
	pulumi.CustomResourceState

	// Annotations for the app v2 (map)
	Annotations pulumi.StringMapOutput `pulumi:"annotations"`
	// The app v2 chart name (string)
	ChartName pulumi.StringOutput `pulumi:"chartName"`
	// The app v2 chart version (string)
	ChartVersion pulumi.StringOutput `pulumi:"chartVersion"`
	// Cleanup app v2 on failed chart upgrade. Default: `false` (bool)
	CleanupOnFail pulumi.BoolPtrOutput `pulumi:"cleanupOnFail"`
	// The cluster id of the app (string)
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// (Computed) The cluster name of the app (string)
	ClusterName      pulumi.StringOutput `pulumi:"clusterName"`
	DeploymentValues pulumi.StringOutput `pulumi:"deploymentValues"`
	// Disable app v2 chart hooks. Default: `false` (bool)
	DisableHooks pulumi.BoolPtrOutput `pulumi:"disableHooks"`
	// Disable app V2 Open API Validation. Default: `false` (bool)
	DisableOpenApiValidation pulumi.BoolPtrOutput `pulumi:"disableOpenApiValidation"`
	// Force app V2 chart upgrade. Default: `false` (bool)
	ForceUpgrade pulumi.BoolPtrOutput `pulumi:"forceUpgrade"`
	// Labels for the app v2 (map)
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// The name of the app v2 (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The namespace of the app v2 (string)
	Namespace pulumi.StringOutput `pulumi:"namespace"`
	// Deploy the app v2 within project ID (string)
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Repo name (string)
	RepoName pulumi.StringOutput `pulumi:"repoName"`
	// System default registry providing images for app deployment (string)
	SystemDefaultRegistry pulumi.StringOutput `pulumi:"systemDefaultRegistry"`
	// The app v2 values yaml. Yaml format is required (string)
	Values pulumi.StringPtrOutput `pulumi:"values"`
	// Wait until app is deployed. Default: `true` (bool)
	Wait pulumi.BoolPtrOutput `pulumi:"wait"`
}

// NewAppV2 registers a new resource with the given unique name, arguments, and options.
func NewAppV2(ctx *pulumi.Context,
	name string, args *AppV2Args, opts ...pulumi.ResourceOption) (*AppV2, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ChartName == nil {
		return nil, errors.New("invalid value for required argument 'ChartName'")
	}
	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	if args.Namespace == nil {
		return nil, errors.New("invalid value for required argument 'Namespace'")
	}
	if args.RepoName == nil {
		return nil, errors.New("invalid value for required argument 'RepoName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AppV2
	err := ctx.RegisterResource("rancher2:index/appV2:AppV2", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAppV2 gets an existing AppV2 resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAppV2(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AppV2State, opts ...pulumi.ResourceOption) (*AppV2, error) {
	var resource AppV2
	err := ctx.ReadResource("rancher2:index/appV2:AppV2", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AppV2 resources.
type appV2State struct {
	// Annotations for the app v2 (map)
	Annotations map[string]string `pulumi:"annotations"`
	// The app v2 chart name (string)
	ChartName *string `pulumi:"chartName"`
	// The app v2 chart version (string)
	ChartVersion *string `pulumi:"chartVersion"`
	// Cleanup app v2 on failed chart upgrade. Default: `false` (bool)
	CleanupOnFail *bool `pulumi:"cleanupOnFail"`
	// The cluster id of the app (string)
	ClusterId *string `pulumi:"clusterId"`
	// (Computed) The cluster name of the app (string)
	ClusterName      *string `pulumi:"clusterName"`
	DeploymentValues *string `pulumi:"deploymentValues"`
	// Disable app v2 chart hooks. Default: `false` (bool)
	DisableHooks *bool `pulumi:"disableHooks"`
	// Disable app V2 Open API Validation. Default: `false` (bool)
	DisableOpenApiValidation *bool `pulumi:"disableOpenApiValidation"`
	// Force app V2 chart upgrade. Default: `false` (bool)
	ForceUpgrade *bool `pulumi:"forceUpgrade"`
	// Labels for the app v2 (map)
	Labels map[string]string `pulumi:"labels"`
	// The name of the app v2 (string)
	Name *string `pulumi:"name"`
	// The namespace of the app v2 (string)
	Namespace *string `pulumi:"namespace"`
	// Deploy the app v2 within project ID (string)
	ProjectId *string `pulumi:"projectId"`
	// Repo name (string)
	RepoName *string `pulumi:"repoName"`
	// System default registry providing images for app deployment (string)
	SystemDefaultRegistry *string `pulumi:"systemDefaultRegistry"`
	// The app v2 values yaml. Yaml format is required (string)
	Values *string `pulumi:"values"`
	// Wait until app is deployed. Default: `true` (bool)
	Wait *bool `pulumi:"wait"`
}

type AppV2State struct {
	// Annotations for the app v2 (map)
	Annotations pulumi.StringMapInput
	// The app v2 chart name (string)
	ChartName pulumi.StringPtrInput
	// The app v2 chart version (string)
	ChartVersion pulumi.StringPtrInput
	// Cleanup app v2 on failed chart upgrade. Default: `false` (bool)
	CleanupOnFail pulumi.BoolPtrInput
	// The cluster id of the app (string)
	ClusterId pulumi.StringPtrInput
	// (Computed) The cluster name of the app (string)
	ClusterName      pulumi.StringPtrInput
	DeploymentValues pulumi.StringPtrInput
	// Disable app v2 chart hooks. Default: `false` (bool)
	DisableHooks pulumi.BoolPtrInput
	// Disable app V2 Open API Validation. Default: `false` (bool)
	DisableOpenApiValidation pulumi.BoolPtrInput
	// Force app V2 chart upgrade. Default: `false` (bool)
	ForceUpgrade pulumi.BoolPtrInput
	// Labels for the app v2 (map)
	Labels pulumi.StringMapInput
	// The name of the app v2 (string)
	Name pulumi.StringPtrInput
	// The namespace of the app v2 (string)
	Namespace pulumi.StringPtrInput
	// Deploy the app v2 within project ID (string)
	ProjectId pulumi.StringPtrInput
	// Repo name (string)
	RepoName pulumi.StringPtrInput
	// System default registry providing images for app deployment (string)
	SystemDefaultRegistry pulumi.StringPtrInput
	// The app v2 values yaml. Yaml format is required (string)
	Values pulumi.StringPtrInput
	// Wait until app is deployed. Default: `true` (bool)
	Wait pulumi.BoolPtrInput
}

func (AppV2State) ElementType() reflect.Type {
	return reflect.TypeOf((*appV2State)(nil)).Elem()
}

type appV2Args struct {
	// Annotations for the app v2 (map)
	Annotations map[string]string `pulumi:"annotations"`
	// The app v2 chart name (string)
	ChartName string `pulumi:"chartName"`
	// The app v2 chart version (string)
	ChartVersion *string `pulumi:"chartVersion"`
	// Cleanup app v2 on failed chart upgrade. Default: `false` (bool)
	CleanupOnFail *bool `pulumi:"cleanupOnFail"`
	// The cluster id of the app (string)
	ClusterId string `pulumi:"clusterId"`
	// Disable app v2 chart hooks. Default: `false` (bool)
	DisableHooks *bool `pulumi:"disableHooks"`
	// Disable app V2 Open API Validation. Default: `false` (bool)
	DisableOpenApiValidation *bool `pulumi:"disableOpenApiValidation"`
	// Force app V2 chart upgrade. Default: `false` (bool)
	ForceUpgrade *bool `pulumi:"forceUpgrade"`
	// Labels for the app v2 (map)
	Labels map[string]string `pulumi:"labels"`
	// The name of the app v2 (string)
	Name *string `pulumi:"name"`
	// The namespace of the app v2 (string)
	Namespace string `pulumi:"namespace"`
	// Deploy the app v2 within project ID (string)
	ProjectId *string `pulumi:"projectId"`
	// Repo name (string)
	RepoName string `pulumi:"repoName"`
	// System default registry providing images for app deployment (string)
	SystemDefaultRegistry *string `pulumi:"systemDefaultRegistry"`
	// The app v2 values yaml. Yaml format is required (string)
	Values *string `pulumi:"values"`
	// Wait until app is deployed. Default: `true` (bool)
	Wait *bool `pulumi:"wait"`
}

// The set of arguments for constructing a AppV2 resource.
type AppV2Args struct {
	// Annotations for the app v2 (map)
	Annotations pulumi.StringMapInput
	// The app v2 chart name (string)
	ChartName pulumi.StringInput
	// The app v2 chart version (string)
	ChartVersion pulumi.StringPtrInput
	// Cleanup app v2 on failed chart upgrade. Default: `false` (bool)
	CleanupOnFail pulumi.BoolPtrInput
	// The cluster id of the app (string)
	ClusterId pulumi.StringInput
	// Disable app v2 chart hooks. Default: `false` (bool)
	DisableHooks pulumi.BoolPtrInput
	// Disable app V2 Open API Validation. Default: `false` (bool)
	DisableOpenApiValidation pulumi.BoolPtrInput
	// Force app V2 chart upgrade. Default: `false` (bool)
	ForceUpgrade pulumi.BoolPtrInput
	// Labels for the app v2 (map)
	Labels pulumi.StringMapInput
	// The name of the app v2 (string)
	Name pulumi.StringPtrInput
	// The namespace of the app v2 (string)
	Namespace pulumi.StringInput
	// Deploy the app v2 within project ID (string)
	ProjectId pulumi.StringPtrInput
	// Repo name (string)
	RepoName pulumi.StringInput
	// System default registry providing images for app deployment (string)
	SystemDefaultRegistry pulumi.StringPtrInput
	// The app v2 values yaml. Yaml format is required (string)
	Values pulumi.StringPtrInput
	// Wait until app is deployed. Default: `true` (bool)
	Wait pulumi.BoolPtrInput
}

func (AppV2Args) ElementType() reflect.Type {
	return reflect.TypeOf((*appV2Args)(nil)).Elem()
}

type AppV2Input interface {
	pulumi.Input

	ToAppV2Output() AppV2Output
	ToAppV2OutputWithContext(ctx context.Context) AppV2Output
}

func (*AppV2) ElementType() reflect.Type {
	return reflect.TypeOf((**AppV2)(nil)).Elem()
}

func (i *AppV2) ToAppV2Output() AppV2Output {
	return i.ToAppV2OutputWithContext(context.Background())
}

func (i *AppV2) ToAppV2OutputWithContext(ctx context.Context) AppV2Output {
	return pulumi.ToOutputWithContext(ctx, i).(AppV2Output)
}

// AppV2ArrayInput is an input type that accepts AppV2Array and AppV2ArrayOutput values.
// You can construct a concrete instance of `AppV2ArrayInput` via:
//
//	AppV2Array{ AppV2Args{...} }
type AppV2ArrayInput interface {
	pulumi.Input

	ToAppV2ArrayOutput() AppV2ArrayOutput
	ToAppV2ArrayOutputWithContext(context.Context) AppV2ArrayOutput
}

type AppV2Array []AppV2Input

func (AppV2Array) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AppV2)(nil)).Elem()
}

func (i AppV2Array) ToAppV2ArrayOutput() AppV2ArrayOutput {
	return i.ToAppV2ArrayOutputWithContext(context.Background())
}

func (i AppV2Array) ToAppV2ArrayOutputWithContext(ctx context.Context) AppV2ArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppV2ArrayOutput)
}

// AppV2MapInput is an input type that accepts AppV2Map and AppV2MapOutput values.
// You can construct a concrete instance of `AppV2MapInput` via:
//
//	AppV2Map{ "key": AppV2Args{...} }
type AppV2MapInput interface {
	pulumi.Input

	ToAppV2MapOutput() AppV2MapOutput
	ToAppV2MapOutputWithContext(context.Context) AppV2MapOutput
}

type AppV2Map map[string]AppV2Input

func (AppV2Map) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AppV2)(nil)).Elem()
}

func (i AppV2Map) ToAppV2MapOutput() AppV2MapOutput {
	return i.ToAppV2MapOutputWithContext(context.Background())
}

func (i AppV2Map) ToAppV2MapOutputWithContext(ctx context.Context) AppV2MapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppV2MapOutput)
}

type AppV2Output struct{ *pulumi.OutputState }

func (AppV2Output) ElementType() reflect.Type {
	return reflect.TypeOf((**AppV2)(nil)).Elem()
}

func (o AppV2Output) ToAppV2Output() AppV2Output {
	return o
}

func (o AppV2Output) ToAppV2OutputWithContext(ctx context.Context) AppV2Output {
	return o
}

// Annotations for the app v2 (map)
func (o AppV2Output) Annotations() pulumi.StringMapOutput {
	return o.ApplyT(func(v *AppV2) pulumi.StringMapOutput { return v.Annotations }).(pulumi.StringMapOutput)
}

// The app v2 chart name (string)
func (o AppV2Output) ChartName() pulumi.StringOutput {
	return o.ApplyT(func(v *AppV2) pulumi.StringOutput { return v.ChartName }).(pulumi.StringOutput)
}

// The app v2 chart version (string)
func (o AppV2Output) ChartVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *AppV2) pulumi.StringOutput { return v.ChartVersion }).(pulumi.StringOutput)
}

// Cleanup app v2 on failed chart upgrade. Default: `false` (bool)
func (o AppV2Output) CleanupOnFail() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AppV2) pulumi.BoolPtrOutput { return v.CleanupOnFail }).(pulumi.BoolPtrOutput)
}

// The cluster id of the app (string)
func (o AppV2Output) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *AppV2) pulumi.StringOutput { return v.ClusterId }).(pulumi.StringOutput)
}

// (Computed) The cluster name of the app (string)
func (o AppV2Output) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v *AppV2) pulumi.StringOutput { return v.ClusterName }).(pulumi.StringOutput)
}

func (o AppV2Output) DeploymentValues() pulumi.StringOutput {
	return o.ApplyT(func(v *AppV2) pulumi.StringOutput { return v.DeploymentValues }).(pulumi.StringOutput)
}

// Disable app v2 chart hooks. Default: `false` (bool)
func (o AppV2Output) DisableHooks() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AppV2) pulumi.BoolPtrOutput { return v.DisableHooks }).(pulumi.BoolPtrOutput)
}

// Disable app V2 Open API Validation. Default: `false` (bool)
func (o AppV2Output) DisableOpenApiValidation() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AppV2) pulumi.BoolPtrOutput { return v.DisableOpenApiValidation }).(pulumi.BoolPtrOutput)
}

// Force app V2 chart upgrade. Default: `false` (bool)
func (o AppV2Output) ForceUpgrade() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AppV2) pulumi.BoolPtrOutput { return v.ForceUpgrade }).(pulumi.BoolPtrOutput)
}

// Labels for the app v2 (map)
func (o AppV2Output) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *AppV2) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// The name of the app v2 (string)
func (o AppV2Output) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AppV2) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The namespace of the app v2 (string)
func (o AppV2Output) Namespace() pulumi.StringOutput {
	return o.ApplyT(func(v *AppV2) pulumi.StringOutput { return v.Namespace }).(pulumi.StringOutput)
}

// Deploy the app v2 within project ID (string)
func (o AppV2Output) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AppV2) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Repo name (string)
func (o AppV2Output) RepoName() pulumi.StringOutput {
	return o.ApplyT(func(v *AppV2) pulumi.StringOutput { return v.RepoName }).(pulumi.StringOutput)
}

// System default registry providing images for app deployment (string)
func (o AppV2Output) SystemDefaultRegistry() pulumi.StringOutput {
	return o.ApplyT(func(v *AppV2) pulumi.StringOutput { return v.SystemDefaultRegistry }).(pulumi.StringOutput)
}

// The app v2 values yaml. Yaml format is required (string)
func (o AppV2Output) Values() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AppV2) pulumi.StringPtrOutput { return v.Values }).(pulumi.StringPtrOutput)
}

// Wait until app is deployed. Default: `true` (bool)
func (o AppV2Output) Wait() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AppV2) pulumi.BoolPtrOutput { return v.Wait }).(pulumi.BoolPtrOutput)
}

type AppV2ArrayOutput struct{ *pulumi.OutputState }

func (AppV2ArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AppV2)(nil)).Elem()
}

func (o AppV2ArrayOutput) ToAppV2ArrayOutput() AppV2ArrayOutput {
	return o
}

func (o AppV2ArrayOutput) ToAppV2ArrayOutputWithContext(ctx context.Context) AppV2ArrayOutput {
	return o
}

func (o AppV2ArrayOutput) Index(i pulumi.IntInput) AppV2Output {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AppV2 {
		return vs[0].([]*AppV2)[vs[1].(int)]
	}).(AppV2Output)
}

type AppV2MapOutput struct{ *pulumi.OutputState }

func (AppV2MapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AppV2)(nil)).Elem()
}

func (o AppV2MapOutput) ToAppV2MapOutput() AppV2MapOutput {
	return o
}

func (o AppV2MapOutput) ToAppV2MapOutputWithContext(ctx context.Context) AppV2MapOutput {
	return o
}

func (o AppV2MapOutput) MapIndex(k pulumi.StringInput) AppV2Output {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AppV2 {
		return vs[0].(map[string]*AppV2)[vs[1].(string)]
	}).(AppV2Output)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AppV2Input)(nil)).Elem(), &AppV2{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppV2ArrayInput)(nil)).Elem(), AppV2Array{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppV2MapInput)(nil)).Elem(), AppV2Map{})
	pulumi.RegisterOutputType(AppV2Output{})
	pulumi.RegisterOutputType(AppV2ArrayOutput{})
	pulumi.RegisterOutputType(AppV2MapOutput{})
}
