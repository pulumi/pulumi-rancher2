// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecretV2PlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecretV2PlainArgs Empty = new GetSecretV2PlainArgs();

    /**
     * The cluster id of the secret V2 (string)
     * 
     */
    @Import(name="clusterId", required=true)
    private String clusterId;

    /**
     * @return The cluster id of the secret V2 (string)
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }

    /**
     * The name of the secret v2 (string)
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the secret v2 (string)
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The namespaces of the secret v2. Default: `default` (string)
     * 
     */
    @Import(name="namespace")
    private @Nullable String namespace;

    /**
     * @return The namespaces of the secret v2. Default: `default` (string)
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    private GetSecretV2PlainArgs() {}

    private GetSecretV2PlainArgs(GetSecretV2PlainArgs $) {
        this.clusterId = $.clusterId;
        this.name = $.name;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecretV2PlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecretV2PlainArgs $;

        public Builder() {
            $ = new GetSecretV2PlainArgs();
        }

        public Builder(GetSecretV2PlainArgs defaults) {
            $ = new GetSecretV2PlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The cluster id of the secret V2 (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param name The name of the secret v2 (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param namespace The namespaces of the secret v2. Default: `default` (string)
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable String namespace) {
            $.namespace = namespace;
            return this;
        }

        public GetSecretV2PlainArgs build() {
            if ($.clusterId == null) {
                throw new MissingRequiredPropertyException("GetSecretV2PlainArgs", "clusterId");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetSecretV2PlainArgs", "name");
            }
            return $;
        }
    }

}
