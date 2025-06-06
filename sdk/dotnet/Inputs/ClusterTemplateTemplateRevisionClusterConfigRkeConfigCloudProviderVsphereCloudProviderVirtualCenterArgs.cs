// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderVirtualCenterArgs : global::Pulumi.ResourceArgs
    {
        [Input("datacenters", required: true)]
        public Input<string> Datacenters { get; set; } = null!;

        /// <summary>
        /// The cluster template name (string)
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("password", required: true)]
        private Input<string>? _password;
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("port")]
        public Input<string>? Port { get; set; }

        [Input("soapRoundtripCount")]
        public Input<int>? SoapRoundtripCount { get; set; }

        [Input("user", required: true)]
        private Input<string>? _user;
        public Input<string>? User
        {
            get => _user;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _user = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderVirtualCenterArgs()
        {
        }
        public static new ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderVirtualCenterArgs Empty => new ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderVirtualCenterArgs();
    }
}
