// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterDriverArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterDriverArgs Empty = new ClusterDriverArgs();

    /**
     * Specify the cluster driver state (bool)
     * 
     */
    @Import(name="active", required=true)
    private Output<Boolean> active;

    /**
     * @return Specify the cluster driver state (bool)
     * 
     */
    public Output<Boolean> active() {
        return this.active;
    }

    /**
     * Actual url of the cluster driver (string)
     * 
     */
    @Import(name="actualUrl")
    private @Nullable Output<String> actualUrl;

    /**
     * @return Actual url of the cluster driver (string)
     * 
     */
    public Optional<Output<String>> actualUrl() {
        return Optional.ofNullable(this.actualUrl);
    }

    /**
     * Annotations of the resource (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,Object>> annotations;

    /**
     * @return Annotations of the resource (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Specify whether the cluster driver is an internal cluster driver or not (bool)
     * 
     */
    @Import(name="builtin", required=true)
    private Output<Boolean> builtin;

    /**
     * @return Specify whether the cluster driver is an internal cluster driver or not (bool)
     * 
     */
    public Output<Boolean> builtin() {
        return this.builtin;
    }

    /**
     * Verify that the downloaded driver matches the expected checksum (string)
     * 
     */
    @Import(name="checksum")
    private @Nullable Output<String> checksum;

    /**
     * @return Verify that the downloaded driver matches the expected checksum (string)
     * 
     */
    public Optional<Output<String>> checksum() {
        return Optional.ofNullable(this.checksum);
    }

    /**
     * Labels of the resource (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return Labels of the resource (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Name of the cluster driver (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the cluster driver (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The URL to load for customized Add Clusters screen for this driver (string)
     * 
     */
    @Import(name="uiUrl")
    private @Nullable Output<String> uiUrl;

    /**
     * @return The URL to load for customized Add Clusters screen for this driver (string)
     * 
     */
    public Optional<Output<String>> uiUrl() {
        return Optional.ofNullable(this.uiUrl);
    }

    /**
     * The URL to download the machine driver binary for 64-bit Linux (string)
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return The URL to download the machine driver binary for 64-bit Linux (string)
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     * Domains to whitelist for the ui (list)
     * 
     */
    @Import(name="whitelistDomains")
    private @Nullable Output<List<String>> whitelistDomains;

    /**
     * @return Domains to whitelist for the ui (list)
     * 
     */
    public Optional<Output<List<String>>> whitelistDomains() {
        return Optional.ofNullable(this.whitelistDomains);
    }

    private ClusterDriverArgs() {}

    private ClusterDriverArgs(ClusterDriverArgs $) {
        this.active = $.active;
        this.actualUrl = $.actualUrl;
        this.annotations = $.annotations;
        this.builtin = $.builtin;
        this.checksum = $.checksum;
        this.labels = $.labels;
        this.name = $.name;
        this.uiUrl = $.uiUrl;
        this.url = $.url;
        this.whitelistDomains = $.whitelistDomains;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterDriverArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterDriverArgs $;

        public Builder() {
            $ = new ClusterDriverArgs();
        }

        public Builder(ClusterDriverArgs defaults) {
            $ = new ClusterDriverArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param active Specify the cluster driver state (bool)
         * 
         * @return builder
         * 
         */
        public Builder active(Output<Boolean> active) {
            $.active = active;
            return this;
        }

        /**
         * @param active Specify the cluster driver state (bool)
         * 
         * @return builder
         * 
         */
        public Builder active(Boolean active) {
            return active(Output.of(active));
        }

        /**
         * @param actualUrl Actual url of the cluster driver (string)
         * 
         * @return builder
         * 
         */
        public Builder actualUrl(@Nullable Output<String> actualUrl) {
            $.actualUrl = actualUrl;
            return this;
        }

        /**
         * @param actualUrl Actual url of the cluster driver (string)
         * 
         * @return builder
         * 
         */
        public Builder actualUrl(String actualUrl) {
            return actualUrl(Output.of(actualUrl));
        }

        /**
         * @param annotations Annotations of the resource (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations of the resource (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param builtin Specify whether the cluster driver is an internal cluster driver or not (bool)
         * 
         * @return builder
         * 
         */
        public Builder builtin(Output<Boolean> builtin) {
            $.builtin = builtin;
            return this;
        }

        /**
         * @param builtin Specify whether the cluster driver is an internal cluster driver or not (bool)
         * 
         * @return builder
         * 
         */
        public Builder builtin(Boolean builtin) {
            return builtin(Output.of(builtin));
        }

        /**
         * @param checksum Verify that the downloaded driver matches the expected checksum (string)
         * 
         * @return builder
         * 
         */
        public Builder checksum(@Nullable Output<String> checksum) {
            $.checksum = checksum;
            return this;
        }

        /**
         * @param checksum Verify that the downloaded driver matches the expected checksum (string)
         * 
         * @return builder
         * 
         */
        public Builder checksum(String checksum) {
            return checksum(Output.of(checksum));
        }

        /**
         * @param labels Labels of the resource (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels of the resource (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name Name of the cluster driver (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the cluster driver (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param uiUrl The URL to load for customized Add Clusters screen for this driver (string)
         * 
         * @return builder
         * 
         */
        public Builder uiUrl(@Nullable Output<String> uiUrl) {
            $.uiUrl = uiUrl;
            return this;
        }

        /**
         * @param uiUrl The URL to load for customized Add Clusters screen for this driver (string)
         * 
         * @return builder
         * 
         */
        public Builder uiUrl(String uiUrl) {
            return uiUrl(Output.of(uiUrl));
        }

        /**
         * @param url The URL to download the machine driver binary for 64-bit Linux (string)
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The URL to download the machine driver binary for 64-bit Linux (string)
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        /**
         * @param whitelistDomains Domains to whitelist for the ui (list)
         * 
         * @return builder
         * 
         */
        public Builder whitelistDomains(@Nullable Output<List<String>> whitelistDomains) {
            $.whitelistDomains = whitelistDomains;
            return this;
        }

        /**
         * @param whitelistDomains Domains to whitelist for the ui (list)
         * 
         * @return builder
         * 
         */
        public Builder whitelistDomains(List<String> whitelistDomains) {
            return whitelistDomains(Output.of(whitelistDomains));
        }

        /**
         * @param whitelistDomains Domains to whitelist for the ui (list)
         * 
         * @return builder
         * 
         */
        public Builder whitelistDomains(String... whitelistDomains) {
            return whitelistDomains(List.of(whitelistDomains));
        }

        public ClusterDriverArgs build() {
            $.active = Objects.requireNonNull($.active, "expected parameter 'active' to be non-null");
            $.builtin = Objects.requireNonNull($.builtin, "expected parameter 'builtin' to be non-null");
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}