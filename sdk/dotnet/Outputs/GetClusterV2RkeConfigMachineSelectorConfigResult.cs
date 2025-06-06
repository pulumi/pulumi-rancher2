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
    public sealed class GetClusterV2RkeConfigMachineSelectorConfigResult
    {
        /// <summary>
        /// Machine selector config
        /// </summary>
        public readonly string? Config;
        /// <summary>
        /// Machine label selector
        /// </summary>
        public readonly Outputs.GetClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorResult? MachineLabelSelector;

        [OutputConstructor]
        private GetClusterV2RkeConfigMachineSelectorConfigResult(
            string? config,

            Outputs.GetClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorResult? machineLabelSelector)
        {
            Config = config;
            MachineLabelSelector = machineLabelSelector;
        }
    }
}
