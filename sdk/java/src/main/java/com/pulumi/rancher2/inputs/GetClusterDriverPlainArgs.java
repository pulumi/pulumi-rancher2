// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterDriverPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterDriverPlainArgs Empty = new GetClusterDriverPlainArgs();

    /**
     * Name of the cluster driver (string)
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the cluster driver (string)
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The URL to download the machine driver binary for 64-bit Linux (string)
     * 
     */
    @Import(name="url")
    private @Nullable String url;

    /**
     * @return The URL to download the machine driver binary for 64-bit Linux (string)
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    private GetClusterDriverPlainArgs() {}

    private GetClusterDriverPlainArgs(GetClusterDriverPlainArgs $) {
        this.name = $.name;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterDriverPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterDriverPlainArgs $;

        public Builder() {
            $ = new GetClusterDriverPlainArgs();
        }

        public Builder(GetClusterDriverPlainArgs defaults) {
            $ = new GetClusterDriverPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the cluster driver (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param url The URL to download the machine driver binary for 64-bit Linux (string)
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable String url) {
            $.url = url;
            return this;
        }

        public GetClusterDriverPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}