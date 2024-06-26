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


public final class NodeTemplateDigitaloceanConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeTemplateDigitaloceanConfigArgs Empty = new NodeTemplateDigitaloceanConfigArgs();

    /**
     * Digital Ocean access token
     * 
     */
    @Import(name="accessToken")
    private @Nullable Output<String> accessToken;

    /**
     * @return Digital Ocean access token
     * 
     */
    public Optional<Output<String>> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }

    /**
     * Enable backups for droplet
     * 
     */
    @Import(name="backups")
    private @Nullable Output<Boolean> backups;

    /**
     * @return Enable backups for droplet
     * 
     */
    public Optional<Output<Boolean>> backups() {
        return Optional.ofNullable(this.backups);
    }

    /**
     * Digital Ocean Image
     * 
     */
    @Import(name="image")
    private @Nullable Output<String> image;

    /**
     * @return Digital Ocean Image
     * 
     */
    public Optional<Output<String>> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * Enable ipv6 for droplet
     * 
     */
    @Import(name="ipv6")
    private @Nullable Output<Boolean> ipv6;

    /**
     * @return Enable ipv6 for droplet
     * 
     */
    public Optional<Output<Boolean>> ipv6() {
        return Optional.ofNullable(this.ipv6);
    }

    /**
     * Enable monitoring for droplet
     * 
     */
    @Import(name="monitoring")
    private @Nullable Output<Boolean> monitoring;

    /**
     * @return Enable monitoring for droplet
     * 
     */
    public Optional<Output<Boolean>> monitoring() {
        return Optional.ofNullable(this.monitoring);
    }

    /**
     * Enable private networking for droplet
     * 
     */
    @Import(name="privateNetworking")
    private @Nullable Output<Boolean> privateNetworking;

    /**
     * @return Enable private networking for droplet
     * 
     */
    public Optional<Output<Boolean>> privateNetworking() {
        return Optional.ofNullable(this.privateNetworking);
    }

    /**
     * Digital Ocean region
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Digital Ocean region
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Digital Ocean size
     * 
     */
    @Import(name="size")
    private @Nullable Output<String> size;

    /**
     * @return Digital Ocean size
     * 
     */
    public Optional<Output<String>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * SSH key fingerprint
     * 
     */
    @Import(name="sshKeyFingerprint")
    private @Nullable Output<String> sshKeyFingerprint;

    /**
     * @return SSH key fingerprint
     * 
     */
    public Optional<Output<String>> sshKeyFingerprint() {
        return Optional.ofNullable(this.sshKeyFingerprint);
    }

    /**
     * SSH private key path
     * 
     */
    @Import(name="sshKeyPath")
    private @Nullable Output<String> sshKeyPath;

    /**
     * @return SSH private key path
     * 
     */
    public Optional<Output<String>> sshKeyPath() {
        return Optional.ofNullable(this.sshKeyPath);
    }

    /**
     * SSH port
     * 
     */
    @Import(name="sshPort")
    private @Nullable Output<String> sshPort;

    /**
     * @return SSH port
     * 
     */
    public Optional<Output<String>> sshPort() {
        return Optional.ofNullable(this.sshPort);
    }

    /**
     * SSH username
     * 
     */
    @Import(name="sshUser")
    private @Nullable Output<String> sshUser;

    /**
     * @return SSH username
     * 
     */
    public Optional<Output<String>> sshUser() {
        return Optional.ofNullable(this.sshUser);
    }

    /**
     * Comma-separated list of tags to apply to the Droplet
     * 
     */
    @Import(name="tags")
    private @Nullable Output<String> tags;

    /**
     * @return Comma-separated list of tags to apply to the Droplet
     * 
     */
    public Optional<Output<String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Path to file with cloud-init user-data
     * 
     */
    @Import(name="userdata")
    private @Nullable Output<String> userdata;

    /**
     * @return Path to file with cloud-init user-data
     * 
     */
    public Optional<Output<String>> userdata() {
        return Optional.ofNullable(this.userdata);
    }

    private NodeTemplateDigitaloceanConfigArgs() {}

    private NodeTemplateDigitaloceanConfigArgs(NodeTemplateDigitaloceanConfigArgs $) {
        this.accessToken = $.accessToken;
        this.backups = $.backups;
        this.image = $.image;
        this.ipv6 = $.ipv6;
        this.monitoring = $.monitoring;
        this.privateNetworking = $.privateNetworking;
        this.region = $.region;
        this.size = $.size;
        this.sshKeyFingerprint = $.sshKeyFingerprint;
        this.sshKeyPath = $.sshKeyPath;
        this.sshPort = $.sshPort;
        this.sshUser = $.sshUser;
        this.tags = $.tags;
        this.userdata = $.userdata;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeTemplateDigitaloceanConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeTemplateDigitaloceanConfigArgs $;

        public Builder() {
            $ = new NodeTemplateDigitaloceanConfigArgs();
        }

        public Builder(NodeTemplateDigitaloceanConfigArgs defaults) {
            $ = new NodeTemplateDigitaloceanConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessToken Digital Ocean access token
         * 
         * @return builder
         * 
         */
        public Builder accessToken(@Nullable Output<String> accessToken) {
            $.accessToken = accessToken;
            return this;
        }

        /**
         * @param accessToken Digital Ocean access token
         * 
         * @return builder
         * 
         */
        public Builder accessToken(String accessToken) {
            return accessToken(Output.of(accessToken));
        }

        /**
         * @param backups Enable backups for droplet
         * 
         * @return builder
         * 
         */
        public Builder backups(@Nullable Output<Boolean> backups) {
            $.backups = backups;
            return this;
        }

        /**
         * @param backups Enable backups for droplet
         * 
         * @return builder
         * 
         */
        public Builder backups(Boolean backups) {
            return backups(Output.of(backups));
        }

        /**
         * @param image Digital Ocean Image
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image Digital Ocean Image
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
        }

        /**
         * @param ipv6 Enable ipv6 for droplet
         * 
         * @return builder
         * 
         */
        public Builder ipv6(@Nullable Output<Boolean> ipv6) {
            $.ipv6 = ipv6;
            return this;
        }

        /**
         * @param ipv6 Enable ipv6 for droplet
         * 
         * @return builder
         * 
         */
        public Builder ipv6(Boolean ipv6) {
            return ipv6(Output.of(ipv6));
        }

        /**
         * @param monitoring Enable monitoring for droplet
         * 
         * @return builder
         * 
         */
        public Builder monitoring(@Nullable Output<Boolean> monitoring) {
            $.monitoring = monitoring;
            return this;
        }

        /**
         * @param monitoring Enable monitoring for droplet
         * 
         * @return builder
         * 
         */
        public Builder monitoring(Boolean monitoring) {
            return monitoring(Output.of(monitoring));
        }

        /**
         * @param privateNetworking Enable private networking for droplet
         * 
         * @return builder
         * 
         */
        public Builder privateNetworking(@Nullable Output<Boolean> privateNetworking) {
            $.privateNetworking = privateNetworking;
            return this;
        }

        /**
         * @param privateNetworking Enable private networking for droplet
         * 
         * @return builder
         * 
         */
        public Builder privateNetworking(Boolean privateNetworking) {
            return privateNetworking(Output.of(privateNetworking));
        }

        /**
         * @param region Digital Ocean region
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Digital Ocean region
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param size Digital Ocean size
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<String> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size Digital Ocean size
         * 
         * @return builder
         * 
         */
        public Builder size(String size) {
            return size(Output.of(size));
        }

        /**
         * @param sshKeyFingerprint SSH key fingerprint
         * 
         * @return builder
         * 
         */
        public Builder sshKeyFingerprint(@Nullable Output<String> sshKeyFingerprint) {
            $.sshKeyFingerprint = sshKeyFingerprint;
            return this;
        }

        /**
         * @param sshKeyFingerprint SSH key fingerprint
         * 
         * @return builder
         * 
         */
        public Builder sshKeyFingerprint(String sshKeyFingerprint) {
            return sshKeyFingerprint(Output.of(sshKeyFingerprint));
        }

        /**
         * @param sshKeyPath SSH private key path
         * 
         * @return builder
         * 
         */
        public Builder sshKeyPath(@Nullable Output<String> sshKeyPath) {
            $.sshKeyPath = sshKeyPath;
            return this;
        }

        /**
         * @param sshKeyPath SSH private key path
         * 
         * @return builder
         * 
         */
        public Builder sshKeyPath(String sshKeyPath) {
            return sshKeyPath(Output.of(sshKeyPath));
        }

        /**
         * @param sshPort SSH port
         * 
         * @return builder
         * 
         */
        public Builder sshPort(@Nullable Output<String> sshPort) {
            $.sshPort = sshPort;
            return this;
        }

        /**
         * @param sshPort SSH port
         * 
         * @return builder
         * 
         */
        public Builder sshPort(String sshPort) {
            return sshPort(Output.of(sshPort));
        }

        /**
         * @param sshUser SSH username
         * 
         * @return builder
         * 
         */
        public Builder sshUser(@Nullable Output<String> sshUser) {
            $.sshUser = sshUser;
            return this;
        }

        /**
         * @param sshUser SSH username
         * 
         * @return builder
         * 
         */
        public Builder sshUser(String sshUser) {
            return sshUser(Output.of(sshUser));
        }

        /**
         * @param tags Comma-separated list of tags to apply to the Droplet
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<String> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Comma-separated list of tags to apply to the Droplet
         * 
         * @return builder
         * 
         */
        public Builder tags(String tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param userdata Path to file with cloud-init user-data
         * 
         * @return builder
         * 
         */
        public Builder userdata(@Nullable Output<String> userdata) {
            $.userdata = userdata;
            return this;
        }

        /**
         * @param userdata Path to file with cloud-init user-data
         * 
         * @return builder
         * 
         */
        public Builder userdata(String userdata) {
            return userdata(Output.of(userdata));
        }

        public NodeTemplateDigitaloceanConfigArgs build() {
            return $;
        }
    }

}
