// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher2 secret v2. Secret v2 resource is available at Rancher v2.5.x and above.
 */
export function getSecretV2(args: GetSecretV2Args, opts?: pulumi.InvokeOptions): Promise<GetSecretV2Result> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("rancher2:index/getSecretV2:getSecretV2", {
        "clusterId": args.clusterId,
        "name": args.name,
        "namespace": args.namespace,
    }, opts);
}

/**
 * A collection of arguments for invoking getSecretV2.
 */
export interface GetSecretV2Args {
    /**
     * The cluster id of the secret V2 (string)
     */
    clusterId: string;
    /**
     * The name of the secret v2 (string)
     */
    name: string;
    /**
     * The namespaces of the secret v2. Default: `default` (string)
     */
    namespace?: string;
}

/**
 * A collection of values returned by getSecretV2.
 */
export interface GetSecretV2Result {
    /**
     * (Computed) Annotations for the secret v2 (map)
     */
    readonly annotations: {[key: string]: string};
    readonly clusterId: string;
    /**
     * (Computed/Sensitive) The data of the secret v2 (map)
     */
    readonly data: {[key: string]: string};
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Computed) If set to true, any secret update will remove and recreate the secret. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate (bool)
     */
    readonly immutable: boolean;
    /**
     * (Computed) Labels for the secret v2 (map)
     */
    readonly labels: {[key: string]: string};
    readonly name: string;
    readonly namespace?: string;
    /**
     * (Computed) The k8s resource version (string)
     */
    readonly resourceVersion: string;
    /**
     * (Computed) The type of the k8s secret, used to facilitate programmatic handling of secret data, [More info](https://github.com/kubernetes/api/blob/release-1.20/core/v1/types.go#L5772) about k8s secret types and expected format (string)
     */
    readonly type: string;
}
/**
 * Use this data source to retrieve information about a Rancher2 secret v2. Secret v2 resource is available at Rancher v2.5.x and above.
 */
export function getSecretV2Output(args: GetSecretV2OutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSecretV2Result> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("rancher2:index/getSecretV2:getSecretV2", {
        "clusterId": args.clusterId,
        "name": args.name,
        "namespace": args.namespace,
    }, opts);
}

/**
 * A collection of arguments for invoking getSecretV2.
 */
export interface GetSecretV2OutputArgs {
    /**
     * The cluster id of the secret V2 (string)
     */
    clusterId: pulumi.Input<string>;
    /**
     * The name of the secret v2 (string)
     */
    name: pulumi.Input<string>;
    /**
     * The namespaces of the secret v2. Default: `default` (string)
     */
    namespace?: pulumi.Input<string>;
}
