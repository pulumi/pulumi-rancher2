// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetClusterGkeConfigV2ClusterAddons {
    private final Boolean horizontalPodAutoscaling;
    private final Boolean httpLoadBalancing;
    private final Boolean networkPolicyConfig;

    @CustomType.Constructor
    private GetClusterGkeConfigV2ClusterAddons(
        @CustomType.Parameter("horizontalPodAutoscaling") Boolean horizontalPodAutoscaling,
        @CustomType.Parameter("httpLoadBalancing") Boolean httpLoadBalancing,
        @CustomType.Parameter("networkPolicyConfig") Boolean networkPolicyConfig) {
        this.horizontalPodAutoscaling = horizontalPodAutoscaling;
        this.httpLoadBalancing = httpLoadBalancing;
        this.networkPolicyConfig = networkPolicyConfig;
    }

    public Boolean horizontalPodAutoscaling() {
        return this.horizontalPodAutoscaling;
    }
    public Boolean httpLoadBalancing() {
        return this.httpLoadBalancing;
    }
    public Boolean networkPolicyConfig() {
        return this.networkPolicyConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterGkeConfigV2ClusterAddons defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean horizontalPodAutoscaling;
        private Boolean httpLoadBalancing;
        private Boolean networkPolicyConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterGkeConfigV2ClusterAddons defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.horizontalPodAutoscaling = defaults.horizontalPodAutoscaling;
    	      this.httpLoadBalancing = defaults.httpLoadBalancing;
    	      this.networkPolicyConfig = defaults.networkPolicyConfig;
        }

        public Builder horizontalPodAutoscaling(Boolean horizontalPodAutoscaling) {
            this.horizontalPodAutoscaling = Objects.requireNonNull(horizontalPodAutoscaling);
            return this;
        }
        public Builder httpLoadBalancing(Boolean httpLoadBalancing) {
            this.httpLoadBalancing = Objects.requireNonNull(httpLoadBalancing);
            return this;
        }
        public Builder networkPolicyConfig(Boolean networkPolicyConfig) {
            this.networkPolicyConfig = Objects.requireNonNull(networkPolicyConfig);
            return this;
        }        public GetClusterGkeConfigV2ClusterAddons build() {
            return new GetClusterGkeConfigV2ClusterAddons(horizontalPodAutoscaling, httpLoadBalancing, networkPolicyConfig);
        }
    }
}