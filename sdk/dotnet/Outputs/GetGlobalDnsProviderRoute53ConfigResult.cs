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
    public sealed class GetGlobalDnsProviderRoute53ConfigResult
    {
        public readonly string AccessKey;
        public readonly string? CredentialsPath;
        public readonly string? Region;
        public readonly string? RoleArn;
        public readonly string SecretKey;
        public readonly string? ZoneType;

        [OutputConstructor]
        private GetGlobalDnsProviderRoute53ConfigResult(
            string accessKey,

            string? credentialsPath,

            string? region,

            string? roleArn,

            string secretKey,

            string? zoneType)
        {
            AccessKey = accessKey;
            CredentialsPath = credentialsPath;
            Region = region;
            RoleArn = roleArn;
            SecretKey = secretKey;
            ZoneType = zoneType;
        }
    }
}