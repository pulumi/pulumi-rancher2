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
    public sealed class ClusterScheduledClusterScan
    {
        /// <summary>
        /// Enable scheduled cluster scan. Default: `false` (bool)
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Cluster scan config (List maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterScheduledClusterScanScanConfig ScanConfig;
        /// <summary>
        /// Cluster scan schedule config (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterScheduledClusterScanScheduleConfig ScheduleConfig;

        [OutputConstructor]
        private ClusterScheduledClusterScan(
            bool? enabled,

            Outputs.ClusterScheduledClusterScanScanConfig scanConfig,

            Outputs.ClusterScheduledClusterScanScheduleConfig scheduleConfig)
        {
            Enabled = enabled;
            ScanConfig = scanConfig;
            ScheduleConfig = scheduleConfig;
        }
    }
}