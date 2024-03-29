// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGlobalRoleBindingPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGlobalRoleBindingPlainArgs Empty = new GetGlobalRoleBindingPlainArgs();

    /**
     * The global role id (string)
     * 
     */
    @Import(name="globalRoleId")
    private @Nullable String globalRoleId;

    /**
     * @return The global role id (string)
     * 
     */
    public Optional<String> globalRoleId() {
        return Optional.ofNullable(this.globalRoleId);
    }

    /**
     * The name of the global role binding (string)
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the global role binding (string)
     * 
     */
    public String name() {
        return this.name;
    }

    private GetGlobalRoleBindingPlainArgs() {}

    private GetGlobalRoleBindingPlainArgs(GetGlobalRoleBindingPlainArgs $) {
        this.globalRoleId = $.globalRoleId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGlobalRoleBindingPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGlobalRoleBindingPlainArgs $;

        public Builder() {
            $ = new GetGlobalRoleBindingPlainArgs();
        }

        public Builder(GetGlobalRoleBindingPlainArgs defaults) {
            $ = new GetGlobalRoleBindingPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param globalRoleId The global role id (string)
         * 
         * @return builder
         * 
         */
        public Builder globalRoleId(@Nullable String globalRoleId) {
            $.globalRoleId = globalRoleId;
            return this;
        }

        /**
         * @param name The name of the global role binding (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetGlobalRoleBindingPlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetGlobalRoleBindingPlainArgs", "name");
            }
            return $;
        }
    }

}
