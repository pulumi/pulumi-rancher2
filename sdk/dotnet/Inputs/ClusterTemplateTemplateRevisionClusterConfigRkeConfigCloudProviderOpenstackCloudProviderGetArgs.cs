// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("blockStorage")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderBlockStorageGetArgs>? BlockStorage { get; set; }

        [Input("global", required: true)]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobalGetArgs> Global { get; set; } = null!;

        [Input("loadBalancer")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderLoadBalancerGetArgs>? LoadBalancer { get; set; }

        [Input("metadata")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderMetadataGetArgs>? Metadata { get; set; }

        [Input("route")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderRouteGetArgs>? Route { get; set; }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGetArgs()
        {
        }
        public static new ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGetArgs Empty => new ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGetArgs();
    }
}
