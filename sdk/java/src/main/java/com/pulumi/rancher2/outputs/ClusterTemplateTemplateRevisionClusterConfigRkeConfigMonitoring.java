// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringToleration;
import com.pulumi.rancher2.outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoring {
    private @Nullable Map<String,String> nodeSelector;
    private @Nullable Map<String,String> options;
    private @Nullable String provider;
    private @Nullable Integer replicas;
    /**
     * @return Monitoring add-on tolerations
     * 
     */
    private @Nullable List<ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringToleration> tolerations;
    /**
     * @return Update deployment strategy
     * 
     */
    private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategy updateStrategy;

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoring() {}
    public Map<String,String> nodeSelector() {
        return this.nodeSelector == null ? Map.of() : this.nodeSelector;
    }
    public Map<String,String> options() {
        return this.options == null ? Map.of() : this.options;
    }
    public Optional<String> provider() {
        return Optional.ofNullable(this.provider);
    }
    public Optional<Integer> replicas() {
        return Optional.ofNullable(this.replicas);
    }
    /**
     * @return Monitoring add-on tolerations
     * 
     */
    public List<ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringToleration> tolerations() {
        return this.tolerations == null ? List.of() : this.tolerations;
    }
    /**
     * @return Update deployment strategy
     * 
     */
    public Optional<ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategy> updateStrategy() {
        return Optional.ofNullable(this.updateStrategy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoring defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,String> nodeSelector;
        private @Nullable Map<String,String> options;
        private @Nullable String provider;
        private @Nullable Integer replicas;
        private @Nullable List<ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringToleration> tolerations;
        private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategy updateStrategy;
        public Builder() {}
        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoring defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeSelector = defaults.nodeSelector;
    	      this.options = defaults.options;
    	      this.provider = defaults.provider;
    	      this.replicas = defaults.replicas;
    	      this.tolerations = defaults.tolerations;
    	      this.updateStrategy = defaults.updateStrategy;
        }

        @CustomType.Setter
        public Builder nodeSelector(@Nullable Map<String,String> nodeSelector) {

            this.nodeSelector = nodeSelector;
            return this;
        }
        @CustomType.Setter
        public Builder options(@Nullable Map<String,String> options) {

            this.options = options;
            return this;
        }
        @CustomType.Setter
        public Builder provider(@Nullable String provider) {

            this.provider = provider;
            return this;
        }
        @CustomType.Setter
        public Builder replicas(@Nullable Integer replicas) {

            this.replicas = replicas;
            return this;
        }
        @CustomType.Setter
        public Builder tolerations(@Nullable List<ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringToleration> tolerations) {

            this.tolerations = tolerations;
            return this;
        }
        public Builder tolerations(ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringToleration... tolerations) {
            return tolerations(List.of(tolerations));
        }
        @CustomType.Setter
        public Builder updateStrategy(@Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategy updateStrategy) {

            this.updateStrategy = updateStrategy;
            return this;
        }
        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoring build() {
            final var _resultValue = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoring();
            _resultValue.nodeSelector = nodeSelector;
            _resultValue.options = options;
            _resultValue.provider = provider;
            _resultValue.replicas = replicas;
            _resultValue.tolerations = tolerations;
            _resultValue.updateStrategy = updateStrategy;
            return _resultValue;
        }
    }
}
