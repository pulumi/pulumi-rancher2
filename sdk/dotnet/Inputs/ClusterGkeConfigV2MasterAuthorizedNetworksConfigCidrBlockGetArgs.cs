// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlockGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The GKE master authorized network config cidr block (string)
        /// </summary>
        [Input("cidrBlock", required: true)]
        public Input<string> CidrBlock { get; set; } = null!;

        /// <summary>
        /// The GKE master authorized network config cidr block dispaly name (string)
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        public ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlockGetArgs()
        {
        }
    }
}