// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 PodSecurityPolicyTemplate resource. This can be used to create PodSecurityPolicyTemplates for Rancher v2 environments and retrieve their information.
//
// ## Example Usage
//
// ## Import
//
// # PodSecurityPolicyTemplate can be imported using the Rancher PodSecurityPolicyTemplate Name
//
// ```sh
// $ pulumi import rancher2:index/podSecurityPolicyTemplate:PodSecurityPolicyTemplate foo &lt;pod_security_policy_name&gt;
// ```
type PodSecurityPolicyTemplate struct {
	pulumi.CustomResourceState

	// = (Optional)
	AllowPrivilegeEscalation pulumi.BoolOutput `pulumi:"allowPrivilegeEscalation"`
	// (list)
	AllowedCapabilities pulumi.StringArrayOutput `pulumi:"allowedCapabilities"`
	// (list)
	AllowedCsiDrivers PodSecurityPolicyTemplateAllowedCsiDriverArrayOutput `pulumi:"allowedCsiDrivers"`
	// (list)
	AllowedFlexVolumes PodSecurityPolicyTemplateAllowedFlexVolumeArrayOutput `pulumi:"allowedFlexVolumes"`
	// (list)
	AllowedHostPaths PodSecurityPolicyTemplateAllowedHostPathArrayOutput `pulumi:"allowedHostPaths"`
	// (list)
	AllowedProcMountTypes pulumi.StringArrayOutput `pulumi:"allowedProcMountTypes"`
	// (list)
	AllowedUnsafeSysctls pulumi.StringArrayOutput `pulumi:"allowedUnsafeSysctls"`
	// Annotations for PodSecurityPolicyTemplate object (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// (list)
	DefaultAddCapabilities pulumi.StringArrayOutput `pulumi:"defaultAddCapabilities"`
	// (list)
	DefaultAllowPrivilegeEscalation pulumi.BoolPtrOutput `pulumi:"defaultAllowPrivilegeEscalation"`
	// The PodSecurityPolicyTemplate description (string)
	Description pulumi.StringOutput `pulumi:"description"`
	// (list)
	ForbiddenSysctls pulumi.StringArrayOutput `pulumi:"forbiddenSysctls"`
	// (list maxitems:1)
	FsGroup PodSecurityPolicyTemplateFsGroupOutput `pulumi:"fsGroup"`
	// (bool)
	HostIpc pulumi.BoolOutput `pulumi:"hostIpc"`
	// hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
	HostNetwork pulumi.BoolOutput `pulumi:"hostNetwork"`
	// (bool)
	HostPid pulumi.BoolOutput `pulumi:"hostPid"`
	// (list)
	HostPorts PodSecurityPolicyTemplateHostPortArrayOutput `pulumi:"hostPorts"`
	// Labels for PodSecurityPolicyTemplate object (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The name of the PodSecurityPolicyTemplate (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// (bool)
	Privileged pulumi.BoolOutput `pulumi:"privileged"`
	// (bool)
	ReadOnlyRootFilesystem pulumi.BoolOutput `pulumi:"readOnlyRootFilesystem"`
	// (list)
	RequiredDropCapabilities pulumi.StringArrayOutput `pulumi:"requiredDropCapabilities"`
	// (list maxitems:1)
	RunAsGroup PodSecurityPolicyTemplateRunAsGroupPtrOutput `pulumi:"runAsGroup"`
	// (list maxitems:1)
	RunAsUser PodSecurityPolicyTemplateRunAsUserOutput `pulumi:"runAsUser"`
	// (list maxitems:1)
	RuntimeClass PodSecurityPolicyTemplateRuntimeClassPtrOutput `pulumi:"runtimeClass"`
	// (list maxitems:1)
	SeLinux PodSecurityPolicyTemplateSeLinuxOutput `pulumi:"seLinux"`
	// (list maxitems:1)
	SupplementalGroup PodSecurityPolicyTemplateSupplementalGroupOutput `pulumi:"supplementalGroup"`
	// (list)
	Volumes pulumi.StringArrayOutput `pulumi:"volumes"`
}

