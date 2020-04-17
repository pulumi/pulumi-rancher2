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
    public sealed class GetClusterRkeConfigCloudProviderAwsCloudProviderServiceOverrideResult
    {
        public readonly string Region;
        public readonly string Service;
        public readonly string SigningMethod;
        public readonly string SigningName;
        public readonly string SigningRegion;
        public readonly string Url;

        [OutputConstructor]
        private GetClusterRkeConfigCloudProviderAwsCloudProviderServiceOverrideResult(
            string region,

            string service,

            string signingMethod,

            string signingName,

            string signingRegion,

            string url)
        {
            Region = region;
            Service = service;
            SigningMethod = signingMethod;
            SigningName = signingName;
            SigningRegion = signingRegion;
            Url = url;
        }
    }
}