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
    public sealed class ClusterRkeConfigNode
    {
        /// <summary>
        /// Address ip for node (string)
        /// </summary>
        public readonly string Address;
        /// <summary>
        /// Docker socket for node (string)
        /// </summary>
        public readonly string? DockerSocket;
        /// <summary>
        /// Hostname override for node (string)
        /// </summary>
        public readonly string? HostnameOverride;
        /// <summary>
        /// Internal ip for node (string)
        /// </summary>
        public readonly string? InternalAddress;
        /// <summary>
        /// Labels for the Cluster (map)
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Labels;
        /// <summary>
        /// Id for the node (string)
        /// </summary>
        public readonly string? NodeId;
        /// <summary>
        /// Port for node. Default `22` (string)
        /// </summary>
        public readonly string? Port;
        /// <summary>
        /// Roles for the node. `controlplane`, `etcd` and `worker` are supported. (list)
        /// </summary>
        public readonly ImmutableArray<string> Roles;
        /// <summary>
        /// Use ssh agent auth. Default `false` (bool)
        /// </summary>
        public readonly bool? SshAgentAuth;
        /// <summary>
        /// Node SSH private key (string)
        /// </summary>
        public readonly string? SshKey;
        /// <summary>
        /// Node SSH private key path (string)
        /// </summary>
        public readonly string? SshKeyPath;
        /// <summary>
        /// Registry user (string)
        /// </summary>
        public readonly string User;

        [OutputConstructor]
        private ClusterRkeConfigNode(
            string address,

            string? dockerSocket,

            string? hostnameOverride,

            string? internalAddress,

            ImmutableDictionary<string, string>? labels,

            string? nodeId,

            string? port,

            ImmutableArray<string> roles,

            bool? sshAgentAuth,

            string? sshKey,

            string? sshKeyPath,

            string user)
        {
            Address = address;
            DockerSocket = dockerSocket;
            HostnameOverride = hostnameOverride;
            InternalAddress = internalAddress;
            Labels = labels;
            NodeId = nodeId;
            Port = port;
            Roles = roles;
            SshAgentAuth = sshAgentAuth;
            SshKey = sshKey;
            SshKeyPath = sshKeyPath;
            User = user;
        }
    }
}
