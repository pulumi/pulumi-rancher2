// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterGkeConfigV2ClusterAddonsArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable GKE horizontal pod autoscaling. Default: `false` (bool)
        /// </summary>
        [Input("horizontalPodAutoscaling")]
        public Input<bool>? HorizontalPodAutoscaling { get; set; }

        /// <summary>
        /// Enable GKE HTTP load balancing. Default: `false` (bool)
        /// </summary>
        [Input("httpLoadBalancing")]
        public Input<bool>? HttpLoadBalancing { get; set; }

        /// <summary>
        /// Enable GKE network policy config. Default: `false` (bool)
        /// </summary>
        [Input("networkPolicyConfig")]
        public Input<bool>? NetworkPolicyConfig { get; set; }

        public ClusterGkeConfigV2ClusterAddonsArgs()
        {
        }
    }
}