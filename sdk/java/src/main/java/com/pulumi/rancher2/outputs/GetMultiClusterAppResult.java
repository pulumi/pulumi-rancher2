// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetMultiClusterAppAnswer;
import com.pulumi.rancher2.outputs.GetMultiClusterAppMember;
import com.pulumi.rancher2.outputs.GetMultiClusterAppTarget;
import com.pulumi.rancher2.outputs.GetMultiClusterAppUpgradeStrategy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetMultiClusterAppResult {
    /**
     * @return (Computed) Annotations for multi cluster app object (map)
     * 
     */
    private final Map<String,Object> annotations;
    /**
     * @return (Computed) The multi cluster app answers (list)
     * 
     */
    private final List<GetMultiClusterAppAnswer> answers;
    /**
     * @return (Computed) The multi cluster app catalog name (string)
     * 
     */
    private final String catalogName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return (Computed) Labels for multi cluster app object (map)
     * 
     */
    private final Map<String,Object> labels;
    /**
     * @return (Computed) The multi cluster app members (list)
     * 
     */
    private final List<GetMultiClusterAppMember> members;
    private final String name;
    /**
     * @return (Computed) The multi cluster app revision history limit (int)
     * 
     */
    private final Integer revisionHistoryLimit;
    /**
     * @return (Computed) Current revision id for the multi cluster app (string)
     * 
     */
    private final String revisionId;
    /**
     * @return (Computed) The multi cluster app roles (list)
     * 
     */
    private final List<String> roles;
    /**
     * @return (Computed) The multi cluster app target projects (list)
     * 
     */
    private final List<GetMultiClusterAppTarget> targets;
    /**
     * @return (Computed) The multi cluster app template name (string)
     * 
     */
    private final String templateName;
    /**
     * @return (Computed) The multi cluster app template version (string)
     * 
     */
    private final String templateVersion;
    /**
     * @return (Computed) The multi cluster app template version ID (string)
     * 
     */
    private final String templateVersionId;
    /**
     * @return (Computed) The multi cluster app upgrade strategy (list)
     * 
     */
    private final List<GetMultiClusterAppUpgradeStrategy> upgradeStrategies;

    @CustomType.Constructor
    private GetMultiClusterAppResult(
        @CustomType.Parameter("annotations") Map<String,Object> annotations,
        @CustomType.Parameter("answers") List<GetMultiClusterAppAnswer> answers,
        @CustomType.Parameter("catalogName") String catalogName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("labels") Map<String,Object> labels,
        @CustomType.Parameter("members") List<GetMultiClusterAppMember> members,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("revisionHistoryLimit") Integer revisionHistoryLimit,
        @CustomType.Parameter("revisionId") String revisionId,
        @CustomType.Parameter("roles") List<String> roles,
        @CustomType.Parameter("targets") List<GetMultiClusterAppTarget> targets,
        @CustomType.Parameter("templateName") String templateName,
        @CustomType.Parameter("templateVersion") String templateVersion,
        @CustomType.Parameter("templateVersionId") String templateVersionId,
        @CustomType.Parameter("upgradeStrategies") List<GetMultiClusterAppUpgradeStrategy> upgradeStrategies) {
        this.annotations = annotations;
        this.answers = answers;
        this.catalogName = catalogName;
        this.id = id;
        this.labels = labels;
        this.members = members;
        this.name = name;
        this.revisionHistoryLimit = revisionHistoryLimit;
        this.revisionId = revisionId;
        this.roles = roles;
        this.targets = targets;
        this.templateName = templateName;
        this.templateVersion = templateVersion;
        this.templateVersionId = templateVersionId;
        this.upgradeStrategies = upgradeStrategies;
    }

    /**
     * @return (Computed) Annotations for multi cluster app object (map)
     * 
     */
    public Map<String,Object> annotations() {
        return this.annotations;
    }
    /**
     * @return (Computed) The multi cluster app answers (list)
     * 
     */
    public List<GetMultiClusterAppAnswer> answers() {
        return this.answers;
    }
    /**
     * @return (Computed) The multi cluster app catalog name (string)
     * 
     */
    public String catalogName() {
        return this.catalogName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Computed) Labels for multi cluster app object (map)
     * 
     */
    public Map<String,Object> labels() {
        return this.labels;
    }
    /**
     * @return (Computed) The multi cluster app members (list)
     * 
     */
    public List<GetMultiClusterAppMember> members() {
        return this.members;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return (Computed) The multi cluster app revision history limit (int)
     * 
     */
    public Integer revisionHistoryLimit() {
        return this.revisionHistoryLimit;
    }
    /**
     * @return (Computed) Current revision id for the multi cluster app (string)
     * 
     */
    public String revisionId() {
        return this.revisionId;
    }
    /**
     * @return (Computed) The multi cluster app roles (list)
     * 
     */
    public List<String> roles() {
        return this.roles;
    }
    /**
     * @return (Computed) The multi cluster app target projects (list)
     * 
     */
    public List<GetMultiClusterAppTarget> targets() {
        return this.targets;
    }
    /**
     * @return (Computed) The multi cluster app template name (string)
     * 
     */
    public String templateName() {
        return this.templateName;
    }
    /**
     * @return (Computed) The multi cluster app template version (string)
     * 
     */
    public String templateVersion() {
        return this.templateVersion;
    }
    /**
     * @return (Computed) The multi cluster app template version ID (string)
     * 
     */
    public String templateVersionId() {
        return this.templateVersionId;
    }
    /**
     * @return (Computed) The multi cluster app upgrade strategy (list)
     * 
     */
    public List<GetMultiClusterAppUpgradeStrategy> upgradeStrategies() {
        return this.upgradeStrategies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMultiClusterAppResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,Object> annotations;
        private List<GetMultiClusterAppAnswer> answers;
        private String catalogName;
        private String id;
        private Map<String,Object> labels;
        private List<GetMultiClusterAppMember> members;
        private String name;
        private Integer revisionHistoryLimit;
        private String revisionId;
        private List<String> roles;
        private List<GetMultiClusterAppTarget> targets;
        private String templateName;
        private String templateVersion;
        private String templateVersionId;
        private List<GetMultiClusterAppUpgradeStrategy> upgradeStrategies;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMultiClusterAppResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.answers = defaults.answers;
    	      this.catalogName = defaults.catalogName;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.members = defaults.members;
    	      this.name = defaults.name;
    	      this.revisionHistoryLimit = defaults.revisionHistoryLimit;
    	      this.revisionId = defaults.revisionId;
    	      this.roles = defaults.roles;
    	      this.targets = defaults.targets;
    	      this.templateName = defaults.templateName;
    	      this.templateVersion = defaults.templateVersion;
    	      this.templateVersionId = defaults.templateVersionId;
    	      this.upgradeStrategies = defaults.upgradeStrategies;
        }

        public Builder annotations(Map<String,Object> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }
        public Builder answers(List<GetMultiClusterAppAnswer> answers) {
            this.answers = Objects.requireNonNull(answers);
            return this;
        }
        public Builder answers(GetMultiClusterAppAnswer... answers) {
            return answers(List.of(answers));
        }
        public Builder catalogName(String catalogName) {
            this.catalogName = Objects.requireNonNull(catalogName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder labels(Map<String,Object> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder members(List<GetMultiClusterAppMember> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }
        public Builder members(GetMultiClusterAppMember... members) {
            return members(List.of(members));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder revisionHistoryLimit(Integer revisionHistoryLimit) {
            this.revisionHistoryLimit = Objects.requireNonNull(revisionHistoryLimit);
            return this;
        }
        public Builder revisionId(String revisionId) {
            this.revisionId = Objects.requireNonNull(revisionId);
            return this;
        }
        public Builder roles(List<String> roles) {
            this.roles = Objects.requireNonNull(roles);
            return this;
        }
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }
        public Builder targets(List<GetMultiClusterAppTarget> targets) {
            this.targets = Objects.requireNonNull(targets);
            return this;
        }
        public Builder targets(GetMultiClusterAppTarget... targets) {
            return targets(List.of(targets));
        }
        public Builder templateName(String templateName) {
            this.templateName = Objects.requireNonNull(templateName);
            return this;
        }
        public Builder templateVersion(String templateVersion) {
            this.templateVersion = Objects.requireNonNull(templateVersion);
            return this;
        }
        public Builder templateVersionId(String templateVersionId) {
            this.templateVersionId = Objects.requireNonNull(templateVersionId);
            return this;
        }
        public Builder upgradeStrategies(List<GetMultiClusterAppUpgradeStrategy> upgradeStrategies) {
            this.upgradeStrategies = Objects.requireNonNull(upgradeStrategies);
            return this;
        }
        public Builder upgradeStrategies(GetMultiClusterAppUpgradeStrategy... upgradeStrategies) {
            return upgradeStrategies(List.of(upgradeStrategies));
        }        public GetMultiClusterAppResult build() {
            return new GetMultiClusterAppResult(annotations, answers, catalogName, id, labels, members, name, revisionHistoryLimit, revisionId, roles, targets, templateName, templateVersion, templateVersionId, upgradeStrategies);
        }
    }
}