// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.outputs.GetRoleTemplateExternalRule;
import com.pulumi.rancher2.outputs.GetRoleTemplateRule;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetRoleTemplateResult {
    /**
     * @return (Computed) Administrative role template (bool)
     * 
     */
    private Boolean administrative;
    /**
     * @return (Computed) Annotations for role template object (map)
     * 
     */
    private Map<String,String> annotations;
    /**
     * @return (Computed) Builtin role template (string)
     * 
     */
    private Boolean builtin;
    private String context;
    /**
     * @return (Computed) Default role template for new created cluster or project (bool)
     * 
     */
    private Boolean defaultRole;
    /**
     * @return (Computed) Role template description (string)
     * 
     */
    private String description;
    /**
     * @return (Computed) External role template (bool)
     * 
     */
    private Boolean external;
    /**
     * @return (Computed) External rules used for authorization. (list)
     * 
     */
    private List<GetRoleTemplateExternalRule> externalRules;
    /**
     * @return (Computed) Hidden role template (bool)
     * 
     */
    private Boolean hidden;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (Computed) Labels for role template object (map)
     * 
     */
    private Map<String,String> labels;
    /**
     * @return (Computed) Locked role template (bool)
     * 
     */
    private Boolean locked;
    private String name;
    /**
     * @return (Computed) Inherit role template IDs (list)
     * 
     */
    private List<String> roleTemplateIds;
    /**
     * @return (Computed) Role template policy rules (list)
     * 
     */
    private List<GetRoleTemplateRule> rules;

    private GetRoleTemplateResult() {}
    /**
     * @return (Computed) Administrative role template (bool)
     * 
     */
    public Boolean administrative() {
        return this.administrative;
    }
    /**
     * @return (Computed) Annotations for role template object (map)
     * 
     */
    public Map<String,String> annotations() {
        return this.annotations;
    }
    /**
     * @return (Computed) Builtin role template (string)
     * 
     */
    public Boolean builtin() {
        return this.builtin;
    }
    public String context() {
        return this.context;
    }
    /**
     * @return (Computed) Default role template for new created cluster or project (bool)
     * 
     */
    public Boolean defaultRole() {
        return this.defaultRole;
    }
    /**
     * @return (Computed) Role template description (string)
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return (Computed) External role template (bool)
     * 
     */
    public Boolean external() {
        return this.external;
    }
    /**
     * @return (Computed) External rules used for authorization. (list)
     * 
     */
    public List<GetRoleTemplateExternalRule> externalRules() {
        return this.externalRules;
    }
    /**
     * @return (Computed) Hidden role template (bool)
     * 
     */
    public Boolean hidden() {
        return this.hidden;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Computed) Labels for role template object (map)
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return (Computed) Locked role template (bool)
     * 
     */
    public Boolean locked() {
        return this.locked;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return (Computed) Inherit role template IDs (list)
     * 
     */
    public List<String> roleTemplateIds() {
        return this.roleTemplateIds;
    }
    /**
     * @return (Computed) Role template policy rules (list)
     * 
     */
    public List<GetRoleTemplateRule> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleTemplateResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean administrative;
        private Map<String,String> annotations;
        private Boolean builtin;
        private String context;
        private Boolean defaultRole;
        private String description;
        private Boolean external;
        private List<GetRoleTemplateExternalRule> externalRules;
        private Boolean hidden;
        private String id;
        private Map<String,String> labels;
        private Boolean locked;
        private String name;
        private List<String> roleTemplateIds;
        private List<GetRoleTemplateRule> rules;
        public Builder() {}
        public Builder(GetRoleTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administrative = defaults.administrative;
    	      this.annotations = defaults.annotations;
    	      this.builtin = defaults.builtin;
    	      this.context = defaults.context;
    	      this.defaultRole = defaults.defaultRole;
    	      this.description = defaults.description;
    	      this.external = defaults.external;
    	      this.externalRules = defaults.externalRules;
    	      this.hidden = defaults.hidden;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.locked = defaults.locked;
    	      this.name = defaults.name;
    	      this.roleTemplateIds = defaults.roleTemplateIds;
    	      this.rules = defaults.rules;
        }

        @CustomType.Setter
        public Builder administrative(Boolean administrative) {
            if (administrative == null) {
              throw new MissingRequiredPropertyException("GetRoleTemplateResult", "administrative");
            }
            this.administrative = administrative;
            return this;
        }
        @CustomType.Setter
        public Builder annotations(Map<String,String> annotations) {
            if (annotations == null) {
              throw new MissingRequiredPropertyException("GetRoleTemplateResult", "annotations");
            }
            this.annotations = annotations;
            return this;
        }
        @CustomType.Setter
        public Builder builtin(Boolean builtin) {
            if (builtin == null) {
              throw new MissingRequiredPropertyException("GetRoleTemplateResult", "builtin");
            }
            this.builtin = builtin;
            return this;
        }
        @CustomType.Setter
        public Builder context(String context) {
            if (context == null) {
              throw new MissingRequiredPropertyException("GetRoleTemplateResult", "context");
            }
            this.context = context;
            return this;
        }
        @CustomType.Setter
        public Builder defaultRole(Boolean defaultRole) {
            if (defaultRole == null) {
              throw new MissingRequiredPropertyException("GetRoleTemplateResult", "defaultRole");
            }
            this.defaultRole = defaultRole;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetRoleTemplateResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder external(Boolean external) {
            if (external == null) {
              throw new MissingRequiredPropertyException("GetRoleTemplateResult", "external");
            }
            this.external = external;
            return this;
        }
        @CustomType.Setter
        public Builder externalRules(List<GetRoleTemplateExternalRule> externalRules) {
            if (externalRules == null) {
              throw new MissingRequiredPropertyException("GetRoleTemplateResult", "externalRules");
            }
            this.externalRules = externalRules;
            return this;
        }
        public Builder externalRules(GetRoleTemplateExternalRule... externalRules) {
            return externalRules(List.of(externalRules));
        }
        @CustomType.Setter
        public Builder hidden(Boolean hidden) {
            if (hidden == null) {
              throw new MissingRequiredPropertyException("GetRoleTemplateResult", "hidden");
            }
            this.hidden = hidden;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetRoleTemplateResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetRoleTemplateResult", "labels");
            }
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder locked(Boolean locked) {
            if (locked == null) {
              throw new MissingRequiredPropertyException("GetRoleTemplateResult", "locked");
            }
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetRoleTemplateResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder roleTemplateIds(List<String> roleTemplateIds) {
            if (roleTemplateIds == null) {
              throw new MissingRequiredPropertyException("GetRoleTemplateResult", "roleTemplateIds");
            }
            this.roleTemplateIds = roleTemplateIds;
            return this;
        }
        public Builder roleTemplateIds(String... roleTemplateIds) {
            return roleTemplateIds(List.of(roleTemplateIds));
        }
        @CustomType.Setter
        public Builder rules(List<GetRoleTemplateRule> rules) {
            if (rules == null) {
              throw new MissingRequiredPropertyException("GetRoleTemplateResult", "rules");
            }
            this.rules = rules;
            return this;
        }
        public Builder rules(GetRoleTemplateRule... rules) {
            return rules(List.of(rules));
        }
        public GetRoleTemplateResult build() {
            final var _resultValue = new GetRoleTemplateResult();
            _resultValue.administrative = administrative;
            _resultValue.annotations = annotations;
            _resultValue.builtin = builtin;
            _resultValue.context = context;
            _resultValue.defaultRole = defaultRole;
            _resultValue.description = description;
            _resultValue.external = external;
            _resultValue.externalRules = externalRules;
            _resultValue.hidden = hidden;
            _resultValue.id = id;
            _resultValue.labels = labels;
            _resultValue.locked = locked;
            _resultValue.name = name;
            _resultValue.roleTemplateIds = roleTemplateIds;
            _resultValue.rules = rules;
            return _resultValue;
        }
    }
}
