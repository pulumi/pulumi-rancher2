// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.PodSecurityPolicyTemplateSeLinuxSeLinuxOption;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PodSecurityPolicyTemplateSeLinux {
    /**
     * @return (string)
     * 
     */
    private final String rule;
    /**
     * @return (list maxitems:1)
     * 
     */
    private final @Nullable PodSecurityPolicyTemplateSeLinuxSeLinuxOption seLinuxOption;

    @CustomType.Constructor
    private PodSecurityPolicyTemplateSeLinux(
        @CustomType.Parameter("rule") String rule,
        @CustomType.Parameter("seLinuxOption") @Nullable PodSecurityPolicyTemplateSeLinuxSeLinuxOption seLinuxOption) {
        this.rule = rule;
        this.seLinuxOption = seLinuxOption;
    }

    /**
     * @return (string)
     * 
     */
    public String rule() {
        return this.rule;
    }
    /**
     * @return (list maxitems:1)
     * 
     */
    public Optional<PodSecurityPolicyTemplateSeLinuxSeLinuxOption> seLinuxOption() {
        return Optional.ofNullable(this.seLinuxOption);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodSecurityPolicyTemplateSeLinux defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String rule;
        private @Nullable PodSecurityPolicyTemplateSeLinuxSeLinuxOption seLinuxOption;

        public Builder() {
    	      // Empty
        }

        public Builder(PodSecurityPolicyTemplateSeLinux defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rule = defaults.rule;
    	      this.seLinuxOption = defaults.seLinuxOption;
        }

        public Builder rule(String rule) {
            this.rule = Objects.requireNonNull(rule);
            return this;
        }
        public Builder seLinuxOption(@Nullable PodSecurityPolicyTemplateSeLinuxSeLinuxOption seLinuxOption) {
            this.seLinuxOption = seLinuxOption;
            return this;
        }        public PodSecurityPolicyTemplateSeLinux build() {
            return new PodSecurityPolicyTemplateSeLinux(rule, seLinuxOption);
        }
    }
}