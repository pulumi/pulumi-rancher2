// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterV2RkeConfigMachineSelectorFileGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("fileSources")]
        private InputList<Inputs.ClusterV2RkeConfigMachineSelectorFileFileSourceGetArgs>? _fileSources;

        /// <summary>
        /// File sources represents the source of the files. Multiple files can be delivered to nodes that match the provided label selector.
        /// </summary>
        public InputList<Inputs.ClusterV2RkeConfigMachineSelectorFileFileSourceGetArgs> FileSources
        {
            get => _fileSources ?? (_fileSources = new InputList<Inputs.ClusterV2RkeConfigMachineSelectorFileFileSourceGetArgs>());
            set => _fileSources = value;
        }

        /// <summary>
        /// Machine selector label is a label query over a set of resources. The result of match_labels and match_expressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
        /// </summary>
        [Input("machineLabelSelector")]
        public Input<Inputs.ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorGetArgs>? MachineLabelSelector { get; set; }

        public ClusterV2RkeConfigMachineSelectorFileGetArgs()
        {
        }
        public static new ClusterV2RkeConfigMachineSelectorFileGetArgs Empty => new ClusterV2RkeConfigMachineSelectorFileGetArgs();
    }
}
