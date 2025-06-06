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
    public sealed class ClusterV2RkeConfigRegistriesMirror
    {
        /// <summary>
        /// Registry mirror endpoints
        /// </summary>
        public readonly ImmutableArray<string> Endpoints;
        /// <summary>
        /// Registry hostname
        /// </summary>
        public readonly string Hostname;
        /// <summary>
        /// Registry mirror rewrites
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Rewrites;

        [OutputConstructor]
        private ClusterV2RkeConfigRegistriesMirror(
            ImmutableArray<string> endpoints,

            string hostname,

            ImmutableDictionary<string, string>? rewrites)
        {
            Endpoints = endpoints;
            Hostname = hostname;
            Rewrites = rewrites;
        }
    }
}
