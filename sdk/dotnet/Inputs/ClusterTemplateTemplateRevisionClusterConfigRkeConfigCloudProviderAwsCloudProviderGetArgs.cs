// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("global")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderGlobalGetArgs>? Global { get; set; }

        [Input("serviceOverrides")]
        private InputList<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderServiceOverrideGetArgs>? _serviceOverrides;
        public InputList<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderServiceOverrideGetArgs> ServiceOverrides
        {
            get => _serviceOverrides ?? (_serviceOverrides = new InputList<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderServiceOverrideGetArgs>());
            set => _serviceOverrides = value;
        }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderGetArgs()
        {
        }
        public static new ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderGetArgs Empty => new ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderGetArgs();
    }
}
