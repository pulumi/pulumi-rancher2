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
    public sealed class ClusterV2FleetAgentDeploymentCustomizationOverrideResourceRequirement
    {
        /// <summary>
        /// The maximum CPU limit for agent
        /// </summary>
        public readonly string? CpuLimit;
        /// <summary>
        /// The minimum CPU required for agent
        /// </summary>
        public readonly string? CpuRequest;
        /// <summary>
        /// The maximum memory limit for agent
        /// </summary>
        public readonly string? MemoryLimit;
        /// <summary>
        /// The minimum memory required for agent
        /// </summary>
        public readonly string? MemoryRequest;

        [OutputConstructor]
        private ClusterV2FleetAgentDeploymentCustomizationOverrideResourceRequirement(
            string? cpuLimit,

            string? cpuRequest,

            string? memoryLimit,

            string? memoryRequest)
        {
            CpuLimit = cpuLimit;
            CpuRequest = cpuRequest;
            MemoryLimit = memoryLimit;
            MemoryRequest = memoryRequest;
        }
    }
}
