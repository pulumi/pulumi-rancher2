// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotifierMsteamsConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotifierMsteamsConfigArgs Empty = new NotifierMsteamsConfigArgs();

    /**
     * MS teams proxy URL
     * 
     */
    @Import(name="proxyUrl")
    private @Nullable Output<String> proxyUrl;

    /**
     * @return MS teams proxy URL
     * 
     */
    public Optional<Output<String>> proxyUrl() {
        return Optional.ofNullable(this.proxyUrl);
    }

    /**
     * Webhook URL
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return Webhook URL
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private NotifierMsteamsConfigArgs() {}

    private NotifierMsteamsConfigArgs(NotifierMsteamsConfigArgs $) {
        this.proxyUrl = $.proxyUrl;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotifierMsteamsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotifierMsteamsConfigArgs $;

        public Builder() {
            $ = new NotifierMsteamsConfigArgs();
        }

        public Builder(NotifierMsteamsConfigArgs defaults) {
            $ = new NotifierMsteamsConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param proxyUrl MS teams proxy URL
         * 
         * @return builder
         * 
         */
        public Builder proxyUrl(@Nullable Output<String> proxyUrl) {
            $.proxyUrl = proxyUrl;
            return this;
        }

        /**
         * @param proxyUrl MS teams proxy URL
         * 
         * @return builder
         * 
         */
        public Builder proxyUrl(String proxyUrl) {
            return proxyUrl(Output.of(proxyUrl));
        }

        /**
         * @param url Webhook URL
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url Webhook URL
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public NotifierMsteamsConfigArgs build() {
            if ($.url == null) {
                throw new MissingRequiredPropertyException("NotifierMsteamsConfigArgs", "url");
            }
            return $;
        }
    }

}
