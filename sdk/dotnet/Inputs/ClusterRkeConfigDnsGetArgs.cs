// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigDnsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Linear Autoscaler Params
        /// </summary>
        [Input("linearAutoscalerParams")]
        public Input<Inputs.ClusterRkeConfigDnsLinearAutoscalerParamsGetArgs>? LinearAutoscalerParams { get; set; }

        [Input("nodeSelector")]
        private InputMap<string>? _nodeSelector;

        /// <summary>
        /// RKE monitoring node selector (map)
        /// </summary>
        public InputMap<string> NodeSelector
        {
            get => _nodeSelector ?? (_nodeSelector = new InputMap<string>());
            set => _nodeSelector = value;
        }

        /// <summary>
        /// Nodelocal dns
        /// </summary>
        [Input("nodelocal")]
        public Input<Inputs.ClusterRkeConfigDnsNodelocalGetArgs>? Nodelocal { get; set; }

        [Input("options")]
        private InputMap<string>? _options;

        /// <summary>
        /// RKE options for network (map)
        /// </summary>
        public InputMap<string> Options
        {
            get => _options ?? (_options = new InputMap<string>());
            set => _options = value;
        }

        /// <summary>
        /// RKE monitoring provider (string)
        /// </summary>
        [Input("provider")]
        public Input<string>? Provider { get; set; }

        [Input("reverseCidrs")]
        private InputList<string>? _reverseCidrs;

        /// <summary>
        /// DNS add-on reverse cidr  (list)
        /// </summary>
        public InputList<string> ReverseCidrs
        {
            get => _reverseCidrs ?? (_reverseCidrs = new InputList<string>());
            set => _reverseCidrs = value;
        }

        [Input("tolerations")]
        private InputList<Inputs.ClusterRkeConfigDnsTolerationGetArgs>? _tolerations;

        /// <summary>
        /// DNS service tolerations
        /// </summary>
        public InputList<Inputs.ClusterRkeConfigDnsTolerationGetArgs> Tolerations
        {
            get => _tolerations ?? (_tolerations = new InputList<Inputs.ClusterRkeConfigDnsTolerationGetArgs>());
            set => _tolerations = value;
        }

        /// <summary>
        /// Update deployment strategy
        /// </summary>
        [Input("updateStrategy")]
        public Input<Inputs.ClusterRkeConfigDnsUpdateStrategyGetArgs>? UpdateStrategy { get; set; }

        [Input("upstreamNameservers")]
        private InputList<string>? _upstreamNameservers;

        /// <summary>
        /// DNS add-on upstream nameservers  (list)
        /// </summary>
        public InputList<string> UpstreamNameservers
        {
            get => _upstreamNameservers ?? (_upstreamNameservers = new InputList<string>());
            set => _upstreamNameservers = value;
        }

        public ClusterRkeConfigDnsGetArgs()
        {
        }
        public static new ClusterRkeConfigDnsGetArgs Empty => new ClusterRkeConfigDnsGetArgs();
    }
}
