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

// Provides a Rancher v2 Auth Config FreeIpa resource. This can be used to configure and enable Auth Config FreeIpa for Rancher v2 RKE clusters and retrieve their information.
//
// In addition to the built-in local auth, only one external auth config provider can be enabled at a time.
type AuthConfigFreeIpa struct {
	pulumi.CustomResourceState

	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrOutput `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `freeipa_user://<DN>`  `freeipa_group://<DN>` (list)
	AllowedPrincipalIds pulumi.StringArrayOutput `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations pulumi.StringMapOutput `pulumi:"annotations"`
	// Base64 encoded CA certificate for TLS if self-signed. Use filebase64(<FILE>) for encoding file (string)
	Certificate pulumi.StringPtrOutput `pulumi:"certificate"`
	// FreeIpa connection timeout. Default `5000` (int)
	ConnectionTimeout pulumi.IntPtrOutput `pulumi:"connectionTimeout"`
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Group DN attribute. Default `entryDN` (string)
	GroupDnAttribute pulumi.StringOutput `pulumi:"groupDnAttribute"`
	// Group member mapping attribute. Default `member` (string)
	GroupMemberMappingAttribute pulumi.StringOutput `pulumi:"groupMemberMappingAttribute"`
	// Group member user attribute. Default `entryDN` (string)
	GroupMemberUserAttribute pulumi.StringOutput `pulumi:"groupMemberUserAttribute"`
	// Group name attribute. Default `cn` (string)
	GroupNameAttribute pulumi.StringOutput `pulumi:"groupNameAttribute"`
	// Group object class. Default `groupOfNames` (string)
	GroupObjectClass pulumi.StringOutput `pulumi:"groupObjectClass"`
	// Group search attribute. Default `cn` (string)
	GroupSearchAttribute pulumi.StringOutput `pulumi:"groupSearchAttribute"`
	// Group search base (string)
	GroupSearchBase   pulumi.StringOutput    `pulumi:"groupSearchBase"`
	GroupSearchFilter pulumi.StringPtrOutput `pulumi:"groupSearchFilter"`
	// Labels of the resource (map)
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// (Computed) The name of the resource (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// Nested group membership enable. Default `false` (bool)
	NestedGroupMembershipEnabled pulumi.BoolOutput `pulumi:"nestedGroupMembershipEnabled"`
	// FreeIpa port. Default `389` (int)
	Port pulumi.IntPtrOutput `pulumi:"port"`
	// FreeIpa servers list (list)
	Servers pulumi.StringArrayOutput `pulumi:"servers"`
	// Service account DN for access FreeIpa service (string)
	ServiceAccountDistinguishedName pulumi.StringOutput `pulumi:"serviceAccountDistinguishedName"`
	// Service account password for access FreeIpa service (string)
	ServiceAccountPassword pulumi.StringOutput `pulumi:"serviceAccountPassword"`
	StartTls               pulumi.BoolOutput   `pulumi:"startTls"`
	// Password for test access to FreeIpa service (string)
	TestPassword pulumi.StringOutput `pulumi:"testPassword"`
	// Username for test access to FreeIpa service (string)
	TestUsername pulumi.StringOutput `pulumi:"testUsername"`
	// Enable TLS connection (bool)
	Tls pulumi.BoolOutput `pulumi:"tls"`
	// (Computed) The type of the resource (string)
	Type pulumi.StringOutput `pulumi:"type"`
	// User disabled bit mask (int)
	UserDisabledBitMask pulumi.IntOutput `pulumi:"userDisabledBitMask"`
	// User enable attribute (string)
	UserEnabledAttribute pulumi.StringOutput `pulumi:"userEnabledAttribute"`
	// User login attribute. Default `uid` (string)
	UserLoginAttribute pulumi.StringOutput `pulumi:"userLoginAttribute"`
	// User member attribute. Default `memberOf` (string)
	UserMemberAttribute pulumi.StringOutput `pulumi:"userMemberAttribute"`
	// User name attribute. Default `givenName` (string)
	UserNameAttribute pulumi.StringOutput `pulumi:"userNameAttribute"`
	// User object class. Default `inetorgperson` (string)
	UserObjectClass pulumi.StringOutput `pulumi:"userObjectClass"`
	// User search attribute. Default `uid|sn|givenName` (string)
	UserSearchAttribute pulumi.StringOutput `pulumi:"userSearchAttribute"`
	// User search base DN (string)
	UserSearchBase   pulumi.StringOutput    `pulumi:"userSearchBase"`
	UserSearchFilter pulumi.StringPtrOutput `pulumi:"userSearchFilter"`
}

// NewAuthConfigFreeIpa registers a new resource with the given unique name, arguments, and options.
func NewAuthConfigFreeIpa(ctx *pulumi.Context,
	name string, args *AuthConfigFreeIpaArgs, opts ...pulumi.ResourceOption) (*AuthConfigFreeIpa, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Servers == nil {
		return nil, errors.New("invalid value for required argument 'Servers'")
	}
	if args.ServiceAccountDistinguishedName == nil {
		return nil, errors.New("invalid value for required argument 'ServiceAccountDistinguishedName'")
	}
	if args.ServiceAccountPassword == nil {
		return nil, errors.New("invalid value for required argument 'ServiceAccountPassword'")
	}
	if args.TestPassword == nil {
		return nil, errors.New("invalid value for required argument 'TestPassword'")
	}
	if args.TestUsername == nil {
		return nil, errors.New("invalid value for required argument 'TestUsername'")
	}
	if args.UserSearchBase == nil {
		return nil, errors.New("invalid value for required argument 'UserSearchBase'")
	}
	if args.Certificate != nil {
		args.Certificate = pulumi.ToSecret(args.Certificate).(pulumi.StringPtrInput)
	}
	if args.ServiceAccountDistinguishedName != nil {
		args.ServiceAccountDistinguishedName = pulumi.ToSecret(args.ServiceAccountDistinguishedName).(pulumi.StringInput)
	}
	if args.ServiceAccountPassword != nil {
		args.ServiceAccountPassword = pulumi.ToSecret(args.ServiceAccountPassword).(pulumi.StringInput)
	}
	if args.TestPassword != nil {
		args.TestPassword = pulumi.ToSecret(args.TestPassword).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"certificate",
		"serviceAccountDistinguishedName",
		"serviceAccountPassword",
		"testPassword",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AuthConfigFreeIpa
	err := ctx.RegisterResource("rancher2:index/authConfigFreeIpa:AuthConfigFreeIpa", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuthConfigFreeIpa gets an existing AuthConfigFreeIpa resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuthConfigFreeIpa(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuthConfigFreeIpaState, opts ...pulumi.ResourceOption) (*AuthConfigFreeIpa, error) {
	var resource AuthConfigFreeIpa
	err := ctx.ReadResource("rancher2:index/authConfigFreeIpa:AuthConfigFreeIpa", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthConfigFreeIpa resources.
type authConfigFreeIpaState struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode *string `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `freeipa_user://<DN>`  `freeipa_group://<DN>` (list)
	AllowedPrincipalIds []string `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations map[string]string `pulumi:"annotations"`
	// Base64 encoded CA certificate for TLS if self-signed. Use filebase64(<FILE>) for encoding file (string)
	Certificate *string `pulumi:"certificate"`
	// FreeIpa connection timeout. Default `5000` (int)
	ConnectionTimeout *int `pulumi:"connectionTimeout"`
	// Enable auth config provider. Default `true` (bool)
	Enabled *bool `pulumi:"enabled"`
	// Group DN attribute. Default `entryDN` (string)
	GroupDnAttribute *string `pulumi:"groupDnAttribute"`
	// Group member mapping attribute. Default `member` (string)
	GroupMemberMappingAttribute *string `pulumi:"groupMemberMappingAttribute"`
	// Group member user attribute. Default `entryDN` (string)
	GroupMemberUserAttribute *string `pulumi:"groupMemberUserAttribute"`
	// Group name attribute. Default `cn` (string)
	GroupNameAttribute *string `pulumi:"groupNameAttribute"`
	// Group object class. Default `groupOfNames` (string)
	GroupObjectClass *string `pulumi:"groupObjectClass"`
	// Group search attribute. Default `cn` (string)
	GroupSearchAttribute *string `pulumi:"groupSearchAttribute"`
	// Group search base (string)
	GroupSearchBase   *string `pulumi:"groupSearchBase"`
	GroupSearchFilter *string `pulumi:"groupSearchFilter"`
	// Labels of the resource (map)
	Labels map[string]string `pulumi:"labels"`
	// (Computed) The name of the resource (string)
	Name *string `pulumi:"name"`
	// Nested group membership enable. Default `false` (bool)
	NestedGroupMembershipEnabled *bool `pulumi:"nestedGroupMembershipEnabled"`
	// FreeIpa port. Default `389` (int)
	Port *int `pulumi:"port"`
	// FreeIpa servers list (list)
	Servers []string `pulumi:"servers"`
	// Service account DN for access FreeIpa service (string)
	ServiceAccountDistinguishedName *string `pulumi:"serviceAccountDistinguishedName"`
	// Service account password for access FreeIpa service (string)
	ServiceAccountPassword *string `pulumi:"serviceAccountPassword"`
	StartTls               *bool   `pulumi:"startTls"`
	// Password for test access to FreeIpa service (string)
	TestPassword *string `pulumi:"testPassword"`
	// Username for test access to FreeIpa service (string)
	TestUsername *string `pulumi:"testUsername"`
	// Enable TLS connection (bool)
	Tls *bool `pulumi:"tls"`
	// (Computed) The type of the resource (string)
	Type *string `pulumi:"type"`
	// User disabled bit mask (int)
	UserDisabledBitMask *int `pulumi:"userDisabledBitMask"`
	// User enable attribute (string)
	UserEnabledAttribute *string `pulumi:"userEnabledAttribute"`
	// User login attribute. Default `uid` (string)
	UserLoginAttribute *string `pulumi:"userLoginAttribute"`
	// User member attribute. Default `memberOf` (string)
	UserMemberAttribute *string `pulumi:"userMemberAttribute"`
	// User name attribute. Default `givenName` (string)
	UserNameAttribute *string `pulumi:"userNameAttribute"`
	// User object class. Default `inetorgperson` (string)
	UserObjectClass *string `pulumi:"userObjectClass"`
	// User search attribute. Default `uid|sn|givenName` (string)
	UserSearchAttribute *string `pulumi:"userSearchAttribute"`
	// User search base DN (string)
	UserSearchBase   *string `pulumi:"userSearchBase"`
	UserSearchFilter *string `pulumi:"userSearchFilter"`
}

type AuthConfigFreeIpaState struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrInput
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `freeipa_user://<DN>`  `freeipa_group://<DN>` (list)
	AllowedPrincipalIds pulumi.StringArrayInput
	// Annotations of the resource (map)
	Annotations pulumi.StringMapInput
	// Base64 encoded CA certificate for TLS if self-signed. Use filebase64(<FILE>) for encoding file (string)
	Certificate pulumi.StringPtrInput
	// FreeIpa connection timeout. Default `5000` (int)
	ConnectionTimeout pulumi.IntPtrInput
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrInput
	// Group DN attribute. Default `entryDN` (string)
	GroupDnAttribute pulumi.StringPtrInput
	// Group member mapping attribute. Default `member` (string)
	GroupMemberMappingAttribute pulumi.StringPtrInput
	// Group member user attribute. Default `entryDN` (string)
	GroupMemberUserAttribute pulumi.StringPtrInput
	// Group name attribute. Default `cn` (string)
	GroupNameAttribute pulumi.StringPtrInput
	// Group object class. Default `groupOfNames` (string)
	GroupObjectClass pulumi.StringPtrInput
	// Group search attribute. Default `cn` (string)
	GroupSearchAttribute pulumi.StringPtrInput
	// Group search base (string)
	GroupSearchBase   pulumi.StringPtrInput
	GroupSearchFilter pulumi.StringPtrInput
	// Labels of the resource (map)
	Labels pulumi.StringMapInput
	// (Computed) The name of the resource (string)
	Name pulumi.StringPtrInput
	// Nested group membership enable. Default `false` (bool)
	NestedGroupMembershipEnabled pulumi.BoolPtrInput
	// FreeIpa port. Default `389` (int)
	Port pulumi.IntPtrInput
	// FreeIpa servers list (list)
	Servers pulumi.StringArrayInput
	// Service account DN for access FreeIpa service (string)
	ServiceAccountDistinguishedName pulumi.StringPtrInput
	// Service account password for access FreeIpa service (string)
	ServiceAccountPassword pulumi.StringPtrInput
	StartTls               pulumi.BoolPtrInput
	// Password for test access to FreeIpa service (string)
	TestPassword pulumi.StringPtrInput
	// Username for test access to FreeIpa service (string)
	TestUsername pulumi.StringPtrInput
	// Enable TLS connection (bool)
	Tls pulumi.BoolPtrInput
	// (Computed) The type of the resource (string)
	Type pulumi.StringPtrInput
	// User disabled bit mask (int)
	UserDisabledBitMask pulumi.IntPtrInput
	// User enable attribute (string)
	UserEnabledAttribute pulumi.StringPtrInput
	// User login attribute. Default `uid` (string)
	UserLoginAttribute pulumi.StringPtrInput
	// User member attribute. Default `memberOf` (string)
	UserMemberAttribute pulumi.StringPtrInput
	// User name attribute. Default `givenName` (string)
	UserNameAttribute pulumi.StringPtrInput
	// User object class. Default `inetorgperson` (string)
	UserObjectClass pulumi.StringPtrInput
	// User search attribute. Default `uid|sn|givenName` (string)
	UserSearchAttribute pulumi.StringPtrInput
	// User search base DN (string)
	UserSearchBase   pulumi.StringPtrInput
	UserSearchFilter pulumi.StringPtrInput
}

