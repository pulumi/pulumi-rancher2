// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterAlertRuleSystemServiceRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterAlertRuleSystemServiceRuleArgs Empty = new ClusterAlertRuleSystemServiceRuleArgs();

    /**
     * System service rule condition. Supported values : `&#34;controller-manager&#34; | &#34;etcd&#34; | &#34;scheduler&#34;`. Default: `scheduler` (string)
     * 
     */
    @Import(name="condition")
    private @Nullable Output<String> condition;

    /**
     * @return System service rule condition. Supported values : `&#34;controller-manager&#34; | &#34;etcd&#34; | &#34;scheduler&#34;`. Default: `scheduler` (string)
     * 
     */
    public Optional<Output<String>> condition() {
        return Optional.ofNullable(this.condition);
    }

    private ClusterAlertRuleSystemServiceRuleArgs() {}

    private ClusterAlertRuleSystemServiceRuleArgs(ClusterAlertRuleSystemServiceRuleArgs $) {
        this.condition = $.condition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterAlertRuleSystemServiceRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterAlertRuleSystemServiceRuleArgs $;

        public Builder() {
            $ = new ClusterAlertRuleSystemServiceRuleArgs();
        }

        public Builder(ClusterAlertRuleSystemServiceRuleArgs defaults) {
            $ = new ClusterAlertRuleSystemServiceRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param condition System service rule condition. Supported values : `&#34;controller-manager&#34; | &#34;etcd&#34; | &#34;scheduler&#34;`. Default: `scheduler` (string)
         * 
         * @return builder
         * 
         */
        public Builder condition(@Nullable Output<String> condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param condition System service rule condition. Supported values : `&#34;controller-manager&#34; | &#34;etcd&#34; | &#34;scheduler&#34;`. Default: `scheduler` (string)
         * 
         * @return builder
         * 
         */
        public Builder condition(String condition) {
            return condition(Output.of(condition));
        }

        public ClusterAlertRuleSystemServiceRuleArgs build() {
            return $;
        }
    }

}