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
    public sealed class MachineConfigV2DigitaloceanConfig
    {
        /// <summary>
        /// Digital Ocean access token. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
        /// </summary>
        public readonly string? AccessToken;
        /// <summary>
        /// Enable backups for droplet. Default `false` (bool)
        /// </summary>
        public readonly bool? Backups;
        /// <summary>
        /// Specifies the Linode Instance image which determines the OS distribution and base files. Default `linode/ubuntu18.04` (string)
        /// </summary>
        public readonly string? Image;
        /// <summary>
        /// Enable ipv6 for droplet. Default `false` (bool)
        /// </summary>
        public readonly bool? Ipv6;
        /// <summary>
        /// Enable monitoring for droplet. Default `false` (bool)
        /// </summary>
        public readonly bool? Monitoring;
        /// <summary>
        /// Enable private networking for droplet. Default `false` (bool)
        /// </summary>
        public readonly bool? PrivateNetworking;
        /// <summary>
        /// OpenStack region name (string)
        /// </summary>
        public readonly string? Region;
        /// <summary>
        /// Digital Ocean size. Default `s-1vcpu-1gb` (string)
        /// </summary>
        public readonly string? Size;
        /// <summary>
        /// SSH private key contents (string)
        /// </summary>
        public readonly string? SshKeyContents;
        /// <summary>
        /// SSH key fingerprint (string)
        /// </summary>
        public readonly string? SshKeyFingerprint;
        /// <summary>
        /// If using a non-B2D image you can specify the ssh port. Default `22` (string)
        /// </summary>
        public readonly string? SshPort;
        /// <summary>
        /// If using a non-B2D image you can specify the ssh user. Default `docker`. (string)
        /// </summary>
        public readonly string? SshUser;
        /// <summary>
        /// vSphere tags id e.g. `urn:xxx` (list)
        /// </summary>
        public readonly string? Tags;
        /// <summary>
        /// Path to file with cloud-init user-data (string)
        /// </summary>
        public readonly string? Userdata;

        [OutputConstructor]
        private MachineConfigV2DigitaloceanConfig(
            string? accessToken,

            bool? backups,

            string? image,

            bool? ipv6,

            bool? monitoring,

            bool? privateNetworking,

            string? region,

            string? size,

            string? sshKeyContents,

            string? sshKeyFingerprint,

            string? sshPort,

            string? sshUser,

            string? tags,

            string? userdata)
        {
            AccessToken = accessToken;
            Backups = backups;
            Image = image;
            Ipv6 = ipv6;
            Monitoring = monitoring;
            PrivateNetworking = privateNetworking;
            Region = region;
            Size = size;
            SshKeyContents = sshKeyContents;
            SshKeyFingerprint = sshKeyFingerprint;
            SshPort = sshPort;
            SshUser = sshUser;
            Tags = tags;
            Userdata = userdata;
        }
    }
}