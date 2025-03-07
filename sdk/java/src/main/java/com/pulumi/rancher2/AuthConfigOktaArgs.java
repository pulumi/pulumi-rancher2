// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthConfigOktaArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthConfigOktaArgs Empty = new AuthConfigOktaArgs();

    /**
     * Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
     * 
     */
    @Import(name="accessMode")
    private @Nullable Output<String> accessMode;

    /**
     * @return Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
     * 
     */
    public Optional<Output<String>> accessMode() {
        return Optional.ofNullable(this.accessMode);
    }

    /**
     * Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `okta_user://&lt;USER_ID&gt;`  `okta_group://&lt;GROUP_ID&gt;` (list)
     * 
     */
    @Import(name="allowedPrincipalIds")
    private @Nullable Output<List<String>> allowedPrincipalIds;

    /**
     * @return Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `okta_user://&lt;USER_ID&gt;`  `okta_group://&lt;GROUP_ID&gt;` (list)
     * 
     */
    public Optional<Output<List<String>>> allowedPrincipalIds() {
        return Optional.ofNullable(this.allowedPrincipalIds);
    }

    /**
     * Annotations of the resource (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return Annotations of the resource (map)
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * OKTA display name field (string)
     * 
     */
    @Import(name="displayNameField", required=true)
    private Output<String> displayNameField;

    /**
     * @return OKTA display name field (string)
     * 
     */
    public Output<String> displayNameField() {
        return this.displayNameField;
    }

    /**
     * Enable auth config provider. Default `true` (bool)
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enable auth config provider. Default `true` (bool)
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * OKTA group field (string)
     * 
     */
    @Import(name="groupsField", required=true)
    private Output<String> groupsField;

    /**
     * @return OKTA group field (string)
     * 
     */
    public Output<String> groupsField() {
        return this.groupsField;
    }

    /**
     * OKTA IDP metadata content (string)
     * 
     */
    @Import(name="idpMetadataContent", required=true)
    private Output<String> idpMetadataContent;

    /**
     * @return OKTA IDP metadata content (string)
     * 
     */
    public Output<String> idpMetadataContent() {
        return this.idpMetadataContent;
    }

    /**
     * Labels of the resource (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels of the resource (map)
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Rancher URL. URL scheme needs to be specified, `https://&lt;RANCHER_API_HOST&gt;` (string)
     * 
     */
    @Import(name="rancherApiHost", required=true)
    private Output<String> rancherApiHost;

    /**
     * @return Rancher URL. URL scheme needs to be specified, `https://&lt;RANCHER_API_HOST&gt;` (string)
     * 
     */
    public Output<String> rancherApiHost() {
        return this.rancherApiHost;
    }

    /**
     * OKTA SP cert (string)
     * 
     */
    @Import(name="spCert", required=true)
    private Output<String> spCert;

    /**
     * @return OKTA SP cert (string)
     * 
     */
    public Output<String> spCert() {
        return this.spCert;
    }

    /**
     * OKTA SP key (string)
     * 
     */
    @Import(name="spKey", required=true)
    private Output<String> spKey;

    /**
     * @return OKTA SP key (string)
     * 
     */
    public Output<String> spKey() {
        return this.spKey;
    }

    /**
     * OKTA UID field (string)
     * 
     */
    @Import(name="uidField", required=true)
    private Output<String> uidField;

    /**
     * @return OKTA UID field (string)
     * 
     */
    public Output<String> uidField() {
        return this.uidField;
    }

    /**
     * OKTA user name field (string)
     * 
     */
    @Import(name="userNameField", required=true)
    private Output<String> userNameField;

    /**
     * @return OKTA user name field (string)
     * 
     */
    public Output<String> userNameField() {
        return this.userNameField;
    }

    private AuthConfigOktaArgs() {}

    private AuthConfigOktaArgs(AuthConfigOktaArgs $) {
        this.accessMode = $.accessMode;
        this.allowedPrincipalIds = $.allowedPrincipalIds;
        this.annotations = $.annotations;
        this.displayNameField = $.displayNameField;
        this.enabled = $.enabled;
        this.groupsField = $.groupsField;
        this.idpMetadataContent = $.idpMetadataContent;
        this.labels = $.labels;
        this.rancherApiHost = $.rancherApiHost;
        this.spCert = $.spCert;
        this.spKey = $.spKey;
        this.uidField = $.uidField;
        this.userNameField = $.userNameField;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthConfigOktaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthConfigOktaArgs $;

        public Builder() {
            $ = new AuthConfigOktaArgs();
        }

        public Builder(AuthConfigOktaArgs defaults) {
            $ = new AuthConfigOktaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessMode Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
         * 
         * @return builder
         * 
         */
        public Builder accessMode(@Nullable Output<String> accessMode) {
            $.accessMode = accessMode;
            return this;
        }

        /**
         * @param accessMode Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
         * 
         * @return builder
         * 
         */
        public Builder accessMode(String accessMode) {
            return accessMode(Output.of(accessMode));
        }

        /**
         * @param allowedPrincipalIds Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `okta_user://&lt;USER_ID&gt;`  `okta_group://&lt;GROUP_ID&gt;` (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedPrincipalIds(@Nullable Output<List<String>> allowedPrincipalIds) {
            $.allowedPrincipalIds = allowedPrincipalIds;
            return this;
        }

        /**
         * @param allowedPrincipalIds Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `okta_user://&lt;USER_ID&gt;`  `okta_group://&lt;GROUP_ID&gt;` (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedPrincipalIds(List<String> allowedPrincipalIds) {
            return allowedPrincipalIds(Output.of(allowedPrincipalIds));
        }

        /**
         * @param allowedPrincipalIds Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `okta_user://&lt;USER_ID&gt;`  `okta_group://&lt;GROUP_ID&gt;` (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedPrincipalIds(String... allowedPrincipalIds) {
            return allowedPrincipalIds(List.of(allowedPrincipalIds));
        }

        /**
         * @param annotations Annotations of the resource (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations of the resource (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param displayNameField OKTA display name field (string)
         * 
         * @return builder
         * 
         */
        public Builder displayNameField(Output<String> displayNameField) {
            $.displayNameField = displayNameField;
            return this;
        }

        /**
         * @param displayNameField OKTA display name field (string)
         * 
         * @return builder
         * 
         */
        public Builder displayNameField(String displayNameField) {
            return displayNameField(Output.of(displayNameField));
        }

        /**
         * @param enabled Enable auth config provider. Default `true` (bool)
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable auth config provider. Default `true` (bool)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param groupsField OKTA group field (string)
         * 
         * @return builder
         * 
         */
        public Builder groupsField(Output<String> groupsField) {
            $.groupsField = groupsField;
            return this;
        }

        /**
         * @param groupsField OKTA group field (string)
         * 
         * @return builder
         * 
         */
        public Builder groupsField(String groupsField) {
            return groupsField(Output.of(groupsField));
        }

        /**
         * @param idpMetadataContent OKTA IDP metadata content (string)
         * 
         * @return builder
         * 
         */
        public Builder idpMetadataContent(Output<String> idpMetadataContent) {
            $.idpMetadataContent = idpMetadataContent;
            return this;
        }

        /**
         * @param idpMetadataContent OKTA IDP metadata content (string)
         * 
         * @return builder
         * 
         */
        public Builder idpMetadataContent(String idpMetadataContent) {
            return idpMetadataContent(Output.of(idpMetadataContent));
        }

        /**
         * @param labels Labels of the resource (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels of the resource (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param rancherApiHost Rancher URL. URL scheme needs to be specified, `https://&lt;RANCHER_API_HOST&gt;` (string)
         * 
         * @return builder
         * 
         */
        public Builder rancherApiHost(Output<String> rancherApiHost) {
            $.rancherApiHost = rancherApiHost;
            return this;
        }

        /**
         * @param rancherApiHost Rancher URL. URL scheme needs to be specified, `https://&lt;RANCHER_API_HOST&gt;` (string)
         * 
         * @return builder
         * 
         */
        public Builder rancherApiHost(String rancherApiHost) {
            return rancherApiHost(Output.of(rancherApiHost));
        }

        /**
         * @param spCert OKTA SP cert (string)
         * 
         * @return builder
         * 
         */
        public Builder spCert(Output<String> spCert) {
            $.spCert = spCert;
            return this;
        }

        /**
         * @param spCert OKTA SP cert (string)
         * 
         * @return builder
         * 
         */
        public Builder spCert(String spCert) {
            return spCert(Output.of(spCert));
        }

        /**
         * @param spKey OKTA SP key (string)
         * 
         * @return builder
         * 
         */
        public Builder spKey(Output<String> spKey) {
            $.spKey = spKey;
            return this;
        }

        /**
         * @param spKey OKTA SP key (string)
         * 
         * @return builder
         * 
         */
        public Builder spKey(String spKey) {
            return spKey(Output.of(spKey));
        }

        /**
         * @param uidField OKTA UID field (string)
         * 
         * @return builder
         * 
         */
        public Builder uidField(Output<String> uidField) {
            $.uidField = uidField;
            return this;
        }

        /**
         * @param uidField OKTA UID field (string)
         * 
         * @return builder
         * 
         */
        public Builder uidField(String uidField) {
            return uidField(Output.of(uidField));
        }

        /**
         * @param userNameField OKTA user name field (string)
         * 
         * @return builder
         * 
         */
        public Builder userNameField(Output<String> userNameField) {
            $.userNameField = userNameField;
            return this;
        }

        /**
         * @param userNameField OKTA user name field (string)
         * 
         * @return builder
         * 
         */
        public Builder userNameField(String userNameField) {
            return userNameField(Output.of(userNameField));
        }

        public AuthConfigOktaArgs build() {
            if ($.displayNameField == null) {
                throw new MissingRequiredPropertyException("AuthConfigOktaArgs", "displayNameField");
            }
            if ($.groupsField == null) {
                throw new MissingRequiredPropertyException("AuthConfigOktaArgs", "groupsField");
            }
            if ($.idpMetadataContent == null) {
                throw new MissingRequiredPropertyException("AuthConfigOktaArgs", "idpMetadataContent");
            }
            if ($.rancherApiHost == null) {
                throw new MissingRequiredPropertyException("AuthConfigOktaArgs", "rancherApiHost");
            }
            if ($.spCert == null) {
                throw new MissingRequiredPropertyException("AuthConfigOktaArgs", "spCert");
            }
            if ($.spKey == null) {
                throw new MissingRequiredPropertyException("AuthConfigOktaArgs", "spKey");
            }
            if ($.uidField == null) {
                throw new MissingRequiredPropertyException("AuthConfigOktaArgs", "uidField");
            }
            if ($.userNameField == null) {
                throw new MissingRequiredPropertyException("AuthConfigOktaArgs", "userNameField");
            }
            return $;
        }
    }

}
