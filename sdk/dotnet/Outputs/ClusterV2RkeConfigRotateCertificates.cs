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
    public sealed class ClusterV2RkeConfigRotateCertificates
    {
        /// <summary>
        /// Desired certificate rotation generation.
        /// </summary>
        public readonly int Generation;
        /// <summary>
        /// Service certificates to rotate with this generation.
        /// </summary>
        public readonly ImmutableArray<string> Services;

        [OutputConstructor]
        private ClusterV2RkeConfigRotateCertificates(
            int generation,

            ImmutableArray<string> services)
        {
            Generation = generation;
            Services = services;
        }
    }
}