// NewPodSecurityPolicyTemplate registers a new resource with the given unique name, arguments, and options.
func NewPodSecurityPolicyTemplate(ctx *pulumi.Context,
	name string, args *PodSecurityPolicyTemplateArgs, opts ...pulumi.ResourceOption) (*PodSecurityPolicyTemplate, error) {
	if args == nil {
		args = &PodSecurityPolicyTemplateArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PodSecurityPolicyTemplate
	err := ctx.RegisterResource("rancher2:index/podSecurityPolicyTemplate:PodSecurityPolicyTemplate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPodSecurityPolicyTemplate gets an existing PodSecurityPolicyTemplate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPodSecurityPolicyTemplate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PodSecurityPolicyTemplateState, opts ...pulumi.ResourceOption) (*PodSecurityPolicyTemplate, error) {
	var resource PodSecurityPolicyTemplate
	err := ctx.ReadResource("rancher2:index/podSecurityPolicyTemplate:PodSecurityPolicyTemplate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PodSecurityPolicyTemplate resources.
type podSecurityPolicyTemplateState struct {
	// = (Optional)
	AllowPrivilegeEscalation *bool `pulumi:"allowPrivilegeEscalation"`
	// (list)
	AllowedCapabilities []string `pulumi:"allowedCapabilities"`
	// (list)
	AllowedCsiDrivers []PodSecurityPolicyTemplateAllowedCsiDriver `pulumi:"allowedCsiDrivers"`
	// (list)
	AllowedFlexVolumes []PodSecurityPolicyTemplateAllowedFlexVolume `pulumi:"allowedFlexVolumes"`
	// (list)
	AllowedHostPaths []PodSecurityPolicyTemplateAllowedHostPath `pulumi:"allowedHostPaths"`
	// (list)
	AllowedProcMountTypes []string `pulumi:"allowedProcMountTypes"`
	// (list)
	AllowedUnsafeSysctls []string `pulumi:"allowedUnsafeSysctls"`
	// Annotations for PodSecurityPolicyTemplate object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// (list)
	DefaultAddCapabilities []string `pulumi:"defaultAddCapabilities"`
	// (list)
	DefaultAllowPrivilegeEscalation *bool `pulumi:"defaultAllowPrivilegeEscalation"`
	// The PodSecurityPolicyTemplate description (string)
	Description *string `pulumi:"description"`
	// (list)
	ForbiddenSysctls []string `pulumi:"forbiddenSysctls"`
	// (list maxitems:1)
	FsGroup *PodSecurityPolicyTemplateFsGroup `pulumi:"fsGroup"`
	// (bool)
	HostIpc *bool `pulumi:"hostIpc"`
	// hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
	HostNetwork *bool `pulumi:"hostNetwork"`
	// (bool)
	HostPid *bool `pulumi:"hostPid"`
	// (list)
	HostPorts []PodSecurityPolicyTemplateHostPort `pulumi:"hostPorts"`
	// Labels for PodSecurityPolicyTemplate object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the PodSecurityPolicyTemplate (string)
	Name *string `pulumi:"name"`
	// (bool)
	Privileged *bool `pulumi:"privileged"`
	// (bool)
	ReadOnlyRootFilesystem *bool `pulumi:"readOnlyRootFilesystem"`
	// (list)
	RequiredDropCapabilities []string `pulumi:"requiredDropCapabilities"`
	// (list maxitems:1)
	RunAsGroup *PodSecurityPolicyTemplateRunAsGroup `pulumi:"runAsGroup"`
	// (list maxitems:1)
	RunAsUser *PodSecurityPolicyTemplateRunAsUser `pulumi:"runAsUser"`
	// (list maxitems:1)
	RuntimeClass *PodSecurityPolicyTemplateRuntimeClass `pulumi:"runtimeClass"`
	// (list maxitems:1)
	SeLinux *PodSecurityPolicyTemplateSeLinux `pulumi:"seLinux"`
	// (list maxitems:1)
	SupplementalGroup *PodSecurityPolicyTemplateSupplementalGroup `pulumi:"supplementalGroup"`
	// (list)
	Volumes []string `pulumi:"volumes"`
}

type PodSecurityPolicyTemplateState struct {
	// = (Optional)
	AllowPrivilegeEscalation pulumi.BoolPtrInput
	// (list)
	AllowedCapabilities pulumi.StringArrayInput
	// (list)
	AllowedCsiDrivers PodSecurityPolicyTemplateAllowedCsiDriverArrayInput
	// (list)
	AllowedFlexVolumes PodSecurityPolicyTemplateAllowedFlexVolumeArrayInput
	// (list)
	AllowedHostPaths PodSecurityPolicyTemplateAllowedHostPathArrayInput
	// (list)
	AllowedProcMountTypes pulumi.StringArrayInput
	// (list)
	AllowedUnsafeSysctls pulumi.StringArrayInput
	// Annotations for PodSecurityPolicyTemplate object (map)
	Annotations pulumi.MapInput
	// (list)
	DefaultAddCapabilities pulumi.StringArrayInput
	// (list)
	DefaultAllowPrivilegeEscalation pulumi.BoolPtrInput
	// The PodSecurityPolicyTemplate description (string)
	Description pulumi.StringPtrInput
	// (list)
	ForbiddenSysctls pulumi.StringArrayInput
	// (list maxitems:1)
	FsGroup PodSecurityPolicyTemplateFsGroupPtrInput
	// (bool)
	HostIpc pulumi.BoolPtrInput
	// hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
	HostNetwork pulumi.BoolPtrInput
	// (bool)
	HostPid pulumi.BoolPtrInput
	// (list)
	HostPorts PodSecurityPolicyTemplateHostPortArrayInput
	// Labels for PodSecurityPolicyTemplate object (map)
	Labels pulumi.MapInput
	// The name of the PodSecurityPolicyTemplate (string)
	Name pulumi.StringPtrInput
	// (bool)
	Privileged pulumi.BoolPtrInput
	// (bool)
	ReadOnlyRootFilesystem pulumi.BoolPtrInput
	// (list)
	RequiredDropCapabilities pulumi.StringArrayInput
	// (list maxitems:1)
	RunAsGroup PodSecurityPolicyTemplateRunAsGroupPtrInput
	// (list maxitems:1)
	RunAsUser PodSecurityPolicyTemplateRunAsUserPtrInput
	// (list maxitems:1)
	RuntimeClass PodSecurityPolicyTemplateRuntimeClassPtrInput
	// (list maxitems:1)
	SeLinux PodSecurityPolicyTemplateSeLinuxPtrInput
	// (list maxitems:1)
	SupplementalGroup PodSecurityPolicyTemplateSupplementalGroupPtrInput
	// (list)
	Volumes pulumi.StringArrayInput
}

func (PodSecurityPolicyTemplateState) ElementType() reflect.Type {
	return reflect.TypeOf((*podSecurityPolicyTemplateState)(nil)).Elem()
}

type podSecurityPolicyTemplateArgs struct {
	// = (Optional)
	AllowPrivilegeEscalation *bool `pulumi:"allowPrivilegeEscalation"`
	// (list)
	AllowedCapabilities []string `pulumi:"allowedCapabilities"`
	// (list)
	AllowedCsiDrivers []PodSecurityPolicyTemplateAllowedCsiDriver `pulumi:"allowedCsiDrivers"`
	// (list)
	AllowedFlexVolumes []PodSecurityPolicyTemplateAllowedFlexVolume `pulumi:"allowedFlexVolumes"`
	// (list)
	AllowedHostPaths []PodSecurityPolicyTemplateAllowedHostPath `pulumi:"allowedHostPaths"`
	// (list)
	AllowedProcMountTypes []string `pulumi:"allowedProcMountTypes"`
	// (list)
	AllowedUnsafeSysctls []string `pulumi:"allowedUnsafeSysctls"`
	// Annotations for PodSecurityPolicyTemplate object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// (list)
	DefaultAddCapabilities []string `pulumi:"defaultAddCapabilities"`
	// (list)
	DefaultAllowPrivilegeEscalation *bool `pulumi:"defaultAllowPrivilegeEscalation"`
	// The PodSecurityPolicyTemplate description (string)
	Description *string `pulumi:"description"`
	// (list)
	ForbiddenSysctls []string `pulumi:"forbiddenSysctls"`
	// (list maxitems:1)
	FsGroup *PodSecurityPolicyTemplateFsGroup `pulumi:"fsGroup"`
	// (bool)
	HostIpc *bool `pulumi:"hostIpc"`
	// hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
	HostNetwork *bool `pulumi:"hostNetwork"`
	// (bool)
	HostPid *bool `pulumi:"hostPid"`
	// (list)
	HostPorts []PodSecurityPolicyTemplateHostPort `pulumi:"hostPorts"`
	// Labels for PodSecurityPolicyTemplate object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the PodSecurityPolicyTemplate (string)
	Name *string `pulumi:"name"`
	// (bool)
	Privileged *bool `pulumi:"privileged"`
	// (bool)
	ReadOnlyRootFilesystem *bool `pulumi:"readOnlyRootFilesystem"`
	// (list)
	RequiredDropCapabilities []string `pulumi:"requiredDropCapabilities"`
	// (list maxitems:1)
	RunAsGroup *PodSecurityPolicyTemplateRunAsGroup `pulumi:"runAsGroup"`
	// (list maxitems:1)
	RunAsUser *PodSecurityPolicyTemplateRunAsUser `pulumi:"runAsUser"`
	// (list maxitems:1)
	RuntimeClass *PodSecurityPolicyTemplateRuntimeClass `pulumi:"runtimeClass"`
	// (list maxitems:1)
	SeLinux *PodSecurityPolicyTemplateSeLinux `pulumi:"seLinux"`
	// (list maxitems:1)
	SupplementalGroup *PodSecurityPolicyTemplateSupplementalGroup `pulumi:"supplementalGroup"`
	// (list)
	Volumes []string `pulumi:"volumes"`
}

// The set of arguments for constructing a PodSecurityPolicyTemplate resource.
type PodSecurityPolicyTemplateArgs struct {
	// = (Optional)
	AllowPrivilegeEscalation pulumi.BoolPtrInput
	// (list)
	AllowedCapabilities pulumi.StringArrayInput
	// (list)
	AllowedCsiDrivers PodSecurityPolicyTemplateAllowedCsiDriverArrayInput
	// (list)
	AllowedFlexVolumes PodSecurityPolicyTemplateAllowedFlexVolumeArrayInput
	// (list)
	AllowedHostPaths PodSecurityPolicyTemplateAllowedHostPathArrayInput
	// (list)
	AllowedProcMountTypes pulumi.StringArrayInput
	// (list)
	AllowedUnsafeSysctls pulumi.StringArrayInput
	// Annotations for PodSecurityPolicyTemplate object (map)
	Annotations pulumi.MapInput
	// (list)
	DefaultAddCapabilities pulumi.StringArrayInput
	// (list)
	DefaultAllowPrivilegeEscalation pulumi.BoolPtrInput
	// The PodSecurityPolicyTemplate description (string)
	Description pulumi.StringPtrInput
	// (list)
	ForbiddenSysctls pulumi.StringArrayInput
	// (list maxitems:1)
	FsGroup PodSecurityPolicyTemplateFsGroupPtrInput
	// (bool)
	HostIpc pulumi.BoolPtrInput
	// hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
	HostNetwork pulumi.BoolPtrInput
	// (bool)
	HostPid pulumi.BoolPtrInput
	// (list)
	HostPorts PodSecurityPolicyTemplateHostPortArrayInput
	// Labels for PodSecurityPolicyTemplate object (map)
	Labels pulumi.MapInput
	// The name of the PodSecurityPolicyTemplate (string)
	Name pulumi.StringPtrInput
	// (bool)
	Privileged pulumi.BoolPtrInput
	// (bool)
	ReadOnlyRootFilesystem pulumi.BoolPtrInput
	// (list)
	RequiredDropCapabilities pulumi.StringArrayInput
	// (list maxitems:1)
	RunAsGroup PodSecurityPolicyTemplateRunAsGroupPtrInput
	// (list maxitems:1)
	RunAsUser PodSecurityPolicyTemplateRunAsUserPtrInput
	// (list maxitems:1)
	RuntimeClass PodSecurityPolicyTemplateRuntimeClassPtrInput
	// (list maxitems:1)
	SeLinux PodSecurityPolicyTemplateSeLinuxPtrInput
	// (list maxitems:1)
	SupplementalGroup PodSecurityPolicyTemplateSupplementalGroupPtrInput
	// (list)
	Volumes pulumi.StringArrayInput
}

func (PodSecurityPolicyTemplateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*podSecurityPolicyTemplateArgs)(nil)).Elem()
}

type PodSecurityPolicyTemplateInput interface {
	pulumi.Input

	ToPodSecurityPolicyTemplateOutput() PodSecurityPolicyTemplateOutput
	ToPodSecurityPolicyTemplateOutputWithContext(ctx context.Context) PodSecurityPolicyTemplateOutput
}

func (*PodSecurityPolicyTemplate) ElementType() reflect.Type {
	return reflect.TypeOf((**PodSecurityPolicyTemplate)(nil)).Elem()
}

func (i *PodSecurityPolicyTemplate) ToPodSecurityPolicyTemplateOutput() PodSecurityPolicyTemplateOutput {
	return i.ToPodSecurityPolicyTemplateOutputWithContext(context.Background())
}

func (i *PodSecurityPolicyTemplate) ToPodSecurityPolicyTemplateOutputWithContext(ctx context.Context) PodSecurityPolicyTemplateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PodSecurityPolicyTemplateOutput)
}

