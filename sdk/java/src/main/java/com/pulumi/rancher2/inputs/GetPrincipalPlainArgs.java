// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPrincipalPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrincipalPlainArgs Empty = new GetPrincipalPlainArgs();

    /**
     * The full name of the principal (string)
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The full name of the principal (string)
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The type of the identity (string). Defaults to `user`. Only `user` and `group` values are supported (string)
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return The type of the identity (string). Defaults to `user`. Only `user` and `group` values are supported (string)
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private GetPrincipalPlainArgs() {}

    private GetPrincipalPlainArgs(GetPrincipalPlainArgs $) {
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrincipalPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrincipalPlainArgs $;

        public Builder() {
            $ = new GetPrincipalPlainArgs();
        }

        public Builder(GetPrincipalPlainArgs defaults) {
            $ = new GetPrincipalPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The full name of the principal (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param type The type of the identity (string). Defaults to `user`. Only `user` and `group` values are supported (string)
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public GetPrincipalPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}