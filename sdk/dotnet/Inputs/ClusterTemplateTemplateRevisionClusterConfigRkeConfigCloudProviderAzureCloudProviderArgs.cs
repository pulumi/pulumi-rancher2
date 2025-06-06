// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAzureCloudProviderArgs : global::Pulumi.ResourceArgs
    {
        [Input("aadClientCertPassword")]
        private Input<string>? _aadClientCertPassword;
        public Input<string>? AadClientCertPassword
        {
            get => _aadClientCertPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _aadClientCertPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("aadClientCertPath")]
        public Input<string>? AadClientCertPath { get; set; }

        [Input("aadClientId", required: true)]
        private Input<string>? _aadClientId;
        public Input<string>? AadClientId
        {
            get => _aadClientId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _aadClientId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("aadClientSecret", required: true)]
        private Input<string>? _aadClientSecret;
        public Input<string>? AadClientSecret
        {
            get => _aadClientSecret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _aadClientSecret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("cloud")]
        public Input<string>? Cloud { get; set; }

        [Input("cloudProviderBackoff")]
        public Input<bool>? CloudProviderBackoff { get; set; }

        [Input("cloudProviderBackoffDuration")]
        public Input<int>? CloudProviderBackoffDuration { get; set; }

        [Input("cloudProviderBackoffExponent")]
        public Input<int>? CloudProviderBackoffExponent { get; set; }

        [Input("cloudProviderBackoffJitter")]
        public Input<int>? CloudProviderBackoffJitter { get; set; }

        [Input("cloudProviderBackoffRetries")]
        public Input<int>? CloudProviderBackoffRetries { get; set; }

        [Input("cloudProviderRateLimit")]
        public Input<bool>? CloudProviderRateLimit { get; set; }

        [Input("cloudProviderRateLimitBucket")]
        public Input<int>? CloudProviderRateLimitBucket { get; set; }

        [Input("cloudProviderRateLimitQps")]
        public Input<int>? CloudProviderRateLimitQps { get; set; }

        /// <summary>
        /// Load balancer type (basic | standard). Must be standard for auto-scaling
        /// </summary>
        [Input("loadBalancerSku")]
        public Input<string>? LoadBalancerSku { get; set; }

        [Input("location")]
        public Input<string>? Location { get; set; }

        [Input("maximumLoadBalancerRuleCount")]
        public Input<int>? MaximumLoadBalancerRuleCount { get; set; }

        [Input("primaryAvailabilitySetName")]
        public Input<string>? PrimaryAvailabilitySetName { get; set; }

        [Input("primaryScaleSetName")]
        public Input<string>? PrimaryScaleSetName { get; set; }

        [Input("resourceGroup")]
        public Input<string>? ResourceGroup { get; set; }

        [Input("routeTableName")]
        public Input<string>? RouteTableName { get; set; }

        [Input("securityGroupName")]
        public Input<string>? SecurityGroupName { get; set; }

        [Input("subnetName")]
        public Input<string>? SubnetName { get; set; }

        [Input("subscriptionId", required: true)]
        private Input<string>? _subscriptionId;
        public Input<string>? SubscriptionId
        {
            get => _subscriptionId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _subscriptionId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("tenantId", required: true)]
        private Input<string>? _tenantId;
        public Input<string>? TenantId
        {
            get => _tenantId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _tenantId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("useInstanceMetadata")]
        public Input<bool>? UseInstanceMetadata { get; set; }

        [Input("useManagedIdentityExtension")]
        public Input<bool>? UseManagedIdentityExtension { get; set; }

        [Input("vmType")]
        public Input<string>? VmType { get; set; }

        [Input("vnetName")]
        public Input<string>? VnetName { get; set; }

        [Input("vnetResourceGroup")]
        public Input<string>? VnetResourceGroup { get; set; }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAzureCloudProviderArgs()
        {
        }
        public static new ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAzureCloudProviderArgs Empty => new ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAzureCloudProviderArgs();
    }
}
