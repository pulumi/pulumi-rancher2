// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomUserTokenArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomUserTokenArgs Empty = new CustomUserTokenArgs();

    /**
     * (Computed) Annotations of the token (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,Object>> annotations;

    /**
     * @return (Computed) Annotations of the token (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Cluster ID for scoped token (string)
     * 
     */
    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    /**
     * @return Cluster ID for scoped token (string)
     * 
     */
    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * Token description (string)
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Token description (string)
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * (Computed) Labels of the token (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return (Computed) Labels of the token (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The user password (string)
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return The user password (string)
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * Renew expired or disabled token
     * 
     */
    @Import(name="renew")
    private @Nullable Output<Boolean> renew;

    /**
     * @return Renew expired or disabled token
     * 
     */
    public Optional<Output<Boolean>> renew() {
        return Optional.ofNullable(this.renew);
    }

    /**
     * Token time to live in seconds. Default `0` (int)
     * 
     * From Rancher v2.4.6 `ttl` is read in minutes at Rancher API. To avoid breaking change on the provider, we still read in seconds but rounding up division if required.
     * 
     */
    @Import(name="ttl")
    private @Nullable Output<Integer> ttl;

    /**
     * @return Token time to live in seconds. Default `0` (int)
     * 
     * From Rancher v2.4.6 `ttl` is read in minutes at Rancher API. To avoid breaking change on the provider, we still read in seconds but rounding up division if required.
     * 
     */
    public Optional<Output<Integer>> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    /**
     * The user username (string)
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return The user username (string)
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private CustomUserTokenArgs() {}

    private CustomUserTokenArgs(CustomUserTokenArgs $) {
        this.annotations = $.annotations;
        this.clusterId = $.clusterId;
        this.description = $.description;
        this.labels = $.labels;
        this.password = $.password;
        this.renew = $.renew;
        this.ttl = $.ttl;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomUserTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomUserTokenArgs $;

        public Builder() {
            $ = new CustomUserTokenArgs();
        }

        public Builder(CustomUserTokenArgs defaults) {
            $ = new CustomUserTokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations (Computed) Annotations of the token (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations (Computed) Annotations of the token (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param clusterId Cluster ID for scoped token (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId Cluster ID for scoped token (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param description Token description (string)
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Token description (string)
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param labels (Computed) Labels of the token (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels (Computed) Labels of the token (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param password The user password (string)
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The user password (string)
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param renew Renew expired or disabled token
         * 
         * @return builder
         * 
         */
        public Builder renew(@Nullable Output<Boolean> renew) {
            $.renew = renew;
            return this;
        }

        /**
         * @param renew Renew expired or disabled token
         * 
         * @return builder
         * 
         */
        public Builder renew(Boolean renew) {
            return renew(Output.of(renew));
        }

        /**
         * @param ttl Token time to live in seconds. Default `0` (int)
         * 
         * From Rancher v2.4.6 `ttl` is read in minutes at Rancher API. To avoid breaking change on the provider, we still read in seconds but rounding up division if required.
         * 
         * @return builder
         * 
         */
        public Builder ttl(@Nullable Output<Integer> ttl) {
            $.ttl = ttl;
            return this;
        }

        /**
         * @param ttl Token time to live in seconds. Default `0` (int)
         * 
         * From Rancher v2.4.6 `ttl` is read in minutes at Rancher API. To avoid breaking change on the provider, we still read in seconds but rounding up division if required.
         * 
         * @return builder
         * 
         */
        public Builder ttl(Integer ttl) {
            return ttl(Output.of(ttl));
        }

        /**
         * @param username The user username (string)
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The user username (string)
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public CustomUserTokenArgs build() {
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}