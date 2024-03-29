// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class PodSecurityPolicyTemplateRuntimeClassArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedRuntimeClassNames", required: true)]
        private InputList<string>? _allowedRuntimeClassNames;

        /// <summary>
        /// (list)
        /// </summary>
        public InputList<string> AllowedRuntimeClassNames
        {
            get => _allowedRuntimeClassNames ?? (_allowedRuntimeClassNames = new InputList<string>());
            set => _allowedRuntimeClassNames = value;
        }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("defaultRuntimeClassName")]
        public Input<string>? DefaultRuntimeClassName { get; set; }

        public PodSecurityPolicyTemplateRuntimeClassArgs()
        {
        }
        public static new PodSecurityPolicyTemplateRuntimeClassArgs Empty => new PodSecurityPolicyTemplateRuntimeClassArgs();
    }
}
