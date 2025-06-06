// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (string)
        /// </summary>
        [Input("authUrl", required: true)]
        public Input<string> AuthUrl { get; set; } = null!;

        /// <summary>
        /// (string)
        /// </summary>
        [Input("caFile")]
        public Input<string>? CaFile { get; set; }

        [Input("domainId")]
        private Input<string>? _domainId;

        /// <summary>
        /// Required if `domain_name` not provided. (string)
        /// </summary>
        public Input<string>? DomainId
        {
            get => _domainId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _domainId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Required if `domain_id` not provided. (string)
        /// </summary>
        [Input("domainName")]
        public Input<string>? DomainName { get; set; }

        [Input("password", required: true)]
        private Input<string>? _password;

        /// <summary>
        /// Registry password (string)
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("tenantId")]
        private Input<string>? _tenantId;

        /// <summary>
        /// Azure tenant ID to use (string)
        /// </summary>
        public Input<string>? TenantId
        {
            get => _tenantId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _tenantId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Required if `tenant_id` not provided. (string)
        /// </summary>
        [Input("tenantName")]
        public Input<string>? TenantName { get; set; }

        [Input("trustId")]
        private Input<string>? _trustId;

        /// <summary>
        /// (string)
        /// </summary>
        public Input<string>? TrustId
        {
            get => _trustId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _trustId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("username", required: true)]
        private Input<string>? _username;

        /// <summary>
        /// (string)
        /// </summary>
        public Input<string>? Username
        {
            get => _username;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _username = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs()
        {
        }
        public static new ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs Empty => new ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs();
    }
}
