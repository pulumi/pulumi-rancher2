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
    public sealed class ClusterGkeConfigV2MasterAuthorizedNetworksConfig
    {
        /// <summary>
        /// The GKE master authorized network config cidr blocks (List)
        /// </summary>
        public readonly ImmutableArray<Outputs.ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlock> CidrBlocks;
        /// <summary>
        /// Enable scheduled cluster scan. Default: `false` (bool)
        /// </summary>
        public readonly bool? Enabled;

        [OutputConstructor]
        private ClusterGkeConfigV2MasterAuthorizedNetworksConfig(
            ImmutableArray<Outputs.ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlock> cidrBlocks,

            bool? enabled)
        {
            CidrBlocks = cidrBlocks;
            Enabled = enabled;
        }
    }
}