// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterClusterAgentDeploymentCustomizationAppendToleration {
    /**
     * @return The toleration effect. `NoExecute`, `NoSchedule`, and `PreferNoSchedule` are supported. Default: `NoExecute` (string)
     * 
     */
    private @Nullable String effect;
    /**
     * @return The toleration key (string)
     * 
     */
    private String key;
    /**
     * @return The toleration operator. `Equal`, and `Exists` are supported. Default: `Equal` (string)
     * 
     */
    private @Nullable String operator;
    /**
     * @return The toleration seconds (int)
     * 
     */
    private @Nullable Integer seconds;
    /**
     * @return Rancher agent env var value (string)
     * 
     */
    private @Nullable String value;

    private ClusterClusterAgentDeploymentCustomizationAppendToleration() {}
    /**
     * @return The toleration effect. `NoExecute`, `NoSchedule`, and `PreferNoSchedule` are supported. Default: `NoExecute` (string)
     * 
     */
    public Optional<String> effect() {
        return Optional.ofNullable(this.effect);
    }
    /**
     * @return The toleration key (string)
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The toleration operator. `Equal`, and `Exists` are supported. Default: `Equal` (string)
     * 
     */
    public Optional<String> operator() {
        return Optional.ofNullable(this.operator);
    }
    /**
     * @return The toleration seconds (int)
     * 
     */
    public Optional<Integer> seconds() {
        return Optional.ofNullable(this.seconds);
    }
    /**
     * @return Rancher agent env var value (string)
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterAgentDeploymentCustomizationAppendToleration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String effect;
        private String key;
        private @Nullable String operator;
        private @Nullable Integer seconds;
        private @Nullable String value;
        public Builder() {}
        public Builder(ClusterClusterAgentDeploymentCustomizationAppendToleration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.operator = defaults.operator;
    	      this.seconds = defaults.seconds;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder effect(@Nullable String effect) {
            this.effect = effect;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder operator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }
        @CustomType.Setter
        public Builder seconds(@Nullable Integer seconds) {
            this.seconds = seconds;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public ClusterClusterAgentDeploymentCustomizationAppendToleration build() {
            final var o = new ClusterClusterAgentDeploymentCustomizationAppendToleration();
            o.effect = effect;
            o.key = key;
            o.operator = operator;
            o.seconds = seconds;
            o.value = value;
            return o;
        }
    }
}