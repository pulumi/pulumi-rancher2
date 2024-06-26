// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistryEcrCredentialPlugin;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistry {
    /**
     * @return ECR credential plugin config
     * 
     */
    private @Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistryEcrCredentialPlugin ecrCredentialPlugin;
    private @Nullable Boolean isDefault;
    private @Nullable String password;
    private String url;
    private @Nullable String user;

    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistry() {}
    /**
     * @return ECR credential plugin config
     * 
     */
    public Optional<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistryEcrCredentialPlugin> ecrCredentialPlugin() {
        return Optional.ofNullable(this.ecrCredentialPlugin);
    }
    public Optional<Boolean> isDefault() {
        return Optional.ofNullable(this.isDefault);
    }
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    public String url() {
        return this.url;
    }
    public Optional<String> user() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistryEcrCredentialPlugin ecrCredentialPlugin;
        private @Nullable Boolean isDefault;
        private @Nullable String password;
        private String url;
        private @Nullable String user;
        public Builder() {}
        public Builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ecrCredentialPlugin = defaults.ecrCredentialPlugin;
    	      this.isDefault = defaults.isDefault;
    	      this.password = defaults.password;
    	      this.url = defaults.url;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder ecrCredentialPlugin(@Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistryEcrCredentialPlugin ecrCredentialPlugin) {

            this.ecrCredentialPlugin = ecrCredentialPlugin;
            return this;
        }
        @CustomType.Setter
        public Builder isDefault(@Nullable Boolean isDefault) {

            this.isDefault = isDefault;
            return this;
        }
        @CustomType.Setter
        public Builder password(@Nullable String password) {

            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistry", "url");
            }
            this.url = url;
            return this;
        }
        @CustomType.Setter
        public Builder user(@Nullable String user) {

            this.user = user;
            return this;
        }
        public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistry build() {
            final var _resultValue = new GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistry();
            _resultValue.ecrCredentialPlugin = ecrCredentialPlugin;
            _resultValue.isDefault = isDefault;
            _resultValue.password = password;
            _resultValue.url = url;
            _resultValue.user = user;
            return _resultValue;
        }
    }
}