// PodSecurityPolicyTemplateArrayInput is an input type that accepts PodSecurityPolicyTemplateArray and PodSecurityPolicyTemplateArrayOutput values.
// You can construct a concrete instance of `PodSecurityPolicyTemplateArrayInput` via:
//
//	PodSecurityPolicyTemplateArray{ PodSecurityPolicyTemplateArgs{...} }
type PodSecurityPolicyTemplateArrayInput interface {
	pulumi.Input

	ToPodSecurityPolicyTemplateArrayOutput() PodSecurityPolicyTemplateArrayOutput
	ToPodSecurityPolicyTemplateArrayOutputWithContext(context.Context) PodSecurityPolicyTemplateArrayOutput
}

type PodSecurityPolicyTemplateArray []PodSecurityPolicyTemplateInput

func (PodSecurityPolicyTemplateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PodSecurityPolicyTemplate)(nil)).Elem()
}

func (i PodSecurityPolicyTemplateArray) ToPodSecurityPolicyTemplateArrayOutput() PodSecurityPolicyTemplateArrayOutput {
	return i.ToPodSecurityPolicyTemplateArrayOutputWithContext(context.Background())
}

func (i PodSecurityPolicyTemplateArray) ToPodSecurityPolicyTemplateArrayOutputWithContext(ctx context.Context) PodSecurityPolicyTemplateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PodSecurityPolicyTemplateArrayOutput)
}

