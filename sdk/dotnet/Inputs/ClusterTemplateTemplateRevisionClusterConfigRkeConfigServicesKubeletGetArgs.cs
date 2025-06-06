// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeletGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("clusterDnsServer")]
        public Input<string>? ClusterDnsServer { get; set; }

        [Input("clusterDomain")]
        public Input<string>? ClusterDomain { get; set; }

        [Input("extraArgs")]
        private InputMap<string>? _extraArgs;
        public InputMap<string> ExtraArgs
        {
            get => _extraArgs ?? (_extraArgs = new InputMap<string>());
            set => _extraArgs = value;
        }

        [Input("extraBinds")]
        private InputList<string>? _extraBinds;
        public InputList<string> ExtraBinds
        {
            get => _extraBinds ?? (_extraBinds = new InputList<string>());
            set => _extraBinds = value;
        }

        [Input("extraEnvs")]
        private InputList<string>? _extraEnvs;
        public InputList<string> ExtraEnvs
        {
            get => _extraEnvs ?? (_extraEnvs = new InputList<string>());
            set => _extraEnvs = value;
        }

        [Input("failSwapOn")]
        public Input<bool>? FailSwapOn { get; set; }

        [Input("generateServingCertificate")]
        public Input<bool>? GenerateServingCertificate { get; set; }

        [Input("image")]
        public Input<string>? Image { get; set; }

        [Input("infraContainerImage")]
        public Input<string>? InfraContainerImage { get; set; }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeletGetArgs()
        {
        }
        public static new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeletGetArgs Empty => new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeletGetArgs();
    }
}
