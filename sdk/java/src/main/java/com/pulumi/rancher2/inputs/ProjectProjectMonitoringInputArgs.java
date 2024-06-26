// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectProjectMonitoringInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectProjectMonitoringInputArgs Empty = new ProjectProjectMonitoringInputArgs();

    /**
     * Answers for monitor input
     * 
     */
    @Import(name="answers")
    private @Nullable Output<Map<String,Object>> answers;

    /**
     * @return Answers for monitor input
     * 
     */
    public Optional<Output<Map<String,Object>>> answers() {
        return Optional.ofNullable(this.answers);
    }

    /**
     * Monitoring version
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Monitoring version
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private ProjectProjectMonitoringInputArgs() {}

    private ProjectProjectMonitoringInputArgs(ProjectProjectMonitoringInputArgs $) {
        this.answers = $.answers;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectProjectMonitoringInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectProjectMonitoringInputArgs $;

        public Builder() {
            $ = new ProjectProjectMonitoringInputArgs();
        }

        public Builder(ProjectProjectMonitoringInputArgs defaults) {
            $ = new ProjectProjectMonitoringInputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param answers Answers for monitor input
         * 
         * @return builder
         * 
         */
        public Builder answers(@Nullable Output<Map<String,Object>> answers) {
            $.answers = answers;
            return this;
        }

        /**
         * @param answers Answers for monitor input
         * 
         * @return builder
         * 
         */
        public Builder answers(Map<String,Object> answers) {
            return answers(Output.of(answers));
        }

        /**
         * @param version Monitoring version
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Monitoring version
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ProjectProjectMonitoringInputArgs build() {
            return $;
        }
    }

}
