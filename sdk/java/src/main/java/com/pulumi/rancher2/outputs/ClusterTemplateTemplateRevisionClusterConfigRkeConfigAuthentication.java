// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthentication {
    private final @Nullable List<String> sans;
    private final @Nullable String strategy;

    @CustomType.Constructor
    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthentication(
        @CustomType.Parameter("sans") @Nullable List<String> sans,
        @CustomType.Parameter("strategy") @Nullable String strategy) {
        this.sans = sans;
        this.strategy = strategy;
    }

    public List<String> sans() {
        return this.sans == null ? List.of() : this.sans;
    }
    public Optional<String> strategy() {
        return Optional.ofNullable(this.strategy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthentication defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> sans;
        private @Nullable String strategy;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sans = defaults.sans;
    	      this.strategy = defaults.strategy;
        }

        public Builder sans(@Nullable List<String> sans) {
            this.sans = sans;
            return this;
        }
        public Builder sans(String... sans) {
            return sans(List.of(sans));
        }
        public Builder strategy(@Nullable String strategy) {
            this.strategy = strategy;
            return this;
        }        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthentication build() {
            return new ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthentication(sans, strategy);
        }
    }
}