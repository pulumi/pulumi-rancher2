// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterV2RkeConfigMachinePoolRollingUpdate {
    /**
     * @return Rolling update max surge
     * 
     */
    private @Nullable String maxSurge;
    /**
     * @return Rolling update max unavailable
     * 
     */
    private @Nullable String maxUnavailable;

    private ClusterV2RkeConfigMachinePoolRollingUpdate() {}
    /**
     * @return Rolling update max surge
     * 
     */
    public Optional<String> maxSurge() {
        return Optional.ofNullable(this.maxSurge);
    }
    /**
     * @return Rolling update max unavailable
     * 
     */
    public Optional<String> maxUnavailable() {
        return Optional.ofNullable(this.maxUnavailable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterV2RkeConfigMachinePoolRollingUpdate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String maxSurge;
        private @Nullable String maxUnavailable;
        public Builder() {}
        public Builder(ClusterV2RkeConfigMachinePoolRollingUpdate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSurge = defaults.maxSurge;
    	      this.maxUnavailable = defaults.maxUnavailable;
        }

        @CustomType.Setter
        public Builder maxSurge(@Nullable String maxSurge) {

            this.maxSurge = maxSurge;
            return this;
        }
        @CustomType.Setter
        public Builder maxUnavailable(@Nullable String maxUnavailable) {

            this.maxUnavailable = maxUnavailable;
            return this;
        }
        public ClusterV2RkeConfigMachinePoolRollingUpdate build() {
            final var _resultValue = new ClusterV2RkeConfigMachinePoolRollingUpdate();
            _resultValue.maxSurge = maxSurge;
            _resultValue.maxUnavailable = maxUnavailable;
            return _resultValue;
        }
    }
}
