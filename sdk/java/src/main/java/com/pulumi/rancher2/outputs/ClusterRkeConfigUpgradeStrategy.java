// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterRkeConfigUpgradeStrategyDrainInput;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRkeConfigUpgradeStrategy {
    /**
     * @return RKE drain nodes. Default: `false` (bool)
     * 
     */
    private final @Nullable Boolean drain;
    /**
     * @return RKE drain node input (list Maxitems: 1)
     * 
     */
    private final @Nullable ClusterRkeConfigUpgradeStrategyDrainInput drainInput;
    /**
     * @return RKE max unavailable controlplane nodes. Default: `1` (string)
     * 
     */
    private final @Nullable String maxUnavailableControlplane;
    /**
     * @return RKE max unavailable worker nodes. Default: `10%` (string)
     * 
     */
    private final @Nullable String maxUnavailableWorker;

    @CustomType.Constructor
    private ClusterRkeConfigUpgradeStrategy(
        @CustomType.Parameter("drain") @Nullable Boolean drain,
        @CustomType.Parameter("drainInput") @Nullable ClusterRkeConfigUpgradeStrategyDrainInput drainInput,
        @CustomType.Parameter("maxUnavailableControlplane") @Nullable String maxUnavailableControlplane,
        @CustomType.Parameter("maxUnavailableWorker") @Nullable String maxUnavailableWorker) {
        this.drain = drain;
        this.drainInput = drainInput;
        this.maxUnavailableControlplane = maxUnavailableControlplane;
        this.maxUnavailableWorker = maxUnavailableWorker;
    }

    /**
     * @return RKE drain nodes. Default: `false` (bool)
     * 
     */
    public Optional<Boolean> drain() {
        return Optional.ofNullable(this.drain);
    }
    /**
     * @return RKE drain node input (list Maxitems: 1)
     * 
     */
    public Optional<ClusterRkeConfigUpgradeStrategyDrainInput> drainInput() {
        return Optional.ofNullable(this.drainInput);
    }
    /**
     * @return RKE max unavailable controlplane nodes. Default: `1` (string)
     * 
     */
    public Optional<String> maxUnavailableControlplane() {
        return Optional.ofNullable(this.maxUnavailableControlplane);
    }
    /**
     * @return RKE max unavailable worker nodes. Default: `10%` (string)
     * 
     */
    public Optional<String> maxUnavailableWorker() {
        return Optional.ofNullable(this.maxUnavailableWorker);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigUpgradeStrategy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean drain;
        private @Nullable ClusterRkeConfigUpgradeStrategyDrainInput drainInput;
        private @Nullable String maxUnavailableControlplane;
        private @Nullable String maxUnavailableWorker;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterRkeConfigUpgradeStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.drain = defaults.drain;
    	      this.drainInput = defaults.drainInput;
    	      this.maxUnavailableControlplane = defaults.maxUnavailableControlplane;
    	      this.maxUnavailableWorker = defaults.maxUnavailableWorker;
        }

        public Builder drain(@Nullable Boolean drain) {
            this.drain = drain;
            return this;
        }
        public Builder drainInput(@Nullable ClusterRkeConfigUpgradeStrategyDrainInput drainInput) {
            this.drainInput = drainInput;
            return this;
        }
        public Builder maxUnavailableControlplane(@Nullable String maxUnavailableControlplane) {
            this.maxUnavailableControlplane = maxUnavailableControlplane;
            return this;
        }
        public Builder maxUnavailableWorker(@Nullable String maxUnavailableWorker) {
            this.maxUnavailableWorker = maxUnavailableWorker;
            return this;
        }        public ClusterRkeConfigUpgradeStrategy build() {
            return new ClusterRkeConfigUpgradeStrategy(drain, drainInput, maxUnavailableControlplane, maxUnavailableWorker);
        }
    }
}