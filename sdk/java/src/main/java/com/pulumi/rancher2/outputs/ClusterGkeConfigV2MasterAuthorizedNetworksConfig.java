// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlock;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterGkeConfigV2MasterAuthorizedNetworksConfig {
    /**
     * @return The GKE master authorized network config cidr blocks (List)
     * 
     */
    private final List<ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlock> cidrBlocks;
    /**
     * @return Enable scheduled cluster scan. Default: `false` (bool)
     * 
     */
    private final @Nullable Boolean enabled;

    @CustomType.Constructor
    private ClusterGkeConfigV2MasterAuthorizedNetworksConfig(
        @CustomType.Parameter("cidrBlocks") List<ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlock> cidrBlocks,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled) {
        this.cidrBlocks = cidrBlocks;
        this.enabled = enabled;
    }

    /**
     * @return The GKE master authorized network config cidr blocks (List)
     * 
     */
    public List<ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlock> cidrBlocks() {
        return this.cidrBlocks;
    }
    /**
     * @return Enable scheduled cluster scan. Default: `false` (bool)
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterGkeConfigV2MasterAuthorizedNetworksConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlock> cidrBlocks;
        private @Nullable Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterGkeConfigV2MasterAuthorizedNetworksConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlocks = defaults.cidrBlocks;
    	      this.enabled = defaults.enabled;
        }

        public Builder cidrBlocks(List<ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlock> cidrBlocks) {
            this.cidrBlocks = Objects.requireNonNull(cidrBlocks);
            return this;
        }
        public Builder cidrBlocks(ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlock... cidrBlocks) {
            return cidrBlocks(List.of(cidrBlocks));
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }        public ClusterGkeConfigV2MasterAuthorizedNetworksConfig build() {
            return new ClusterGkeConfigV2MasterAuthorizedNetworksConfig(cidrBlocks, enabled);
        }
    }
}