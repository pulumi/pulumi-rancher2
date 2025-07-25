// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-rancher2/sdk/v9/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a rancher v2 pod security admission configration template.
//
// ## Example Usage
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
//			_, err := rancher2.LookupPodSecurityAdmissionConfigurationTemplate(ctx, &rancher2.LookupPodSecurityAdmissionConfigurationTemplateArgs{
//				Name: "foo",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupPodSecurityAdmissionConfigurationTemplate(ctx *pulumi.Context, args *LookupPodSecurityAdmissionConfigurationTemplateArgs, opts ...pulumi.InvokeOption) (*LookupPodSecurityAdmissionConfigurationTemplateResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupPodSecurityAdmissionConfigurationTemplateResult
	err := ctx.Invoke("rancher2:index/getPodSecurityAdmissionConfigurationTemplate:getPodSecurityAdmissionConfigurationTemplate", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPodSecurityAdmissionConfigurationTemplate.
type LookupPodSecurityAdmissionConfigurationTemplateArgs struct {
	// (Computed) Annotations of the resource (map)
	Annotations map[string]string `pulumi:"annotations"`
	// (Computed) Labels of the resource (map)
	Labels map[string]string `pulumi:"labels"`
	// The name of the pod security admission configuration template (string)
	Name string `pulumi:"name"`
}

// A collection of values returned by getPodSecurityAdmissionConfigurationTemplate.
type LookupPodSecurityAdmissionConfigurationTemplateResult struct {
	// (Computed) Annotations of the resource (map)
	Annotations map[string]string `pulumi:"annotations"`
	// (Computed) The default level labels and version labels to be applied when labels for a mode is not set (list maxitems:1)
	Defaults GetPodSecurityAdmissionConfigurationTemplateDefaults `pulumi:"defaults"`
	// (Computed) The description of the pod security admission configuration template (string)
	Description string `pulumi:"description"`
	// (Computed) The authenticated usernames, runtime class names, and namespaces to exempt (list maxitems:1)
	Exemptions GetPodSecurityAdmissionConfigurationTemplateExemptions `pulumi:"exemptions"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels of the resource (map)
	Labels map[string]string `pulumi:"labels"`
	Name   string            `pulumi:"name"`
}

func LookupPodSecurityAdmissionConfigurationTemplateOutput(ctx *pulumi.Context, args LookupPodSecurityAdmissionConfigurationTemplateOutputArgs, opts ...pulumi.InvokeOption) LookupPodSecurityAdmissionConfigurationTemplateResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupPodSecurityAdmissionConfigurationTemplateResultOutput, error) {
			args := v.(LookupPodSecurityAdmissionConfigurationTemplateArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("rancher2:index/getPodSecurityAdmissionConfigurationTemplate:getPodSecurityAdmissionConfigurationTemplate", args, LookupPodSecurityAdmissionConfigurationTemplateResultOutput{}, options).(LookupPodSecurityAdmissionConfigurationTemplateResultOutput), nil
		}).(LookupPodSecurityAdmissionConfigurationTemplateResultOutput)
}

// A collection of arguments for invoking getPodSecurityAdmissionConfigurationTemplate.
type LookupPodSecurityAdmissionConfigurationTemplateOutputArgs struct {
	// (Computed) Annotations of the resource (map)
	Annotations pulumi.StringMapInput `pulumi:"annotations"`
	// (Computed) Labels of the resource (map)
	Labels pulumi.StringMapInput `pulumi:"labels"`
	// The name of the pod security admission configuration template (string)
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupPodSecurityAdmissionConfigurationTemplateOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPodSecurityAdmissionConfigurationTemplateArgs)(nil)).Elem()
}

// A collection of values returned by getPodSecurityAdmissionConfigurationTemplate.
type LookupPodSecurityAdmissionConfigurationTemplateResultOutput struct{ *pulumi.OutputState }

func (LookupPodSecurityAdmissionConfigurationTemplateResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPodSecurityAdmissionConfigurationTemplateResult)(nil)).Elem()
}

func (o LookupPodSecurityAdmissionConfigurationTemplateResultOutput) ToLookupPodSecurityAdmissionConfigurationTemplateResultOutput() LookupPodSecurityAdmissionConfigurationTemplateResultOutput {
	return o
}

func (o LookupPodSecurityAdmissionConfigurationTemplateResultOutput) ToLookupPodSecurityAdmissionConfigurationTemplateResultOutputWithContext(ctx context.Context) LookupPodSecurityAdmissionConfigurationTemplateResultOutput {
	return o
}

// (Computed) Annotations of the resource (map)
func (o LookupPodSecurityAdmissionConfigurationTemplateResultOutput) Annotations() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupPodSecurityAdmissionConfigurationTemplateResult) map[string]string { return v.Annotations }).(pulumi.StringMapOutput)
}

// (Computed) The default level labels and version labels to be applied when labels for a mode is not set (list maxitems:1)
func (o LookupPodSecurityAdmissionConfigurationTemplateResultOutput) Defaults() GetPodSecurityAdmissionConfigurationTemplateDefaultsOutput {
	return o.ApplyT(func(v LookupPodSecurityAdmissionConfigurationTemplateResult) GetPodSecurityAdmissionConfigurationTemplateDefaults {
		return v.Defaults
	}).(GetPodSecurityAdmissionConfigurationTemplateDefaultsOutput)
}

// (Computed) The description of the pod security admission configuration template (string)
func (o LookupPodSecurityAdmissionConfigurationTemplateResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPodSecurityAdmissionConfigurationTemplateResult) string { return v.Description }).(pulumi.StringOutput)
}

// (Computed) The authenticated usernames, runtime class names, and namespaces to exempt (list maxitems:1)
func (o LookupPodSecurityAdmissionConfigurationTemplateResultOutput) Exemptions() GetPodSecurityAdmissionConfigurationTemplateExemptionsOutput {
	return o.ApplyT(func(v LookupPodSecurityAdmissionConfigurationTemplateResult) GetPodSecurityAdmissionConfigurationTemplateExemptions {
		return v.Exemptions
	}).(GetPodSecurityAdmissionConfigurationTemplateExemptionsOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupPodSecurityAdmissionConfigurationTemplateResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPodSecurityAdmissionConfigurationTemplateResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) Labels of the resource (map)
func (o LookupPodSecurityAdmissionConfigurationTemplateResultOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupPodSecurityAdmissionConfigurationTemplateResult) map[string]string { return v.Labels }).(pulumi.StringMapOutput)
}

func (o LookupPodSecurityAdmissionConfigurationTemplateResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPodSecurityAdmissionConfigurationTemplateResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPodSecurityAdmissionConfigurationTemplateResultOutput{})
}
