// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional duration in seconds of addon job.
        /// </summary>
        [Input("addonJobTimeout")]
        public Input<int>? AddonJobTimeout { get; set; }

        /// <summary>
        /// Optional addons descripton to deploy on rke cluster.
        /// </summary>
        [Input("addons")]
        public Input<string>? Addons { get; set; }

        [Input("addonsIncludes")]
        private InputList<string>? _addonsIncludes;

        /// <summary>
        /// Optional addons yaml manisfest to deploy on rke cluster.
        /// </summary>
        public InputList<string> AddonsIncludes
        {
            get => _addonsIncludes ?? (_addonsIncludes = new InputList<string>());
            set => _addonsIncludes = value;
        }

        /// <summary>
        /// Kubernetes cluster authentication
        /// </summary>
        [Input("authentication")]
        public Input<Inputs.ClusterRkeConfigAuthenticationGetArgs>? Authentication { get; set; }

        /// <summary>
        /// Kubernetes cluster authorization
        /// </summary>
        [Input("authorization")]
        public Input<Inputs.ClusterRkeConfigAuthorizationGetArgs>? Authorization { get; set; }

        /// <summary>
        /// RKE bastion host
        /// </summary>
        [Input("bastionHost")]
        public Input<Inputs.ClusterRkeConfigBastionHostGetArgs>? BastionHost { get; set; }

        /// <summary>
        /// RKE options for Calico network provider (string)
        /// </summary>
        [Input("cloudProvider")]
        public Input<Inputs.ClusterRkeConfigCloudProviderGetArgs>? CloudProvider { get; set; }

        /// <summary>
        /// RKE dns add-on. For Rancher v2.2.x (list maxitems:1)
        /// </summary>
        [Input("dns")]
        public Input<Inputs.ClusterRkeConfigDnsGetArgs>? Dns { get; set; }

        /// <summary>
        /// Enable/disable using cri-dockerd
        /// </summary>
        [Input("enableCriDockerd")]
        public Input<bool>? EnableCriDockerd { get; set; }

        /// <summary>
        /// Optional ignore docker version on nodes
        /// </summary>
        [Input("ignoreDockerVersion")]
        public Input<bool>? IgnoreDockerVersion { get; set; }

        /// <summary>
        /// Kubernetes ingress configuration
        /// </summary>
        [Input("ingress")]
        public Input<Inputs.ClusterRkeConfigIngressGetArgs>? Ingress { get; set; }

        /// <summary>
        /// Optional kubernetes version to deploy
        /// </summary>
        [Input("kubernetesVersion")]
        public Input<string>? KubernetesVersion { get; set; }

        /// <summary>
        /// Kubernetes cluster monitoring
        /// </summary>
        [Input("monitoring")]
        public Input<Inputs.ClusterRkeConfigMonitoringGetArgs>? Monitoring { get; set; }

        /// <summary>
        /// Kubernetes cluster networking
        /// </summary>
        [Input("network")]
        public Input<Inputs.ClusterRkeConfigNetworkGetArgs>? Network { get; set; }

        [Input("nodes")]
        private InputList<Inputs.ClusterRkeConfigNodeGetArgs>? _nodes;

        /// <summary>
        /// Optional RKE cluster nodes
        /// </summary>
        public InputList<Inputs.ClusterRkeConfigNodeGetArgs> Nodes
        {
            get => _nodes ?? (_nodes = new InputList<Inputs.ClusterRkeConfigNodeGetArgs>());
            set => _nodes = value;
        }

        /// <summary>
        /// Optional prefix to customize kubernetes path
        /// </summary>
        [Input("prefixPath")]
        public Input<string>? PrefixPath { get; set; }

        [Input("privateRegistries")]
        private InputList<Inputs.ClusterRkeConfigPrivateRegistryGetArgs>? _privateRegistries;

        /// <summary>
        /// Optional private registries for docker images
        /// </summary>
        public InputList<Inputs.ClusterRkeConfigPrivateRegistryGetArgs> PrivateRegistries
        {
            get => _privateRegistries ?? (_privateRegistries = new InputList<Inputs.ClusterRkeConfigPrivateRegistryGetArgs>());
            set => _privateRegistries = value;
        }

        /// <summary>
        /// Kubernetes cluster services
        /// </summary>
        [Input("services")]
        public Input<Inputs.ClusterRkeConfigServicesGetArgs>? Services { get; set; }

        /// <summary>
        /// Optional use ssh agent auth
        /// </summary>
        [Input("sshAgentAuth")]
        public Input<bool>? SshAgentAuth { get; set; }

        /// <summary>
        /// Optional cluster level SSH certificate path
        /// </summary>
        [Input("sshCertPath")]
        public Input<string>? SshCertPath { get; set; }

        /// <summary>
        /// Optional cluster level SSH private key path
        /// </summary>
        [Input("sshKeyPath")]
        public Input<string>? SshKeyPath { get; set; }

        /// <summary>
        /// RKE upgrade strategy
        /// </summary>
        [Input("upgradeStrategy")]
        public Input<Inputs.ClusterRkeConfigUpgradeStrategyGetArgs>? UpgradeStrategy { get; set; }

        /// <summary>
        /// Optional prefix to customize kubernetes path for windows
        /// </summary>
        [Input("winPrefixPath")]
        public Input<string>? WinPrefixPath { get; set; }

        public ClusterRkeConfigGetArgs()
        {
        }
        public static new ClusterRkeConfigGetArgs Empty => new ClusterRkeConfigGetArgs();
    }
}
