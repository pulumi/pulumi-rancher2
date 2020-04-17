// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Outputs
{

    [OutputType]
    public sealed class ClusterAksConfig
    {
        /// <summary>
        /// The secret of an Azure Active Directory server application (string)
        /// </summary>
        public readonly string? AadServerAppSecret;
        /// <summary>
        /// The ID of an Azure Active Directory tenant (string)
        /// </summary>
        public readonly string? AadTenantId;
        /// <summary>
        /// The ID of an Azure Active Directory client application of type \"Native\". This application is for user login via kubectl (string)
        /// </summary>
        public readonly string? AddClientAppId;
        /// <summary>
        /// The ID of an Azure Active Directory server application of type \"Web app/API\". This application represents the managed cluster's apiserver (Server application) (string)
        /// </summary>
        public readonly string? AddServerAppId;
        /// <summary>
        /// The administrator username to use for Linux hosts. Default `azureuser` (string)
        /// </summary>
        public readonly string? AdminUsername;
        /// <summary>
        /// DNS prefix to be used to create the FQDN for the agent pool (string)
        /// </summary>
        public readonly string AgentDnsPrefix;
        /// <summary>
        /// GB size to be used to specify the disk for every machine in the agent pool. If you specify 0, it will apply the default according to the \"agent vm size\" specified. Default `0` (int)
        /// </summary>
        public readonly int? AgentOsDiskSize;
        /// <summary>
        /// Name for the agent pool, upto 12 alphanumeric characters. Default `agentpool0` (string)
        /// </summary>
        public readonly string? AgentPoolName;
        /// <summary>
        /// Storage profile specifies what kind of storage used on machine in the agent pool. Chooses from [ManagedDisks StorageAccount]. Default `ManagedDisks` (string)
        /// </summary>
        public readonly string? AgentStorageProfile;
        /// <summary>
        /// Size of machine in the agent pool. Default `Standard_D1_v2` (string)
        /// </summary>
        public readonly string? AgentVmSize;
        /// <summary>
        /// Different authentication API url to use. Default `https://login.microsoftonline.com/` (string)
        /// </summary>
        public readonly string? AuthBaseUrl;
        /// <summary>
        /// Different resource management API url to use. Default `https://management.azure.com/` (string)
        /// </summary>
        public readonly string? BaseUrl;
        /// <summary>
        /// Azure client ID to use (string)
        /// </summary>
        public readonly string ClientId;
        /// <summary>
        /// Azure client secret associated with the \"client id\" (string)
        /// </summary>
        public readonly string ClientSecret;
        /// <summary>
        /// Number of machines (VMs) in the agent pool. Allowed values must be in the range of 1 to 100 (inclusive). Default `1` (int)
        /// </summary>
        public readonly int? Count;
        /// <summary>
        /// An IP address assigned to the Kubernetes DNS service. It must be within the Kubernetes Service address range specified in \"service cidr\". Default `10.0.0.10` (string)
        /// </summary>
        public readonly string? DnsServiceIp;
        /// <summary>
        /// A CIDR notation IP range assigned to the Docker bridge network. It must not overlap with any Subnet IP ranges or the Kubernetes Service address range specified in \"service cidr\". Default `172.17.0.1/16` (string)
        /// </summary>
        public readonly string? DockerBridgeCidr;
        /// <summary>
        /// Enable the Kubernetes ingress with automatic public DNS name creation. Default `false` (bool)
        /// </summary>
        public readonly bool? EnableHttpApplicationRouting;
        /// <summary>
        /// Turn on Azure Log Analytics monitoring. Uses the Log Analytics \"Default\" workspace if it exists, else creates one. if using an existing workspace, specifies \"log analytics workspace resource id\". Default `true` (bool)
        /// </summary>
        public readonly bool? EnableMonitoring;
        /// <summary>
        /// The Kubernetes master version (string)
        /// </summary>
        public readonly string KubernetesVersion;
        /// <summary>
        /// Azure Kubernetes cluster location. Default `eastus` (string)
        /// </summary>
        public readonly string? Location;
        /// <summary>
        /// The name of an existing Azure Log Analytics Workspace to use for storing monitoring data. If not specified, uses '{resource group}-{subscription id}-{location code}' (string)
        /// </summary>
        public readonly string? LogAnalyticsWorkspace;
        /// <summary>
        /// The resource group of an existing Azure Log Analytics Workspace to use for storing monitoring data. If not specified, uses the 'Cluster' resource group (string)
        /// </summary>
        public readonly string? LogAnalyticsWorkspaceResourceGroup;
        /// <summary>
        /// DNS prefix to use the Kubernetes cluster control pane (string)
        /// </summary>
        public readonly string MasterDnsPrefix;
        /// <summary>
        /// Maximum number of pods that can run on a node. Default `110` (int)
        /// </summary>
        public readonly int? MaxPods;
        /// <summary>
        /// Network plugin used for building Kubernetes network. Chooses from `azure` or `kubenet`. Default `azure` (string)
        /// </summary>
        public readonly string? NetworkPlugin;
        /// <summary>
        /// Network policy used for building Kubernetes network. Chooses from `calico` (string)
        /// </summary>
        public readonly string? NetworkPolicy;
        /// <summary>
        /// A CIDR notation IP range from which to assign Kubernetes Pod IPs when \"network plugin\" is specified in \"kubenet\". Default `172.244.0.0/16` (string)
        /// </summary>
        public readonly string? PodCidr;
        /// <summary>
        /// The name of the Cluster resource group (string)
        /// </summary>
        public readonly string ResourceGroup;
        /// <summary>
        /// A CIDR notation IP range from which to assign Kubernetes Service cluster IPs. It must not overlap with any Subnet IP ranges. Default `10.0.0.0/16` (string)
        /// </summary>
        public readonly string? ServiceCidr;
        /// <summary>
        /// Contents of the SSH public key used to authenticate with Linux hosts (string)
        /// </summary>
        public readonly string SshPublicKeyContents;
        /// <summary>
        /// The name of an existing Azure Virtual Subnet. Composite of agent virtual network subnet ID (string)
        /// </summary>
        public readonly string Subnet;
        /// <summary>
        /// Subscription credentials which uniquely identify Microsoft Azure subscription (string)
        /// </summary>
        public readonly string SubscriptionId;
        /// <summary>
        /// Tags for Kubernetes cluster. For example, foo=bar (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Tag;
        /// <summary>
        /// Azure tenant ID to use (string)
        /// </summary>
        public readonly string TenantId;
        /// <summary>
        /// The name of the virtual network to use. If it's not specified Rancher will create a new VPC (string)
        /// </summary>
        public readonly string VirtualNetwork;
        /// <summary>
        /// The resource group of an existing Azure Virtual Network. Composite of agent virtual network subnet ID (string)
        /// </summary>
        public readonly string VirtualNetworkResourceGroup;

        [OutputConstructor]
        private ClusterAksConfig(
            string? aadServerAppSecret,

            string? aadTenantId,

            string? addClientAppId,

            string? addServerAppId,

            string? adminUsername,

            string agentDnsPrefix,

            int? agentOsDiskSize,

            string? agentPoolName,

            string? agentStorageProfile,

            string? agentVmSize,

            string? authBaseUrl,

            string? baseUrl,

            string clientId,

            string clientSecret,

            int? count,

            string? dnsServiceIp,

            string? dockerBridgeCidr,

            bool? enableHttpApplicationRouting,

            bool? enableMonitoring,

            string kubernetesVersion,

            string? location,

            string? logAnalyticsWorkspace,

            string? logAnalyticsWorkspaceResourceGroup,

            string masterDnsPrefix,

            int? maxPods,

            string? networkPlugin,

            string? networkPolicy,

            string? podCidr,

            string resourceGroup,

            string? serviceCidr,

            string sshPublicKeyContents,

            string subnet,

            string subscriptionId,

            ImmutableDictionary<string, object>? tag,

            string tenantId,

            string virtualNetwork,

            string virtualNetworkResourceGroup)
        {
            AadServerAppSecret = aadServerAppSecret;
            AadTenantId = aadTenantId;
            AddClientAppId = addClientAppId;
            AddServerAppId = addServerAppId;
            AdminUsername = adminUsername;
            AgentDnsPrefix = agentDnsPrefix;
            AgentOsDiskSize = agentOsDiskSize;
            AgentPoolName = agentPoolName;
            AgentStorageProfile = agentStorageProfile;
            AgentVmSize = agentVmSize;
            AuthBaseUrl = authBaseUrl;
            BaseUrl = baseUrl;
            ClientId = clientId;
            ClientSecret = clientSecret;
            Count = count;
            DnsServiceIp = dnsServiceIp;
            DockerBridgeCidr = dockerBridgeCidr;
            EnableHttpApplicationRouting = enableHttpApplicationRouting;
            EnableMonitoring = enableMonitoring;
            KubernetesVersion = kubernetesVersion;
            Location = location;
            LogAnalyticsWorkspace = logAnalyticsWorkspace;
            LogAnalyticsWorkspaceResourceGroup = logAnalyticsWorkspaceResourceGroup;
            MasterDnsPrefix = masterDnsPrefix;
            MaxPods = maxPods;
            NetworkPlugin = networkPlugin;
            NetworkPolicy = networkPolicy;
            PodCidr = podCidr;
            ResourceGroup = resourceGroup;
            ServiceCidr = serviceCidr;
            SshPublicKeyContents = sshPublicKeyContents;
            Subnet = subnet;
            SubscriptionId = subscriptionId;
            Tag = tag;
            TenantId = tenantId;
            VirtualNetwork = virtualNetwork;
            VirtualNetworkResourceGroup = virtualNetworkResourceGroup;
        }
    }
}