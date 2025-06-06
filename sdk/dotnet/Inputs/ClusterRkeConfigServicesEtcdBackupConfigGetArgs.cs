// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigServicesEtcdBackupConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable the authorized cluster endpoint. Default `true` (bool)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Interval hours for etcd backup. Default `12` (int)
        /// </summary>
        [Input("intervalHours")]
        public Input<int>? IntervalHours { get; set; }

        /// <summary>
        /// Retention for etcd backup. Default `6` (int)
        /// </summary>
        [Input("retention")]
        public Input<int>? Retention { get; set; }

        /// <summary>
        /// S3 config options for etcd backup (list maxitems:1)
        /// </summary>
        [Input("s3BackupConfig")]
        public Input<Inputs.ClusterRkeConfigServicesEtcdBackupConfigS3BackupConfigGetArgs>? S3BackupConfig { get; set; }

        /// <summary>
        /// Safe timestamp for etcd backup. Default: `false` (bool)
        /// </summary>
        [Input("safeTimestamp")]
        public Input<bool>? SafeTimestamp { get; set; }

        /// <summary>
        /// RKE node drain timeout. Default: `60` (int)
        /// </summary>
        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        public ClusterRkeConfigServicesEtcdBackupConfigGetArgs()
        {
        }
        public static new ClusterRkeConfigServicesEtcdBackupConfigGetArgs Empty => new ClusterRkeConfigServicesEtcdBackupConfigGetArgs();
    }
}
