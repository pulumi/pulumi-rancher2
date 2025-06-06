// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigDnsNodelocalArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Nodelocal dns ip address (string)
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        [Input("nodeSelector")]
        private InputMap<string>? _nodeSelector;

        /// <summary>
        /// Node selector key pair
        /// </summary>
        public InputMap<string> NodeSelector
        {
            get => _nodeSelector ?? (_nodeSelector = new InputMap<string>());
            set => _nodeSelector = value;
        }

        public ClusterRkeConfigDnsNodelocalArgs()
        {
        }
        public static new ClusterRkeConfigDnsNodelocalArgs Empty => new ClusterRkeConfigDnsNodelocalArgs();
    }
}
