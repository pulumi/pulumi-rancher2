// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProvider;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAzureCloudProvider;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProvider;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider {
    private final @Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProvider awsCloudProvider;
    private final @Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAzureCloudProvider azureCloudProvider;
    private final String customCloudProvider;
    /**
     * @return The cluster template name (string)
     * 
     */
    private final @Nullable String name;
    private final @Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider openstackCloudProvider;
    private final @Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProvider vsphereCloudProvider;

    @CustomType.Constructor
    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider(
        @CustomType.Parameter("awsCloudProvider") @Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProvider awsCloudProvider,
        @CustomType.Parameter("azureCloudProvider") @Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAzureCloudProvider azureCloudProvider,
        @CustomType.Parameter("customCloudProvider") String customCloudProvider,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("openstackCloudProvider") @Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider openstackCloudProvider,
        @CustomType.Parameter("vsphereCloudProvider") @Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProvider vsphereCloudProvider) {
        this.awsCloudProvider = awsCloudProvider;
        this.azureCloudProvider = azureCloudProvider;
        this.customCloudProvider = customCloudProvider;
        this.name = name;
        this.openstackCloudProvider = openstackCloudProvider;
        this.vsphereCloudProvider = vsphereCloudProvider;
    }

    public Optional<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProvider> awsCloudProvider() {
        return Optional.ofNullable(this.awsCloudProvider);
    }
    public Optional<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAzureCloudProvider> azureCloudProvider() {
        return Optional.ofNullable(this.azureCloudProvider);
    }
    public String customCloudProvider() {
        return this.customCloudProvider;
    }
    /**
     * @return The cluster template name (string)
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider> openstackCloudProvider() {
        return Optional.ofNullable(this.openstackCloudProvider);
    }
    public Optional<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProvider> vsphereCloudProvider() {
        return Optional.ofNullable(this.vsphereCloudProvider);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProvider awsCloudProvider;
        private @Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAzureCloudProvider azureCloudProvider;
        private String customCloudProvider;
        private @Nullable String name;
        private @Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider openstackCloudProvider;
        private @Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProvider vsphereCloudProvider;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsCloudProvider = defaults.awsCloudProvider;
    	      this.azureCloudProvider = defaults.azureCloudProvider;
    	      this.customCloudProvider = defaults.customCloudProvider;
    	      this.name = defaults.name;
    	      this.openstackCloudProvider = defaults.openstackCloudProvider;
    	      this.vsphereCloudProvider = defaults.vsphereCloudProvider;
        }

        public Builder awsCloudProvider(@Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProvider awsCloudProvider) {
            this.awsCloudProvider = awsCloudProvider;
            return this;
        }
        public Builder azureCloudProvider(@Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAzureCloudProvider azureCloudProvider) {
            this.azureCloudProvider = azureCloudProvider;
            return this;
        }
        public Builder customCloudProvider(String customCloudProvider) {
            this.customCloudProvider = Objects.requireNonNull(customCloudProvider);
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder openstackCloudProvider(@Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider openstackCloudProvider) {
            this.openstackCloudProvider = openstackCloudProvider;
            return this;
        }
        public Builder vsphereCloudProvider(@Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProvider vsphereCloudProvider) {
            this.vsphereCloudProvider = vsphereCloudProvider;
            return this;
        }        public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider build() {
            return new GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider(awsCloudProvider, azureCloudProvider, customCloudProvider, name, openstackCloudProvider, vsphereCloudProvider);
        }
    }
}