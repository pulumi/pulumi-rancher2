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
    public sealed class ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpression
    {
        /// <summary>
        /// Machine selector label match expressions key (string)
        /// </summary>
        public readonly string? Key;
        /// <summary>
        /// Machine selector label match expressions operator (string)
        /// </summary>
        public readonly string? Operator;
        /// <summary>
        /// Machine selector label match expressions values (List string)
        /// </summary>
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpression(
            string? key,

            string? @operator,

            ImmutableArray<string> values)
        {
            Key = key;
            Operator = @operator;
            Values = values;
        }
    }
}