func (AuthConfigFreeIpaState) ElementType() reflect.Type {
	return reflect.TypeOf((*authConfigFreeIpaState)(nil)).Elem()
}

type authConfigFreeIpaArgs struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode *string `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `freeipa_user://<DN>`  `freeipa_group://<DN>` (list)
	AllowedPrincipalIds []string `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations map[string]string `pulumi:"annotations"`
	// Base64 encoded CA certificate for TLS if self-signed. Use filebase64(<FILE>) for encoding file (string)
	Certificate *string `pulumi:"certificate"`
	// FreeIpa connection timeout. Default `5000` (int)
	ConnectionTimeout *int `pulumi:"connectionTimeout"`
	// Enable auth config provider. Default `true` (bool)
	Enabled *bool `pulumi:"enabled"`
	// Group DN attribute. Default `entryDN` (string)
	GroupDnAttribute *string `pulumi:"groupDnAttribute"`
	// Group member mapping attribute. Default `member` (string)
	GroupMemberMappingAttribute *string `pulumi:"groupMemberMappingAttribute"`
	// Group member user attribute. Default `entryDN` (string)
	GroupMemberUserAttribute *string `pulumi:"groupMemberUserAttribute"`
	// Group name attribute. Default `cn` (string)
	GroupNameAttribute *string `pulumi:"groupNameAttribute"`
	// Group object class. Default `groupOfNames` (string)
	GroupObjectClass *string `pulumi:"groupObjectClass"`
	// Group search attribute. Default `cn` (string)
	GroupSearchAttribute *string `pulumi:"groupSearchAttribute"`
	// Group search base (string)
	GroupSearchBase   *string `pulumi:"groupSearchBase"`
	GroupSearchFilter *string `pulumi:"groupSearchFilter"`
	// Labels of the resource (map)
	Labels map[string]string `pulumi:"labels"`
	// Nested group membership enable. Default `false` (bool)
	NestedGroupMembershipEnabled *bool `pulumi:"nestedGroupMembershipEnabled"`
	// FreeIpa port. Default `389` (int)
	Port *int `pulumi:"port"`
	// FreeIpa servers list (list)
	Servers []string `pulumi:"servers"`
	// Service account DN for access FreeIpa service (string)
	ServiceAccountDistinguishedName string `pulumi:"serviceAccountDistinguishedName"`
	// Service account password for access FreeIpa service (string)
	ServiceAccountPassword string `pulumi:"serviceAccountPassword"`
	StartTls               *bool  `pulumi:"startTls"`
	// Password for test access to FreeIpa service (string)
	TestPassword string `pulumi:"testPassword"`
	// Username for test access to FreeIpa service (string)
	TestUsername string `pulumi:"testUsername"`
	// Enable TLS connection (bool)
	Tls *bool `pulumi:"tls"`
	// User disabled bit mask (int)
	UserDisabledBitMask *int `pulumi:"userDisabledBitMask"`
	// User enable attribute (string)
	UserEnabledAttribute *string `pulumi:"userEnabledAttribute"`
	// User login attribute. Default `uid` (string)
	UserLoginAttribute *string `pulumi:"userLoginAttribute"`
	// User member attribute. Default `memberOf` (string)
	UserMemberAttribute *string `pulumi:"userMemberAttribute"`
	// User name attribute. Default `givenName` (string)
	UserNameAttribute *string `pulumi:"userNameAttribute"`
	// User object class. Default `inetorgperson` (string)
	UserObjectClass *string `pulumi:"userObjectClass"`
	// User search attribute. Default `uid|sn|givenName` (string)
	UserSearchAttribute *string `pulumi:"userSearchAttribute"`
	// User search base DN (string)
	UserSearchBase   string  `pulumi:"userSearchBase"`
	UserSearchFilter *string `pulumi:"userSearchFilter"`
}

// The set of arguments for constructing a AuthConfigFreeIpa resource.
type AuthConfigFreeIpaArgs struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrInput
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `freeipa_user://<DN>`  `freeipa_group://<DN>` (list)
	AllowedPrincipalIds pulumi.StringArrayInput
	// Annotations of the resource (map)
	Annotations pulumi.StringMapInput
	// Base64 encoded CA certificate for TLS if self-signed. Use filebase64(<FILE>) for encoding file (string)
	Certificate pulumi.StringPtrInput
	// FreeIpa connection timeout. Default `5000` (int)
	ConnectionTimeout pulumi.IntPtrInput
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrInput
	// Group DN attribute. Default `entryDN` (string)
	GroupDnAttribute pulumi.StringPtrInput
	// Group member mapping attribute. Default `member` (string)
	GroupMemberMappingAttribute pulumi.StringPtrInput
	// Group member user attribute. Default `entryDN` (string)
	GroupMemberUserAttribute pulumi.StringPtrInput
	// Group name attribute. Default `cn` (string)
	GroupNameAttribute pulumi.StringPtrInput
	// Group object class. Default `groupOfNames` (string)
	GroupObjectClass pulumi.StringPtrInput
	// Group search attribute. Default `cn` (string)
	GroupSearchAttribute pulumi.StringPtrInput
	// Group search base (string)
	GroupSearchBase   pulumi.StringPtrInput
	GroupSearchFilter pulumi.StringPtrInput
	// Labels of the resource (map)
	Labels pulumi.StringMapInput
	// Nested group membership enable. Default `false` (bool)
	NestedGroupMembershipEnabled pulumi.BoolPtrInput
	// FreeIpa port. Default `389` (int)
	Port pulumi.IntPtrInput
	// FreeIpa servers list (list)
	Servers pulumi.StringArrayInput
	// Service account DN for access FreeIpa service (string)
	ServiceAccountDistinguishedName pulumi.StringInput
	// Service account password for access FreeIpa service (string)
	ServiceAccountPassword pulumi.StringInput
	StartTls               pulumi.BoolPtrInput
	// Password for test access to FreeIpa service (string)
	TestPassword pulumi.StringInput
	// Username for test access to FreeIpa service (string)
	TestUsername pulumi.StringInput
	// Enable TLS connection (bool)
	Tls pulumi.BoolPtrInput
	// User disabled bit mask (int)
	UserDisabledBitMask pulumi.IntPtrInput
	// User enable attribute (string)
	UserEnabledAttribute pulumi.StringPtrInput
	// User login attribute. Default `uid` (string)
	UserLoginAttribute pulumi.StringPtrInput
	// User member attribute. Default `memberOf` (string)
	UserMemberAttribute pulumi.StringPtrInput
	// User name attribute. Default `givenName` (string)
	UserNameAttribute pulumi.StringPtrInput
	// User object class. Default `inetorgperson` (string)
	UserObjectClass pulumi.StringPtrInput
	// User search attribute. Default `uid|sn|givenName` (string)
	UserSearchAttribute pulumi.StringPtrInput
	// User search base DN (string)
	UserSearchBase   pulumi.StringInput
	UserSearchFilter pulumi.StringPtrInput
}

func (AuthConfigFreeIpaArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*authConfigFreeIpaArgs)(nil)).Elem()
}

type AuthConfigFreeIpaInput interface {
	pulumi.Input

	ToAuthConfigFreeIpaOutput() AuthConfigFreeIpaOutput
	ToAuthConfigFreeIpaOutputWithContext(ctx context.Context) AuthConfigFreeIpaOutput
}

func (*AuthConfigFreeIpa) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthConfigFreeIpa)(nil)).Elem()
}

func (i *AuthConfigFreeIpa) ToAuthConfigFreeIpaOutput() AuthConfigFreeIpaOutput {
	return i.ToAuthConfigFreeIpaOutputWithContext(context.Background())
}

func (i *AuthConfigFreeIpa) ToAuthConfigFreeIpaOutputWithContext(ctx context.Context) AuthConfigFreeIpaOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigFreeIpaOutput)
}

// AuthConfigFreeIpaArrayInput is an input type that accepts AuthConfigFreeIpaArray and AuthConfigFreeIpaArrayOutput values.
// You can construct a concrete instance of `AuthConfigFreeIpaArrayInput` via:
//
//	AuthConfigFreeIpaArray{ AuthConfigFreeIpaArgs{...} }
type AuthConfigFreeIpaArrayInput interface {
	pulumi.Input

	ToAuthConfigFreeIpaArrayOutput() AuthConfigFreeIpaArrayOutput
	ToAuthConfigFreeIpaArrayOutputWithContext(context.Context) AuthConfigFreeIpaArrayOutput
}

