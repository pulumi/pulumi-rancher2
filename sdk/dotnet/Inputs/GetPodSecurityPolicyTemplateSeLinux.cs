// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class GetPodSecurityPolicyTemplateSeLinuxArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// rule is the strategy that will dictate the allowable labels that may be set.
        /// </summary>
        [Input("rule", required: true)]
        public string Rule { get; set; } = null!;

        /// <summary>
        /// seLinuxOptions required to run as; required for MustRunAs. More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
        /// </summary>
        [Input("seLinuxOption")]
        public Inputs.GetPodSecurityPolicyTemplateSeLinuxSeLinuxOptionArgs? SeLinuxOption { get; set; }

        public GetPodSecurityPolicyTemplateSeLinuxArgs()
        {
        }
        public static new GetPodSecurityPolicyTemplateSeLinuxArgs Empty => new GetPodSecurityPolicyTemplateSeLinuxArgs();
    }
}
