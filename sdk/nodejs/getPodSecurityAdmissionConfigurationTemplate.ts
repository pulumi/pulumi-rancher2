// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a rancher v2 pod security admission configration template.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * const foo = rancher2.getPodSecurityAdmissionConfigurationTemplate({
 *     name: "foo",
 * });
 * ```
 */
export function getPodSecurityAdmissionConfigurationTemplate(args: GetPodSecurityAdmissionConfigurationTemplateArgs, opts?: pulumi.InvokeOptions): Promise<GetPodSecurityAdmissionConfigurationTemplateResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("rancher2:index/getPodSecurityAdmissionConfigurationTemplate:getPodSecurityAdmissionConfigurationTemplate", {
        "annotations": args.annotations,
        "labels": args.labels,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getPodSecurityAdmissionConfigurationTemplate.
 */
export interface GetPodSecurityAdmissionConfigurationTemplateArgs {
    /**
     * (Computed) Annotations of the resource (map)
     */
    annotations?: {[key: string]: string};
    /**
     * (Computed) Labels of the resource (map)
     */
    labels?: {[key: string]: string};
    /**
     * The name of the pod security admission configuration template (string)
     */
    name: string;
}

/**
 * A collection of values returned by getPodSecurityAdmissionConfigurationTemplate.
 */
export interface GetPodSecurityAdmissionConfigurationTemplateResult {
    /**
     * (Computed) Annotations of the resource (map)
     */
    readonly annotations: {[key: string]: string};
    /**
     * (Computed) The default level labels and version labels to be applied when labels for a mode is not set (list maxitems:1)
     */
    readonly defaults: outputs.GetPodSecurityAdmissionConfigurationTemplateDefaults;
    /**
     * (Computed) The description of the pod security admission configuration template (string)
     */
    readonly description: string;
    /**
     * (Computed) The authenticated usernames, runtime class names, and namespaces to exempt (list maxitems:1)
     */
    readonly exemptions: outputs.GetPodSecurityAdmissionConfigurationTemplateExemptions;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Computed) Labels of the resource (map)
     */
    readonly labels: {[key: string]: string};
    readonly name: string;
}
/**
 * Use this data source to retrieve information about a rancher v2 pod security admission configration template.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * const foo = rancher2.getPodSecurityAdmissionConfigurationTemplate({
 *     name: "foo",
 * });
 * ```
 */
export function getPodSecurityAdmissionConfigurationTemplateOutput(args: GetPodSecurityAdmissionConfigurationTemplateOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetPodSecurityAdmissionConfigurationTemplateResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("rancher2:index/getPodSecurityAdmissionConfigurationTemplate:getPodSecurityAdmissionConfigurationTemplate", {
        "annotations": args.annotations,
        "labels": args.labels,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getPodSecurityAdmissionConfigurationTemplate.
 */
export interface GetPodSecurityAdmissionConfigurationTemplateOutputArgs {
    /**
     * (Computed) Annotations of the resource (map)
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * (Computed) Labels of the resource (map)
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the pod security admission configuration template (string)
     */
    name: pulumi.Input<string>;
}
