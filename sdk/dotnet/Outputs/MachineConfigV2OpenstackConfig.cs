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
    public sealed class MachineConfigV2OpenstackConfig
    {
        /// <summary>
        /// OpenStack active timeout Default `200` (string)
        /// </summary>
        public readonly string? ActiveTimeout;
        /// <summary>
        /// OpenStack application credential id. Conflicts with `application_credential_name` (string)
        /// </summary>
        public readonly string? ApplicationCredentialId;
        /// <summary>
        /// OpenStack application credential name. Conflicts with `application_credential_id` (string)
        /// </summary>
        public readonly string? ApplicationCredentialName;
        /// <summary>
        /// OpenStack application credential secret (string)
        /// </summary>
        public readonly string? ApplicationCredentialSecret;
        /// <summary>
        /// OpenStack authentication URL (string)
        /// </summary>
        public readonly string AuthUrl;
        /// <summary>
        /// OpenStack availability zone (string)
        /// </summary>
        public readonly string AvailabilityZone;
        /// <summary>
        /// Enable booting from volume. Default is `false` (bool)
        /// </summary>
        public readonly bool? BootFromVolume;
        /// <summary>
        /// CA certificate bundle to verify against (string)
        /// </summary>
        public readonly string? Cacert;
        /// <summary>
        /// Enables the OpenStack config drive for the instance. Default `false` (bool)
        /// </summary>
        public readonly bool? ConfigDrive;
        /// <summary>
        /// OpenStack domain ID. Identity v3 only. Conflicts with `domain_name` (string)
        /// </summary>
        public readonly string? DomainId;
        /// <summary>
        /// OpenStack domain name. Identity v3 only. Conflicts with `domain_id` (string)
        /// </summary>
        public readonly string? DomainName;
        /// <summary>
        /// OpenStack endpoint type. adminURL, internalURL or publicURL (string)
        /// </summary>
        public readonly string? EndpointType;
        /// <summary>
        /// OpenStack flavor id to use for the instance. Conflicts with `flavor_name` (string)
        /// </summary>
        public readonly string? FlavorId;
        /// <summary>
        /// OpenStack flavor name to use for the instance. Conflicts with `flavor_id` (string)
        /// </summary>
        public readonly string? FlavorName;
        /// <summary>
        /// OpenStack floating IP pool to get an IP from to assign to the instance (string)
        /// </summary>
        public readonly string? FloatingIpPool;
        /// <summary>
        /// OpenStack image id to use for the instance. Conflicts with `image_name` (string)
        /// </summary>
        public readonly string? ImageId;
        /// <summary>
        /// OpenStack image name to use for the instance. Conflicts with `image_id` (string)
        /// </summary>
        public readonly string? ImageName;
        /// <summary>
        /// Disable TLS credential checking. Default `false` (bool)
        /// </summary>
        public readonly bool? Insecure;
        /// <summary>
        /// OpenStack version of IP address assigned for the machine Default `4` (string)
        /// </summary>
        public readonly string? IpVersion;
        /// <summary>
        /// OpenStack keypair to use to SSH to the instance (string)
        /// </summary>
        public readonly string? KeypairName;
        /// <summary>
        /// OpenStack network id the machine will be connected on. Conflicts with `net_name` (string)
        /// </summary>
        public readonly string? NetId;
        /// <summary>
        /// OpenStack network name the machine will be connected on. Conflicts with `net_id` (string)
        /// </summary>
        public readonly string? NetName;
        /// <summary>
        /// Use the nova networking services instead of neutron (string)
        /// </summary>
        public readonly bool? NovaNetwork;
        /// <summary>
        /// OpenStack password. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
        /// </summary>
        public readonly string? Password;
        /// <summary>
        /// Private key content to use for SSH (string)
        /// </summary>
        public readonly string? PrivateKeyFile;
        /// <summary>
        /// OpenStack region name (string)
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// OpenStack comma separated security groups for the machine (string)
        /// </summary>
        public readonly string? SecGroups;
        /// <summary>
        /// If using a non-B2D image you can specify the ssh port. Default `22` (string)
        /// </summary>
        public readonly string? SshPort;
        /// <summary>
        /// If using a non-B2D image you can specify the ssh user. Default `docker`. (string)
        /// </summary>
        public readonly string? SshUser;
        /// <summary>
        /// OpenStack tenant domain id. Conflicts with `tenant_domain_name` (string)
        /// </summary>
        public readonly string? TenantDomainId;
        /// <summary>
        /// OpenStack tenant domain name. Conflicts with `tenant_domain_id` (string)
        /// </summary>
        public readonly string? TenantDomainName;
        /// <summary>
        /// OpenStack tenant id. Conflicts with `tenant_name` (string)
        /// </summary>
        public readonly string? TenantId;
        /// <summary>
        /// OpenStack tenant name. Conflicts with `tenant_id` (string)
        /// </summary>
        public readonly string? TenantName;
        /// <summary>
        /// File containing an openstack userdata script (string)
        /// </summary>
        public readonly string? UserDataFile;
        /// <summary>
        /// OpenStack user domain id. Conflicts with `user_domain_name` (string)
        /// </summary>
        public readonly string? UserDomainId;
        /// <summary>
        /// OpenStack user domain name. Conflicts with `user_domain_id` (string)
        /// </summary>
        public readonly string? UserDomainName;
        /// <summary>
        /// OpenStack username (string)
        /// </summary>
        public readonly string? Username;
        /// <summary>
        /// OpenStack volume device path (attaching). Applicable only when `boot_from_volume` is `true`. Omit for auto `/dev/vdb`. (string)
        /// &gt; **Note**: `Required+` denotes that either the _name or _id is required but you cannot use both.
        /// &gt; **Note**: `Required++` denotes that either the _name or _id is required unless `application_credential_id` is defined.
        /// </summary>
        public readonly string? VolumeDevicePath;
        /// <summary>
        /// OpenStack volume id of existing volume. Applicable only when `boot_from_volume` is `true` (string)
        /// </summary>
        public readonly string? VolumeId;
        /// <summary>
        /// OpenStack volume name of existing volume. Applicable only when `boot_from_volume` is `true` (string)
        /// </summary>
        public readonly string? VolumeName;
        /// <summary>
        /// OpenStack volume size (GiB). Required when `boot_from_volume` is `true` (string)
        /// </summary>
        public readonly string? VolumeSize;
        /// <summary>
        /// OpenStack volume type. Required when `boot_from_volume` is `true` and openstack cloud does not have a default volume type (string)
        /// </summary>
        public readonly string? VolumeType;

        [OutputConstructor]
        private MachineConfigV2OpenstackConfig(
            string? activeTimeout,

            string? applicationCredentialId,

            string? applicationCredentialName,

            string? applicationCredentialSecret,

            string authUrl,

            string availabilityZone,

            bool? bootFromVolume,

            string? cacert,

            bool? configDrive,

            string? domainId,

            string? domainName,

            string? endpointType,

            string? flavorId,

            string? flavorName,

            string? floatingIpPool,

            string? imageId,

            string? imageName,

            bool? insecure,

            string? ipVersion,

            string? keypairName,

            string? netId,

            string? netName,

            bool? novaNetwork,

            string? password,

            string? privateKeyFile,

            string region,

            string? secGroups,

            string? sshPort,

            string? sshUser,

            string? tenantDomainId,

            string? tenantDomainName,

            string? tenantId,

            string? tenantName,

            string? userDataFile,

            string? userDomainId,

            string? userDomainName,

            string? username,

            string? volumeDevicePath,

            string? volumeId,

            string? volumeName,

            string? volumeSize,

            string? volumeType)
        {
            ActiveTimeout = activeTimeout;
            ApplicationCredentialId = applicationCredentialId;
            ApplicationCredentialName = applicationCredentialName;
            ApplicationCredentialSecret = applicationCredentialSecret;
            AuthUrl = authUrl;
            AvailabilityZone = availabilityZone;
            BootFromVolume = bootFromVolume;
            Cacert = cacert;
            ConfigDrive = configDrive;
            DomainId = domainId;
            DomainName = domainName;
            EndpointType = endpointType;
            FlavorId = flavorId;
            FlavorName = flavorName;
            FloatingIpPool = floatingIpPool;
            ImageId = imageId;
            ImageName = imageName;
            Insecure = insecure;
            IpVersion = ipVersion;
            KeypairName = keypairName;
            NetId = netId;
            NetName = netName;
            NovaNetwork = novaNetwork;
            Password = password;
            PrivateKeyFile = privateKeyFile;
            Region = region;
            SecGroups = secGroups;
            SshPort = sshPort;
            SshUser = sshUser;
            TenantDomainId = tenantDomainId;
            TenantDomainName = tenantDomainName;
            TenantId = tenantId;
            TenantName = tenantName;
            UserDataFile = userDataFile;
            UserDomainId = userDomainId;
            UserDomainName = userDomainName;
            Username = username;
            VolumeDevicePath = volumeDevicePath;
            VolumeId = volumeId;
            VolumeName = volumeName;
            VolumeSize = volumeSize;
            VolumeType = volumeType;
        }
    }
}