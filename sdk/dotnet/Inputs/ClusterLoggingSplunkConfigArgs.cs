// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterLoggingSplunkConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// SSL certificate for the syslog service (string)
        /// </summary>
        [Input("certificate")]
        public Input<string>? Certificate { get; set; }

        /// <summary>
        /// SSL client certificate for the syslog service (string)
        /// </summary>
        [Input("clientCert")]
        public Input<string>? ClientCert { get; set; }

        /// <summary>
        /// SSL client key for the syslog service (string)
        /// </summary>
        [Input("clientKey")]
        public Input<string>? ClientKey { get; set; }

        /// <summary>
        /// SSL client key password for the splunk service (string)
        /// </summary>
        [Input("clientKeyPass")]
        public Input<string>? ClientKeyPass { get; set; }

        /// <summary>
        /// Endpoint of the syslog service (string)
        /// </summary>
        [Input("endpoint", required: true)]
        public Input<string> Endpoint { get; set; } = null!;

        /// <summary>
        /// Index prefix for the splunk logs (string)
        /// </summary>
        [Input("index")]
        public Input<string>? Index { get; set; }

        /// <summary>
        /// Date format for the splunk logs (string)
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        /// <summary>
        /// SSL verify for the syslog service (bool)
        /// </summary>
        [Input("sslVerify")]
        public Input<bool>? SslVerify { get; set; }

        /// <summary>
        /// Token for the syslog service (string)
        /// </summary>
        [Input("token", required: true)]
        public Input<string> Token { get; set; } = null!;

        public ClusterLoggingSplunkConfigArgs()
        {
        }
    }
}