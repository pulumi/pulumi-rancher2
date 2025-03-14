// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-rancher2/sdk/v8/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 multi cluster app.
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
//			_, err := rancher2.LookupMultiClusterApp(ctx, &rancher2.LookupMultiClusterAppArgs{
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
func LookupMultiClusterApp(ctx *pulumi.Context, args *LookupMultiClusterAppArgs, opts ...pulumi.InvokeOption) (*LookupMultiClusterAppResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupMultiClusterAppResult
	err := ctx.Invoke("rancher2:index/getMultiClusterApp:getMultiClusterApp", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getMultiClusterApp.
type LookupMultiClusterAppArgs struct {
	// The multi cluster app name (string)
	Name string `pulumi:"name"`
}

// A collection of values returned by getMultiClusterApp.
type LookupMultiClusterAppResult struct {
	// (Computed) Annotations for multi cluster app object (map)
	Annotations map[string]string `pulumi:"annotations"`
	// (Computed) The multi cluster app answers (list)
	Answers []GetMultiClusterAppAnswer `pulumi:"answers"`
	// (Computed) The multi cluster app catalog name (string)
	CatalogName string `pulumi:"catalogName"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels for multi cluster app object (map)
	Labels map[string]string `pulumi:"labels"`
	// (Computed) The multi cluster app members (list)
	Members []GetMultiClusterAppMember `pulumi:"members"`
	Name    string                     `pulumi:"name"`
	// (Computed) The multi cluster app revision history limit (int)
	RevisionHistoryLimit int `pulumi:"revisionHistoryLimit"`
	// (Computed) Current revision id for the multi cluster app (string)
	RevisionId string `pulumi:"revisionId"`
	// (Computed) The multi cluster app roles (list)
	Roles []string `pulumi:"roles"`
	// (Computed) The multi cluster app target projects (list)
	Targets []GetMultiClusterAppTarget `pulumi:"targets"`
	// (Computed) The multi cluster app template name (string)
	TemplateName string `pulumi:"templateName"`
	// (Computed) The multi cluster app template version (string)
	TemplateVersion string `pulumi:"templateVersion"`
	// (Computed) The multi cluster app template version ID (string)
	TemplateVersionId string `pulumi:"templateVersionId"`
	// (Computed) The multi cluster app upgrade strategy (list)
	UpgradeStrategies []GetMultiClusterAppUpgradeStrategy `pulumi:"upgradeStrategies"`
}

func LookupMultiClusterAppOutput(ctx *pulumi.Context, args LookupMultiClusterAppOutputArgs, opts ...pulumi.InvokeOption) LookupMultiClusterAppResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupMultiClusterAppResultOutput, error) {
			args := v.(LookupMultiClusterAppArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("rancher2:index/getMultiClusterApp:getMultiClusterApp", args, LookupMultiClusterAppResultOutput{}, options).(LookupMultiClusterAppResultOutput), nil
		}).(LookupMultiClusterAppResultOutput)
}

// A collection of arguments for invoking getMultiClusterApp.
type LookupMultiClusterAppOutputArgs struct {
	// The multi cluster app name (string)
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupMultiClusterAppOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupMultiClusterAppArgs)(nil)).Elem()
}

// A collection of values returned by getMultiClusterApp.
type LookupMultiClusterAppResultOutput struct{ *pulumi.OutputState }

func (LookupMultiClusterAppResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupMultiClusterAppResult)(nil)).Elem()
}

func (o LookupMultiClusterAppResultOutput) ToLookupMultiClusterAppResultOutput() LookupMultiClusterAppResultOutput {
	return o
}

func (o LookupMultiClusterAppResultOutput) ToLookupMultiClusterAppResultOutputWithContext(ctx context.Context) LookupMultiClusterAppResultOutput {
	return o
}

// (Computed) Annotations for multi cluster app object (map)
func (o LookupMultiClusterAppResultOutput) Annotations() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupMultiClusterAppResult) map[string]string { return v.Annotations }).(pulumi.StringMapOutput)
}

// (Computed) The multi cluster app answers (list)
func (o LookupMultiClusterAppResultOutput) Answers() GetMultiClusterAppAnswerArrayOutput {
	return o.ApplyT(func(v LookupMultiClusterAppResult) []GetMultiClusterAppAnswer { return v.Answers }).(GetMultiClusterAppAnswerArrayOutput)
}

// (Computed) The multi cluster app catalog name (string)
func (o LookupMultiClusterAppResultOutput) CatalogName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMultiClusterAppResult) string { return v.CatalogName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupMultiClusterAppResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMultiClusterAppResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) Labels for multi cluster app object (map)
func (o LookupMultiClusterAppResultOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupMultiClusterAppResult) map[string]string { return v.Labels }).(pulumi.StringMapOutput)
}

// (Computed) The multi cluster app members (list)
func (o LookupMultiClusterAppResultOutput) Members() GetMultiClusterAppMemberArrayOutput {
	return o.ApplyT(func(v LookupMultiClusterAppResult) []GetMultiClusterAppMember { return v.Members }).(GetMultiClusterAppMemberArrayOutput)
}

func (o LookupMultiClusterAppResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMultiClusterAppResult) string { return v.Name }).(pulumi.StringOutput)
}

// (Computed) The multi cluster app revision history limit (int)
func (o LookupMultiClusterAppResultOutput) RevisionHistoryLimit() pulumi.IntOutput {
	return o.ApplyT(func(v LookupMultiClusterAppResult) int { return v.RevisionHistoryLimit }).(pulumi.IntOutput)
}

// (Computed) Current revision id for the multi cluster app (string)
func (o LookupMultiClusterAppResultOutput) RevisionId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMultiClusterAppResult) string { return v.RevisionId }).(pulumi.StringOutput)
}

// (Computed) The multi cluster app roles (list)
func (o LookupMultiClusterAppResultOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupMultiClusterAppResult) []string { return v.Roles }).(pulumi.StringArrayOutput)
}

// (Computed) The multi cluster app target projects (list)
func (o LookupMultiClusterAppResultOutput) Targets() GetMultiClusterAppTargetArrayOutput {
	return o.ApplyT(func(v LookupMultiClusterAppResult) []GetMultiClusterAppTarget { return v.Targets }).(GetMultiClusterAppTargetArrayOutput)
}

// (Computed) The multi cluster app template name (string)
func (o LookupMultiClusterAppResultOutput) TemplateName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMultiClusterAppResult) string { return v.TemplateName }).(pulumi.StringOutput)
}

// (Computed) The multi cluster app template version (string)
func (o LookupMultiClusterAppResultOutput) TemplateVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMultiClusterAppResult) string { return v.TemplateVersion }).(pulumi.StringOutput)
}

// (Computed) The multi cluster app template version ID (string)
func (o LookupMultiClusterAppResultOutput) TemplateVersionId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMultiClusterAppResult) string { return v.TemplateVersionId }).(pulumi.StringOutput)
}

// (Computed) The multi cluster app upgrade strategy (list)
func (o LookupMultiClusterAppResultOutput) UpgradeStrategies() GetMultiClusterAppUpgradeStrategyArrayOutput {
	return o.ApplyT(func(v LookupMultiClusterAppResult) []GetMultiClusterAppUpgradeStrategy { return v.UpgradeStrategies }).(GetMultiClusterAppUpgradeStrategyArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupMultiClusterAppResultOutput{})
}
