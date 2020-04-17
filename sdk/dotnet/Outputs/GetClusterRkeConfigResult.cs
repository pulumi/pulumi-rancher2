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
    public sealed class GetClusterRkeConfigResult
    {
        public readonly int AddonJobTimeout;
        public readonly string? Addons;
        public readonly ImmutableArray<string> AddonsIncludes;
        public readonly Outputs.GetClusterRkeConfigAuthenticationResult Authentication;
        public readonly Outputs.GetClusterRkeConfigAuthorizationResult Authorization;
        public readonly Outputs.GetClusterRkeConfigBastionHostResult BastionHost;
        public readonly Outputs.GetClusterRkeConfigCloudProviderResult CloudProvider;
        public readonly Outputs.GetClusterRkeConfigDnsResult Dns;
        public readonly bool? IgnoreDockerVersion;
        public readonly Outputs.GetClusterRkeConfigIngressResult Ingress;
        public readonly string KubernetesVersion;
        public readonly Outputs.GetClusterRkeConfigMonitoringResult Monitoring;
        public readonly Outputs.GetClusterRkeConfigNetworkResult Network;
        public readonly ImmutableArray<Outputs.GetClusterRkeConfigNodeResult> Nodes;
        public readonly string PrefixPath;
        public readonly ImmutableArray<Outputs.GetClusterRkeConfigPrivateRegistryResult> PrivateRegistries;
        public readonly Outputs.GetClusterRkeConfigServicesResult Services;
        public readonly bool? SshAgentAuth;
        public readonly string SshCertPath;
        public readonly string SshKeyPath;
        public readonly Outputs.GetClusterRkeConfigUpgradeStrategyResult UpgradeStrategy;

        [OutputConstructor]
        private GetClusterRkeConfigResult(
            int addonJobTimeout,

            string? addons,

            ImmutableArray<string> addonsIncludes,

            Outputs.GetClusterRkeConfigAuthenticationResult authentication,

            Outputs.GetClusterRkeConfigAuthorizationResult authorization,

            Outputs.GetClusterRkeConfigBastionHostResult bastionHost,

            Outputs.GetClusterRkeConfigCloudProviderResult cloudProvider,

            Outputs.GetClusterRkeConfigDnsResult dns,

            bool? ignoreDockerVersion,

            Outputs.GetClusterRkeConfigIngressResult ingress,

            string kubernetesVersion,

            Outputs.GetClusterRkeConfigMonitoringResult monitoring,

            Outputs.GetClusterRkeConfigNetworkResult network,

            ImmutableArray<Outputs.GetClusterRkeConfigNodeResult> nodes,

            string prefixPath,

            ImmutableArray<Outputs.GetClusterRkeConfigPrivateRegistryResult> privateRegistries,

            Outputs.GetClusterRkeConfigServicesResult services,

            bool? sshAgentAuth,

            string sshCertPath,

            string sshKeyPath,

            Outputs.GetClusterRkeConfigUpgradeStrategyResult upgradeStrategy)
        {
            AddonJobTimeout = addonJobTimeout;
            Addons = addons;
            AddonsIncludes = addonsIncludes;
            Authentication = authentication;
            Authorization = authorization;
            BastionHost = bastionHost;
            CloudProvider = cloudProvider;
            Dns = dns;
            IgnoreDockerVersion = ignoreDockerVersion;
            Ingress = ingress;
            KubernetesVersion = kubernetesVersion;
            Monitoring = monitoring;
            Network = network;
            Nodes = nodes;
            PrefixPath = prefixPath;
            PrivateRegistries = privateRegistries;
            Services = services;
            SshAgentAuth = sshAgentAuth;
            SshCertPath = sshCertPath;
            SshKeyPath = sshKeyPath;
            UpgradeStrategy = upgradeStrategy;
        }
    }
}