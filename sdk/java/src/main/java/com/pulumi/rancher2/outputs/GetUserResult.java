// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetUserResult {
    /**
     * @return (Computed) Annotations of the resource (map)
     * 
     */
    private Map<String,String> annotations;
    /**
     * @return (Computed) The user is enabled (bool)
     * 
     */
    private Boolean enabled;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable Boolean isExternal;
    /**
     * @return (Computed) Labels of the resource (map)
     * 
     */
    private Map<String,String> labels;
    /**
     * @return (Computed) The user must change password at first login (bool)
     * 
     */
    private Boolean mustChangePassword;
    /**
     * @return (Computed) The user common name (string)
     * 
     */
    private String name;
    /**
     * @return (Computed) The user principal IDs (list)
     * 
     */
    private List<String> principalIds;
    private String username;

    private GetUserResult() {}
    /**
     * @return (Computed) Annotations of the resource (map)
     * 
     */
    public Map<String,String> annotations() {
        return this.annotations;
    }
    /**
     * @return (Computed) The user is enabled (bool)
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<Boolean> isExternal() {
        return Optional.ofNullable(this.isExternal);
    }
    /**
     * @return (Computed) Labels of the resource (map)
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return (Computed) The user must change password at first login (bool)
     * 
     */
    public Boolean mustChangePassword() {
        return this.mustChangePassword;
    }
    /**
     * @return (Computed) The user common name (string)
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return (Computed) The user principal IDs (list)
     * 
     */
    public List<String> principalIds() {
        return this.principalIds;
    }
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> annotations;
        private Boolean enabled;
        private String id;
        private @Nullable Boolean isExternal;
        private Map<String,String> labels;
        private Boolean mustChangePassword;
        private String name;
        private List<String> principalIds;
        private String username;
        public Builder() {}
        public Builder(GetUserResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.isExternal = defaults.isExternal;
    	      this.labels = defaults.labels;
    	      this.mustChangePassword = defaults.mustChangePassword;
    	      this.name = defaults.name;
    	      this.principalIds = defaults.principalIds;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder annotations(Map<String,String> annotations) {
            if (annotations == null) {
              throw new MissingRequiredPropertyException("GetUserResult", "annotations");
            }
            this.annotations = annotations;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetUserResult", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetUserResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder isExternal(@Nullable Boolean isExternal) {

            this.isExternal = isExternal;
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetUserResult", "labels");
            }
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder mustChangePassword(Boolean mustChangePassword) {
            if (mustChangePassword == null) {
              throw new MissingRequiredPropertyException("GetUserResult", "mustChangePassword");
            }
            this.mustChangePassword = mustChangePassword;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetUserResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder principalIds(List<String> principalIds) {
            if (principalIds == null) {
              throw new MissingRequiredPropertyException("GetUserResult", "principalIds");
            }
            this.principalIds = principalIds;
            return this;
        }
        public Builder principalIds(String... principalIds) {
            return principalIds(List.of(principalIds));
        }
        @CustomType.Setter
        public Builder username(String username) {
            if (username == null) {
              throw new MissingRequiredPropertyException("GetUserResult", "username");
            }
            this.username = username;
            return this;
        }
        public GetUserResult build() {
            final var _resultValue = new GetUserResult();
            _resultValue.annotations = annotations;
            _resultValue.enabled = enabled;
            _resultValue.id = id;
            _resultValue.isExternal = isExternal;
            _resultValue.labels = labels;
            _resultValue.mustChangePassword = mustChangePassword;
            _resultValue.name = name;
            _resultValue.principalIds = principalIds;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
