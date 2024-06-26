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
    'GetProjectAlertRuleResult',
    'AwaitableGetProjectAlertRuleResult',
    'get_project_alert_rule',
    'get_project_alert_rule_output',
]

@pulumi.output_type
class GetProjectAlertRuleResult:
    """
    A collection of values returned by getProjectAlertRule.
    """
    def __init__(__self__, annotations=None, group_id=None, group_interval_seconds=None, group_wait_seconds=None, id=None, inherited=None, labels=None, metric_rule=None, name=None, pod_rule=None, project_id=None, repeat_interval_seconds=None, severity=None, workload_rule=None):
        if annotations and not isinstance(annotations, dict):
            raise TypeError("Expected argument 'annotations' to be a dict")
        pulumi.set(__self__, "annotations", annotations)
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
        if pod_rule and not isinstance(pod_rule, dict):
            raise TypeError("Expected argument 'pod_rule' to be a dict")
        pulumi.set(__self__, "pod_rule", pod_rule)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if repeat_interval_seconds and not isinstance(repeat_interval_seconds, int):
            raise TypeError("Expected argument 'repeat_interval_seconds' to be a int")
        pulumi.set(__self__, "repeat_interval_seconds", repeat_interval_seconds)
        if severity and not isinstance(severity, str):
            raise TypeError("Expected argument 'severity' to be a str")
        pulumi.set(__self__, "severity", severity)
        if workload_rule and not isinstance(workload_rule, dict):
            raise TypeError("Expected argument 'workload_rule' to be a dict")
        pulumi.set(__self__, "workload_rule", workload_rule)

    @property
    @pulumi.getter
    def annotations(self) -> Mapping[str, Any]:
        """
        (Computed) The project alert rule annotations (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> str:
        """
        (Computed) The project alert rule alert group ID (string)
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter(name="groupIntervalSeconds")
    def group_interval_seconds(self) -> int:
        """
        (Computed) The project alert rule group interval seconds. Default: `180` (int)
        """
        return pulumi.get(self, "group_interval_seconds")

    @property
    @pulumi.getter(name="groupWaitSeconds")
    def group_wait_seconds(self) -> int:
        """
        (Computed) The project alert rule group wait seconds. Default: `180` (int)
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
        (Computed) The project alert rule inherited. Default: `true` (bool)
        """
        return pulumi.get(self, "inherited")

    @property
    @pulumi.getter
    def labels(self) -> Optional[Mapping[str, Any]]:
        """
        (Computed) The project alert rule labels (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter(name="metricRule")
    def metric_rule(self) -> 'outputs.GetProjectAlertRuleMetricRuleResult':
        """
        (Computed) The project alert rule metric rule. ConflictsWith: `"pod_rule", "workload_rule"`` (list Maxitems:1)
        """
        return pulumi.get(self, "metric_rule")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="podRule")
    def pod_rule(self) -> 'outputs.GetProjectAlertRulePodRuleResult':
        """
        (Computed) The project alert rule pod rule. ConflictsWith: `"metric_rule", "workload_rule"`` (list Maxitems:1)
        """
        return pulumi.get(self, "pod_rule")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="repeatIntervalSeconds")
    def repeat_interval_seconds(self) -> int:
        """
        (Computed) The project alert rule wait seconds. Default: `3600` (int)
        """
        return pulumi.get(self, "repeat_interval_seconds")

    @property
    @pulumi.getter
    def severity(self) -> str:
        """
        (Computed) The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
        """
        return pulumi.get(self, "severity")

    @property
    @pulumi.getter(name="workloadRule")
    def workload_rule(self) -> 'outputs.GetProjectAlertRuleWorkloadRuleResult':
        """
        (Computed) The project alert rule workload rule. ConflictsWith: `"metric_rule", "pod_rule"`` (list Maxitems:1)
        """
        return pulumi.get(self, "workload_rule")


class AwaitableGetProjectAlertRuleResult(GetProjectAlertRuleResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetProjectAlertRuleResult(
            annotations=self.annotations,
            group_id=self.group_id,
            group_interval_seconds=self.group_interval_seconds,
            group_wait_seconds=self.group_wait_seconds,
            id=self.id,
            inherited=self.inherited,
            labels=self.labels,
            metric_rule=self.metric_rule,
            name=self.name,
            pod_rule=self.pod_rule,
            project_id=self.project_id,
            repeat_interval_seconds=self.repeat_interval_seconds,
            severity=self.severity,
            workload_rule=self.workload_rule)


def get_project_alert_rule(labels: Optional[Mapping[str, Any]] = None,
                           name: Optional[str] = None,
                           project_id: Optional[str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetProjectAlertRuleResult:
    """
    Use this data source to retrieve information about a Rancher v2 project alert rule.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_rancher2 as rancher2

    foo = rancher2.get_project_alert_rule(project_id="<project_id>",
        name="<project_alert_rule_name>")
    ```


    :param Mapping[str, Any] labels: (Computed) The project alert rule labels (map)
    :param str name: The project alert rule name (string)
    :param str project_id: The project id where create project alert rule (string)
    """
    __args__ = dict()
    __args__['labels'] = labels
    __args__['name'] = name
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('rancher2:index/getProjectAlertRule:getProjectAlertRule', __args__, opts=opts, typ=GetProjectAlertRuleResult).value

    return AwaitableGetProjectAlertRuleResult(
        annotations=pulumi.get(__ret__, 'annotations'),
        group_id=pulumi.get(__ret__, 'group_id'),
        group_interval_seconds=pulumi.get(__ret__, 'group_interval_seconds'),
        group_wait_seconds=pulumi.get(__ret__, 'group_wait_seconds'),
        id=pulumi.get(__ret__, 'id'),
        inherited=pulumi.get(__ret__, 'inherited'),
        labels=pulumi.get(__ret__, 'labels'),
        metric_rule=pulumi.get(__ret__, 'metric_rule'),
        name=pulumi.get(__ret__, 'name'),
        pod_rule=pulumi.get(__ret__, 'pod_rule'),
        project_id=pulumi.get(__ret__, 'project_id'),
        repeat_interval_seconds=pulumi.get(__ret__, 'repeat_interval_seconds'),
        severity=pulumi.get(__ret__, 'severity'),
        workload_rule=pulumi.get(__ret__, 'workload_rule'))


@_utilities.lift_output_func(get_project_alert_rule)
def get_project_alert_rule_output(labels: Optional[pulumi.Input[Optional[Mapping[str, Any]]]] = None,
                                  name: Optional[pulumi.Input[str]] = None,
                                  project_id: Optional[pulumi.Input[str]] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetProjectAlertRuleResult]:
    """
    Use this data source to retrieve information about a Rancher v2 project alert rule.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_rancher2 as rancher2

    foo = rancher2.get_project_alert_rule(project_id="<project_id>",
        name="<project_alert_rule_name>")
    ```


    :param Mapping[str, Any] labels: (Computed) The project alert rule labels (map)
    :param str name: The project alert rule name (string)
    :param str project_id: The project id where create project alert rule (string)
    """
    ...
