// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
func LookupProject(ctx *pulumi.Context, args *LookupProjectArgs, opts ...pulumi.InvokeOption) (*LookupProjectResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupProjectResult
	err := ctx.Invoke("rancher2:index/getProject:getProject", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProject.
type LookupProjectArgs struct {
	// ID of the Rancher 2 cluster (string)
	ClusterId string `pulumi:"clusterId"`
	// The project name (string)
	Name string `pulumi:"name"`
}

// A collection of values returned by getProject.
type LookupProjectResult struct {
	// (Computed) Annotations of the rancher2 project (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	ClusterId   string                 `pulumi:"clusterId"`
	// (Computed) Default containers resource limits on project (List maxitem:1)
	ContainerResourceLimit GetProjectContainerResourceLimit `pulumi:"containerResourceLimit"`
	// (Computed) The project's description (string)
	Description string `pulumi:"description"`
	// (Computed) Enable built-in project monitoring. Default `false` (bool)
	EnableProjectMonitoring bool `pulumi:"enableProjectMonitoring"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels of the rancher2 project (map)
	Labels map[string]interface{} `pulumi:"labels"`
	Name   string                 `pulumi:"name"`
	// (Computed) Default Pod Security Policy ID for the project (string)
	PodSecurityPolicyTemplateId string `pulumi:"podSecurityPolicyTemplateId"`
	// (Computed) Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
	ResourceQuota GetProjectResourceQuota `pulumi:"resourceQuota"`
	// (Computed) UUID of the project as stored by Rancher 2 (string)
	Uuid string `pulumi:"uuid"`
}

func LookupProjectOutput(ctx *pulumi.Context, args LookupProjectOutputArgs, opts ...pulumi.InvokeOption) LookupProjectResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupProjectResult, error) {
			args := v.(LookupProjectArgs)
			r, err := LookupProject(ctx, &args, opts...)
			var s LookupProjectResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupProjectResultOutput)
}

// A collection of arguments for invoking getProject.
type LookupProjectOutputArgs struct {
	// ID of the Rancher 2 cluster (string)
	ClusterId pulumi.StringInput `pulumi:"clusterId"`
	// The project name (string)
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupProjectOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupProjectArgs)(nil)).Elem()
}

// A collection of values returned by getProject.
type LookupProjectResultOutput struct{ *pulumi.OutputState }

func (LookupProjectResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupProjectResult)(nil)).Elem()
}

func (o LookupProjectResultOutput) ToLookupProjectResultOutput() LookupProjectResultOutput {
	return o
}

func (o LookupProjectResultOutput) ToLookupProjectResultOutputWithContext(ctx context.Context) LookupProjectResultOutput {
	return o
}

// (Computed) Annotations of the rancher2 project (map)
func (o LookupProjectResultOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v LookupProjectResult) map[string]interface{} { return v.Annotations }).(pulumi.MapOutput)
}

func (o LookupProjectResultOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectResult) string { return v.ClusterId }).(pulumi.StringOutput)
}

// (Computed) Default containers resource limits on project (List maxitem:1)
func (o LookupProjectResultOutput) ContainerResourceLimit() GetProjectContainerResourceLimitOutput {
	return o.ApplyT(func(v LookupProjectResult) GetProjectContainerResourceLimit { return v.ContainerResourceLimit }).(GetProjectContainerResourceLimitOutput)
}

// (Computed) The project's description (string)
func (o LookupProjectResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectResult) string { return v.Description }).(pulumi.StringOutput)
}

// (Computed) Enable built-in project monitoring. Default `false` (bool)
func (o LookupProjectResultOutput) EnableProjectMonitoring() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupProjectResult) bool { return v.EnableProjectMonitoring }).(pulumi.BoolOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupProjectResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) Labels of the rancher2 project (map)
func (o LookupProjectResultOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v LookupProjectResult) map[string]interface{} { return v.Labels }).(pulumi.MapOutput)
}

func (o LookupProjectResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectResult) string { return v.Name }).(pulumi.StringOutput)
}

// (Computed) Default Pod Security Policy ID for the project (string)
func (o LookupProjectResultOutput) PodSecurityPolicyTemplateId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectResult) string { return v.PodSecurityPolicyTemplateId }).(pulumi.StringOutput)
}

// (Computed) Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
func (o LookupProjectResultOutput) ResourceQuota() GetProjectResourceQuotaOutput {
	return o.ApplyT(func(v LookupProjectResult) GetProjectResourceQuota { return v.ResourceQuota }).(GetProjectResourceQuotaOutput)
}

// (Computed) UUID of the project as stored by Rancher 2 (string)
func (o LookupProjectResultOutput) Uuid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectResult) string { return v.Uuid }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupProjectResultOutput{})
}
