// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ClusterGkeConfigV2NodePoolConfigTaintArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterGkeConfigV2NodePoolConfigTaintArgs Empty = new ClusterGkeConfigV2NodePoolConfigTaintArgs();

    /**
     * The GKE taint effect (string)
     * 
     */
    @Import(name="effect", required=true)
    private Output<String> effect;

    /**
     * @return The GKE taint effect (string)
     * 
     */
    public Output<String> effect() {
        return this.effect;
    }

    /**
     * The GKE taint key (string)
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The GKE taint key (string)
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The GKE taint value (string)
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The GKE taint value (string)
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private ClusterGkeConfigV2NodePoolConfigTaintArgs() {}

    private ClusterGkeConfigV2NodePoolConfigTaintArgs(ClusterGkeConfigV2NodePoolConfigTaintArgs $) {
        this.effect = $.effect;
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterGkeConfigV2NodePoolConfigTaintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterGkeConfigV2NodePoolConfigTaintArgs $;

        public Builder() {
            $ = new ClusterGkeConfigV2NodePoolConfigTaintArgs();
        }

        public Builder(ClusterGkeConfigV2NodePoolConfigTaintArgs defaults) {
            $ = new ClusterGkeConfigV2NodePoolConfigTaintArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param effect The GKE taint effect (string)
         * 
         * @return builder
         * 
         */
        public Builder effect(Output<String> effect) {
            $.effect = effect;
            return this;
        }

        /**
         * @param effect The GKE taint effect (string)
         * 
         * @return builder
         * 
         */
        public Builder effect(String effect) {
            return effect(Output.of(effect));
        }

        /**
         * @param key The GKE taint key (string)
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The GKE taint key (string)
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value The GKE taint value (string)
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The GKE taint value (string)
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ClusterGkeConfigV2NodePoolConfigTaintArgs build() {
            $.effect = Objects.requireNonNull($.effect, "expected parameter 'effect' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}