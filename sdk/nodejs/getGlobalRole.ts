// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 global role resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * const foo = rancher2.getGlobalRole({
 *     name: "foo",
 * });
 * ```
 */
export function getGlobalRole(args: GetGlobalRoleArgs, opts?: pulumi.InvokeOptions): Promise<GetGlobalRoleResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("rancher2:index/getGlobalRole:getGlobalRole", {
        "inheritedClusterRoles": args.inheritedClusterRoles,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getGlobalRole.
 */
export interface GetGlobalRoleArgs {
    /**
     * (Optional) Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster (list)
     */
    inheritedClusterRoles?: string[];
    /**
     * The name of the Global Role (string)
     */
    name: string;
}

/**
 * A collection of values returned by getGlobalRole.
 */
export interface GetGlobalRoleResult {
    /**
     * (Computed) Annotations for global role object (map)
     */
    readonly annotations: {[key: string]: string};
    /**
     * (Computed) Builtin global role (bool)
     */
    readonly builtin: boolean;
    /**
     * (Computed) Global role description (string)
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Optional) Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster (list)
     */
    readonly inheritedClusterRoles?: string[];
    /**
     * (Computed) Labels for global role object (map)
     */
    readonly labels: {[key: string]: string};
    readonly name: string;
    /**
     * (Computed) Whether or not this role should be added to new users (bool)
     */
    readonly newUserDefault: boolean;
    /**
     * (Computed) Global role policy rules (list)
     */
    readonly rules: outputs.GetGlobalRoleRule[];
    /**
     * (Computed) Global role uuid (string)
     */
    readonly uuid: string;
}
/**
 * Use this data source to retrieve information about a Rancher v2 global role resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * const foo = rancher2.getGlobalRole({
 *     name: "foo",
 * });
 * ```
 */
export function getGlobalRoleOutput(args: GetGlobalRoleOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetGlobalRoleResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("rancher2:index/getGlobalRole:getGlobalRole", {
        "inheritedClusterRoles": args.inheritedClusterRoles,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getGlobalRole.
 */
export interface GetGlobalRoleOutputArgs {
    /**
     * (Optional) Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster (list)
     */
    inheritedClusterRoles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the Global Role (string)
     */
    name: pulumi.Input<string>;
}
