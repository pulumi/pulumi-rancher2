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
    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigUpgradeStrategyDrainInput
    {
        public readonly bool? DeleteLocalData;
        public readonly bool? Force;
        public readonly int? GracePeriod;
        public readonly bool? IgnoreDaemonSets;
        public readonly int? Timeout;

        [OutputConstructor]
        private ClusterTemplateTemplateRevisionClusterConfigRkeConfigUpgradeStrategyDrainInput(
            bool? deleteLocalData,

            bool? force,

            int? gracePeriod,

            bool? ignoreDaemonSets,

            int? timeout)
        {
            DeleteLocalData = deleteLocalData;
            Force = force;
            GracePeriod = gracePeriod;
            IgnoreDaemonSets = ignoreDaemonSets;
            Timeout = timeout;
        }
    }
}