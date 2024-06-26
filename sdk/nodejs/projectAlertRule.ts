// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Project Alert Rule resource. This can be used to create Project Alert Rule for Rancher v2 environments and retrieve their information.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new Rancher2 Project
 * const foo = new rancher2.Project("foo", {
 *     name: "foo",
 *     clusterId: "<cluster_id>",
 *     description: "Terraform project ",
 *     resourceQuota: {
 *         projectLimit: {
 *             limitsCpu: "2000m",
 *             limitsMemory: "2000Mi",
 *             requestsStorage: "2Gi",
 *         },
 *         namespaceDefaultLimit: {
 *             limitsCpu: "500m",
 *             limitsMemory: "500Mi",
 *             requestsStorage: "1Gi",
 *         },
 *     },
 *     containerResourceLimit: {
 *         limitsCpu: "20m",
 *         limitsMemory: "20Mi",
 *         requestsCpu: "1m",
 *         requestsMemory: "1Mi",
 *     },
 * });
 * // Create a new Rancher2 Project Alert Group
 * const fooProjectAlertGroup = new rancher2.ProjectAlertGroup("foo", {
 *     name: "foo",
 *     description: "Terraform project alert group",
 *     projectId: foo.id,
 *     groupIntervalSeconds: 300,
 *     repeatIntervalSeconds: 3600,
 * });
 * // Create a new Rancher2 Project Alert Rule
 * const fooProjectAlertRule = new rancher2.ProjectAlertRule("foo", {
 *     projectId: fooProjectAlertGroup.projectId,
 *     groupId: fooProjectAlertGroup.id,
 *     name: "foo",
 *     groupIntervalSeconds: 600,
 *     repeatIntervalSeconds: 6000,
 * });
 * ```
 *
 * ## Import
 *
 * Project Alert Rule can be imported using the Rancher project alert rule ID
 *
 * ```sh
 * $ pulumi import rancher2:index/projectAlertRule:ProjectAlertRule foo &lt;project_alert_rule_id&gt;
 * ```
 */
export class ProjectAlertRule extends pulumi.CustomResource {
    /**
     * Get an existing ProjectAlertRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectAlertRuleState, opts?: pulumi.CustomResourceOptions): ProjectAlertRule {
        return new ProjectAlertRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/projectAlertRule:ProjectAlertRule';

    /**
     * Returns true if the given object is an instance of ProjectAlertRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ProjectAlertRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ProjectAlertRule.__pulumiType;
    }

    /**
     * The project alert rule annotations (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * The project alert rule alert group ID (string)
     */
    public readonly groupId!: pulumi.Output<string>;
    /**
     * The project alert rule group interval seconds. Default: `180` (int)
     */
    public readonly groupIntervalSeconds!: pulumi.Output<number | undefined>;
    /**
     * The project alert rule group wait seconds. Default: `180` (int)
     */
    public readonly groupWaitSeconds!: pulumi.Output<number | undefined>;
    /**
     * The project alert rule inherited. Default: `true` (bool)
     */
    public readonly inherited!: pulumi.Output<boolean | undefined>;
    /**
     * The project alert rule labels (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * The project alert rule metric rule. ConflictsWith: `"podRule", "workloadRule"`` (list Maxitems:1)
     */
    public readonly metricRule!: pulumi.Output<outputs.ProjectAlertRuleMetricRule | undefined>;
    /**
     * The project alert rule name (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The project alert rule pod rule. ConflictsWith: `"metricRule", "workloadRule"`` (list Maxitems:1)
     */
    public readonly podRule!: pulumi.Output<outputs.ProjectAlertRulePodRule | undefined>;
    /**
     * The project id where create project alert rule (string)
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * The project alert rule wait seconds. Default: `3600` (int)
     */
    public readonly repeatIntervalSeconds!: pulumi.Output<number | undefined>;
    /**
     * The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
     */
    public readonly severity!: pulumi.Output<string | undefined>;
    /**
     * The project alert rule workload rule. ConflictsWith: `"metricRule", "podRule"`` (list Maxitems:1)
     */
    public readonly workloadRule!: pulumi.Output<outputs.ProjectAlertRuleWorkloadRule | undefined>;

    /**
     * Create a ProjectAlertRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProjectAlertRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProjectAlertRuleArgs | ProjectAlertRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProjectAlertRuleState | undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["groupId"] = state ? state.groupId : undefined;
            resourceInputs["groupIntervalSeconds"] = state ? state.groupIntervalSeconds : undefined;
            resourceInputs["groupWaitSeconds"] = state ? state.groupWaitSeconds : undefined;
            resourceInputs["inherited"] = state ? state.inherited : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["metricRule"] = state ? state.metricRule : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["podRule"] = state ? state.podRule : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["repeatIntervalSeconds"] = state ? state.repeatIntervalSeconds : undefined;
            resourceInputs["severity"] = state ? state.severity : undefined;
            resourceInputs["workloadRule"] = state ? state.workloadRule : undefined;
        } else {
            const args = argsOrState as ProjectAlertRuleArgs | undefined;
            if ((!args || args.groupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'groupId'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["groupId"] = args ? args.groupId : undefined;
            resourceInputs["groupIntervalSeconds"] = args ? args.groupIntervalSeconds : undefined;
            resourceInputs["groupWaitSeconds"] = args ? args.groupWaitSeconds : undefined;
            resourceInputs["inherited"] = args ? args.inherited : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["metricRule"] = args ? args.metricRule : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["podRule"] = args ? args.podRule : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["repeatIntervalSeconds"] = args ? args.repeatIntervalSeconds : undefined;
            resourceInputs["severity"] = args ? args.severity : undefined;
            resourceInputs["workloadRule"] = args ? args.workloadRule : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ProjectAlertRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProjectAlertRule resources.
 */
