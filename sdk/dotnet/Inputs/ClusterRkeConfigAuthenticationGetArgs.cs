// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigAuthenticationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("sans")]
        private InputList<string>? _sans;

        /// <summary>
        /// RKE sans for authentication ([]string)
        /// </summary>
        public InputList<string> Sans
        {
            get => _sans ?? (_sans = new InputList<string>());
            set => _sans = value;
        }

        /// <summary>
        /// Monitoring deployment update strategy (string)
        /// </summary>
        [Input("strategy")]
        public Input<string>? Strategy { get; set; }

        public ClusterRkeConfigAuthenticationGetArgs()
        {
        }
        public static new ClusterRkeConfigAuthenticationGetArgs Empty => new ClusterRkeConfigAuthenticationGetArgs();
    }
}
