// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterAksConfigV2Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The AKS auth base url
        /// </summary>
        [Input("authBaseUrl")]
        public Input<string>? AuthBaseUrl { get; set; }

        [Input("authorizedIpRanges")]
        private InputList<string>? _authorizedIpRanges;

        /// <summary>
        /// The AKS authorized ip ranges
        /// </summary>
        public InputList<string> AuthorizedIpRanges
        {
            get => _authorizedIpRanges ?? (_authorizedIpRanges = new InputList<string>());
            set => _authorizedIpRanges = value;
        }

        /// <summary>
        /// The AKS base url
        /// </summary>
        [Input("baseUrl")]
        public Input<string>? BaseUrl { get; set; }

        /// <summary>
        /// The AKS Cloud Credential ID to use
        /// </summary>
        [Input("cloudCredentialId", required: true)]
        public Input<string> CloudCredentialId { get; set; } = null!;

        /// <summary>
        /// The AKS dns prefix. Required if `import=false`
        /// </summary>
        [Input("dnsPrefix")]
        public Input<string>? DnsPrefix { get; set; }

        /// <summary>
        /// Enable AKS http application routing?
        /// </summary>
        [Input("httpApplicationRouting")]
        public Input<bool>? HttpApplicationRouting { get; set; }

        /// <summary>
        /// Is AKS cluster imported?
        /// </summary>
        [Input("imported")]
        public Input<bool>? Imported { get; set; }

        /// <summary>
        /// The kubernetes master version. Required if `import=false`
        /// </summary>
        [Input("kubernetesVersion")]
        public Input<string>? KubernetesVersion { get; set; }

        /// <summary>
        /// The AKS linux admin username
        /// </summary>
        [Input("linuxAdminUsername")]
        public Input<string>? LinuxAdminUsername { get; set; }

        /// <summary>
        /// The AKS linux ssh public key
        /// </summary>
        [Input("linuxSshPublicKey")]
        public Input<string>? LinuxSshPublicKey { get; set; }

        /// <summary>
        /// The AKS load balancer sku
        /// </summary>
        [Input("loadBalancerSku")]
        public Input<string>? LoadBalancerSku { get; set; }

        /// <summary>
        /// The AKS log analytics workspace group
        /// </summary>
        [Input("logAnalyticsWorkspaceGroup")]
        public Input<string>? LogAnalyticsWorkspaceGroup { get; set; }

        /// <summary>
        /// The AKS log analytics workspace name
        /// </summary>
        [Input("logAnalyticsWorkspaceName")]
        public Input<string>? LogAnalyticsWorkspaceName { get; set; }

        /// <summary>
        /// Is AKS cluster monitoring enabled?
        /// </summary>
        [Input("monitoring")]
        public Input<bool>? Monitoring { get; set; }

        /// <summary>
        /// The name of the Cluster (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The AKS network dns service ip
        /// </summary>
        [Input("networkDnsServiceIp")]
        public Input<string>? NetworkDnsServiceIp { get; set; }

        /// <summary>
        /// The AKS network docker bridge cidr
        /// </summary>
        [Input("networkDockerBridgeCidr")]
        public Input<string>? NetworkDockerBridgeCidr { get; set; }

        /// <summary>
        /// The AKS network plugin. Required if `import=false`
        /// </summary>
        [Input("networkPlugin")]
        public Input<string>? NetworkPlugin { get; set; }

        /// <summary>
        /// The AKS network pod cidr
        /// </summary>
        [Input("networkPodCidr")]
        public Input<string>? NetworkPodCidr { get; set; }

        /// <summary>
        /// The AKS network policy
        /// </summary>
        [Input("networkPolicy")]
        public Input<string>? NetworkPolicy { get; set; }

        /// <summary>
        /// The AKS network service cidr
        /// </summary>
        [Input("networkServiceCidr")]
        public Input<string>? NetworkServiceCidr { get; set; }

        [Input("nodePools")]
        private InputList<Inputs.ClusterAksConfigV2NodePoolArgs>? _nodePools;

        /// <summary>
        /// The AKS node pools to use. Required if `import=false`
        /// </summary>
        public InputList<Inputs.ClusterAksConfigV2NodePoolArgs> NodePools
        {
            get => _nodePools ?? (_nodePools = new InputList<Inputs.ClusterAksConfigV2NodePoolArgs>());
            set => _nodePools = value;
        }

        /// <summary>
        /// The AKS node resource group name
        /// </summary>
        [Input("nodeResourceGroup")]
        public Input<string>? NodeResourceGroup { get; set; }

        /// <summary>
        /// The AKS outbound type for the egress traffic
        /// </summary>
        [Input("outboundType")]
        public Input<string>? OutboundType { get; set; }

        /// <summary>
        /// Is AKS cluster private?
        /// </summary>
        [Input("privateCluster")]
        public Input<bool>? PrivateCluster { get; set; }

        /// <summary>
        /// The AKS resource group
        /// </summary>
        [Input("resourceGroup", required: true)]
        public Input<string> ResourceGroup { get; set; } = null!;

        /// <summary>
        /// The AKS resource location
        /// </summary>
        [Input("resourceLocation", required: true)]
        public Input<string> ResourceLocation { get; set; } = null!;

        /// <summary>
        /// The AKS subnet
        /// </summary>
        [Input("subnet")]
        public Input<string>? Subnet { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// The AKS cluster tags
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The AKS virtual network
        /// </summary>
        [Input("virtualNetwork")]
        public Input<string>? VirtualNetwork { get; set; }

        /// <summary>
        /// The AKS virtual network resource group
        /// </summary>
        [Input("virtualNetworkResourceGroup")]
        public Input<string>? VirtualNetworkResourceGroup { get; set; }

        public ClusterAksConfigV2Args()
        {
        }
        public static new ClusterAksConfigV2Args Empty => new ClusterAksConfigV2Args();
    }
}
