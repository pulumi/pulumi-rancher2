// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterTemplateTemplateRevisionClusterConfigScheduledClusterScanScanConfigCisScanConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterTemplateTemplateRevisionClusterConfigScheduledClusterScanScanConfigCisScanConfigArgs Empty = new ClusterTemplateTemplateRevisionClusterConfigScheduledClusterScanScanConfigCisScanConfigArgs();

    @Import(name="debugMaster")
    private @Nullable Output<Boolean> debugMaster;

    public Optional<Output<Boolean>> debugMaster() {
        return Optional.ofNullable(this.debugMaster);
    }

    @Import(name="debugWorker")
    private @Nullable Output<Boolean> debugWorker;

    public Optional<Output<Boolean>> debugWorker() {
        return Optional.ofNullable(this.debugWorker);
    }

    @Import(name="overrideBenchmarkVersion")
    private @Nullable Output<String> overrideBenchmarkVersion;

    public Optional<Output<String>> overrideBenchmarkVersion() {
        return Optional.ofNullable(this.overrideBenchmarkVersion);
    }

    @Import(name="overrideSkips")
    private @Nullable Output<List<String>> overrideSkips;

    public Optional<Output<List<String>>> overrideSkips() {
        return Optional.ofNullable(this.overrideSkips);
    }

    @Import(name="profile")
    private @Nullable Output<String> profile;

    public Optional<Output<String>> profile() {
        return Optional.ofNullable(this.profile);
    }

    private ClusterTemplateTemplateRevisionClusterConfigScheduledClusterScanScanConfigCisScanConfigArgs() {}

    private ClusterTemplateTemplateRevisionClusterConfigScheduledClusterScanScanConfigCisScanConfigArgs(ClusterTemplateTemplateRevisionClusterConfigScheduledClusterScanScanConfigCisScanConfigArgs $) {
        this.debugMaster = $.debugMaster;
        this.debugWorker = $.debugWorker;
        this.overrideBenchmarkVersion = $.overrideBenchmarkVersion;
        this.overrideSkips = $.overrideSkips;
        this.profile = $.profile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigScheduledClusterScanScanConfigCisScanConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterTemplateTemplateRevisionClusterConfigScheduledClusterScanScanConfigCisScanConfigArgs $;

        public Builder() {
            $ = new ClusterTemplateTemplateRevisionClusterConfigScheduledClusterScanScanConfigCisScanConfigArgs();
        }

        public Builder(ClusterTemplateTemplateRevisionClusterConfigScheduledClusterScanScanConfigCisScanConfigArgs defaults) {
            $ = new ClusterTemplateTemplateRevisionClusterConfigScheduledClusterScanScanConfigCisScanConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder debugMaster(@Nullable Output<Boolean> debugMaster) {
            $.debugMaster = debugMaster;
            return this;
        }

        public Builder debugMaster(Boolean debugMaster) {
            return debugMaster(Output.of(debugMaster));
        }

        public Builder debugWorker(@Nullable Output<Boolean> debugWorker) {
            $.debugWorker = debugWorker;
            return this;
        }

        public Builder debugWorker(Boolean debugWorker) {
            return debugWorker(Output.of(debugWorker));
        }

        public Builder overrideBenchmarkVersion(@Nullable Output<String> overrideBenchmarkVersion) {
            $.overrideBenchmarkVersion = overrideBenchmarkVersion;
            return this;
        }

        public Builder overrideBenchmarkVersion(String overrideBenchmarkVersion) {
            return overrideBenchmarkVersion(Output.of(overrideBenchmarkVersion));
        }

        public Builder overrideSkips(@Nullable Output<List<String>> overrideSkips) {
            $.overrideSkips = overrideSkips;
            return this;
        }

        public Builder overrideSkips(List<String> overrideSkips) {
            return overrideSkips(Output.of(overrideSkips));
        }

        public Builder overrideSkips(String... overrideSkips) {
            return overrideSkips(List.of(overrideSkips));
        }

        public Builder profile(@Nullable Output<String> profile) {
            $.profile = profile;
            return this;
        }

        public Builder profile(String profile) {
            return profile(Output.of(profile));
        }

        public ClusterTemplateTemplateRevisionClusterConfigScheduledClusterScanScanConfigCisScanConfigArgs build() {
            return $;
        }
    }

}