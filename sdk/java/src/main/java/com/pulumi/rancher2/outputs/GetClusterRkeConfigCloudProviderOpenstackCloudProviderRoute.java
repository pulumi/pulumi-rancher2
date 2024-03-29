// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterRkeConfigCloudProviderOpenstackCloudProviderRoute {
    private String routerId;

    private GetClusterRkeConfigCloudProviderOpenstackCloudProviderRoute() {}
    public String routerId() {
        return this.routerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterRkeConfigCloudProviderOpenstackCloudProviderRoute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String routerId;
        public Builder() {}
        public Builder(GetClusterRkeConfigCloudProviderOpenstackCloudProviderRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.routerId = defaults.routerId;
        }

        @CustomType.Setter
        public Builder routerId(String routerId) {
            if (routerId == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderOpenstackCloudProviderRoute", "routerId");
            }
            this.routerId = routerId;
            return this;
        }
        public GetClusterRkeConfigCloudProviderOpenstackCloudProviderRoute build() {
            final var _resultValue = new GetClusterRkeConfigCloudProviderOpenstackCloudProviderRoute();
            _resultValue.routerId = routerId;
            return _resultValue;
        }
    }
}
