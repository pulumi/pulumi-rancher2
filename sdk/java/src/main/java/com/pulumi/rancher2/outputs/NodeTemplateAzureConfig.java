// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodeTemplateAzureConfig {
    /**
     * @return Azure Availability Set to place the virtual machine into. Default `docker-machine` (string)
     * 
     */
    private final @Nullable String availabilitySet;
    /**
     * @return Azure Service Principal Account ID. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    private final @Nullable String clientId;
    /**
     * @return Azure Service Principal Account password. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    private final @Nullable String clientSecret;
    /**
     * @return Path to file with custom-data (string)
     * 
     */
    private final @Nullable String customData;
    /**
     * @return vSphere size of disk for docker VM (in MB). Default `20480` (string)
     * 
     */
    private final @Nullable String diskSize;
    /**
     * @return A unique DNS label for the public IP adddress (string)
     * 
     */
    private final @Nullable String dns;
    /**
     * @return Docker Port. Default `2376` (string)
     * 
     */
    private final @Nullable String dockerPort;
    /**
     * @return Azure environment (e.g. AzurePublicCloud, AzureChinaCloud). Default `AzurePublicCloud` (string)
     * 
     */
    private final @Nullable String environment;
    /**
     * @return Fault domain count to use for availability set. Default `3` (string)
     * 
     */
    private final @Nullable String faultDomainCount;
    /**
     * @return Specifies the Linode Instance image which determines the OS distribution and base files. Default `linode/ubuntu18.04` (string)
     * 
     */
    private final @Nullable String image;
    /**
     * @return Azure region to create the virtual machine. Default `westus` (string)
     * 
     */
    private final @Nullable String location;
    /**
     * @return Configures VM and availability set for managed disks. Just for Rancher v2.3.x and above. Default `false` (bool)
     * 
     */
    private final @Nullable Boolean managedDisks;
    /**
     * @return Do not create a public IP address for the machine. Default `false` (bool)
     * 
     */
    private final @Nullable Boolean noPublicIp;
    /**
     * @return Azure Network Security Group to assign this node to (accepts either a name or resource ID, default is to create a new NSG for each machine). Default `docker-machine-nsg` (string)
     * 
     */
    private final @Nullable String nsg;
    /**
     * @return Make the specified port number accessible from the Internet. (list)
     * 
     */
    private final @Nullable List<String> openPorts;
    /**
     * @return Azure marketplace purchase plan for Azure Virtual Machine. Format is `&lt;publisher&gt;:&lt;product&gt;:&lt;plan&gt;`. Just for Rancher v2.6.3 and above. (string)
     * 
     */
    private final @Nullable String plan;
    /**
     * @return Specify a static private IP address for the machine. (string)
     * 
     */
    private final @Nullable String privateIpAddress;
    /**
     * @return Azure Resource Group name (will be created if missing). Default `docker-machine` (string)
     * 
     */
    private final @Nullable String resourceGroup;
    /**
     * @return Digital Ocean size. Default `s-1vcpu-1gb` (string)
     * 
     */
    private final @Nullable String size;
    /**
     * @return If using a non-B2D image you can specify the ssh user. Default `docker`. From Rancher v2.3.3 (string)
     * 
     */
    private final @Nullable String sshUser;
    /**
     * @return Assign a static public IP address to the machine. Default `false` (bool)
     * 
     */
    private final @Nullable Boolean staticPublicIp;
    /**
     * @return Type of Storage Account to host the OS Disk for the machine. Default `Standard_LRS` (string)
     * 
     */
    private final @Nullable String storageType;
    /**
     * @return Azure Subnet Name to be used within the Virtual Network. Default `docker-machine` (string)
     * 
     */
    private final @Nullable String subnet;
    /**
     * @return Private CIDR block to be used for the new subnet, should comply RFC 1918. Default `192.168.0.0/16` (string)
     * 
     */
    private final @Nullable String subnetPrefix;
    /**
     * @return Azure Subscription ID. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    private final @Nullable String subscriptionId;
    /**
     * @return Update domain count to use for availability set. Default `5` (string)
     * 
     */
    private final @Nullable String updateDomainCount;
    /**
     * @return Use private IP address of the machine to connect. Default `false` (bool)
     * 
     */
    private final @Nullable Boolean usePrivateIp;
    /**
     * @return Azure Virtual Network name to connect the virtual machine (in [resourcegroup:]name format). Default `docker-machine-vnet` (string)
     * 
     */
    private final @Nullable String vnet;

    @CustomType.Constructor
    private NodeTemplateAzureConfig(
        @CustomType.Parameter("availabilitySet") @Nullable String availabilitySet,
        @CustomType.Parameter("clientId") @Nullable String clientId,
        @CustomType.Parameter("clientSecret") @Nullable String clientSecret,
        @CustomType.Parameter("customData") @Nullable String customData,
        @CustomType.Parameter("diskSize") @Nullable String diskSize,
        @CustomType.Parameter("dns") @Nullable String dns,
        @CustomType.Parameter("dockerPort") @Nullable String dockerPort,
        @CustomType.Parameter("environment") @Nullable String environment,
        @CustomType.Parameter("faultDomainCount") @Nullable String faultDomainCount,
        @CustomType.Parameter("image") @Nullable String image,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("managedDisks") @Nullable Boolean managedDisks,
        @CustomType.Parameter("noPublicIp") @Nullable Boolean noPublicIp,
        @CustomType.Parameter("nsg") @Nullable String nsg,
        @CustomType.Parameter("openPorts") @Nullable List<String> openPorts,
        @CustomType.Parameter("plan") @Nullable String plan,
        @CustomType.Parameter("privateIpAddress") @Nullable String privateIpAddress,
        @CustomType.Parameter("resourceGroup") @Nullable String resourceGroup,
        @CustomType.Parameter("size") @Nullable String size,
        @CustomType.Parameter("sshUser") @Nullable String sshUser,
        @CustomType.Parameter("staticPublicIp") @Nullable Boolean staticPublicIp,
        @CustomType.Parameter("storageType") @Nullable String storageType,
        @CustomType.Parameter("subnet") @Nullable String subnet,
        @CustomType.Parameter("subnetPrefix") @Nullable String subnetPrefix,
        @CustomType.Parameter("subscriptionId") @Nullable String subscriptionId,
        @CustomType.Parameter("updateDomainCount") @Nullable String updateDomainCount,
        @CustomType.Parameter("usePrivateIp") @Nullable Boolean usePrivateIp,
        @CustomType.Parameter("vnet") @Nullable String vnet) {
        this.availabilitySet = availabilitySet;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.customData = customData;
        this.diskSize = diskSize;
        this.dns = dns;
        this.dockerPort = dockerPort;
        this.environment = environment;
        this.faultDomainCount = faultDomainCount;
        this.image = image;
        this.location = location;
        this.managedDisks = managedDisks;
        this.noPublicIp = noPublicIp;
        this.nsg = nsg;
        this.openPorts = openPorts;
        this.plan = plan;
        this.privateIpAddress = privateIpAddress;
        this.resourceGroup = resourceGroup;
        this.size = size;
        this.sshUser = sshUser;
        this.staticPublicIp = staticPublicIp;
        this.storageType = storageType;
        this.subnet = subnet;
        this.subnetPrefix = subnetPrefix;
        this.subscriptionId = subscriptionId;
        this.updateDomainCount = updateDomainCount;
        this.usePrivateIp = usePrivateIp;
        this.vnet = vnet;
    }

    /**
     * @return Azure Availability Set to place the virtual machine into. Default `docker-machine` (string)
     * 
     */
    public Optional<String> availabilitySet() {
        return Optional.ofNullable(this.availabilitySet);
    }
    /**
     * @return Azure Service Principal Account ID. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * @return Azure Service Principal Account password. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    public Optional<String> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }
    /**
     * @return Path to file with custom-data (string)
     * 
     */
    public Optional<String> customData() {
        return Optional.ofNullable(this.customData);
    }
    /**
     * @return vSphere size of disk for docker VM (in MB). Default `20480` (string)
     * 
     */
    public Optional<String> diskSize() {
        return Optional.ofNullable(this.diskSize);
    }
    /**
     * @return A unique DNS label for the public IP adddress (string)
     * 
     */
    public Optional<String> dns() {
        return Optional.ofNullable(this.dns);
    }
    /**
     * @return Docker Port. Default `2376` (string)
     * 
     */
    public Optional<String> dockerPort() {
        return Optional.ofNullable(this.dockerPort);
    }
    /**
     * @return Azure environment (e.g. AzurePublicCloud, AzureChinaCloud). Default `AzurePublicCloud` (string)
     * 
     */
    public Optional<String> environment() {
        return Optional.ofNullable(this.environment);
    }
    /**
     * @return Fault domain count to use for availability set. Default `3` (string)
     * 
     */
    public Optional<String> faultDomainCount() {
        return Optional.ofNullable(this.faultDomainCount);
    }
    /**
     * @return Specifies the Linode Instance image which determines the OS distribution and base files. Default `linode/ubuntu18.04` (string)
     * 
     */
    public Optional<String> image() {
        return Optional.ofNullable(this.image);
    }
    /**
     * @return Azure region to create the virtual machine. Default `westus` (string)
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return Configures VM and availability set for managed disks. Just for Rancher v2.3.x and above. Default `false` (bool)
     * 
     */
    public Optional<Boolean> managedDisks() {
        return Optional.ofNullable(this.managedDisks);
    }
    /**
     * @return Do not create a public IP address for the machine. Default `false` (bool)
     * 
     */
    public Optional<Boolean> noPublicIp() {
        return Optional.ofNullable(this.noPublicIp);
    }
    /**
     * @return Azure Network Security Group to assign this node to (accepts either a name or resource ID, default is to create a new NSG for each machine). Default `docker-machine-nsg` (string)
     * 
     */
    public Optional<String> nsg() {
        return Optional.ofNullable(this.nsg);
    }
    /**
     * @return Make the specified port number accessible from the Internet. (list)
     * 
     */
    public List<String> openPorts() {
        return this.openPorts == null ? List.of() : this.openPorts;
    }
    /**
     * @return Azure marketplace purchase plan for Azure Virtual Machine. Format is `&lt;publisher&gt;:&lt;product&gt;:&lt;plan&gt;`. Just for Rancher v2.6.3 and above. (string)
     * 
     */
    public Optional<String> plan() {
        return Optional.ofNullable(this.plan);
    }
    /**
     * @return Specify a static private IP address for the machine. (string)
     * 
     */
    public Optional<String> privateIpAddress() {
        return Optional.ofNullable(this.privateIpAddress);
    }
    /**
     * @return Azure Resource Group name (will be created if missing). Default `docker-machine` (string)
     * 
     */
    public Optional<String> resourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }
    /**
     * @return Digital Ocean size. Default `s-1vcpu-1gb` (string)
     * 
     */
    public Optional<String> size() {
        return Optional.ofNullable(this.size);
    }
    /**
     * @return If using a non-B2D image you can specify the ssh user. Default `docker`. From Rancher v2.3.3 (string)
     * 
     */
    public Optional<String> sshUser() {
        return Optional.ofNullable(this.sshUser);
    }
    /**
     * @return Assign a static public IP address to the machine. Default `false` (bool)
     * 
     */
    public Optional<Boolean> staticPublicIp() {
        return Optional.ofNullable(this.staticPublicIp);
    }
    /**
     * @return Type of Storage Account to host the OS Disk for the machine. Default `Standard_LRS` (string)
     * 
     */
    public Optional<String> storageType() {
        return Optional.ofNullable(this.storageType);
    }
    /**
     * @return Azure Subnet Name to be used within the Virtual Network. Default `docker-machine` (string)
     * 
     */
    public Optional<String> subnet() {
        return Optional.ofNullable(this.subnet);
    }
    /**
     * @return Private CIDR block to be used for the new subnet, should comply RFC 1918. Default `192.168.0.0/16` (string)
     * 
     */
    public Optional<String> subnetPrefix() {
        return Optional.ofNullable(this.subnetPrefix);
    }
    /**
     * @return Azure Subscription ID. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    public Optional<String> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }
    /**
     * @return Update domain count to use for availability set. Default `5` (string)
     * 
     */
    public Optional<String> updateDomainCount() {
        return Optional.ofNullable(this.updateDomainCount);
    }
    /**
     * @return Use private IP address of the machine to connect. Default `false` (bool)
     * 
     */
    public Optional<Boolean> usePrivateIp() {
        return Optional.ofNullable(this.usePrivateIp);
    }
    /**
     * @return Azure Virtual Network name to connect the virtual machine (in [resourcegroup:]name format). Default `docker-machine-vnet` (string)
     * 
     */
    public Optional<String> vnet() {
        return Optional.ofNullable(this.vnet);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTemplateAzureConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String availabilitySet;
        private @Nullable String clientId;
        private @Nullable String clientSecret;
        private @Nullable String customData;
        private @Nullable String diskSize;
        private @Nullable String dns;
        private @Nullable String dockerPort;
        private @Nullable String environment;
        private @Nullable String faultDomainCount;
        private @Nullable String image;
        private @Nullable String location;
        private @Nullable Boolean managedDisks;
        private @Nullable Boolean noPublicIp;
        private @Nullable String nsg;
        private @Nullable List<String> openPorts;
        private @Nullable String plan;
        private @Nullable String privateIpAddress;
        private @Nullable String resourceGroup;
        private @Nullable String size;
        private @Nullable String sshUser;
        private @Nullable Boolean staticPublicIp;
        private @Nullable String storageType;
        private @Nullable String subnet;
        private @Nullable String subnetPrefix;
        private @Nullable String subscriptionId;
        private @Nullable String updateDomainCount;
        private @Nullable Boolean usePrivateIp;
        private @Nullable String vnet;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeTemplateAzureConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilitySet = defaults.availabilitySet;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.customData = defaults.customData;
    	      this.diskSize = defaults.diskSize;
    	      this.dns = defaults.dns;
    	      this.dockerPort = defaults.dockerPort;
    	      this.environment = defaults.environment;
    	      this.faultDomainCount = defaults.faultDomainCount;
    	      this.image = defaults.image;
    	      this.location = defaults.location;
    	      this.managedDisks = defaults.managedDisks;
    	      this.noPublicIp = defaults.noPublicIp;
    	      this.nsg = defaults.nsg;
    	      this.openPorts = defaults.openPorts;
    	      this.plan = defaults.plan;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.size = defaults.size;
    	      this.sshUser = defaults.sshUser;
    	      this.staticPublicIp = defaults.staticPublicIp;
    	      this.storageType = defaults.storageType;
    	      this.subnet = defaults.subnet;
    	      this.subnetPrefix = defaults.subnetPrefix;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.updateDomainCount = defaults.updateDomainCount;
    	      this.usePrivateIp = defaults.usePrivateIp;
    	      this.vnet = defaults.vnet;
        }

        public Builder availabilitySet(@Nullable String availabilitySet) {
            this.availabilitySet = availabilitySet;
            return this;
        }
        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder clientSecret(@Nullable String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public Builder customData(@Nullable String customData) {
            this.customData = customData;
            return this;
        }
        public Builder diskSize(@Nullable String diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Builder dns(@Nullable String dns) {
            this.dns = dns;
            return this;
        }
        public Builder dockerPort(@Nullable String dockerPort) {
            this.dockerPort = dockerPort;
            return this;
        }
        public Builder environment(@Nullable String environment) {
            this.environment = environment;
            return this;
        }
        public Builder faultDomainCount(@Nullable String faultDomainCount) {
            this.faultDomainCount = faultDomainCount;
            return this;
        }
        public Builder image(@Nullable String image) {
            this.image = image;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder managedDisks(@Nullable Boolean managedDisks) {
            this.managedDisks = managedDisks;
            return this;
        }
        public Builder noPublicIp(@Nullable Boolean noPublicIp) {
            this.noPublicIp = noPublicIp;
            return this;
        }
        public Builder nsg(@Nullable String nsg) {
            this.nsg = nsg;
            return this;
        }
        public Builder openPorts(@Nullable List<String> openPorts) {
            this.openPorts = openPorts;
            return this;
        }
        public Builder openPorts(String... openPorts) {
            return openPorts(List.of(openPorts));
        }
        public Builder plan(@Nullable String plan) {
            this.plan = plan;
            return this;
        }
        public Builder privateIpAddress(@Nullable String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public Builder resourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public Builder size(@Nullable String size) {
            this.size = size;
            return this;
        }
        public Builder sshUser(@Nullable String sshUser) {
            this.sshUser = sshUser;
            return this;
        }
        public Builder staticPublicIp(@Nullable Boolean staticPublicIp) {
            this.staticPublicIp = staticPublicIp;
            return this;
        }
        public Builder storageType(@Nullable String storageType) {
            this.storageType = storageType;
            return this;
        }
        public Builder subnet(@Nullable String subnet) {
            this.subnet = subnet;
            return this;
        }
        public Builder subnetPrefix(@Nullable String subnetPrefix) {
            this.subnetPrefix = subnetPrefix;
            return this;
        }
        public Builder subscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public Builder updateDomainCount(@Nullable String updateDomainCount) {
            this.updateDomainCount = updateDomainCount;
            return this;
        }
        public Builder usePrivateIp(@Nullable Boolean usePrivateIp) {
            this.usePrivateIp = usePrivateIp;
            return this;
        }
        public Builder vnet(@Nullable String vnet) {
            this.vnet = vnet;
            return this;
        }        public NodeTemplateAzureConfig build() {
            return new NodeTemplateAzureConfig(availabilitySet, clientId, clientSecret, customData, diskSize, dns, dockerPort, environment, faultDomainCount, image, location, managedDisks, noPublicIp, nsg, openPorts, plan, privateIpAddress, resourceGroup, size, sshUser, staticPublicIp, storageType, subnet, subnetPrefix, subscriptionId, updateDomainCount, usePrivateIp, vnet);
        }
    }
}