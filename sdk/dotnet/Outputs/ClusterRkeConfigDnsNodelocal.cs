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
    public sealed class ClusterRkeConfigDnsNodelocal
    {
        /// <summary>
        /// Nodelocal dns ip address (string)
        /// </summary>
        public readonly string? IpAddress;
        /// <summary>
        /// Node selector key pair
        /// </summary>
        public readonly ImmutableDictionary<string, string>? NodeSelector;

        [OutputConstructor]
        private ClusterRkeConfigDnsNodelocal(
            string? ipAddress,

            ImmutableDictionary<string, string>? nodeSelector)
        {
            IpAddress = ipAddress;
            NodeSelector = nodeSelector;
        }
    }
}
