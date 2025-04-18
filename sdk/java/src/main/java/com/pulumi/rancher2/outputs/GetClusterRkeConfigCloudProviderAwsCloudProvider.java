// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.outputs.GetClusterRkeConfigCloudProviderAwsCloudProviderGlobal;
import com.pulumi.rancher2.outputs.GetClusterRkeConfigCloudProviderAwsCloudProviderServiceOverride;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterRkeConfigCloudProviderAwsCloudProvider {
    private GetClusterRkeConfigCloudProviderAwsCloudProviderGlobal global;
    private @Nullable List<GetClusterRkeConfigCloudProviderAwsCloudProviderServiceOverride> serviceOverrides;

    private GetClusterRkeConfigCloudProviderAwsCloudProvider() {}
    public GetClusterRkeConfigCloudProviderAwsCloudProviderGlobal global() {
        return this.global;
    }
    public List<GetClusterRkeConfigCloudProviderAwsCloudProviderServiceOverride> serviceOverrides() {
        return this.serviceOverrides == null ? List.of() : this.serviceOverrides;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterRkeConfigCloudProviderAwsCloudProvider defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetClusterRkeConfigCloudProviderAwsCloudProviderGlobal global;
        private @Nullable List<GetClusterRkeConfigCloudProviderAwsCloudProviderServiceOverride> serviceOverrides;
        public Builder() {}
        public Builder(GetClusterRkeConfigCloudProviderAwsCloudProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.global = defaults.global;
    	      this.serviceOverrides = defaults.serviceOverrides;
        }

        @CustomType.Setter
        public Builder global(GetClusterRkeConfigCloudProviderAwsCloudProviderGlobal global) {
            if (global == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAwsCloudProvider", "global");
            }
            this.global = global;
            return this;
        }
        @CustomType.Setter
        public Builder serviceOverrides(@Nullable List<GetClusterRkeConfigCloudProviderAwsCloudProviderServiceOverride> serviceOverrides) {

            this.serviceOverrides = serviceOverrides;
            return this;
        }
        public Builder serviceOverrides(GetClusterRkeConfigCloudProviderAwsCloudProviderServiceOverride... serviceOverrides) {
            return serviceOverrides(List.of(serviceOverrides));
        }
        public GetClusterRkeConfigCloudProviderAwsCloudProvider build() {
            final var _resultValue = new GetClusterRkeConfigCloudProviderAwsCloudProvider();
            _resultValue.global = global;
            _resultValue.serviceOverrides = serviceOverrides;
            return _resultValue;
        }
    }
}
