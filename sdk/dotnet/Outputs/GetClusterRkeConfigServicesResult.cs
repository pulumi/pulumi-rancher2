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
    public sealed class GetClusterRkeConfigServicesResult
    {
        public readonly Outputs.GetClusterRkeConfigServicesEtcdResult Etcd;
        public readonly Outputs.GetClusterRkeConfigServicesKubeApiResult KubeApi;
        public readonly Outputs.GetClusterRkeConfigServicesKubeControllerResult KubeController;
        public readonly Outputs.GetClusterRkeConfigServicesKubeletResult Kubelet;
        public readonly Outputs.GetClusterRkeConfigServicesKubeproxyResult Kubeproxy;
        public readonly Outputs.GetClusterRkeConfigServicesSchedulerResult Scheduler;

        [OutputConstructor]
        private GetClusterRkeConfigServicesResult(
            Outputs.GetClusterRkeConfigServicesEtcdResult etcd,

            Outputs.GetClusterRkeConfigServicesKubeApiResult kubeApi,

            Outputs.GetClusterRkeConfigServicesKubeControllerResult kubeController,

            Outputs.GetClusterRkeConfigServicesKubeletResult kubelet,

            Outputs.GetClusterRkeConfigServicesKubeproxyResult kubeproxy,

            Outputs.GetClusterRkeConfigServicesSchedulerResult scheduler)
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
