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
    public sealed class GetClusterRkeConfigUpgradeStrategyResult
    {
        public readonly bool? Drain;
        public readonly Outputs.GetClusterRkeConfigUpgradeStrategyDrainInputResult DrainInput;
        public readonly string? MaxUnavailableControlplane;
        public readonly string? MaxUnavailableWorker;

        [OutputConstructor]
        private GetClusterRkeConfigUpgradeStrategyResult(
            bool? drain,

            Outputs.GetClusterRkeConfigUpgradeStrategyDrainInputResult drainInput,

            string? maxUnavailableControlplane,

            string? maxUnavailableWorker)
        {
            Drain = drain;
            DrainInput = drainInput;
            MaxUnavailableControlplane = maxUnavailableControlplane;
            MaxUnavailableWorker = maxUnavailableWorker;
        }
    }
}