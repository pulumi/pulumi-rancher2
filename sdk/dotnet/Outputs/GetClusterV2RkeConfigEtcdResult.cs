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
    public sealed class GetClusterV2RkeConfigEtcdResult
    {
        public readonly bool? DisableSnapshots;
        public readonly Outputs.GetClusterV2RkeConfigEtcdS3ConfigResult? S3Config;
        public readonly int? SnapshotRetention;
        public readonly string? SnapshotScheduleCron;

        [OutputConstructor]
        private GetClusterV2RkeConfigEtcdResult(
            bool? disableSnapshots,

            Outputs.GetClusterV2RkeConfigEtcdS3ConfigResult? s3Config,

            int? snapshotRetention,

            string? snapshotScheduleCron)
        {
            DisableSnapshots = disableSnapshots;
            S3Config = s3Config;
            SnapshotRetention = snapshotRetention;
            SnapshotScheduleCron = snapshotScheduleCron;
        }
    }
}