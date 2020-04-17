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
    public sealed class ClusterRkeConfigCloudProviderOpenstackCloudProviderLoadBalancer
    {
        /// <summary>
        /// (bool)
        /// </summary>
        public readonly bool? CreateMonitor;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string? FloatingNetworkId;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string? LbMethod;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string? LbProvider;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string? LbVersion;
        /// <summary>
        /// (bool)
        /// </summary>
        public readonly bool? ManageSecurityGroups;
        /// <summary>
        /// Default `60s` (string)
        /// </summary>
        public readonly string? MonitorDelay;
        /// <summary>
        /// Default 5 (int)
        /// </summary>
        public readonly int? MonitorMaxRetries;
        /// <summary>
        /// Default `30s` (string)
        /// </summary>
        public readonly string? MonitorTimeout;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string? SubnetId;
        /// <summary>
        /// (bool)
        /// </summary>
        public readonly bool? UseOctavia;

        [OutputConstructor]
        private ClusterRkeConfigCloudProviderOpenstackCloudProviderLoadBalancer(
            bool? createMonitor,

            string? floatingNetworkId,

            string? lbMethod,

            string? lbProvider,

            string? lbVersion,

            bool? manageSecurityGroups,

            string? monitorDelay,

            int? monitorMaxRetries,

            string? monitorTimeout,

            string? subnetId,

            bool? useOctavia)
        {
            CreateMonitor = createMonitor;
            FloatingNetworkId = floatingNetworkId;
            LbMethod = lbMethod;
            LbProvider = lbProvider;
            LbVersion = lbVersion;
            ManageSecurityGroups = manageSecurityGroups;
            MonitorDelay = monitorDelay;
            MonitorMaxRetries = monitorMaxRetries;
            MonitorTimeout = monitorTimeout;
            SubnetId = subnetId;
            UseOctavia = useOctavia;
        }
    }
}