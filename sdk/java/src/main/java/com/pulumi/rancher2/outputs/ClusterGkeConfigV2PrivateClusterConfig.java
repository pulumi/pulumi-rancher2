// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterGkeConfigV2PrivateClusterConfig {
    /**
     * @return Enable GKE cluster private endpoint. Default: `false` (bool)
     * 
     */
    private final @Nullable Boolean enablePrivateEndpoint;
    /**
     * @return Specifies whether worker nodes will be deployed into a new, private, subnet. Default `false` (bool)
     * 
     */
    private final @Nullable Boolean enablePrivateNodes;
    /**
     * @return The GKE cluster private master ip v4 cidr block (string)
     * 
     */
    private final String masterIpv4CidrBlock;

    @CustomType.Constructor
    private ClusterGkeConfigV2PrivateClusterConfig(
        @CustomType.Parameter("enablePrivateEndpoint") @Nullable Boolean enablePrivateEndpoint,
        @CustomType.Parameter("enablePrivateNodes") @Nullable Boolean enablePrivateNodes,
        @CustomType.Parameter("masterIpv4CidrBlock") String masterIpv4CidrBlock) {
        this.enablePrivateEndpoint = enablePrivateEndpoint;
        this.enablePrivateNodes = enablePrivateNodes;
        this.masterIpv4CidrBlock = masterIpv4CidrBlock;
    }

    /**
     * @return Enable GKE cluster private endpoint. Default: `false` (bool)
     * 
     */
    public Optional<Boolean> enablePrivateEndpoint() {
        return Optional.ofNullable(this.enablePrivateEndpoint);
    }
    /**
     * @return Specifies whether worker nodes will be deployed into a new, private, subnet. Default `false` (bool)
     * 
     */
    public Optional<Boolean> enablePrivateNodes() {
        return Optional.ofNullable(this.enablePrivateNodes);
    }
    /**
     * @return The GKE cluster private master ip v4 cidr block (string)
     * 
     */
    public String masterIpv4CidrBlock() {
        return this.masterIpv4CidrBlock;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterGkeConfigV2PrivateClusterConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enablePrivateEndpoint;
        private @Nullable Boolean enablePrivateNodes;
        private String masterIpv4CidrBlock;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterGkeConfigV2PrivateClusterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enablePrivateEndpoint = defaults.enablePrivateEndpoint;
    	      this.enablePrivateNodes = defaults.enablePrivateNodes;
    	      this.masterIpv4CidrBlock = defaults.masterIpv4CidrBlock;
        }

        public Builder enablePrivateEndpoint(@Nullable Boolean enablePrivateEndpoint) {
            this.enablePrivateEndpoint = enablePrivateEndpoint;
            return this;
        }
        public Builder enablePrivateNodes(@Nullable Boolean enablePrivateNodes) {
            this.enablePrivateNodes = enablePrivateNodes;
            return this;
        }
        public Builder masterIpv4CidrBlock(String masterIpv4CidrBlock) {
            this.masterIpv4CidrBlock = Objects.requireNonNull(masterIpv4CidrBlock);
            return this;
        }        public ClusterGkeConfigV2PrivateClusterConfig build() {
            return new ClusterGkeConfigV2PrivateClusterConfig(enablePrivateEndpoint, enablePrivateNodes, masterIpv4CidrBlock);
        }
    }
}