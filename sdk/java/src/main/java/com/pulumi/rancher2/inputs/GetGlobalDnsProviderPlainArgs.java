// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetGlobalDnsProviderPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGlobalDnsProviderPlainArgs Empty = new GetGlobalDnsProviderPlainArgs();

    /**
     * The name of the global DNS provider (string)
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the global DNS provider (string)
     * 
     */
    public String name() {
        return this.name;
    }

    private GetGlobalDnsProviderPlainArgs() {}

    private GetGlobalDnsProviderPlainArgs(GetGlobalDnsProviderPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGlobalDnsProviderPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGlobalDnsProviderPlainArgs $;

        public Builder() {
            $ = new GetGlobalDnsProviderPlainArgs();
        }

        public Builder(GetGlobalDnsProviderPlainArgs defaults) {
            $ = new GetGlobalDnsProviderPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the global DNS provider (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetGlobalDnsProviderPlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetGlobalDnsProviderPlainArgs", "name");
            }
            return $;
        }
    }

}
