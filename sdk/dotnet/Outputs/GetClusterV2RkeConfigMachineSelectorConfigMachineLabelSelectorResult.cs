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
    public sealed class GetClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorResult
    {
        public readonly ImmutableArray<Outputs.GetClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpressionResult> MatchExpressions;
        public readonly ImmutableDictionary<string, object>? MatchLabels;

        [OutputConstructor]
        private GetClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorResult(
            ImmutableArray<Outputs.GetClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpressionResult> matchExpressions,

            ImmutableDictionary<string, object>? matchLabels)
        {
            MatchExpressions = matchExpressions;
            MatchLabels = matchLabels;
        }
    }
}