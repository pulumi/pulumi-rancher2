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
    public sealed class GetProjectLoggingSplunkConfigResult
    {
        public readonly string? Certificate;
        public readonly string? ClientCert;
        public readonly string? ClientKey;
        public readonly string? ClientKeyPass;
        public readonly string Endpoint;
        public readonly string? Index;
        public readonly string? Source;
        public readonly bool SslVerify;
        public readonly string Token;

        [OutputConstructor]
        private GetProjectLoggingSplunkConfigResult(
            string? certificate,

            string? clientCert,

            string? clientKey,

            string? clientKeyPass,

            string endpoint,

            string? index,

            string? source,

            bool sslVerify,

            string token)
        {
            Certificate = certificate;
            ClientCert = clientCert;
            ClientKey = clientKey;
            ClientKeyPass = clientKeyPass;
            Endpoint = endpoint;
            Index = index;
            Source = source;
            SslVerify = sslVerify;
            Token = token;
        }
    }
}
