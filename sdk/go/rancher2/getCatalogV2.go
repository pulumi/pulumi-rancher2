// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a Rancher2 catalog v2. Catalog v2 resource is available at Rancher v2.5.x and above.
func LookupCatalogV2(ctx *pulumi.Context, args *LookupCatalogV2Args, opts ...pulumi.InvokeOption) (*LookupCatalogV2Result, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCatalogV2Result
	err := ctx.Invoke("rancher2:index/getCatalogV2:getCatalogV2", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCatalogV2.
type LookupCatalogV2Args struct {
	// The cluster id of the catalog V2 (string)
	ClusterId string `pulumi:"clusterId"`
	// The name of the catalog v2 (string)
	Name string `pulumi:"name"`
}

// A collection of values returned by getCatalogV2.
type LookupCatalogV2Result struct {
	// (Computed) Annotations for the catalog v2 (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// (Computed) PEM encoded CA bundle which will be used to validate the repo's certificate (string)
	CaBundle  string `pulumi:"caBundle"`
	ClusterId string `pulumi:"clusterId"`
	// (Computed) If disabled the repo clone will not be updated or allowed to be installed from. Default: `true` (bool)
	Enabled bool `pulumi:"enabled"`
	// (Computed) Git Repository branch containing Helm chart definitions. Default `master` (string)
	GitBranch string `pulumi:"gitBranch"`
	// (Computed) The url of the catalog v2 repo (string)
	GitRepo string `pulumi:"gitRepo"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Use insecure HTTPS to download the repo's index. Default: `false` (bool)
	Insecure bool `pulumi:"insecure"`
	// (Computed) Labels for the catalog v2 (map)
	Labels map[string]interface{} `pulumi:"labels"`
	Name   string                 `pulumi:"name"`
	// (Computed) The k8s resource version (string)
	ResourceVersion string `pulumi:"resourceVersion"`
	// (Computed) K8s secret name to be used to connect to the repo (string)
	SecretName string `pulumi:"secretName"`
	// (Computed) K8s secret namespace (string)
	SecretNamespace string `pulumi:"secretNamespace"`
	// (Computed) K8s service account used to deploy charts instead of the end users credentials (string)
	ServiceAccount string `pulumi:"serviceAccount"`
	// (Computed) The username to access the catalog if needed (string)
	ServiceAccountNamespace string `pulumi:"serviceAccountNamespace"`
	// (Computed) URL to an index generated by Helm (string)
	Url string `pulumi:"url"`
}

func LookupCatalogV2Output(ctx *pulumi.Context, args LookupCatalogV2OutputArgs, opts ...pulumi.InvokeOption) LookupCatalogV2ResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupCatalogV2Result, error) {
			args := v.(LookupCatalogV2Args)
			r, err := LookupCatalogV2(ctx, &args, opts...)
			var s LookupCatalogV2Result
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupCatalogV2ResultOutput)
}

// A collection of arguments for invoking getCatalogV2.
type LookupCatalogV2OutputArgs struct {
	// The cluster id of the catalog V2 (string)
	ClusterId pulumi.StringInput `pulumi:"clusterId"`
	// The name of the catalog v2 (string)
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupCatalogV2OutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCatalogV2Args)(nil)).Elem()
}

// A collection of values returned by getCatalogV2.
type LookupCatalogV2ResultOutput struct{ *pulumi.OutputState }

func (LookupCatalogV2ResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCatalogV2Result)(nil)).Elem()
}

func (o LookupCatalogV2ResultOutput) ToLookupCatalogV2ResultOutput() LookupCatalogV2ResultOutput {
	return o
}

func (o LookupCatalogV2ResultOutput) ToLookupCatalogV2ResultOutputWithContext(ctx context.Context) LookupCatalogV2ResultOutput {
	return o
}

// (Computed) Annotations for the catalog v2 (map)
func (o LookupCatalogV2ResultOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v LookupCatalogV2Result) map[string]interface{} { return v.Annotations }).(pulumi.MapOutput)
}

// (Computed) PEM encoded CA bundle which will be used to validate the repo's certificate (string)
func (o LookupCatalogV2ResultOutput) CaBundle() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCatalogV2Result) string { return v.CaBundle }).(pulumi.StringOutput)
}

func (o LookupCatalogV2ResultOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCatalogV2Result) string { return v.ClusterId }).(pulumi.StringOutput)
}

// (Computed) If disabled the repo clone will not be updated or allowed to be installed from. Default: `true` (bool)
func (o LookupCatalogV2ResultOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCatalogV2Result) bool { return v.Enabled }).(pulumi.BoolOutput)
}

// (Computed) Git Repository branch containing Helm chart definitions. Default `master` (string)
func (o LookupCatalogV2ResultOutput) GitBranch() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCatalogV2Result) string { return v.GitBranch }).(pulumi.StringOutput)
}

// (Computed) The url of the catalog v2 repo (string)
func (o LookupCatalogV2ResultOutput) GitRepo() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCatalogV2Result) string { return v.GitRepo }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupCatalogV2ResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCatalogV2Result) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) Use insecure HTTPS to download the repo's index. Default: `false` (bool)
func (o LookupCatalogV2ResultOutput) Insecure() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCatalogV2Result) bool { return v.Insecure }).(pulumi.BoolOutput)
}

// (Computed) Labels for the catalog v2 (map)
func (o LookupCatalogV2ResultOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v LookupCatalogV2Result) map[string]interface{} { return v.Labels }).(pulumi.MapOutput)
}

func (o LookupCatalogV2ResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCatalogV2Result) string { return v.Name }).(pulumi.StringOutput)
}

// (Computed) The k8s resource version (string)
func (o LookupCatalogV2ResultOutput) ResourceVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCatalogV2Result) string { return v.ResourceVersion }).(pulumi.StringOutput)
}

// (Computed) K8s secret name to be used to connect to the repo (string)
func (o LookupCatalogV2ResultOutput) SecretName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCatalogV2Result) string { return v.SecretName }).(pulumi.StringOutput)
}

// (Computed) K8s secret namespace (string)
func (o LookupCatalogV2ResultOutput) SecretNamespace() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCatalogV2Result) string { return v.SecretNamespace }).(pulumi.StringOutput)
}

// (Computed) K8s service account used to deploy charts instead of the end users credentials (string)
func (o LookupCatalogV2ResultOutput) ServiceAccount() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCatalogV2Result) string { return v.ServiceAccount }).(pulumi.StringOutput)
}

// (Computed) The username to access the catalog if needed (string)
func (o LookupCatalogV2ResultOutput) ServiceAccountNamespace() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCatalogV2Result) string { return v.ServiceAccountNamespace }).(pulumi.StringOutput)
}

// (Computed) URL to an index generated by Helm (string)
func (o LookupCatalogV2ResultOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCatalogV2Result) string { return v.Url }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCatalogV2ResultOutput{})
}
