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

__all__ = ['SecretArgs', 'Secret']

@pulumi.input_type
class SecretArgs:
    def __init__(__self__, *,
                 data: pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]],
                 project_id: pulumi.Input[_builtins.str],
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 namespace_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Secret resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] data: Secret key/value data. Base64 encoding required for values (map)
        :param pulumi.Input[_builtins.str] project_id: The project id where to assign the secret (string)
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] annotations: Annotations for secret object (map)
        :param pulumi.Input[_builtins.str] description: A secret description (string)
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: Labels for secret object (map)
        :param pulumi.Input[_builtins.str] name: The name of the secret (string)
        :param pulumi.Input[_builtins.str] namespace_id: The namespace id where to assign the namespaced secret (string)
        """
        pulumi.set(__self__, "data", data)
        pulumi.set(__self__, "project_id", project_id)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if namespace_id is not None:
            pulumi.set(__self__, "namespace_id", namespace_id)

    @_builtins.property
    @pulumi.getter
    def data(self) -> pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]:
        """
        Secret key/value data. Base64 encoding required for values (map)
        """
        return pulumi.get(self, "data")

    @data.setter
    def data(self, value: pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]):
        pulumi.set(self, "data", value)

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[_builtins.str]:
        """
        The project id where to assign the secret (string)
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "project_id", value)

    @_builtins.property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Annotations for secret object (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "annotations", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A secret description (string)
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Labels for secret object (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "labels", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the secret (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The namespace id where to assign the namespaced secret (string)
        """
        return pulumi.get(self, "namespace_id")

    @namespace_id.setter
    def namespace_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "namespace_id", value)


@pulumi.input_type
class _SecretState:
    def __init__(__self__, *,
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 data: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 namespace_id: Optional[pulumi.Input[_builtins.str]] = None,
                 project_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Secret resources.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] annotations: Annotations for secret object (map)
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] data: Secret key/value data. Base64 encoding required for values (map)
        :param pulumi.Input[_builtins.str] description: A secret description (string)
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: Labels for secret object (map)
        :param pulumi.Input[_builtins.str] name: The name of the secret (string)
        :param pulumi.Input[_builtins.str] namespace_id: The namespace id where to assign the namespaced secret (string)
        :param pulumi.Input[_builtins.str] project_id: The project id where to assign the secret (string)
        """
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if data is not None:
            pulumi.set(__self__, "data", data)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if namespace_id is not None:
            pulumi.set(__self__, "namespace_id", namespace_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)

    @_builtins.property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Annotations for secret object (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "annotations", value)

    @_builtins.property
    @pulumi.getter
    def data(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Secret key/value data. Base64 encoding required for values (map)
        """
        return pulumi.get(self, "data")

    @data.setter
    def data(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "data", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A secret description (string)
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Labels for secret object (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "labels", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the secret (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The namespace id where to assign the namespaced secret (string)
        """
        return pulumi.get(self, "namespace_id")

    @namespace_id.setter
    def namespace_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "namespace_id", value)

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The project id where to assign the secret (string)
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project_id", value)


@pulumi.type_token("rancher2:index/secret:Secret")
class Secret(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 data: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 namespace_id: Optional[pulumi.Input[_builtins.str]] = None,
                 project_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a Rancher v2 Secret resource. This can be used to create secrets for Rancher v2 environments and retrieve their information.

        Depending of the availability, there are 2 types of Rancher v2 secrets:
        - Project secret: Available to all namespaces in the `project_id`
        - Namespaced secret: Available to just `namespace_id` in the `project_id`

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2
        import pulumi_std as std

        # Create a new rancher2 Project Secret
        foo = rancher2.Secret("foo",
            name="foo",
            description="Terraform secret foo",
            project_id="<project_id>",
            data={
                "address": std.base64encode(input="test.io").result,
                "username": std.base64encode(input="user2").result,
                "password": std.base64encode(input="pass").result,
            })
        ```

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2
        import pulumi_std as std

        # Create a new rancher2 Namespaced Secret
        foo = rancher2.Secret("foo",
            name="foo",
            description="Terraform secret foo",
            project_id="<project_id>",
            namespace_id="<namespace_id>",
            data={
                "address": std.base64encode(input="test.io").result,
                "username": std.base64encode(input="user2").result,
                "password": std.base64encode(input="pass").result,
            })
        ```

        ## Import

        Secrets can be imported using the secret ID in the format `<namespace_id>.<project_id>.<secret_id>`

        ```sh
        $ pulumi import rancher2:index/secret:Secret foo &lt;namespace_id&gt;.&lt;project_id&gt;.&lt;secret_id&gt;
        ```
        `<namespace_id>` is optional, just needed for namespaced secret.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] annotations: Annotations for secret object (map)
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] data: Secret key/value data. Base64 encoding required for values (map)
        :param pulumi.Input[_builtins.str] description: A secret description (string)
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: Labels for secret object (map)
        :param pulumi.Input[_builtins.str] name: The name of the secret (string)
        :param pulumi.Input[_builtins.str] namespace_id: The namespace id where to assign the namespaced secret (string)
        :param pulumi.Input[_builtins.str] project_id: The project id where to assign the secret (string)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SecretArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Rancher v2 Secret resource. This can be used to create secrets for Rancher v2 environments and retrieve their information.

        Depending of the availability, there are 2 types of Rancher v2 secrets:
        - Project secret: Available to all namespaces in the `project_id`
        - Namespaced secret: Available to just `namespace_id` in the `project_id`

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2
        import pulumi_std as std

        # Create a new rancher2 Project Secret
        foo = rancher2.Secret("foo",
            name="foo",
            description="Terraform secret foo",
            project_id="<project_id>",
            data={
                "address": std.base64encode(input="test.io").result,
                "username": std.base64encode(input="user2").result,
                "password": std.base64encode(input="pass").result,
            })
        ```

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2
        import pulumi_std as std

        # Create a new rancher2 Namespaced Secret
        foo = rancher2.Secret("foo",
            name="foo",
            description="Terraform secret foo",
            project_id="<project_id>",
            namespace_id="<namespace_id>",
            data={
                "address": std.base64encode(input="test.io").result,
                "username": std.base64encode(input="user2").result,
                "password": std.base64encode(input="pass").result,
            })
        ```

        ## Import

        Secrets can be imported using the secret ID in the format `<namespace_id>.<project_id>.<secret_id>`

        ```sh
        $ pulumi import rancher2:index/secret:Secret foo &lt;namespace_id&gt;.&lt;project_id&gt;.&lt;secret_id&gt;
        ```
        `<namespace_id>` is optional, just needed for namespaced secret.

        :param str resource_name: The name of the resource.
        :param SecretArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SecretArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 data: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 namespace_id: Optional[pulumi.Input[_builtins.str]] = None,
                 project_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SecretArgs.__new__(SecretArgs)

            __props__.__dict__["annotations"] = annotations
            if data is None and not opts.urn:
                raise TypeError("Missing required property 'data'")
            __props__.__dict__["data"] = None if data is None else pulumi.Output.secret(data)
            __props__.__dict__["description"] = description
            __props__.__dict__["labels"] = labels
            __props__.__dict__["name"] = name
            __props__.__dict__["namespace_id"] = namespace_id
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["data"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Secret, __self__).__init__(
            'rancher2:index/secret:Secret',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            data: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            namespace_id: Optional[pulumi.Input[_builtins.str]] = None,
            project_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'Secret':
        """
        Get an existing Secret resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] annotations: Annotations for secret object (map)
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] data: Secret key/value data. Base64 encoding required for values (map)
        :param pulumi.Input[_builtins.str] description: A secret description (string)
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: Labels for secret object (map)
        :param pulumi.Input[_builtins.str] name: The name of the secret (string)
        :param pulumi.Input[_builtins.str] namespace_id: The namespace id where to assign the namespaced secret (string)
        :param pulumi.Input[_builtins.str] project_id: The project id where to assign the secret (string)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SecretState.__new__(_SecretState)

        __props__.__dict__["annotations"] = annotations
        __props__.__dict__["data"] = data
        __props__.__dict__["description"] = description
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        __props__.__dict__["namespace_id"] = namespace_id
        __props__.__dict__["project_id"] = project_id
        return Secret(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, _builtins.str]]:
        """
        Annotations for secret object (map)
        """
        return pulumi.get(self, "annotations")

    @_builtins.property
    @pulumi.getter
    def data(self) -> pulumi.Output[Mapping[str, _builtins.str]]:
        """
        Secret key/value data. Base64 encoding required for values (map)
        """
        return pulumi.get(self, "data")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        A secret description (string)
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, _builtins.str]]:
        """
        Labels for secret object (map)
        """
        return pulumi.get(self, "labels")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the secret (string)
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The namespace id where to assign the namespaced secret (string)
        """
        return pulumi.get(self, "namespace_id")

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[_builtins.str]:
        """
        The project id where to assign the secret (string)
        """
        return pulumi.get(self, "project_id")

