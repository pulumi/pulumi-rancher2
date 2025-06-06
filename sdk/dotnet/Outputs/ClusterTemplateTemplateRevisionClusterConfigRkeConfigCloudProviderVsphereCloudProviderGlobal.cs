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
    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderGlobal
    {
        public readonly string? Datacenters;
        public readonly string? GracefulShutdownTimeout;
        public readonly bool? InsecureFlag;
        public readonly string? Password;
        public readonly string? Port;
        public readonly int? SoapRoundtripCount;
        public readonly string? User;

        [OutputConstructor]
        private ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderGlobal(
            string? datacenters,

            string? gracefulShutdownTimeout,

            bool? insecureFlag,

            string? password,

            string? port,

            int? soapRoundtripCount,

            string? user)
        {
            Datacenters = datacenters;
            GracefulShutdownTimeout = gracefulShutdownTimeout;
            InsecureFlag = insecureFlag;
            Password = password;
            Port = port;
            SoapRoundtripCount = soapRoundtripCount;
            User = user;
        }
    }
}
