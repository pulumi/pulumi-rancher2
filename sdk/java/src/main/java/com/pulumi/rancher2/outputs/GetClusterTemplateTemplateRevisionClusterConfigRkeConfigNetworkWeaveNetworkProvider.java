// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkWeaveNetworkProvider {
    private final String password;

    @CustomType.Constructor
    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkWeaveNetworkProvider(@CustomType.Parameter("password") String password) {
        this.password = password;
    }

    public String password() {
        return this.password;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkWeaveNetworkProvider defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String password;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkWeaveNetworkProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
        }

        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }        public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkWeaveNetworkProvider build() {
            return new GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkWeaveNetworkProvider(password);
        }
    }
}