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
    public sealed class ClusterRkeConfigMonitoringUpdateStrategy
    {
        /// <summary>
        /// Monitoring deployment rolling update (list Maxitems: 1)
        /// </summary>
        public readonly Outputs.ClusterRkeConfigMonitoringUpdateStrategyRollingUpdate? RollingUpdate;
        /// <summary>
        /// Monitoring deployment update strategy (string)
        /// </summary>
        public readonly string? Strategy;

        [OutputConstructor]
        private ClusterRkeConfigMonitoringUpdateStrategy(
            Outputs.ClusterRkeConfigMonitoringUpdateStrategyRollingUpdate? rollingUpdate,

            string? strategy)
        {
            RollingUpdate = rollingUpdate;
            Strategy = strategy;
        }
    }
}