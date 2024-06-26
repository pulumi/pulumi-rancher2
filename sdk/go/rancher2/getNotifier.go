// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 notifier.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := rancher2.LookupNotifier(ctx, &rancher2.LookupNotifierArgs{
//				Name:      "foo",
//				ClusterId: "<cluster_id>",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupNotifier(ctx *pulumi.Context, args *LookupNotifierArgs, opts ...pulumi.InvokeOption) (*LookupNotifierResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupNotifierResult
	err := ctx.Invoke("rancher2:index/getNotifier:getNotifier", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNotifier.
type LookupNotifierArgs struct {
	// The cluster id where create notifier (string)
	ClusterId string `pulumi:"clusterId"`
	// (Computed) Dingtalk config for notifier (list maxitems:1)
	DingtalkConfig *GetNotifierDingtalkConfig `pulumi:"dingtalkConfig"`
	// (Computed) MSTeams config for notifier (list maxitems:1)
	MsteamsConfig *GetNotifierMsteamsConfig `pulumi:"msteamsConfig"`
	// The name of the notifier (string)
	Name string `pulumi:"name"`
}

// A collection of values returned by getNotifier.
type LookupNotifierResult struct {
	// (Computed) Annotations for notifier object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	ClusterId   string                 `pulumi:"clusterId"`
	// (Computed) The notifier description (string)
	Description string `pulumi:"description"`
	// (Computed) Dingtalk config for notifier (list maxitems:1)
	DingtalkConfig *GetNotifierDingtalkConfig `pulumi:"dingtalkConfig"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels for notifier object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// (Computed) MSTeams config for notifier (list maxitems:1)
	MsteamsConfig *GetNotifierMsteamsConfig `pulumi:"msteamsConfig"`
	Name          string                    `pulumi:"name"`
	// (Computed) Pagerduty config for notifier (list maxitems:1)
	PagerdutyConfig GetNotifierPagerdutyConfig `pulumi:"pagerdutyConfig"`
	// (Computed) Slack config for notifier (list maxitems:1)
	SlackConfig GetNotifierSlackConfig `pulumi:"slackConfig"`
	// (Computed) SMTP config for notifier (list maxitems:1)
	SmtpConfig GetNotifierSmtpConfig `pulumi:"smtpConfig"`
	// (Computed) Webhook config for notifier (list maxitems:1)
	WebhookConfig GetNotifierWebhookConfig `pulumi:"webhookConfig"`
	// (Computed) Wechat config for notifier (list maxitems:1)
	WechatConfig GetNotifierWechatConfig `pulumi:"wechatConfig"`
}

func LookupNotifierOutput(ctx *pulumi.Context, args LookupNotifierOutputArgs, opts ...pulumi.InvokeOption) LookupNotifierResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupNotifierResult, error) {
			args := v.(LookupNotifierArgs)
			r, err := LookupNotifier(ctx, &args, opts...)
			var s LookupNotifierResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupNotifierResultOutput)
}

// A collection of arguments for invoking getNotifier.
type LookupNotifierOutputArgs struct {
	// The cluster id where create notifier (string)
	ClusterId pulumi.StringInput `pulumi:"clusterId"`
	// (Computed) Dingtalk config for notifier (list maxitems:1)
	DingtalkConfig GetNotifierDingtalkConfigPtrInput `pulumi:"dingtalkConfig"`
	// (Computed) MSTeams config for notifier (list maxitems:1)
	MsteamsConfig GetNotifierMsteamsConfigPtrInput `pulumi:"msteamsConfig"`
	// The name of the notifier (string)
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupNotifierOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNotifierArgs)(nil)).Elem()
}

// A collection of values returned by getNotifier.
type LookupNotifierResultOutput struct{ *pulumi.OutputState }

func (LookupNotifierResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNotifierResult)(nil)).Elem()
}

func (o LookupNotifierResultOutput) ToLookupNotifierResultOutput() LookupNotifierResultOutput {
	return o
}

func (o LookupNotifierResultOutput) ToLookupNotifierResultOutputWithContext(ctx context.Context) LookupNotifierResultOutput {
	return o
}

// (Computed) Annotations for notifier object (map)
func (o LookupNotifierResultOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v LookupNotifierResult) map[string]interface{} { return v.Annotations }).(pulumi.MapOutput)
}

func (o LookupNotifierResultOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNotifierResult) string { return v.ClusterId }).(pulumi.StringOutput)
}

// (Computed) The notifier description (string)
func (o LookupNotifierResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNotifierResult) string { return v.Description }).(pulumi.StringOutput)
}

// (Computed) Dingtalk config for notifier (list maxitems:1)
func (o LookupNotifierResultOutput) DingtalkConfig() GetNotifierDingtalkConfigPtrOutput {
	return o.ApplyT(func(v LookupNotifierResult) *GetNotifierDingtalkConfig { return v.DingtalkConfig }).(GetNotifierDingtalkConfigPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupNotifierResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNotifierResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) Labels for notifier object (map)
func (o LookupNotifierResultOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v LookupNotifierResult) map[string]interface{} { return v.Labels }).(pulumi.MapOutput)
}

// (Computed) MSTeams config for notifier (list maxitems:1)
func (o LookupNotifierResultOutput) MsteamsConfig() GetNotifierMsteamsConfigPtrOutput {
	return o.ApplyT(func(v LookupNotifierResult) *GetNotifierMsteamsConfig { return v.MsteamsConfig }).(GetNotifierMsteamsConfigPtrOutput)
}

func (o LookupNotifierResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNotifierResult) string { return v.Name }).(pulumi.StringOutput)
}

// (Computed) Pagerduty config for notifier (list maxitems:1)
func (o LookupNotifierResultOutput) PagerdutyConfig() GetNotifierPagerdutyConfigOutput {
	return o.ApplyT(func(v LookupNotifierResult) GetNotifierPagerdutyConfig { return v.PagerdutyConfig }).(GetNotifierPagerdutyConfigOutput)
}

// (Computed) Slack config for notifier (list maxitems:1)
func (o LookupNotifierResultOutput) SlackConfig() GetNotifierSlackConfigOutput {
	return o.ApplyT(func(v LookupNotifierResult) GetNotifierSlackConfig { return v.SlackConfig }).(GetNotifierSlackConfigOutput)
}

// (Computed) SMTP config for notifier (list maxitems:1)
func (o LookupNotifierResultOutput) SmtpConfig() GetNotifierSmtpConfigOutput {
	return o.ApplyT(func(v LookupNotifierResult) GetNotifierSmtpConfig { return v.SmtpConfig }).(GetNotifierSmtpConfigOutput)
}

// (Computed) Webhook config for notifier (list maxitems:1)
func (o LookupNotifierResultOutput) WebhookConfig() GetNotifierWebhookConfigOutput {
	return o.ApplyT(func(v LookupNotifierResult) GetNotifierWebhookConfig { return v.WebhookConfig }).(GetNotifierWebhookConfigOutput)
}

// (Computed) Wechat config for notifier (list maxitems:1)
func (o LookupNotifierResultOutput) WechatConfig() GetNotifierWechatConfigOutput {
	return o.ApplyT(func(v LookupNotifierResult) GetNotifierWechatConfig { return v.WechatConfig }).(GetNotifierWechatConfigOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNotifierResultOutput{})
}
