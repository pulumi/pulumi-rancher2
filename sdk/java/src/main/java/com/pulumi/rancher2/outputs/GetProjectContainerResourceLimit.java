// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetProjectContainerResourceLimit {
    private final @Nullable String limitsCpu;
    private final @Nullable String limitsMemory;
    private final @Nullable String requestsCpu;
    private final @Nullable String requestsMemory;

    @CustomType.Constructor
    private GetProjectContainerResourceLimit(
        @CustomType.Parameter("limitsCpu") @Nullable String limitsCpu,
        @CustomType.Parameter("limitsMemory") @Nullable String limitsMemory,
        @CustomType.Parameter("requestsCpu") @Nullable String requestsCpu,
        @CustomType.Parameter("requestsMemory") @Nullable String requestsMemory) {
        this.limitsCpu = limitsCpu;
        this.limitsMemory = limitsMemory;
        this.requestsCpu = requestsCpu;
        this.requestsMemory = requestsMemory;
    }

    public Optional<String> limitsCpu() {
        return Optional.ofNullable(this.limitsCpu);
    }
    public Optional<String> limitsMemory() {
        return Optional.ofNullable(this.limitsMemory);
    }
    public Optional<String> requestsCpu() {
        return Optional.ofNullable(this.requestsCpu);
    }
    public Optional<String> requestsMemory() {
        return Optional.ofNullable(this.requestsMemory);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectContainerResourceLimit defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String limitsCpu;
        private @Nullable String limitsMemory;
        private @Nullable String requestsCpu;
        private @Nullable String requestsMemory;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProjectContainerResourceLimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limitsCpu = defaults.limitsCpu;
    	      this.limitsMemory = defaults.limitsMemory;
    	      this.requestsCpu = defaults.requestsCpu;
    	      this.requestsMemory = defaults.requestsMemory;
        }

        public Builder limitsCpu(@Nullable String limitsCpu) {
            this.limitsCpu = limitsCpu;
            return this;
        }
        public Builder limitsMemory(@Nullable String limitsMemory) {
            this.limitsMemory = limitsMemory;
            return this;
        }
        public Builder requestsCpu(@Nullable String requestsCpu) {
            this.requestsCpu = requestsCpu;
            return this;
        }
        public Builder requestsMemory(@Nullable String requestsMemory) {
            this.requestsMemory = requestsMemory;
            return this;
        }        public GetProjectContainerResourceLimit build() {
            return new GetProjectContainerResourceLimit(limitsCpu, limitsMemory, requestsCpu, requestsMemory);
        }
    }
}