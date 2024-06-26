// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterAlertRuleEventRuleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Event type
        /// </summary>
        [Input("eventType")]
        public Input<string>? EventType { get; set; }

        /// <summary>
        /// Resource kind
        /// </summary>
        [Input("resourceKind", required: true)]
        public Input<string> ResourceKind { get; set; } = null!;

        public ClusterAlertRuleEventRuleGetArgs()
        {
        }
        public static new ClusterAlertRuleEventRuleGetArgs Empty => new ClusterAlertRuleEventRuleGetArgs();
    }
}
