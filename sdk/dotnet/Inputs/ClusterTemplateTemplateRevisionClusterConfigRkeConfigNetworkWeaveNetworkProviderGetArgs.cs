// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkWeaveNetworkProviderGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("password", required: true)]
        public Input<string> Password { get; set; } = null!;

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkWeaveNetworkProviderGetArgs()
        {
        }
        public static new ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkWeaveNetworkProviderGetArgs Empty => new ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkWeaveNetworkProviderGetArgs();
    }
}
