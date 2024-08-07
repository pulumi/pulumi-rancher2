// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectAlertRuleWorkloadRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectAlertRuleWorkloadRuleArgs Empty = new ProjectAlertRuleWorkloadRuleArgs();

    /**
     * Workload rule available percentage
     * 
     */
    @Import(name="availablePercentage")
    private @Nullable Output<Integer> availablePercentage;

    /**
     * @return Workload rule available percentage
     * 
     */
    public Optional<Output<Integer>> availablePercentage() {
        return Optional.ofNullable(this.availablePercentage);
    }

    /**
     * Workload rule selector
     * 
     */
    @Import(name="selector")
    private @Nullable Output<Map<String,Object>> selector;

    /**
     * @return Workload rule selector
     * 
     */
    public Optional<Output<Map<String,Object>>> selector() {
        return Optional.ofNullable(this.selector);
    }

    /**
     * Workload ID
     * 
     */
    @Import(name="workloadId")
    private @Nullable Output<String> workloadId;

    /**
     * @return Workload ID
     * 
     */
    public Optional<Output<String>> workloadId() {
        return Optional.ofNullable(this.workloadId);
    }

    private ProjectAlertRuleWorkloadRuleArgs() {}

    private ProjectAlertRuleWorkloadRuleArgs(ProjectAlertRuleWorkloadRuleArgs $) {
        this.availablePercentage = $.availablePercentage;
        this.selector = $.selector;
        this.workloadId = $.workloadId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectAlertRuleWorkloadRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectAlertRuleWorkloadRuleArgs $;

        public Builder() {
            $ = new ProjectAlertRuleWorkloadRuleArgs();
        }

        public Builder(ProjectAlertRuleWorkloadRuleArgs defaults) {
            $ = new ProjectAlertRuleWorkloadRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availablePercentage Workload rule available percentage
         * 
         * @return builder
         * 
         */
        public Builder availablePercentage(@Nullable Output<Integer> availablePercentage) {
            $.availablePercentage = availablePercentage;
            return this;
        }

        /**
         * @param availablePercentage Workload rule available percentage
         * 
         * @return builder
         * 
         */
        public Builder availablePercentage(Integer availablePercentage) {
            return availablePercentage(Output.of(availablePercentage));
        }

        /**
         * @param selector Workload rule selector
         * 
         * @return builder
         * 
         */
        public Builder selector(@Nullable Output<Map<String,Object>> selector) {
            $.selector = selector;
            return this;
        }

        /**
         * @param selector Workload rule selector
         * 
         * @return builder
         * 
         */
        public Builder selector(Map<String,Object> selector) {
            return selector(Output.of(selector));
        }

        /**
         * @param workloadId Workload ID
         * 
         * @return builder
         * 
         */
        public Builder workloadId(@Nullable Output<String> workloadId) {
            $.workloadId = workloadId;
            return this;
        }

        /**
         * @param workloadId Workload ID
         * 
         * @return builder
         * 
         */
        public Builder workloadId(String workloadId) {
            return workloadId(Output.of(workloadId));
        }

        public ProjectAlertRuleWorkloadRuleArgs build() {
            return $;
        }
    }

}
