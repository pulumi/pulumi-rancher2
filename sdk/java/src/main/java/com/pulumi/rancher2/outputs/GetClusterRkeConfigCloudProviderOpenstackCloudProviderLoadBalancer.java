// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterRkeConfigCloudProviderOpenstackCloudProviderLoadBalancer {
    private final Boolean createMonitor;
    private final String floatingNetworkId;
    private final String lbMethod;
    private final String lbProvider;
    private final String lbVersion;
    private final Boolean manageSecurityGroups;
    private final @Nullable String monitorDelay;
    private final @Nullable Integer monitorMaxRetries;
    private final @Nullable String monitorTimeout;
    private final String subnetId;
    private final Boolean useOctavia;

    @CustomType.Constructor
    private GetClusterRkeConfigCloudProviderOpenstackCloudProviderLoadBalancer(
        @CustomType.Parameter("createMonitor") Boolean createMonitor,
        @CustomType.Parameter("floatingNetworkId") String floatingNetworkId,
        @CustomType.Parameter("lbMethod") String lbMethod,
        @CustomType.Parameter("lbProvider") String lbProvider,
        @CustomType.Parameter("lbVersion") String lbVersion,
        @CustomType.Parameter("manageSecurityGroups") Boolean manageSecurityGroups,
        @CustomType.Parameter("monitorDelay") @Nullable String monitorDelay,
        @CustomType.Parameter("monitorMaxRetries") @Nullable Integer monitorMaxRetries,
        @CustomType.Parameter("monitorTimeout") @Nullable String monitorTimeout,
        @CustomType.Parameter("subnetId") String subnetId,
        @CustomType.Parameter("useOctavia") Boolean useOctavia) {
        this.createMonitor = createMonitor;
        this.floatingNetworkId = floatingNetworkId;
        this.lbMethod = lbMethod;
        this.lbProvider = lbProvider;
        this.lbVersion = lbVersion;
        this.manageSecurityGroups = manageSecurityGroups;
        this.monitorDelay = monitorDelay;
        this.monitorMaxRetries = monitorMaxRetries;
        this.monitorTimeout = monitorTimeout;
        this.subnetId = subnetId;
        this.useOctavia = useOctavia;
    }

    public Boolean createMonitor() {
        return this.createMonitor;
    }
    public String floatingNetworkId() {
        return this.floatingNetworkId;
    }
    public String lbMethod() {
        return this.lbMethod;
    }
    public String lbProvider() {
        return this.lbProvider;
    }
    public String lbVersion() {
        return this.lbVersion;
    }
    public Boolean manageSecurityGroups() {
        return this.manageSecurityGroups;
    }
    public Optional<String> monitorDelay() {
        return Optional.ofNullable(this.monitorDelay);
    }
    public Optional<Integer> monitorMaxRetries() {
        return Optional.ofNullable(this.monitorMaxRetries);
    }
    public Optional<String> monitorTimeout() {
        return Optional.ofNullable(this.monitorTimeout);
    }
    public String subnetId() {
        return this.subnetId;
    }
    public Boolean useOctavia() {
        return this.useOctavia;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterRkeConfigCloudProviderOpenstackCloudProviderLoadBalancer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean createMonitor;
        private String floatingNetworkId;
        private String lbMethod;
        private String lbProvider;
        private String lbVersion;
        private Boolean manageSecurityGroups;
        private @Nullable String monitorDelay;
        private @Nullable Integer monitorMaxRetries;
        private @Nullable String monitorTimeout;
        private String subnetId;
        private Boolean useOctavia;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterRkeConfigCloudProviderOpenstackCloudProviderLoadBalancer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createMonitor = defaults.createMonitor;
    	      this.floatingNetworkId = defaults.floatingNetworkId;
    	      this.lbMethod = defaults.lbMethod;
    	      this.lbProvider = defaults.lbProvider;
    	      this.lbVersion = defaults.lbVersion;
    	      this.manageSecurityGroups = defaults.manageSecurityGroups;
    	      this.monitorDelay = defaults.monitorDelay;
    	      this.monitorMaxRetries = defaults.monitorMaxRetries;
    	      this.monitorTimeout = defaults.monitorTimeout;
    	      this.subnetId = defaults.subnetId;
    	      this.useOctavia = defaults.useOctavia;
        }

        public Builder createMonitor(Boolean createMonitor) {
            this.createMonitor = Objects.requireNonNull(createMonitor);
            return this;
        }
        public Builder floatingNetworkId(String floatingNetworkId) {
            this.floatingNetworkId = Objects.requireNonNull(floatingNetworkId);
            return this;
        }
        public Builder lbMethod(String lbMethod) {
            this.lbMethod = Objects.requireNonNull(lbMethod);
            return this;
        }
        public Builder lbProvider(String lbProvider) {
            this.lbProvider = Objects.requireNonNull(lbProvider);
            return this;
        }
        public Builder lbVersion(String lbVersion) {
            this.lbVersion = Objects.requireNonNull(lbVersion);
            return this;
        }
        public Builder manageSecurityGroups(Boolean manageSecurityGroups) {
            this.manageSecurityGroups = Objects.requireNonNull(manageSecurityGroups);
            return this;
        }
        public Builder monitorDelay(@Nullable String monitorDelay) {
            this.monitorDelay = monitorDelay;
            return this;
        }
        public Builder monitorMaxRetries(@Nullable Integer monitorMaxRetries) {
            this.monitorMaxRetries = monitorMaxRetries;
            return this;
        }
        public Builder monitorTimeout(@Nullable String monitorTimeout) {
            this.monitorTimeout = monitorTimeout;
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public Builder useOctavia(Boolean useOctavia) {
            this.useOctavia = Objects.requireNonNull(useOctavia);
            return this;
        }        public GetClusterRkeConfigCloudProviderOpenstackCloudProviderLoadBalancer build() {
            return new GetClusterRkeConfigCloudProviderOpenstackCloudProviderLoadBalancer(createMonitor, floatingNetworkId, lbMethod, lbProvider, lbVersion, manageSecurityGroups, monitorDelay, monitorMaxRetries, monitorTimeout, subnetId, useOctavia);
        }
    }
}