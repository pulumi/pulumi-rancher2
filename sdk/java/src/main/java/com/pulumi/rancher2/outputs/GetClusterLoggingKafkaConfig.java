// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterLoggingKafkaConfig {
    private final @Nullable List<String> brokerEndpoints;
    private final @Nullable String certificate;
    private final @Nullable String clientCert;
    private final @Nullable String clientKey;
    private final String topic;
    private final @Nullable String zookeeperEndpoint;

    @CustomType.Constructor
    private GetClusterLoggingKafkaConfig(
        @CustomType.Parameter("brokerEndpoints") @Nullable List<String> brokerEndpoints,
        @CustomType.Parameter("certificate") @Nullable String certificate,
        @CustomType.Parameter("clientCert") @Nullable String clientCert,
        @CustomType.Parameter("clientKey") @Nullable String clientKey,
        @CustomType.Parameter("topic") String topic,
        @CustomType.Parameter("zookeeperEndpoint") @Nullable String zookeeperEndpoint) {
        this.brokerEndpoints = brokerEndpoints;
        this.certificate = certificate;
        this.clientCert = clientCert;
        this.clientKey = clientKey;
        this.topic = topic;
        this.zookeeperEndpoint = zookeeperEndpoint;
    }

    public List<String> brokerEndpoints() {
        return this.brokerEndpoints == null ? List.of() : this.brokerEndpoints;
    }
    public Optional<String> certificate() {
        return Optional.ofNullable(this.certificate);
    }
    public Optional<String> clientCert() {
        return Optional.ofNullable(this.clientCert);
    }
    public Optional<String> clientKey() {
        return Optional.ofNullable(this.clientKey);
    }
    public String topic() {
        return this.topic;
    }
    public Optional<String> zookeeperEndpoint() {
        return Optional.ofNullable(this.zookeeperEndpoint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterLoggingKafkaConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> brokerEndpoints;
        private @Nullable String certificate;
        private @Nullable String clientCert;
        private @Nullable String clientKey;
        private String topic;
        private @Nullable String zookeeperEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterLoggingKafkaConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.brokerEndpoints = defaults.brokerEndpoints;
    	      this.certificate = defaults.certificate;
    	      this.clientCert = defaults.clientCert;
    	      this.clientKey = defaults.clientKey;
    	      this.topic = defaults.topic;
    	      this.zookeeperEndpoint = defaults.zookeeperEndpoint;
        }

        public Builder brokerEndpoints(@Nullable List<String> brokerEndpoints) {
            this.brokerEndpoints = brokerEndpoints;
            return this;
        }
        public Builder brokerEndpoints(String... brokerEndpoints) {
            return brokerEndpoints(List.of(brokerEndpoints));
        }
        public Builder certificate(@Nullable String certificate) {
            this.certificate = certificate;
            return this;
        }
        public Builder clientCert(@Nullable String clientCert) {
            this.clientCert = clientCert;
            return this;
        }
        public Builder clientKey(@Nullable String clientKey) {
            this.clientKey = clientKey;
            return this;
        }
        public Builder topic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }
        public Builder zookeeperEndpoint(@Nullable String zookeeperEndpoint) {
            this.zookeeperEndpoint = zookeeperEndpoint;
            return this;
        }        public GetClusterLoggingKafkaConfig build() {
            return new GetClusterLoggingKafkaConfig(brokerEndpoints, certificate, clientCert, clientKey, topic, zookeeperEndpoint);
        }
    }
}