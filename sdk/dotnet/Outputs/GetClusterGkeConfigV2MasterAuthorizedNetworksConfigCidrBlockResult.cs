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
    public sealed class GetClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlockResult
    {
        /// <summary>
        /// The GKE master authorized network config cidr block
        /// </summary>
        public readonly string CidrBlock;
        /// <summary>
        /// The GKE master authorized network config cidr block dispaly name
        /// </summary>
        public readonly string? DisplayName;

        [OutputConstructor]
        private GetClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlockResult(
            string cidrBlock,

            string? displayName)
        {
            CidrBlock = cidrBlock;
            DisplayName = displayName;
        }
    }
}
