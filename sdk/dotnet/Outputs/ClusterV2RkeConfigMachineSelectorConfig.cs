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
    public sealed class ClusterV2RkeConfigMachineSelectorConfig
    {
        /// <summary>
        /// Machine selector config (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Config;
        /// <summary>
        /// Machine selector label (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelector? MachineLabelSelector;

        [OutputConstructor]
        private ClusterV2RkeConfigMachineSelectorConfig(
            ImmutableDictionary<string, object>? config,

            Outputs.ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelector? machineLabelSelector)
        {
            Config = config;
            MachineLabelSelector = machineLabelSelector;
        }
    }
}