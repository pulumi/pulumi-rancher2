// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class GetPodSecurityPolicyTemplateFsGroupArgs : Pulumi.InvokeArgs
    {
        [Input("ranges", required: true)]
        private List<Inputs.GetPodSecurityPolicyTemplateFsGroupRangeArgs>? _ranges;
        public List<Inputs.GetPodSecurityPolicyTemplateFsGroupRangeArgs> Ranges
        {
            get => _ranges ?? (_ranges = new List<Inputs.GetPodSecurityPolicyTemplateFsGroupRangeArgs>());
            set => _ranges = value;
        }

        [Input("rule")]
        public string? Rule { get; set; }

        public GetPodSecurityPolicyTemplateFsGroupArgs()
        {
        }
    }
}