// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetGlobalRoleRule {
    private final @Nullable List<String> apiGroups;
    private final @Nullable List<String> nonResourceUrls;
    private final @Nullable List<String> resourceNames;
    private final @Nullable List<String> resources;
    private final @Nullable List<String> verbs;

    @CustomType.Constructor
    private GetGlobalRoleRule(
        @CustomType.Parameter("apiGroups") @Nullable List<String> apiGroups,
        @CustomType.Parameter("nonResourceUrls") @Nullable List<String> nonResourceUrls,
        @CustomType.Parameter("resourceNames") @Nullable List<String> resourceNames,
        @CustomType.Parameter("resources") @Nullable List<String> resources,
        @CustomType.Parameter("verbs") @Nullable List<String> verbs) {
        this.apiGroups = apiGroups;
        this.nonResourceUrls = nonResourceUrls;
        this.resourceNames = resourceNames;
        this.resources = resources;
        this.verbs = verbs;
    }

    public List<String> apiGroups() {
        return this.apiGroups == null ? List.of() : this.apiGroups;
    }
    public List<String> nonResourceUrls() {
        return this.nonResourceUrls == null ? List.of() : this.nonResourceUrls;
    }
    public List<String> resourceNames() {
        return this.resourceNames == null ? List.of() : this.resourceNames;
    }
    public List<String> resources() {
        return this.resources == null ? List.of() : this.resources;
    }
    public List<String> verbs() {
        return this.verbs == null ? List.of() : this.verbs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalRoleRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> apiGroups;
        private @Nullable List<String> nonResourceUrls;
        private @Nullable List<String> resourceNames;
        private @Nullable List<String> resources;
        private @Nullable List<String> verbs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalRoleRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroups = defaults.apiGroups;
    	      this.nonResourceUrls = defaults.nonResourceUrls;
    	      this.resourceNames = defaults.resourceNames;
    	      this.resources = defaults.resources;
    	      this.verbs = defaults.verbs;
        }

        public Builder apiGroups(@Nullable List<String> apiGroups) {
            this.apiGroups = apiGroups;
            return this;
        }
        public Builder apiGroups(String... apiGroups) {
            return apiGroups(List.of(apiGroups));
        }
        public Builder nonResourceUrls(@Nullable List<String> nonResourceUrls) {
            this.nonResourceUrls = nonResourceUrls;
            return this;
        }
        public Builder nonResourceUrls(String... nonResourceUrls) {
            return nonResourceUrls(List.of(nonResourceUrls));
        }
        public Builder resourceNames(@Nullable List<String> resourceNames) {
            this.resourceNames = resourceNames;
            return this;
        }
        public Builder resourceNames(String... resourceNames) {
            return resourceNames(List.of(resourceNames));
        }
        public Builder resources(@Nullable List<String> resources) {
            this.resources = resources;
            return this;
        }
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }
        public Builder verbs(@Nullable List<String> verbs) {
            this.verbs = verbs;
            return this;
        }
        public Builder verbs(String... verbs) {
            return verbs(List.of(verbs));
        }        public GetGlobalRoleRule build() {
            return new GetGlobalRoleRule(apiGroups, nonResourceUrls, resourceNames, resources, verbs);
        }
    }
}