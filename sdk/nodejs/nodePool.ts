// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Node Pool resource. This can be used to create Node Pool, using Node template for Rancher v2 RKE clusters and retrieve their information.
 *
 * ## Import
 *
 * Node Pool can be imported using the Rancher Node Pool ID
 *
 * ```sh
 * $ pulumi import rancher2:index/nodePool:NodePool foo &lt;node_pool_id&gt;
 * ```
 */
export class NodePool extends pulumi.CustomResource {
    /**
     * Get an existing NodePool resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NodePoolState, opts?: pulumi.CustomResourceOptions): NodePool {
        return new NodePool(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/nodePool:NodePool';

    /**
     * Returns true if the given object is an instance of NodePool.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NodePool {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NodePool.__pulumiType;
    }

    /**
     * Annotations for Node Pool object (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: string}>;
    /**
     * The RKE cluster id to use Node Pool (string)
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * RKE control plane role for created nodes (bool)
     */
    public readonly controlPlane!: pulumi.Output<boolean | undefined>;
    /**
     * Delete not ready node after secs. For Rancher v2.3.3 and above. Default `0` (int)
     */
    public readonly deleteNotReadyAfterSecs!: pulumi.Output<number | undefined>;
    /**
     * Drain nodes before delete. Default: `false` (bool)
     */
    public readonly drainBeforeDelete!: pulumi.Output<boolean | undefined>;
    /**
     * RKE etcd role for created nodes (bool)
     */
    public readonly etcd!: pulumi.Output<boolean | undefined>;
    /**
     * The prefix for created nodes of the Node Pool (string)
     */
    public readonly hostnamePrefix!: pulumi.Output<string>;
    /**
     * Labels for Node Pool object (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: string}>;
    /**
     * The name of the Node Pool (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Node taints. For Rancher v2.3.3 and above (List)
     */
    public readonly nodeTaints!: pulumi.Output<outputs.NodePoolNodeTaint[] | undefined>;
    /**
     * The Node Template ID to use for node creation (string)
     */
    public readonly nodeTemplateId!: pulumi.Output<string>;
    /**
     * The number of nodes to create on Node Pool. Default `1`. Only values >= 1 allowed (int)
     */
    public readonly quantity!: pulumi.Output<number | undefined>;
    /**
     * RKE role role for created nodes (bool)
     */
    public readonly worker!: pulumi.Output<boolean | undefined>;

    /**
     * Create a NodePool resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NodePoolArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NodePoolArgs | NodePoolState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NodePoolState | undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["controlPlane"] = state ? state.controlPlane : undefined;
            resourceInputs["deleteNotReadyAfterSecs"] = state ? state.deleteNotReadyAfterSecs : undefined;
            resourceInputs["drainBeforeDelete"] = state ? state.drainBeforeDelete : undefined;
            resourceInputs["etcd"] = state ? state.etcd : undefined;
            resourceInputs["hostnamePrefix"] = state ? state.hostnamePrefix : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nodeTaints"] = state ? state.nodeTaints : undefined;
            resourceInputs["nodeTemplateId"] = state ? state.nodeTemplateId : undefined;
            resourceInputs["quantity"] = state ? state.quantity : undefined;
            resourceInputs["worker"] = state ? state.worker : undefined;
        } else {
            const args = argsOrState as NodePoolArgs | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            if ((!args || args.hostnamePrefix === undefined) && !opts.urn) {
                throw new Error("Missing required property 'hostnamePrefix'");
            }
            if ((!args || args.nodeTemplateId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'nodeTemplateId'");
            }
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["controlPlane"] = args ? args.controlPlane : undefined;
            resourceInputs["deleteNotReadyAfterSecs"] = args ? args.deleteNotReadyAfterSecs : undefined;
            resourceInputs["drainBeforeDelete"] = args ? args.drainBeforeDelete : undefined;
            resourceInputs["etcd"] = args ? args.etcd : undefined;
            resourceInputs["hostnamePrefix"] = args ? args.hostnamePrefix : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nodeTaints"] = args ? args.nodeTaints : undefined;
            resourceInputs["nodeTemplateId"] = args ? args.nodeTemplateId : undefined;
            resourceInputs["quantity"] = args ? args.quantity : undefined;
            resourceInputs["worker"] = args ? args.worker : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NodePool.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NodePool resources.
 */
export interface NodePoolState {
    /**
     * Annotations for Node Pool object (map)
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The RKE cluster id to use Node Pool (string)
     */
    clusterId?: pulumi.Input<string>;
    /**
     * RKE control plane role for created nodes (bool)
     */
    controlPlane?: pulumi.Input<boolean>;
    /**
     * Delete not ready node after secs. For Rancher v2.3.3 and above. Default `0` (int)
     */
    deleteNotReadyAfterSecs?: pulumi.Input<number>;
    /**
     * Drain nodes before delete. Default: `false` (bool)
     */
    drainBeforeDelete?: pulumi.Input<boolean>;
    /**
     * RKE etcd role for created nodes (bool)
     */
    etcd?: pulumi.Input<boolean>;
    /**
     * The prefix for created nodes of the Node Pool (string)
     */
    hostnamePrefix?: pulumi.Input<string>;
    /**
     * Labels for Node Pool object (map)
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the Node Pool (string)
     */
    name?: pulumi.Input<string>;
    /**
     * Node taints. For Rancher v2.3.3 and above (List)
     */
    nodeTaints?: pulumi.Input<pulumi.Input<inputs.NodePoolNodeTaint>[]>;
    /**
     * The Node Template ID to use for node creation (string)
     */
    nodeTemplateId?: pulumi.Input<string>;
    /**
     * The number of nodes to create on Node Pool. Default `1`. Only values >= 1 allowed (int)
     */
    quantity?: pulumi.Input<number>;
    /**
     * RKE role role for created nodes (bool)
     */
    worker?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a NodePool resource.
 */
export interface NodePoolArgs {
    /**
     * Annotations for Node Pool object (map)
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The RKE cluster id to use Node Pool (string)
     */
    clusterId: pulumi.Input<string>;
    /**
     * RKE control plane role for created nodes (bool)
     */
    controlPlane?: pulumi.Input<boolean>;
    /**
     * Delete not ready node after secs. For Rancher v2.3.3 and above. Default `0` (int)
     */
    deleteNotReadyAfterSecs?: pulumi.Input<number>;
    /**
     * Drain nodes before delete. Default: `false` (bool)
     */
    drainBeforeDelete?: pulumi.Input<boolean>;
    /**
     * RKE etcd role for created nodes (bool)
     */
    etcd?: pulumi.Input<boolean>;
    /**
     * The prefix for created nodes of the Node Pool (string)
     */
    hostnamePrefix: pulumi.Input<string>;
    /**
     * Labels for Node Pool object (map)
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the Node Pool (string)
     */
    name?: pulumi.Input<string>;
    /**
     * Node taints. For Rancher v2.3.3 and above (List)
     */
    nodeTaints?: pulumi.Input<pulumi.Input<inputs.NodePoolNodeTaint>[]>;
    /**
     * The Node Template ID to use for node creation (string)
     */
    nodeTemplateId: pulumi.Input<string>;
    /**
     * The number of nodes to create on Node Pool. Default `1`. Only values >= 1 allowed (int)
     */
    quantity?: pulumi.Input<number>;
    /**
     * RKE role role for created nodes (bool)
     */
    worker?: pulumi.Input<boolean>;
}
