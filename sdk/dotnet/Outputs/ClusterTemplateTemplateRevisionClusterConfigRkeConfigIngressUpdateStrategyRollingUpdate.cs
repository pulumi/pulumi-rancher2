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
    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigIngressUpdateStrategyRollingUpdate
    {
        /// <summary>
        /// Rolling update max unavailable
        /// </summary>
        public readonly int? MaxUnavailable;

        [OutputConstructor]
        private ClusterTemplateTemplateRevisionClusterConfigRkeConfigIngressUpdateStrategyRollingUpdate(int? maxUnavailable)
        {
            MaxUnavailable = maxUnavailable;
        }
    }
}
