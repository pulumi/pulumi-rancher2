// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterGkeConfigV2PrivateClusterConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable GKE cluster private endpoint. Default: `false` (bool)
        /// </summary>
        [Input("enablePrivateEndpoint")]
        public Input<bool>? EnablePrivateEndpoint { get; set; }

        /// <summary>
        /// Specifies whether worker nodes will be deployed into a new, private, subnet. Default `false` (bool)
        /// </summary>
        [Input("enablePrivateNodes")]
        public Input<bool>? EnablePrivateNodes { get; set; }

        /// <summary>
        /// The GKE cluster private master ip v4 cidr block (string)
        /// </summary>
        [Input("masterIpv4CidrBlock", required: true)]
        public Input<string> MasterIpv4CidrBlock { get; set; } = null!;

        public ClusterGkeConfigV2PrivateClusterConfigArgs()
        {
        }
    }
}