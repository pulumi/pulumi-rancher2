// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigBastionHostArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Address ip for node (string)
        /// </summary>
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        /// <summary>
        /// Port for node. Default `22` (string)
        /// </summary>
        [Input("port")]
        public Input<string>? Port { get; set; }

        /// <summary>
        /// Use ssh agent auth. Default `false` (bool)
        /// </summary>
        [Input("sshAgentAuth")]
        public Input<bool>? SshAgentAuth { get; set; }

        [Input("sshKey")]
        private Input<string>? _sshKey;

        /// <summary>
        /// Node SSH private key (string)
        /// </summary>
        public Input<string>? SshKey
        {
            get => _sshKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _sshKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Node SSH private key path (string)
        /// </summary>
        [Input("sshKeyPath")]
        public Input<string>? SshKeyPath { get; set; }

        /// <summary>
        /// Registry user (string)
        /// </summary>
        [Input("user", required: true)]
        public Input<string> User { get; set; } = null!;

        public ClusterRkeConfigBastionHostArgs()
        {
        }
        public static new ClusterRkeConfigBastionHostArgs Empty => new ClusterRkeConfigBastionHostArgs();
    }
}
