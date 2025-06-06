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
    public sealed class ClusterV2LocalAuthEndpoint
    {
        /// <summary>
        /// CA certs for the authorized cluster endpoint. It is only needed if there is a load balancer in front of the downstream cluster that is using an untrusted certificate. If you have a valid certificate, then nothing needs to be added to the CA Certificates field.
        /// </summary>
        public readonly string? CaCerts;
        /// <summary>
        /// If `enabled` is set to true, nodes will be drained before upgrade.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// FQDN for the authorized cluster endpoint. If one is entered, it should point to the downstream cluster.
        /// </summary>
        public readonly string? Fqdn;

        [OutputConstructor]
        private ClusterV2LocalAuthEndpoint(
            string? caCerts,

            bool? enabled,

            string? fqdn)
        {
            CaCerts = caCerts;
            Enabled = enabled;
            Fqdn = fqdn;
        }
    }
}
