// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterAksConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("aadServerAppSecret")]
        private Input<string>? _aadServerAppSecret;

        /// <summary>
        /// The secret of an Azure Active Directory server application
        /// </summary>
        public Input<string>? AadServerAppSecret
        {
            get => _aadServerAppSecret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _aadServerAppSecret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("aadTenantId")]
        private Input<string>? _aadTenantId;

        /// <summary>
        /// The ID of an Azure Active Directory tenant
        /// </summary>
        public Input<string>? AadTenantId
        {
            get => _aadTenantId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _aadTenantId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("addClientAppId")]
        private Input<string>? _addClientAppId;

        /// <summary>
        /// The ID of an Azure Active Directory client application of type "Native". This application is for user login via kubectl
        /// </summary>
        public Input<string>? AddClientAppId
        {
            get => _addClientAppId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _addClientAppId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("addServerAppId")]
        private Input<string>? _addServerAppId;

        /// <summary>
        /// The ID of an Azure Active Directory server application of type "Web app/API". This application represents the managed cluster's apiserver (Server application)
        /// </summary>
        public Input<string>? AddServerAppId
        {
            get => _addServerAppId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _addServerAppId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The administrator username to use for Linux hosts
        /// </summary>
        [Input("adminUsername")]
        public Input<string>? AdminUsername { get; set; }

        /// <summary>
        /// DNS prefix to be used to create the FQDN for the agent pool
        /// </summary>
        [Input("agentDnsPrefix", required: true)]
        public Input<string> AgentDnsPrefix { get; set; } = null!;

        /// <summary>
        /// GB size to be used to specify the disk for every machine in the agent pool. If you specify 0, it will apply the default according to the "agent vm size" specified
        /// </summary>
        [Input("agentOsDiskSize")]
        public Input<int>? AgentOsDiskSize { get; set; }

        /// <summary>
        /// Name for the agent pool, upto 12 alphanumeric characters
        /// </summary>
        [Input("agentPoolName")]
        public Input<string>? AgentPoolName { get; set; }

        /// <summary>
        /// Storage profile specifies what kind of storage used on machine in the agent pool. Chooses from [ManagedDisks StorageAccount]
        /// </summary>
        [Input("agentStorageProfile")]
        public Input<string>? AgentStorageProfile { get; set; }

        /// <summary>
        /// Size of machine in the agent pool
        /// </summary>
        [Input("agentVmSize")]
        public Input<string>? AgentVmSize { get; set; }

        /// <summary>
        /// Different authentication API url to use
        /// </summary>
        [Input("authBaseUrl")]
        public Input<string>? AuthBaseUrl { get; set; }

        /// <summary>
        /// Different resource management API url to use
        /// </summary>
        [Input("baseUrl")]
        public Input<string>? BaseUrl { get; set; }

        [Input("clientId", required: true)]
        private Input<string>? _clientId;

        /// <summary>
        /// Azure client ID to use
        /// </summary>
        public Input<string>? ClientId
        {
            get => _clientId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _clientId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("clientSecret", required: true)]
        private Input<string>? _clientSecret;

        /// <summary>
        /// Azure client secret associated with the "client id"
        /// </summary>
        public Input<string>? ClientSecret
        {
            get => _clientSecret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _clientSecret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Number of machines (VMs) in the agent pool. Allowed values must be in the range of 1 to 100 (inclusive)
        /// </summary>
        [Input("count")]
        public Input<int>? Count { get; set; }

        /// <summary>
        /// An IP address assigned to the Kubernetes DNS service. It must be within the Kubernetes Service address range specified in "service cidr"
        /// </summary>
        [Input("dnsServiceIp")]
        public Input<string>? DnsServiceIp { get; set; }

        /// <summary>
        /// A CIDR notation IP range assigned to the Docker bridge network. It must not overlap with any Subnet IP ranges or the Kubernetes Service address range specified in "service cidr"
        /// </summary>
        [Input("dockerBridgeCidr")]
        public Input<string>? DockerBridgeCidr { get; set; }

        /// <summary>
        /// Enable the Kubernetes ingress with automatic public DNS name creation
        /// </summary>
        [Input("enableHttpApplicationRouting")]
        public Input<bool>? EnableHttpApplicationRouting { get; set; }

        /// <summary>
        /// Turn on Azure Log Analytics monitoring. Uses the Log Analytics "Default" workspace if it exists, else creates one. if using an existing workspace, specifies "log analytics workspace resource id"
        /// </summary>
        [Input("enableMonitoring")]
        public Input<bool>? EnableMonitoring { get; set; }

        /// <summary>
        /// Specify the version of Kubernetes
        /// </summary>
        [Input("kubernetesVersion", required: true)]
        public Input<string> KubernetesVersion { get; set; } = null!;

        /// <summary>
        /// Load balancer type (basic | standard). Must be standard for auto-scaling
        /// </summary>
        [Input("loadBalancerSku")]
        public Input<string>? LoadBalancerSku { get; set; }

        /// <summary>
        /// Azure Kubernetes cluster location
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name of an existing Azure Log Analytics Workspace to use for storing monitoring data. If not specified, uses '{resource group}-{subscription id}-{location code}'
        /// </summary>
        [Input("logAnalyticsWorkspace")]
        public Input<string>? LogAnalyticsWorkspace { get; set; }

        /// <summary>
        /// The resource group of an existing Azure Log Analytics Workspace to use for storing monitoring data. If not specified, uses the 'Cluster' resource group
        /// </summary>
        [Input("logAnalyticsWorkspaceResourceGroup")]
        public Input<string>? LogAnalyticsWorkspaceResourceGroup { get; set; }

        /// <summary>
        /// DNS prefix to use the Kubernetes cluster control pane
        /// </summary>
        [Input("masterDnsPrefix", required: true)]
        public Input<string> MasterDnsPrefix { get; set; } = null!;

        /// <summary>
        /// Maximum number of pods that can run on a node
        /// </summary>
        [Input("maxPods")]
        public Input<int>? MaxPods { get; set; }

        /// <summary>
        /// Network plugin used for building Kubernetes network. Chooses from [azure kubenet]
        /// </summary>
        [Input("networkPlugin")]
        public Input<string>? NetworkPlugin { get; set; }

        /// <summary>
        /// Network policy used for building Kubernetes network. Chooses from [calico]
        /// </summary>
        [Input("networkPolicy")]
        public Input<string>? NetworkPolicy { get; set; }

        /// <summary>
        /// A CIDR notation IP range from which to assign Kubernetes Pod IPs when "network plugin" is specified in "kubenet".
        /// </summary>
        [Input("podCidr")]
        public Input<string>? PodCidr { get; set; }

        /// <summary>
        /// The name of the Cluster resource group
        /// </summary>
        [Input("resourceGroup", required: true)]
        public Input<string> ResourceGroup { get; set; } = null!;

        /// <summary>
        /// A CIDR notation IP range from which to assign Kubernetes Service cluster IPs. It must not overlap with any Subnet IP ranges
        /// </summary>
        [Input("serviceCidr")]
        public Input<string>? ServiceCidr { get; set; }

        /// <summary>
        /// Contents of the SSH public key used to authenticate with Linux hosts
        /// </summary>
        [Input("sshPublicKeyContents", required: true)]
        public Input<string> SshPublicKeyContents { get; set; } = null!;

        /// <summary>
        /// The name of an existing Azure Virtual Subnet. Composite of agent virtual network subnet ID
        /// </summary>
        [Input("subnet", required: true)]
        public Input<string> Subnet { get; set; } = null!;

        /// <summary>
        /// Subscription credentials which uniquely identify Microsoft Azure subscription
        /// </summary>
        [Input("subscriptionId", required: true)]
        public Input<string> SubscriptionId { get; set; } = null!;

        [Input("tag")]
        private InputMap<string>? _tag;

        /// <summary>
        /// Tags for Kubernetes cluster. For example, foo=bar
        /// </summary>
        [Obsolete(@"Use tags argument instead as []string")]
        public InputMap<string> Tag
        {
            get => _tag ?? (_tag = new InputMap<string>());
            set => _tag = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags for Kubernetes cluster. For example, `["foo=bar","bar=foo"]`
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Azure tenant ID to use
        /// </summary>
        [Input("tenantId", required: true)]
        public Input<string> TenantId { get; set; } = null!;

        /// <summary>
        /// The name of an existing Azure Virtual Network. Composite of agent virtual network subnet ID
        /// </summary>
        [Input("virtualNetwork", required: true)]
        public Input<string> VirtualNetwork { get; set; } = null!;

        /// <summary>
        /// The resource group of an existing Azure Virtual Network. Composite of agent virtual network subnet ID
        /// </summary>
        [Input("virtualNetworkResourceGroup", required: true)]
        public Input<string> VirtualNetworkResourceGroup { get; set; } = null!;

        public ClusterAksConfigGetArgs()
        {
        }
        public static new ClusterAksConfigGetArgs Empty => new ClusterAksConfigGetArgs();
    }
}
