// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegistryPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegistryPlainArgs Empty = new GetRegistryPlainArgs();

    /**
     * The name of the registry (string)
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the registry (string)
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The namespace id where to assign the namespaced registry (string)
     * 
     */
    @Import(name="namespaceId")
    private @Nullable String namespaceId;

    /**
     * @return The namespace id where to assign the namespaced registry (string)
     * 
     */
    public Optional<String> namespaceId() {
        return Optional.ofNullable(this.namespaceId);
    }

    /**
     * The project id where to assign the registry (string)
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return The project id where to assign the registry (string)
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    private GetRegistryPlainArgs() {}

    private GetRegistryPlainArgs(GetRegistryPlainArgs $) {
        this.name = $.name;
        this.namespaceId = $.namespaceId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegistryPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegistryPlainArgs $;

        public Builder() {
            $ = new GetRegistryPlainArgs();
        }

        public Builder(GetRegistryPlainArgs defaults) {
            $ = new GetRegistryPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the registry (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param namespaceId The namespace id where to assign the namespaced registry (string)
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(@Nullable String namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        /**
         * @param projectId The project id where to assign the registry (string)
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetRegistryPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}