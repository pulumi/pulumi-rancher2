// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterRkeConfigNetworkFlannelNetworkProvider {
    private final String iface;

    @CustomType.Constructor
    private GetClusterRkeConfigNetworkFlannelNetworkProvider(@CustomType.Parameter("iface") String iface) {
        this.iface = iface;
    }

    public String iface() {
        return this.iface;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterRkeConfigNetworkFlannelNetworkProvider defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String iface;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterRkeConfigNetworkFlannelNetworkProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iface = defaults.iface;
        }

        public Builder iface(String iface) {
            this.iface = Objects.requireNonNull(iface);
            return this;
        }        public GetClusterRkeConfigNetworkFlannelNetworkProvider build() {
            return new GetClusterRkeConfigNetworkFlannelNetworkProvider(iface);
        }
    }
}