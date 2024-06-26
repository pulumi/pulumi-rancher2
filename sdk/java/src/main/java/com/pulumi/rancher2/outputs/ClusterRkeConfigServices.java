// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterRkeConfigServicesEtcd;
import com.pulumi.rancher2.outputs.ClusterRkeConfigServicesKubeApi;
import com.pulumi.rancher2.outputs.ClusterRkeConfigServicesKubeController;
import com.pulumi.rancher2.outputs.ClusterRkeConfigServicesKubelet;
import com.pulumi.rancher2.outputs.ClusterRkeConfigServicesKubeproxy;
import com.pulumi.rancher2.outputs.ClusterRkeConfigServicesScheduler;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRkeConfigServices {
    private @Nullable ClusterRkeConfigServicesEtcd etcd;
    private @Nullable ClusterRkeConfigServicesKubeApi kubeApi;
    private @Nullable ClusterRkeConfigServicesKubeController kubeController;
    private @Nullable ClusterRkeConfigServicesKubelet kubelet;
    private @Nullable ClusterRkeConfigServicesKubeproxy kubeproxy;
    private @Nullable ClusterRkeConfigServicesScheduler scheduler;

    private ClusterRkeConfigServices() {}
    public Optional<ClusterRkeConfigServicesEtcd> etcd() {
        return Optional.ofNullable(this.etcd);
    }
    public Optional<ClusterRkeConfigServicesKubeApi> kubeApi() {
        return Optional.ofNullable(this.kubeApi);
    }
    public Optional<ClusterRkeConfigServicesKubeController> kubeController() {
        return Optional.ofNullable(this.kubeController);
    }
    public Optional<ClusterRkeConfigServicesKubelet> kubelet() {
        return Optional.ofNullable(this.kubelet);
    }
    public Optional<ClusterRkeConfigServicesKubeproxy> kubeproxy() {
        return Optional.ofNullable(this.kubeproxy);
    }
    public Optional<ClusterRkeConfigServicesScheduler> scheduler() {
        return Optional.ofNullable(this.scheduler);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigServices defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterRkeConfigServicesEtcd etcd;
        private @Nullable ClusterRkeConfigServicesKubeApi kubeApi;
        private @Nullable ClusterRkeConfigServicesKubeController kubeController;
        private @Nullable ClusterRkeConfigServicesKubelet kubelet;
        private @Nullable ClusterRkeConfigServicesKubeproxy kubeproxy;
        private @Nullable ClusterRkeConfigServicesScheduler scheduler;
        public Builder() {}
        public Builder(ClusterRkeConfigServices defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etcd = defaults.etcd;
    	      this.kubeApi = defaults.kubeApi;
    	      this.kubeController = defaults.kubeController;
    	      this.kubelet = defaults.kubelet;
    	      this.kubeproxy = defaults.kubeproxy;
    	      this.scheduler = defaults.scheduler;
        }

        @CustomType.Setter
        public Builder etcd(@Nullable ClusterRkeConfigServicesEtcd etcd) {

            this.etcd = etcd;
            return this;
        }
        @CustomType.Setter
        public Builder kubeApi(@Nullable ClusterRkeConfigServicesKubeApi kubeApi) {

            this.kubeApi = kubeApi;
            return this;
        }
        @CustomType.Setter
        public Builder kubeController(@Nullable ClusterRkeConfigServicesKubeController kubeController) {

            this.kubeController = kubeController;
            return this;
        }
        @CustomType.Setter
        public Builder kubelet(@Nullable ClusterRkeConfigServicesKubelet kubelet) {

            this.kubelet = kubelet;
            return this;
        }
        @CustomType.Setter
        public Builder kubeproxy(@Nullable ClusterRkeConfigServicesKubeproxy kubeproxy) {

            this.kubeproxy = kubeproxy;
            return this;
        }
        @CustomType.Setter
        public Builder scheduler(@Nullable ClusterRkeConfigServicesScheduler scheduler) {

            this.scheduler = scheduler;
            return this;
        }
        public ClusterRkeConfigServices build() {
            final var _resultValue = new ClusterRkeConfigServices();
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
