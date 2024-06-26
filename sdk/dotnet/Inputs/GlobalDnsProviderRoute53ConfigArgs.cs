// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class GlobalDnsProviderRoute53ConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessKey", required: true)]
        public Input<string> AccessKey { get; set; } = null!;

        [Input("credentialsPath")]
        public Input<string>? CredentialsPath { get; set; }

        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("roleArn")]
        public Input<string>? RoleArn { get; set; }

        [Input("secretKey", required: true)]
        public Input<string> SecretKey { get; set; } = null!;

        [Input("zoneType")]
        public Input<string>? ZoneType { get; set; }

        public GlobalDnsProviderRoute53ConfigArgs()
        {
        }
        public static new GlobalDnsProviderRoute53ConfigArgs Empty => new GlobalDnsProviderRoute53ConfigArgs();
    }
}