type AuthConfigFreeIpaArray []AuthConfigFreeIpaInput

func (AuthConfigFreeIpaArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthConfigFreeIpa)(nil)).Elem()
}

func (i AuthConfigFreeIpaArray) ToAuthConfigFreeIpaArrayOutput() AuthConfigFreeIpaArrayOutput {
	return i.ToAuthConfigFreeIpaArrayOutputWithContext(context.Background())
}

func (i AuthConfigFreeIpaArray) ToAuthConfigFreeIpaArrayOutputWithContext(ctx context.Context) AuthConfigFreeIpaArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigFreeIpaArrayOutput)
}

// AuthConfigFreeIpaMapInput is an input type that accepts AuthConfigFreeIpaMap and AuthConfigFreeIpaMapOutput values.
// You can construct a concrete instance of `AuthConfigFreeIpaMapInput` via:
//
//	AuthConfigFreeIpaMap{ "key": AuthConfigFreeIpaArgs{...} }
type AuthConfigFreeIpaMapInput interface {
	pulumi.Input

	ToAuthConfigFreeIpaMapOutput() AuthConfigFreeIpaMapOutput
	ToAuthConfigFreeIpaMapOutputWithContext(context.Context) AuthConfigFreeIpaMapOutput
}

type AuthConfigFreeIpaMap map[string]AuthConfigFreeIpaInput

func (AuthConfigFreeIpaMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthConfigFreeIpa)(nil)).Elem()
}

func (i AuthConfigFreeIpaMap) ToAuthConfigFreeIpaMapOutput() AuthConfigFreeIpaMapOutput {
	return i.ToAuthConfigFreeIpaMapOutputWithContext(context.Background())
}

func (i AuthConfigFreeIpaMap) ToAuthConfigFreeIpaMapOutputWithContext(ctx context.Context) AuthConfigFreeIpaMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigFreeIpaMapOutput)
}

type AuthConfigFreeIpaOutput struct{ *pulumi.OutputState }

func (AuthConfigFreeIpaOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthConfigFreeIpa)(nil)).Elem()
}

func (o AuthConfigFreeIpaOutput) ToAuthConfigFreeIpaOutput() AuthConfigFreeIpaOutput {
	return o
}

func (o AuthConfigFreeIpaOutput) ToAuthConfigFreeIpaOutputWithContext(ctx context.Context) AuthConfigFreeIpaOutput {
	return o
}

// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
func (o AuthConfigFreeIpaOutput) AccessMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.StringPtrOutput { return v.AccessMode }).(pulumi.StringPtrOutput)
}

// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `freeipa_user://<DN>`  `freeipa_group://<DN>` (list)
func (o AuthConfigFreeIpaOutput) AllowedPrincipalIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.StringArrayOutput { return v.AllowedPrincipalIds }).(pulumi.StringArrayOutput)
}

