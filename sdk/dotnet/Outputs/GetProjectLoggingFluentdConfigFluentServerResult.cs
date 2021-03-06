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
    public sealed class GetProjectLoggingFluentdConfigFluentServerResult
    {
        public readonly string Endpoint;
        public readonly string? Hostname;
        public readonly string? Password;
        public readonly string? SharedKey;
        public readonly bool? Standby;
        public readonly string? Username;
        public readonly int? Weight;

        [OutputConstructor]
        private GetProjectLoggingFluentdConfigFluentServerResult(
            string endpoint,

            string? hostname,

            string? password,

            string? sharedKey,

            bool? standby,

            string? username,

            int? weight)
        {
            Endpoint = endpoint;
            Hostname = hostname;
            Password = password;
            SharedKey = sharedKey;
            Standby = standby;
            Username = username;
            Weight = weight;
        }
    }
}
