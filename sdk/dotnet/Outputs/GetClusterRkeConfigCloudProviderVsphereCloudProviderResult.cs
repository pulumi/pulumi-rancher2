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
    public sealed class GetClusterRkeConfigCloudProviderVsphereCloudProviderResult
    {
        public readonly Outputs.GetClusterRkeConfigCloudProviderVsphereCloudProviderDiskResult Disk;
        public readonly Outputs.GetClusterRkeConfigCloudProviderVsphereCloudProviderGlobalResult Global;
        public readonly Outputs.GetClusterRkeConfigCloudProviderVsphereCloudProviderNetworkResult Network;
        public readonly ImmutableArray<Outputs.GetClusterRkeConfigCloudProviderVsphereCloudProviderVirtualCenterResult> VirtualCenters;
        public readonly Outputs.GetClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceResult Workspace;

        [OutputConstructor]
        private GetClusterRkeConfigCloudProviderVsphereCloudProviderResult(
            Outputs.GetClusterRkeConfigCloudProviderVsphereCloudProviderDiskResult disk,

            Outputs.GetClusterRkeConfigCloudProviderVsphereCloudProviderGlobalResult global,

            Outputs.GetClusterRkeConfigCloudProviderVsphereCloudProviderNetworkResult network,

            ImmutableArray<Outputs.GetClusterRkeConfigCloudProviderVsphereCloudProviderVirtualCenterResult> virtualCenters,

            Outputs.GetClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceResult workspace)
        {
            Disk = disk;
            Global = global;
            Network = network;
            VirtualCenters = virtualCenters;
            Workspace = workspace;
        }
    }
}