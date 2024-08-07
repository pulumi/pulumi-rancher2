// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class NotifierDingtalkConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Dingtalk proxy URL
        /// </summary>
        [Input("proxyUrl")]
        public Input<string>? ProxyUrl { get; set; }

        [Input("secret")]
        private Input<string>? _secret;

        /// <summary>
        /// Required for webhook with sign enabled
        /// </summary>
        public Input<string>? Secret
        {
            get => _secret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Webhook URL
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        public NotifierDingtalkConfigGetArgs()
        {
        }
        public static new NotifierDingtalkConfigGetArgs Empty => new NotifierDingtalkConfigGetArgs();
    }
}
