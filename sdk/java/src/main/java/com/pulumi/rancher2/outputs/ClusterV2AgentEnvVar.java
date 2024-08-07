// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClusterV2AgentEnvVar {
    /**
     * @return The name of the cluster.
     * 
     */
    private String name;
    /**
     * @return The taint value.
     * 
     */
    private String value;

    private ClusterV2AgentEnvVar() {}
    /**
     * @return The name of the cluster.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The taint value.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterV2AgentEnvVar defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String value;
        public Builder() {}
        public Builder(ClusterV2AgentEnvVar defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ClusterV2AgentEnvVar", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("ClusterV2AgentEnvVar", "value");
            }
            this.value = value;
            return this;
        }
        public ClusterV2AgentEnvVar build() {
            final var _resultValue = new ClusterV2AgentEnvVar();
            _resultValue.name = name;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
