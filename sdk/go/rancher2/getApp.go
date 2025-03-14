// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-rancher2/sdk/v8/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 app.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-rancher2/sdk/v8/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := rancher2.LookupApp(ctx, &rancher2.LookupAppArgs{
//				Name:            "foo",
//				ProjectId:       "<project_id>",
//				TargetNamespace: pulumi.StringRef("<namespace_name>"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupApp(ctx *pulumi.Context, args *LookupAppArgs, opts ...pulumi.InvokeOption) (*LookupAppResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAppResult
	err := ctx.Invoke("rancher2:index/getApp:getApp", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getApp.
type LookupAppArgs struct {
	// (Computed) Annotations for the catalog (map)
	Annotations map[string]string `pulumi:"annotations"`
	// The app name (string)
	Name string `pulumi:"name"`
	// The id of the project where the app is deployed (string)
	ProjectId string `pulumi:"projectId"`
	// The namespace name where the app is deployed (string)
	TargetNamespace *string `pulumi:"targetNamespace"`
}

// A collection of values returned by getApp.
type LookupAppResult struct {
	// (Computed) Annotations for the catalog (map)
	Annotations map[string]string `pulumi:"annotations"`
	// (Computed) Answers for the app (map)
	Answers map[string]string `pulumi:"answers"`
	// (Computed) Catalog name of the app (string)
	CatalogName string `pulumi:"catalogName"`
	// (Computed) Description for the app (string)
	Description string `pulumi:"description"`
	// (Computed) The URL of the helm catalog app (string)
	ExternalId string `pulumi:"externalId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels for the catalog (map)
	Labels    map[string]string `pulumi:"labels"`
	Name      string            `pulumi:"name"`
	ProjectId string            `pulumi:"projectId"`
	// (Computed) Current revision id for the app (string)
	RevisionId      string `pulumi:"revisionId"`
	TargetNamespace string `pulumi:"targetNamespace"`
	// (Computed) Template name of the app (string)
	TemplateName string `pulumi:"templateName"`
	// (Computed) Template version of the app (string)
	TemplateVersion string `pulumi:"templateVersion"`
	// (Computed) values.yaml base64 encoded file content for the app (string)
	ValuesYaml string `pulumi:"valuesYaml"`
}

func LookupAppOutput(ctx *pulumi.Context, args LookupAppOutputArgs, opts ...pulumi.InvokeOption) LookupAppResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupAppResultOutput, error) {
			args := v.(LookupAppArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("rancher2:index/getApp:getApp", args, LookupAppResultOutput{}, options).(LookupAppResultOutput), nil
		}).(LookupAppResultOutput)
}

// A collection of arguments for invoking getApp.
type LookupAppOutputArgs struct {
	// (Computed) Annotations for the catalog (map)
	Annotations pulumi.StringMapInput `pulumi:"annotations"`
	// The app name (string)
	Name pulumi.StringInput `pulumi:"name"`
	// The id of the project where the app is deployed (string)
	ProjectId pulumi.StringInput `pulumi:"projectId"`
	// The namespace name where the app is deployed (string)
	TargetNamespace pulumi.StringPtrInput `pulumi:"targetNamespace"`
}

func (LookupAppOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAppArgs)(nil)).Elem()
}

// A collection of values returned by getApp.
type LookupAppResultOutput struct{ *pulumi.OutputState }

func (LookupAppResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAppResult)(nil)).Elem()
}

func (o LookupAppResultOutput) ToLookupAppResultOutput() LookupAppResultOutput {
	return o
}

func (o LookupAppResultOutput) ToLookupAppResultOutputWithContext(ctx context.Context) LookupAppResultOutput {
	return o
}

// (Computed) Annotations for the catalog (map)
func (o LookupAppResultOutput) Annotations() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupAppResult) map[string]string { return v.Annotations }).(pulumi.StringMapOutput)
}

// (Computed) Answers for the app (map)
func (o LookupAppResultOutput) Answers() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupAppResult) map[string]string { return v.Answers }).(pulumi.StringMapOutput)
}

// (Computed) Catalog name of the app (string)
func (o LookupAppResultOutput) CatalogName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppResult) string { return v.CatalogName }).(pulumi.StringOutput)
}

// (Computed) Description for the app (string)
func (o LookupAppResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppResult) string { return v.Description }).(pulumi.StringOutput)
}

// (Computed) The URL of the helm catalog app (string)
func (o LookupAppResultOutput) ExternalId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppResult) string { return v.ExternalId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAppResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) Labels for the catalog (map)
func (o LookupAppResultOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupAppResult) map[string]string { return v.Labels }).(pulumi.StringMapOutput)
}

func (o LookupAppResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupAppResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// (Computed) Current revision id for the app (string)
func (o LookupAppResultOutput) RevisionId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppResult) string { return v.RevisionId }).(pulumi.StringOutput)
}

func (o LookupAppResultOutput) TargetNamespace() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppResult) string { return v.TargetNamespace }).(pulumi.StringOutput)
}

// (Computed) Template name of the app (string)
func (o LookupAppResultOutput) TemplateName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppResult) string { return v.TemplateName }).(pulumi.StringOutput)
}

// (Computed) Template version of the app (string)
func (o LookupAppResultOutput) TemplateVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppResult) string { return v.TemplateVersion }).(pulumi.StringOutput)
}

// (Computed) values.yaml base64 encoded file content for the app (string)
func (o LookupAppResultOutput) ValuesYaml() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppResult) string { return v.ValuesYaml }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAppResultOutput{})
}
