// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.inputs.PodSecurityPolicyTemplateSeLinuxSeLinuxOptionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PodSecurityPolicyTemplateSeLinuxArgs extends com.pulumi.resources.ResourceArgs {

    public static final PodSecurityPolicyTemplateSeLinuxArgs Empty = new PodSecurityPolicyTemplateSeLinuxArgs();

    /**
     * (string)
     * 
     */
    @Import(name="rule", required=true)
    private Output<String> rule;

    /**
     * @return (string)
     * 
     */
    public Output<String> rule() {
        return this.rule;
    }

    /**
     * (list maxitems:1)
     * 
     */
    @Import(name="seLinuxOption")
    private @Nullable Output<PodSecurityPolicyTemplateSeLinuxSeLinuxOptionArgs> seLinuxOption;

    /**
     * @return (list maxitems:1)
     * 
     */
    public Optional<Output<PodSecurityPolicyTemplateSeLinuxSeLinuxOptionArgs>> seLinuxOption() {
        return Optional.ofNullable(this.seLinuxOption);
    }

    private PodSecurityPolicyTemplateSeLinuxArgs() {}

    private PodSecurityPolicyTemplateSeLinuxArgs(PodSecurityPolicyTemplateSeLinuxArgs $) {
        this.rule = $.rule;
        this.seLinuxOption = $.seLinuxOption;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PodSecurityPolicyTemplateSeLinuxArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PodSecurityPolicyTemplateSeLinuxArgs $;

        public Builder() {
            $ = new PodSecurityPolicyTemplateSeLinuxArgs();
        }

        public Builder(PodSecurityPolicyTemplateSeLinuxArgs defaults) {
            $ = new PodSecurityPolicyTemplateSeLinuxArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param rule (string)
         * 
         * @return builder
         * 
         */
        public Builder rule(Output<String> rule) {
            $.rule = rule;
            return this;
        }

        /**
         * @param rule (string)
         * 
         * @return builder
         * 
         */
        public Builder rule(String rule) {
            return rule(Output.of(rule));
        }

        /**
         * @param seLinuxOption (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder seLinuxOption(@Nullable Output<PodSecurityPolicyTemplateSeLinuxSeLinuxOptionArgs> seLinuxOption) {
            $.seLinuxOption = seLinuxOption;
            return this;
        }

        /**
         * @param seLinuxOption (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder seLinuxOption(PodSecurityPolicyTemplateSeLinuxSeLinuxOptionArgs seLinuxOption) {
            return seLinuxOption(Output.of(seLinuxOption));
        }

        public PodSecurityPolicyTemplateSeLinuxArgs build() {
            if ($.rule == null) {
                throw new MissingRequiredPropertyException("PodSecurityPolicyTemplateSeLinuxArgs", "rule");
            }
            return $;
        }
    }

}
