// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterLoggingFluentdConfigFluentServer {
    /**
     * @return Endpoint of the syslog service (string)
     * 
     */
    private final String endpoint;
    /**
     * @return Hostname of the fluentd service (string)
     * 
     */
    private final @Nullable String hostname;
    /**
     * @return User password of the fluentd service (string)
     * 
     */
    private final @Nullable String password;
    /**
     * @return Shared key of the fluentd service (string)
     * 
     */
    private final @Nullable String sharedKey;
    /**
     * @return Standby server of the fluentd service (bool)
     * 
     */
    private final @Nullable Boolean standby;
    /**
     * @return Username of the fluentd service (string)
     * 
     */
    private final @Nullable String username;
    /**
     * @return Weight of the fluentd server (int)
     * 
     */
    private final @Nullable Integer weight;

    @CustomType.Constructor
    private ClusterLoggingFluentdConfigFluentServer(
        @CustomType.Parameter("endpoint") String endpoint,
        @CustomType.Parameter("hostname") @Nullable String hostname,
        @CustomType.Parameter("password") @Nullable String password,
        @CustomType.Parameter("sharedKey") @Nullable String sharedKey,
        @CustomType.Parameter("standby") @Nullable Boolean standby,
        @CustomType.Parameter("username") @Nullable String username,
        @CustomType.Parameter("weight") @Nullable Integer weight) {
        this.endpoint = endpoint;
        this.hostname = hostname;
        this.password = password;
        this.sharedKey = sharedKey;
        this.standby = standby;
        this.username = username;
        this.weight = weight;
    }

    /**
     * @return Endpoint of the syslog service (string)
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return Hostname of the fluentd service (string)
     * 
     */
    public Optional<String> hostname() {
        return Optional.ofNullable(this.hostname);
    }
    /**
     * @return User password of the fluentd service (string)
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return Shared key of the fluentd service (string)
     * 
     */
    public Optional<String> sharedKey() {
        return Optional.ofNullable(this.sharedKey);
    }
    /**
     * @return Standby server of the fluentd service (bool)
     * 
     */
    public Optional<Boolean> standby() {
        return Optional.ofNullable(this.standby);
    }
    /**
     * @return Username of the fluentd service (string)
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }
    /**
     * @return Weight of the fluentd server (int)
     * 
     */
    public Optional<Integer> weight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterLoggingFluentdConfigFluentServer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpoint;
        private @Nullable String hostname;
        private @Nullable String password;
        private @Nullable String sharedKey;
        private @Nullable Boolean standby;
        private @Nullable String username;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterLoggingFluentdConfigFluentServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.hostname = defaults.hostname;
    	      this.password = defaults.password;
    	      this.sharedKey = defaults.sharedKey;
    	      this.standby = defaults.standby;
    	      this.username = defaults.username;
    	      this.weight = defaults.weight;
        }

        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder hostname(@Nullable String hostname) {
            this.hostname = hostname;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        public Builder sharedKey(@Nullable String sharedKey) {
            this.sharedKey = sharedKey;
            return this;
        }
        public Builder standby(@Nullable Boolean standby) {
            this.standby = standby;
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }
        public Builder weight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }        public ClusterLoggingFluentdConfigFluentServer build() {
            return new ClusterLoggingFluentdConfigFluentServer(endpoint, hostname, password, sharedKey, standby, username, weight);
        }
    }
}