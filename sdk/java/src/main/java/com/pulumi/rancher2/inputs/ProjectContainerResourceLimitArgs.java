// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectContainerResourceLimitArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectContainerResourceLimitArgs Empty = new ProjectContainerResourceLimitArgs();

    /**
     * Limit for limits cpu in project (string)
     * 
     */
    @Import(name="limitsCpu")
    private @Nullable Output<String> limitsCpu;

    /**
     * @return Limit for limits cpu in project (string)
     * 
     */
    public Optional<Output<String>> limitsCpu() {
        return Optional.ofNullable(this.limitsCpu);
    }

    /**
     * Limit for limits memory in project (string)
     * 
     */
    @Import(name="limitsMemory")
    private @Nullable Output<String> limitsMemory;

    /**
     * @return Limit for limits memory in project (string)
     * 
     */
    public Optional<Output<String>> limitsMemory() {
        return Optional.ofNullable(this.limitsMemory);
    }

    /**
     * Limit for requests cpu in project (string)
     * 
     */
    @Import(name="requestsCpu")
    private @Nullable Output<String> requestsCpu;

    /**
     * @return Limit for requests cpu in project (string)
     * 
     */
    public Optional<Output<String>> requestsCpu() {
        return Optional.ofNullable(this.requestsCpu);
    }

    /**
     * Limit for requests memory in project (string)
     * 
     */
    @Import(name="requestsMemory")
    private @Nullable Output<String> requestsMemory;

    /**
     * @return Limit for requests memory in project (string)
     * 
     */
    public Optional<Output<String>> requestsMemory() {
        return Optional.ofNullable(this.requestsMemory);
    }

    private ProjectContainerResourceLimitArgs() {}

    private ProjectContainerResourceLimitArgs(ProjectContainerResourceLimitArgs $) {
        this.limitsCpu = $.limitsCpu;
        this.limitsMemory = $.limitsMemory;
        this.requestsCpu = $.requestsCpu;
        this.requestsMemory = $.requestsMemory;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectContainerResourceLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectContainerResourceLimitArgs $;

        public Builder() {
            $ = new ProjectContainerResourceLimitArgs();
        }

        public Builder(ProjectContainerResourceLimitArgs defaults) {
            $ = new ProjectContainerResourceLimitArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param limitsCpu Limit for limits cpu in project (string)
         * 
         * @return builder
         * 
         */
        public Builder limitsCpu(@Nullable Output<String> limitsCpu) {
            $.limitsCpu = limitsCpu;
            return this;
        }

        /**
         * @param limitsCpu Limit for limits cpu in project (string)
         * 
         * @return builder
         * 
         */
        public Builder limitsCpu(String limitsCpu) {
            return limitsCpu(Output.of(limitsCpu));
        }

        /**
         * @param limitsMemory Limit for limits memory in project (string)
         * 
         * @return builder
         * 
         */
        public Builder limitsMemory(@Nullable Output<String> limitsMemory) {
            $.limitsMemory = limitsMemory;
            return this;
        }

        /**
         * @param limitsMemory Limit for limits memory in project (string)
         * 
         * @return builder
         * 
         */
        public Builder limitsMemory(String limitsMemory) {
            return limitsMemory(Output.of(limitsMemory));
        }

        /**
         * @param requestsCpu Limit for requests cpu in project (string)
         * 
         * @return builder
         * 
         */
        public Builder requestsCpu(@Nullable Output<String> requestsCpu) {
            $.requestsCpu = requestsCpu;
            return this;
        }

        /**
         * @param requestsCpu Limit for requests cpu in project (string)
         * 
         * @return builder
         * 
         */
        public Builder requestsCpu(String requestsCpu) {
            return requestsCpu(Output.of(requestsCpu));
        }

        /**
         * @param requestsMemory Limit for requests memory in project (string)
         * 
         * @return builder
         * 
         */
        public Builder requestsMemory(@Nullable Output<String> requestsMemory) {
            $.requestsMemory = requestsMemory;
            return this;
        }

        /**
         * @param requestsMemory Limit for requests memory in project (string)
         * 
         * @return builder
         * 
         */
        public Builder requestsMemory(String requestsMemory) {
            return requestsMemory(Output.of(requestsMemory));
        }

        public ProjectContainerResourceLimitArgs build() {
            return $;
        }
    }

}