// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSecretV2Result {
    /**
     * @return (Computed) Annotations for the secret v2 (map)
     * 
     */
    private final Map<String,Object> annotations;
    private final String clusterId;
    /**
     * @return (Computed/Sensitive) The data of the secret v2 (map)
     * 
     */
    private final Map<String,Object> data;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return (Computed) If set to true, any secret update will remove and recreate the secret. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate (bool)
     * 
     */
    private final Boolean immutable;
    /**
     * @return (Computed) Labels for the secret v2 (map)
     * 
     */
    private final Map<String,Object> labels;
    private final String name;
    private final @Nullable String namespace;
    /**
     * @return (Computed) The k8s resource version (string)
     * 
     */
    private final String resourceVersion;
    /**
     * @return (Computed) The type of the k8s secret, used to facilitate programmatic handling of secret data, [More info](https://github.com/kubernetes/api/blob/release-1.20/core/v1/types.go#L5772) about k8s secret types and expected format (string)
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetSecretV2Result(
        @CustomType.Parameter("annotations") Map<String,Object> annotations,
        @CustomType.Parameter("clusterId") String clusterId,
        @CustomType.Parameter("data") Map<String,Object> data,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("immutable") Boolean immutable,
        @CustomType.Parameter("labels") Map<String,Object> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namespace") @Nullable String namespace,
        @CustomType.Parameter("resourceVersion") String resourceVersion,
        @CustomType.Parameter("type") String type) {
        this.annotations = annotations;
        this.clusterId = clusterId;
        this.data = data;
        this.id = id;
        this.immutable = immutable;
        this.labels = labels;
        this.name = name;
        this.namespace = namespace;
        this.resourceVersion = resourceVersion;
        this.type = type;
    }

    /**
     * @return (Computed) Annotations for the secret v2 (map)
     * 
     */
    public Map<String,Object> annotations() {
        return this.annotations;
    }
    public String clusterId() {
        return this.clusterId;
    }
    /**
     * @return (Computed/Sensitive) The data of the secret v2 (map)
     * 
     */
    public Map<String,Object> data() {
        return this.data;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Computed) If set to true, any secret update will remove and recreate the secret. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate (bool)
     * 
     */
    public Boolean immutable() {
        return this.immutable;
    }
    /**
     * @return (Computed) Labels for the secret v2 (map)
     * 
     */
    public Map<String,Object> labels() {
        return this.labels;
    }
    public String name() {
        return this.name;
    }
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * @return (Computed) The k8s resource version (string)
     * 
     */
    public String resourceVersion() {
        return this.resourceVersion;
    }
    /**
     * @return (Computed) The type of the k8s secret, used to facilitate programmatic handling of secret data, [More info](https://github.com/kubernetes/api/blob/release-1.20/core/v1/types.go#L5772) about k8s secret types and expected format (string)
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretV2Result defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,Object> annotations;
        private String clusterId;
        private Map<String,Object> data;
        private String id;
        private Boolean immutable;
        private Map<String,Object> labels;
        private String name;
        private @Nullable String namespace;
        private String resourceVersion;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretV2Result defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.clusterId = defaults.clusterId;
    	      this.data = defaults.data;
    	      this.id = defaults.id;
    	      this.immutable = defaults.immutable;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.resourceVersion = defaults.resourceVersion;
    	      this.type = defaults.type;
        }

        public Builder annotations(Map<String,Object> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }
        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        public Builder data(Map<String,Object> data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder immutable(Boolean immutable) {
            this.immutable = Objects.requireNonNull(immutable);
            return this;
        }
        public Builder labels(Map<String,Object> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder resourceVersion(String resourceVersion) {
            this.resourceVersion = Objects.requireNonNull(resourceVersion);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetSecretV2Result build() {
            return new GetSecretV2Result(annotations, clusterId, data, id, immutable, labels, name, namespace, resourceVersion, type);
        }
    }
}