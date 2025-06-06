// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Cluster Driver resource. This can be used to create Cluster Driver for Rancher v2.2.x Kontainer Engine clusters and retrieve their information.
 *
 * ## Import
 *
 * Cluster Driver can be imported using the Rancher Cluster Driver ID
 *
 * ```sh
 * $ pulumi import rancher2:index/clusterDriver:ClusterDriver foo &lt;CLUSTER_DRIVER_ID&gt;
 * ```
 */
export class ClusterDriver extends pulumi.CustomResource {
    /**
     * Get an existing ClusterDriver resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterDriverState, opts?: pulumi.CustomResourceOptions): ClusterDriver {
        return new ClusterDriver(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/clusterDriver:ClusterDriver';

    /**
     * Returns true if the given object is an instance of ClusterDriver.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ClusterDriver {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ClusterDriver.__pulumiType;
    }

    /**
     * Specify the cluster driver state (bool)
     */
    public readonly active!: pulumi.Output<boolean>;
    /**
     * Actual url of the cluster driver (string)
     */
    public readonly actualUrl!: pulumi.Output<string | undefined>;
    /**
     * Annotations of the resource (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: string}>;
    /**
     * Specify whether the cluster driver is an internal cluster driver or not (bool)
     */
    public readonly builtin!: pulumi.Output<boolean>;
    /**
     * Verify that the downloaded driver matches the expected checksum (string)
     */
    public readonly checksum!: pulumi.Output<string | undefined>;
    /**
     * Labels of the resource (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: string}>;
    /**
     * Name of the cluster driver (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The URL to load for customized Add Clusters screen for this driver (string)
     */
    public readonly uiUrl!: pulumi.Output<string | undefined>;
    /**
     * The URL to download the machine driver binary for 64-bit Linux (string)
     */
    public readonly url!: pulumi.Output<string>;
    /**
     * Domains to whitelist for the ui (list)
     */
    public readonly whitelistDomains!: pulumi.Output<string[] | undefined>;

    /**
     * Create a ClusterDriver resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClusterDriverArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterDriverArgs | ClusterDriverState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterDriverState | undefined;
            resourceInputs["active"] = state ? state.active : undefined;
            resourceInputs["actualUrl"] = state ? state.actualUrl : undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["builtin"] = state ? state.builtin : undefined;
            resourceInputs["checksum"] = state ? state.checksum : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["uiUrl"] = state ? state.uiUrl : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
            resourceInputs["whitelistDomains"] = state ? state.whitelistDomains : undefined;
        } else {
            const args = argsOrState as ClusterDriverArgs | undefined;
            if ((!args || args.active === undefined) && !opts.urn) {
                throw new Error("Missing required property 'active'");
            }
            if ((!args || args.builtin === undefined) && !opts.urn) {
                throw new Error("Missing required property 'builtin'");
            }
            if ((!args || args.url === undefined) && !opts.urn) {
                throw new Error("Missing required property 'url'");
            }
            resourceInputs["active"] = args ? args.active : undefined;
            resourceInputs["actualUrl"] = args ? args.actualUrl : undefined;
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["builtin"] = args ? args.builtin : undefined;
            resourceInputs["checksum"] = args ? args.checksum : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["uiUrl"] = args ? args.uiUrl : undefined;
            resourceInputs["url"] = args ? args.url : undefined;
            resourceInputs["whitelistDomains"] = args ? args.whitelistDomains : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ClusterDriver.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ClusterDriver resources.
 */
export interface ClusterDriverState {
    /**
     * Specify the cluster driver state (bool)
     */
    active?: pulumi.Input<boolean>;
    /**
     * Actual url of the cluster driver (string)
     */
    actualUrl?: pulumi.Input<string>;
    /**
     * Annotations of the resource (map)
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Specify whether the cluster driver is an internal cluster driver or not (bool)
     */
    builtin?: pulumi.Input<boolean>;
    /**
     * Verify that the downloaded driver matches the expected checksum (string)
     */
    checksum?: pulumi.Input<string>;
    /**
     * Labels of the resource (map)
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Name of the cluster driver (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The URL to load for customized Add Clusters screen for this driver (string)
     */
    uiUrl?: pulumi.Input<string>;
    /**
     * The URL to download the machine driver binary for 64-bit Linux (string)
     */
    url?: pulumi.Input<string>;
    /**
     * Domains to whitelist for the ui (list)
     */
    whitelistDomains?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a ClusterDriver resource.
 */
export interface ClusterDriverArgs {
    /**
     * Specify the cluster driver state (bool)
     */
    active: pulumi.Input<boolean>;
    /**
     * Actual url of the cluster driver (string)
     */
    actualUrl?: pulumi.Input<string>;
    /**
     * Annotations of the resource (map)
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Specify whether the cluster driver is an internal cluster driver or not (bool)
     */
    builtin: pulumi.Input<boolean>;
    /**
     * Verify that the downloaded driver matches the expected checksum (string)
     */
    checksum?: pulumi.Input<string>;
    /**
     * Labels of the resource (map)
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Name of the cluster driver (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The URL to load for customized Add Clusters screen for this driver (string)
     */
    uiUrl?: pulumi.Input<string>;
    /**
     * The URL to download the machine driver binary for 64-bit Linux (string)
     */
    url: pulumi.Input<string>;
    /**
     * Domains to whitelist for the ui (list)
     */
    whitelistDomains?: pulumi.Input<pulumi.Input<string>[]>;
}
