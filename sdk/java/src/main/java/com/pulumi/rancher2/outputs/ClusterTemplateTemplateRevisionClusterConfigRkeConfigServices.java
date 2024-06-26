// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcd;
import com.pulumi.rancher2.outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApi;
import com.pulumi.rancher2.outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeController;
import com.pulumi.rancher2.outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubelet;
import com.pulumi.rancher2.outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeproxy;
import com.pulumi.rancher2.outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesScheduler;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigServices {
    private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcd etcd;
    private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApi kubeApi;
    private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeController kubeController;
    private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubelet kubelet;
    private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeproxy kubeproxy;
    private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesScheduler scheduler;

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigServices() {}
    public Optional<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcd> etcd() {
        return Optional.ofNullable(this.etcd);
    }
    public Optional<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApi> kubeApi() {
        return Optional.ofNullable(this.kubeApi);
    }
    public Optional<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeController> kubeController() {
        return Optional.ofNullable(this.kubeController);
    }
    public Optional<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubelet> kubelet() {
        return Optional.ofNullable(this.kubelet);
    }
    public Optional<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeproxy> kubeproxy() {
        return Optional.ofNullable(this.kubeproxy);
    }
    public Optional<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesScheduler> scheduler() {
        return Optional.ofNullable(this.scheduler);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServices defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcd etcd;
        private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApi kubeApi;
        private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeController kubeController;
        private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubelet kubelet;
        private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeproxy kubeproxy;
        private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesScheduler scheduler;
        public Builder() {}
        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServices defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etcd = defaults.etcd;
    	      this.kubeApi = defaults.kubeApi;
    	      this.kubeController = defaults.kubeController;
    	      this.kubelet = defaults.kubelet;
    	      this.kubeproxy = defaults.kubeproxy;
    	      this.scheduler = defaults.scheduler;
        }

        @CustomType.Setter
        public Builder etcd(@Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcd etcd) {

            this.etcd = etcd;
            return this;
        }
        @CustomType.Setter
        public Builder kubeApi(@Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApi kubeApi) {

            this.kubeApi = kubeApi;
            return this;
        }
        @CustomType.Setter
        public Builder kubeController(@Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeController kubeController) {

            this.kubeController = kubeController;
            return this;
        }
        @CustomType.Setter
        public Builder kubelet(@Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubelet kubelet) {

            this.kubelet = kubelet;
            return this;
        }
        @CustomType.Setter
        public Builder kubeproxy(@Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeproxy kubeproxy) {

            this.kubeproxy = kubeproxy;
            return this;
        }
        @CustomType.Setter
        public Builder scheduler(@Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesScheduler scheduler) {

            this.scheduler = scheduler;
            return this;
        }
        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigServices build() {
            final var _resultValue = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServices();
            _resultValue.etcd = etcd;
            _resultValue.kubeApi = kubeApi;
            _resultValue.kubeController = kubeController;
            _resultValue.kubelet = kubelet;
            _resultValue.kubeproxy = kubeproxy;
            _resultValue.scheduler = scheduler;
            return _resultValue;
        }
    }
}
