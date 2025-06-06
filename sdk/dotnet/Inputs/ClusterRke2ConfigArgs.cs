// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRke2ConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The RKE2 upgrade strategy
        /// </summary>
        [Input("upgradeStrategy")]
        public Input<Inputs.ClusterRke2ConfigUpgradeStrategyArgs>? UpgradeStrategy { get; set; }

        /// <summary>
        /// The RKE2 kubernetes version
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public ClusterRke2ConfigArgs()
        {
        }
        public static new ClusterRke2ConfigArgs Empty => new ClusterRke2ConfigArgs();
    }
}
