// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdBackupConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable cluster template revision. Default `true` (bool)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("intervalHours")]
        public Input<int>? IntervalHours { get; set; }

        [Input("retention")]
        public Input<int>? Retention { get; set; }

        [Input("s3BackupConfig")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdBackupConfigS3BackupConfigGetArgs>? S3BackupConfig { get; set; }

        [Input("safeTimestamp")]
        public Input<bool>? SafeTimestamp { get; set; }

        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdBackupConfigGetArgs()
        {
        }
        public static new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdBackupConfigGetArgs Empty => new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdBackupConfigGetArgs();
    }
}
