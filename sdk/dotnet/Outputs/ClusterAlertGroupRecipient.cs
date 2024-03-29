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
    public sealed class ClusterAlertGroupRecipient
    {
        /// <summary>
        /// Use notifier default recipient, overriding `recipient` argument if set.  Default: `false` (bool)
        /// </summary>
        public readonly bool? DefaultRecipient;
        /// <summary>
        /// Recipient notifier ID (string)
        /// </summary>
        public readonly string NotifierId;
        /// <summary>
        /// Recipient notifier ID. Supported values : `"dingtalk" | "msteams" | "pagerduty" | "slack" | "email" | "webhook" | "wechat"` (string)
        /// </summary>
        public readonly string? NotifierType;
        /// <summary>
        /// Recipient (string)
        /// </summary>
        public readonly string? Recipient;

        [OutputConstructor]
        private ClusterAlertGroupRecipient(
            bool? defaultRecipient,

            string notifierId,

            string? notifierType,

            string? recipient)
        {
            DefaultRecipient = defaultRecipient;
            NotifierId = notifierId;
            NotifierType = notifierType;
            Recipient = recipient;
        }
    }
}
