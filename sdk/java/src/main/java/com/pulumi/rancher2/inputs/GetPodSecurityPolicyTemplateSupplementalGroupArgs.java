// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.GetPodSecurityPolicyTemplateSupplementalGroupRangeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPodSecurityPolicyTemplateSupplementalGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPodSecurityPolicyTemplateSupplementalGroupArgs Empty = new GetPodSecurityPolicyTemplateSupplementalGroupArgs();

    @Import(name="ranges", required=true)
    private Output<List<GetPodSecurityPolicyTemplateSupplementalGroupRangeArgs>> ranges;

    public Output<List<GetPodSecurityPolicyTemplateSupplementalGroupRangeArgs>> ranges() {
        return this.ranges;
    }

    @Import(name="rule")
    private @Nullable Output<String> rule;

    public Optional<Output<String>> rule() {
        return Optional.ofNullable(this.rule);
    }

    private GetPodSecurityPolicyTemplateSupplementalGroupArgs() {}

    private GetPodSecurityPolicyTemplateSupplementalGroupArgs(GetPodSecurityPolicyTemplateSupplementalGroupArgs $) {
        this.ranges = $.ranges;
        this.rule = $.rule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPodSecurityPolicyTemplateSupplementalGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPodSecurityPolicyTemplateSupplementalGroupArgs $;

        public Builder() {
            $ = new GetPodSecurityPolicyTemplateSupplementalGroupArgs();
        }

        public Builder(GetPodSecurityPolicyTemplateSupplementalGroupArgs defaults) {
            $ = new GetPodSecurityPolicyTemplateSupplementalGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder ranges(Output<List<GetPodSecurityPolicyTemplateSupplementalGroupRangeArgs>> ranges) {
            $.ranges = ranges;
            return this;
        }

        public Builder ranges(List<GetPodSecurityPolicyTemplateSupplementalGroupRangeArgs> ranges) {
            return ranges(Output.of(ranges));
        }

        public Builder ranges(GetPodSecurityPolicyTemplateSupplementalGroupRangeArgs... ranges) {
            return ranges(List.of(ranges));
        }

        public Builder rule(@Nullable Output<String> rule) {
            $.rule = rule;
            return this;
        }

        public Builder rule(String rule) {
            return rule(Output.of(rule));
        }

        public GetPodSecurityPolicyTemplateSupplementalGroupArgs build() {
            $.ranges = Objects.requireNonNull($.ranges, "expected parameter 'ranges' to be non-null");
            return $;
        }
    }

}