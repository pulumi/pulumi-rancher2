// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.ClusterScheduledClusterScanScanConfigArgs;
import com.pulumi.rancher2.inputs.ClusterScheduledClusterScanScheduleConfigArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterScheduledClusterScanArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterScheduledClusterScanArgs Empty = new ClusterScheduledClusterScanArgs();

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

    /**
     * Cluster scan config (List maxitems:1)
     * 
     */
    @Import(name="scanConfig", required=true)
    private Output<ClusterScheduledClusterScanScanConfigArgs> scanConfig;

    /**
     * @return Cluster scan config (List maxitems:1)
     * 
     */
    public Output<ClusterScheduledClusterScanScanConfigArgs> scanConfig() {
        return this.scanConfig;
    }

    /**
     * Cluster scan schedule config (list maxitems:1)
     * 
     */
    @Import(name="scheduleConfig", required=true)
    private Output<ClusterScheduledClusterScanScheduleConfigArgs> scheduleConfig;

    /**
     * @return Cluster scan schedule config (list maxitems:1)
     * 
     */
    public Output<ClusterScheduledClusterScanScheduleConfigArgs> scheduleConfig() {
        return this.scheduleConfig;
    }

    private ClusterScheduledClusterScanArgs() {}

    private ClusterScheduledClusterScanArgs(ClusterScheduledClusterScanArgs $) {
        this.enabled = $.enabled;
        this.scanConfig = $.scanConfig;
        this.scheduleConfig = $.scheduleConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterScheduledClusterScanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterScheduledClusterScanArgs $;

        public Builder() {
            $ = new ClusterScheduledClusterScanArgs();
        }

        public Builder(ClusterScheduledClusterScanArgs defaults) {
            $ = new ClusterScheduledClusterScanArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param scanConfig Cluster scan config (List maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder scanConfig(Output<ClusterScheduledClusterScanScanConfigArgs> scanConfig) {
            $.scanConfig = scanConfig;
            return this;
        }

        /**
         * @param scanConfig Cluster scan config (List maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder scanConfig(ClusterScheduledClusterScanScanConfigArgs scanConfig) {
            return scanConfig(Output.of(scanConfig));
        }

        /**
         * @param scheduleConfig Cluster scan schedule config (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder scheduleConfig(Output<ClusterScheduledClusterScanScheduleConfigArgs> scheduleConfig) {
            $.scheduleConfig = scheduleConfig;
            return this;
        }

        /**
         * @param scheduleConfig Cluster scan schedule config (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder scheduleConfig(ClusterScheduledClusterScanScheduleConfigArgs scheduleConfig) {
            return scheduleConfig(Output.of(scheduleConfig));
        }

        public ClusterScheduledClusterScanArgs build() {
            $.scanConfig = Objects.requireNonNull($.scanConfig, "expected parameter 'scanConfig' to be non-null");
            $.scheduleConfig = Objects.requireNonNull($.scheduleConfig, "expected parameter 'scheduleConfig' to be non-null");
            return $;
        }
    }

}