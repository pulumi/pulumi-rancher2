// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterV2RkeConfigRegistriesConfig {
    /**
     * @return Registry auth config secret name
     * 
     */
    private @Nullable String authConfigSecretName;
    /**
     * @return Registry CA bundle
     * 
     */
    private @Nullable String caBundle;
    /**
     * @return Registry hostname
     * 
     */
    private String hostname;
    /**
     * @return Registry insecure connectivity
     * 
     */
    private @Nullable Boolean insecure;
    /**
     * @return Registry TLS secret name. TLS is a pair of Cert/Key
     * 
     */
    private @Nullable String tlsSecretName;

    private GetClusterV2RkeConfigRegistriesConfig() {}
    /**
     * @return Registry auth config secret name
     * 
     */
    public Optional<String> authConfigSecretName() {
        return Optional.ofNullable(this.authConfigSecretName);
    }
    /**
     * @return Registry CA bundle
     * 
     */
    public Optional<String> caBundle() {
        return Optional.ofNullable(this.caBundle);
    }
    /**
     * @return Registry hostname
     * 
     */
    public String hostname() {
        return this.hostname;
    }
    /**
     * @return Registry insecure connectivity
     * 
     */
    public Optional<Boolean> insecure() {
        return Optional.ofNullable(this.insecure);
    }
    /**
     * @return Registry TLS secret name. TLS is a pair of Cert/Key
     * 
     */
    public Optional<String> tlsSecretName() {
        return Optional.ofNullable(this.tlsSecretName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterV2RkeConfigRegistriesConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String authConfigSecretName;
        private @Nullable String caBundle;
        private String hostname;
        private @Nullable Boolean insecure;
        private @Nullable String tlsSecretName;
        public Builder() {}
        public Builder(GetClusterV2RkeConfigRegistriesConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authConfigSecretName = defaults.authConfigSecretName;
    	      this.caBundle = defaults.caBundle;
    	      this.hostname = defaults.hostname;
    	      this.insecure = defaults.insecure;
    	      this.tlsSecretName = defaults.tlsSecretName;
        }

        @CustomType.Setter
        public Builder authConfigSecretName(@Nullable String authConfigSecretName) {

            this.authConfigSecretName = authConfigSecretName;
            return this;
        }
        @CustomType.Setter
        public Builder caBundle(@Nullable String caBundle) {

            this.caBundle = caBundle;
            return this;
        }
        @CustomType.Setter
        public Builder hostname(String hostname) {
            if (hostname == null) {
              throw new MissingRequiredPropertyException("GetClusterV2RkeConfigRegistriesConfig", "hostname");
            }
            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder insecure(@Nullable Boolean insecure) {

            this.insecure = insecure;
            return this;
        }
        @CustomType.Setter
        public Builder tlsSecretName(@Nullable String tlsSecretName) {

            this.tlsSecretName = tlsSecretName;
            return this;
        }
        public GetClusterV2RkeConfigRegistriesConfig build() {
            final var _resultValue = new GetClusterV2RkeConfigRegistriesConfig();
            _resultValue.authConfigSecretName = authConfigSecretName;
            _resultValue.caBundle = caBundle;
            _resultValue.hostname = hostname;
            _resultValue.insecure = insecure;
            _resultValue.tlsSecretName = tlsSecretName;
            return _resultValue;
        }
    }
}
