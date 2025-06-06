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
    public sealed class ClusterV2RkeConfigRegistriesConfig
    {
        /// <summary>
        /// Registry auth config secret name
        /// </summary>
        public readonly string? AuthConfigSecretName;
        /// <summary>
        /// Registry CA bundle
        /// </summary>
        public readonly string? CaBundle;
        /// <summary>
        /// Registry hostname
        /// </summary>
        public readonly string Hostname;
        /// <summary>
        /// Registry insecure connectivity
        /// </summary>
        public readonly bool? Insecure;
        /// <summary>
        /// Registry TLS secret name. TLS is a pair of Cert/Key
        /// </summary>
        public readonly string? TlsSecretName;

        [OutputConstructor]
        private ClusterV2RkeConfigRegistriesConfig(
            string? authConfigSecretName,

            string? caBundle,

            string hostname,

            bool? insecure,

            string? tlsSecretName)
        {
            AuthConfigSecretName = authConfigSecretName;
            CaBundle = caBundle;
            Hostname = hostname;
            Insecure = insecure;
            TlsSecretName = tlsSecretName;
        }
    }
}
