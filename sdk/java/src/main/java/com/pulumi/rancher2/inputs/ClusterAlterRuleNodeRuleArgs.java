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


public final class ClusterAlterRuleNodeRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterAlterRuleNodeRuleArgs Empty = new ClusterAlterRuleNodeRuleArgs();

    @Import(name="condition")
    private @Nullable Output<String> condition;

    public Optional<Output<String>> condition() {
        return Optional.ofNullable(this.condition);
    }

    @Import(name="cpuThreshold")
    private @Nullable Output<Integer> cpuThreshold;

    public Optional<Output<Integer>> cpuThreshold() {
        return Optional.ofNullable(this.cpuThreshold);
    }

    @Import(name="memThreshold")
    private @Nullable Output<Integer> memThreshold;

    public Optional<Output<Integer>> memThreshold() {
        return Optional.ofNullable(this.memThreshold);
    }

    @Import(name="nodeId")
    private @Nullable Output<String> nodeId;

    public Optional<Output<String>> nodeId() {
        return Optional.ofNullable(this.nodeId);
    }

    @Import(name="selector")
    private @Nullable Output<Map<String,Object>> selector;

    public Optional<Output<Map<String,Object>>> selector() {
        return Optional.ofNullable(this.selector);
    }

    private ClusterAlterRuleNodeRuleArgs() {}

    private ClusterAlterRuleNodeRuleArgs(ClusterAlterRuleNodeRuleArgs $) {
        this.condition = $.condition;
        this.cpuThreshold = $.cpuThreshold;
        this.memThreshold = $.memThreshold;
        this.nodeId = $.nodeId;
        this.selector = $.selector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterAlterRuleNodeRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterAlterRuleNodeRuleArgs $;

        public Builder() {
            $ = new ClusterAlterRuleNodeRuleArgs();
        }

        public Builder(ClusterAlterRuleNodeRuleArgs defaults) {
            $ = new ClusterAlterRuleNodeRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<String> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(String condition) {
            return condition(Output.of(condition));
        }

        public Builder cpuThreshold(@Nullable Output<Integer> cpuThreshold) {
            $.cpuThreshold = cpuThreshold;
            return this;
        }

        public Builder cpuThreshold(Integer cpuThreshold) {
            return cpuThreshold(Output.of(cpuThreshold));
        }

        public Builder memThreshold(@Nullable Output<Integer> memThreshold) {
            $.memThreshold = memThreshold;
            return this;
        }

        public Builder memThreshold(Integer memThreshold) {
            return memThreshold(Output.of(memThreshold));
        }

        public Builder nodeId(@Nullable Output<String> nodeId) {
            $.nodeId = nodeId;
            return this;
        }

        public Builder nodeId(String nodeId) {
            return nodeId(Output.of(nodeId));
        }

        public Builder selector(@Nullable Output<Map<String,Object>> selector) {
            $.selector = selector;
            return this;
        }

        public Builder selector(Map<String,Object> selector) {
            return selector(Output.of(selector));
        }

        public ClusterAlterRuleNodeRuleArgs build() {
            return $;
        }
    }

}