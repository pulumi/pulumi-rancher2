// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 Registry resource. This can be used to create docker registries for Rancher v2 environments and retrieve their information.
//
// Depending of the availability, there are 2 types of Rancher v2 docker registries:
// - Project registry: Available to all namespaces in the `projectId`
// - Namespaced registry: Available to just `namespaceId` in the `projectId`
//
// ## Example Usage
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
// 		_, err := rancher2.NewRegistry(ctx, "foo", &rancher2.RegistryArgs{
// 			Description: pulumi.String("Terraform registry foo"),
// 			ProjectId:   pulumi.String("<project_id>"),
// 			Registries: rancher2.RegistryRegistryArray{
// 				&rancher2.RegistryRegistryArgs{
// 					Address:  pulumi.String("test.io"),
// 					Password: pulumi.String("pass"),
// 					Username: pulumi.String("user"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
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
// 		_, err := rancher2.NewRegistry(ctx, "foo", &rancher2.RegistryArgs{
// 			Description: pulumi.String("Terraform registry foo"),
// 			NamespaceId: pulumi.String("<namespace_id>"),
// 			ProjectId:   pulumi.String("<project_id>"),
// 			Registries: rancher2.RegistryRegistryArray{
// 				&rancher2.RegistryRegistryArgs{
// 					Address:  pulumi.String("test.io"),
// 					Password: pulumi.String("pass"),
// 					Username: pulumi.String("user2"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Registries can be imported using the registry ID in the format `<namespace_id>.<project_id>.<registry_id>`
//
// ```sh
//  $ pulumi import rancher2:index/registry:Registry foo &lt;namespace_id&gt;.&lt;project_id&gt;.&lt;registry_id&gt;
// ```
//
//  `<namespace_id>` is optional, just needed for namespaced registry.
type Registry struct {
	pulumi.CustomResourceState

	// Annotations for Registry object (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// A registry description (string)
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Labels for Registry object (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The name of the registry (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The namespace id where to assign the namespaced registry (string)
	NamespaceId pulumi.StringPtrOutput `pulumi:"namespaceId"`
	// The project id where to assign the registry (string)
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Registries data for registry (list)
	Registries RegistryRegistryArrayOutput `pulumi:"registries"`
}

// NewRegistry registers a new resource with the given unique name, arguments, and options.
func NewRegistry(ctx *pulumi.Context,
	name string, args *RegistryArgs, opts ...pulumi.ResourceOption) (*Registry, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.Registries == nil {
		return nil, errors.New("invalid value for required argument 'Registries'")
	}
	var resource Registry
	err := ctx.RegisterResource("rancher2:index/registry:Registry", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRegistry gets an existing Registry resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRegistry(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RegistryState, opts ...pulumi.ResourceOption) (*Registry, error) {
	var resource Registry
	err := ctx.ReadResource("rancher2:index/registry:Registry", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Registry resources.
type registryState struct {
	// Annotations for Registry object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// A registry description (string)
	Description *string `pulumi:"description"`
	// Labels for Registry object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the registry (string)
	Name *string `pulumi:"name"`
	// The namespace id where to assign the namespaced registry (string)
	NamespaceId *string `pulumi:"namespaceId"`
	// The project id where to assign the registry (string)
	ProjectId *string `pulumi:"projectId"`
	// Registries data for registry (list)
	Registries []RegistryRegistry `pulumi:"registries"`
}

type RegistryState struct {
	// Annotations for Registry object (map)
	Annotations pulumi.MapInput
	// A registry description (string)
	Description pulumi.StringPtrInput
	// Labels for Registry object (map)
	Labels pulumi.MapInput
	// The name of the registry (string)
	Name pulumi.StringPtrInput
	// The namespace id where to assign the namespaced registry (string)
	NamespaceId pulumi.StringPtrInput
	// The project id where to assign the registry (string)
	ProjectId pulumi.StringPtrInput
	// Registries data for registry (list)
	Registries RegistryRegistryArrayInput
}

func (RegistryState) ElementType() reflect.Type {
	return reflect.TypeOf((*registryState)(nil)).Elem()
}

type registryArgs struct {
	// Annotations for Registry object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// A registry description (string)
	Description *string `pulumi:"description"`
	// Labels for Registry object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the registry (string)
	Name *string `pulumi:"name"`
	// The namespace id where to assign the namespaced registry (string)
	NamespaceId *string `pulumi:"namespaceId"`
	// The project id where to assign the registry (string)
	ProjectId string `pulumi:"projectId"`
	// Registries data for registry (list)
	Registries []RegistryRegistry `pulumi:"registries"`
}

// The set of arguments for constructing a Registry resource.
type RegistryArgs struct {
	// Annotations for Registry object (map)
	Annotations pulumi.MapInput
	// A registry description (string)
	Description pulumi.StringPtrInput
	// Labels for Registry object (map)
	Labels pulumi.MapInput
	// The name of the registry (string)
	Name pulumi.StringPtrInput
	// The namespace id where to assign the namespaced registry (string)
	NamespaceId pulumi.StringPtrInput
	// The project id where to assign the registry (string)
	ProjectId pulumi.StringInput
	// Registries data for registry (list)
	Registries RegistryRegistryArrayInput
}

func (RegistryArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*registryArgs)(nil)).Elem()
}

type RegistryInput interface {
	pulumi.Input

	ToRegistryOutput() RegistryOutput
	ToRegistryOutputWithContext(ctx context.Context) RegistryOutput
}

func (*Registry) ElementType() reflect.Type {
	return reflect.TypeOf((*Registry)(nil))
}

func (i *Registry) ToRegistryOutput() RegistryOutput {
	return i.ToRegistryOutputWithContext(context.Background())
}

func (i *Registry) ToRegistryOutputWithContext(ctx context.Context) RegistryOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RegistryOutput)
}

func (i *Registry) ToRegistryPtrOutput() RegistryPtrOutput {
	return i.ToRegistryPtrOutputWithContext(context.Background())
}

func (i *Registry) ToRegistryPtrOutputWithContext(ctx context.Context) RegistryPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RegistryPtrOutput)
}

