// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher2 configMap v2. ConfigMap v2 resource is available at Rancher v2.5.x and above.
 */
export function getConfigMapV2(args: GetConfigMapV2Args, opts?: pulumi.InvokeOptions): Promise<GetConfigMapV2Result> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("rancher2:index/getConfigMapV2:getConfigMapV2", {
        "clusterId": args.clusterId,
        "name": args.name,
        "namespace": args.namespace,
    }, opts);
}

/**
 * A collection of arguments for invoking getConfigMapV2.
 */
export interface GetConfigMapV2Args {
    /**
     * The cluster id of the configMap V2 (string)
     */
    clusterId: string;
    /**
     * The name of the configMap v2 (string)
     */
    name: string;
    /**
     * The namespaces of the configMap v2. Default: `default` (string)
     */
    namespace?: string;
}

/**
 * A collection of values returned by getConfigMapV2.
 */
export interface GetConfigMapV2Result {
    /**
     * (Computed) Annotations for the configMap v2 (map)
     */
    readonly annotations: {[key: string]: any};
    readonly clusterId: string;
    /**
     * (Computed) The data of the configMap v2 (map)
     */
    readonly data: {[key: string]: any};
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Computed) If set to true, any configMap update will remove and recreate the configMap. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate (bool)
     */
    readonly immutable: boolean;
    /**
     * (Computed) Labels for the configMap v2 (map)
     */
    readonly labels: {[key: string]: any};
    readonly name: string;
    readonly namespace?: string;
    /**
     * (Computed) The k8s resource version (string)
     */
    readonly resourceVersion: string;
}

export function getConfigMapV2Output(args: GetConfigMapV2OutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetConfigMapV2Result> {
    return pulumi.output(args).apply(a => getConfigMapV2(a, opts))
}

/**
 * A collection of arguments for invoking getConfigMapV2.
 */
export interface GetConfigMapV2OutputArgs {
    /**
     * The cluster id of the configMap V2 (string)
     */
    clusterId: pulumi.Input<string>;
    /**
     * The name of the configMap v2 (string)
     */
    name: pulumi.Input<string>;
    /**
     * The namespaces of the configMap v2. Default: `default` (string)
     */
    namespace?: pulumi.Input<string>;
}