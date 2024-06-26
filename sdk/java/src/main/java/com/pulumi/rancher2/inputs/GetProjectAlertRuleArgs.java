// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProjectAlertRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectAlertRuleArgs Empty = new GetProjectAlertRuleArgs();

    /**
     * (Computed) The project alert rule labels (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return (Computed) The project alert rule labels (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The project alert rule name (string)
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The project alert rule name (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The project id where create project alert rule (string)
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The project id where create project alert rule (string)
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private GetProjectAlertRuleArgs() {}

    private GetProjectAlertRuleArgs(GetProjectAlertRuleArgs $) {
        this.labels = $.labels;
        this.name = $.name;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectAlertRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectAlertRuleArgs $;

        public Builder() {
            $ = new GetProjectAlertRuleArgs();
        }

        public Builder(GetProjectAlertRuleArgs defaults) {
            $ = new GetProjectAlertRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param labels (Computed) The project alert rule labels (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels (Computed) The project alert rule labels (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The project alert rule name (string)
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The project alert rule name (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param projectId The project id where create project alert rule (string)
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The project id where create project alert rule (string)
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GetProjectAlertRuleArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetProjectAlertRuleArgs", "name");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetProjectAlertRuleArgs", "projectId");
            }
            return $;
        }
    }

}
