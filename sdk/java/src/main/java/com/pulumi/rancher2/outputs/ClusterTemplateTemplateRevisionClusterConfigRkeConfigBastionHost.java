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
public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHost {
    private String address;
    private @Nullable String port;
    private @Nullable Boolean sshAgentAuth;
    private @Nullable String sshKey;
    private @Nullable String sshKeyPath;
    private String user;

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHost() {}
    public String address() {
        return this.address;
    }
    public Optional<String> port() {
        return Optional.ofNullable(this.port);
    }
    public Optional<Boolean> sshAgentAuth() {
        return Optional.ofNullable(this.sshAgentAuth);
    }
    public Optional<String> sshKey() {
        return Optional.ofNullable(this.sshKey);
    }
    public Optional<String> sshKeyPath() {
        return Optional.ofNullable(this.sshKeyPath);
    }
    public String user() {
        return this.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHost defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private @Nullable String port;
        private @Nullable Boolean sshAgentAuth;
        private @Nullable String sshKey;
        private @Nullable String sshKeyPath;
        private String user;
        public Builder() {}
        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHost defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.port = defaults.port;
    	      this.sshAgentAuth = defaults.sshAgentAuth;
    	      this.sshKey = defaults.sshKey;
    	      this.sshKeyPath = defaults.sshKeyPath;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("ClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHost", "address");
            }
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable String port) {

            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder sshAgentAuth(@Nullable Boolean sshAgentAuth) {

            this.sshAgentAuth = sshAgentAuth;
            return this;
        }
        @CustomType.Setter
        public Builder sshKey(@Nullable String sshKey) {

            this.sshKey = sshKey;
            return this;
        }
        @CustomType.Setter
        public Builder sshKeyPath(@Nullable String sshKeyPath) {

            this.sshKeyPath = sshKeyPath;
            return this;
        }
        @CustomType.Setter
        public Builder user(String user) {
            if (user == null) {
              throw new MissingRequiredPropertyException("ClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHost", "user");
            }
            this.user = user;
            return this;
        }
        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHost build() {
            final var _resultValue = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHost();
            _resultValue.address = address;
            _resultValue.port = port;
            _resultValue.sshAgentAuth = sshAgentAuth;
            _resultValue.sshKey = sshKey;
            _resultValue.sshKeyPath = sshKeyPath;
            _resultValue.user = user;
            return _resultValue;
        }
    }
}
