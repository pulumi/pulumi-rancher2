# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetClusterAlertRuleResult',
    'AwaitableGetClusterAlertRuleResult',
    'get_cluster_alert_rule',
    'get_cluster_alert_rule_output',
]

@pulumi.output_type
class GetClusterAlertRuleResult:
    """
    A collection of values returned by getClusterAlertRule.
    """
    def __init__(__self__, annotations=None, cluster_id=None, event_rule=None, group_id=None, group_interval_seconds=None, group_wait_seconds=None, id=None, inherited=None, labels=None, metric_rule=None, name=None, node_rule=None, repeat_interval_seconds=None, severity=None, system_service_rule=None):
        if annotations and not isinstance(annotations, dict):
            raise TypeError("Expected argument 'annotations' to be a dict")
        pulumi.set(__self__, "annotations", annotations)
        if cluster_id and not isinstance(cluster_id, str):
            raise TypeError("Expected argument 'cluster_id' to be a str")
        pulumi.set(__self__, "cluster_id", cluster_id)
        if event_rule and not isinstance(event_rule, dict):
            raise TypeError("Expected argument 'event_rule' to be a dict")
        pulumi.set(__self__, "event_rule", event_rule)
        if group_id and not isinstance(group_id, str):
            raise TypeError("Expected argument 'group_id' to be a str")
        pulumi.set(__self__, "group_id", group_id)
        if group_interval_seconds and not isinstance(group_interval_seconds, int):
            raise TypeError("Expected argument 'group_interval_seconds' to be a int")
        pulumi.set(__self__, "group_interval_seconds", group_interval_seconds)
        if group_wait_seconds and not isinstance(group_wait_seconds, int):
            raise TypeError("Expected argument 'group_wait_seconds' to be a int")
        pulumi.set(__self__, "group_wait_seconds", group_wait_seconds)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if inherited and not isinstance(inherited, bool):
            raise TypeError("Expected argument 'inherited' to be a bool")
        pulumi.set(__self__, "inherited", inherited)
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        pulumi.set(__self__, "labels", labels)
        if metric_rule and not isinstance(metric_rule, dict):
            raise TypeError("Expected argument 'metric_rule' to be a dict")
        pulumi.set(__self__, "metric_rule", metric_rule)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if node_rule and not isinstance(node_rule, dict):
            raise TypeError("Expected argument 'node_rule' to be a dict")
        pulumi.set(__self__, "node_rule", node_rule)
        if repeat_interval_seconds and not isinstance(repeat_interval_seconds, int):
            raise TypeError("Expected argument 'repeat_interval_seconds' to be a int")
        pulumi.set(__self__, "repeat_interval_seconds", repeat_interval_seconds)
        if severity and not isinstance(severity, str):
            raise TypeError("Expected argument 'severity' to be a str")
        pulumi.set(__self__, "severity", severity)
        if system_service_rule and not isinstance(system_service_rule, dict):
            raise TypeError("Expected argument 'system_service_rule' to be a dict")
        pulumi.set(__self__, "system_service_rule", system_service_rule)

    @property
    @pulumi.getter
    def annotations(self) -> Mapping[str, Any]:
        """
        (Computed) The cluster alert rule annotations (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> str:
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="eventRule")
    def event_rule(self) -> 'outputs.GetClusterAlertRuleEventRuleResult':
        """
        (Computed) The cluster alert rule event rule. ConflictsWith: `"metric_rule", "node_rule", "system_service_rule"` (list Maxitems:1)
        """
        return pulumi.get(self, "event_rule")

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> str:
        """
        (Computed) The cluster alert rule alert group ID (string)
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter(name="groupIntervalSeconds")
    def group_interval_seconds(self) -> int:
        """
        (Computed) The cluster alert rule group interval seconds. Default: `180` (int)
        """
        return pulumi.get(self, "group_interval_seconds")

    @property
    @pulumi.getter(name="groupWaitSeconds")
    def group_wait_seconds(self) -> int:
        """
        (Computed) The cluster alert rule group wait seconds. Default: `180` (int)
        """
        return pulumi.get(self, "group_wait_seconds")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def inherited(self) -> bool:
        """
        (Computed) The cluster alert rule inherited. Default: `true` (bool)
        """
        return pulumi.get(self, "inherited")

    @property
    @pulumi.getter
    def labels(self) -> Optional[Mapping[str, Any]]:
        """
        (Computed) The cluster alert rule labels (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter(name="metricRule")
    def metric_rule(self) -> 'outputs.GetClusterAlertRuleMetricRuleResult':
        """
        (Computed) The cluster alert rule metric rule. ConflictsWith: `"event_rule", "node_rule", "system_service_rule"`` (list Maxitems:1)
        """
        return pulumi.get(self, "metric_rule")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nodeRule")
    def node_rule(self) -> 'outputs.GetClusterAlertRuleNodeRuleResult':
        """
        (Computed) The cluster alert rule node rule. ConflictsWith: `"event_rule", "metric_rule", "system_service_rule"`` (list Maxitems:1)
        """
        return pulumi.get(self, "node_rule")

    @property
    @pulumi.getter(name="repeatIntervalSeconds")
    def repeat_interval_seconds(self) -> int:
        """
        (Optional) The cluster alert rule wait seconds. Default: `3600` (int)
        """
        return pulumi.get(self, "repeat_interval_seconds")

    @property
    @pulumi.getter
    def severity(self) -> str:
        """
        (Computed) The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
        """
        return pulumi.get(self, "severity")

    @property
    @pulumi.getter(name="systemServiceRule")
    def system_service_rule(self) -> 'outputs.GetClusterAlertRuleSystemServiceRuleResult':
        """
        (Computed) The cluster alert rule system service rule. ConflictsWith: `"event_rule", "metric_rule", "node_rule"`` (list Maxitems:1)
        """
        return pulumi.get(self, "system_service_rule")


class AwaitableGetClusterAlertRuleResult(GetClusterAlertRuleResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetClusterAlertRuleResult(
            annotations=self.annotations,
            cluster_id=self.cluster_id,
            event_rule=self.event_rule,
            group_id=self.group_id,
            group_interval_seconds=self.group_interval_seconds,
            group_wait_seconds=self.group_wait_seconds,
            id=self.id,
            inherited=self.inherited,
            labels=self.labels,
            metric_rule=self.metric_rule,
            name=self.name,
            node_rule=self.node_rule,
            repeat_interval_seconds=self.repeat_interval_seconds,
            severity=self.severity,
            system_service_rule=self.system_service_rule)


def get_cluster_alert_rule(cluster_id: Optional[str] = None,
                           labels: Optional[Mapping[str, Any]] = None,
                           name: Optional[str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetClusterAlertRuleResult:
    """
    Use this data source to retrieve information about a Rancher v2 cluster alert rule.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_rancher2 as rancher2

    foo = rancher2.get_cluster_alert_rule(cluster_id="<cluster_id>",
        name="<cluster_alert_rule_name>")
    ```


    :param str cluster_id: The cluster id where create cluster alert rule (string)
    :param Mapping[str, Any] labels: (Computed) The cluster alert rule labels (map)
    :param str name: The cluster alert rule name (string)
    """
    __args__ = dict()
    __args__['clusterId'] = cluster_id
    __args__['labels'] = labels
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('rancher2:index/getClusterAlertRule:getClusterAlertRule', __args__, opts=opts, typ=GetClusterAlertRuleResult).value

    return AwaitableGetClusterAlertRuleResult(
        annotations=pulumi.get(__ret__, 'annotations'),
        cluster_id=pulumi.get(__ret__, 'cluster_id'),
        event_rule=pulumi.get(__ret__, 'event_rule'),
        group_id=pulumi.get(__ret__, 'group_id'),
        group_interval_seconds=pulumi.get(__ret__, 'group_interval_seconds'),
        group_wait_seconds=pulumi.get(__ret__, 'group_wait_seconds'),
        id=pulumi.get(__ret__, 'id'),
        inherited=pulumi.get(__ret__, 'inherited'),
        labels=pulumi.get(__ret__, 'labels'),
        metric_rule=pulumi.get(__ret__, 'metric_rule'),
        name=pulumi.get(__ret__, 'name'),
        node_rule=pulumi.get(__ret__, 'node_rule'),
        repeat_interval_seconds=pulumi.get(__ret__, 'repeat_interval_seconds'),
        severity=pulumi.get(__ret__, 'severity'),
        system_service_rule=pulumi.get(__ret__, 'system_service_rule'))


@_utilities.lift_output_func(get_cluster_alert_rule)
def get_cluster_alert_rule_output(cluster_id: Optional[pulumi.Input[str]] = None,
                                  labels: Optional[pulumi.Input[Optional[Mapping[str, Any]]]] = None,
                                  name: Optional[pulumi.Input[str]] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetClusterAlertRuleResult]:
    """
    Use this data source to retrieve information about a Rancher v2 cluster alert rule.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_rancher2 as rancher2

    foo = rancher2.get_cluster_alert_rule(cluster_id="<cluster_id>",
        name="<cluster_alert_rule_name>")
    ```


    :param str cluster_id: The cluster id where create cluster alert rule (string)
    :param Mapping[str, Any] labels: (Computed) The cluster alert rule labels (map)
    :param str name: The cluster alert rule name (string)
    """
    ...
