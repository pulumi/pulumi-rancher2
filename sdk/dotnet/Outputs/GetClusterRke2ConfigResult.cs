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
    public sealed class GetClusterRke2ConfigResult
    {
        /// <summary>
        /// The RKE2 upgrade strategy
        /// </summary>
        public readonly Outputs.GetClusterRke2ConfigUpgradeStrategyResult UpgradeStrategy;
        /// <summary>
        /// The RKE2 kubernetes version
        /// </summary>
        public readonly string Version;

        [OutputConstructor]
        private GetClusterRke2ConfigResult(
            Outputs.GetClusterRke2ConfigUpgradeStrategyResult upgradeStrategy,

            string version)
        {
            UpgradeStrategy = upgradeStrategy;
            Version = version;
        }
    }
}
