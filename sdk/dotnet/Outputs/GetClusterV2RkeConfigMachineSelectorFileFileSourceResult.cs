// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Outputs
{

    [OutputType]
    public sealed class GetClusterV2RkeConfigMachineSelectorFileFileSourceResult
    {
        /// <summary>
        /// The configmap which is the source of files
        /// </summary>
        public readonly Outputs.GetClusterV2RkeConfigMachineSelectorFileFileSourceConfigmapResult? Configmap;
        /// <summary>
        /// The secret which is the source of files
        /// </summary>
        public readonly Outputs.GetClusterV2RkeConfigMachineSelectorFileFileSourceSecretResult? Secret;

        [OutputConstructor]
        private GetClusterV2RkeConfigMachineSelectorFileFileSourceResult(
            Outputs.GetClusterV2RkeConfigMachineSelectorFileFileSourceConfigmapResult? configmap,

            Outputs.GetClusterV2RkeConfigMachineSelectorFileFileSourceSecretResult? secret)
        {
            Configmap = configmap;
            Secret = secret;
        }
    }
}