// PodSecurityPolicyTemplateMapInput is an input type that accepts PodSecurityPolicyTemplateMap and PodSecurityPolicyTemplateMapOutput values.
// You can construct a concrete instance of `PodSecurityPolicyTemplateMapInput` via:
//
//	PodSecurityPolicyTemplateMap{ "key": PodSecurityPolicyTemplateArgs{...} }
type PodSecurityPolicyTemplateMapInput interface {
	pulumi.Input

	ToPodSecurityPolicyTemplateMapOutput() PodSecurityPolicyTemplateMapOutput
	ToPodSecurityPolicyTemplateMapOutputWithContext(context.Context) PodSecurityPolicyTemplateMapOutput
}

type PodSecurityPolicyTemplateMap map[string]PodSecurityPolicyTemplateInput

func (PodSecurityPolicyTemplateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PodSecurityPolicyTemplate)(nil)).Elem()
}

func (i PodSecurityPolicyTemplateMap) ToPodSecurityPolicyTemplateMapOutput() PodSecurityPolicyTemplateMapOutput {
	return i.ToPodSecurityPolicyTemplateMapOutputWithContext(context.Background())
}

func (i PodSecurityPolicyTemplateMap) ToPodSecurityPolicyTemplateMapOutputWithContext(ctx context.Context) PodSecurityPolicyTemplateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PodSecurityPolicyTemplateMapOutput)
}

