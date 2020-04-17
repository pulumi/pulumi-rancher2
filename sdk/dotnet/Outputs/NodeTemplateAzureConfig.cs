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
    public sealed class NodeTemplateAzureConfig
    {
        /// <summary>
        /// Azure Availability Set to place the virtual machine into. Default `docker-machine` (string)
        /// </summary>
        public readonly string? AvailabilitySet;
        /// <summary>
        /// Azure Service Principal Account ID. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2..CloudCredential` from Rancher v2.2.x (string)
        /// </summary>
        public readonly string? ClientId;
        /// <summary>
        /// Azure Service Principal Account password. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2..CloudCredential` from Rancher v2.2.x (string)
        /// </summary>
        public readonly string? ClientSecret;
        /// <summary>
        /// Path to file with custom-data (string)
        /// </summary>
        public readonly string? CustomData;
        /// <summary>
        /// vSphere size of disk for docker VM (in MB). Default `20480` (string)
        /// </summary>
        public readonly string? DiskSize;
        /// <summary>
        /// A unique DNS label for the public IP adddress (string)
        /// </summary>
        public readonly string? Dns;
        /// <summary>
        /// Docker Port. Default `2376` (string)
        /// </summary>
        public readonly string? DockerPort;
        /// <summary>
        /// Azure environment (e.g. AzurePublicCloud, AzureChinaCloud). Default `AzurePublicCloud` (string)
        /// `fault_domain_count` - (Optional) Fault domain count to use for availability set. Default `3` (string)
        /// </summary>
        public readonly string? Environment;
        public readonly string? FaultDomainCount;
        /// <summary>
        /// Specifies the Linode Instance image which determines the OS distribution and base files. Default `linode/ubuntu18.04` (string)
        /// </summary>
        public readonly string? Image;
        /// <summary>
        /// Azure region to create the virtual machine. Default `westus` (string)
        /// </summary>
        public readonly string? Location;
        /// <summary>
        /// Configures VM and availability set for managed disks. Just for Rancher v2.3.x and above. Default `false` (bool)
        /// </summary>
        public readonly bool? ManagedDisks;
        /// <summary>
        /// Do not create a public IP address for the machine. Default `false` (bool)
        /// </summary>
        public readonly bool? NoPublicIp;
        /// <summary>
        /// Make the specified port number accessible from the Internet. (list)
        /// </summary>
        public readonly ImmutableArray<string> OpenPorts;
        /// <summary>
        /// Specify a static private IP address for the machine. (string)
        /// </summary>
        public readonly string? PrivateIpAddress;
        /// <summary>
        /// Azure Resource Group name (will be created if missing). Default `docker-machine` (string)
        /// </summary>
        public readonly string? ResourceGroup;
        /// <summary>
        /// Digital Ocean size. Default `s-1vcpu-1gb` (string)
        /// </summary>
        public readonly string? Size;
        /// <summary>
        /// If using a non-B2D image you can specify the ssh user. Default `docker`. From Rancher v2.3.3 (string)
        /// </summary>
        public readonly string? SshUser;
        /// <summary>
        /// Assign a static public IP address to the machine. Default `false` (bool)
        /// </summary>
        public readonly bool? StaticPublicIp;
        /// <summary>
        /// Type of Storage Account to host the OS Disk for the machine. Default `Standard_LRS` (string)
        /// </summary>
        public readonly string? StorageType;
        /// <summary>
        /// Azure Subnet Name to be used within the Virtual Network. Default `docker-machine` (string)
        /// </summary>
        public readonly string? Subnet;
        /// <summary>
        /// Private CIDR block to be used for the new subnet, should comply RFC 1918. Default `192.168.0.0/16` (string)
        /// </summary>
        public readonly string? SubnetPrefix;
        /// <summary>
        /// Azure Subscription ID. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2..CloudCredential` from Rancher v2.2.x (string)
        /// </summary>
        public readonly string? SubscriptionId;
        /// <summary>
        /// Update domain count to use for availability set. Default `5` (string)
        /// </summary>
        public readonly string? UpdateDomainCount;
        /// <summary>
        /// Use private IP address of the machine to connect. Default `false` (bool)
        /// </summary>
        public readonly bool? UsePrivateIp;
        /// <summary>
        /// Azure Virtual Network name to connect the virtual machine (in [resourcegroup:]name format). Default `docker-machine-vnet` (string)
        /// </summary>
        public readonly string? Vnet;

        [OutputConstructor]
        private NodeTemplateAzureConfig(
            string? availabilitySet,

            string? clientId,

            string? clientSecret,

            string? customData,

            string? diskSize,

            string? dns,

            string? dockerPort,

            string? environment,

            string? faultDomainCount,

            string? image,

            string? location,

            bool? managedDisks,

            bool? noPublicIp,

            ImmutableArray<string> openPorts,

            string? privateIpAddress,

            string? resourceGroup,

            string? size,

            string? sshUser,

            bool? staticPublicIp,

            string? storageType,

            string? subnet,

            string? subnetPrefix,

            string? subscriptionId,

            string? updateDomainCount,

            bool? usePrivateIp,

            string? vnet)
        {
            AvailabilitySet = availabilitySet;
            ClientId = clientId;
            ClientSecret = clientSecret;
            CustomData = customData;
            DiskSize = diskSize;
            Dns = dns;
            DockerPort = dockerPort;
            Environment = environment;
            FaultDomainCount = faultDomainCount;
            Image = image;
            Location = location;
            ManagedDisks = managedDisks;
            NoPublicIp = noPublicIp;
            OpenPorts = openPorts;
            PrivateIpAddress = privateIpAddress;
            ResourceGroup = resourceGroup;
            Size = size;
            SshUser = sshUser;
            StaticPublicIp = staticPublicIp;
            StorageType = storageType;
            Subnet = subnet;
            SubnetPrefix = subnetPrefix;
            SubscriptionId = subscriptionId;
            UpdateDomainCount = updateDomainCount;
            UsePrivateIp = usePrivateIp;
            Vnet = vnet;
        }
    }
}