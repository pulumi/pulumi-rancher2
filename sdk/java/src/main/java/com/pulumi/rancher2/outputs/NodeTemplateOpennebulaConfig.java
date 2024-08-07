// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodeTemplateOpennebulaConfig {
    /**
     * @return Size of the Volatile disk in MB - only for b2d (string)
     * 
     */
    private @Nullable String b2dSize;
    /**
     * @return CPU value for the VM (string)
     * 
     */
    private @Nullable String cpu;
    /**
     * @return Dev prefix to use for the images. E.g.: &#39;vd&#39;, &#39;sd&#39;, &#39;hd&#39; (string)
     * 
     */
    private @Nullable String devPrefix;
    /**
     * @return VNC is enabled by default. Disable it with this flag (bool)
     * 
     */
    private @Nullable Boolean disableVnc;
    /**
     * @return Size of the disk for the VM in MB (string)
     * 
     */
    private @Nullable String diskResize;
    /**
     * @return OpenStack image id to use for the instance. Conflicts with `image_name` (string)
     * 
     */
    private @Nullable String imageId;
    /**
     * @return OpenStack image name to use for the instance. Conflicts with `image_id` (string)
     * 
     */
    private @Nullable String imageName;
    /**
     * @return Owner of the image to use as the VM OS (string)
     * 
     */
    private @Nullable String imageOwner;
    /**
     * @return Size of the memory for the VM in MB (string)
     * 
     */
    private @Nullable String memory;
    /**
     * @return Opennebula network ID to connect the machine to. Conflicts with `network_name` (string)
     * 
     */
    private @Nullable String networkId;
    /**
     * @return Opennebula network to connect the machine to. Conflicts with `network_id` (string)
     * 
     */
    private @Nullable String networkName;
    /**
     * @return Opennebula user ID of the Network to connect the machine to (string)
     * 
     */
    private @Nullable String networkOwner;
    /**
     * @return vSphere password. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    private String password;
    /**
     * @return If using a non-B2D image you can specify the ssh user. Default `docker`. From Rancher v2.3.3 (string)
     * 
     */
    private @Nullable String sshUser;
    /**
     * @return Opennebula template ID to use. Conflicts with `template_name` (string)
     * 
     */
    private @Nullable String templateId;
    /**
     * @return Name of the Opennbula template to use. Conflicts with `template_id` (string)
     * 
     */
    private @Nullable String templateName;
    /**
     * @return Set the user for the XML-RPC API authentication (string)
     * 
     */
    private String user;
    /**
     * @return VCPUs for the VM (string)
     * 
     * &gt; **Note:**: `Required*` denotes that one of image_name / image_id or template_name / template_id is required but you cannot combine them.
     * 
     */
    private @Nullable String vcpu;
    /**
     * @return Set the url for the Opennebula XML-RPC API (string)
     * 
     */
    private String xmlRpcUrl;

    private NodeTemplateOpennebulaConfig() {}
    /**
     * @return Size of the Volatile disk in MB - only for b2d (string)
     * 
     */
    public Optional<String> b2dSize() {
        return Optional.ofNullable(this.b2dSize);
    }
    /**
     * @return CPU value for the VM (string)
     * 
     */
    public Optional<String> cpu() {
        return Optional.ofNullable(this.cpu);
    }
    /**
     * @return Dev prefix to use for the images. E.g.: &#39;vd&#39;, &#39;sd&#39;, &#39;hd&#39; (string)
     * 
     */
    public Optional<String> devPrefix() {
        return Optional.ofNullable(this.devPrefix);
    }
    /**
     * @return VNC is enabled by default. Disable it with this flag (bool)
     * 
     */
    public Optional<Boolean> disableVnc() {
        return Optional.ofNullable(this.disableVnc);
    }
    /**
     * @return Size of the disk for the VM in MB (string)
     * 
     */
    public Optional<String> diskResize() {
        return Optional.ofNullable(this.diskResize);
    }
    /**
     * @return OpenStack image id to use for the instance. Conflicts with `image_name` (string)
     * 
     */
    public Optional<String> imageId() {
        return Optional.ofNullable(this.imageId);
    }
    /**
     * @return OpenStack image name to use for the instance. Conflicts with `image_id` (string)
     * 
     */
    public Optional<String> imageName() {
        return Optional.ofNullable(this.imageName);
    }
    /**
     * @return Owner of the image to use as the VM OS (string)
     * 
     */
    public Optional<String> imageOwner() {
        return Optional.ofNullable(this.imageOwner);
    }
    /**
     * @return Size of the memory for the VM in MB (string)
     * 
     */
    public Optional<String> memory() {
        return Optional.ofNullable(this.memory);
    }
    /**
     * @return Opennebula network ID to connect the machine to. Conflicts with `network_name` (string)
     * 
     */
    public Optional<String> networkId() {
        return Optional.ofNullable(this.networkId);
    }
    /**
     * @return Opennebula network to connect the machine to. Conflicts with `network_id` (string)
     * 
     */
    public Optional<String> networkName() {
        return Optional.ofNullable(this.networkName);
    }
    /**
     * @return Opennebula user ID of the Network to connect the machine to (string)
     * 
     */
    public Optional<String> networkOwner() {
        return Optional.ofNullable(this.networkOwner);
    }
    /**
     * @return vSphere password. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return If using a non-B2D image you can specify the ssh user. Default `docker`. From Rancher v2.3.3 (string)
     * 
     */
    public Optional<String> sshUser() {
        return Optional.ofNullable(this.sshUser);
    }
    /**
     * @return Opennebula template ID to use. Conflicts with `template_name` (string)
     * 
     */
    public Optional<String> templateId() {
        return Optional.ofNullable(this.templateId);
    }
    /**
     * @return Name of the Opennbula template to use. Conflicts with `template_id` (string)
     * 
     */
    public Optional<String> templateName() {
        return Optional.ofNullable(this.templateName);
    }
    /**
     * @return Set the user for the XML-RPC API authentication (string)
     * 
     */
    public String user() {
        return this.user;
    }
    /**
     * @return VCPUs for the VM (string)
     * 
     * &gt; **Note:**: `Required*` denotes that one of image_name / image_id or template_name / template_id is required but you cannot combine them.
     * 
     */
    public Optional<String> vcpu() {
        return Optional.ofNullable(this.vcpu);
    }
    /**
     * @return Set the url for the Opennebula XML-RPC API (string)
     * 
     */
    public String xmlRpcUrl() {
        return this.xmlRpcUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTemplateOpennebulaConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String b2dSize;
        private @Nullable String cpu;
        private @Nullable String devPrefix;
        private @Nullable Boolean disableVnc;
        private @Nullable String diskResize;
        private @Nullable String imageId;
        private @Nullable String imageName;
        private @Nullable String imageOwner;
        private @Nullable String memory;
        private @Nullable String networkId;
        private @Nullable String networkName;
        private @Nullable String networkOwner;
        private String password;
        private @Nullable String sshUser;
        private @Nullable String templateId;
        private @Nullable String templateName;
        private String user;
        private @Nullable String vcpu;
        private String xmlRpcUrl;
        public Builder() {}
        public Builder(NodeTemplateOpennebulaConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.b2dSize = defaults.b2dSize;
    	      this.cpu = defaults.cpu;
    	      this.devPrefix = defaults.devPrefix;
    	      this.disableVnc = defaults.disableVnc;
    	      this.diskResize = defaults.diskResize;
    	      this.imageId = defaults.imageId;
    	      this.imageName = defaults.imageName;
    	      this.imageOwner = defaults.imageOwner;
    	      this.memory = defaults.memory;
    	      this.networkId = defaults.networkId;
    	      this.networkName = defaults.networkName;
    	      this.networkOwner = defaults.networkOwner;
    	      this.password = defaults.password;
    	      this.sshUser = defaults.sshUser;
    	      this.templateId = defaults.templateId;
    	      this.templateName = defaults.templateName;
    	      this.user = defaults.user;
    	      this.vcpu = defaults.vcpu;
    	      this.xmlRpcUrl = defaults.xmlRpcUrl;
        }

        @CustomType.Setter
        public Builder b2dSize(@Nullable String b2dSize) {

            this.b2dSize = b2dSize;
            return this;
        }
        @CustomType.Setter
        public Builder cpu(@Nullable String cpu) {

            this.cpu = cpu;
            return this;
        }
        @CustomType.Setter
        public Builder devPrefix(@Nullable String devPrefix) {

            this.devPrefix = devPrefix;
            return this;
        }
        @CustomType.Setter
        public Builder disableVnc(@Nullable Boolean disableVnc) {

            this.disableVnc = disableVnc;
            return this;
        }
        @CustomType.Setter
        public Builder diskResize(@Nullable String diskResize) {

            this.diskResize = diskResize;
            return this;
        }
        @CustomType.Setter
        public Builder imageId(@Nullable String imageId) {

            this.imageId = imageId;
            return this;
        }
        @CustomType.Setter
        public Builder imageName(@Nullable String imageName) {

            this.imageName = imageName;
            return this;
        }
        @CustomType.Setter
        public Builder imageOwner(@Nullable String imageOwner) {

            this.imageOwner = imageOwner;
            return this;
        }
        @CustomType.Setter
        public Builder memory(@Nullable String memory) {

            this.memory = memory;
            return this;
        }
        @CustomType.Setter
        public Builder networkId(@Nullable String networkId) {

            this.networkId = networkId;
            return this;
        }
        @CustomType.Setter
        public Builder networkName(@Nullable String networkName) {

            this.networkName = networkName;
            return this;
        }
        @CustomType.Setter
        public Builder networkOwner(@Nullable String networkOwner) {

            this.networkOwner = networkOwner;
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            if (password == null) {
              throw new MissingRequiredPropertyException("NodeTemplateOpennebulaConfig", "password");
            }
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder sshUser(@Nullable String sshUser) {

            this.sshUser = sshUser;
            return this;
        }
        @CustomType.Setter
        public Builder templateId(@Nullable String templateId) {

            this.templateId = templateId;
            return this;
        }
        @CustomType.Setter
        public Builder templateName(@Nullable String templateName) {

            this.templateName = templateName;
            return this;
        }
        @CustomType.Setter
        public Builder user(String user) {
            if (user == null) {
              throw new MissingRequiredPropertyException("NodeTemplateOpennebulaConfig", "user");
            }
            this.user = user;
            return this;
        }
        @CustomType.Setter
        public Builder vcpu(@Nullable String vcpu) {

            this.vcpu = vcpu;
            return this;
        }
        @CustomType.Setter
        public Builder xmlRpcUrl(String xmlRpcUrl) {
            if (xmlRpcUrl == null) {
              throw new MissingRequiredPropertyException("NodeTemplateOpennebulaConfig", "xmlRpcUrl");
            }
            this.xmlRpcUrl = xmlRpcUrl;
            return this;
        }
        public NodeTemplateOpennebulaConfig build() {
            final var _resultValue = new NodeTemplateOpennebulaConfig();
            _resultValue.b2dSize = b2dSize;
            _resultValue.cpu = cpu;
            _resultValue.devPrefix = devPrefix;
            _resultValue.disableVnc = disableVnc;
            _resultValue.diskResize = diskResize;
            _resultValue.imageId = imageId;
            _resultValue.imageName = imageName;
            _resultValue.imageOwner = imageOwner;
            _resultValue.memory = memory;
            _resultValue.networkId = networkId;
            _resultValue.networkName = networkName;
            _resultValue.networkOwner = networkOwner;
            _resultValue.password = password;
            _resultValue.sshUser = sshUser;
            _resultValue.templateId = templateId;
            _resultValue.templateName = templateName;
            _resultValue.user = user;
            _resultValue.vcpu = vcpu;
            _resultValue.xmlRpcUrl = xmlRpcUrl;
            return _resultValue;
        }
    }
}
