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
    public sealed class NamespaceResourceQuota
    {
        /// <summary>
        /// Resource quota limit for namespace (list maxitems:1)
        /// </summary>
        public readonly Outputs.NamespaceResourceQuotaLimit Limit;

        [OutputConstructor]
        private NamespaceResourceQuota(Outputs.NamespaceResourceQuotaLimit limit)
        {
            Limit = limit;
        }
    }
}
