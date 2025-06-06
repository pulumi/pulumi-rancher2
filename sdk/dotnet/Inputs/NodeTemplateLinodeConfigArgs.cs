// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class NodeTemplateLinodeConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Linode user accounts (seperated by commas) whose Linode SSH keys will be permitted root access to the created node
        /// </summary>
        [Input("authorizedUsers")]
        public Input<string>? AuthorizedUsers { get; set; }

        /// <summary>
        /// Create private IP for the instance
        /// </summary>
        [Input("createPrivateIp")]
        public Input<bool>? CreatePrivateIp { get; set; }

        /// <summary>
        /// Docker Port
        /// </summary>
        [Input("dockerPort")]
        public Input<string>? DockerPort { get; set; }

        /// <summary>
        /// Specifies the Linode Instance image which determines the OS distribution and base files
        /// </summary>
        [Input("image")]
        public Input<string>? Image { get; set; }

        /// <summary>
        /// Specifies the Linode Instance type which determines CPU, memory, disk size, etc.
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// Linode Instance Label
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// Specifies the region (location) of the Linode instance
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("rootPass")]
        private Input<string>? _rootPass;

        /// <summary>
        /// Root Password
        /// </summary>
        public Input<string>? RootPass
        {
            get => _rootPass;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _rootPass = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Linode Instance SSH Port
        /// </summary>
        [Input("sshPort")]
        public Input<string>? SshPort { get; set; }

        /// <summary>
        /// Specifies the user as which docker-machine should log in to the Linode instance to install Docker.
        /// </summary>
        [Input("sshUser")]
        public Input<string>? SshUser { get; set; }

        /// <summary>
        /// Specifies the Linode StackScript to use to create the instance
        /// </summary>
        [Input("stackscript")]
        public Input<string>? Stackscript { get; set; }

        /// <summary>
        /// A JSON string specifying data for the selected StackScript
        /// </summary>
        [Input("stackscriptData")]
        public Input<string>? StackscriptData { get; set; }

        /// <summary>
        /// Linode Instance Swap Size (MB)
        /// </summary>
        [Input("swapSize")]
        public Input<string>? SwapSize { get; set; }

        /// <summary>
        /// A comma separated list of tags to apply to the the Linode resource
        /// </summary>
        [Input("tags")]
        public Input<string>? Tags { get; set; }

        [Input("token")]
        private Input<string>? _token;

        /// <summary>
        /// Linode API Token
        /// </summary>
        public Input<string>? Token
        {
            get => _token;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _token = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Prefix the User-Agent in Linode API calls with some 'product/version'
        /// </summary>
        [Input("uaPrefix")]
        public Input<string>? UaPrefix { get; set; }

        public NodeTemplateLinodeConfigArgs()
        {
        }
        public static new NodeTemplateLinodeConfigArgs Empty => new NodeTemplateLinodeConfigArgs();
    }
}
