// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterV2FleetAgentDeploymentCustomizationAppendTolerationArgs : global::Pulumi.ResourceArgs
    {
        [Input("effect")]
        public Input<string>? Effect { get; set; }

        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("operator")]
        public Input<string>? Operator { get; set; }

        [Input("seconds")]
        public Input<int>? Seconds { get; set; }

        [Input("value")]
        public Input<string>? Value { get; set; }

        public ClusterV2FleetAgentDeploymentCustomizationAppendTolerationArgs()
        {
        }
        public static new ClusterV2FleetAgentDeploymentCustomizationAppendTolerationArgs Empty => new ClusterV2FleetAgentDeploymentCustomizationAppendTolerationArgs();
    }
}
