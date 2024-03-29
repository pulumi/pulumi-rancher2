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
    public sealed class ClusterV2RkeConfigMachineSelectorConfig
    {
        /// <summary>
        /// Config is the distribution-specify configuration to be applied to nodes that match the provided label selector. For more information, please refer to Rancher's documentation for [RKE2 Cluster Configuration](https://ranchermanager.docs.rancher.com/reference-guides/cluster-configuration/rancher-server-configuration/rke2-cluster-configuration#machineselectorconfig) or [K3s Cluster Configuration](https://ranchermanager.docs.rancher.com/reference-guides/cluster-configuration/rancher-server-configuration/k3s-cluster-configuration#machineselectorconfig)
        /// </summary>
        public readonly string? Config;
        /// <summary>
        /// Machine selector label is a label query over a set of resources. The result of match_labels and match_expressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
        /// </summary>
        public readonly Outputs.ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelector? MachineLabelSelector;

        [OutputConstructor]
        private ClusterV2RkeConfigMachineSelectorConfig(
            string? config,

            Outputs.ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelector? machineLabelSelector)
        {
            Config = config;
            MachineLabelSelector = machineLabelSelector;
        }
    }
}
