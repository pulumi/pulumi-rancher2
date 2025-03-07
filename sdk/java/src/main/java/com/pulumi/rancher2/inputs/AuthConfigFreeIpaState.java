// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthConfigFreeIpaState extends com.pulumi.resources.ResourceArgs {

    public static final AuthConfigFreeIpaState Empty = new AuthConfigFreeIpaState();

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
     * Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `freeipa_user://&lt;DN&gt;`  `freeipa_group://&lt;DN&gt;` (list)
     * 
     */
    @Import(name="allowedPrincipalIds")
    private @Nullable Output<List<String>> allowedPrincipalIds;

    /**
     * @return Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `freeipa_user://&lt;DN&gt;`  `freeipa_group://&lt;DN&gt;` (list)
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
     * Base64 encoded CA certificate for TLS if self-signed. Use filebase64(&lt;FILE&gt;) for encoding file (string)
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    /**
     * @return Base64 encoded CA certificate for TLS if self-signed. Use filebase64(&lt;FILE&gt;) for encoding file (string)
     * 
     */
    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * FreeIpa connection timeout. Default `5000` (int)
     * 
     */
    @Import(name="connectionTimeout")
    private @Nullable Output<Integer> connectionTimeout;

    /**
     * @return FreeIpa connection timeout. Default `5000` (int)
     * 
     */
    public Optional<Output<Integer>> connectionTimeout() {
        return Optional.ofNullable(this.connectionTimeout);
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
     * Group DN attribute. Default `entryDN` (string)
     * 
     */
    @Import(name="groupDnAttribute")
    private @Nullable Output<String> groupDnAttribute;

    /**
     * @return Group DN attribute. Default `entryDN` (string)
     * 
     */
    public Optional<Output<String>> groupDnAttribute() {
        return Optional.ofNullable(this.groupDnAttribute);
    }

    /**
     * Group member mapping attribute. Default `member` (string)
     * 
     */
    @Import(name="groupMemberMappingAttribute")
    private @Nullable Output<String> groupMemberMappingAttribute;

    /**
     * @return Group member mapping attribute. Default `member` (string)
     * 
     */
    public Optional<Output<String>> groupMemberMappingAttribute() {
        return Optional.ofNullable(this.groupMemberMappingAttribute);
    }

    /**
     * Group member user attribute. Default `entryDN` (string)
     * 
     */
    @Import(name="groupMemberUserAttribute")
    private @Nullable Output<String> groupMemberUserAttribute;

    /**
     * @return Group member user attribute. Default `entryDN` (string)
     * 
     */
    public Optional<Output<String>> groupMemberUserAttribute() {
        return Optional.ofNullable(this.groupMemberUserAttribute);
    }

    /**
     * Group name attribute. Default `cn` (string)
     * 
     */
    @Import(name="groupNameAttribute")
    private @Nullable Output<String> groupNameAttribute;

    /**
     * @return Group name attribute. Default `cn` (string)
     * 
     */
    public Optional<Output<String>> groupNameAttribute() {
        return Optional.ofNullable(this.groupNameAttribute);
    }

    /**
     * Group object class. Default `groupOfNames` (string)
     * 
     */
    @Import(name="groupObjectClass")
    private @Nullable Output<String> groupObjectClass;

    /**
     * @return Group object class. Default `groupOfNames` (string)
     * 
     */
    public Optional<Output<String>> groupObjectClass() {
        return Optional.ofNullable(this.groupObjectClass);
    }

    /**
     * Group search attribute. Default `cn` (string)
     * 
     */
    @Import(name="groupSearchAttribute")
    private @Nullable Output<String> groupSearchAttribute;

    /**
     * @return Group search attribute. Default `cn` (string)
     * 
     */
    public Optional<Output<String>> groupSearchAttribute() {
        return Optional.ofNullable(this.groupSearchAttribute);
    }

    /**
     * Group search base (string)
     * 
     */
    @Import(name="groupSearchBase")
    private @Nullable Output<String> groupSearchBase;

    /**
     * @return Group search base (string)
     * 
     */
    public Optional<Output<String>> groupSearchBase() {
        return Optional.ofNullable(this.groupSearchBase);
    }

    @Import(name="groupSearchFilter")
    private @Nullable Output<String> groupSearchFilter;

    public Optional<Output<String>> groupSearchFilter() {
        return Optional.ofNullable(this.groupSearchFilter);
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
     * (Computed) The name of the resource (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return (Computed) The name of the resource (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Nested group membership enable. Default `false` (bool)
     * 
     */
    @Import(name="nestedGroupMembershipEnabled")
    private @Nullable Output<Boolean> nestedGroupMembershipEnabled;

    /**
     * @return Nested group membership enable. Default `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> nestedGroupMembershipEnabled() {
        return Optional.ofNullable(this.nestedGroupMembershipEnabled);
    }

    /**
     * FreeIpa port. Default `389` (int)
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return FreeIpa port. Default `389` (int)
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * FreeIpa servers list (list)
     * 
     */
    @Import(name="servers")
    private @Nullable Output<List<String>> servers;

    /**
     * @return FreeIpa servers list (list)
     * 
     */
    public Optional<Output<List<String>>> servers() {
        return Optional.ofNullable(this.servers);
    }

    /**
     * Service account DN for access FreeIpa service (string)
     * 
     */
    @Import(name="serviceAccountDistinguishedName")
    private @Nullable Output<String> serviceAccountDistinguishedName;

    /**
     * @return Service account DN for access FreeIpa service (string)
     * 
     */
    public Optional<Output<String>> serviceAccountDistinguishedName() {
        return Optional.ofNullable(this.serviceAccountDistinguishedName);
    }

    /**
     * Service account password for access FreeIpa service (string)
     * 
     */
    @Import(name="serviceAccountPassword")
    private @Nullable Output<String> serviceAccountPassword;

    /**
     * @return Service account password for access FreeIpa service (string)
     * 
     */
    public Optional<Output<String>> serviceAccountPassword() {
        return Optional.ofNullable(this.serviceAccountPassword);
    }

    @Import(name="startTls")
    private @Nullable Output<Boolean> startTls;

    public Optional<Output<Boolean>> startTls() {
        return Optional.ofNullable(this.startTls);
    }

    /**
     * Password for test access to FreeIpa service (string)
     * 
     */
    @Import(name="testPassword")
    private @Nullable Output<String> testPassword;

    /**
     * @return Password for test access to FreeIpa service (string)
     * 
     */
    public Optional<Output<String>> testPassword() {
        return Optional.ofNullable(this.testPassword);
    }

    /**
     * Username for test access to FreeIpa service (string)
     * 
     */
    @Import(name="testUsername")
    private @Nullable Output<String> testUsername;

    /**
     * @return Username for test access to FreeIpa service (string)
     * 
     */
    public Optional<Output<String>> testUsername() {
        return Optional.ofNullable(this.testUsername);
    }

    /**
     * Enable TLS connection (bool)
     * 
     */
    @Import(name="tls")
    private @Nullable Output<Boolean> tls;

    /**
     * @return Enable TLS connection (bool)
     * 
     */
    public Optional<Output<Boolean>> tls() {
        return Optional.ofNullable(this.tls);
    }

    /**
     * (Computed) The type of the resource (string)
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return (Computed) The type of the resource (string)
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * User disabled bit mask (int)
     * 
     */
    @Import(name="userDisabledBitMask")
    private @Nullable Output<Integer> userDisabledBitMask;

    /**
     * @return User disabled bit mask (int)
     * 
     */
    public Optional<Output<Integer>> userDisabledBitMask() {
        return Optional.ofNullable(this.userDisabledBitMask);
    }

    /**
     * User enable attribute (string)
     * 
     */
    @Import(name="userEnabledAttribute")
    private @Nullable Output<String> userEnabledAttribute;

    /**
     * @return User enable attribute (string)
     * 
     */
    public Optional<Output<String>> userEnabledAttribute() {
        return Optional.ofNullable(this.userEnabledAttribute);
    }

    /**
     * User login attribute. Default `uid` (string)
     * 
     */
    @Import(name="userLoginAttribute")
    private @Nullable Output<String> userLoginAttribute;

    /**
     * @return User login attribute. Default `uid` (string)
     * 
     */
    public Optional<Output<String>> userLoginAttribute() {
        return Optional.ofNullable(this.userLoginAttribute);
    }

    /**
     * User member attribute. Default `memberOf` (string)
     * 
     */
    @Import(name="userMemberAttribute")
    private @Nullable Output<String> userMemberAttribute;

    /**
     * @return User member attribute. Default `memberOf` (string)
     * 
     */
    public Optional<Output<String>> userMemberAttribute() {
        return Optional.ofNullable(this.userMemberAttribute);
    }

    /**
     * User name attribute. Default `givenName` (string)
     * 
     */
    @Import(name="userNameAttribute")
    private @Nullable Output<String> userNameAttribute;

    /**
     * @return User name attribute. Default `givenName` (string)
     * 
     */
    public Optional<Output<String>> userNameAttribute() {
        return Optional.ofNullable(this.userNameAttribute);
    }

    /**
     * User object class. Default `inetorgperson` (string)
     * 
     */
    @Import(name="userObjectClass")
    private @Nullable Output<String> userObjectClass;

    /**
     * @return User object class. Default `inetorgperson` (string)
     * 
     */
    public Optional<Output<String>> userObjectClass() {
        return Optional.ofNullable(this.userObjectClass);
    }

    /**
     * User search attribute. Default `uid|sn|givenName` (string)
     * 
     */
    @Import(name="userSearchAttribute")
    private @Nullable Output<String> userSearchAttribute;

    /**
     * @return User search attribute. Default `uid|sn|givenName` (string)
     * 
     */
    public Optional<Output<String>> userSearchAttribute() {
        return Optional.ofNullable(this.userSearchAttribute);
    }

    /**
     * User search base DN (string)
     * 
     */
    @Import(name="userSearchBase")
    private @Nullable Output<String> userSearchBase;

    /**
     * @return User search base DN (string)
     * 
     */
    public Optional<Output<String>> userSearchBase() {
        return Optional.ofNullable(this.userSearchBase);
    }

    @Import(name="userSearchFilter")
    private @Nullable Output<String> userSearchFilter;

    public Optional<Output<String>> userSearchFilter() {
        return Optional.ofNullable(this.userSearchFilter);
    }

    private AuthConfigFreeIpaState() {}

    private AuthConfigFreeIpaState(AuthConfigFreeIpaState $) {
        this.accessMode = $.accessMode;
        this.allowedPrincipalIds = $.allowedPrincipalIds;
        this.annotations = $.annotations;
        this.certificate = $.certificate;
        this.connectionTimeout = $.connectionTimeout;
        this.enabled = $.enabled;
        this.groupDnAttribute = $.groupDnAttribute;
        this.groupMemberMappingAttribute = $.groupMemberMappingAttribute;
        this.groupMemberUserAttribute = $.groupMemberUserAttribute;
        this.groupNameAttribute = $.groupNameAttribute;
        this.groupObjectClass = $.groupObjectClass;
        this.groupSearchAttribute = $.groupSearchAttribute;
        this.groupSearchBase = $.groupSearchBase;
        this.groupSearchFilter = $.groupSearchFilter;
        this.labels = $.labels;
        this.name = $.name;
        this.nestedGroupMembershipEnabled = $.nestedGroupMembershipEnabled;
        this.port = $.port;
        this.servers = $.servers;
        this.serviceAccountDistinguishedName = $.serviceAccountDistinguishedName;
        this.serviceAccountPassword = $.serviceAccountPassword;
        this.startTls = $.startTls;
        this.testPassword = $.testPassword;
        this.testUsername = $.testUsername;
        this.tls = $.tls;
        this.type = $.type;
        this.userDisabledBitMask = $.userDisabledBitMask;
        this.userEnabledAttribute = $.userEnabledAttribute;
        this.userLoginAttribute = $.userLoginAttribute;
        this.userMemberAttribute = $.userMemberAttribute;
        this.userNameAttribute = $.userNameAttribute;
        this.userObjectClass = $.userObjectClass;
        this.userSearchAttribute = $.userSearchAttribute;
        this.userSearchBase = $.userSearchBase;
        this.userSearchFilter = $.userSearchFilter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthConfigFreeIpaState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthConfigFreeIpaState $;

        public Builder() {
            $ = new AuthConfigFreeIpaState();
        }

        public Builder(AuthConfigFreeIpaState defaults) {
            $ = new AuthConfigFreeIpaState(Objects.requireNonNull(defaults));
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
         * @param allowedPrincipalIds Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `freeipa_user://&lt;DN&gt;`  `freeipa_group://&lt;DN&gt;` (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedPrincipalIds(@Nullable Output<List<String>> allowedPrincipalIds) {
            $.allowedPrincipalIds = allowedPrincipalIds;
            return this;
        }

        /**
         * @param allowedPrincipalIds Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `freeipa_user://&lt;DN&gt;`  `freeipa_group://&lt;DN&gt;` (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedPrincipalIds(List<String> allowedPrincipalIds) {
            return allowedPrincipalIds(Output.of(allowedPrincipalIds));
        }

        /**
         * @param allowedPrincipalIds Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `freeipa_user://&lt;DN&gt;`  `freeipa_group://&lt;DN&gt;` (list)
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
         * @param certificate Base64 encoded CA certificate for TLS if self-signed. Use filebase64(&lt;FILE&gt;) for encoding file (string)
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate Base64 encoded CA certificate for TLS if self-signed. Use filebase64(&lt;FILE&gt;) for encoding file (string)
         * 
         * @return builder
         * 
         */
        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param connectionTimeout FreeIpa connection timeout. Default `5000` (int)
         * 
         * @return builder
         * 
         */
        public Builder connectionTimeout(@Nullable Output<Integer> connectionTimeout) {
            $.connectionTimeout = connectionTimeout;
            return this;
        }

        /**
         * @param connectionTimeout FreeIpa connection timeout. Default `5000` (int)
         * 
         * @return builder
         * 
         */
        public Builder connectionTimeout(Integer connectionTimeout) {
            return connectionTimeout(Output.of(connectionTimeout));
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
         * @param groupDnAttribute Group DN attribute. Default `entryDN` (string)
         * 
         * @return builder
         * 
         */
        public Builder groupDnAttribute(@Nullable Output<String> groupDnAttribute) {
            $.groupDnAttribute = groupDnAttribute;
            return this;
        }

        /**
         * @param groupDnAttribute Group DN attribute. Default `entryDN` (string)
         * 
         * @return builder
         * 
         */
        public Builder groupDnAttribute(String groupDnAttribute) {
            return groupDnAttribute(Output.of(groupDnAttribute));
        }

        /**
         * @param groupMemberMappingAttribute Group member mapping attribute. Default `member` (string)
         * 
         * @return builder
         * 
         */
        public Builder groupMemberMappingAttribute(@Nullable Output<String> groupMemberMappingAttribute) {
            $.groupMemberMappingAttribute = groupMemberMappingAttribute;
            return this;
        }

        /**
         * @param groupMemberMappingAttribute Group member mapping attribute. Default `member` (string)
         * 
         * @return builder
         * 
         */
        public Builder groupMemberMappingAttribute(String groupMemberMappingAttribute) {
            return groupMemberMappingAttribute(Output.of(groupMemberMappingAttribute));
        }

        /**
         * @param groupMemberUserAttribute Group member user attribute. Default `entryDN` (string)
         * 
         * @return builder
         * 
         */
        public Builder groupMemberUserAttribute(@Nullable Output<String> groupMemberUserAttribute) {
            $.groupMemberUserAttribute = groupMemberUserAttribute;
            return this;
        }

        /**
         * @param groupMemberUserAttribute Group member user attribute. Default `entryDN` (string)
         * 
         * @return builder
         * 
         */
        public Builder groupMemberUserAttribute(String groupMemberUserAttribute) {
            return groupMemberUserAttribute(Output.of(groupMemberUserAttribute));
        }

        /**
         * @param groupNameAttribute Group name attribute. Default `cn` (string)
         * 
         * @return builder
         * 
         */
        public Builder groupNameAttribute(@Nullable Output<String> groupNameAttribute) {
            $.groupNameAttribute = groupNameAttribute;
            return this;
        }

        /**
         * @param groupNameAttribute Group name attribute. Default `cn` (string)
         * 
         * @return builder
         * 
         */
        public Builder groupNameAttribute(String groupNameAttribute) {
            return groupNameAttribute(Output.of(groupNameAttribute));
        }

        /**
         * @param groupObjectClass Group object class. Default `groupOfNames` (string)
         * 
         * @return builder
         * 
         */
        public Builder groupObjectClass(@Nullable Output<String> groupObjectClass) {
            $.groupObjectClass = groupObjectClass;
            return this;
        }

        /**
         * @param groupObjectClass Group object class. Default `groupOfNames` (string)
         * 
         * @return builder
         * 
         */
        public Builder groupObjectClass(String groupObjectClass) {
            return groupObjectClass(Output.of(groupObjectClass));
        }

        /**
         * @param groupSearchAttribute Group search attribute. Default `cn` (string)
         * 
         * @return builder
         * 
         */
        public Builder groupSearchAttribute(@Nullable Output<String> groupSearchAttribute) {
            $.groupSearchAttribute = groupSearchAttribute;
            return this;
        }

        /**
         * @param groupSearchAttribute Group search attribute. Default `cn` (string)
         * 
         * @return builder
         * 
         */
        public Builder groupSearchAttribute(String groupSearchAttribute) {
            return groupSearchAttribute(Output.of(groupSearchAttribute));
        }

        /**
         * @param groupSearchBase Group search base (string)
         * 
         * @return builder
         * 
         */
        public Builder groupSearchBase(@Nullable Output<String> groupSearchBase) {
            $.groupSearchBase = groupSearchBase;
            return this;
        }

        /**
         * @param groupSearchBase Group search base (string)
         * 
         * @return builder
         * 
         */
        public Builder groupSearchBase(String groupSearchBase) {
            return groupSearchBase(Output.of(groupSearchBase));
        }

        public Builder groupSearchFilter(@Nullable Output<String> groupSearchFilter) {
            $.groupSearchFilter = groupSearchFilter;
            return this;
        }

        public Builder groupSearchFilter(String groupSearchFilter) {
            return groupSearchFilter(Output.of(groupSearchFilter));
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
         * @param name (Computed) The name of the resource (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name (Computed) The name of the resource (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nestedGroupMembershipEnabled Nested group membership enable. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder nestedGroupMembershipEnabled(@Nullable Output<Boolean> nestedGroupMembershipEnabled) {
            $.nestedGroupMembershipEnabled = nestedGroupMembershipEnabled;
            return this;
        }

        /**
         * @param nestedGroupMembershipEnabled Nested group membership enable. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder nestedGroupMembershipEnabled(Boolean nestedGroupMembershipEnabled) {
            return nestedGroupMembershipEnabled(Output.of(nestedGroupMembershipEnabled));
        }

        /**
         * @param port FreeIpa port. Default `389` (int)
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port FreeIpa port. Default `389` (int)
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param servers FreeIpa servers list (list)
         * 
         * @return builder
         * 
         */
        public Builder servers(@Nullable Output<List<String>> servers) {
            $.servers = servers;
            return this;
        }

        /**
         * @param servers FreeIpa servers list (list)
         * 
         * @return builder
         * 
         */
        public Builder servers(List<String> servers) {
            return servers(Output.of(servers));
        }

        /**
         * @param servers FreeIpa servers list (list)
         * 
         * @return builder
         * 
         */
        public Builder servers(String... servers) {
            return servers(List.of(servers));
        }

        /**
         * @param serviceAccountDistinguishedName Service account DN for access FreeIpa service (string)
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountDistinguishedName(@Nullable Output<String> serviceAccountDistinguishedName) {
            $.serviceAccountDistinguishedName = serviceAccountDistinguishedName;
            return this;
        }

        /**
         * @param serviceAccountDistinguishedName Service account DN for access FreeIpa service (string)
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountDistinguishedName(String serviceAccountDistinguishedName) {
            return serviceAccountDistinguishedName(Output.of(serviceAccountDistinguishedName));
        }

        /**
         * @param serviceAccountPassword Service account password for access FreeIpa service (string)
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountPassword(@Nullable Output<String> serviceAccountPassword) {
            $.serviceAccountPassword = serviceAccountPassword;
            return this;
        }

        /**
         * @param serviceAccountPassword Service account password for access FreeIpa service (string)
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountPassword(String serviceAccountPassword) {
            return serviceAccountPassword(Output.of(serviceAccountPassword));
        }

        public Builder startTls(@Nullable Output<Boolean> startTls) {
            $.startTls = startTls;
            return this;
        }

        public Builder startTls(Boolean startTls) {
            return startTls(Output.of(startTls));
        }

        /**
         * @param testPassword Password for test access to FreeIpa service (string)
         * 
         * @return builder
         * 
         */
        public Builder testPassword(@Nullable Output<String> testPassword) {
            $.testPassword = testPassword;
            return this;
        }

        /**
         * @param testPassword Password for test access to FreeIpa service (string)
         * 
         * @return builder
         * 
         */
        public Builder testPassword(String testPassword) {
            return testPassword(Output.of(testPassword));
        }

        /**
         * @param testUsername Username for test access to FreeIpa service (string)
         * 
         * @return builder
         * 
         */
        public Builder testUsername(@Nullable Output<String> testUsername) {
            $.testUsername = testUsername;
            return this;
        }

        /**
         * @param testUsername Username for test access to FreeIpa service (string)
         * 
         * @return builder
         * 
         */
        public Builder testUsername(String testUsername) {
            return testUsername(Output.of(testUsername));
        }

        /**
         * @param tls Enable TLS connection (bool)
         * 
         * @return builder
         * 
         */
        public Builder tls(@Nullable Output<Boolean> tls) {
            $.tls = tls;
            return this;
        }

        /**
         * @param tls Enable TLS connection (bool)
         * 
         * @return builder
         * 
         */
        public Builder tls(Boolean tls) {
            return tls(Output.of(tls));
        }

        /**
         * @param type (Computed) The type of the resource (string)
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type (Computed) The type of the resource (string)
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param userDisabledBitMask User disabled bit mask (int)
         * 
         * @return builder
         * 
         */
        public Builder userDisabledBitMask(@Nullable Output<Integer> userDisabledBitMask) {
            $.userDisabledBitMask = userDisabledBitMask;
            return this;
        }

        /**
         * @param userDisabledBitMask User disabled bit mask (int)
         * 
         * @return builder
         * 
         */
        public Builder userDisabledBitMask(Integer userDisabledBitMask) {
            return userDisabledBitMask(Output.of(userDisabledBitMask));
        }

        /**
         * @param userEnabledAttribute User enable attribute (string)
         * 
         * @return builder
         * 
         */
        public Builder userEnabledAttribute(@Nullable Output<String> userEnabledAttribute) {
            $.userEnabledAttribute = userEnabledAttribute;
            return this;
        }

        /**
         * @param userEnabledAttribute User enable attribute (string)
         * 
         * @return builder
         * 
         */
        public Builder userEnabledAttribute(String userEnabledAttribute) {
            return userEnabledAttribute(Output.of(userEnabledAttribute));
        }

        /**
         * @param userLoginAttribute User login attribute. Default `uid` (string)
         * 
         * @return builder
         * 
         */
        public Builder userLoginAttribute(@Nullable Output<String> userLoginAttribute) {
            $.userLoginAttribute = userLoginAttribute;
            return this;
        }

        /**
         * @param userLoginAttribute User login attribute. Default `uid` (string)
         * 
         * @return builder
         * 
         */
        public Builder userLoginAttribute(String userLoginAttribute) {
            return userLoginAttribute(Output.of(userLoginAttribute));
        }

        /**
         * @param userMemberAttribute User member attribute. Default `memberOf` (string)
         * 
         * @return builder
         * 
         */
        public Builder userMemberAttribute(@Nullable Output<String> userMemberAttribute) {
            $.userMemberAttribute = userMemberAttribute;
            return this;
        }

        /**
         * @param userMemberAttribute User member attribute. Default `memberOf` (string)
         * 
         * @return builder
         * 
         */
        public Builder userMemberAttribute(String userMemberAttribute) {
            return userMemberAttribute(Output.of(userMemberAttribute));
        }

        /**
         * @param userNameAttribute User name attribute. Default `givenName` (string)
         * 
         * @return builder
         * 
         */
        public Builder userNameAttribute(@Nullable Output<String> userNameAttribute) {
            $.userNameAttribute = userNameAttribute;
            return this;
        }

        /**
         * @param userNameAttribute User name attribute. Default `givenName` (string)
         * 
         * @return builder
         * 
         */
        public Builder userNameAttribute(String userNameAttribute) {
            return userNameAttribute(Output.of(userNameAttribute));
        }

        /**
         * @param userObjectClass User object class. Default `inetorgperson` (string)
         * 
         * @return builder
         * 
         */
        public Builder userObjectClass(@Nullable Output<String> userObjectClass) {
            $.userObjectClass = userObjectClass;
            return this;
        }

        /**
         * @param userObjectClass User object class. Default `inetorgperson` (string)
         * 
         * @return builder
         * 
         */
        public Builder userObjectClass(String userObjectClass) {
            return userObjectClass(Output.of(userObjectClass));
        }

        /**
         * @param userSearchAttribute User search attribute. Default `uid|sn|givenName` (string)
         * 
         * @return builder
         * 
         */
        public Builder userSearchAttribute(@Nullable Output<String> userSearchAttribute) {
            $.userSearchAttribute = userSearchAttribute;
            return this;
        }

        /**
         * @param userSearchAttribute User search attribute. Default `uid|sn|givenName` (string)
         * 
         * @return builder
         * 
         */
        public Builder userSearchAttribute(String userSearchAttribute) {
            return userSearchAttribute(Output.of(userSearchAttribute));
        }

        /**
         * @param userSearchBase User search base DN (string)
         * 
         * @return builder
         * 
         */
        public Builder userSearchBase(@Nullable Output<String> userSearchBase) {
            $.userSearchBase = userSearchBase;
            return this;
        }

        /**
         * @param userSearchBase User search base DN (string)
         * 
         * @return builder
         * 
         */
        public Builder userSearchBase(String userSearchBase) {
            return userSearchBase(Output.of(userSearchBase));
        }

        public Builder userSearchFilter(@Nullable Output<String> userSearchFilter) {
            $.userSearchFilter = userSearchFilter;
            return this;
        }

        public Builder userSearchFilter(String userSearchFilter) {
            return userSearchFilter(Output.of(userSearchFilter));
        }

        public AuthConfigFreeIpaState build() {
            return $;
        }
    }

}
