// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHostArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHostArgs Empty = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHostArgs();

    @Import(name="address", required=true)
    private Output<String> address;

    public Output<String> address() {
        return this.address;
    }

    @Import(name="port")
    private @Nullable Output<String> port;

    public Optional<Output<String>> port() {
        return Optional.ofNullable(this.port);
    }

    @Import(name="sshAgentAuth")
    private @Nullable Output<Boolean> sshAgentAuth;

    public Optional<Output<Boolean>> sshAgentAuth() {
        return Optional.ofNullable(this.sshAgentAuth);
    }

    @Import(name="sshKey")
    private @Nullable Output<String> sshKey;

    public Optional<Output<String>> sshKey() {
        return Optional.ofNullable(this.sshKey);
    }

    @Import(name="sshKeyPath")
    private @Nullable Output<String> sshKeyPath;

    public Optional<Output<String>> sshKeyPath() {
        return Optional.ofNullable(this.sshKeyPath);
    }

    @Import(name="user", required=true)
    private Output<String> user;

    public Output<String> user() {
        return this.user;
    }

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHostArgs() {}

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHostArgs(ClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHostArgs $) {
        this.address = $.address;
        this.port = $.port;
        this.sshAgentAuth = $.sshAgentAuth;
        this.sshKey = $.sshKey;
        this.sshKeyPath = $.sshKeyPath;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHostArgs $;

        public Builder() {
            $ = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHostArgs();
        }

        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHostArgs defaults) {
            $ = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHostArgs(Objects.requireNonNull(defaults));
        }

        public Builder address(Output<String> address) {
            $.address = address;
            return this;
        }

        public Builder address(String address) {
            return address(Output.of(address));
        }

        public Builder port(@Nullable Output<String> port) {
            $.port = port;
            return this;
        }

        public Builder port(String port) {
            return port(Output.of(port));
        }

        public Builder sshAgentAuth(@Nullable Output<Boolean> sshAgentAuth) {
            $.sshAgentAuth = sshAgentAuth;
            return this;
        }

        public Builder sshAgentAuth(Boolean sshAgentAuth) {
            return sshAgentAuth(Output.of(sshAgentAuth));
        }

        public Builder sshKey(@Nullable Output<String> sshKey) {
            $.sshKey = sshKey;
            return this;
        }

        public Builder sshKey(String sshKey) {
            return sshKey(Output.of(sshKey));
        }

        public Builder sshKeyPath(@Nullable Output<String> sshKeyPath) {
            $.sshKeyPath = sshKeyPath;
            return this;
        }

        public Builder sshKeyPath(String sshKeyPath) {
            return sshKeyPath(Output.of(sshKeyPath));
        }

        public Builder user(Output<String> user) {
            $.user = user;
            return this;
        }

        public Builder user(String user) {
            return user(Output.of(user));
        }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHostArgs build() {
            if ($.address == null) {
                throw new MissingRequiredPropertyException("ClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHostArgs", "address");
            }
            if ($.user == null) {
                throw new MissingRequiredPropertyException("ClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHostArgs", "user");
            }
            return $;
        }
    }

}
