// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMultiClusterAppTarget {
    private final String appId;
    private final String healthState;
    private final String projectId;
    private final String state;

    @CustomType.Constructor
    private GetMultiClusterAppTarget(
        @CustomType.Parameter("appId") String appId,
        @CustomType.Parameter("healthState") String healthState,
        @CustomType.Parameter("projectId") String projectId,
        @CustomType.Parameter("state") String state) {
        this.appId = appId;
        this.healthState = healthState;
        this.projectId = projectId;
        this.state = state;
    }

    public String appId() {
        return this.appId;
    }
    public String healthState() {
        return this.healthState;
    }
    public String projectId() {
        return this.projectId;
    }
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMultiClusterAppTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appId;
        private String healthState;
        private String projectId;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMultiClusterAppTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.healthState = defaults.healthState;
    	      this.projectId = defaults.projectId;
    	      this.state = defaults.state;
        }

        public Builder appId(String appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }
        public Builder healthState(String healthState) {
            this.healthState = Objects.requireNonNull(healthState);
            return this;
        }
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public GetMultiClusterAppTarget build() {
            return new GetMultiClusterAppTarget(appId, healthState, projectId, state);
        }
    }
}