// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.outputs.GetNotifierDingtalkConfig;
import com.pulumi.rancher2.outputs.GetNotifierMsteamsConfig;
import com.pulumi.rancher2.outputs.GetNotifierPagerdutyConfig;
import com.pulumi.rancher2.outputs.GetNotifierSlackConfig;
import com.pulumi.rancher2.outputs.GetNotifierSmtpConfig;
import com.pulumi.rancher2.outputs.GetNotifierWebhookConfig;
import com.pulumi.rancher2.outputs.GetNotifierWechatConfig;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNotifierResult {
    /**
     * @return (Computed) Annotations for notifier object (map)
     * 
     */
    private Map<String,Object> annotations;
    private String clusterId;
    /**
     * @return (Computed) The notifier description (string)
     * 
     */
    private String description;
    /**
     * @return (Computed) Dingtalk config for notifier (list maxitems:1)
     * 
     */
    private @Nullable GetNotifierDingtalkConfig dingtalkConfig;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (Computed) Labels for notifier object (map)
     * 
     */
    private Map<String,Object> labels;
    /**
     * @return (Computed) MSTeams config for notifier (list maxitems:1)
     * 
     */
    private @Nullable GetNotifierMsteamsConfig msteamsConfig;
    private String name;
    /**
     * @return (Computed) Pagerduty config for notifier (list maxitems:1)
     * 
     */
    private GetNotifierPagerdutyConfig pagerdutyConfig;
    /**
     * @return (Computed) Slack config for notifier (list maxitems:1)
     * 
     */
    private GetNotifierSlackConfig slackConfig;
    /**
     * @return (Computed) SMTP config for notifier (list maxitems:1)
     * 
     */
    private GetNotifierSmtpConfig smtpConfig;
    /**
     * @return (Computed) Webhook config for notifier (list maxitems:1)
     * 
     */
    private GetNotifierWebhookConfig webhookConfig;
    /**
     * @return (Computed) Wechat config for notifier (list maxitems:1)
     * 
     */
    private GetNotifierWechatConfig wechatConfig;

    private GetNotifierResult() {}
    /**
     * @return (Computed) Annotations for notifier object (map)
     * 
     */
    public Map<String,Object> annotations() {
        return this.annotations;
    }
    public String clusterId() {
        return this.clusterId;
    }
    /**
     * @return (Computed) The notifier description (string)
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return (Computed) Dingtalk config for notifier (list maxitems:1)
     * 
     */
    public Optional<GetNotifierDingtalkConfig> dingtalkConfig() {
        return Optional.ofNullable(this.dingtalkConfig);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Computed) Labels for notifier object (map)
     * 
     */
    public Map<String,Object> labels() {
        return this.labels;
    }
    /**
     * @return (Computed) MSTeams config for notifier (list maxitems:1)
     * 
     */
    public Optional<GetNotifierMsteamsConfig> msteamsConfig() {
        return Optional.ofNullable(this.msteamsConfig);
    }
    public String name() {
        return this.name;
    }
    /**
     * @return (Computed) Pagerduty config for notifier (list maxitems:1)
     * 
     */
    public GetNotifierPagerdutyConfig pagerdutyConfig() {
        return this.pagerdutyConfig;
    }
    /**
     * @return (Computed) Slack config for notifier (list maxitems:1)
     * 
     */
    public GetNotifierSlackConfig slackConfig() {
        return this.slackConfig;
    }
    /**
     * @return (Computed) SMTP config for notifier (list maxitems:1)
     * 
     */
    public GetNotifierSmtpConfig smtpConfig() {
        return this.smtpConfig;
    }
    /**
     * @return (Computed) Webhook config for notifier (list maxitems:1)
     * 
     */
    public GetNotifierWebhookConfig webhookConfig() {
        return this.webhookConfig;
    }
    /**
     * @return (Computed) Wechat config for notifier (list maxitems:1)
     * 
     */
    public GetNotifierWechatConfig wechatConfig() {
        return this.wechatConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotifierResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,Object> annotations;
        private String clusterId;
        private String description;
        private @Nullable GetNotifierDingtalkConfig dingtalkConfig;
        private String id;
        private Map<String,Object> labels;
        private @Nullable GetNotifierMsteamsConfig msteamsConfig;
        private String name;
        private GetNotifierPagerdutyConfig pagerdutyConfig;
        private GetNotifierSlackConfig slackConfig;
        private GetNotifierSmtpConfig smtpConfig;
        private GetNotifierWebhookConfig webhookConfig;
        private GetNotifierWechatConfig wechatConfig;
        public Builder() {}
        public Builder(GetNotifierResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.clusterId = defaults.clusterId;
    	      this.description = defaults.description;
    	      this.dingtalkConfig = defaults.dingtalkConfig;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.msteamsConfig = defaults.msteamsConfig;
    	      this.name = defaults.name;
    	      this.pagerdutyConfig = defaults.pagerdutyConfig;
    	      this.slackConfig = defaults.slackConfig;
    	      this.smtpConfig = defaults.smtpConfig;
    	      this.webhookConfig = defaults.webhookConfig;
    	      this.wechatConfig = defaults.wechatConfig;
        }

        @CustomType.Setter
        public Builder annotations(Map<String,Object> annotations) {
            if (annotations == null) {
              throw new MissingRequiredPropertyException("GetNotifierResult", "annotations");
            }
            this.annotations = annotations;
            return this;
        }
        @CustomType.Setter
        public Builder clusterId(String clusterId) {
            if (clusterId == null) {
              throw new MissingRequiredPropertyException("GetNotifierResult", "clusterId");
            }
            this.clusterId = clusterId;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetNotifierResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder dingtalkConfig(@Nullable GetNotifierDingtalkConfig dingtalkConfig) {

            this.dingtalkConfig = dingtalkConfig;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNotifierResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,Object> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetNotifierResult", "labels");
            }
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder msteamsConfig(@Nullable GetNotifierMsteamsConfig msteamsConfig) {

            this.msteamsConfig = msteamsConfig;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetNotifierResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder pagerdutyConfig(GetNotifierPagerdutyConfig pagerdutyConfig) {
            if (pagerdutyConfig == null) {
              throw new MissingRequiredPropertyException("GetNotifierResult", "pagerdutyConfig");
            }
            this.pagerdutyConfig = pagerdutyConfig;
            return this;
        }
        @CustomType.Setter
        public Builder slackConfig(GetNotifierSlackConfig slackConfig) {
            if (slackConfig == null) {
              throw new MissingRequiredPropertyException("GetNotifierResult", "slackConfig");
            }
            this.slackConfig = slackConfig;
            return this;
        }
        @CustomType.Setter
        public Builder smtpConfig(GetNotifierSmtpConfig smtpConfig) {
            if (smtpConfig == null) {
              throw new MissingRequiredPropertyException("GetNotifierResult", "smtpConfig");
            }
            this.smtpConfig = smtpConfig;
            return this;
        }
        @CustomType.Setter
        public Builder webhookConfig(GetNotifierWebhookConfig webhookConfig) {
            if (webhookConfig == null) {
              throw new MissingRequiredPropertyException("GetNotifierResult", "webhookConfig");
            }
            this.webhookConfig = webhookConfig;
            return this;
        }
        @CustomType.Setter
        public Builder wechatConfig(GetNotifierWechatConfig wechatConfig) {
            if (wechatConfig == null) {
              throw new MissingRequiredPropertyException("GetNotifierResult", "wechatConfig");
            }
            this.wechatConfig = wechatConfig;
            return this;
        }
        public GetNotifierResult build() {
            final var _resultValue = new GetNotifierResult();
            _resultValue.annotations = annotations;
            _resultValue.clusterId = clusterId;
            _resultValue.description = description;
            _resultValue.dingtalkConfig = dingtalkConfig;
            _resultValue.id = id;
            _resultValue.labels = labels;
            _resultValue.msteamsConfig = msteamsConfig;
            _resultValue.name = name;
            _resultValue.pagerdutyConfig = pagerdutyConfig;
            _resultValue.slackConfig = slackConfig;
            _resultValue.smtpConfig = smtpConfig;
            _resultValue.webhookConfig = webhookConfig;
            _resultValue.wechatConfig = wechatConfig;
            return _resultValue;
        }
    }
}