export interface ProjectAlertRuleState {
    /**
     * The project alert rule annotations (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The project alert rule alert group ID (string)
     */
    groupId?: pulumi.Input<string>;
    /**
     * The project alert rule group interval seconds. Default: `180` (int)
     */
    groupIntervalSeconds?: pulumi.Input<number>;
    /**
     * The project alert rule group wait seconds. Default: `180` (int)
     */
    groupWaitSeconds?: pulumi.Input<number>;
    /**
     * The project alert rule inherited. Default: `true` (bool)
     */
    inherited?: pulumi.Input<boolean>;
    /**
     * The project alert rule labels (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The project alert rule metric rule. ConflictsWith: `"podRule", "workloadRule"`` (list Maxitems:1)
     */
    metricRule?: pulumi.Input<inputs.ProjectAlertRuleMetricRule>;
    /**
     * The project alert rule name (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The project alert rule pod rule. ConflictsWith: `"metricRule", "workloadRule"`` (list Maxitems:1)
     */
    podRule?: pulumi.Input<inputs.ProjectAlertRulePodRule>;
    /**
     * The project id where create project alert rule (string)
     */
    projectId?: pulumi.Input<string>;
    /**
     * The project alert rule wait seconds. Default: `3600` (int)
     */
    repeatIntervalSeconds?: pulumi.Input<number>;
    /**
     * The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
     */
    severity?: pulumi.Input<string>;
    /**
     * The project alert rule workload rule. ConflictsWith: `"metricRule", "podRule"`` (list Maxitems:1)
     */
    workloadRule?: pulumi.Input<inputs.ProjectAlertRuleWorkloadRule>;
}

/**
 * The set of arguments for constructing a ProjectAlertRule resource.
 */
export interface ProjectAlertRuleArgs {
    /**
     * The project alert rule annotations (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The project alert rule alert group ID (string)
     */
    groupId: pulumi.Input<string>;
    /**
     * The project alert rule group interval seconds. Default: `180` (int)
     */
    groupIntervalSeconds?: pulumi.Input<number>;
    /**
     * The project alert rule group wait seconds. Default: `180` (int)
     */
    groupWaitSeconds?: pulumi.Input<number>;
    /**
     * The project alert rule inherited. Default: `true` (bool)
     */
    inherited?: pulumi.Input<boolean>;
    /**
     * The project alert rule labels (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The project alert rule metric rule. ConflictsWith: `"podRule", "workloadRule"`` (list Maxitems:1)
     */
    metricRule?: pulumi.Input<inputs.ProjectAlertRuleMetricRule>;
    /**
     * The project alert rule name (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The project alert rule pod rule. ConflictsWith: `"metricRule", "workloadRule"`` (list Maxitems:1)
     */
    podRule?: pulumi.Input<inputs.ProjectAlertRulePodRule>;
    /**
     * The project id where create project alert rule (string)
     */
    projectId: pulumi.Input<string>;
    /**
     * The project alert rule wait seconds. Default: `3600` (int)
     */
    repeatIntervalSeconds?: pulumi.Input<number>;
    /**
     * The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
     */
    severity?: pulumi.Input<string>;
    /**
     * The project alert rule workload rule. ConflictsWith: `"metricRule", "podRule"`` (list Maxitems:1)
     */
    workloadRule?: pulumi.Input<inputs.ProjectAlertRuleWorkloadRule>;
}
