// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigUpgradeStrategyGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("drain")]
        public Input<bool>? Drain { get; set; }

        [Input("drainInput")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigUpgradeStrategyDrainInputGetArgs>? DrainInput { get; set; }

        [Input("maxUnavailableControlplane")]
        public Input<string>? MaxUnavailableControlplane { get; set; }

        [Input("maxUnavailableWorker")]
        public Input<string>? MaxUnavailableWorker { get; set; }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigUpgradeStrategyGetArgs()
        {
        }
        public static new ClusterTemplateTemplateRevisionClusterConfigRkeConfigUpgradeStrategyGetArgs Empty => new ClusterTemplateTemplateRevisionClusterConfigRkeConfigUpgradeStrategyGetArgs();
    }
}
