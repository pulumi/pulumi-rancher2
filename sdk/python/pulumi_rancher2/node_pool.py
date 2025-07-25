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
from ._inputs import *

__all__ = ['NodePoolArgs', 'NodePool']

@pulumi.input_type
class NodePoolArgs:
    def __init__(__self__, *,
                 cluster_id: pulumi.Input[_builtins.str],
                 hostname_prefix: pulumi.Input[_builtins.str],
                 node_template_id: pulumi.Input[_builtins.str],
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 control_plane: Optional[pulumi.Input[_builtins.bool]] = None,
                 delete_not_ready_after_secs: Optional[pulumi.Input[_builtins.int]] = None,
                 drain_before_delete: Optional[pulumi.Input[_builtins.bool]] = None,
                 etcd: Optional[pulumi.Input[_builtins.bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 node_taints: Optional[pulumi.Input[Sequence[pulumi.Input['NodePoolNodeTaintArgs']]]] = None,
                 quantity: Optional[pulumi.Input[_builtins.int]] = None,
                 worker: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        The set of arguments for constructing a NodePool resource.
        :param pulumi.Input[_builtins.str] cluster_id: The RKE cluster id to use Node Pool (string)
        :param pulumi.Input[_builtins.str] hostname_prefix: The prefix for created nodes of the Node Pool (string)
        :param pulumi.Input[_builtins.str] node_template_id: The Node Template ID to use for node creation (string)
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] annotations: Annotations for Node Pool object (map)
        :param pulumi.Input[_builtins.bool] control_plane: RKE control plane role for created nodes (bool)
        :param pulumi.Input[_builtins.int] delete_not_ready_after_secs: Delete not ready node after secs. For Rancher v2.3.3 and above. Default `0` (int)
        :param pulumi.Input[_builtins.bool] drain_before_delete: Drain nodes before delete. Default: `false` (bool)
        :param pulumi.Input[_builtins.bool] etcd: RKE etcd role for created nodes (bool)
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: Labels for Node Pool object (map)
        :param pulumi.Input[_builtins.str] name: The name of the Node Pool (string)
        :param pulumi.Input[Sequence[pulumi.Input['NodePoolNodeTaintArgs']]] node_taints: Node taints. For Rancher v2.3.3 and above (List)
        :param pulumi.Input[_builtins.int] quantity: The number of nodes to create on Node Pool. Default `1`. Only values >= 1 allowed (int)
        :param pulumi.Input[_builtins.bool] worker: RKE role role for created nodes (bool)
        """
        pulumi.set(__self__, "cluster_id", cluster_id)
        pulumi.set(__self__, "hostname_prefix", hostname_prefix)
        pulumi.set(__self__, "node_template_id", node_template_id)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if control_plane is not None:
            pulumi.set(__self__, "control_plane", control_plane)
        if delete_not_ready_after_secs is not None:
            pulumi.set(__self__, "delete_not_ready_after_secs", delete_not_ready_after_secs)
        if drain_before_delete is not None:
            pulumi.set(__self__, "drain_before_delete", drain_before_delete)
        if etcd is not None:
            pulumi.set(__self__, "etcd", etcd)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if node_taints is not None:
            pulumi.set(__self__, "node_taints", node_taints)
        if quantity is not None:
            pulumi.set(__self__, "quantity", quantity)
        if worker is not None:
            pulumi.set(__self__, "worker", worker)

    @_builtins.property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Input[_builtins.str]:
        """
        The RKE cluster id to use Node Pool (string)
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "cluster_id", value)

    @_builtins.property
    @pulumi.getter(name="hostnamePrefix")
    def hostname_prefix(self) -> pulumi.Input[_builtins.str]:
        """
        The prefix for created nodes of the Node Pool (string)
        """
        return pulumi.get(self, "hostname_prefix")

    @hostname_prefix.setter
    def hostname_prefix(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "hostname_prefix", value)

    @_builtins.property
    @pulumi.getter(name="nodeTemplateId")
    def node_template_id(self) -> pulumi.Input[_builtins.str]:
        """
        The Node Template ID to use for node creation (string)
        """
        return pulumi.get(self, "node_template_id")

    @node_template_id.setter
    def node_template_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "node_template_id", value)

    @_builtins.property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Annotations for Node Pool object (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "annotations", value)

    @_builtins.property
    @pulumi.getter(name="controlPlane")
    def control_plane(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        RKE control plane role for created nodes (bool)
        """
        return pulumi.get(self, "control_plane")

    @control_plane.setter
    def control_plane(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "control_plane", value)

    @_builtins.property
    @pulumi.getter(name="deleteNotReadyAfterSecs")
    def delete_not_ready_after_secs(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Delete not ready node after secs. For Rancher v2.3.3 and above. Default `0` (int)
        """
        return pulumi.get(self, "delete_not_ready_after_secs")

    @delete_not_ready_after_secs.setter
    def delete_not_ready_after_secs(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "delete_not_ready_after_secs", value)

    @_builtins.property
    @pulumi.getter(name="drainBeforeDelete")
    def drain_before_delete(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Drain nodes before delete. Default: `false` (bool)
        """
        return pulumi.get(self, "drain_before_delete")

    @drain_before_delete.setter
    def drain_before_delete(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "drain_before_delete", value)

    @_builtins.property
    @pulumi.getter
    def etcd(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        RKE etcd role for created nodes (bool)
        """
        return pulumi.get(self, "etcd")

    @etcd.setter
    def etcd(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "etcd", value)

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Labels for Node Pool object (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "labels", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Node Pool (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="nodeTaints")
    def node_taints(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NodePoolNodeTaintArgs']]]]:
        """
        Node taints. For Rancher v2.3.3 and above (List)
        """
        return pulumi.get(self, "node_taints")

    @node_taints.setter
    def node_taints(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NodePoolNodeTaintArgs']]]]):
        pulumi.set(self, "node_taints", value)

    @_builtins.property
    @pulumi.getter
    def quantity(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The number of nodes to create on Node Pool. Default `1`. Only values >= 1 allowed (int)
        """
        return pulumi.get(self, "quantity")

    @quantity.setter
    def quantity(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "quantity", value)

    @_builtins.property
    @pulumi.getter
    def worker(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        RKE role role for created nodes (bool)
        """
        return pulumi.get(self, "worker")

    @worker.setter
    def worker(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "worker", value)


@pulumi.input_type
class _NodePoolState:
    def __init__(__self__, *,
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 cluster_id: Optional[pulumi.Input[_builtins.str]] = None,
                 control_plane: Optional[pulumi.Input[_builtins.bool]] = None,
                 delete_not_ready_after_secs: Optional[pulumi.Input[_builtins.int]] = None,
                 drain_before_delete: Optional[pulumi.Input[_builtins.bool]] = None,
                 etcd: Optional[pulumi.Input[_builtins.bool]] = None,
                 hostname_prefix: Optional[pulumi.Input[_builtins.str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 node_taints: Optional[pulumi.Input[Sequence[pulumi.Input['NodePoolNodeTaintArgs']]]] = None,
                 node_template_id: Optional[pulumi.Input[_builtins.str]] = None,
                 quantity: Optional[pulumi.Input[_builtins.int]] = None,
                 worker: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        Input properties used for looking up and filtering NodePool resources.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] annotations: Annotations for Node Pool object (map)
        :param pulumi.Input[_builtins.str] cluster_id: The RKE cluster id to use Node Pool (string)
        :param pulumi.Input[_builtins.bool] control_plane: RKE control plane role for created nodes (bool)
        :param pulumi.Input[_builtins.int] delete_not_ready_after_secs: Delete not ready node after secs. For Rancher v2.3.3 and above. Default `0` (int)
        :param pulumi.Input[_builtins.bool] drain_before_delete: Drain nodes before delete. Default: `false` (bool)
        :param pulumi.Input[_builtins.bool] etcd: RKE etcd role for created nodes (bool)
        :param pulumi.Input[_builtins.str] hostname_prefix: The prefix for created nodes of the Node Pool (string)
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: Labels for Node Pool object (map)
        :param pulumi.Input[_builtins.str] name: The name of the Node Pool (string)
        :param pulumi.Input[Sequence[pulumi.Input['NodePoolNodeTaintArgs']]] node_taints: Node taints. For Rancher v2.3.3 and above (List)
        :param pulumi.Input[_builtins.str] node_template_id: The Node Template ID to use for node creation (string)
        :param pulumi.Input[_builtins.int] quantity: The number of nodes to create on Node Pool. Default `1`. Only values >= 1 allowed (int)
        :param pulumi.Input[_builtins.bool] worker: RKE role role for created nodes (bool)
        """
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if cluster_id is not None:
            pulumi.set(__self__, "cluster_id", cluster_id)
        if control_plane is not None:
            pulumi.set(__self__, "control_plane", control_plane)
        if delete_not_ready_after_secs is not None:
            pulumi.set(__self__, "delete_not_ready_after_secs", delete_not_ready_after_secs)
        if drain_before_delete is not None:
            pulumi.set(__self__, "drain_before_delete", drain_before_delete)
        if etcd is not None:
            pulumi.set(__self__, "etcd", etcd)
        if hostname_prefix is not None:
            pulumi.set(__self__, "hostname_prefix", hostname_prefix)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if node_taints is not None:
            pulumi.set(__self__, "node_taints", node_taints)
        if node_template_id is not None:
            pulumi.set(__self__, "node_template_id", node_template_id)
        if quantity is not None:
            pulumi.set(__self__, "quantity", quantity)
        if worker is not None:
            pulumi.set(__self__, "worker", worker)

    @_builtins.property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Annotations for Node Pool object (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "annotations", value)

    @_builtins.property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The RKE cluster id to use Node Pool (string)
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "cluster_id", value)

    @_builtins.property
    @pulumi.getter(name="controlPlane")
    def control_plane(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        RKE control plane role for created nodes (bool)
        """
        return pulumi.get(self, "control_plane")

    @control_plane.setter
    def control_plane(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "control_plane", value)

    @_builtins.property
    @pulumi.getter(name="deleteNotReadyAfterSecs")
    def delete_not_ready_after_secs(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Delete not ready node after secs. For Rancher v2.3.3 and above. Default `0` (int)
        """
        return pulumi.get(self, "delete_not_ready_after_secs")

    @delete_not_ready_after_secs.setter
    def delete_not_ready_after_secs(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "delete_not_ready_after_secs", value)

    @_builtins.property
    @pulumi.getter(name="drainBeforeDelete")
    def drain_before_delete(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Drain nodes before delete. Default: `false` (bool)
        """
        return pulumi.get(self, "drain_before_delete")

    @drain_before_delete.setter
    def drain_before_delete(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "drain_before_delete", value)

    @_builtins.property
    @pulumi.getter
    def etcd(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        RKE etcd role for created nodes (bool)
        """
        return pulumi.get(self, "etcd")

    @etcd.setter
    def etcd(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "etcd", value)

    @_builtins.property
    @pulumi.getter(name="hostnamePrefix")
    def hostname_prefix(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The prefix for created nodes of the Node Pool (string)
        """
        return pulumi.get(self, "hostname_prefix")

    @hostname_prefix.setter
    def hostname_prefix(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "hostname_prefix", value)

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Labels for Node Pool object (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "labels", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Node Pool (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="nodeTaints")
    def node_taints(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NodePoolNodeTaintArgs']]]]:
        """
        Node taints. For Rancher v2.3.3 and above (List)
        """
        return pulumi.get(self, "node_taints")

    @node_taints.setter
    def node_taints(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NodePoolNodeTaintArgs']]]]):
        pulumi.set(self, "node_taints", value)

    @_builtins.property
    @pulumi.getter(name="nodeTemplateId")
    def node_template_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Node Template ID to use for node creation (string)
        """
        return pulumi.get(self, "node_template_id")

    @node_template_id.setter
    def node_template_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "node_template_id", value)

    @_builtins.property
    @pulumi.getter
    def quantity(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The number of nodes to create on Node Pool. Default `1`. Only values >= 1 allowed (int)
        """
        return pulumi.get(self, "quantity")

    @quantity.setter
    def quantity(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "quantity", value)

    @_builtins.property
    @pulumi.getter
    def worker(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        RKE role role for created nodes (bool)
        """
        return pulumi.get(self, "worker")

    @worker.setter
    def worker(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "worker", value)


@pulumi.type_token("rancher2:index/nodePool:NodePool")
class NodePool(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 cluster_id: Optional[pulumi.Input[_builtins.str]] = None,
                 control_plane: Optional[pulumi.Input[_builtins.bool]] = None,
                 delete_not_ready_after_secs: Optional[pulumi.Input[_builtins.int]] = None,
                 drain_before_delete: Optional[pulumi.Input[_builtins.bool]] = None,
                 etcd: Optional[pulumi.Input[_builtins.bool]] = None,
                 hostname_prefix: Optional[pulumi.Input[_builtins.str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 node_taints: Optional[pulumi.Input[Sequence[pulumi.Input[Union['NodePoolNodeTaintArgs', 'NodePoolNodeTaintArgsDict']]]]] = None,
                 node_template_id: Optional[pulumi.Input[_builtins.str]] = None,
                 quantity: Optional[pulumi.Input[_builtins.int]] = None,
                 worker: Optional[pulumi.Input[_builtins.bool]] = None,
                 __props__=None):
        """
        Provides a Rancher v2 Node Pool resource. This can be used to create Node Pool, using Node template for Rancher v2 RKE clusters and retrieve their information.

        ## Import

        Node Pool can be imported using the Rancher Node Pool ID

        ```sh
        $ pulumi import rancher2:index/nodePool:NodePool foo &lt;node_pool_id&gt;
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] annotations: Annotations for Node Pool object (map)
        :param pulumi.Input[_builtins.str] cluster_id: The RKE cluster id to use Node Pool (string)
        :param pulumi.Input[_builtins.bool] control_plane: RKE control plane role for created nodes (bool)
        :param pulumi.Input[_builtins.int] delete_not_ready_after_secs: Delete not ready node after secs. For Rancher v2.3.3 and above. Default `0` (int)
        :param pulumi.Input[_builtins.bool] drain_before_delete: Drain nodes before delete. Default: `false` (bool)
        :param pulumi.Input[_builtins.bool] etcd: RKE etcd role for created nodes (bool)
        :param pulumi.Input[_builtins.str] hostname_prefix: The prefix for created nodes of the Node Pool (string)
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: Labels for Node Pool object (map)
        :param pulumi.Input[_builtins.str] name: The name of the Node Pool (string)
        :param pulumi.Input[Sequence[pulumi.Input[Union['NodePoolNodeTaintArgs', 'NodePoolNodeTaintArgsDict']]]] node_taints: Node taints. For Rancher v2.3.3 and above (List)
        :param pulumi.Input[_builtins.str] node_template_id: The Node Template ID to use for node creation (string)
        :param pulumi.Input[_builtins.int] quantity: The number of nodes to create on Node Pool. Default `1`. Only values >= 1 allowed (int)
        :param pulumi.Input[_builtins.bool] worker: RKE role role for created nodes (bool)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NodePoolArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Rancher v2 Node Pool resource. This can be used to create Node Pool, using Node template for Rancher v2 RKE clusters and retrieve their information.

        ## Import

        Node Pool can be imported using the Rancher Node Pool ID

        ```sh
        $ pulumi import rancher2:index/nodePool:NodePool foo &lt;node_pool_id&gt;
        ```

        :param str resource_name: The name of the resource.
        :param NodePoolArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NodePoolArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 cluster_id: Optional[pulumi.Input[_builtins.str]] = None,
                 control_plane: Optional[pulumi.Input[_builtins.bool]] = None,
                 delete_not_ready_after_secs: Optional[pulumi.Input[_builtins.int]] = None,
                 drain_before_delete: Optional[pulumi.Input[_builtins.bool]] = None,
                 etcd: Optional[pulumi.Input[_builtins.bool]] = None,
                 hostname_prefix: Optional[pulumi.Input[_builtins.str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 node_taints: Optional[pulumi.Input[Sequence[pulumi.Input[Union['NodePoolNodeTaintArgs', 'NodePoolNodeTaintArgsDict']]]]] = None,
                 node_template_id: Optional[pulumi.Input[_builtins.str]] = None,
                 quantity: Optional[pulumi.Input[_builtins.int]] = None,
                 worker: Optional[pulumi.Input[_builtins.bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NodePoolArgs.__new__(NodePoolArgs)

            __props__.__dict__["annotations"] = annotations
            if cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_id'")
            __props__.__dict__["cluster_id"] = cluster_id
            __props__.__dict__["control_plane"] = control_plane
            __props__.__dict__["delete_not_ready_after_secs"] = delete_not_ready_after_secs
            __props__.__dict__["drain_before_delete"] = drain_before_delete
            __props__.__dict__["etcd"] = etcd
            if hostname_prefix is None and not opts.urn:
                raise TypeError("Missing required property 'hostname_prefix'")
            __props__.__dict__["hostname_prefix"] = hostname_prefix
            __props__.__dict__["labels"] = labels
            __props__.__dict__["name"] = name
            __props__.__dict__["node_taints"] = node_taints
            if node_template_id is None and not opts.urn:
                raise TypeError("Missing required property 'node_template_id'")
            __props__.__dict__["node_template_id"] = node_template_id
            __props__.__dict__["quantity"] = quantity
            __props__.__dict__["worker"] = worker
        super(NodePool, __self__).__init__(
            'rancher2:index/nodePool:NodePool',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            cluster_id: Optional[pulumi.Input[_builtins.str]] = None,
            control_plane: Optional[pulumi.Input[_builtins.bool]] = None,
            delete_not_ready_after_secs: Optional[pulumi.Input[_builtins.int]] = None,
            drain_before_delete: Optional[pulumi.Input[_builtins.bool]] = None,
            etcd: Optional[pulumi.Input[_builtins.bool]] = None,
            hostname_prefix: Optional[pulumi.Input[_builtins.str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            node_taints: Optional[pulumi.Input[Sequence[pulumi.Input[Union['NodePoolNodeTaintArgs', 'NodePoolNodeTaintArgsDict']]]]] = None,
            node_template_id: Optional[pulumi.Input[_builtins.str]] = None,
            quantity: Optional[pulumi.Input[_builtins.int]] = None,
            worker: Optional[pulumi.Input[_builtins.bool]] = None) -> 'NodePool':
        """
        Get an existing NodePool resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] annotations: Annotations for Node Pool object (map)
        :param pulumi.Input[_builtins.str] cluster_id: The RKE cluster id to use Node Pool (string)
        :param pulumi.Input[_builtins.bool] control_plane: RKE control plane role for created nodes (bool)
        :param pulumi.Input[_builtins.int] delete_not_ready_after_secs: Delete not ready node after secs. For Rancher v2.3.3 and above. Default `0` (int)
        :param pulumi.Input[_builtins.bool] drain_before_delete: Drain nodes before delete. Default: `false` (bool)
        :param pulumi.Input[_builtins.bool] etcd: RKE etcd role for created nodes (bool)
        :param pulumi.Input[_builtins.str] hostname_prefix: The prefix for created nodes of the Node Pool (string)
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: Labels for Node Pool object (map)
        :param pulumi.Input[_builtins.str] name: The name of the Node Pool (string)
        :param pulumi.Input[Sequence[pulumi.Input[Union['NodePoolNodeTaintArgs', 'NodePoolNodeTaintArgsDict']]]] node_taints: Node taints. For Rancher v2.3.3 and above (List)
        :param pulumi.Input[_builtins.str] node_template_id: The Node Template ID to use for node creation (string)
        :param pulumi.Input[_builtins.int] quantity: The number of nodes to create on Node Pool. Default `1`. Only values >= 1 allowed (int)
        :param pulumi.Input[_builtins.bool] worker: RKE role role for created nodes (bool)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NodePoolState.__new__(_NodePoolState)

        __props__.__dict__["annotations"] = annotations
        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["control_plane"] = control_plane
        __props__.__dict__["delete_not_ready_after_secs"] = delete_not_ready_after_secs
        __props__.__dict__["drain_before_delete"] = drain_before_delete
        __props__.__dict__["etcd"] = etcd
        __props__.__dict__["hostname_prefix"] = hostname_prefix
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        __props__.__dict__["node_taints"] = node_taints
        __props__.__dict__["node_template_id"] = node_template_id
        __props__.__dict__["quantity"] = quantity
        __props__.__dict__["worker"] = worker
        return NodePool(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, _builtins.str]]:
        """
        Annotations for Node Pool object (map)
        """
        return pulumi.get(self, "annotations")

    @_builtins.property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[_builtins.str]:
        """
        The RKE cluster id to use Node Pool (string)
        """
        return pulumi.get(self, "cluster_id")

    @_builtins.property
    @pulumi.getter(name="controlPlane")
    def control_plane(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        RKE control plane role for created nodes (bool)
        """
        return pulumi.get(self, "control_plane")

    @_builtins.property
    @pulumi.getter(name="deleteNotReadyAfterSecs")
    def delete_not_ready_after_secs(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        Delete not ready node after secs. For Rancher v2.3.3 and above. Default `0` (int)
        """
        return pulumi.get(self, "delete_not_ready_after_secs")

    @_builtins.property
    @pulumi.getter(name="drainBeforeDelete")
    def drain_before_delete(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Drain nodes before delete. Default: `false` (bool)
        """
        return pulumi.get(self, "drain_before_delete")

    @_builtins.property
    @pulumi.getter
    def etcd(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        RKE etcd role for created nodes (bool)
        """
        return pulumi.get(self, "etcd")

    @_builtins.property
    @pulumi.getter(name="hostnamePrefix")
    def hostname_prefix(self) -> pulumi.Output[_builtins.str]:
        """
        The prefix for created nodes of the Node Pool (string)
        """
        return pulumi.get(self, "hostname_prefix")

    @_builtins.property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, _builtins.str]]:
        """
        Labels for Node Pool object (map)
        """
        return pulumi.get(self, "labels")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the Node Pool (string)
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="nodeTaints")
    def node_taints(self) -> pulumi.Output[Optional[Sequence['outputs.NodePoolNodeTaint']]]:
        """
        Node taints. For Rancher v2.3.3 and above (List)
        """
        return pulumi.get(self, "node_taints")

    @_builtins.property
    @pulumi.getter(name="nodeTemplateId")
    def node_template_id(self) -> pulumi.Output[_builtins.str]:
        """
        The Node Template ID to use for node creation (string)
        """
        return pulumi.get(self, "node_template_id")

    @_builtins.property
    @pulumi.getter
    def quantity(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        The number of nodes to create on Node Pool. Default `1`. Only values >= 1 allowed (int)
        """
        return pulumi.get(self, "quantity")

    @_builtins.property
    @pulumi.getter
    def worker(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        RKE role role for created nodes (bool)
        """
        return pulumi.get(self, "worker")

