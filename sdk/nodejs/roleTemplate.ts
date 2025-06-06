// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Role Template resource. This can be used to create Role Template for Rancher v2 and retrieve their information.
 *
 * `cluster` and `project` scopes are supported for role templates.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 cluster Role Template
 * const foo = new rancher2.RoleTemplate("foo", {
 *     name: "foo",
 *     context: "cluster",
 *     defaultRole: true,
 *     description: "Terraform role template acceptance test",
 *     rules: [{
 *         apiGroups: ["*"],
 *         resources: ["secrets"],
 *         verbs: ["create"],
 *     }],
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 project Role Template
 * const foo = new rancher2.RoleTemplate("foo", {
 *     name: "foo",
 *     context: "project",
 *     defaultRole: true,
 *     description: "Terraform role template acceptance test",
 *     rules: [{
 *         apiGroups: ["*"],
 *         resources: ["secrets"],
 *         verbs: ["create"],
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Role Template can be imported using the Rancher Role Template ID
 *
 * ```sh
 * $ pulumi import rancher2:index/roleTemplate:RoleTemplate foo &lt;role_template_id&gt;
 * ```
 */
export class RoleTemplate extends pulumi.CustomResource {
    /**
     * Get an existing RoleTemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RoleTemplateState, opts?: pulumi.CustomResourceOptions): RoleTemplate {
        return new RoleTemplate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/roleTemplate:RoleTemplate';

    /**
     * Returns true if the given object is an instance of RoleTemplate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RoleTemplate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RoleTemplate.__pulumiType;
    }

    /**
     * Administrative role template. Default `false` (bool)
     */
    public readonly administrative!: pulumi.Output<boolean | undefined>;
    /**
     * Annotations for role template object (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: string}>;
    /**
     * (Computed) Builtin role template (string)
     */
    public /*out*/ readonly builtin!: pulumi.Output<boolean>;
    /**
     * Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
     */
    public readonly context!: pulumi.Output<string | undefined>;
    /**
     * Default role template for new created cluster or project. Default `false` (bool)
     */
    public readonly defaultRole!: pulumi.Output<boolean | undefined>;
    /**
     * Role template description (string)
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * External role template. Default `false` (bool)
     */
    public readonly external!: pulumi.Output<boolean | undefined>;
    /**
     * External rules used for authorization. This field is required when `external=true` and no underlying ClusterRole exists. (list)
     */
    public readonly externalRules!: pulumi.Output<outputs.RoleTemplateExternalRule[]>;
    /**
     * Hidden role template. Default `false` (bool)
     */
    public readonly hidden!: pulumi.Output<boolean | undefined>;
    /**
     * Labels for role template object (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: string}>;
    /**
     * Locked role template. Default `false` (bool)
     */
    public readonly locked!: pulumi.Output<boolean | undefined>;
    /**
     * Role template name (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Inherit role template IDs (list)
     */
    public readonly roleTemplateIds!: pulumi.Output<string[]>;
    /**
     * Role template policy rules (list)
     */
    public readonly rules!: pulumi.Output<outputs.RoleTemplateRule[]>;

    /**
     * Create a RoleTemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: RoleTemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RoleTemplateArgs | RoleTemplateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RoleTemplateState | undefined;
            resourceInputs["administrative"] = state ? state.administrative : undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["builtin"] = state ? state.builtin : undefined;
            resourceInputs["context"] = state ? state.context : undefined;
            resourceInputs["defaultRole"] = state ? state.defaultRole : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["external"] = state ? state.external : undefined;
            resourceInputs["externalRules"] = state ? state.externalRules : undefined;
            resourceInputs["hidden"] = state ? state.hidden : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["locked"] = state ? state.locked : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["roleTemplateIds"] = state ? state.roleTemplateIds : undefined;
            resourceInputs["rules"] = state ? state.rules : undefined;
        } else {
            const args = argsOrState as RoleTemplateArgs | undefined;
            resourceInputs["administrative"] = args ? args.administrative : undefined;
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["context"] = args ? args.context : undefined;
            resourceInputs["defaultRole"] = args ? args.defaultRole : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["external"] = args ? args.external : undefined;
            resourceInputs["externalRules"] = args ? args.externalRules : undefined;
            resourceInputs["hidden"] = args ? args.hidden : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["locked"] = args ? args.locked : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["roleTemplateIds"] = args ? args.roleTemplateIds : undefined;
            resourceInputs["rules"] = args ? args.rules : undefined;
            resourceInputs["builtin"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RoleTemplate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RoleTemplate resources.
 */
export interface RoleTemplateState {
    /**
     * Administrative role template. Default `false` (bool)
     */
    administrative?: pulumi.Input<boolean>;
    /**
     * Annotations for role template object (map)
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * (Computed) Builtin role template (string)
     */
    builtin?: pulumi.Input<boolean>;
    /**
     * Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
     */
    context?: pulumi.Input<string>;
    /**
     * Default role template for new created cluster or project. Default `false` (bool)
     */
    defaultRole?: pulumi.Input<boolean>;
    /**
     * Role template description (string)
     */
    description?: pulumi.Input<string>;
    /**
     * External role template. Default `false` (bool)
     */
    external?: pulumi.Input<boolean>;
    /**
     * External rules used for authorization. This field is required when `external=true` and no underlying ClusterRole exists. (list)
     */
    externalRules?: pulumi.Input<pulumi.Input<inputs.RoleTemplateExternalRule>[]>;
    /**
     * Hidden role template. Default `false` (bool)
     */
    hidden?: pulumi.Input<boolean>;
    /**
     * Labels for role template object (map)
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Locked role template. Default `false` (bool)
     */
    locked?: pulumi.Input<boolean>;
    /**
     * Role template name (string)
     */
    name?: pulumi.Input<string>;
    /**
     * Inherit role template IDs (list)
     */
    roleTemplateIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Role template policy rules (list)
     */
    rules?: pulumi.Input<pulumi.Input<inputs.RoleTemplateRule>[]>;
}

/**
 * The set of arguments for constructing a RoleTemplate resource.
 */
export interface RoleTemplateArgs {
    /**
     * Administrative role template. Default `false` (bool)
     */
    administrative?: pulumi.Input<boolean>;
    /**
     * Annotations for role template object (map)
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
     */
    context?: pulumi.Input<string>;
    /**
     * Default role template for new created cluster or project. Default `false` (bool)
     */
    defaultRole?: pulumi.Input<boolean>;
    /**
     * Role template description (string)
     */
    description?: pulumi.Input<string>;
    /**
     * External role template. Default `false` (bool)
     */
    external?: pulumi.Input<boolean>;
    /**
     * External rules used for authorization. This field is required when `external=true` and no underlying ClusterRole exists. (list)
     */
    externalRules?: pulumi.Input<pulumi.Input<inputs.RoleTemplateExternalRule>[]>;
    /**
     * Hidden role template. Default `false` (bool)
     */
    hidden?: pulumi.Input<boolean>;
    /**
     * Labels for role template object (map)
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Locked role template. Default `false` (bool)
     */
    locked?: pulumi.Input<boolean>;
    /**
     * Role template name (string)
     */
    name?: pulumi.Input<string>;
    /**
     * Inherit role template IDs (list)
     */
    roleTemplateIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Role template policy rules (list)
     */
    rules?: pulumi.Input<pulumi.Input<inputs.RoleTemplateRule>[]>;
}
