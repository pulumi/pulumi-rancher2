// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetPodSecurityPolicyTemplateSeLinuxSeLinuxOption;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPodSecurityPolicyTemplateSeLinux {
    private final String rule;
    private final @Nullable GetPodSecurityPolicyTemplateSeLinuxSeLinuxOption seLinuxOption;

    @CustomType.Constructor
    private GetPodSecurityPolicyTemplateSeLinux(
        @CustomType.Parameter("rule") String rule,
        @CustomType.Parameter("seLinuxOption") @Nullable GetPodSecurityPolicyTemplateSeLinuxSeLinuxOption seLinuxOption) {
        this.rule = rule;
        this.seLinuxOption = seLinuxOption;
    }

    public String rule() {
        return this.rule;
    }
    public Optional<GetPodSecurityPolicyTemplateSeLinuxSeLinuxOption> seLinuxOption() {
        return Optional.ofNullable(this.seLinuxOption);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPodSecurityPolicyTemplateSeLinux defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String rule;
        private @Nullable GetPodSecurityPolicyTemplateSeLinuxSeLinuxOption seLinuxOption;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPodSecurityPolicyTemplateSeLinux defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rule = defaults.rule;
    	      this.seLinuxOption = defaults.seLinuxOption;
        }

        public Builder rule(String rule) {
            this.rule = Objects.requireNonNull(rule);
            return this;
        }
        public Builder seLinuxOption(@Nullable GetPodSecurityPolicyTemplateSeLinuxSeLinuxOption seLinuxOption) {
            this.seLinuxOption = seLinuxOption;
            return this;
        }        public GetPodSecurityPolicyTemplateSeLinux build() {
            return new GetPodSecurityPolicyTemplateSeLinux(rule, seLinuxOption);
        }
    }
}