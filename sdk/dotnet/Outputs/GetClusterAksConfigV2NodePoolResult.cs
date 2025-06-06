// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Outputs
{

    [OutputType]
    public sealed class GetClusterAksConfigV2NodePoolResult
    {
        /// <summary>
        /// The AKS node pool availability zones
        /// </summary>
        public readonly ImmutableArray<string> AvailabilityZones;
        /// <summary>
        /// The AKS node pool count
        /// </summary>
        public readonly int? Count;
        /// <summary>
        /// Is AKS node pool auto scaling enabled?
        /// </summary>
        public readonly bool? EnableAutoScaling;
        /// <summary>
        /// (Computed) Labels for Node Pool object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, string> Labels;
        /// <summary>
        /// The AKS node pool max count
        /// </summary>
        public readonly int? MaxCount;
        /// <summary>
        /// The AKS node pool max pods
        /// </summary>
        public readonly int? MaxPods;
        /// <summary>
        /// The AKS node pool max surge
        /// </summary>
        public readonly string? MaxSurge;
        /// <summary>
        /// The AKS node pool min count
        /// </summary>
        public readonly int? MinCount;
        /// <summary>
        /// The AKS node pool mode
        /// </summary>
        public readonly string? Mode;
        /// <summary>
        /// The name of the Cluster (string)
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The AKS node pool orchestrator version
        /// </summary>
        public readonly string? OrchestratorVersion;
        /// <summary>
        /// The AKS node pool os disk size gb
        /// </summary>
        public readonly int? OsDiskSizeGb;
        /// <summary>
        /// The AKS node pool os disk type
        /// </summary>
        public readonly string? OsDiskType;
        /// <summary>
        /// Enable AKS node pool os type
        /// </summary>
        public readonly string? OsType;
        /// <summary>
        /// The AKS node pool taints
        /// </summary>
        public readonly ImmutableArray<string> Taints;
        /// <summary>
        /// The AKS node pool vm size
        /// </summary>
        public readonly string VmSize;

        [OutputConstructor]
        private GetClusterAksConfigV2NodePoolResult(
            ImmutableArray<string> availabilityZones,

            int? count,

            bool? enableAutoScaling,

            ImmutableDictionary<string, string> labels,

            int? maxCount,

            int? maxPods,

            string? maxSurge,

            int? minCount,

            string? mode,

            string name,

            string? orchestratorVersion,

            int? osDiskSizeGb,

            string? osDiskType,

            string? osType,

            ImmutableArray<string> taints,

            string vmSize)
        {
            AvailabilityZones = availabilityZones;
            Count = count;
            EnableAutoScaling = enableAutoScaling;
            Labels = labels;
            MaxCount = maxCount;
            MaxPods = maxPods;
            MaxSurge = maxSurge;
            MinCount = minCount;
            Mode = mode;
            Name = name;
            OrchestratorVersion = orchestratorVersion;
            OsDiskSizeGb = osDiskSizeGb;
            OsDiskType = osDiskType;
            OsType = osType;
            Taints = taints;
            VmSize = vmSize;
        }
    }
}
