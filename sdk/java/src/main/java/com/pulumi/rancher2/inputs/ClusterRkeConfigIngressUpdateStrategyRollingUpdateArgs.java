// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRkeConfigIngressUpdateStrategyRollingUpdateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRkeConfigIngressUpdateStrategyRollingUpdateArgs Empty = new ClusterRkeConfigIngressUpdateStrategyRollingUpdateArgs();

    /**
     * Rolling update max unavailable
     * 
     */
    @Import(name="maxUnavailable")
    private @Nullable Output<Integer> maxUnavailable;

    /**
     * @return Rolling update max unavailable
     * 
     */
    public Optional<Output<Integer>> maxUnavailable() {
        return Optional.ofNullable(this.maxUnavailable);
    }

    private ClusterRkeConfigIngressUpdateStrategyRollingUpdateArgs() {}

    private ClusterRkeConfigIngressUpdateStrategyRollingUpdateArgs(ClusterRkeConfigIngressUpdateStrategyRollingUpdateArgs $) {
        this.maxUnavailable = $.maxUnavailable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRkeConfigIngressUpdateStrategyRollingUpdateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRkeConfigIngressUpdateStrategyRollingUpdateArgs $;

        public Builder() {
            $ = new ClusterRkeConfigIngressUpdateStrategyRollingUpdateArgs();
        }

        public Builder(ClusterRkeConfigIngressUpdateStrategyRollingUpdateArgs defaults) {
            $ = new ClusterRkeConfigIngressUpdateStrategyRollingUpdateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxUnavailable Rolling update max unavailable
         * 
         * @return builder
         * 
         */
        public Builder maxUnavailable(@Nullable Output<Integer> maxUnavailable) {
            $.maxUnavailable = maxUnavailable;
            return this;
        }

        /**
         * @param maxUnavailable Rolling update max unavailable
         * 
         * @return builder
         * 
         */
        public Builder maxUnavailable(Integer maxUnavailable) {
            return maxUnavailable(Output.of(maxUnavailable));
        }

        public ClusterRkeConfigIngressUpdateStrategyRollingUpdateArgs build() {
            return $;
        }
    }

}
