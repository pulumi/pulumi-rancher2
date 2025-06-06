// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesArgs : global::Pulumi.ResourceArgs
    {
        [Input("etcd")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdArgs>? Etcd { get; set; }

        [Input("kubeApi")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiArgs>? KubeApi { get; set; }

        [Input("kubeController")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeControllerArgs>? KubeController { get; set; }

        [Input("kubelet")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeletArgs>? Kubelet { get; set; }

        [Input("kubeproxy")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeproxyArgs>? Kubeproxy { get; set; }

        [Input("scheduler")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesSchedulerArgs>? Scheduler { get; set; }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesArgs()
        {
        }
        public static new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesArgs Empty => new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesArgs();
    }
}
