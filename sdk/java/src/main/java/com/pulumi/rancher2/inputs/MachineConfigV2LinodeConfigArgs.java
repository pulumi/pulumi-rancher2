// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MachineConfigV2LinodeConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final MachineConfigV2LinodeConfigArgs Empty = new MachineConfigV2LinodeConfigArgs();

    /**
     * Linode user accounts (seperated by commas) whose Linode SSH keys will be permitted root access to the created node
     * 
     */
    @Import(name="authorizedUsers")
    private @Nullable Output<String> authorizedUsers;

    /**
     * @return Linode user accounts (seperated by commas) whose Linode SSH keys will be permitted root access to the created node
     * 
     */
    public Optional<Output<String>> authorizedUsers() {
        return Optional.ofNullable(this.authorizedUsers);
    }

    /**
     * Create private IP for the instance
     * 
     */
    @Import(name="createPrivateIp")
    private @Nullable Output<Boolean> createPrivateIp;

    /**
     * @return Create private IP for the instance
     * 
     */
    public Optional<Output<Boolean>> createPrivateIp() {
        return Optional.ofNullable(this.createPrivateIp);
    }

    /**
     * Docker Port
     * 
     */
    @Import(name="dockerPort")
    private @Nullable Output<String> dockerPort;

    /**
     * @return Docker Port
     * 
     */
    public Optional<Output<String>> dockerPort() {
        return Optional.ofNullable(this.dockerPort);
    }

    /**
     * Specifies the Linode Instance image which determines the OS distribution and base files
     * 
     */
    @Import(name="image")
    private @Nullable Output<String> image;

    /**
     * @return Specifies the Linode Instance image which determines the OS distribution and base files
     * 
     */
    public Optional<Output<String>> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * Specifies the Linode Instance type which determines CPU, memory, disk size, etc.
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    /**
     * @return Specifies the Linode Instance type which determines CPU, memory, disk size, etc.
     * 
     */
    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * Linode Instance Label
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return Linode Instance Label
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * Specifies the region (location) of the Linode instance
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Specifies the region (location) of the Linode instance
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Root Password
     * 
     */
    @Import(name="rootPass")
    private @Nullable Output<String> rootPass;

    /**
     * @return Root Password
     * 
     */
    public Optional<Output<String>> rootPass() {
        return Optional.ofNullable(this.rootPass);
    }

    /**
     * Linode Instance SSH Port
     * 
     */
    @Import(name="sshPort")
    private @Nullable Output<String> sshPort;

    /**
     * @return Linode Instance SSH Port
     * 
     */
    public Optional<Output<String>> sshPort() {
        return Optional.ofNullable(this.sshPort);
    }

    /**
     * Specifies the user as which docker-machine should log in to the Linode instance to install Docker.
     * 
     */
    @Import(name="sshUser")
    private @Nullable Output<String> sshUser;

    /**
     * @return Specifies the user as which docker-machine should log in to the Linode instance to install Docker.
     * 
     */
    public Optional<Output<String>> sshUser() {
        return Optional.ofNullable(this.sshUser);
    }

    /**
     * Specifies the Linode StackScript to use to create the instance
     * 
     */
    @Import(name="stackscript")
    private @Nullable Output<String> stackscript;

    /**
     * @return Specifies the Linode StackScript to use to create the instance
     * 
     */
    public Optional<Output<String>> stackscript() {
        return Optional.ofNullable(this.stackscript);
    }

    /**
     * A JSON string specifying data for the selected StackScript
     * 
     */
    @Import(name="stackscriptData")
    private @Nullable Output<String> stackscriptData;

    /**
     * @return A JSON string specifying data for the selected StackScript
     * 
     */
    public Optional<Output<String>> stackscriptData() {
        return Optional.ofNullable(this.stackscriptData);
    }

    /**
     * Linode Instance Swap Size (MB)
     * 
     */
    @Import(name="swapSize")
    private @Nullable Output<String> swapSize;

    /**
     * @return Linode Instance Swap Size (MB)
     * 
     */
    public Optional<Output<String>> swapSize() {
        return Optional.ofNullable(this.swapSize);
    }

    /**
     * A comma separated list of tags to apply to the the Linode resource
     * 
     */
    @Import(name="tags")
    private @Nullable Output<String> tags;

    /**
     * @return A comma separated list of tags to apply to the the Linode resource
     * 
     */
    public Optional<Output<String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Linode API Token
     * 
     */
    @Import(name="token")
    private @Nullable Output<String> token;

    /**
     * @return Linode API Token
     * 
     */
    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    /**
     * Prefix the User-Agent in Linode API calls with some &#39;product/version&#39;
     * 
     */
    @Import(name="uaPrefix")
    private @Nullable Output<String> uaPrefix;

    /**
     * @return Prefix the User-Agent in Linode API calls with some &#39;product/version&#39;
     * 
     */
    public Optional<Output<String>> uaPrefix() {
        return Optional.ofNullable(this.uaPrefix);
    }

    private MachineConfigV2LinodeConfigArgs() {}

    private MachineConfigV2LinodeConfigArgs(MachineConfigV2LinodeConfigArgs $) {
        this.authorizedUsers = $.authorizedUsers;
        this.createPrivateIp = $.createPrivateIp;
        this.dockerPort = $.dockerPort;
        this.image = $.image;
        this.instanceType = $.instanceType;
        this.label = $.label;
        this.region = $.region;
        this.rootPass = $.rootPass;
        this.sshPort = $.sshPort;
        this.sshUser = $.sshUser;
        this.stackscript = $.stackscript;
        this.stackscriptData = $.stackscriptData;
        this.swapSize = $.swapSize;
        this.tags = $.tags;
        this.token = $.token;
        this.uaPrefix = $.uaPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MachineConfigV2LinodeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MachineConfigV2LinodeConfigArgs $;

        public Builder() {
            $ = new MachineConfigV2LinodeConfigArgs();
        }

        public Builder(MachineConfigV2LinodeConfigArgs defaults) {
            $ = new MachineConfigV2LinodeConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorizedUsers Linode user accounts (seperated by commas) whose Linode SSH keys will be permitted root access to the created node
         * 
         * @return builder
         * 
         */
        public Builder authorizedUsers(@Nullable Output<String> authorizedUsers) {
            $.authorizedUsers = authorizedUsers;
            return this;
        }

        /**
         * @param authorizedUsers Linode user accounts (seperated by commas) whose Linode SSH keys will be permitted root access to the created node
         * 
         * @return builder
         * 
         */
        public Builder authorizedUsers(String authorizedUsers) {
            return authorizedUsers(Output.of(authorizedUsers));
        }

        /**
         * @param createPrivateIp Create private IP for the instance
         * 
         * @return builder
         * 
         */
        public Builder createPrivateIp(@Nullable Output<Boolean> createPrivateIp) {
            $.createPrivateIp = createPrivateIp;
            return this;
        }

        /**
         * @param createPrivateIp Create private IP for the instance
         * 
         * @return builder
         * 
         */
        public Builder createPrivateIp(Boolean createPrivateIp) {
            return createPrivateIp(Output.of(createPrivateIp));
        }

        /**
         * @param dockerPort Docker Port
         * 
         * @return builder
         * 
         */
        public Builder dockerPort(@Nullable Output<String> dockerPort) {
            $.dockerPort = dockerPort;
            return this;
        }

        /**
         * @param dockerPort Docker Port
         * 
         * @return builder
         * 
         */
        public Builder dockerPort(String dockerPort) {
            return dockerPort(Output.of(dockerPort));
        }

        /**
         * @param image Specifies the Linode Instance image which determines the OS distribution and base files
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image Specifies the Linode Instance image which determines the OS distribution and base files
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
        }

        /**
         * @param instanceType Specifies the Linode Instance type which determines CPU, memory, disk size, etc.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType Specifies the Linode Instance type which determines CPU, memory, disk size, etc.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param label Linode Instance Label
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label Linode Instance Label
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param region Specifies the region (location) of the Linode instance
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Specifies the region (location) of the Linode instance
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param rootPass Root Password
         * 
         * @return builder
         * 
         */
        public Builder rootPass(@Nullable Output<String> rootPass) {
            $.rootPass = rootPass;
            return this;
        }

        /**
         * @param rootPass Root Password
         * 
         * @return builder
         * 
         */
        public Builder rootPass(String rootPass) {
            return rootPass(Output.of(rootPass));
        }

        /**
         * @param sshPort Linode Instance SSH Port
         * 
         * @return builder
         * 
         */
        public Builder sshPort(@Nullable Output<String> sshPort) {
            $.sshPort = sshPort;
            return this;
        }

        /**
         * @param sshPort Linode Instance SSH Port
         * 
         * @return builder
         * 
         */
        public Builder sshPort(String sshPort) {
            return sshPort(Output.of(sshPort));
        }

        /**
         * @param sshUser Specifies the user as which docker-machine should log in to the Linode instance to install Docker.
         * 
         * @return builder
         * 
         */
        public Builder sshUser(@Nullable Output<String> sshUser) {
            $.sshUser = sshUser;
            return this;
        }

        /**
         * @param sshUser Specifies the user as which docker-machine should log in to the Linode instance to install Docker.
         * 
         * @return builder
         * 
         */
        public Builder sshUser(String sshUser) {
            return sshUser(Output.of(sshUser));
        }

        /**
         * @param stackscript Specifies the Linode StackScript to use to create the instance
         * 
         * @return builder
         * 
         */
        public Builder stackscript(@Nullable Output<String> stackscript) {
            $.stackscript = stackscript;
            return this;
        }

        /**
         * @param stackscript Specifies the Linode StackScript to use to create the instance
         * 
         * @return builder
         * 
         */
        public Builder stackscript(String stackscript) {
            return stackscript(Output.of(stackscript));
        }

        /**
         * @param stackscriptData A JSON string specifying data for the selected StackScript
         * 
         * @return builder
         * 
         */
        public Builder stackscriptData(@Nullable Output<String> stackscriptData) {
            $.stackscriptData = stackscriptData;
            return this;
        }

        /**
         * @param stackscriptData A JSON string specifying data for the selected StackScript
         * 
         * @return builder
         * 
         */
        public Builder stackscriptData(String stackscriptData) {
            return stackscriptData(Output.of(stackscriptData));
        }

        /**
         * @param swapSize Linode Instance Swap Size (MB)
         * 
         * @return builder
         * 
         */
        public Builder swapSize(@Nullable Output<String> swapSize) {
            $.swapSize = swapSize;
            return this;
        }

        /**
         * @param swapSize Linode Instance Swap Size (MB)
         * 
         * @return builder
         * 
         */
        public Builder swapSize(String swapSize) {
            return swapSize(Output.of(swapSize));
        }

        /**
         * @param tags A comma separated list of tags to apply to the the Linode resource
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<String> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A comma separated list of tags to apply to the the Linode resource
         * 
         * @return builder
         * 
         */
        public Builder tags(String tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param token Linode API Token
         * 
         * @return builder
         * 
         */
        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token Linode API Token
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        /**
         * @param uaPrefix Prefix the User-Agent in Linode API calls with some &#39;product/version&#39;
         * 
         * @return builder
         * 
         */
        public Builder uaPrefix(@Nullable Output<String> uaPrefix) {
            $.uaPrefix = uaPrefix;
            return this;
        }

        /**
         * @param uaPrefix Prefix the User-Agent in Linode API calls with some &#39;product/version&#39;
         * 
         * @return builder
         * 
         */
        public Builder uaPrefix(String uaPrefix) {
            return uaPrefix(Output.of(uaPrefix));
        }

        public MachineConfigV2LinodeConfigArgs build() {
            return $;
        }
    }

}
