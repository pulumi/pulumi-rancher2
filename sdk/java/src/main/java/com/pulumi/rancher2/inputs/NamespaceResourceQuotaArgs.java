// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.NamespaceResourceQuotaLimitArgs;
import java.util.Objects;


public final class NamespaceResourceQuotaArgs extends com.pulumi.resources.ResourceArgs {

    public static final NamespaceResourceQuotaArgs Empty = new NamespaceResourceQuotaArgs();

    /**
     * Resource quota limit for namespace (list maxitems:1)
     * 
     */
    @Import(name="limit", required=true)
    private Output<NamespaceResourceQuotaLimitArgs> limit;

    /**
     * @return Resource quota limit for namespace (list maxitems:1)
     * 
     */
    public Output<NamespaceResourceQuotaLimitArgs> limit() {
        return this.limit;
    }

    private NamespaceResourceQuotaArgs() {}

    private NamespaceResourceQuotaArgs(NamespaceResourceQuotaArgs $) {
        this.limit = $.limit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamespaceResourceQuotaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamespaceResourceQuotaArgs $;

        public Builder() {
            $ = new NamespaceResourceQuotaArgs();
        }

        public Builder(NamespaceResourceQuotaArgs defaults) {
            $ = new NamespaceResourceQuotaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param limit Resource quota limit for namespace (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder limit(Output<NamespaceResourceQuotaLimitArgs> limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param limit Resource quota limit for namespace (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder limit(NamespaceResourceQuotaLimitArgs limit) {
            return limit(Output.of(limit));
        }

        public NamespaceResourceQuotaArgs build() {
            $.limit = Objects.requireNonNull($.limit, "expected parameter 'limit' to be non-null");
            return $;
        }
    }

}