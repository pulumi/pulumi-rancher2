// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetUserPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserPlainArgs Empty = new GetUserPlainArgs();

    /**
     * Set is the user if the user is external. Default: `false` (bool)
     * 
     */
    @Import(name="isExternal")
    private @Nullable Boolean isExternal;

    /**
     * @return Set is the user if the user is external. Default: `false` (bool)
     * 
     */
    public Optional<Boolean> isExternal() {
        return Optional.ofNullable(this.isExternal);
    }

    /**
     * The name of the user (string)
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the user (string)
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The username of the user (string)
     * 
     */
    @Import(name="username")
    private @Nullable String username;

    /**
     * @return The username of the user (string)
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    private GetUserPlainArgs() {}

    private GetUserPlainArgs(GetUserPlainArgs $) {
        this.isExternal = $.isExternal;
        this.name = $.name;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserPlainArgs $;

        public Builder() {
            $ = new GetUserPlainArgs();
        }

        public Builder(GetUserPlainArgs defaults) {
            $ = new GetUserPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isExternal Set is the user if the user is external. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder isExternal(@Nullable Boolean isExternal) {
            $.isExternal = isExternal;
            return this;
        }

        /**
         * @param name The name of the user (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param username The username of the user (string)
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable String username) {
            $.username = username;
            return this;
        }

        public GetUserPlainArgs build() {
            return $;
        }
    }

}