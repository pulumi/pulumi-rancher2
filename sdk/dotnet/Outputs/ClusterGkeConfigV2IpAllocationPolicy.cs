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
    public sealed class ClusterGkeConfigV2IpAllocationPolicy
    {
        /// <summary>
        /// The GKE cluster ip v4 allocation cidr block (string)
        /// </summary>
        public readonly string? ClusterIpv4CidrBlock;
        /// <summary>
        /// The GKE cluster ip v4 allocation secondary range name(string)
        /// </summary>
        public readonly string? ClusterSecondaryRangeName;
        /// <summary>
        /// Create GKE subnetwork? Default: `false` (bool)
        /// </summary>
        public readonly bool? CreateSubnetwork;
        /// <summary>
        /// The GKE node ip v4 allocation cidr block (string)
        /// </summary>
        public readonly string? NodeIpv4CidrBlock;
        /// <summary>
        /// The GKE services ip v4 allocation cidr block (string)
        /// </summary>
        public readonly string? ServicesIpv4CidrBlock;
        /// <summary>
        /// The GKE services ip v4 allocation secondary range name (string)
        /// </summary>
        public readonly string? ServicesSecondaryRangeName;
        /// <summary>
        /// The GKE cluster subnetwork name (string)
        /// </summary>
        public readonly string? SubnetworkName;
        /// <summary>
        /// Use GKE ip aliases? Default: `true` (bool)
        /// </summary>
        public readonly bool? UseIpAliases;

        [OutputConstructor]
        private ClusterGkeConfigV2IpAllocationPolicy(
            string? clusterIpv4CidrBlock,

            string? clusterSecondaryRangeName,

            bool? createSubnetwork,

            string? nodeIpv4CidrBlock,

            string? servicesIpv4CidrBlock,

            string? servicesSecondaryRangeName,

            string? subnetworkName,

            bool? useIpAliases)
        {
            ClusterIpv4CidrBlock = clusterIpv4CidrBlock;
            ClusterSecondaryRangeName = clusterSecondaryRangeName;
            CreateSubnetwork = createSubnetwork;
            NodeIpv4CidrBlock = nodeIpv4CidrBlock;
            ServicesIpv4CidrBlock = servicesIpv4CidrBlock;
            ServicesSecondaryRangeName = servicesSecondaryRangeName;
            SubnetworkName = subnetworkName;
            UseIpAliases = useIpAliases;
        }
    }
}