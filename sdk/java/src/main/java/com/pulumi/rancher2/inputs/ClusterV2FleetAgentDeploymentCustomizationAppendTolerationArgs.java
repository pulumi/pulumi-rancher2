// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterV2FleetAgentDeploymentCustomizationAppendTolerationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterV2FleetAgentDeploymentCustomizationAppendTolerationArgs Empty = new ClusterV2FleetAgentDeploymentCustomizationAppendTolerationArgs();

    /**
     * The taint effect. Default: `\&#34;NoExecute\&#34;` (string)
     * 
     */
    @Import(name="effect")
    private @Nullable Output<String> effect;

    /**
     * @return The taint effect. Default: `\&#34;NoExecute\&#34;` (string)
     * 
     */
    public Optional<Output<String>> effect() {
        return Optional.ofNullable(this.effect);
    }

    /**
     * The taint key (string)
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The taint key (string)
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * Machine selector label match expressions operator (string)
     * 
     */
    @Import(name="operator")
    private @Nullable Output<String> operator;

    /**
     * @return Machine selector label match expressions operator (string)
     * 
     */
    public Optional<Output<String>> operator() {
        return Optional.ofNullable(this.operator);
    }

    @Import(name="seconds")
    private @Nullable Output<Integer> seconds;

    public Optional<Output<Integer>> seconds() {
        return Optional.ofNullable(this.seconds);
    }

    /**
     * Rancher agent env var value (string)
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Rancher agent env var value (string)
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ClusterV2FleetAgentDeploymentCustomizationAppendTolerationArgs() {}

    private ClusterV2FleetAgentDeploymentCustomizationAppendTolerationArgs(ClusterV2FleetAgentDeploymentCustomizationAppendTolerationArgs $) {
        this.effect = $.effect;
        this.key = $.key;
        this.operator = $.operator;
        this.seconds = $.seconds;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterV2FleetAgentDeploymentCustomizationAppendTolerationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterV2FleetAgentDeploymentCustomizationAppendTolerationArgs $;

        public Builder() {
            $ = new ClusterV2FleetAgentDeploymentCustomizationAppendTolerationArgs();
        }

        public Builder(ClusterV2FleetAgentDeploymentCustomizationAppendTolerationArgs defaults) {
            $ = new ClusterV2FleetAgentDeploymentCustomizationAppendTolerationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param effect The taint effect. Default: `\&#34;NoExecute\&#34;` (string)
         * 
         * @return builder
         * 
         */
        public Builder effect(@Nullable Output<String> effect) {
            $.effect = effect;
            return this;
        }

        /**
         * @param effect The taint effect. Default: `\&#34;NoExecute\&#34;` (string)
         * 
         * @return builder
         * 
         */
        public Builder effect(String effect) {
            return effect(Output.of(effect));
        }

        /**
         * @param key The taint key (string)
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The taint key (string)
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param operator Machine selector label match expressions operator (string)
         * 
         * @return builder
         * 
         */
        public Builder operator(@Nullable Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator Machine selector label match expressions operator (string)
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        public Builder seconds(@Nullable Output<Integer> seconds) {
            $.seconds = seconds;
            return this;
        }

        public Builder seconds(Integer seconds) {
            return seconds(Output.of(seconds));
        }

        /**
         * @param value Rancher agent env var value (string)
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Rancher agent env var value (string)
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ClusterV2FleetAgentDeploymentCustomizationAppendTolerationArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}