// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 docker registry.
 *
 * Depending of the availability, there are 2 types of Rancher v2 docker registries:
 * - Project registry: Available to all namespaces in the `projectId`
 * - Namespaced registry: Available to just `namespaceId` in the `projectId`
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Retrieve a rancher2 Project Registry
 * const foo = rancher2.getRegistry({
 *     name: "<name>",
 *     projectId: "<project_id>",
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Retrieve a rancher2 Namespaced Registry
 * const foo = rancher2.getRegistry({
 *     name: "<name>",
 *     projectId: "<project_id>",
 *     namespaceId: "<namespace_id>",
 * });
 * ```
 */
export function getRegistry(args: GetRegistryArgs, opts?: pulumi.InvokeOptions): Promise<GetRegistryResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("rancher2:index/getRegistry:getRegistry", {
        "name": args.name,
        "namespaceId": args.namespaceId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getRegistry.
 */
export interface GetRegistryArgs {
    /**
     * The name of the registry (string)
     */
    name: string;
    /**
     * The namespace id where to assign the namespaced registry (string)
     */
    namespaceId?: string;
    /**
     * The project id where to assign the registry (string)
     */
    projectId: string;
}

/**
 * A collection of values returned by getRegistry.
 */
export interface GetRegistryResult {
    /**
     * (Computed) Annotations for Registry object (map)
     */
    readonly annotations: {[key: string]: string};
    /**
     * (Computed) A registry description (string)
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Computed) Labels for Registry object (map)
     */
    readonly labels: {[key: string]: string};
    readonly name: string;
    readonly namespaceId?: string;
    readonly projectId: string;
    /**
     * (Computed) Registries data for registry (list)
     */
    readonly registries: outputs.GetRegistryRegistry[];
}
/**
 * Use this data source to retrieve information about a Rancher v2 docker registry.
 *
 * Depending of the availability, there are 2 types of Rancher v2 docker registries:
 * - Project registry: Available to all namespaces in the `projectId`
 * - Namespaced registry: Available to just `namespaceId` in the `projectId`
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Retrieve a rancher2 Project Registry
 * const foo = rancher2.getRegistry({
 *     name: "<name>",
 *     projectId: "<project_id>",
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Retrieve a rancher2 Namespaced Registry
 * const foo = rancher2.getRegistry({
 *     name: "<name>",
 *     projectId: "<project_id>",
 *     namespaceId: "<namespace_id>",
 * });
 * ```
 */
export function getRegistryOutput(args: GetRegistryOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetRegistryResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("rancher2:index/getRegistry:getRegistry", {
        "name": args.name,
        "namespaceId": args.namespaceId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getRegistry.
 */
export interface GetRegistryOutputArgs {
    /**
     * The name of the registry (string)
     */
    name: pulumi.Input<string>;
    /**
     * The namespace id where to assign the namespaced registry (string)
     */
    namespaceId?: pulumi.Input<string>;
    /**
     * The project id where to assign the registry (string)
     */
    projectId: pulumi.Input<string>;
}
