// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Token resource, specifically to create tokens for custom users (i.e. not the 'admin' user configured with the provider config). Custom user tokens can f.e. be used as service account tokens with the Rancher v2 API having limited permissions. To create a custom user token the username/password for the Rancher User must be known.
 *
 * There are 2 kind of tokens:
 * - not scoped: valid for global system.
 * - scoped: valid for just a specific cluster (`clusterId` should be provided).
 *
 * Tokens can only be created for a Rancher User with at least the `user-base` global role binding in order to enable user login.
 *
 * Tokens can't be updated once created. Any diff in token data will recreate the token. If any token expire, Rancher2 provider will generate a diff to regenerate it.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a rancher2 Token
 * const foo = new rancher2.User("foo", {
 *     name: "foo",
 *     username: "foo",
 *     password: "changeme",
 *     enabled: true,
 * });
 * const foo_login = new rancher2.GlobalRoleBinding("foo-login", {
 *     name: "foo-login-binding",
 *     globalRoleId: "user-base",
 *     userId: foo.id,
 * });
 * const fooCustomUserToken = new rancher2.CustomUserToken("foo", {
 *     username: foo.username,
 *     password: foo.password,
 *     description: "foo token",
 *     ttl: 0,
 * }, {
 *     dependsOn: [foo_login],
 * });
 * ```
 */
export class CustomUserToken extends pulumi.CustomResource {
    /**
     * Get an existing CustomUserToken resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CustomUserTokenState, opts?: pulumi.CustomResourceOptions): CustomUserToken {
        return new CustomUserToken(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/customUserToken:CustomUserToken';

    /**
     * Returns true if the given object is an instance of CustomUserToken.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CustomUserToken {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CustomUserToken.__pulumiType;
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
     * The user password (string)
     */
    public readonly password!: pulumi.Output<string>;
    /**
     * Renew expired or disabled token
     */
    public readonly renew!: pulumi.Output<boolean | undefined>;
    /**
     * (Computed/Sensitive) Token secret key part (string)
     */
    public /*out*/ readonly secretKey!: pulumi.Output<string>;
    /**
     * (Computed) Generated API temporary token as helper. Should be empty (string)
     */
    public /*out*/ readonly tempToken!: pulumi.Output<string>;
    /**
     * (Computed) Generated API temporary token id as helper. Should be empty (string)
     */
    public /*out*/ readonly tempTokenId!: pulumi.Output<string>;
    /**
     * (Computed/Sensitive) Token value (string)
     */
    public /*out*/ readonly token!: pulumi.Output<string>;
    /**
     * Token time to live in seconds. Default `0` (int) 
     *
     * From Rancher v2.4.6 `ttl` is read in minutes at Rancher API. To avoid breaking change on the provider, we still read in seconds but rounding up division if required.
     */
    public readonly ttl!: pulumi.Output<number | undefined>;
    /**
     * (Computed) Token user ID (string)
     */
    public /*out*/ readonly userId!: pulumi.Output<string>;
    /**
     * The user username (string)
     */
    public readonly username!: pulumi.Output<string>;

    /**
     * Create a CustomUserToken resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CustomUserTokenArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CustomUserTokenArgs | CustomUserTokenState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CustomUserTokenState | undefined;
            resourceInputs["accessKey"] = state ? state.accessKey : undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["expired"] = state ? state.expired : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["renew"] = state ? state.renew : undefined;
            resourceInputs["secretKey"] = state ? state.secretKey : undefined;
            resourceInputs["tempToken"] = state ? state.tempToken : undefined;
            resourceInputs["tempTokenId"] = state ? state.tempTokenId : undefined;
            resourceInputs["token"] = state ? state.token : undefined;
            resourceInputs["ttl"] = state ? state.ttl : undefined;
            resourceInputs["userId"] = state ? state.userId : undefined;
            resourceInputs["username"] = state ? state.username : undefined;
        } else {
            const args = argsOrState as CustomUserTokenArgs | undefined;
            if ((!args || args.password === undefined) && !opts.urn) {
                throw new Error("Missing required property 'password'");
            }
            if ((!args || args.username === undefined) && !opts.urn) {
                throw new Error("Missing required property 'username'");
            }
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["password"] = args?.password ? pulumi.secret(args.password) : undefined;
            resourceInputs["renew"] = args ? args.renew : undefined;
            resourceInputs["ttl"] = args ? args.ttl : undefined;
            resourceInputs["username"] = args ? args.username : undefined;
            resourceInputs["accessKey"] = undefined /*out*/;
            resourceInputs["enabled"] = undefined /*out*/;
            resourceInputs["expired"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["secretKey"] = undefined /*out*/;
            resourceInputs["tempToken"] = undefined /*out*/;
            resourceInputs["tempTokenId"] = undefined /*out*/;
            resourceInputs["token"] = undefined /*out*/;
            resourceInputs["userId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["password", "secretKey", "tempToken", "token"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(CustomUserToken.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CustomUserToken resources.
 */
export interface CustomUserTokenState {
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
     * The user password (string)
     */
    password?: pulumi.Input<string>;
    /**
     * Renew expired or disabled token
     */
    renew?: pulumi.Input<boolean>;
    /**
     * (Computed/Sensitive) Token secret key part (string)
     */
    secretKey?: pulumi.Input<string>;
    /**
     * (Computed) Generated API temporary token as helper. Should be empty (string)
     */
    tempToken?: pulumi.Input<string>;
    /**
     * (Computed) Generated API temporary token id as helper. Should be empty (string)
     */
    tempTokenId?: pulumi.Input<string>;
    /**
     * (Computed/Sensitive) Token value (string)
     */
    token?: pulumi.Input<string>;
    /**
     * Token time to live in seconds. Default `0` (int) 
     *
     * From Rancher v2.4.6 `ttl` is read in minutes at Rancher API. To avoid breaking change on the provider, we still read in seconds but rounding up division if required.
     */
    ttl?: pulumi.Input<number>;
    /**
     * (Computed) Token user ID (string)
     */
    userId?: pulumi.Input<string>;
    /**
     * The user username (string)
     */
    username?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CustomUserToken resource.
 */
export interface CustomUserTokenArgs {
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
     * The user password (string)
     */
    password: pulumi.Input<string>;
    /**
     * Renew expired or disabled token
     */
    renew?: pulumi.Input<boolean>;
    /**
     * Token time to live in seconds. Default `0` (int) 
     *
     * From Rancher v2.4.6 `ttl` is read in minutes at Rancher API. To avoid breaking change on the provider, we still read in seconds but rounding up division if required.
     */
    ttl?: pulumi.Input<number>;
    /**
     * The user username (string)
     */
    username: pulumi.Input<string>;
}
