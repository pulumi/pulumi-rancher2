// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRkeConfigCloudProviderVsphereCloudProviderNetwork {
    /**
     * @return (string)
     * 
     */
    private final @Nullable String publicNetwork;

    @CustomType.Constructor
    private ClusterRkeConfigCloudProviderVsphereCloudProviderNetwork(@CustomType.Parameter("publicNetwork") @Nullable String publicNetwork) {
        this.publicNetwork = publicNetwork;
    }

    /**
     * @return (string)
     * 
     */
    public Optional<String> publicNetwork() {
        return Optional.ofNullable(this.publicNetwork);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigCloudProviderVsphereCloudProviderNetwork defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String publicNetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterRkeConfigCloudProviderVsphereCloudProviderNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicNetwork = defaults.publicNetwork;
        }

        public Builder publicNetwork(@Nullable String publicNetwork) {
            this.publicNetwork = publicNetwork;
            return this;
        }        public ClusterRkeConfigCloudProviderVsphereCloudProviderNetwork build() {
            return new ClusterRkeConfigCloudProviderVsphereCloudProviderNetwork(publicNetwork);
        }
    }
}