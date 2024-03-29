// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("matchExpressions")]
        private InputList<Inputs.ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorMatchExpressionGetArgs>? _matchExpressions;

        /// <summary>
        /// Match expressions is a list of label selector requirements. The requirements are ANDed.
        /// </summary>
        public InputList<Inputs.ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorMatchExpressionGetArgs> MatchExpressions
        {
            get => _matchExpressions ?? (_matchExpressions = new InputList<Inputs.ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorMatchExpressionGetArgs>());
            set => _matchExpressions = value;
        }

        [Input("matchLabels")]
        private InputMap<object>? _matchLabels;

        /// <summary>
        /// Machine selector label is a map of {key,value} pairs, the requirements are ANDed.
        /// </summary>
        public InputMap<object> MatchLabels
        {
            get => _matchLabels ?? (_matchLabels = new InputMap<object>());
            set => _matchLabels = value;
        }

        public ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorGetArgs()
        {
        }
        public static new ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorGetArgs Empty => new ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorGetArgs();
    }
}
