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
    /**
     * @return Etcd options for RKE services (list maxitems:1)
     * 
     */
    private final @Nullable ClusterRkeConfigServicesEtcd etcd;
    /**
     * @return Kube API options for RKE services (list maxitems:1)
     * 
     */
    private final @Nullable ClusterRkeConfigServicesKubeApi kubeApi;
    /**
     * @return Kube Controller options for RKE services (list maxitems:1)
     * 
     */
    private final @Nullable ClusterRkeConfigServicesKubeController kubeController;
    /**
     * @return Kubelet options for RKE services (list maxitems:1)
     * 
     */
    private final @Nullable ClusterRkeConfigServicesKubelet kubelet;
    /**
     * @return Kubeproxy options for RKE services (list maxitems:1)
     * 
     */
    private final @Nullable ClusterRkeConfigServicesKubeproxy kubeproxy;
    /**
     * @return Scheduler options for RKE services (list maxitems:1)
     * 
     */
    private final @Nullable ClusterRkeConfigServicesScheduler scheduler;

    @CustomType.Constructor
    private ClusterRkeConfigServices(
        @CustomType.Parameter("etcd") @Nullable ClusterRkeConfigServicesEtcd etcd,
        @CustomType.Parameter("kubeApi") @Nullable ClusterRkeConfigServicesKubeApi kubeApi,
        @CustomType.Parameter("kubeController") @Nullable ClusterRkeConfigServicesKubeController kubeController,
        @CustomType.Parameter("kubelet") @Nullable ClusterRkeConfigServicesKubelet kubelet,
        @CustomType.Parameter("kubeproxy") @Nullable ClusterRkeConfigServicesKubeproxy kubeproxy,
        @CustomType.Parameter("scheduler") @Nullable ClusterRkeConfigServicesScheduler scheduler) {
        this.etcd = etcd;
        this.kubeApi = kubeApi;
        this.kubeController = kubeController;
        this.kubelet = kubelet;
        this.kubeproxy = kubeproxy;
        this.scheduler = scheduler;
    }

    /**
     * @return Etcd options for RKE services (list maxitems:1)
     * 
     */
    public Optional<ClusterRkeConfigServicesEtcd> etcd() {
        return Optional.ofNullable(this.etcd);
    }
    /**
     * @return Kube API options for RKE services (list maxitems:1)
     * 
     */
    public Optional<ClusterRkeConfigServicesKubeApi> kubeApi() {
        return Optional.ofNullable(this.kubeApi);
    }
    /**
     * @return Kube Controller options for RKE services (list maxitems:1)
     * 
     */
    public Optional<ClusterRkeConfigServicesKubeController> kubeController() {
        return Optional.ofNullable(this.kubeController);
    }
    /**
     * @return Kubelet options for RKE services (list maxitems:1)
     * 
     */
    public Optional<ClusterRkeConfigServicesKubelet> kubelet() {
        return Optional.ofNullable(this.kubelet);
    }
    /**
     * @return Kubeproxy options for RKE services (list maxitems:1)
     * 
     */
    public Optional<ClusterRkeConfigServicesKubeproxy> kubeproxy() {
        return Optional.ofNullable(this.kubeproxy);
    }
    /**
     * @return Scheduler options for RKE services (list maxitems:1)
     * 
     */
    public Optional<ClusterRkeConfigServicesScheduler> scheduler() {
        return Optional.ofNullable(this.scheduler);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigServices defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClusterRkeConfigServicesEtcd etcd;
        private @Nullable ClusterRkeConfigServicesKubeApi kubeApi;
        private @Nullable ClusterRkeConfigServicesKubeController kubeController;
        private @Nullable ClusterRkeConfigServicesKubelet kubelet;
        private @Nullable ClusterRkeConfigServicesKubeproxy kubeproxy;
        private @Nullable ClusterRkeConfigServicesScheduler scheduler;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterRkeConfigServices defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etcd = defaults.etcd;
    	      this.kubeApi = defaults.kubeApi;
    	      this.kubeController = defaults.kubeController;
    	      this.kubelet = defaults.kubelet;
    	      this.kubeproxy = defaults.kubeproxy;
    	      this.scheduler = defaults.scheduler;
        }

        public Builder etcd(@Nullable ClusterRkeConfigServicesEtcd etcd) {
            this.etcd = etcd;
            return this;
        }
        public Builder kubeApi(@Nullable ClusterRkeConfigServicesKubeApi kubeApi) {
            this.kubeApi = kubeApi;
            return this;
        }
        public Builder kubeController(@Nullable ClusterRkeConfigServicesKubeController kubeController) {
            this.kubeController = kubeController;
            return this;
        }
        public Builder kubelet(@Nullable ClusterRkeConfigServicesKubelet kubelet) {
            this.kubelet = kubelet;
            return this;
        }
        public Builder kubeproxy(@Nullable ClusterRkeConfigServicesKubeproxy kubeproxy) {
            this.kubeproxy = kubeproxy;
            return this;
        }
        public Builder scheduler(@Nullable ClusterRkeConfigServicesScheduler scheduler) {
            this.scheduler = scheduler;
            return this;
        }        public ClusterRkeConfigServices build() {
            return new ClusterRkeConfigServices(etcd, kubeApi, kubeController, kubelet, kubeproxy, scheduler);
        }
    }
}