type PodSecurityPolicyTemplateOutput struct{ *pulumi.OutputState }

func (PodSecurityPolicyTemplateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PodSecurityPolicyTemplate)(nil)).Elem()
}

func (o PodSecurityPolicyTemplateOutput) ToPodSecurityPolicyTemplateOutput() PodSecurityPolicyTemplateOutput {
	return o
}

func (o PodSecurityPolicyTemplateOutput) ToPodSecurityPolicyTemplateOutputWithContext(ctx context.Context) PodSecurityPolicyTemplateOutput {
	return o
}

// = (Optional)
func (o PodSecurityPolicyTemplateOutput) AllowPrivilegeEscalation() pulumi.BoolOutput {
	return o.ApplyT(func(v *PodSecurityPolicyTemplate) pulumi.BoolOutput { return v.AllowPrivilegeEscalation }).(pulumi.BoolOutput)
}

// (list)
func (o PodSecurityPolicyTemplateOutput) AllowedCapabilities() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *PodSecurityPolicyTemplate) pulumi.StringArrayOutput { return v.AllowedCapabilities }).(pulumi.StringArrayOutput)
}

// (list)
func (o PodSecurityPolicyTemplateOutput) AllowedCsiDrivers() PodSecurityPolicyTemplateAllowedCsiDriverArrayOutput {
	return o.ApplyT(func(v *PodSecurityPolicyTemplate) PodSecurityPolicyTemplateAllowedCsiDriverArrayOutput {
		return v.AllowedCsiDrivers
	}).(PodSecurityPolicyTemplateAllowedCsiDriverArrayOutput)
}

