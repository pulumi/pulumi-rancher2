// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRkeConfigCloudProviderOpenstackCloudProviderLoadBalancerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRkeConfigCloudProviderOpenstackCloudProviderLoadBalancerArgs Empty = new ClusterRkeConfigCloudProviderOpenstackCloudProviderLoadBalancerArgs();

    /**
     * (bool)
     * 
     */
    @Import(name="createMonitor")
    private @Nullable Output<Boolean> createMonitor;

    /**
     * @return (bool)
     * 
     */
    public Optional<Output<Boolean>> createMonitor() {
        return Optional.ofNullable(this.createMonitor);
    }

    /**
     * (string)
     * 
     */
    @Import(name="floatingNetworkId")
    private @Nullable Output<String> floatingNetworkId;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> floatingNetworkId() {
        return Optional.ofNullable(this.floatingNetworkId);
    }

    /**
     * (string)
     * 
     */
    @Import(name="lbMethod")
    private @Nullable Output<String> lbMethod;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> lbMethod() {
        return Optional.ofNullable(this.lbMethod);
    }

    /**
     * (string)
     * 
     */
    @Import(name="lbProvider")
    private @Nullable Output<String> lbProvider;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> lbProvider() {
        return Optional.ofNullable(this.lbProvider);
    }

    /**
     * (string)
     * 
     */
    @Import(name="lbVersion")
    private @Nullable Output<String> lbVersion;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> lbVersion() {
        return Optional.ofNullable(this.lbVersion);
    }

    /**
     * (bool)
     * 
     */
    @Import(name="manageSecurityGroups")
    private @Nullable Output<Boolean> manageSecurityGroups;

    /**
     * @return (bool)
     * 
     */
    public Optional<Output<Boolean>> manageSecurityGroups() {
        return Optional.ofNullable(this.manageSecurityGroups);
    }

    /**
     * Default `60s` (string)
     * 
     */
    @Import(name="monitorDelay")
    private @Nullable Output<String> monitorDelay;

    /**
     * @return Default `60s` (string)
     * 
     */
    public Optional<Output<String>> monitorDelay() {
        return Optional.ofNullable(this.monitorDelay);
    }

    /**
     * Default 5 (int)
     * 
     */
    @Import(name="monitorMaxRetries")
    private @Nullable Output<Integer> monitorMaxRetries;

    /**
     * @return Default 5 (int)
     * 
     */
    public Optional<Output<Integer>> monitorMaxRetries() {
        return Optional.ofNullable(this.monitorMaxRetries);
    }

    /**
     * Default `30s` (string)
     * 
     */
    @Import(name="monitorTimeout")
    private @Nullable Output<String> monitorTimeout;

    /**
     * @return Default `30s` (string)
     * 
     */
    public Optional<Output<String>> monitorTimeout() {
        return Optional.ofNullable(this.monitorTimeout);
    }

    /**
     * (string)
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * (bool)
     * 
     */
    @Import(name="useOctavia")
    private @Nullable Output<Boolean> useOctavia;

    /**
     * @return (bool)
     * 
     */
    public Optional<Output<Boolean>> useOctavia() {
        return Optional.ofNullable(this.useOctavia);
    }

    private ClusterRkeConfigCloudProviderOpenstackCloudProviderLoadBalancerArgs() {}

    private ClusterRkeConfigCloudProviderOpenstackCloudProviderLoadBalancerArgs(ClusterRkeConfigCloudProviderOpenstackCloudProviderLoadBalancerArgs $) {
        this.createMonitor = $.createMonitor;
        this.floatingNetworkId = $.floatingNetworkId;
        this.lbMethod = $.lbMethod;
        this.lbProvider = $.lbProvider;
        this.lbVersion = $.lbVersion;
        this.manageSecurityGroups = $.manageSecurityGroups;
        this.monitorDelay = $.monitorDelay;
        this.monitorMaxRetries = $.monitorMaxRetries;
        this.monitorTimeout = $.monitorTimeout;
        this.subnetId = $.subnetId;
        this.useOctavia = $.useOctavia;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRkeConfigCloudProviderOpenstackCloudProviderLoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRkeConfigCloudProviderOpenstackCloudProviderLoadBalancerArgs $;

        public Builder() {
            $ = new ClusterRkeConfigCloudProviderOpenstackCloudProviderLoadBalancerArgs();
        }

        public Builder(ClusterRkeConfigCloudProviderOpenstackCloudProviderLoadBalancerArgs defaults) {
            $ = new ClusterRkeConfigCloudProviderOpenstackCloudProviderLoadBalancerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createMonitor (bool)
         * 
         * @return builder
         * 
         */
        public Builder createMonitor(@Nullable Output<Boolean> createMonitor) {
            $.createMonitor = createMonitor;
            return this;
        }

        /**
         * @param createMonitor (bool)
         * 
         * @return builder
         * 
         */
        public Builder createMonitor(Boolean createMonitor) {
            return createMonitor(Output.of(createMonitor));
        }

        /**
         * @param floatingNetworkId (string)
         * 
         * @return builder
         * 
         */
        public Builder floatingNetworkId(@Nullable Output<String> floatingNetworkId) {
            $.floatingNetworkId = floatingNetworkId;
            return this;
        }

        /**
         * @param floatingNetworkId (string)
         * 
         * @return builder
         * 
         */
        public Builder floatingNetworkId(String floatingNetworkId) {
            return floatingNetworkId(Output.of(floatingNetworkId));
        }

        /**
         * @param lbMethod (string)
         * 
         * @return builder
         * 
         */
        public Builder lbMethod(@Nullable Output<String> lbMethod) {
            $.lbMethod = lbMethod;
            return this;
        }

        /**
         * @param lbMethod (string)
         * 
         * @return builder
         * 
         */
        public Builder lbMethod(String lbMethod) {
            return lbMethod(Output.of(lbMethod));
        }

        /**
         * @param lbProvider (string)
         * 
         * @return builder
         * 
         */
        public Builder lbProvider(@Nullable Output<String> lbProvider) {
            $.lbProvider = lbProvider;
            return this;
        }

        /**
         * @param lbProvider (string)
         * 
         * @return builder
         * 
         */
        public Builder lbProvider(String lbProvider) {
            return lbProvider(Output.of(lbProvider));
        }

        /**
         * @param lbVersion (string)
         * 
         * @return builder
         * 
         */
        public Builder lbVersion(@Nullable Output<String> lbVersion) {
            $.lbVersion = lbVersion;
            return this;
        }

        /**
         * @param lbVersion (string)
         * 
         * @return builder
         * 
         */
        public Builder lbVersion(String lbVersion) {
            return lbVersion(Output.of(lbVersion));
        }

        /**
         * @param manageSecurityGroups (bool)
         * 
         * @return builder
         * 
         */
        public Builder manageSecurityGroups(@Nullable Output<Boolean> manageSecurityGroups) {
            $.manageSecurityGroups = manageSecurityGroups;
            return this;
        }

        /**
         * @param manageSecurityGroups (bool)
         * 
         * @return builder
         * 
         */
        public Builder manageSecurityGroups(Boolean manageSecurityGroups) {
            return manageSecurityGroups(Output.of(manageSecurityGroups));
        }

        /**
         * @param monitorDelay Default `60s` (string)
         * 
         * @return builder
         * 
         */
        public Builder monitorDelay(@Nullable Output<String> monitorDelay) {
            $.monitorDelay = monitorDelay;
            return this;
        }

        /**
         * @param monitorDelay Default `60s` (string)
         * 
         * @return builder
         * 
         */
        public Builder monitorDelay(String monitorDelay) {
            return monitorDelay(Output.of(monitorDelay));
        }

        /**
         * @param monitorMaxRetries Default 5 (int)
         * 
         * @return builder
         * 
         */
        public Builder monitorMaxRetries(@Nullable Output<Integer> monitorMaxRetries) {
            $.monitorMaxRetries = monitorMaxRetries;
            return this;
        }

        /**
         * @param monitorMaxRetries Default 5 (int)
         * 
         * @return builder
         * 
         */
        public Builder monitorMaxRetries(Integer monitorMaxRetries) {
            return monitorMaxRetries(Output.of(monitorMaxRetries));
        }

        /**
         * @param monitorTimeout Default `30s` (string)
         * 
         * @return builder
         * 
         */
        public Builder monitorTimeout(@Nullable Output<String> monitorTimeout) {
            $.monitorTimeout = monitorTimeout;
            return this;
        }

        /**
         * @param monitorTimeout Default `30s` (string)
         * 
         * @return builder
         * 
         */
        public Builder monitorTimeout(String monitorTimeout) {
            return monitorTimeout(Output.of(monitorTimeout));
        }

        /**
         * @param subnetId (string)
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId (string)
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param useOctavia (bool)
         * 
         * @return builder
         * 
         */
        public Builder useOctavia(@Nullable Output<Boolean> useOctavia) {
            $.useOctavia = useOctavia;
            return this;
        }

        /**
         * @param useOctavia (bool)
         * 
         * @return builder
         * 
         */
        public Builder useOctavia(Boolean useOctavia) {
            return useOctavia(Output.of(useOctavia));
        }

        public ClusterRkeConfigCloudProviderOpenstackCloudProviderLoadBalancerArgs build() {
            return $;
        }
    }

}
