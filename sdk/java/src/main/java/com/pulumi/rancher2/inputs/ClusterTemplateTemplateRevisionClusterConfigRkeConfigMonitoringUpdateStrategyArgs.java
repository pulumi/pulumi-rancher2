// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategyRollingUpdateArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategyArgs Empty = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategyArgs();

    /**
     * Rolling update for update strategy
     * 
     */
    @Import(name="rollingUpdate")
    private @Nullable Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategyRollingUpdateArgs> rollingUpdate;

    /**
     * @return Rolling update for update strategy
     * 
     */
    public Optional<Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategyRollingUpdateArgs>> rollingUpdate() {
        return Optional.ofNullable(this.rollingUpdate);
    }

    /**
     * Strategy
     * 
     */
    @Import(name="strategy")
    private @Nullable Output<String> strategy;

    /**
     * @return Strategy
     * 
     */
    public Optional<Output<String>> strategy() {
        return Optional.ofNullable(this.strategy);
    }

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategyArgs() {}

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategyArgs(ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategyArgs $) {
        this.rollingUpdate = $.rollingUpdate;
        this.strategy = $.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategyArgs $;

        public Builder() {
            $ = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategyArgs();
        }

        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategyArgs defaults) {
            $ = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param rollingUpdate Rolling update for update strategy
         * 
         * @return builder
         * 
         */
        public Builder rollingUpdate(@Nullable Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategyRollingUpdateArgs> rollingUpdate) {
            $.rollingUpdate = rollingUpdate;
            return this;
        }

        /**
         * @param rollingUpdate Rolling update for update strategy
         * 
         * @return builder
         * 
         */
        public Builder rollingUpdate(ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategyRollingUpdateArgs rollingUpdate) {
            return rollingUpdate(Output.of(rollingUpdate));
        }

        /**
         * @param strategy Strategy
         * 
         * @return builder
         * 
         */
        public Builder strategy(@Nullable Output<String> strategy) {
            $.strategy = strategy;
            return this;
        }

        /**
         * @param strategy Strategy
         * 
         * @return builder
         * 
         */
        public Builder strategy(String strategy) {
            return strategy(Output.of(strategy));
        }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategyArgs build() {
            return $;
        }
    }

}
