// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdArgs;
import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiArgs;
import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeControllerArgs;
import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeletArgs;
import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeproxyArgs;
import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesSchedulerArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesArgs Empty = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesArgs();

    @Import(name="etcd")
    private @Nullable Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdArgs> etcd;

    public Optional<Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdArgs>> etcd() {
        return Optional.ofNullable(this.etcd);
    }

    @Import(name="kubeApi")
    private @Nullable Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiArgs> kubeApi;

    public Optional<Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiArgs>> kubeApi() {
        return Optional.ofNullable(this.kubeApi);
    }

    @Import(name="kubeController")
    private @Nullable Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeControllerArgs> kubeController;

    public Optional<Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeControllerArgs>> kubeController() {
        return Optional.ofNullable(this.kubeController);
    }

    @Import(name="kubelet")
    private @Nullable Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeletArgs> kubelet;

    public Optional<Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeletArgs>> kubelet() {
        return Optional.ofNullable(this.kubelet);
    }

    @Import(name="kubeproxy")
    private @Nullable Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeproxyArgs> kubeproxy;

    public Optional<Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeproxyArgs>> kubeproxy() {
        return Optional.ofNullable(this.kubeproxy);
    }

    @Import(name="scheduler")
    private @Nullable Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesSchedulerArgs> scheduler;

    public Optional<Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesSchedulerArgs>> scheduler() {
        return Optional.ofNullable(this.scheduler);
    }

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesArgs() {}

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesArgs(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesArgs $) {
        this.etcd = $.etcd;
        this.kubeApi = $.kubeApi;
        this.kubeController = $.kubeController;
        this.kubelet = $.kubelet;
        this.kubeproxy = $.kubeproxy;
        this.scheduler = $.scheduler;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesArgs $;

        public Builder() {
            $ = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesArgs();
        }

        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesArgs defaults) {
            $ = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesArgs(Objects.requireNonNull(defaults));
        }

        public Builder etcd(@Nullable Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdArgs> etcd) {
            $.etcd = etcd;
            return this;
        }

        public Builder etcd(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdArgs etcd) {
            return etcd(Output.of(etcd));
        }

        public Builder kubeApi(@Nullable Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiArgs> kubeApi) {
            $.kubeApi = kubeApi;
            return this;
        }

        public Builder kubeApi(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiArgs kubeApi) {
            return kubeApi(Output.of(kubeApi));
        }

        public Builder kubeController(@Nullable Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeControllerArgs> kubeController) {
            $.kubeController = kubeController;
            return this;
        }

        public Builder kubeController(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeControllerArgs kubeController) {
            return kubeController(Output.of(kubeController));
        }

        public Builder kubelet(@Nullable Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeletArgs> kubelet) {
            $.kubelet = kubelet;
            return this;
        }

        public Builder kubelet(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeletArgs kubelet) {
            return kubelet(Output.of(kubelet));
        }

        public Builder kubeproxy(@Nullable Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeproxyArgs> kubeproxy) {
            $.kubeproxy = kubeproxy;
            return this;
        }

        public Builder kubeproxy(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeproxyArgs kubeproxy) {
            return kubeproxy(Output.of(kubeproxy));
        }

        public Builder scheduler(@Nullable Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesSchedulerArgs> scheduler) {
            $.scheduler = scheduler;
            return this;
        }

        public Builder scheduler(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesSchedulerArgs scheduler) {
            return scheduler(Output.of(scheduler));
        }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesArgs build() {
            return $;
        }
    }

}
