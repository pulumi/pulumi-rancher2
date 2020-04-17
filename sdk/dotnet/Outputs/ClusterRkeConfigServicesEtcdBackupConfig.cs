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
    public sealed class ClusterRkeConfigServicesEtcdBackupConfig
    {
        /// <summary>
        /// Enable scheduled cluster scan. Default: `false` (bool)
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Interval hours for etcd backup. Default `12` (int)
        /// </summary>
        public readonly int? IntervalHours;
        /// <summary>
        /// Retention for etcd backup. Default `6` (int)
        /// </summary>
        public readonly int? Retention;
        /// <summary>
        /// S3 config options for etcd backup (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterRkeConfigServicesEtcdBackupConfigS3BackupConfig? S3BackupConfig;
        /// <summary>
        /// Safe timestamp for etcd backup. Default: `false` (bool)
        /// </summary>
        public readonly bool? SafeTimestamp;

        [OutputConstructor]
        private ClusterRkeConfigServicesEtcdBackupConfig(
            bool? enabled,

            int? intervalHours,

            int? retention,

            Outputs.ClusterRkeConfigServicesEtcdBackupConfigS3BackupConfig? s3BackupConfig,

            bool? safeTimestamp)
        {
            Enabled = enabled;
            IntervalHours = intervalHours;
            Retention = retention;
            S3BackupConfig = s3BackupConfig;
            SafeTimestamp = safeTimestamp;
        }
    }
}