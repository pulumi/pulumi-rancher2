// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
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
 * const foo = pulumi.output(rancher2.getGlobalRole({
 *     name: "foo",
 * }, { async: true }));
 * ```
 */
export function getGlobalRole(args: GetGlobalRoleArgs, opts?: pulumi.InvokeOptions): Promise<GetGlobalRoleResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("rancher2:index/getGlobalRole:getGlobalRole", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getGlobalRole.
 */
export interface GetGlobalRoleArgs {
    /**
     * The name of the Global Role (string)
     */
    readonly name: string;
}

/**
 * A collection of values returned by getGlobalRole.
 */
export interface GetGlobalRoleResult {
    /**
     * (Computed) Annotations for global role object (map)
     */
    readonly annotations: {[key: string]: any};
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
     * (Computed) Labels for global role object (map)
     */
    readonly labels: {[key: string]: any};
    readonly name: string;
    /**
     * (Computed) Whether or not this role should be added to new users (bool)
     */
    readonly newUserDefault: boolean;
    /**
     * (Computed) Global role policy rules (list)
     */
    readonly rules: outputs.GetGlobalRoleRule[];
}
