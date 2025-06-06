// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Registry resource. This resource creates Kubernetes secrets with the type `kubernetes.io/dockerconfigjson` for authenticating against Docker registries for Rancher v2 environments and retrieving their information.
 *
 * Depending on the availability, there are 2 types of Rancher v2 Docker registry resources:
 * - Project registry resource: Available to all namespaces in the `projectId`.
 * - Namespaced registry resource: Available to `namespaceId` in the `projectId`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 Project Registry
 * const foo = new rancher2.Registry("foo", {
 *     name: "foo",
 *     description: "Terraform registry foo",
 *     projectId: "<project_id>",
 *     registries: [{
 *         address: "test.io",
 *         username: "user",
 *         password: "pass",
 *     }],
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 Namespaced Registry
 * const foo = new rancher2.Registry("foo", {
 *     name: "foo",
 *     description: "Terraform registry foo",
 *     projectId: "<project_id>",
 *     namespaceId: "<namespace_id>",
 *     registries: [{
 *         address: "test.io",
 *         username: "user2",
 *         password: "pass",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Registries can be imported using the registry ID in the format `<namespace_id>.<project_id>.<registry_id>`
 *
 * ```sh
 * $ pulumi import rancher2:index/registry:Registry foo &lt;namespace_id&gt;.&lt;project_id&gt;.&lt;registry_id&gt;
 * ```
 * `<namespace_id>` is optional, just needed for namespaced registry.
 */
export class Registry extends pulumi.CustomResource {
    /**
     * Get an existing Registry resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RegistryState, opts?: pulumi.CustomResourceOptions): Registry {
        return new Registry(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/registry:Registry';

    /**
     * Returns true if the given object is an instance of Registry.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Registry {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Registry.__pulumiType;
    }

    /**
     * Annotations for Registry object (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: string}>;
    /**
     * A registry description (string)
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Labels for Registry object (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: string}>;
    /**
     * The name of the registry (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The namespace id where to assign the namespaced registry (string)
     */
    public readonly namespaceId!: pulumi.Output<string | undefined>;
    /**
     * The project id where to assign the registry (string)
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Registries data for registry (list)
     */
    public readonly registries!: pulumi.Output<outputs.RegistryRegistry[]>;

    /**
     * Create a Registry resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RegistryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RegistryArgs | RegistryState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RegistryState | undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["namespaceId"] = state ? state.namespaceId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["registries"] = state ? state.registries : undefined;
        } else {
            const args = argsOrState as RegistryArgs | undefined;
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.registries === undefined) && !opts.urn) {
                throw new Error("Missing required property 'registries'");
            }
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["namespaceId"] = args ? args.namespaceId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["registries"] = args ? args.registries : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Registry.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Registry resources.
 */
export interface RegistryState {
    /**
     * Annotations for Registry object (map)
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A registry description (string)
     */
    description?: pulumi.Input<string>;
    /**
     * Labels for Registry object (map)
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the registry (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The namespace id where to assign the namespaced registry (string)
     */
    namespaceId?: pulumi.Input<string>;
    /**
     * The project id where to assign the registry (string)
     */
    projectId?: pulumi.Input<string>;
    /**
     * Registries data for registry (list)
     */
    registries?: pulumi.Input<pulumi.Input<inputs.RegistryRegistry>[]>;
}

/**
 * The set of arguments for constructing a Registry resource.
 */
export interface RegistryArgs {
    /**
     * Annotations for Registry object (map)
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A registry description (string)
     */
    description?: pulumi.Input<string>;
    /**
     * Labels for Registry object (map)
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the registry (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The namespace id where to assign the namespaced registry (string)
     */
    namespaceId?: pulumi.Input<string>;
    /**
     * The project id where to assign the registry (string)
     */
    projectId: pulumi.Input<string>;
    /**
     * Registries data for registry (list)
     */
    registries: pulumi.Input<pulumi.Input<inputs.RegistryRegistry>[]>;
}
