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
     * @return Rolling update max surge (string)
     * 
     */
    private final @Nullable String maxSurge;
    /**
     * @return Rolling update max unavailable (string)
     * 
     */
    private final @Nullable String maxUnavailable;

    @CustomType.Constructor
    private ClusterV2RkeConfigMachinePoolRollingUpdate(
        @CustomType.Parameter("maxSurge") @Nullable String maxSurge,
        @CustomType.Parameter("maxUnavailable") @Nullable String maxUnavailable) {
        this.maxSurge = maxSurge;
        this.maxUnavailable = maxUnavailable;
    }

    /**
     * @return Rolling update max surge (string)
     * 
     */
    public Optional<String> maxSurge() {
        return Optional.ofNullable(this.maxSurge);
    }
    /**
     * @return Rolling update max unavailable (string)
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

    public static final class Builder {
        private @Nullable String maxSurge;
        private @Nullable String maxUnavailable;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterV2RkeConfigMachinePoolRollingUpdate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSurge = defaults.maxSurge;
    	      this.maxUnavailable = defaults.maxUnavailable;
        }

        public Builder maxSurge(@Nullable String maxSurge) {
            this.maxSurge = maxSurge;
            return this;
        }
        public Builder maxUnavailable(@Nullable String maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }        public ClusterV2RkeConfigMachinePoolRollingUpdate build() {
            return new ClusterV2RkeConfigMachinePoolRollingUpdate(maxSurge, maxUnavailable);
        }
    }
}