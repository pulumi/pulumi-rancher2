// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.outputs.GetClusterRkeConfigUpgradeStrategyDrainInput;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterRkeConfigUpgradeStrategy {
    private @Nullable Boolean drain;
    private GetClusterRkeConfigUpgradeStrategyDrainInput drainInput;
    private @Nullable String maxUnavailableControlplane;
    private @Nullable String maxUnavailableWorker;

    private GetClusterRkeConfigUpgradeStrategy() {}
    public Optional<Boolean> drain() {
        return Optional.ofNullable(this.drain);
    }
    public GetClusterRkeConfigUpgradeStrategyDrainInput drainInput() {
        return this.drainInput;
    }
    public Optional<String> maxUnavailableControlplane() {
        return Optional.ofNullable(this.maxUnavailableControlplane);
    }
    public Optional<String> maxUnavailableWorker() {
        return Optional.ofNullable(this.maxUnavailableWorker);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterRkeConfigUpgradeStrategy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean drain;
        private GetClusterRkeConfigUpgradeStrategyDrainInput drainInput;
        private @Nullable String maxUnavailableControlplane;
        private @Nullable String maxUnavailableWorker;
        public Builder() {}
        public Builder(GetClusterRkeConfigUpgradeStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.drain = defaults.drain;
    	      this.drainInput = defaults.drainInput;
    	      this.maxUnavailableControlplane = defaults.maxUnavailableControlplane;
    	      this.maxUnavailableWorker = defaults.maxUnavailableWorker;
        }

        @CustomType.Setter
        public Builder drain(@Nullable Boolean drain) {

            this.drain = drain;
            return this;
        }
        @CustomType.Setter
        public Builder drainInput(GetClusterRkeConfigUpgradeStrategyDrainInput drainInput) {
            if (drainInput == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigUpgradeStrategy", "drainInput");
            }
            this.drainInput = drainInput;
            return this;
        }
        @CustomType.Setter
        public Builder maxUnavailableControlplane(@Nullable String maxUnavailableControlplane) {

            this.maxUnavailableControlplane = maxUnavailableControlplane;
            return this;
        }
        @CustomType.Setter
        public Builder maxUnavailableWorker(@Nullable String maxUnavailableWorker) {

            this.maxUnavailableWorker = maxUnavailableWorker;
            return this;
        }
        public GetClusterRkeConfigUpgradeStrategy build() {
            final var _resultValue = new GetClusterRkeConfigUpgradeStrategy();
            _resultValue.drain = drain;
            _resultValue.drainInput = drainInput;
            _resultValue.maxUnavailableControlplane = maxUnavailableControlplane;
            _resultValue.maxUnavailableWorker = maxUnavailableWorker;
            return _resultValue;
        }
    }
}
