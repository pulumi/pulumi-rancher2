// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.RoleTemplateExternalRuleArgs;
import com.pulumi.rancher2.inputs.RoleTemplateRuleArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RoleTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoleTemplateArgs Empty = new RoleTemplateArgs();

    /**
     * Administrative role template. Default `false` (bool)
     * 
     */
    @Import(name="administrative")
    private @Nullable Output<Boolean> administrative;

    /**
     * @return Administrative role template. Default `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> administrative() {
        return Optional.ofNullable(this.administrative);
    }

    /**
     * Annotations for role template object (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return Annotations for role template object (map)
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
     * 
     */
    @Import(name="context")
    private @Nullable Output<String> context;

    /**
     * @return Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
     * 
     */
    public Optional<Output<String>> context() {
        return Optional.ofNullable(this.context);
    }

    /**
     * Default role template for new created cluster or project. Default `false` (bool)
     * 
     */
    @Import(name="defaultRole")
    private @Nullable Output<Boolean> defaultRole;

    /**
     * @return Default role template for new created cluster or project. Default `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> defaultRole() {
        return Optional.ofNullable(this.defaultRole);
    }

    /**
     * Role template description (string)
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Role template description (string)
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * External role template. Default `false` (bool)
     * 
     */
    @Import(name="external")
    private @Nullable Output<Boolean> external;

    /**
     * @return External role template. Default `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> external() {
        return Optional.ofNullable(this.external);
    }

    /**
     * External rules used for authorization. This field is required when `external=true` and no underlying ClusterRole exists. (list)
     * 
     */
    @Import(name="externalRules")
    private @Nullable Output<List<RoleTemplateExternalRuleArgs>> externalRules;

    /**
     * @return External rules used for authorization. This field is required when `external=true` and no underlying ClusterRole exists. (list)
     * 
     */
    public Optional<Output<List<RoleTemplateExternalRuleArgs>>> externalRules() {
        return Optional.ofNullable(this.externalRules);
    }

    /**
     * Hidden role template. Default `false` (bool)
     * 
     */
    @Import(name="hidden")
    private @Nullable Output<Boolean> hidden;

    /**
     * @return Hidden role template. Default `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> hidden() {
        return Optional.ofNullable(this.hidden);
    }

    /**
     * Labels for role template object (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels for role template object (map)
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Locked role template. Default `false` (bool)
     * 
     */
    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    /**
     * @return Locked role template. Default `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    /**
     * Role template name (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Role template name (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Inherit role template IDs (list)
     * 
     */
    @Import(name="roleTemplateIds")
    private @Nullable Output<List<String>> roleTemplateIds;

    /**
     * @return Inherit role template IDs (list)
     * 
     */
    public Optional<Output<List<String>>> roleTemplateIds() {
        return Optional.ofNullable(this.roleTemplateIds);
    }

    /**
     * Role template policy rules (list)
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<RoleTemplateRuleArgs>> rules;

    /**
     * @return Role template policy rules (list)
     * 
     */
    public Optional<Output<List<RoleTemplateRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private RoleTemplateArgs() {}

    private RoleTemplateArgs(RoleTemplateArgs $) {
        this.administrative = $.administrative;
        this.annotations = $.annotations;
        this.context = $.context;
        this.defaultRole = $.defaultRole;
        this.description = $.description;
        this.external = $.external;
        this.externalRules = $.externalRules;
        this.hidden = $.hidden;
        this.labels = $.labels;
        this.locked = $.locked;
        this.name = $.name;
        this.roleTemplateIds = $.roleTemplateIds;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoleTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoleTemplateArgs $;

        public Builder() {
            $ = new RoleTemplateArgs();
        }

        public Builder(RoleTemplateArgs defaults) {
            $ = new RoleTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param administrative Administrative role template. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder administrative(@Nullable Output<Boolean> administrative) {
            $.administrative = administrative;
            return this;
        }

        /**
         * @param administrative Administrative role template. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder administrative(Boolean administrative) {
            return administrative(Output.of(administrative));
        }

        /**
         * @param annotations Annotations for role template object (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations for role template object (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param context Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
         * 
         * @return builder
         * 
         */
        public Builder context(@Nullable Output<String> context) {
            $.context = context;
            return this;
        }

        /**
         * @param context Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
         * 
         * @return builder
         * 
         */
        public Builder context(String context) {
            return context(Output.of(context));
        }

        /**
         * @param defaultRole Default role template for new created cluster or project. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder defaultRole(@Nullable Output<Boolean> defaultRole) {
            $.defaultRole = defaultRole;
            return this;
        }

        /**
         * @param defaultRole Default role template for new created cluster or project. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder defaultRole(Boolean defaultRole) {
            return defaultRole(Output.of(defaultRole));
        }

        /**
         * @param description Role template description (string)
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Role template description (string)
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param external External role template. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder external(@Nullable Output<Boolean> external) {
            $.external = external;
            return this;
        }

        /**
         * @param external External role template. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder external(Boolean external) {
            return external(Output.of(external));
        }

        /**
         * @param externalRules External rules used for authorization. This field is required when `external=true` and no underlying ClusterRole exists. (list)
         * 
         * @return builder
         * 
         */
        public Builder externalRules(@Nullable Output<List<RoleTemplateExternalRuleArgs>> externalRules) {
            $.externalRules = externalRules;
            return this;
        }

        /**
         * @param externalRules External rules used for authorization. This field is required when `external=true` and no underlying ClusterRole exists. (list)
         * 
         * @return builder
         * 
         */
        public Builder externalRules(List<RoleTemplateExternalRuleArgs> externalRules) {
            return externalRules(Output.of(externalRules));
        }

        /**
         * @param externalRules External rules used for authorization. This field is required when `external=true` and no underlying ClusterRole exists. (list)
         * 
         * @return builder
         * 
         */
        public Builder externalRules(RoleTemplateExternalRuleArgs... externalRules) {
            return externalRules(List.of(externalRules));
        }

        /**
         * @param hidden Hidden role template. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder hidden(@Nullable Output<Boolean> hidden) {
            $.hidden = hidden;
            return this;
        }

        /**
         * @param hidden Hidden role template. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder hidden(Boolean hidden) {
            return hidden(Output.of(hidden));
        }

        /**
         * @param labels Labels for role template object (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for role template object (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param locked Locked role template. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        /**
         * @param locked Locked role template. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        /**
         * @param name Role template name (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Role template name (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param roleTemplateIds Inherit role template IDs (list)
         * 
         * @return builder
         * 
         */
        public Builder roleTemplateIds(@Nullable Output<List<String>> roleTemplateIds) {
            $.roleTemplateIds = roleTemplateIds;
            return this;
        }

        /**
         * @param roleTemplateIds Inherit role template IDs (list)
         * 
         * @return builder
         * 
         */
        public Builder roleTemplateIds(List<String> roleTemplateIds) {
            return roleTemplateIds(Output.of(roleTemplateIds));
        }

        /**
         * @param roleTemplateIds Inherit role template IDs (list)
         * 
         * @return builder
         * 
         */
        public Builder roleTemplateIds(String... roleTemplateIds) {
            return roleTemplateIds(List.of(roleTemplateIds));
        }

        /**
         * @param rules Role template policy rules (list)
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<RoleTemplateRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules Role template policy rules (list)
         * 
         * @return builder
         * 
         */
        public Builder rules(List<RoleTemplateRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules Role template policy rules (list)
         * 
         * @return builder
         * 
         */
        public Builder rules(RoleTemplateRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public RoleTemplateArgs build() {
            return $;
        }
    }

}
