// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class NamespaceContainerResourceLimitArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Limit for limits cpu in namespace (string)
        /// </summary>
        [Input("limitsCpu")]
        public Input<string>? LimitsCpu { get; set; }

        /// <summary>
        /// Limit for limits memory in namespace (string)
        /// </summary>
        [Input("limitsMemory")]
        public Input<string>? LimitsMemory { get; set; }

        /// <summary>
        /// Limit for requests cpu in namespace (string)
        /// </summary>
        [Input("requestsCpu")]
        public Input<string>? RequestsCpu { get; set; }

        /// <summary>
        /// Limit for requests memory in namespace (string)
        /// </summary>
        [Input("requestsMemory")]
        public Input<string>? RequestsMemory { get; set; }

        public NamespaceContainerResourceLimitArgs()
        {
        }
    }
}