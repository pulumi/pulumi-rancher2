// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.ClusterV2RkeConfigMachineSelectorFileFileSourceArgs;
import com.pulumi.rancher2.inputs.ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterV2RkeConfigMachineSelectorFileArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterV2RkeConfigMachineSelectorFileArgs Empty = new ClusterV2RkeConfigMachineSelectorFileArgs();

    /**
     * File sources
     * 
     */
    @Import(name="fileSources")
    private @Nullable Output<List<ClusterV2RkeConfigMachineSelectorFileFileSourceArgs>> fileSources;

    /**
     * @return File sources
     * 
     */
    public Optional<Output<List<ClusterV2RkeConfigMachineSelectorFileFileSourceArgs>>> fileSources() {
        return Optional.ofNullable(this.fileSources);
    }

    /**
     * Machine label selector
     * 
     */
    @Import(name="machineLabelSelector")
    private @Nullable Output<ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorArgs> machineLabelSelector;

    /**
     * @return Machine label selector
     * 
     */
    public Optional<Output<ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorArgs>> machineLabelSelector() {
        return Optional.ofNullable(this.machineLabelSelector);
    }

    private ClusterV2RkeConfigMachineSelectorFileArgs() {}

    private ClusterV2RkeConfigMachineSelectorFileArgs(ClusterV2RkeConfigMachineSelectorFileArgs $) {
        this.fileSources = $.fileSources;
        this.machineLabelSelector = $.machineLabelSelector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterV2RkeConfigMachineSelectorFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterV2RkeConfigMachineSelectorFileArgs $;

        public Builder() {
            $ = new ClusterV2RkeConfigMachineSelectorFileArgs();
        }

        public Builder(ClusterV2RkeConfigMachineSelectorFileArgs defaults) {
            $ = new ClusterV2RkeConfigMachineSelectorFileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fileSources File sources
         * 
         * @return builder
         * 
         */
        public Builder fileSources(@Nullable Output<List<ClusterV2RkeConfigMachineSelectorFileFileSourceArgs>> fileSources) {
            $.fileSources = fileSources;
            return this;
        }

        /**
         * @param fileSources File sources
         * 
         * @return builder
         * 
         */
        public Builder fileSources(List<ClusterV2RkeConfigMachineSelectorFileFileSourceArgs> fileSources) {
            return fileSources(Output.of(fileSources));
        }

        /**
         * @param fileSources File sources
         * 
         * @return builder
         * 
         */
        public Builder fileSources(ClusterV2RkeConfigMachineSelectorFileFileSourceArgs... fileSources) {
            return fileSources(List.of(fileSources));
        }

        /**
         * @param machineLabelSelector Machine label selector
         * 
         * @return builder
         * 
         */
        public Builder machineLabelSelector(@Nullable Output<ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorArgs> machineLabelSelector) {
            $.machineLabelSelector = machineLabelSelector;
            return this;
        }

        /**
         * @param machineLabelSelector Machine label selector
         * 
         * @return builder
         * 
         */
        public Builder machineLabelSelector(ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorArgs machineLabelSelector) {
            return machineLabelSelector(Output.of(machineLabelSelector));
        }

        public ClusterV2RkeConfigMachineSelectorFileArgs build() {
            return $;
        }
    }

}
