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
    public sealed class ClusterRkeConfigAuthorization
    {
        /// <summary>
        /// RKE mode for authorization. `rbac` and `none` modes are available. Default `rbac` (string)
        /// </summary>
        public readonly string? Mode;
        /// <summary>
        /// RKE options for network (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Options;

        [OutputConstructor]
        private ClusterRkeConfigAuthorization(
            string? mode,

            ImmutableDictionary<string, object>? options)
        {
            Mode = mode;
            Options = options;
        }
    }
}