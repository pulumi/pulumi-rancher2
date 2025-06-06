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
    public sealed class ClusterRkeConfigPrivateRegistry
    {
        /// <summary>
        /// ECR credential plugin config
        /// </summary>
        public readonly Outputs.ClusterRkeConfigPrivateRegistryEcrCredentialPlugin? EcrCredentialPlugin;
        /// <summary>
        /// Set as default registry. Default `false` (bool)
        /// </summary>
        public readonly bool? IsDefault;
        /// <summary>
        /// Registry password (string)
        /// </summary>
        public readonly string? Password;
        /// <summary>
        /// Registry URL (string)
        /// </summary>
        public readonly string Url;
        /// <summary>
        /// Registry user (string)
        /// </summary>
        public readonly string? User;

        [OutputConstructor]
        private ClusterRkeConfigPrivateRegistry(
            Outputs.ClusterRkeConfigPrivateRegistryEcrCredentialPlugin? ecrCredentialPlugin,

            bool? isDefault,

            string? password,

            string url,

            string? user)
        {
            EcrCredentialPlugin = ecrCredentialPlugin;
            IsDefault = isDefault;
            Password = password;
            Url = url;
            User = user;
        }
    }
}
