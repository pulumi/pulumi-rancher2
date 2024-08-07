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
from ._inputs import *

__all__ = ['ProjectAlertRuleArgs', 'ProjectAlertRule']

@pulumi.input_type
class ProjectAlertRuleArgs:
    def __init__(__self__, *,
                 group_id: pulumi.Input[str],
                 project_id: pulumi.Input[str],
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 group_interval_seconds: Optional[pulumi.Input[int]] = None,
                 group_wait_seconds: Optional[pulumi.Input[int]] = None,
                 inherited: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 metric_rule: Optional[pulumi.Input['ProjectAlertRuleMetricRuleArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 pod_rule: Optional[pulumi.Input['ProjectAlertRulePodRuleArgs']] = None,
                 repeat_interval_seconds: Optional[pulumi.Input[int]] = None,
                 severity: Optional[pulumi.Input[str]] = None,
                 workload_rule: Optional[pulumi.Input['ProjectAlertRuleWorkloadRuleArgs']] = None):
        """
        The set of arguments for constructing a ProjectAlertRule resource.
        :param pulumi.Input[str] group_id: The project alert rule alert group ID (string)
        :param pulumi.Input[str] project_id: The project id where create project alert rule (string)
        :param pulumi.Input[Mapping[str, Any]] annotations: The project alert rule annotations (map)
        :param pulumi.Input[int] group_interval_seconds: The project alert rule group interval seconds. Default: `180` (int)
        :param pulumi.Input[int] group_wait_seconds: The project alert rule group wait seconds. Default: `180` (int)
        :param pulumi.Input[bool] inherited: The project alert rule inherited. Default: `true` (bool)
        :param pulumi.Input[Mapping[str, Any]] labels: The project alert rule labels (map)
        :param pulumi.Input['ProjectAlertRuleMetricRuleArgs'] metric_rule: The project alert rule metric rule. ConflictsWith: `"pod_rule", "workload_rule"`` (list Maxitems:1)
        :param pulumi.Input[str] name: The project alert rule name (string)
        :param pulumi.Input['ProjectAlertRulePodRuleArgs'] pod_rule: The project alert rule pod rule. ConflictsWith: `"metric_rule", "workload_rule"`` (list Maxitems:1)
        :param pulumi.Input[int] repeat_interval_seconds: The project alert rule wait seconds. Default: `3600` (int)
        :param pulumi.Input[str] severity: The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
        :param pulumi.Input['ProjectAlertRuleWorkloadRuleArgs'] workload_rule: The project alert rule workload rule. ConflictsWith: `"metric_rule", "pod_rule"`` (list Maxitems:1)
        """
        pulumi.set(__self__, "group_id", group_id)
        pulumi.set(__self__, "project_id", project_id)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if group_interval_seconds is not None:
            pulumi.set(__self__, "group_interval_seconds", group_interval_seconds)
        if group_wait_seconds is not None:
            pulumi.set(__self__, "group_wait_seconds", group_wait_seconds)
        if inherited is not None:
            pulumi.set(__self__, "inherited", inherited)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if metric_rule is not None:
            pulumi.set(__self__, "metric_rule", metric_rule)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if pod_rule is not None:
            pulumi.set(__self__, "pod_rule", pod_rule)
        if repeat_interval_seconds is not None:
            pulumi.set(__self__, "repeat_interval_seconds", repeat_interval_seconds)
        if severity is not None:
            pulumi.set(__self__, "severity", severity)
        if workload_rule is not None:
            pulumi.set(__self__, "workload_rule", workload_rule)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> pulumi.Input[str]:
        """
        The project alert rule alert group ID (string)
        """
        return pulumi.get(self, "group_id")

    @group_id.setter
    def group_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "group_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        The project id where create project alert rule (string)
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The project alert rule annotations (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter(name="groupIntervalSeconds")
    def group_interval_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        The project alert rule group interval seconds. Default: `180` (int)
        """
        return pulumi.get(self, "group_interval_seconds")

    @group_interval_seconds.setter
    def group_interval_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "group_interval_seconds", value)

    @property
    @pulumi.getter(name="groupWaitSeconds")
    def group_wait_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        The project alert rule group wait seconds. Default: `180` (int)
        """
        return pulumi.get(self, "group_wait_seconds")

    @group_wait_seconds.setter
    def group_wait_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "group_wait_seconds", value)

    @property
    @pulumi.getter
    def inherited(self) -> Optional[pulumi.Input[bool]]:
        """
        The project alert rule inherited. Default: `true` (bool)
        """
        return pulumi.get(self, "inherited")

    @inherited.setter
    def inherited(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "inherited", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The project alert rule labels (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter(name="metricRule")
    def metric_rule(self) -> Optional[pulumi.Input['ProjectAlertRuleMetricRuleArgs']]:
        """
        The project alert rule metric rule. ConflictsWith: `"pod_rule", "workload_rule"`` (list Maxitems:1)
        """
        return pulumi.get(self, "metric_rule")

    @metric_rule.setter
    def metric_rule(self, value: Optional[pulumi.Input['ProjectAlertRuleMetricRuleArgs']]):
        pulumi.set(self, "metric_rule", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The project alert rule name (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="podRule")
    def pod_rule(self) -> Optional[pulumi.Input['ProjectAlertRulePodRuleArgs']]:
        """
        The project alert rule pod rule. ConflictsWith: `"metric_rule", "workload_rule"`` (list Maxitems:1)
        """
        return pulumi.get(self, "pod_rule")

    @pod_rule.setter
    def pod_rule(self, value: Optional[pulumi.Input['ProjectAlertRulePodRuleArgs']]):
        pulumi.set(self, "pod_rule", value)

    @property
    @pulumi.getter(name="repeatIntervalSeconds")
    def repeat_interval_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        The project alert rule wait seconds. Default: `3600` (int)
        """
        return pulumi.get(self, "repeat_interval_seconds")

    @repeat_interval_seconds.setter
    def repeat_interval_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "repeat_interval_seconds", value)

    @property
    @pulumi.getter
    def severity(self) -> Optional[pulumi.Input[str]]:
        """
        The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
        """
        return pulumi.get(self, "severity")

    @severity.setter
    def severity(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "severity", value)

    @property
    @pulumi.getter(name="workloadRule")
    def workload_rule(self) -> Optional[pulumi.Input['ProjectAlertRuleWorkloadRuleArgs']]:
        """
        The project alert rule workload rule. ConflictsWith: `"metric_rule", "pod_rule"`` (list Maxitems:1)
        """
        return pulumi.get(self, "workload_rule")

    @workload_rule.setter
    def workload_rule(self, value: Optional[pulumi.Input['ProjectAlertRuleWorkloadRuleArgs']]):
        pulumi.set(self, "workload_rule", value)


@pulumi.input_type
class _ProjectAlertRuleState:
    def __init__(__self__, *,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 group_interval_seconds: Optional[pulumi.Input[int]] = None,
                 group_wait_seconds: Optional[pulumi.Input[int]] = None,
                 inherited: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 metric_rule: Optional[pulumi.Input['ProjectAlertRuleMetricRuleArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 pod_rule: Optional[pulumi.Input['ProjectAlertRulePodRuleArgs']] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 repeat_interval_seconds: Optional[pulumi.Input[int]] = None,
                 severity: Optional[pulumi.Input[str]] = None,
                 workload_rule: Optional[pulumi.Input['ProjectAlertRuleWorkloadRuleArgs']] = None):
        """
        Input properties used for looking up and filtering ProjectAlertRule resources.
        :param pulumi.Input[Mapping[str, Any]] annotations: The project alert rule annotations (map)
        :param pulumi.Input[str] group_id: The project alert rule alert group ID (string)
        :param pulumi.Input[int] group_interval_seconds: The project alert rule group interval seconds. Default: `180` (int)
        :param pulumi.Input[int] group_wait_seconds: The project alert rule group wait seconds. Default: `180` (int)
        :param pulumi.Input[bool] inherited: The project alert rule inherited. Default: `true` (bool)
        :param pulumi.Input[Mapping[str, Any]] labels: The project alert rule labels (map)
        :param pulumi.Input['ProjectAlertRuleMetricRuleArgs'] metric_rule: The project alert rule metric rule. ConflictsWith: `"pod_rule", "workload_rule"`` (list Maxitems:1)
        :param pulumi.Input[str] name: The project alert rule name (string)
        :param pulumi.Input['ProjectAlertRulePodRuleArgs'] pod_rule: The project alert rule pod rule. ConflictsWith: `"metric_rule", "workload_rule"`` (list Maxitems:1)
        :param pulumi.Input[str] project_id: The project id where create project alert rule (string)
        :param pulumi.Input[int] repeat_interval_seconds: The project alert rule wait seconds. Default: `3600` (int)
        :param pulumi.Input[str] severity: The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
        :param pulumi.Input['ProjectAlertRuleWorkloadRuleArgs'] workload_rule: The project alert rule workload rule. ConflictsWith: `"metric_rule", "pod_rule"`` (list Maxitems:1)
        """
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if group_id is not None:
            pulumi.set(__self__, "group_id", group_id)
        if group_interval_seconds is not None:
            pulumi.set(__self__, "group_interval_seconds", group_interval_seconds)
        if group_wait_seconds is not None:
            pulumi.set(__self__, "group_wait_seconds", group_wait_seconds)
        if inherited is not None:
            pulumi.set(__self__, "inherited", inherited)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if metric_rule is not None:
            pulumi.set(__self__, "metric_rule", metric_rule)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if pod_rule is not None:
            pulumi.set(__self__, "pod_rule", pod_rule)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if repeat_interval_seconds is not None:
            pulumi.set(__self__, "repeat_interval_seconds", repeat_interval_seconds)
        if severity is not None:
            pulumi.set(__self__, "severity", severity)
        if workload_rule is not None:
            pulumi.set(__self__, "workload_rule", workload_rule)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The project alert rule annotations (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The project alert rule alert group ID (string)
        """
        return pulumi.get(self, "group_id")

    @group_id.setter
    def group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group_id", value)

    @property
    @pulumi.getter(name="groupIntervalSeconds")
    def group_interval_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        The project alert rule group interval seconds. Default: `180` (int)
        """
        return pulumi.get(self, "group_interval_seconds")

    @group_interval_seconds.setter
    def group_interval_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "group_interval_seconds", value)

    @property
    @pulumi.getter(name="groupWaitSeconds")
    def group_wait_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        The project alert rule group wait seconds. Default: `180` (int)
        """
        return pulumi.get(self, "group_wait_seconds")

    @group_wait_seconds.setter
    def group_wait_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "group_wait_seconds", value)

    @property
    @pulumi.getter
    def inherited(self) -> Optional[pulumi.Input[bool]]:
        """
        The project alert rule inherited. Default: `true` (bool)
        """
        return pulumi.get(self, "inherited")

    @inherited.setter
    def inherited(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "inherited", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The project alert rule labels (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter(name="metricRule")
    def metric_rule(self) -> Optional[pulumi.Input['ProjectAlertRuleMetricRuleArgs']]:
        """
        The project alert rule metric rule. ConflictsWith: `"pod_rule", "workload_rule"`` (list Maxitems:1)
        """
        return pulumi.get(self, "metric_rule")

    @metric_rule.setter
    def metric_rule(self, value: Optional[pulumi.Input['ProjectAlertRuleMetricRuleArgs']]):
        pulumi.set(self, "metric_rule", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The project alert rule name (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="podRule")
    def pod_rule(self) -> Optional[pulumi.Input['ProjectAlertRulePodRuleArgs']]:
        """
        The project alert rule pod rule. ConflictsWith: `"metric_rule", "workload_rule"`` (list Maxitems:1)
        """
        return pulumi.get(self, "pod_rule")

    @pod_rule.setter
    def pod_rule(self, value: Optional[pulumi.Input['ProjectAlertRulePodRuleArgs']]):
        pulumi.set(self, "pod_rule", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        The project id where create project alert rule (string)
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="repeatIntervalSeconds")
    def repeat_interval_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        The project alert rule wait seconds. Default: `3600` (int)
        """
        return pulumi.get(self, "repeat_interval_seconds")

    @repeat_interval_seconds.setter
    def repeat_interval_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "repeat_interval_seconds", value)

    @property
    @pulumi.getter
    def severity(self) -> Optional[pulumi.Input[str]]:
        """
        The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
        """
        return pulumi.get(self, "severity")

    @severity.setter
    def severity(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "severity", value)

    @property
    @pulumi.getter(name="workloadRule")
    def workload_rule(self) -> Optional[pulumi.Input['ProjectAlertRuleWorkloadRuleArgs']]:
        """
        The project alert rule workload rule. ConflictsWith: `"metric_rule", "pod_rule"`` (list Maxitems:1)
        """
        return pulumi.get(self, "workload_rule")

    @workload_rule.setter
    def workload_rule(self, value: Optional[pulumi.Input['ProjectAlertRuleWorkloadRuleArgs']]):
        pulumi.set(self, "workload_rule", value)


class ProjectAlertRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 group_interval_seconds: Optional[pulumi.Input[int]] = None,
                 group_wait_seconds: Optional[pulumi.Input[int]] = None,
                 inherited: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 metric_rule: Optional[pulumi.Input[pulumi.InputType['ProjectAlertRuleMetricRuleArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 pod_rule: Optional[pulumi.Input[pulumi.InputType['ProjectAlertRulePodRuleArgs']]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 repeat_interval_seconds: Optional[pulumi.Input[int]] = None,
                 severity: Optional[pulumi.Input[str]] = None,
                 workload_rule: Optional[pulumi.Input[pulumi.InputType['ProjectAlertRuleWorkloadRuleArgs']]] = None,
                 __props__=None):
        """
        Provides a Rancher v2 Project Alert Rule resource. This can be used to create Project Alert Rule for Rancher v2 environments and retrieve their information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new Rancher2 Project
        foo = rancher2.Project("foo",
            name="foo",
            cluster_id="<cluster_id>",
            description="Terraform project ",
            resource_quota=rancher2.ProjectResourceQuotaArgs(
                project_limit=rancher2.ProjectResourceQuotaProjectLimitArgs(
                    limits_cpu="2000m",
                    limits_memory="2000Mi",
                    requests_storage="2Gi",
                ),
                namespace_default_limit=rancher2.ProjectResourceQuotaNamespaceDefaultLimitArgs(
                    limits_cpu="500m",
                    limits_memory="500Mi",
                    requests_storage="1Gi",
                ),
            ),
            container_resource_limit=rancher2.ProjectContainerResourceLimitArgs(
                limits_cpu="20m",
                limits_memory="20Mi",
                requests_cpu="1m",
                requests_memory="1Mi",
            ))
        # Create a new Rancher2 Project Alert Group
        foo_project_alert_group = rancher2.ProjectAlertGroup("foo",
            name="foo",
            description="Terraform project alert group",
            project_id=foo.id,
            group_interval_seconds=300,
            repeat_interval_seconds=3600)
        # Create a new Rancher2 Project Alert Rule
        foo_project_alert_rule = rancher2.ProjectAlertRule("foo",
            project_id=foo_project_alert_group.project_id,
            group_id=foo_project_alert_group.id,
            name="foo",
            group_interval_seconds=600,
            repeat_interval_seconds=6000)
        ```

        ## Import

        Project Alert Rule can be imported using the Rancher project alert rule ID

        ```sh
        $ pulumi import rancher2:index/projectAlertRule:ProjectAlertRule foo &lt;project_alert_rule_id&gt;
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: The project alert rule annotations (map)
        :param pulumi.Input[str] group_id: The project alert rule alert group ID (string)
        :param pulumi.Input[int] group_interval_seconds: The project alert rule group interval seconds. Default: `180` (int)
        :param pulumi.Input[int] group_wait_seconds: The project alert rule group wait seconds. Default: `180` (int)
        :param pulumi.Input[bool] inherited: The project alert rule inherited. Default: `true` (bool)
        :param pulumi.Input[Mapping[str, Any]] labels: The project alert rule labels (map)
        :param pulumi.Input[pulumi.InputType['ProjectAlertRuleMetricRuleArgs']] metric_rule: The project alert rule metric rule. ConflictsWith: `"pod_rule", "workload_rule"`` (list Maxitems:1)
        :param pulumi.Input[str] name: The project alert rule name (string)
        :param pulumi.Input[pulumi.InputType['ProjectAlertRulePodRuleArgs']] pod_rule: The project alert rule pod rule. ConflictsWith: `"metric_rule", "workload_rule"`` (list Maxitems:1)
        :param pulumi.Input[str] project_id: The project id where create project alert rule (string)
        :param pulumi.Input[int] repeat_interval_seconds: The project alert rule wait seconds. Default: `3600` (int)
        :param pulumi.Input[str] severity: The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
        :param pulumi.Input[pulumi.InputType['ProjectAlertRuleWorkloadRuleArgs']] workload_rule: The project alert rule workload rule. ConflictsWith: `"metric_rule", "pod_rule"`` (list Maxitems:1)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ProjectAlertRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Rancher v2 Project Alert Rule resource. This can be used to create Project Alert Rule for Rancher v2 environments and retrieve their information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new Rancher2 Project
        foo = rancher2.Project("foo",
            name="foo",
            cluster_id="<cluster_id>",
            description="Terraform project ",
            resource_quota=rancher2.ProjectResourceQuotaArgs(
                project_limit=rancher2.ProjectResourceQuotaProjectLimitArgs(
                    limits_cpu="2000m",
                    limits_memory="2000Mi",
                    requests_storage="2Gi",
                ),
                namespace_default_limit=rancher2.ProjectResourceQuotaNamespaceDefaultLimitArgs(
                    limits_cpu="500m",
                    limits_memory="500Mi",
                    requests_storage="1Gi",
                ),
            ),
            container_resource_limit=rancher2.ProjectContainerResourceLimitArgs(
                limits_cpu="20m",
                limits_memory="20Mi",
                requests_cpu="1m",
                requests_memory="1Mi",
            ))
        # Create a new Rancher2 Project Alert Group
        foo_project_alert_group = rancher2.ProjectAlertGroup("foo",
            name="foo",
            description="Terraform project alert group",
            project_id=foo.id,
            group_interval_seconds=300,
            repeat_interval_seconds=3600)
        # Create a new Rancher2 Project Alert Rule
        foo_project_alert_rule = rancher2.ProjectAlertRule("foo",
            project_id=foo_project_alert_group.project_id,
            group_id=foo_project_alert_group.id,
            name="foo",
            group_interval_seconds=600,
            repeat_interval_seconds=6000)
        ```

        ## Import

        Project Alert Rule can be imported using the Rancher project alert rule ID

        ```sh
        $ pulumi import rancher2:index/projectAlertRule:ProjectAlertRule foo &lt;project_alert_rule_id&gt;
        ```

        :param str resource_name: The name of the resource.
        :param ProjectAlertRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProjectAlertRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 group_interval_seconds: Optional[pulumi.Input[int]] = None,
                 group_wait_seconds: Optional[pulumi.Input[int]] = None,
                 inherited: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 metric_rule: Optional[pulumi.Input[pulumi.InputType['ProjectAlertRuleMetricRuleArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 pod_rule: Optional[pulumi.Input[pulumi.InputType['ProjectAlertRulePodRuleArgs']]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 repeat_interval_seconds: Optional[pulumi.Input[int]] = None,
                 severity: Optional[pulumi.Input[str]] = None,
                 workload_rule: Optional[pulumi.Input[pulumi.InputType['ProjectAlertRuleWorkloadRuleArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProjectAlertRuleArgs.__new__(ProjectAlertRuleArgs)

            __props__.__dict__["annotations"] = annotations
            if group_id is None and not opts.urn:
                raise TypeError("Missing required property 'group_id'")
            __props__.__dict__["group_id"] = group_id
            __props__.__dict__["group_interval_seconds"] = group_interval_seconds
            __props__.__dict__["group_wait_seconds"] = group_wait_seconds
            __props__.__dict__["inherited"] = inherited
            __props__.__dict__["labels"] = labels
            __props__.__dict__["metric_rule"] = metric_rule
            __props__.__dict__["name"] = name
            __props__.__dict__["pod_rule"] = pod_rule
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["repeat_interval_seconds"] = repeat_interval_seconds
            __props__.__dict__["severity"] = severity
            __props__.__dict__["workload_rule"] = workload_rule
        super(ProjectAlertRule, __self__).__init__(
            'rancher2:index/projectAlertRule:ProjectAlertRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            group_id: Optional[pulumi.Input[str]] = None,
            group_interval_seconds: Optional[pulumi.Input[int]] = None,
            group_wait_seconds: Optional[pulumi.Input[int]] = None,
            inherited: Optional[pulumi.Input[bool]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            metric_rule: Optional[pulumi.Input[pulumi.InputType['ProjectAlertRuleMetricRuleArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            pod_rule: Optional[pulumi.Input[pulumi.InputType['ProjectAlertRulePodRuleArgs']]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            repeat_interval_seconds: Optional[pulumi.Input[int]] = None,
            severity: Optional[pulumi.Input[str]] = None,
            workload_rule: Optional[pulumi.Input[pulumi.InputType['ProjectAlertRuleWorkloadRuleArgs']]] = None) -> 'ProjectAlertRule':
        """
        Get an existing ProjectAlertRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: The project alert rule annotations (map)
        :param pulumi.Input[str] group_id: The project alert rule alert group ID (string)
        :param pulumi.Input[int] group_interval_seconds: The project alert rule group interval seconds. Default: `180` (int)
        :param pulumi.Input[int] group_wait_seconds: The project alert rule group wait seconds. Default: `180` (int)
        :param pulumi.Input[bool] inherited: The project alert rule inherited. Default: `true` (bool)
        :param pulumi.Input[Mapping[str, Any]] labels: The project alert rule labels (map)
        :param pulumi.Input[pulumi.InputType['ProjectAlertRuleMetricRuleArgs']] metric_rule: The project alert rule metric rule. ConflictsWith: `"pod_rule", "workload_rule"`` (list Maxitems:1)
        :param pulumi.Input[str] name: The project alert rule name (string)
        :param pulumi.Input[pulumi.InputType['ProjectAlertRulePodRuleArgs']] pod_rule: The project alert rule pod rule. ConflictsWith: `"metric_rule", "workload_rule"`` (list Maxitems:1)
        :param pulumi.Input[str] project_id: The project id where create project alert rule (string)
        :param pulumi.Input[int] repeat_interval_seconds: The project alert rule wait seconds. Default: `3600` (int)
        :param pulumi.Input[str] severity: The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
        :param pulumi.Input[pulumi.InputType['ProjectAlertRuleWorkloadRuleArgs']] workload_rule: The project alert rule workload rule. ConflictsWith: `"metric_rule", "pod_rule"`` (list Maxitems:1)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ProjectAlertRuleState.__new__(_ProjectAlertRuleState)

        __props__.__dict__["annotations"] = annotations
        __props__.__dict__["group_id"] = group_id
        __props__.__dict__["group_interval_seconds"] = group_interval_seconds
        __props__.__dict__["group_wait_seconds"] = group_wait_seconds
        __props__.__dict__["inherited"] = inherited
        __props__.__dict__["labels"] = labels
        __props__.__dict__["metric_rule"] = metric_rule
        __props__.__dict__["name"] = name
        __props__.__dict__["pod_rule"] = pod_rule
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["repeat_interval_seconds"] = repeat_interval_seconds
        __props__.__dict__["severity"] = severity
        __props__.__dict__["workload_rule"] = workload_rule
        return ProjectAlertRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        The project alert rule annotations (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> pulumi.Output[str]:
        """
        The project alert rule alert group ID (string)
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter(name="groupIntervalSeconds")
    def group_interval_seconds(self) -> pulumi.Output[Optional[int]]:
        """
        The project alert rule group interval seconds. Default: `180` (int)
        """
        return pulumi.get(self, "group_interval_seconds")

    @property
    @pulumi.getter(name="groupWaitSeconds")
    def group_wait_seconds(self) -> pulumi.Output[Optional[int]]:
        """
        The project alert rule group wait seconds. Default: `180` (int)
        """
        return pulumi.get(self, "group_wait_seconds")

    @property
    @pulumi.getter
    def inherited(self) -> pulumi.Output[Optional[bool]]:
        """
        The project alert rule inherited. Default: `true` (bool)
        """
        return pulumi.get(self, "inherited")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        The project alert rule labels (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter(name="metricRule")
    def metric_rule(self) -> pulumi.Output[Optional['outputs.ProjectAlertRuleMetricRule']]:
        """
        The project alert rule metric rule. ConflictsWith: `"pod_rule", "workload_rule"`` (list Maxitems:1)
        """
        return pulumi.get(self, "metric_rule")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The project alert rule name (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="podRule")
    def pod_rule(self) -> pulumi.Output[Optional['outputs.ProjectAlertRulePodRule']]:
        """
        The project alert rule pod rule. ConflictsWith: `"metric_rule", "workload_rule"`` (list Maxitems:1)
        """
        return pulumi.get(self, "pod_rule")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        The project id where create project alert rule (string)
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="repeatIntervalSeconds")
    def repeat_interval_seconds(self) -> pulumi.Output[Optional[int]]:
        """
        The project alert rule wait seconds. Default: `3600` (int)
        """
        return pulumi.get(self, "repeat_interval_seconds")

    @property
    @pulumi.getter
    def severity(self) -> pulumi.Output[Optional[str]]:
        """
        The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
        """
        return pulumi.get(self, "severity")

    @property
    @pulumi.getter(name="workloadRule")
    def workload_rule(self) -> pulumi.Output[Optional['outputs.ProjectAlertRuleWorkloadRule']]:
        """
        The project alert rule workload rule. ConflictsWith: `"metric_rule", "pod_rule"`` (list Maxitems:1)
        """
        return pulumi.get(self, "workload_rule")

