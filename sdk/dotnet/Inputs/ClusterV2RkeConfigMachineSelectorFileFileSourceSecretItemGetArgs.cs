// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterV2RkeConfigMachineSelectorFileFileSourceSecretItemGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If ture, the file is ignored when determining whether the node should be drained before updating the node plan (default: true).
        /// </summary>
        [Input("dynamic")]
        public Input<bool>? Dynamic { get; set; }

        /// <summary>
        /// The base64 encoded value of the SHA256 checksum of the file's content
        /// </summary>
        [Input("hash")]
        public Input<string>? Hash { get; set; }

        /// <summary>
        /// The key of the item(file) to retrieve
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// The path to put the file in the target node
        /// </summary>
        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        /// <summary>
        /// The numeric representation of the file permissions
        /// </summary>
        [Input("permissions")]
        public Input<string>? Permissions { get; set; }

        public ClusterV2RkeConfigMachineSelectorFileFileSourceSecretItemGetArgs()
        {
        }
        public static new ClusterV2RkeConfigMachineSelectorFileFileSourceSecretItemGetArgs Empty => new ClusterV2RkeConfigMachineSelectorFileFileSourceSecretItemGetArgs();
    }
}
