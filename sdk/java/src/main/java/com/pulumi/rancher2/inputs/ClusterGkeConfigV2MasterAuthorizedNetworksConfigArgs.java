// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlockArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterGkeConfigV2MasterAuthorizedNetworksConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterGkeConfigV2MasterAuthorizedNetworksConfigArgs Empty = new ClusterGkeConfigV2MasterAuthorizedNetworksConfigArgs();

    /**
     * The GKE master authorized network config cidr blocks (List)
     * 
     */
    @Import(name="cidrBlocks", required=true)
    private Output<List<ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlockArgs>> cidrBlocks;

    /**
     * @return The GKE master authorized network config cidr blocks (List)
     * 
     */
    public Output<List<ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlockArgs>> cidrBlocks() {
        return this.cidrBlocks;
    }

    /**
     * Enable scheduled cluster scan. Default: `false` (bool)
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enable scheduled cluster scan. Default: `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private ClusterGkeConfigV2MasterAuthorizedNetworksConfigArgs() {}

    private ClusterGkeConfigV2MasterAuthorizedNetworksConfigArgs(ClusterGkeConfigV2MasterAuthorizedNetworksConfigArgs $) {
        this.cidrBlocks = $.cidrBlocks;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterGkeConfigV2MasterAuthorizedNetworksConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterGkeConfigV2MasterAuthorizedNetworksConfigArgs $;

        public Builder() {
            $ = new ClusterGkeConfigV2MasterAuthorizedNetworksConfigArgs();
        }

        public Builder(ClusterGkeConfigV2MasterAuthorizedNetworksConfigArgs defaults) {
            $ = new ClusterGkeConfigV2MasterAuthorizedNetworksConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidrBlocks The GKE master authorized network config cidr blocks (List)
         * 
         * @return builder
         * 
         */
        public Builder cidrBlocks(Output<List<ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlockArgs>> cidrBlocks) {
            $.cidrBlocks = cidrBlocks;
            return this;
        }

        /**
         * @param cidrBlocks The GKE master authorized network config cidr blocks (List)
         * 
         * @return builder
         * 
         */
        public Builder cidrBlocks(List<ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlockArgs> cidrBlocks) {
            return cidrBlocks(Output.of(cidrBlocks));
        }

        /**
         * @param cidrBlocks The GKE master authorized network config cidr blocks (List)
         * 
         * @return builder
         * 
         */
        public Builder cidrBlocks(ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlockArgs... cidrBlocks) {
            return cidrBlocks(List.of(cidrBlocks));
        }

        /**
         * @param enabled Enable scheduled cluster scan. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable scheduled cluster scan. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ClusterGkeConfigV2MasterAuthorizedNetworksConfigArgs build() {
            $.cidrBlocks = Objects.requireNonNull($.cidrBlocks, "expected parameter 'cidrBlocks' to be non-null");
            return $;
        }
    }

}