// Annotations of the resource (map)
func (o AuthConfigFreeIpaOutput) Annotations() pulumi.StringMapOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.StringMapOutput { return v.Annotations }).(pulumi.StringMapOutput)
}

// Base64 encoded CA certificate for TLS if self-signed. Use filebase64(<FILE>) for encoding file (string)
func (o AuthConfigFreeIpaOutput) Certificate() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.StringPtrOutput { return v.Certificate }).(pulumi.StringPtrOutput)
}

// FreeIpa connection timeout. Default `5000` (int)
func (o AuthConfigFreeIpaOutput) ConnectionTimeout() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.IntPtrOutput { return v.ConnectionTimeout }).(pulumi.IntPtrOutput)
}

// Enable auth config provider. Default `true` (bool)
func (o AuthConfigFreeIpaOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// Group DN attribute. Default `entryDN` (string)
func (o AuthConfigFreeIpaOutput) GroupDnAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.StringOutput { return v.GroupDnAttribute }).(pulumi.StringOutput)
}

// Group member mapping attribute. Default `member` (string)
func (o AuthConfigFreeIpaOutput) GroupMemberMappingAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.StringOutput { return v.GroupMemberMappingAttribute }).(pulumi.StringOutput)
}

// Group member user attribute. Default `entryDN` (string)
func (o AuthConfigFreeIpaOutput) GroupMemberUserAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.StringOutput { return v.GroupMemberUserAttribute }).(pulumi.StringOutput)
}

