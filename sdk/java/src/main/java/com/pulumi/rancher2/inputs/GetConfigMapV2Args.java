// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConfigMapV2Args extends com.pulumi.resources.InvokeArgs {

    public static final GetConfigMapV2Args Empty = new GetConfigMapV2Args();

    /**
     * The cluster id of the configMap V2 (string)
     * 
     */
    @Import(name="clusterId", required=true)
    private Output<String> clusterId;

    /**
     * @return The cluster id of the configMap V2 (string)
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }

    /**
     * The name of the configMap v2 (string)
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the configMap v2 (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The namespaces of the configMap v2. Default: `default` (string)
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return The namespaces of the configMap v2. Default: `default` (string)
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    private GetConfigMapV2Args() {}

    private GetConfigMapV2Args(GetConfigMapV2Args $) {
        this.clusterId = $.clusterId;
        this.name = $.name;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConfigMapV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConfigMapV2Args $;

        public Builder() {
            $ = new GetConfigMapV2Args();
        }

        public Builder(GetConfigMapV2Args defaults) {
            $ = new GetConfigMapV2Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The cluster id of the configMap V2 (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The cluster id of the configMap V2 (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param name The name of the configMap v2 (string)
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the configMap v2 (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespace The namespaces of the configMap v2. Default: `default` (string)
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace The namespaces of the configMap v2. Default: `default` (string)
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public GetConfigMapV2Args build() {
            if ($.clusterId == null) {
                throw new MissingRequiredPropertyException("GetConfigMapV2Args", "clusterId");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetConfigMapV2Args", "name");
            }
            return $;
        }
    }

}
