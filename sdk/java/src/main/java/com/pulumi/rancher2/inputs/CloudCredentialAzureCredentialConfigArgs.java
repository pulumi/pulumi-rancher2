// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudCredentialAzureCredentialConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudCredentialAzureCredentialConfigArgs Empty = new CloudCredentialAzureCredentialConfigArgs();

    /**
     * Azure Service Principal Account ID (string)
     * 
     */
    @Import(name="clientId", required=true)
    private Output<String> clientId;

    /**
     * @return Azure Service Principal Account ID (string)
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * Azure Service Principal Account password (string)
     * 
     */
    @Import(name="clientSecret", required=true)
    private Output<String> clientSecret;

    /**
     * @return Azure Service Principal Account password (string)
     * 
     */
    public Output<String> clientSecret() {
        return this.clientSecret;
    }

    /**
     * Azure environment (e.g. AzurePublicCloud, AzureChinaCloud) (string)
     * 
     */
    @Import(name="environment")
    private @Nullable Output<String> environment;

    /**
     * @return Azure environment (e.g. AzurePublicCloud, AzureChinaCloud) (string)
     * 
     */
    public Optional<Output<String>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * Azure Subscription ID (string)
     * 
     */
    @Import(name="subscriptionId", required=true)
    private Output<String> subscriptionId;

    /**
     * @return Azure Subscription ID (string)
     * 
     */
    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Azure Tenant ID (string)
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return Azure Tenant ID (string)
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    private CloudCredentialAzureCredentialConfigArgs() {}

    private CloudCredentialAzureCredentialConfigArgs(CloudCredentialAzureCredentialConfigArgs $) {
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.environment = $.environment;
        this.subscriptionId = $.subscriptionId;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudCredentialAzureCredentialConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudCredentialAzureCredentialConfigArgs $;

        public Builder() {
            $ = new CloudCredentialAzureCredentialConfigArgs();
        }

        public Builder(CloudCredentialAzureCredentialConfigArgs defaults) {
            $ = new CloudCredentialAzureCredentialConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId Azure Service Principal Account ID (string)
         * 
         * @return builder
         * 
         */
        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId Azure Service Principal Account ID (string)
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret Azure Service Principal Account password (string)
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret Azure Service Principal Account password (string)
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param environment Azure environment (e.g. AzurePublicCloud, AzureChinaCloud) (string)
         * 
         * @return builder
         * 
         */
        public Builder environment(@Nullable Output<String> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment Azure environment (e.g. AzurePublicCloud, AzureChinaCloud) (string)
         * 
         * @return builder
         * 
         */
        public Builder environment(String environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param subscriptionId Azure Subscription ID (string)
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param subscriptionId Azure Subscription ID (string)
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        /**
         * @param tenantId Azure Tenant ID (string)
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId Azure Tenant ID (string)
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public CloudCredentialAzureCredentialConfigArgs build() {
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            $.clientSecret = Objects.requireNonNull($.clientSecret, "expected parameter 'clientSecret' to be non-null");
            $.subscriptionId = Objects.requireNonNull($.subscriptionId, "expected parameter 'subscriptionId' to be non-null");
            return $;
        }
    }

}