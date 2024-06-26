// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.ClusterK3sConfigUpgradeStrategyArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterK3sConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterK3sConfigArgs Empty = new ClusterK3sConfigArgs();

    /**
     * The K3S upgrade strategy
     * 
     */
    @Import(name="upgradeStrategy")
    private @Nullable Output<ClusterK3sConfigUpgradeStrategyArgs> upgradeStrategy;

    /**
     * @return The K3S upgrade strategy
     * 
     */
    public Optional<Output<ClusterK3sConfigUpgradeStrategyArgs>> upgradeStrategy() {
        return Optional.ofNullable(this.upgradeStrategy);
    }

    /**
     * The K3S kubernetes version
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The K3S kubernetes version
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private ClusterK3sConfigArgs() {}

    private ClusterK3sConfigArgs(ClusterK3sConfigArgs $) {
        this.upgradeStrategy = $.upgradeStrategy;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterK3sConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterK3sConfigArgs $;

        public Builder() {
            $ = new ClusterK3sConfigArgs();
        }

        public Builder(ClusterK3sConfigArgs defaults) {
            $ = new ClusterK3sConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param upgradeStrategy The K3S upgrade strategy
         * 
         * @return builder
         * 
         */
        public Builder upgradeStrategy(@Nullable Output<ClusterK3sConfigUpgradeStrategyArgs> upgradeStrategy) {
            $.upgradeStrategy = upgradeStrategy;
            return this;
        }

        /**
         * @param upgradeStrategy The K3S upgrade strategy
         * 
         * @return builder
         * 
         */
        public Builder upgradeStrategy(ClusterK3sConfigUpgradeStrategyArgs upgradeStrategy) {
            return upgradeStrategy(Output.of(upgradeStrategy));
        }

        /**
         * @param version The K3S kubernetes version
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The K3S kubernetes version
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ClusterK3sConfigArgs build() {
            return $;
        }
    }

}
