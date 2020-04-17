// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Outputs
{

    [OutputType]
    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider
    {
        public readonly Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderBlockStorage? BlockStorage;
        public readonly Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobal Global;
        public readonly Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderLoadBalancer? LoadBalancer;
        public readonly Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderMetadata? Metadata;
        public readonly Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderRoute? Route;

        [OutputConstructor]
        private ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider(
            Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderBlockStorage? blockStorage,

            Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobal global,

            Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderLoadBalancer? loadBalancer,

            Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderMetadata? metadata,

            Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderRoute? route)
        {
            BlockStorage = blockStorage;
            Global = global;
            LoadBalancer = loadBalancer;
            Metadata = metadata;
            Route = route;
        }
    }
}