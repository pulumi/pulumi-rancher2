// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigCloudProviderAwsCloudProviderArgs : global::Pulumi.ResourceArgs
    {
        [Input("global")]
        public Input<Inputs.ClusterRkeConfigCloudProviderAwsCloudProviderGlobalArgs>? Global { get; set; }

        [Input("serviceOverrides")]
        private InputList<Inputs.ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverrideArgs>? _serviceOverrides;
        public InputList<Inputs.ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverrideArgs> ServiceOverrides
        {
            get => _serviceOverrides ?? (_serviceOverrides = new InputList<Inputs.ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverrideArgs>());
            set => _serviceOverrides = value;
        }

        public ClusterRkeConfigCloudProviderAwsCloudProviderArgs()
        {
        }
        public static new ClusterRkeConfigCloudProviderAwsCloudProviderArgs Empty => new ClusterRkeConfigCloudProviderAwsCloudProviderArgs();
    }
}
