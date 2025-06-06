// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterV2AgentEnvVarGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the cluster.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The taint value.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public ClusterV2AgentEnvVarGetArgs()
        {
        }
        public static new ClusterV2AgentEnvVarGetArgs Empty => new ClusterV2AgentEnvVarGetArgs();
    }
}