// Group name attribute. Default `cn` (string)
func (o AuthConfigFreeIpaOutput) GroupNameAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.StringOutput { return v.GroupNameAttribute }).(pulumi.StringOutput)
}

// Group object class. Default `groupOfNames` (string)
func (o AuthConfigFreeIpaOutput) GroupObjectClass() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.StringOutput { return v.GroupObjectClass }).(pulumi.StringOutput)
}

// Group search attribute. Default `cn` (string)
func (o AuthConfigFreeIpaOutput) GroupSearchAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.StringOutput { return v.GroupSearchAttribute }).(pulumi.StringOutput)
}

// Group search base (string)
func (o AuthConfigFreeIpaOutput) GroupSearchBase() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.StringOutput { return v.GroupSearchBase }).(pulumi.StringOutput)
}

func (o AuthConfigFreeIpaOutput) GroupSearchFilter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.StringPtrOutput { return v.GroupSearchFilter }).(pulumi.StringPtrOutput)
}

// Labels of the resource (map)
func (o AuthConfigFreeIpaOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// (Computed) The name of the resource (string)
func (o AuthConfigFreeIpaOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Nested group membership enable. Default `false` (bool)
func (o AuthConfigFreeIpaOutput) NestedGroupMembershipEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.BoolOutput { return v.NestedGroupMembershipEnabled }).(pulumi.BoolOutput)
}

// FreeIpa port. Default `389` (int)
func (o AuthConfigFreeIpaOutput) Port() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.IntPtrOutput { return v.Port }).(pulumi.IntPtrOutput)
}

// FreeIpa servers list (list)
func (o AuthConfigFreeIpaOutput) Servers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.StringArrayOutput { return v.Servers }).(pulumi.StringArrayOutput)
}

// Service account DN for access FreeIpa service (string)
func (o AuthConfigFreeIpaOutput) ServiceAccountDistinguishedName() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.StringOutput { return v.ServiceAccountDistinguishedName }).(pulumi.StringOutput)
}

// Service account password for access FreeIpa service (string)
func (o AuthConfigFreeIpaOutput) ServiceAccountPassword() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.StringOutput { return v.ServiceAccountPassword }).(pulumi.StringOutput)
}

func (o AuthConfigFreeIpaOutput) StartTls() pulumi.BoolOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.BoolOutput { return v.StartTls }).(pulumi.BoolOutput)
}

// Password for test access to FreeIpa service (string)
func (o AuthConfigFreeIpaOutput) TestPassword() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.StringOutput { return v.TestPassword }).(pulumi.StringOutput)
}

// Username for test access to FreeIpa service (string)
func (o AuthConfigFreeIpaOutput) TestUsername() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.StringOutput { return v.TestUsername }).(pulumi.StringOutput)
}

// Enable TLS connection (bool)
func (o AuthConfigFreeIpaOutput) Tls() pulumi.BoolOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.BoolOutput { return v.Tls }).(pulumi.BoolOutput)
}