// (list)
func (o PodSecurityPolicyTemplateOutput) AllowedFlexVolumes() PodSecurityPolicyTemplateAllowedFlexVolumeArrayOutput {
	return o.ApplyT(func(v *PodSecurityPolicyTemplate) PodSecurityPolicyTemplateAllowedFlexVolumeArrayOutput {
		return v.AllowedFlexVolumes
	}).(PodSecurityPolicyTemplateAllowedFlexVolumeArrayOutput)
}

// (list)
func (o PodSecurityPolicyTemplateOutput) AllowedHostPaths() PodSecurityPolicyTemplateAllowedHostPathArrayOutput {
	return o.ApplyT(func(v *PodSecurityPolicyTemplate) PodSecurityPolicyTemplateAllowedHostPathArrayOutput {
		return v.AllowedHostPaths
	}).(PodSecurityPolicyTemplateAllowedHostPathArrayOutput)
}

// (list)
func (o PodSecurityPolicyTemplateOutput) AllowedProcMountTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *PodSecurityPolicyTemplate) pulumi.StringArrayOutput { return v.AllowedProcMountTypes }).(pulumi.StringArrayOutput)
}

// (list)
func (o PodSecurityPolicyTemplateOutput) AllowedUnsafeSysctls() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *PodSecurityPolicyTemplate) pulumi.StringArrayOutput { return v.AllowedUnsafeSysctls }).(pulumi.StringArrayOutput)
}

// Annotations for PodSecurityPolicyTemplate object (map)
func (o PodSecurityPolicyTemplateOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *PodSecurityPolicyTemplate) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

// (list)
func (o PodSecurityPolicyTemplateOutput) DefaultAddCapabilities() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *PodSecurityPolicyTemplate) pulumi.StringArrayOutput { return v.DefaultAddCapabilities }).(pulumi.StringArrayOutput)
}

// (list)
func (o PodSecurityPolicyTemplateOutput) DefaultAllowPrivilegeEscalation() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PodSecurityPolicyTemplate) pulumi.BoolPtrOutput { return v.DefaultAllowPrivilegeEscalation }).(pulumi.BoolPtrOutput)
}

