// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigCloudProviderOpenstackCloudProviderRouteGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (string)
        /// </summary>
        [Input("routerId")]
        public Input<string>? RouterId { get; set; }

        public ClusterRkeConfigCloudProviderOpenstackCloudProviderRouteGetArgs()
        {
        }
        public static new ClusterRkeConfigCloudProviderOpenstackCloudProviderRouteGetArgs Empty => new ClusterRkeConfigCloudProviderOpenstackCloudProviderRouteGetArgs();
    }
}
