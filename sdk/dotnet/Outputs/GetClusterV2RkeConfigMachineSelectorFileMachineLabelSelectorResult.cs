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
    public sealed class GetClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorResult
    {
        /// <summary>
        /// Label selector match expressions
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorMatchExpressionResult> MatchExpressions;
        /// <summary>
        /// Label selector match labels
        /// </summary>
        public readonly ImmutableDictionary<string, string>? MatchLabels;

        [OutputConstructor]
        private GetClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorResult(
            ImmutableArray<Outputs.GetClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorMatchExpressionResult> matchExpressions,

            ImmutableDictionary<string, string>? matchLabels)
        {
            MatchExpressions = matchExpressions;
            MatchLabels = matchLabels;
        }
    }
}