// (Computed) The type of the resource (string)
func (o AuthConfigFreeIpaOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// User disabled bit mask (int)
func (o AuthConfigFreeIpaOutput) UserDisabledBitMask() pulumi.IntOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.IntOutput { return v.UserDisabledBitMask }).(pulumi.IntOutput)
}

// User enable attribute (string)
func (o AuthConfigFreeIpaOutput) UserEnabledAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.StringOutput { return v.UserEnabledAttribute }).(pulumi.StringOutput)
}

// User login attribute. Default `uid` (string)
func (o AuthConfigFreeIpaOutput) UserLoginAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.StringOutput { return v.UserLoginAttribute }).(pulumi.StringOutput)
}

// User member attribute. Default `memberOf` (string)
func (o AuthConfigFreeIpaOutput) UserMemberAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.StringOutput { return v.UserMemberAttribute }).(pulumi.StringOutput)
}

// User name attribute. Default `givenName` (string)
func (o AuthConfigFreeIpaOutput) UserNameAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.StringOutput { return v.UserNameAttribute }).(pulumi.StringOutput)
}

// User object class. Default `inetorgperson` (string)
func (o AuthConfigFreeIpaOutput) UserObjectClass() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.StringOutput { return v.UserObjectClass }).(pulumi.StringOutput)
}

// User search attribute. Default `uid|sn|givenName` (string)
func (o AuthConfigFreeIpaOutput) UserSearchAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.StringOutput { return v.UserSearchAttribute }).(pulumi.StringOutput)
}

// User search base DN (string)
func (o AuthConfigFreeIpaOutput) UserSearchBase() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.StringOutput { return v.UserSearchBase }).(pulumi.StringOutput)
}

func (o AuthConfigFreeIpaOutput) UserSearchFilter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthConfigFreeIpa) pulumi.StringPtrOutput { return v.UserSearchFilter }).(pulumi.StringPtrOutput)
}

type AuthConfigFreeIpaArrayOutput struct{ *pulumi.OutputState }

func (AuthConfigFreeIpaArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthConfigFreeIpa)(nil)).Elem()
}

func (o AuthConfigFreeIpaArrayOutput) ToAuthConfigFreeIpaArrayOutput() AuthConfigFreeIpaArrayOutput {
	return o
}

func (o AuthConfigFreeIpaArrayOutput) ToAuthConfigFreeIpaArrayOutputWithContext(ctx context.Context) AuthConfigFreeIpaArrayOutput {
	return o
}

func (o AuthConfigFreeIpaArrayOutput) Index(i pulumi.IntInput) AuthConfigFreeIpaOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AuthConfigFreeIpa {
		return vs[0].([]*AuthConfigFreeIpa)[vs[1].(int)]
	}).(AuthConfigFreeIpaOutput)
}

type AuthConfigFreeIpaMapOutput struct{ *pulumi.OutputState }

func (AuthConfigFreeIpaMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthConfigFreeIpa)(nil)).Elem()
}

func (o AuthConfigFreeIpaMapOutput) ToAuthConfigFreeIpaMapOutput() AuthConfigFreeIpaMapOutput {
	return o
}

func (o AuthConfigFreeIpaMapOutput) ToAuthConfigFreeIpaMapOutputWithContext(ctx context.Context) AuthConfigFreeIpaMapOutput {
	return o
}

func (o AuthConfigFreeIpaMapOutput) MapIndex(k pulumi.StringInput) AuthConfigFreeIpaOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AuthConfigFreeIpa {
		return vs[0].(map[string]*AuthConfigFreeIpa)[vs[1].(string)]
	}).(AuthConfigFreeIpaOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigFreeIpaInput)(nil)).Elem(), &AuthConfigFreeIpa{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigFreeIpaArrayInput)(nil)).Elem(), AuthConfigFreeIpaArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigFreeIpaMapInput)(nil)).Elem(), AuthConfigFreeIpaMap{})
	pulumi.RegisterOutputType(AuthConfigFreeIpaOutput{})
	pulumi.RegisterOutputType(AuthConfigFreeIpaArrayOutput{})
	pulumi.RegisterOutputType(AuthConfigFreeIpaMapOutput{})
}
