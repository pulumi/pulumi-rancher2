// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.NotifierDingtalkConfigArgs;
import com.pulumi.rancher2.inputs.NotifierMsteamsConfigArgs;
import com.pulumi.rancher2.inputs.NotifierPagerdutyConfigArgs;
import com.pulumi.rancher2.inputs.NotifierSlackConfigArgs;
import com.pulumi.rancher2.inputs.NotifierSmtpConfigArgs;
import com.pulumi.rancher2.inputs.NotifierWebhookConfigArgs;
import com.pulumi.rancher2.inputs.NotifierWechatConfigArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotifierState extends com.pulumi.resources.ResourceArgs {

    public static final NotifierState Empty = new NotifierState();

    /**
     * Annotations for notifier object (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for notifier object (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The cluster id where create notifier (string)
     * 
     */
    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    /**
     * @return The cluster id where create notifier (string)
     * 
     */
    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * The notifier description (string)
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The notifier description (string)
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Dingtalk config for notifier (list maxitems:1)
     * 
     */
    @Import(name="dingtalkConfig")
    private @Nullable Output<NotifierDingtalkConfigArgs> dingtalkConfig;

    /**
     * @return Dingtalk config for notifier (list maxitems:1)
     * 
     */
    public Optional<Output<NotifierDingtalkConfigArgs>> dingtalkConfig() {
        return Optional.ofNullable(this.dingtalkConfig);
    }

    /**
     * Labels for notifier object (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return Labels for notifier object (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * MSTeams config for notifier (list maxitems:1)
     * 
     */
    @Import(name="msteamsConfig")
    private @Nullable Output<NotifierMsteamsConfigArgs> msteamsConfig;

    /**
     * @return MSTeams config for notifier (list maxitems:1)
     * 
     */
    public Optional<Output<NotifierMsteamsConfigArgs>> msteamsConfig() {
        return Optional.ofNullable(this.msteamsConfig);
    }

    /**
     * The name of the notifier (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the notifier (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Pagerduty config for notifier (list maxitems:1)
     * 
     */
    @Import(name="pagerdutyConfig")
    private @Nullable Output<NotifierPagerdutyConfigArgs> pagerdutyConfig;

    /**
     * @return Pagerduty config for notifier (list maxitems:1)
     * 
     */
    public Optional<Output<NotifierPagerdutyConfigArgs>> pagerdutyConfig() {
        return Optional.ofNullable(this.pagerdutyConfig);
    }

    /**
     * = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
     * 
     */
    @Import(name="sendResolved")
    private @Nullable Output<Boolean> sendResolved;

    /**
     * @return = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> sendResolved() {
        return Optional.ofNullable(this.sendResolved);
    }

    /**
     * Slack config for notifier (list maxitems:1)
     * 
     */
    @Import(name="slackConfig")
    private @Nullable Output<NotifierSlackConfigArgs> slackConfig;

    /**
     * @return Slack config for notifier (list maxitems:1)
     * 
     */
    public Optional<Output<NotifierSlackConfigArgs>> slackConfig() {
        return Optional.ofNullable(this.slackConfig);
    }

    /**
     * SMTP config for notifier (list maxitems:1)
     * 
     */
    @Import(name="smtpConfig")
    private @Nullable Output<NotifierSmtpConfigArgs> smtpConfig;

    /**
     * @return SMTP config for notifier (list maxitems:1)
     * 
     */
    public Optional<Output<NotifierSmtpConfigArgs>> smtpConfig() {
        return Optional.ofNullable(this.smtpConfig);
    }

    /**
     * Webhook config for notifier (list maxitems:1)
     * 
     */
    @Import(name="webhookConfig")
    private @Nullable Output<NotifierWebhookConfigArgs> webhookConfig;

    /**
     * @return Webhook config for notifier (list maxitems:1)
     * 
     */
    public Optional<Output<NotifierWebhookConfigArgs>> webhookConfig() {
        return Optional.ofNullable(this.webhookConfig);
    }

    /**
     * Wechat config for notifier (list maxitems:1)
     * 
     */
    @Import(name="wechatConfig")
    private @Nullable Output<NotifierWechatConfigArgs> wechatConfig;

    /**
     * @return Wechat config for notifier (list maxitems:1)
     * 
     */
    public Optional<Output<NotifierWechatConfigArgs>> wechatConfig() {
        return Optional.ofNullable(this.wechatConfig);
    }

    private NotifierState() {}

    private NotifierState(NotifierState $) {
        this.annotations = $.annotations;
        this.clusterId = $.clusterId;
        this.description = $.description;
        this.dingtalkConfig = $.dingtalkConfig;
        this.labels = $.labels;
        this.msteamsConfig = $.msteamsConfig;
        this.name = $.name;
        this.pagerdutyConfig = $.pagerdutyConfig;
        this.sendResolved = $.sendResolved;
        this.slackConfig = $.slackConfig;
        this.smtpConfig = $.smtpConfig;
        this.webhookConfig = $.webhookConfig;
        this.wechatConfig = $.wechatConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotifierState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotifierState $;

        public Builder() {
            $ = new NotifierState();
        }

        public Builder(NotifierState defaults) {
            $ = new NotifierState(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Annotations for notifier object (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations for notifier object (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param clusterId The cluster id where create notifier (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The cluster id where create notifier (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param description The notifier description (string)
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The notifier description (string)
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param dingtalkConfig Dingtalk config for notifier (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder dingtalkConfig(@Nullable Output<NotifierDingtalkConfigArgs> dingtalkConfig) {
            $.dingtalkConfig = dingtalkConfig;
            return this;
        }

        /**
         * @param dingtalkConfig Dingtalk config for notifier (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder dingtalkConfig(NotifierDingtalkConfigArgs dingtalkConfig) {
            return dingtalkConfig(Output.of(dingtalkConfig));
        }

        /**
         * @param labels Labels for notifier object (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for notifier object (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param msteamsConfig MSTeams config for notifier (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder msteamsConfig(@Nullable Output<NotifierMsteamsConfigArgs> msteamsConfig) {
            $.msteamsConfig = msteamsConfig;
            return this;
        }

        /**
         * @param msteamsConfig MSTeams config for notifier (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder msteamsConfig(NotifierMsteamsConfigArgs msteamsConfig) {
            return msteamsConfig(Output.of(msteamsConfig));
        }

        /**
         * @param name The name of the notifier (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the notifier (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param pagerdutyConfig Pagerduty config for notifier (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder pagerdutyConfig(@Nullable Output<NotifierPagerdutyConfigArgs> pagerdutyConfig) {
            $.pagerdutyConfig = pagerdutyConfig;
            return this;
        }

        /**
         * @param pagerdutyConfig Pagerduty config for notifier (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder pagerdutyConfig(NotifierPagerdutyConfigArgs pagerdutyConfig) {
            return pagerdutyConfig(Output.of(pagerdutyConfig));
        }

        /**
         * @param sendResolved = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder sendResolved(@Nullable Output<Boolean> sendResolved) {
            $.sendResolved = sendResolved;
            return this;
        }

        /**
         * @param sendResolved = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder sendResolved(Boolean sendResolved) {
            return sendResolved(Output.of(sendResolved));
        }

        /**
         * @param slackConfig Slack config for notifier (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder slackConfig(@Nullable Output<NotifierSlackConfigArgs> slackConfig) {
            $.slackConfig = slackConfig;
            return this;
        }

        /**
         * @param slackConfig Slack config for notifier (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder slackConfig(NotifierSlackConfigArgs slackConfig) {
            return slackConfig(Output.of(slackConfig));
        }

        /**
         * @param smtpConfig SMTP config for notifier (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder smtpConfig(@Nullable Output<NotifierSmtpConfigArgs> smtpConfig) {
            $.smtpConfig = smtpConfig;
            return this;
        }

        /**
         * @param smtpConfig SMTP config for notifier (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder smtpConfig(NotifierSmtpConfigArgs smtpConfig) {
            return smtpConfig(Output.of(smtpConfig));
        }

        /**
         * @param webhookConfig Webhook config for notifier (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder webhookConfig(@Nullable Output<NotifierWebhookConfigArgs> webhookConfig) {
            $.webhookConfig = webhookConfig;
            return this;
        }

        /**
         * @param webhookConfig Webhook config for notifier (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder webhookConfig(NotifierWebhookConfigArgs webhookConfig) {
            return webhookConfig(Output.of(webhookConfig));
        }

        /**
         * @param wechatConfig Wechat config for notifier (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder wechatConfig(@Nullable Output<NotifierWechatConfigArgs> wechatConfig) {
            $.wechatConfig = wechatConfig;
            return this;
        }

        /**
         * @param wechatConfig Wechat config for notifier (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder wechatConfig(NotifierWechatConfigArgs wechatConfig) {
            return wechatConfig(Output.of(wechatConfig));
        }

        public NotifierState build() {
            return $;
        }
    }

}