type RegistryPtrInput interface {
	pulumi.Input

	ToRegistryPtrOutput() RegistryPtrOutput
	ToRegistryPtrOutputWithContext(ctx context.Context) RegistryPtrOutput
}

type registryPtrType RegistryArgs

func (*registryPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Registry)(nil))
}

func (i *registryPtrType) ToRegistryPtrOutput() RegistryPtrOutput {
	return i.ToRegistryPtrOutputWithContext(context.Background())
}

func (i *registryPtrType) ToRegistryPtrOutputWithContext(ctx context.Context) RegistryPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RegistryPtrOutput)
}

// RegistryArrayInput is an input type that accepts RegistryArray and RegistryArrayOutput values.
// You can construct a concrete instance of `RegistryArrayInput` via:
//
//          RegistryArray{ RegistryArgs{...} }
type RegistryArrayInput interface {
	pulumi.Input

	ToRegistryArrayOutput() RegistryArrayOutput
	ToRegistryArrayOutputWithContext(context.Context) RegistryArrayOutput
}

type RegistryArray []RegistryInput

func (RegistryArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Registry)(nil))
}

func (i RegistryArray) ToRegistryArrayOutput() RegistryArrayOutput {
	return i.ToRegistryArrayOutputWithContext(context.Background())
}

func (i RegistryArray) ToRegistryArrayOutputWithContext(ctx context.Context) RegistryArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RegistryArrayOutput)
}

// RegistryMapInput is an input type that accepts RegistryMap and RegistryMapOutput values.
// You can construct a concrete instance of `RegistryMapInput` via:
//
//          RegistryMap{ "key": RegistryArgs{...} }
type RegistryMapInput interface {
	pulumi.Input

	ToRegistryMapOutput() RegistryMapOutput
	ToRegistryMapOutputWithContext(context.Context) RegistryMapOutput
}

type RegistryMap map[string]RegistryInput

func (RegistryMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Registry)(nil))
}

func (i RegistryMap) ToRegistryMapOutput() RegistryMapOutput {
	return i.ToRegistryMapOutputWithContext(context.Background())
}

func (i RegistryMap) ToRegistryMapOutputWithContext(ctx context.Context) RegistryMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RegistryMapOutput)
}

type RegistryOutput struct {
	*pulumi.OutputState
}

func (RegistryOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Registry)(nil))
}

func (o RegistryOutput) ToRegistryOutput() RegistryOutput {
	return o
}

func (o RegistryOutput) ToRegistryOutputWithContext(ctx context.Context) RegistryOutput {
	return o
}

func (o RegistryOutput) ToRegistryPtrOutput() RegistryPtrOutput {
	return o.ToRegistryPtrOutputWithContext(context.Background())
}

func (o RegistryOutput) ToRegistryPtrOutputWithContext(ctx context.Context) RegistryPtrOutput {
	return o.ApplyT(func(v Registry) *Registry {
		return &v
	}).(RegistryPtrOutput)
}

type RegistryPtrOutput struct {
	*pulumi.OutputState
}

func (RegistryPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Registry)(nil))
}

func (o RegistryPtrOutput) ToRegistryPtrOutput() RegistryPtrOutput {
	return o
}

func (o RegistryPtrOutput) ToRegistryPtrOutputWithContext(ctx context.Context) RegistryPtrOutput {
	return o
}

type RegistryArrayOutput struct{ *pulumi.OutputState }

func (RegistryArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Registry)(nil))
}

func (o RegistryArrayOutput) ToRegistryArrayOutput() RegistryArrayOutput {
	return o
}

func (o RegistryArrayOutput) ToRegistryArrayOutputWithContext(ctx context.Context) RegistryArrayOutput {
	return o
}

func (o RegistryArrayOutput) Index(i pulumi.IntInput) RegistryOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Registry {
		return vs[0].([]Registry)[vs[1].(int)]
	}).(RegistryOutput)
}

type RegistryMapOutput struct{ *pulumi.OutputState }

func (RegistryMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Registry)(nil))
}

func (o RegistryMapOutput) ToRegistryMapOutput() RegistryMapOutput {
	return o
}

func (o RegistryMapOutput) ToRegistryMapOutputWithContext(ctx context.Context) RegistryMapOutput {
	return o
}

func (o RegistryMapOutput) MapIndex(k pulumi.StringInput) RegistryOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Registry {
		return vs[0].(map[string]Registry)[vs[1].(string)]
	}).(RegistryOutput)
}

func init() {
	pulumi.RegisterOutputType(RegistryOutput{})
	pulumi.RegisterOutputType(RegistryPtrOutput{})
	pulumi.RegisterOutputType(RegistryArrayOutput{})
	pulumi.RegisterOutputType(RegistryMapOutput{})
}
