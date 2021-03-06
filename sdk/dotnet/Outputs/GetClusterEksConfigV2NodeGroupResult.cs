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
    public sealed class GetClusterEksConfigV2NodeGroupResult
    {
        public readonly int? DesiredSize;
        public readonly int? DiskSize;
        public readonly string? Ec2SshKey;
        public readonly bool? Gpu;
        public readonly string? ImageId;
        public readonly string? InstanceType;
        /// <summary>
        /// (Computed) Labels for Node Pool object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Labels;
        public readonly ImmutableArray<Outputs.GetClusterEksConfigV2NodeGroupLaunchTemplateResult> LaunchTemplates;
        public readonly int? MaxSize;
        public readonly int? MinSize;
        /// <summary>
        /// The name of the Cluster (string)
        /// </summary>
        public readonly string Name;
        public readonly bool? RequestSpotInstances;
        public readonly ImmutableDictionary<string, object>? ResourceTags;
        public readonly ImmutableArray<string> SpotInstanceTypes;
        public readonly ImmutableArray<string> Subnets;
        public readonly ImmutableDictionary<string, object>? Tags;
        public readonly string UserData;
        public readonly string Version;

        [OutputConstructor]
        private GetClusterEksConfigV2NodeGroupResult(
            int? desiredSize,

            int? diskSize,

            string? ec2SshKey,

            bool? gpu,

            string? imageId,

            string? instanceType,

            ImmutableDictionary<string, object>? labels,

            ImmutableArray<Outputs.GetClusterEksConfigV2NodeGroupLaunchTemplateResult> launchTemplates,

            int? maxSize,

            int? minSize,

            string name,

            bool? requestSpotInstances,

            ImmutableDictionary<string, object>? resourceTags,

            ImmutableArray<string> spotInstanceTypes,

            ImmutableArray<string> subnets,

            ImmutableDictionary<string, object>? tags,

            string userData,

            string version)
        {
            DesiredSize = desiredSize;
            DiskSize = diskSize;
            Ec2SshKey = ec2SshKey;
            Gpu = gpu;
            ImageId = imageId;
            InstanceType = instanceType;
            Labels = labels;
            LaunchTemplates = launchTemplates;
            MaxSize = maxSize;
            MinSize = minSize;
            Name = name;
            RequestSpotInstances = requestSpotInstances;
            ResourceTags = resourceTags;
            SpotInstanceTypes = spotInstanceTypes;
            Subnets = subnets;
            Tags = tags;
            UserData = userData;
            Version = version;
        }
    }
}
