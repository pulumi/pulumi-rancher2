// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterV2RkeConfigRegistriesMirrorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterV2RkeConfigRegistriesMirrorArgs Empty = new ClusterV2RkeConfigRegistriesMirrorArgs();

    /**
     * Registry mirror endpoints (List)
     * 
     */
    @Import(name="endpoints")
    private @Nullable Output<List<String>> endpoints;

    /**
     * @return Registry mirror endpoints (List)
     * 
     */
    public Optional<Output<List<String>>> endpoints() {
        return Optional.ofNullable(this.endpoints);
    }

    /**
     * Registry hostname (string)
     * 
     */
    @Import(name="hostname", required=true)
    private Output<String> hostname;

    /**
     * @return Registry hostname (string)
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }

    /**
     * Registry mirror rewrites (map)
     * 
     */
    @Import(name="rewrites")
    private @Nullable Output<Map<String,Object>> rewrites;

    /**
     * @return Registry mirror rewrites (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> rewrites() {
        return Optional.ofNullable(this.rewrites);
    }

    private ClusterV2RkeConfigRegistriesMirrorArgs() {}

    private ClusterV2RkeConfigRegistriesMirrorArgs(ClusterV2RkeConfigRegistriesMirrorArgs $) {
        this.endpoints = $.endpoints;
        this.hostname = $.hostname;
        this.rewrites = $.rewrites;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterV2RkeConfigRegistriesMirrorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterV2RkeConfigRegistriesMirrorArgs $;

        public Builder() {
            $ = new ClusterV2RkeConfigRegistriesMirrorArgs();
        }

        public Builder(ClusterV2RkeConfigRegistriesMirrorArgs defaults) {
            $ = new ClusterV2RkeConfigRegistriesMirrorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpoints Registry mirror endpoints (List)
         * 
         * @return builder
         * 
         */
        public Builder endpoints(@Nullable Output<List<String>> endpoints) {
            $.endpoints = endpoints;
            return this;
        }

        /**
         * @param endpoints Registry mirror endpoints (List)
         * 
         * @return builder
         * 
         */
        public Builder endpoints(List<String> endpoints) {
            return endpoints(Output.of(endpoints));
        }

        /**
         * @param endpoints Registry mirror endpoints (List)
         * 
         * @return builder
         * 
         */
        public Builder endpoints(String... endpoints) {
            return endpoints(List.of(endpoints));
        }

        /**
         * @param hostname Registry hostname (string)
         * 
         * @return builder
         * 
         */
        public Builder hostname(Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname Registry hostname (string)
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param rewrites Registry mirror rewrites (map)
         * 
         * @return builder
         * 
         */
        public Builder rewrites(@Nullable Output<Map<String,Object>> rewrites) {
            $.rewrites = rewrites;
            return this;
        }

        /**
         * @param rewrites Registry mirror rewrites (map)
         * 
         * @return builder
         * 
         */
        public Builder rewrites(Map<String,Object> rewrites) {
            return rewrites(Output.of(rewrites));
        }

        public ClusterV2RkeConfigRegistriesMirrorArgs build() {
            $.hostname = Objects.requireNonNull($.hostname, "expected parameter 'hostname' to be non-null");
            return $;
        }
    }

}