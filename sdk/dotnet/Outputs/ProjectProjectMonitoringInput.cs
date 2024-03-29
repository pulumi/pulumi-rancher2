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
    public sealed class ProjectProjectMonitoringInput
    {
        /// <summary>
        /// Key/value answers for monitor input (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Answers;
        /// <summary>
        /// rancher-monitoring chart version (string)
        /// </summary>
        public readonly string? Version;

        [OutputConstructor]
        private ProjectProjectMonitoringInput(
            ImmutableDictionary<string, object>? answers,

            string? version)
        {
            Answers = answers;
            Version = version;
        }
    }
}
