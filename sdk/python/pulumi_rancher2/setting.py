# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
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

__all__ = ['SettingArgs', 'Setting']

@pulumi.input_type
class SettingArgs:
    def __init__(__self__, *,
                 value: pulumi.Input[_builtins.str],
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Setting resource.
        :param pulumi.Input[_builtins.str] value: The value of the setting (string)
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] annotations: Annotations for setting object (map)
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: Labels for setting object (map)
        :param pulumi.Input[_builtins.str] name: The name of the setting (string)
        """
        pulumi.set(__self__, "value", value)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter
    def value(self) -> pulumi.Input[_builtins.str]:
        """
        The value of the setting (string)
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "value", value)

    @_builtins.property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Annotations for setting object (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "annotations", value)

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Labels for setting object (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "labels", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the setting (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _SettingState:
    def __init__(__self__, *,
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 value: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Setting resources.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] annotations: Annotations for setting object (map)
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: Labels for setting object (map)
        :param pulumi.Input[_builtins.str] name: The name of the setting (string)
        :param pulumi.Input[_builtins.str] value: The value of the setting (string)
        """
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @_builtins.property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Annotations for setting object (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "annotations", value)

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Labels for setting object (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "labels", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the setting (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The value of the setting (string)
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "value", value)


@pulumi.type_token("rancher2:index/setting:Setting")
class Setting(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 value: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a Rancher v2 Setting resource. This can be used to create settings for Rancher v2 environments and retrieve their information.

        On create, if setting already exists, provider will import it and update its value.

        On destroy, if setting is a system setting like `server-url`, provider'll not delete it from Rancher, it'll just update setting value to default and remove it from tfstate.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Setting
        foo = rancher2.Setting("foo",
            name="foo",
            value="<VALUE>")
        ```

        ## Import

        Setting can be imported using the Rancher setting ID.

        ```sh
        $ pulumi import rancher2:index/setting:Setting foo &lt;setting_id&gt;
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] annotations: Annotations for setting object (map)
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: Labels for setting object (map)
        :param pulumi.Input[_builtins.str] name: The name of the setting (string)
        :param pulumi.Input[_builtins.str] value: The value of the setting (string)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SettingArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Rancher v2 Setting resource. This can be used to create settings for Rancher v2 environments and retrieve their information.

        On create, if setting already exists, provider will import it and update its value.

        On destroy, if setting is a system setting like `server-url`, provider'll not delete it from Rancher, it'll just update setting value to default and remove it from tfstate.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Setting
        foo = rancher2.Setting("foo",
            name="foo",
            value="<VALUE>")
        ```

        ## Import

        Setting can be imported using the Rancher setting ID.

        ```sh
        $ pulumi import rancher2:index/setting:Setting foo &lt;setting_id&gt;
        ```

        :param str resource_name: The name of the resource.
        :param SettingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SettingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 value: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SettingArgs.__new__(SettingArgs)

            __props__.__dict__["annotations"] = annotations
            __props__.__dict__["labels"] = labels
            __props__.__dict__["name"] = name
            if value is None and not opts.urn:
                raise TypeError("Missing required property 'value'")
            __props__.__dict__["value"] = value
        super(Setting, __self__).__init__(
            'rancher2:index/setting:Setting',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            value: Optional[pulumi.Input[_builtins.str]] = None) -> 'Setting':
        """
        Get an existing Setting resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] annotations: Annotations for setting object (map)
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: Labels for setting object (map)
        :param pulumi.Input[_builtins.str] name: The name of the setting (string)
        :param pulumi.Input[_builtins.str] value: The value of the setting (string)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SettingState.__new__(_SettingState)

        __props__.__dict__["annotations"] = annotations
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        __props__.__dict__["value"] = value
        return Setting(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, _builtins.str]]:
        """
        Annotations for setting object (map)
        """
        return pulumi.get(self, "annotations")

    @_builtins.property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, _builtins.str]]:
        """
        Labels for setting object (map)
        """
        return pulumi.get(self, "labels")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the setting (string)
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def value(self) -> pulumi.Output[_builtins.str]:
        """
        The value of the setting (string)
        """
        return pulumi.get(self, "value")

