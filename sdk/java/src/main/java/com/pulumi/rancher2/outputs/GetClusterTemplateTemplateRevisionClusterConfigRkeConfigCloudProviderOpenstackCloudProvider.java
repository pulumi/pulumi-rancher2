// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderBlockStorage;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobal;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderLoadBalancer;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderMetadata;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderRoute;
import java.util.Objects;

@CustomType
public final class GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider {
    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderBlockStorage blockStorage;
    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobal global;
    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderLoadBalancer loadBalancer;
    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderMetadata metadata;
    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderRoute route;

    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider() {}
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderBlockStorage blockStorage() {
        return this.blockStorage;
    }
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobal global() {
        return this.global;
    }
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderLoadBalancer loadBalancer() {
        return this.loadBalancer;
    }
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderMetadata metadata() {
        return this.metadata;
    }
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderRoute route() {
        return this.route;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderBlockStorage blockStorage;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobal global;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderLoadBalancer loadBalancer;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderMetadata metadata;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderRoute route;
        public Builder() {}
        public Builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockStorage = defaults.blockStorage;
    	      this.global = defaults.global;
    	      this.loadBalancer = defaults.loadBalancer;
    	      this.metadata = defaults.metadata;
    	      this.route = defaults.route;
        }

        @CustomType.Setter
        public Builder blockStorage(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderBlockStorage blockStorage) {
            if (blockStorage == null) {
              throw new MissingRequiredPropertyException("GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider", "blockStorage");
            }
            this.blockStorage = blockStorage;
            return this;
        }
        @CustomType.Setter
        public Builder global(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobal global) {
            if (global == null) {
              throw new MissingRequiredPropertyException("GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider", "global");
            }
            this.global = global;
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancer(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderLoadBalancer loadBalancer) {
            if (loadBalancer == null) {
              throw new MissingRequiredPropertyException("GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider", "loadBalancer");
            }
            this.loadBalancer = loadBalancer;
            return this;
        }
        @CustomType.Setter
        public Builder metadata(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderMetadata metadata) {
            if (metadata == null) {
              throw new MissingRequiredPropertyException("GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider", "metadata");
            }
            this.metadata = metadata;
            return this;
        }
        @CustomType.Setter
        public Builder route(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderRoute route) {
            if (route == null) {
              throw new MissingRequiredPropertyException("GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider", "route");
            }
            this.route = route;
            return this;
        }
        public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider build() {
            final var _resultValue = new GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider();
            _resultValue.blockStorage = blockStorage;
            _resultValue.global = global;
            _resultValue.loadBalancer = loadBalancer;
            _resultValue.metadata = metadata;
            _resultValue.route = route;
            return _resultValue;
        }
    }
}
