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
from . import outputs

__all__ = [
    'GetGlobalRoleResult',
    'AwaitableGetGlobalRoleResult',
    'get_global_role',
    'get_global_role_output',
]

@pulumi.output_type
class GetGlobalRoleResult:
    """
    A collection of values returned by getGlobalRole.
    """
    def __init__(__self__, annotations=None, builtin=None, description=None, id=None, inherited_cluster_roles=None, labels=None, name=None, new_user_default=None, rules=None, uuid=None):
        if annotations and not isinstance(annotations, dict):
            raise TypeError("Expected argument 'annotations' to be a dict")
        pulumi.set(__self__, "annotations", annotations)
        if builtin and not isinstance(builtin, bool):
            raise TypeError("Expected argument 'builtin' to be a bool")
        pulumi.set(__self__, "builtin", builtin)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if inherited_cluster_roles and not isinstance(inherited_cluster_roles, list):
            raise TypeError("Expected argument 'inherited_cluster_roles' to be a list")
        pulumi.set(__self__, "inherited_cluster_roles", inherited_cluster_roles)
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        pulumi.set(__self__, "labels", labels)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if new_user_default and not isinstance(new_user_default, bool):
            raise TypeError("Expected argument 'new_user_default' to be a bool")
        pulumi.set(__self__, "new_user_default", new_user_default)
        if rules and not isinstance(rules, list):
            raise TypeError("Expected argument 'rules' to be a list")
        pulumi.set(__self__, "rules", rules)
        if uuid and not isinstance(uuid, str):
            raise TypeError("Expected argument 'uuid' to be a str")
        pulumi.set(__self__, "uuid", uuid)

    @_builtins.property
    @pulumi.getter
    def annotations(self) -> Mapping[str, _builtins.str]:
        """
        (Computed) Annotations for global role object (map)
        """
        return pulumi.get(self, "annotations")

    @_builtins.property
    @pulumi.getter
    def builtin(self) -> _builtins.bool:
        """
        (Computed) Builtin global role (bool)
        """
        return pulumi.get(self, "builtin")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        (Computed) Global role description (string)
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="inheritedClusterRoles")
    def inherited_cluster_roles(self) -> Optional[Sequence[_builtins.str]]:
        """
        (Optional) Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster (list)
        """
        return pulumi.get(self, "inherited_cluster_roles")

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Mapping[str, _builtins.str]:
        """
        (Computed) Labels for global role object (map)
        """
        return pulumi.get(self, "labels")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="newUserDefault")
    def new_user_default(self) -> _builtins.bool:
        """
        (Computed) Whether or not this role should be added to new users (bool)
        """
        return pulumi.get(self, "new_user_default")

    @_builtins.property
    @pulumi.getter
    def rules(self) -> Sequence['outputs.GetGlobalRoleRuleResult']:
        """
        (Computed) Global role policy rules (list)
        """
        return pulumi.get(self, "rules")

    @_builtins.property
    @pulumi.getter
    def uuid(self) -> _builtins.str:
        """
        (Computed) Global role uuid (string)
        """
        return pulumi.get(self, "uuid")


class AwaitableGetGlobalRoleResult(GetGlobalRoleResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGlobalRoleResult(
            annotations=self.annotations,
            builtin=self.builtin,
            description=self.description,
            id=self.id,
            inherited_cluster_roles=self.inherited_cluster_roles,
            labels=self.labels,
            name=self.name,
            new_user_default=self.new_user_default,
            rules=self.rules,
            uuid=self.uuid)


def get_global_role(inherited_cluster_roles: Optional[Sequence[_builtins.str]] = None,
                    name: Optional[_builtins.str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGlobalRoleResult:
    """
    Use this data source to retrieve information about a Rancher v2 global role resource.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_rancher2 as rancher2

    foo = rancher2.get_global_role(name="foo")
    ```


    :param Sequence[_builtins.str] inherited_cluster_roles: (Optional) Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster (list)
    :param _builtins.str name: The name of the Global Role (string)
    """
    __args__ = dict()
    __args__['inheritedClusterRoles'] = inherited_cluster_roles
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('rancher2:index/getGlobalRole:getGlobalRole', __args__, opts=opts, typ=GetGlobalRoleResult).value

    return AwaitableGetGlobalRoleResult(
        annotations=pulumi.get(__ret__, 'annotations'),
        builtin=pulumi.get(__ret__, 'builtin'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        inherited_cluster_roles=pulumi.get(__ret__, 'inherited_cluster_roles'),
        labels=pulumi.get(__ret__, 'labels'),
        name=pulumi.get(__ret__, 'name'),
        new_user_default=pulumi.get(__ret__, 'new_user_default'),
        rules=pulumi.get(__ret__, 'rules'),
        uuid=pulumi.get(__ret__, 'uuid'))
def get_global_role_output(inherited_cluster_roles: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                           name: Optional[pulumi.Input[_builtins.str]] = None,
                           opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetGlobalRoleResult]:
    """
    Use this data source to retrieve information about a Rancher v2 global role resource.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_rancher2 as rancher2

    foo = rancher2.get_global_role(name="foo")
    ```


    :param Sequence[_builtins.str] inherited_cluster_roles: (Optional) Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster (list)
    :param _builtins.str name: The name of the Global Role (string)
    """
    __args__ = dict()
    __args__['inheritedClusterRoles'] = inherited_cluster_roles
    __args__['name'] = name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('rancher2:index/getGlobalRole:getGlobalRole', __args__, opts=opts, typ=GetGlobalRoleResult)
    return __ret__.apply(lambda __response__: GetGlobalRoleResult(
        annotations=pulumi.get(__response__, 'annotations'),
        builtin=pulumi.get(__response__, 'builtin'),
        description=pulumi.get(__response__, 'description'),
        id=pulumi.get(__response__, 'id'),
        inherited_cluster_roles=pulumi.get(__response__, 'inherited_cluster_roles'),
        labels=pulumi.get(__response__, 'labels'),
        name=pulumi.get(__response__, 'name'),
        new_user_default=pulumi.get(__response__, 'new_user_default'),
        rules=pulumi.get(__response__, 'rules'),
        uuid=pulumi.get(__response__, 'uuid')))
