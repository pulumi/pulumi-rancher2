// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterV2RkeConfigMachineSelectorConfigGetArgs : Pulumi.ResourceArgs
    {
        [Input("config")]
        private InputMap<object>? _config;

        /// <summary>
        /// Machine selector config (map)
        /// </summary>
        public InputMap<object> Config
        {
            get => _config ?? (_config = new InputMap<object>());
            set => _config = value;
        }

        /// <summary>
        /// Machine selector label (list maxitems:1)
        /// </summary>
        [Input("machineLabelSelector")]
        public Input<Inputs.ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorGetArgs>? MachineLabelSelector { get; set; }

        public ClusterV2RkeConfigMachineSelectorConfigGetArgs()
        {
        }
    }
}