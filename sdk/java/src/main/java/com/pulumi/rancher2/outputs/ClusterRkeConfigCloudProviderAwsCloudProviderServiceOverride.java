// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverride {
    /**
     * @return The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
     * 
     */
    private final @Nullable String region;
    /**
     * @return (string)
     * 
     */
    private final String service;
    /**
     * @return (string)
     * 
     */
    private final @Nullable String signingMethod;
    /**
     * @return (string)
     * 
     */
    private final @Nullable String signingName;
    /**
     * @return (string)
     * 
     */
    private final @Nullable String signingRegion;
    /**
     * @return Registry URL (string)
     * 
     */
    private final @Nullable String url;

    @CustomType.Constructor
    private ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverride(
        @CustomType.Parameter("region") @Nullable String region,
        @CustomType.Parameter("service") String service,
        @CustomType.Parameter("signingMethod") @Nullable String signingMethod,
        @CustomType.Parameter("signingName") @Nullable String signingName,
        @CustomType.Parameter("signingRegion") @Nullable String signingRegion,
        @CustomType.Parameter("url") @Nullable String url) {
        this.region = region;
        this.service = service;
        this.signingMethod = signingMethod;
        this.signingName = signingName;
        this.signingRegion = signingRegion;
        this.url = url;
    }

    /**
     * @return The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return (string)
     * 
     */
    public String service() {
        return this.service;
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> signingMethod() {
        return Optional.ofNullable(this.signingMethod);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> signingName() {
        return Optional.ofNullable(this.signingName);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> signingRegion() {
        return Optional.ofNullable(this.signingRegion);
    }
    /**
     * @return Registry URL (string)
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverride defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String region;
        private String service;
        private @Nullable String signingMethod;
        private @Nullable String signingName;
        private @Nullable String signingRegion;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverride defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.region = defaults.region;
    	      this.service = defaults.service;
    	      this.signingMethod = defaults.signingMethod;
    	      this.signingName = defaults.signingName;
    	      this.signingRegion = defaults.signingRegion;
    	      this.url = defaults.url;
        }

        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public Builder signingMethod(@Nullable String signingMethod) {
            this.signingMethod = signingMethod;
            return this;
        }
        public Builder signingName(@Nullable String signingName) {
            this.signingName = signingName;
            return this;
        }
        public Builder signingRegion(@Nullable String signingRegion) {
            this.signingRegion = signingRegion;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }        public ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverride build() {
            return new ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverride(region, service, signingMethod, signingName, signingRegion, url);
        }
    }
}