// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogConfigurationArgs : global::Pulumi.ResourceArgs
    {
        [Input("format")]
        public Input<string>? Format { get; set; }

        [Input("maxAge")]
        public Input<int>? MaxAge { get; set; }

        [Input("maxBackup")]
        public Input<int>? MaxBackup { get; set; }

        [Input("maxSize")]
        public Input<int>? MaxSize { get; set; }

        [Input("path")]
        public Input<string>? Path { get; set; }

        [Input("policy")]
        public Input<string>? Policy { get; set; }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogConfigurationArgs()
        {
        }
        public static new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogConfigurationArgs Empty => new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogConfigurationArgs();
    }
}
