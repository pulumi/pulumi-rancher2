// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Outputs
{

    [OutputType]
    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigServices
    {
        public readonly Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcd? Etcd;
        public readonly Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApi? KubeApi;
        public readonly Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeController? KubeController;
        public readonly Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubelet? Kubelet;
        public readonly Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeproxy? Kubeproxy;
        public readonly Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesScheduler? Scheduler;

        [OutputConstructor]
        private ClusterTemplateTemplateRevisionClusterConfigRkeConfigServices(
            Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcd? etcd,

            Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApi? kubeApi,

            Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeController? kubeController,

            Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubelet? kubelet,

            Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeproxy? kubeproxy,

            Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesScheduler? scheduler)
        {
            Etcd = etcd;
            KubeApi = kubeApi;
            KubeController = kubeController;
            Kubelet = kubelet;
            Kubeproxy = kubeproxy;
            Scheduler = scheduler;
        }
    }
}
