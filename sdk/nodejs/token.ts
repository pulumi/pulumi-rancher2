// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Token resource. This can be used to create Tokens for Rancher v2 provider user and retrieve their information.
 *
 * There are 2 kind of tokens:
 * - no scoped: valid for global system.
 * - scoped: valid for just a specific cluster (`clusterId` should be provided).
 *
 * Tokens can't be updated once created. Any diff in token data will recreate the token. If any token expire, Rancher2 provider will generate a diff to regenerate it.
 */
export class Token extends pulumi.CustomResource {
    /**
     * Get an existing Token resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TokenState, opts?: pulumi.CustomResourceOptions): Token {
        return new Token(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/token:Token';

    /**
     * Returns true if the given object is an instance of Token.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Token {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Token.__pulumiType;
    }

    /**
     * (Computed) Token access key part (string)
     */
    public /*out*/ readonly accessKey!: pulumi.Output<string>;
    /**
     * (Computed) Annotations of the token (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: string}>;
    /**
     * Cluster ID for scoped token (string)
     */
    public readonly clusterId!: pulumi.Output<string | undefined>;
    /**
     * Token description (string)
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * (Computed) Token is enabled (bool)
     */
    public /*out*/ readonly enabled!: pulumi.Output<boolean>;
    /**
     * (Computed) Token is expired (bool)
     */
    public /*out*/ readonly expired!: pulumi.Output<boolean>;
    /**
     * (Computed) Labels of the token (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: string}>;
    /**
     * (Computed) Token name (string)
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * Renew expired or disabled token
     */
    public readonly renew!: pulumi.Output<boolean | undefined>;
    /**
     * (Computed/Sensitive) Token secret key part (string)
     */
    public /*out*/ readonly secretKey!: pulumi.Output<string>;
    /**
     * (Computed/Sensitive) Token value (string)
     */
    public /*out*/ readonly token!: pulumi.Output<string>;
    /**
     * Token time to live in seconds. Default `0` (int) 
     *
     * From Rancher v2.4.6 `ttl` is readed in minutes at Rancher API. To avoid breaking change on the provider, we still read in seconds but rounding up division if required.
     */
    public readonly ttl!: pulumi.Output<number | undefined>;
    /**
     * (Computed) Token user ID (string)
     */
    public /*out*/ readonly userId!: pulumi.Output<string>;

    /**
     * Create a Token resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: TokenArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TokenArgs | TokenState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TokenState | undefined;
            resourceInputs["accessKey"] = state ? state.accessKey : undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["expired"] = state ? state.expired : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["renew"] = state ? state.renew : undefined;
            resourceInputs["secretKey"] = state ? state.secretKey : undefined;
            resourceInputs["token"] = state ? state.token : undefined;
            resourceInputs["ttl"] = state ? state.ttl : undefined;
            resourceInputs["userId"] = state ? state.userId : undefined;
        } else {
            const args = argsOrState as TokenArgs | undefined;
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["renew"] = args ? args.renew : undefined;
            resourceInputs["ttl"] = args ? args.ttl : undefined;
            resourceInputs["accessKey"] = undefined /*out*/;
            resourceInputs["enabled"] = undefined /*out*/;
            resourceInputs["expired"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["secretKey"] = undefined /*out*/;
            resourceInputs["token"] = undefined /*out*/;
            resourceInputs["userId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["secretKey", "token"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Token.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Token resources.
 */
export interface TokenState {
    /**
     * (Computed) Token access key part (string)
     */
    accessKey?: pulumi.Input<string>;
    /**
     * (Computed) Annotations of the token (map)
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Cluster ID for scoped token (string)
     */
    clusterId?: pulumi.Input<string>;
    /**
     * Token description (string)
     */
    description?: pulumi.Input<string>;
    /**
     * (Computed) Token is enabled (bool)
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * (Computed) Token is expired (bool)
     */
    expired?: pulumi.Input<boolean>;
    /**
     * (Computed) Labels of the token (map)
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * (Computed) Token name (string)
     */
    name?: pulumi.Input<string>;
    /**
     * Renew expired or disabled token
     */
    renew?: pulumi.Input<boolean>;
    /**
     * (Computed/Sensitive) Token secret key part (string)
     */
    secretKey?: pulumi.Input<string>;
    /**
     * (Computed/Sensitive) Token value (string)
     */
    token?: pulumi.Input<string>;
    /**
     * Token time to live in seconds. Default `0` (int) 
     *
     * From Rancher v2.4.6 `ttl` is readed in minutes at Rancher API. To avoid breaking change on the provider, we still read in seconds but rounding up division if required.
     */
    ttl?: pulumi.Input<number>;
    /**
     * (Computed) Token user ID (string)
     */
    userId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Token resource.
 */
export interface TokenArgs {
    /**
     * (Computed) Annotations of the token (map)
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Cluster ID for scoped token (string)
     */
    clusterId?: pulumi.Input<string>;
    /**
     * Token description (string)
     */
    description?: pulumi.Input<string>;
    /**
     * (Computed) Labels of the token (map)
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Renew expired or disabled token
     */
    renew?: pulumi.Input<boolean>;
    /**
     * Token time to live in seconds. Default `0` (int) 
     *
     * From Rancher v2.4.6 `ttl` is readed in minutes at Rancher API. To avoid breaking change on the provider, we still read in seconds but rounding up division if required.
     */
    ttl?: pulumi.Input<number>;
}