// The PodSecurityPolicyTemplate description (string)
func (o PodSecurityPolicyTemplateOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *PodSecurityPolicyTemplate) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// (list)
func (o PodSecurityPolicyTemplateOutput) ForbiddenSysctls() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *PodSecurityPolicyTemplate) pulumi.StringArrayOutput { return v.ForbiddenSysctls }).(pulumi.StringArrayOutput)
}

// (list maxitems:1)
func (o PodSecurityPolicyTemplateOutput) FsGroup() PodSecurityPolicyTemplateFsGroupOutput {
	return o.ApplyT(func(v *PodSecurityPolicyTemplate) PodSecurityPolicyTemplateFsGroupOutput { return v.FsGroup }).(PodSecurityPolicyTemplateFsGroupOutput)
}

// (bool)
func (o PodSecurityPolicyTemplateOutput) HostIpc() pulumi.BoolOutput {
	return o.ApplyT(func(v *PodSecurityPolicyTemplate) pulumi.BoolOutput { return v.HostIpc }).(pulumi.BoolOutput)
}

// hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
func (o PodSecurityPolicyTemplateOutput) HostNetwork() pulumi.BoolOutput {
	return o.ApplyT(func(v *PodSecurityPolicyTemplate) pulumi.BoolOutput { return v.HostNetwork }).(pulumi.BoolOutput)
}

// (bool)
func (o PodSecurityPolicyTemplateOutput) HostPid() pulumi.BoolOutput {
	return o.ApplyT(func(v *PodSecurityPolicyTemplate) pulumi.BoolOutput { return v.HostPid }).(pulumi.BoolOutput)
}

// (list)
func (o PodSecurityPolicyTemplateOutput) HostPorts() PodSecurityPolicyTemplateHostPortArrayOutput {
	return o.ApplyT(func(v *PodSecurityPolicyTemplate) PodSecurityPolicyTemplateHostPortArrayOutput { return v.HostPorts }).(PodSecurityPolicyTemplateHostPortArrayOutput)
}

// Labels for PodSecurityPolicyTemplate object (map)
func (o PodSecurityPolicyTemplateOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *PodSecurityPolicyTemplate) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// The name of the PodSecurityPolicyTemplate (string)
func (o PodSecurityPolicyTemplateOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *PodSecurityPolicyTemplate) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// (bool)
func (o PodSecurityPolicyTemplateOutput) Privileged() pulumi.BoolOutput {
	return o.ApplyT(func(v *PodSecurityPolicyTemplate) pulumi.BoolOutput { return v.Privileged }).(pulumi.BoolOutput)
}

// (bool)
func (o PodSecurityPolicyTemplateOutput) ReadOnlyRootFilesystem() pulumi.BoolOutput {
	return o.ApplyT(func(v *PodSecurityPolicyTemplate) pulumi.BoolOutput { return v.ReadOnlyRootFilesystem }).(pulumi.BoolOutput)
}

// (list)
func (o PodSecurityPolicyTemplateOutput) RequiredDropCapabilities() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *PodSecurityPolicyTemplate) pulumi.StringArrayOutput { return v.RequiredDropCapabilities }).(pulumi.StringArrayOutput)
}

// (list maxitems:1)
func (o PodSecurityPolicyTemplateOutput) RunAsGroup() PodSecurityPolicyTemplateRunAsGroupPtrOutput {
	return o.ApplyT(func(v *PodSecurityPolicyTemplate) PodSecurityPolicyTemplateRunAsGroupPtrOutput { return v.RunAsGroup }).(PodSecurityPolicyTemplateRunAsGroupPtrOutput)
}

// (list maxitems:1)
func (o PodSecurityPolicyTemplateOutput) RunAsUser() PodSecurityPolicyTemplateRunAsUserOutput {
	return o.ApplyT(func(v *PodSecurityPolicyTemplate) PodSecurityPolicyTemplateRunAsUserOutput { return v.RunAsUser }).(PodSecurityPolicyTemplateRunAsUserOutput)
}

