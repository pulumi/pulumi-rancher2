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


public final class NotifierSlackConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotifierSlackConfigArgs Empty = new NotifierSlackConfigArgs();

    /**
     * Slack default channel
     * 
     */
    @Import(name="defaultRecipient", required=true)
    private Output<String> defaultRecipient;

    /**
     * @return Slack default channel
     * 
     */
    public Output<String> defaultRecipient() {
        return this.defaultRecipient;
    }

    /**
     * Slack proxy URL
     * 
     */
    @Import(name="proxyUrl")
    private @Nullable Output<String> proxyUrl;

    /**
     * @return Slack proxy URL
     * 
     */
    public Optional<Output<String>> proxyUrl() {
        return Optional.ofNullable(this.proxyUrl);
    }

    /**
     * Slack URL
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return Slack URL
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private NotifierSlackConfigArgs() {}

    private NotifierSlackConfigArgs(NotifierSlackConfigArgs $) {
        this.defaultRecipient = $.defaultRecipient;
        this.proxyUrl = $.proxyUrl;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotifierSlackConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotifierSlackConfigArgs $;

        public Builder() {
            $ = new NotifierSlackConfigArgs();
        }

        public Builder(NotifierSlackConfigArgs defaults) {
            $ = new NotifierSlackConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultRecipient Slack default channel
         * 
         * @return builder
         * 
         */
        public Builder defaultRecipient(Output<String> defaultRecipient) {
            $.defaultRecipient = defaultRecipient;
            return this;
        }

        /**
         * @param defaultRecipient Slack default channel
         * 
         * @return builder
         * 
         */
        public Builder defaultRecipient(String defaultRecipient) {
            return defaultRecipient(Output.of(defaultRecipient));
        }

        /**
         * @param proxyUrl Slack proxy URL
         * 
         * @return builder
         * 
         */
        public Builder proxyUrl(@Nullable Output<String> proxyUrl) {
            $.proxyUrl = proxyUrl;
            return this;
        }

        /**
         * @param proxyUrl Slack proxy URL
         * 
         * @return builder
         * 
         */
        public Builder proxyUrl(String proxyUrl) {
            return proxyUrl(Output.of(proxyUrl));
        }

        /**
         * @param url Slack URL
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url Slack URL
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public NotifierSlackConfigArgs build() {
            if ($.defaultRecipient == null) {
                throw new MissingRequiredPropertyException("NotifierSlackConfigArgs", "defaultRecipient");
            }
            if ($.url == null) {
                throw new MissingRequiredPropertyException("NotifierSlackConfigArgs", "url");
            }
            return $;
        }
    }

}
