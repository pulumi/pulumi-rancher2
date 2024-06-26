// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthenticationArgs Empty = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthenticationArgs();

    @Import(name="sans")
    private @Nullable Output<List<String>> sans;

    public Optional<Output<List<String>>> sans() {
        return Optional.ofNullable(this.sans);
    }

    @Import(name="strategy")
    private @Nullable Output<String> strategy;

    public Optional<Output<String>> strategy() {
        return Optional.ofNullable(this.strategy);
    }

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthenticationArgs() {}

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthenticationArgs(ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthenticationArgs $) {
        this.sans = $.sans;
        this.strategy = $.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthenticationArgs $;

        public Builder() {
            $ = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthenticationArgs();
        }

        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthenticationArgs defaults) {
            $ = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        public Builder sans(@Nullable Output<List<String>> sans) {
            $.sans = sans;
            return this;
        }

        public Builder sans(List<String> sans) {
            return sans(Output.of(sans));
        }

        public Builder sans(String... sans) {
            return sans(List.of(sans));
        }

        public Builder strategy(@Nullable Output<String> strategy) {
            $.strategy = strategy;
            return this;
        }

        public Builder strategy(String strategy) {
            return strategy(Output.of(strategy));
        }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthenticationArgs build() {
            return $;
        }
    }

}
