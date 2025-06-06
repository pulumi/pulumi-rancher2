// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterV2RkeConfigMachinePoolGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Annotations for the Cluster.
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// Cloud credential secret name is the secret to be used when a cloud credential secret name is not specified at the machine pool level.
        /// </summary>
        [Input("cloudCredentialSecretName")]
        public Input<string>? CloudCredentialSecretName { get; set; }

        /// <summary>
        /// Machine pool control plane role
        /// </summary>
        [Input("controlPlaneRole")]
        public Input<bool>? ControlPlaneRole { get; set; }

        /// <summary>
        /// Machine pool drain before delete
        /// </summary>
        [Input("drainBeforeDelete")]
        public Input<bool>? DrainBeforeDelete { get; set; }

        /// <summary>
        /// Machine pool etcd role
        /// </summary>
        [Input("etcdRole")]
        public Input<bool>? EtcdRole { get; set; }

        /// <summary>
        /// maximum length for autogenerated hostname
        /// </summary>
        [Input("hostnameLengthLimit")]
        public Input<int>? HostnameLengthLimit { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels for the Cluster.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Machine config data
        /// </summary>
        [Input("machineConfig", required: true)]
        public Input<Inputs.ClusterV2RkeConfigMachinePoolMachineConfigGetArgs> MachineConfig { get; set; } = null!;

        [Input("machineLabels")]
        private InputMap<string>? _machineLabels;

        /// <summary>
        /// Labels of the machine
        /// </summary>
        public InputMap<string> MachineLabels
        {
            get => _machineLabels ?? (_machineLabels = new InputMap<string>());
            set => _machineLabels = value;
        }

        /// <summary>
        /// max unhealthy nodes for automated replacement to be allowed
        /// </summary>
        [Input("maxUnhealthy")]
        public Input<string>? MaxUnhealthy { get; set; }

        /// <summary>
        /// The name of the cluster.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// seconds to wait for machine pool drain to complete before machine deletion
        /// </summary>
        [Input("nodeDrainTimeout")]
        public Input<int>? NodeDrainTimeout { get; set; }

        /// <summary>
        /// seconds a new node has to become active before it is replaced
        /// </summary>
        [Input("nodeStartupTimeoutSeconds")]
        public Input<int>? NodeStartupTimeoutSeconds { get; set; }

        /// <summary>
        /// Machine pool paused
        /// </summary>
        [Input("paused")]
        public Input<bool>? Paused { get; set; }

        /// <summary>
        /// Machine pool quantity
        /// </summary>
        [Input("quantity")]
        public Input<int>? Quantity { get; set; }

        /// <summary>
        /// Machine pool rolling update
        /// </summary>
        [Input("rollingUpdate")]
        public Input<Inputs.ClusterV2RkeConfigMachinePoolRollingUpdateGetArgs>? RollingUpdate { get; set; }

        [Input("taints")]
        private InputList<Inputs.ClusterV2RkeConfigMachinePoolTaintGetArgs>? _taints;

        /// <summary>
        /// Machine pool taints
        /// </summary>
        public InputList<Inputs.ClusterV2RkeConfigMachinePoolTaintGetArgs> Taints
        {
            get => _taints ?? (_taints = new InputList<Inputs.ClusterV2RkeConfigMachinePoolTaintGetArgs>());
            set => _taints = value;
        }

        /// <summary>
        /// seconds an unhealthy node has to become active before it is replaced
        /// </summary>
        [Input("unhealthyNodeTimeoutSeconds")]
        public Input<int>? UnhealthyNodeTimeoutSeconds { get; set; }

        /// <summary>
        /// range of unhealthy nodes for automated replacement to be allowed
        /// </summary>
        [Input("unhealthyRange")]
        public Input<string>? UnhealthyRange { get; set; }

        /// <summary>
        /// Machine pool worker role
        /// </summary>
        [Input("workerRole")]
        public Input<bool>? WorkerRole { get; set; }

        public ClusterV2RkeConfigMachinePoolGetArgs()
        {
        }
        public static new ClusterV2RkeConfigMachinePoolGetArgs Empty => new ClusterV2RkeConfigMachinePoolGetArgs();
    }
}
