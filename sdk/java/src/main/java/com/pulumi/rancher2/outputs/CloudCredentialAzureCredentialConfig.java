// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CloudCredentialAzureCredentialConfig {
    /**
     * @return Azure Service Principal Account ID (string)
     * 
     */
    private final String clientId;
    /**
     * @return Azure Service Principal Account password (string)
     * 
     */
    private final String clientSecret;
    /**
     * @return Azure environment (e.g. AzurePublicCloud, AzureChinaCloud) (string)
     * 
     */
    private final @Nullable String environment;
    /**
     * @return Azure Subscription ID (string)
     * 
     */
    private final String subscriptionId;
    /**
     * @return Azure Tenant ID (string)
     * 
     */
    private final @Nullable String tenantId;

    @CustomType.Constructor
    private CloudCredentialAzureCredentialConfig(
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("clientSecret") String clientSecret,
        @CustomType.Parameter("environment") @Nullable String environment,
        @CustomType.Parameter("subscriptionId") String subscriptionId,
        @CustomType.Parameter("tenantId") @Nullable String tenantId) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.environment = environment;
        this.subscriptionId = subscriptionId;
        this.tenantId = tenantId;
    }

    /**
     * @return Azure Service Principal Account ID (string)
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return Azure Service Principal Account password (string)
     * 
     */
    public String clientSecret() {
        return this.clientSecret;
    }
    /**
     * @return Azure environment (e.g. AzurePublicCloud, AzureChinaCloud) (string)
     * 
     */
    public Optional<String> environment() {
        return Optional.ofNullable(this.environment);
    }
    /**
     * @return Azure Subscription ID (string)
     * 
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }
    /**
     * @return Azure Tenant ID (string)
     * 
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudCredentialAzureCredentialConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String clientSecret;
        private @Nullable String environment;
        private String subscriptionId;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudCredentialAzureCredentialConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.environment = defaults.environment;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }
        public Builder environment(@Nullable String environment) {
            this.environment = environment;
            return this;
        }
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }        public CloudCredentialAzureCredentialConfig build() {
            return new CloudCredentialAzureCredentialConfig(clientId, clientSecret, environment, subscriptionId, tenantId);
        }
    }
}