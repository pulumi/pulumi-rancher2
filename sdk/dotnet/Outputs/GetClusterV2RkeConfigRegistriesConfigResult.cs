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
    public sealed class GetClusterV2RkeConfigRegistriesConfigResult
    {
        public readonly string? AuthConfigSecretName;
        public readonly string? CaBundle;
        public readonly string Hostname;
        public readonly bool? Insecure;
        public readonly string? TlsSecretName;

        [OutputConstructor]
        private GetClusterV2RkeConfigRegistriesConfigResult(
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