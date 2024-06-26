// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.outputs.ClusterGkeConfigV2NodePoolAutoscaling;
import com.pulumi.rancher2.outputs.ClusterGkeConfigV2NodePoolConfig;
import com.pulumi.rancher2.outputs.ClusterGkeConfigV2NodePoolManagement;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterGkeConfigV2NodePool {
    /**
     * @return The GKE node pool config autoscaling
     * 
     */
    private @Nullable ClusterGkeConfigV2NodePoolAutoscaling autoscaling;
    /**
     * @return The GKE node pool node config
     * 
     */
    private @Nullable ClusterGkeConfigV2NodePoolConfig config;
    /**
     * @return The GKE node pool config initial node count
     * 
     */
    private Integer initialNodeCount;
    /**
     * @return The GKE node pool config management
     * 
     */
    private @Nullable ClusterGkeConfigV2NodePoolManagement management;
    /**
     * @return The GKE node pool config max pods constraint
     * 
     */
    private @Nullable Integer maxPodsConstraint;
    /**
     * @return The name of the Cluster (string)
     * 
     */
    private String name;
    /**
     * @return The GKE node pool config version
     * 
     */
    private String version;

    private ClusterGkeConfigV2NodePool() {}
    /**
     * @return The GKE node pool config autoscaling
     * 
     */
    public Optional<ClusterGkeConfigV2NodePoolAutoscaling> autoscaling() {
        return Optional.ofNullable(this.autoscaling);
    }
    /**
     * @return The GKE node pool node config
     * 
     */
    public Optional<ClusterGkeConfigV2NodePoolConfig> config() {
        return Optional.ofNullable(this.config);
    }
    /**
     * @return The GKE node pool config initial node count
     * 
     */
    public Integer initialNodeCount() {
        return this.initialNodeCount;
    }
    /**
     * @return The GKE node pool config management
     * 
     */
    public Optional<ClusterGkeConfigV2NodePoolManagement> management() {
        return Optional.ofNullable(this.management);
    }
    /**
     * @return The GKE node pool config max pods constraint
     * 
     */
    public Optional<Integer> maxPodsConstraint() {
        return Optional.ofNullable(this.maxPodsConstraint);
    }
    /**
     * @return The name of the Cluster (string)
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The GKE node pool config version
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterGkeConfigV2NodePool defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterGkeConfigV2NodePoolAutoscaling autoscaling;
        private @Nullable ClusterGkeConfigV2NodePoolConfig config;
        private Integer initialNodeCount;
        private @Nullable ClusterGkeConfigV2NodePoolManagement management;
        private @Nullable Integer maxPodsConstraint;
        private String name;
        private String version;
        public Builder() {}
        public Builder(ClusterGkeConfigV2NodePool defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaling = defaults.autoscaling;
    	      this.config = defaults.config;
    	      this.initialNodeCount = defaults.initialNodeCount;
    	      this.management = defaults.management;
    	      this.maxPodsConstraint = defaults.maxPodsConstraint;
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder autoscaling(@Nullable ClusterGkeConfigV2NodePoolAutoscaling autoscaling) {

            this.autoscaling = autoscaling;
            return this;
        }
        @CustomType.Setter
        public Builder config(@Nullable ClusterGkeConfigV2NodePoolConfig config) {

            this.config = config;
            return this;
        }
        @CustomType.Setter
        public Builder initialNodeCount(Integer initialNodeCount) {
            if (initialNodeCount == null) {
              throw new MissingRequiredPropertyException("ClusterGkeConfigV2NodePool", "initialNodeCount");
            }
            this.initialNodeCount = initialNodeCount;
            return this;
        }
        @CustomType.Setter
        public Builder management(@Nullable ClusterGkeConfigV2NodePoolManagement management) {

            this.management = management;
            return this;
        }
        @CustomType.Setter
        public Builder maxPodsConstraint(@Nullable Integer maxPodsConstraint) {

            this.maxPodsConstraint = maxPodsConstraint;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ClusterGkeConfigV2NodePool", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("ClusterGkeConfigV2NodePool", "version");
            }
            this.version = version;
            return this;
        }
        public ClusterGkeConfigV2NodePool build() {
            final var _resultValue = new ClusterGkeConfigV2NodePool();
            _resultValue.autoscaling = autoscaling;
            _resultValue.config = config;
            _resultValue.initialNodeCount = initialNodeCount;
            _resultValue.management = management;
            _resultValue.maxPodsConstraint = maxPodsConstraint;
            _resultValue.name = name;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
