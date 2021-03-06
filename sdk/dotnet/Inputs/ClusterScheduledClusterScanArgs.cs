// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterScheduledClusterScanArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable scheduled cluster scan. Default: `false` (bool)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Cluster scan config (List maxitems:1)
        /// </summary>
        [Input("scanConfig", required: true)]
        public Input<Inputs.ClusterScheduledClusterScanScanConfigArgs> ScanConfig { get; set; } = null!;

        /// <summary>
        /// Cluster scan schedule config (list maxitems:1)
        /// </summary>
        [Input("scheduleConfig", required: true)]
        public Input<Inputs.ClusterScheduledClusterScanScheduleConfigArgs> ScheduleConfig { get; set; } = null!;

        public ClusterScheduledClusterScanArgs()
        {
        }
    }
}
