// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderMetadata {
    private final @Nullable Integer requestTimeout;
    private final @Nullable String searchOrder;

    @CustomType.Constructor
    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderMetadata(
        @CustomType.Parameter("requestTimeout") @Nullable Integer requestTimeout,
        @CustomType.Parameter("searchOrder") @Nullable String searchOrder) {
        this.requestTimeout = requestTimeout;
        this.searchOrder = searchOrder;
    }

    public Optional<Integer> requestTimeout() {
        return Optional.ofNullable(this.requestTimeout);
    }
    public Optional<String> searchOrder() {
        return Optional.ofNullable(this.searchOrder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderMetadata defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer requestTimeout;
        private @Nullable String searchOrder;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestTimeout = defaults.requestTimeout;
    	      this.searchOrder = defaults.searchOrder;
        }

        public Builder requestTimeout(@Nullable Integer requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }
        public Builder searchOrder(@Nullable String searchOrder) {
            this.searchOrder = searchOrder;
            return this;
        }        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderMetadata build() {
            return new ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderMetadata(requestTimeout, searchOrder);
        }
    }
}