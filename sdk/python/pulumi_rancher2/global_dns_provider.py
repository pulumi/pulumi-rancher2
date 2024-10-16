# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['GlobalDnsProviderArgs', 'GlobalDnsProvider']

@pulumi.input_type
class GlobalDnsProviderArgs:
    def __init__(__self__, *,
                 root_domain: pulumi.Input[str],
                 alidns_config: Optional[pulumi.Input['GlobalDnsProviderAlidnsConfigArgs']] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 cloudflare_config: Optional[pulumi.Input['GlobalDnsProviderCloudflareConfigArgs']] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 route53_config: Optional[pulumi.Input['GlobalDnsProviderRoute53ConfigArgs']] = None):
        """
        The set of arguments for constructing a GlobalDnsProvider resource.
        :param pulumi.Input[str] root_domain: The user ID to assign Global DNS Provider (string)
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] annotations: Annotations for Global DNS Provider (map)
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Labels for Global DNS Provider (map)
        :param pulumi.Input[str] name: The name of the Global DNS Provider (string)
        """
        pulumi.set(__self__, "root_domain", root_domain)
        if alidns_config is not None:
            pulumi.set(__self__, "alidns_config", alidns_config)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if cloudflare_config is not None:
            pulumi.set(__self__, "cloudflare_config", cloudflare_config)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if route53_config is not None:
            pulumi.set(__self__, "route53_config", route53_config)

    @property
    @pulumi.getter(name="rootDomain")
    def root_domain(self) -> pulumi.Input[str]:
        """
        The user ID to assign Global DNS Provider (string)
        """
        return pulumi.get(self, "root_domain")

    @root_domain.setter
    def root_domain(self, value: pulumi.Input[str]):
        pulumi.set(self, "root_domain", value)

    @property
    @pulumi.getter(name="alidnsConfig")
    def alidns_config(self) -> Optional[pulumi.Input['GlobalDnsProviderAlidnsConfigArgs']]:
        return pulumi.get(self, "alidns_config")

    @alidns_config.setter
    def alidns_config(self, value: Optional[pulumi.Input['GlobalDnsProviderAlidnsConfigArgs']]):
        pulumi.set(self, "alidns_config", value)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Annotations for Global DNS Provider (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter(name="cloudflareConfig")
    def cloudflare_config(self) -> Optional[pulumi.Input['GlobalDnsProviderCloudflareConfigArgs']]:
        return pulumi.get(self, "cloudflare_config")

    @cloudflare_config.setter
    def cloudflare_config(self, value: Optional[pulumi.Input['GlobalDnsProviderCloudflareConfigArgs']]):
        pulumi.set(self, "cloudflare_config", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Labels for Global DNS Provider (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Global DNS Provider (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="route53Config")
    def route53_config(self) -> Optional[pulumi.Input['GlobalDnsProviderRoute53ConfigArgs']]:
        return pulumi.get(self, "route53_config")

    @route53_config.setter
    def route53_config(self, value: Optional[pulumi.Input['GlobalDnsProviderRoute53ConfigArgs']]):
        pulumi.set(self, "route53_config", value)


@pulumi.input_type
class _GlobalDnsProviderState:
    def __init__(__self__, *,
                 alidns_config: Optional[pulumi.Input['GlobalDnsProviderAlidnsConfigArgs']] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 cloudflare_config: Optional[pulumi.Input['GlobalDnsProviderCloudflareConfigArgs']] = None,
                 dns_provider: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 root_domain: Optional[pulumi.Input[str]] = None,
                 route53_config: Optional[pulumi.Input['GlobalDnsProviderRoute53ConfigArgs']] = None):
        """
        Input properties used for looking up and filtering GlobalDnsProvider resources.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] annotations: Annotations for Global DNS Provider (map)
        :param pulumi.Input[str] dns_provider: (Computed) The Global DNS Provider `alidns, cloudflare, route53` (string)
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Labels for Global DNS Provider (map)
        :param pulumi.Input[str] name: The name of the Global DNS Provider (string)
        :param pulumi.Input[str] root_domain: The user ID to assign Global DNS Provider (string)
        """
        if alidns_config is not None:
            pulumi.set(__self__, "alidns_config", alidns_config)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if cloudflare_config is not None:
            pulumi.set(__self__, "cloudflare_config", cloudflare_config)
        if dns_provider is not None:
            pulumi.set(__self__, "dns_provider", dns_provider)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if root_domain is not None:
            pulumi.set(__self__, "root_domain", root_domain)
        if route53_config is not None:
            pulumi.set(__self__, "route53_config", route53_config)

    @property
    @pulumi.getter(name="alidnsConfig")
    def alidns_config(self) -> Optional[pulumi.Input['GlobalDnsProviderAlidnsConfigArgs']]:
        return pulumi.get(self, "alidns_config")

    @alidns_config.setter
    def alidns_config(self, value: Optional[pulumi.Input['GlobalDnsProviderAlidnsConfigArgs']]):
        pulumi.set(self, "alidns_config", value)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Annotations for Global DNS Provider (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter(name="cloudflareConfig")
    def cloudflare_config(self) -> Optional[pulumi.Input['GlobalDnsProviderCloudflareConfigArgs']]:
        return pulumi.get(self, "cloudflare_config")

    @cloudflare_config.setter
    def cloudflare_config(self, value: Optional[pulumi.Input['GlobalDnsProviderCloudflareConfigArgs']]):
        pulumi.set(self, "cloudflare_config", value)

    @property
    @pulumi.getter(name="dnsProvider")
    def dns_provider(self) -> Optional[pulumi.Input[str]]:
        """
        (Computed) The Global DNS Provider `alidns, cloudflare, route53` (string)
        """
        return pulumi.get(self, "dns_provider")

    @dns_provider.setter
    def dns_provider(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dns_provider", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Labels for Global DNS Provider (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Global DNS Provider (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="rootDomain")
    def root_domain(self) -> Optional[pulumi.Input[str]]:
        """
        The user ID to assign Global DNS Provider (string)
        """
        return pulumi.get(self, "root_domain")

    @root_domain.setter
    def root_domain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "root_domain", value)

    @property
    @pulumi.getter(name="route53Config")
    def route53_config(self) -> Optional[pulumi.Input['GlobalDnsProviderRoute53ConfigArgs']]:
        return pulumi.get(self, "route53_config")

    @route53_config.setter
    def route53_config(self, value: Optional[pulumi.Input['GlobalDnsProviderRoute53ConfigArgs']]):
        pulumi.set(self, "route53_config", value)


class GlobalDnsProvider(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alidns_config: Optional[pulumi.Input[Union['GlobalDnsProviderAlidnsConfigArgs', 'GlobalDnsProviderAlidnsConfigArgsDict']]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 cloudflare_config: Optional[pulumi.Input[Union['GlobalDnsProviderCloudflareConfigArgs', 'GlobalDnsProviderCloudflareConfigArgsDict']]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 root_domain: Optional[pulumi.Input[str]] = None,
                 route53_config: Optional[pulumi.Input[Union['GlobalDnsProviderRoute53ConfigArgs', 'GlobalDnsProviderRoute53ConfigArgsDict']]] = None,
                 __props__=None):
        """
        Provides a Rancher V2 Global DNS Provider resource. This can be used to create Global DNS Providers for Rancher V2. Supported Global DNS Providers: `alidns, cloudflare, route53`

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Global DNS Provider - alidns
        foo = rancher2.GlobalDnsProvider("foo",
            name="foo",
            root_domain="example.com",
            alidns_config={
                "access_key": "YYYYYYYYYYYYYYYYYYYY",
                "secret_key": "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
            })
        ```

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Global DNS Provider - cloudflare
        foo = rancher2.GlobalDnsProvider("foo",
            name="foo",
            root_domain="example.com",
            cloudflare_config={
                "api_email": "test@test.local",
                "api_key": "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
                "proxy_setting": True,
            })
        ```

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Global DNS Provider - route53
        foo = rancher2.GlobalDnsProvider("foo",
            name="foo",
            root_domain="example.com",
            route53_config={
                "access_key": "YYYYYYYYYYYYYYYYYYYY",
                "secret_key": "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
                "zone_type": "private",
                "region": "us-east-1",
            })
        ```

        ## Import

        Global DNS Providers can be imported using the Rancher Global DNS Provider ID

        ```sh
        $ pulumi import rancher2:index/globalDnsProvider:GlobalDnsProvider foo <global_dns_provider_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] annotations: Annotations for Global DNS Provider (map)
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Labels for Global DNS Provider (map)
        :param pulumi.Input[str] name: The name of the Global DNS Provider (string)
        :param pulumi.Input[str] root_domain: The user ID to assign Global DNS Provider (string)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GlobalDnsProviderArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Rancher V2 Global DNS Provider resource. This can be used to create Global DNS Providers for Rancher V2. Supported Global DNS Providers: `alidns, cloudflare, route53`

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Global DNS Provider - alidns
        foo = rancher2.GlobalDnsProvider("foo",
            name="foo",
            root_domain="example.com",
            alidns_config={
                "access_key": "YYYYYYYYYYYYYYYYYYYY",
                "secret_key": "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
            })
        ```

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Global DNS Provider - cloudflare
        foo = rancher2.GlobalDnsProvider("foo",
            name="foo",
            root_domain="example.com",
            cloudflare_config={
                "api_email": "test@test.local",
                "api_key": "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
                "proxy_setting": True,
            })
        ```

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Global DNS Provider - route53
        foo = rancher2.GlobalDnsProvider("foo",
            name="foo",
            root_domain="example.com",
            route53_config={
                "access_key": "YYYYYYYYYYYYYYYYYYYY",
                "secret_key": "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
                "zone_type": "private",
                "region": "us-east-1",
            })
        ```

        ## Import

        Global DNS Providers can be imported using the Rancher Global DNS Provider ID

        ```sh
        $ pulumi import rancher2:index/globalDnsProvider:GlobalDnsProvider foo <global_dns_provider_id>
        ```

        :param str resource_name: The name of the resource.
        :param GlobalDnsProviderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GlobalDnsProviderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alidns_config: Optional[pulumi.Input[Union['GlobalDnsProviderAlidnsConfigArgs', 'GlobalDnsProviderAlidnsConfigArgsDict']]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 cloudflare_config: Optional[pulumi.Input[Union['GlobalDnsProviderCloudflareConfigArgs', 'GlobalDnsProviderCloudflareConfigArgsDict']]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 root_domain: Optional[pulumi.Input[str]] = None,
                 route53_config: Optional[pulumi.Input[Union['GlobalDnsProviderRoute53ConfigArgs', 'GlobalDnsProviderRoute53ConfigArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GlobalDnsProviderArgs.__new__(GlobalDnsProviderArgs)

            __props__.__dict__["alidns_config"] = alidns_config
            __props__.__dict__["annotations"] = annotations
            __props__.__dict__["cloudflare_config"] = cloudflare_config
            __props__.__dict__["labels"] = labels
            __props__.__dict__["name"] = name
            if root_domain is None and not opts.urn:
                raise TypeError("Missing required property 'root_domain'")
            __props__.__dict__["root_domain"] = root_domain
            __props__.__dict__["route53_config"] = route53_config
            __props__.__dict__["dns_provider"] = None
        super(GlobalDnsProvider, __self__).__init__(
            'rancher2:index/globalDnsProvider:GlobalDnsProvider',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            alidns_config: Optional[pulumi.Input[Union['GlobalDnsProviderAlidnsConfigArgs', 'GlobalDnsProviderAlidnsConfigArgsDict']]] = None,
            annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            cloudflare_config: Optional[pulumi.Input[Union['GlobalDnsProviderCloudflareConfigArgs', 'GlobalDnsProviderCloudflareConfigArgsDict']]] = None,
            dns_provider: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            root_domain: Optional[pulumi.Input[str]] = None,
            route53_config: Optional[pulumi.Input[Union['GlobalDnsProviderRoute53ConfigArgs', 'GlobalDnsProviderRoute53ConfigArgsDict']]] = None) -> 'GlobalDnsProvider':
        """
        Get an existing GlobalDnsProvider resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] annotations: Annotations for Global DNS Provider (map)
        :param pulumi.Input[str] dns_provider: (Computed) The Global DNS Provider `alidns, cloudflare, route53` (string)
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Labels for Global DNS Provider (map)
        :param pulumi.Input[str] name: The name of the Global DNS Provider (string)
        :param pulumi.Input[str] root_domain: The user ID to assign Global DNS Provider (string)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GlobalDnsProviderState.__new__(_GlobalDnsProviderState)

        __props__.__dict__["alidns_config"] = alidns_config
        __props__.__dict__["annotations"] = annotations
        __props__.__dict__["cloudflare_config"] = cloudflare_config
        __props__.__dict__["dns_provider"] = dns_provider
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        __props__.__dict__["root_domain"] = root_domain
        __props__.__dict__["route53_config"] = route53_config
        return GlobalDnsProvider(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="alidnsConfig")
    def alidns_config(self) -> pulumi.Output[Optional['outputs.GlobalDnsProviderAlidnsConfig']]:
        return pulumi.get(self, "alidns_config")

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Annotations for Global DNS Provider (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="cloudflareConfig")
    def cloudflare_config(self) -> pulumi.Output[Optional['outputs.GlobalDnsProviderCloudflareConfig']]:
        return pulumi.get(self, "cloudflare_config")

    @property
    @pulumi.getter(name="dnsProvider")
    def dns_provider(self) -> pulumi.Output[str]:
        """
        (Computed) The Global DNS Provider `alidns, cloudflare, route53` (string)
        """
        return pulumi.get(self, "dns_provider")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Labels for Global DNS Provider (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the Global DNS Provider (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="rootDomain")
    def root_domain(self) -> pulumi.Output[str]:
        """
        The user ID to assign Global DNS Provider (string)
        """
        return pulumi.get(self, "root_domain")

    @property
    @pulumi.getter(name="route53Config")
    def route53_config(self) -> pulumi.Output[Optional['outputs.GlobalDnsProviderRoute53Config']]:
        return pulumi.get(self, "route53_config")