// (list maxitems:1)
func (o PodSecurityPolicyTemplateOutput) RuntimeClass() PodSecurityPolicyTemplateRuntimeClassPtrOutput {
	return o.ApplyT(func(v *PodSecurityPolicyTemplate) PodSecurityPolicyTemplateRuntimeClassPtrOutput {
		return v.RuntimeClass
	}).(PodSecurityPolicyTemplateRuntimeClassPtrOutput)
}

// (list maxitems:1)
func (o PodSecurityPolicyTemplateOutput) SeLinux() PodSecurityPolicyTemplateSeLinuxOutput {
	return o.ApplyT(func(v *PodSecurityPolicyTemplate) PodSecurityPolicyTemplateSeLinuxOutput { return v.SeLinux }).(PodSecurityPolicyTemplateSeLinuxOutput)
}

// (list maxitems:1)
func (o PodSecurityPolicyTemplateOutput) SupplementalGroup() PodSecurityPolicyTemplateSupplementalGroupOutput {
	return o.ApplyT(func(v *PodSecurityPolicyTemplate) PodSecurityPolicyTemplateSupplementalGroupOutput {
		return v.SupplementalGroup
	}).(PodSecurityPolicyTemplateSupplementalGroupOutput)
}

// (list)
func (o PodSecurityPolicyTemplateOutput) Volumes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *PodSecurityPolicyTemplate) pulumi.StringArrayOutput { return v.Volumes }).(pulumi.StringArrayOutput)
}

type PodSecurityPolicyTemplateArrayOutput struct{ *pulumi.OutputState }

func (PodSecurityPolicyTemplateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PodSecurityPolicyTemplate)(nil)).Elem()
}

func (o PodSecurityPolicyTemplateArrayOutput) ToPodSecurityPolicyTemplateArrayOutput() PodSecurityPolicyTemplateArrayOutput {
	return o
}

func (o PodSecurityPolicyTemplateArrayOutput) ToPodSecurityPolicyTemplateArrayOutputWithContext(ctx context.Context) PodSecurityPolicyTemplateArrayOutput {
	return o
}

func (o PodSecurityPolicyTemplateArrayOutput) Index(i pulumi.IntInput) PodSecurityPolicyTemplateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PodSecurityPolicyTemplate {
		return vs[0].([]*PodSecurityPolicyTemplate)[vs[1].(int)]
	}).(PodSecurityPolicyTemplateOutput)
}

type PodSecurityPolicyTemplateMapOutput struct{ *pulumi.OutputState }

func (PodSecurityPolicyTemplateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PodSecurityPolicyTemplate)(nil)).Elem()
}

func (o PodSecurityPolicyTemplateMapOutput) ToPodSecurityPolicyTemplateMapOutput() PodSecurityPolicyTemplateMapOutput {
	return o
}

func (o PodSecurityPolicyTemplateMapOutput) ToPodSecurityPolicyTemplateMapOutputWithContext(ctx context.Context) PodSecurityPolicyTemplateMapOutput {
	return o
}

func (o PodSecurityPolicyTemplateMapOutput) MapIndex(k pulumi.StringInput) PodSecurityPolicyTemplateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PodSecurityPolicyTemplate {
		return vs[0].(map[string]*PodSecurityPolicyTemplate)[vs[1].(string)]
	}).(PodSecurityPolicyTemplateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PodSecurityPolicyTemplateInput)(nil)).Elem(), &PodSecurityPolicyTemplate{})
	pulumi.RegisterInputType(reflect.TypeOf((*PodSecurityPolicyTemplateArrayInput)(nil)).Elem(), PodSecurityPolicyTemplateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PodSecurityPolicyTemplateMapInput)(nil)).Elem(), PodSecurityPolicyTemplateMap{})
	pulumi.RegisterOutputType(PodSecurityPolicyTemplateOutput{})
	pulumi.RegisterOutputType(PodSecurityPolicyTemplateArrayOutput{})
	pulumi.RegisterOutputType(PodSecurityPolicyTemplateMapOutput{})
}
