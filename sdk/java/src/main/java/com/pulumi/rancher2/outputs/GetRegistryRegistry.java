// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRegistryRegistry {
    private final String address;
    private final @Nullable String password;
    private final @Nullable String username;

    @CustomType.Constructor
    private GetRegistryRegistry(
        @CustomType.Parameter("address") String address,
        @CustomType.Parameter("password") @Nullable String password,
        @CustomType.Parameter("username") @Nullable String username) {
        this.address = address;
        this.password = password;
        this.username = username;
    }

    public String address() {
        return this.address;
    }
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryRegistry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String address;
        private @Nullable String password;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistryRegistry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder address(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }        public GetRegistryRegistry build() {
            return new GetRegistryRegistry(address, password, username);
        }
    }
}