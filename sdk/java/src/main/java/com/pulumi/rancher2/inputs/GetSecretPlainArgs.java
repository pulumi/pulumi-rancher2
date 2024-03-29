// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecretPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecretPlainArgs Empty = new GetSecretPlainArgs();

    /**
     * The name of the secret (string)
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the secret (string)
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The namespace id where to assign the namespaced secret (string)
     * 
     */
    @Import(name="namespaceId")
    private @Nullable String namespaceId;

    /**
     * @return The namespace id where to assign the namespaced secret (string)
     * 
     */
    public Optional<String> namespaceId() {
        return Optional.ofNullable(this.namespaceId);
    }

    /**
     * The project id where to assign the secret (string)
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return The project id where to assign the secret (string)
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    private GetSecretPlainArgs() {}

    private GetSecretPlainArgs(GetSecretPlainArgs $) {
        this.name = $.name;
        this.namespaceId = $.namespaceId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecretPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecretPlainArgs $;

        public Builder() {
            $ = new GetSecretPlainArgs();
        }

        public Builder(GetSecretPlainArgs defaults) {
            $ = new GetSecretPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the secret (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param namespaceId The namespace id where to assign the namespaced secret (string)
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(@Nullable String namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        /**
         * @param projectId The project id where to assign the secret (string)
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetSecretPlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetSecretPlainArgs", "name");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetSecretPlainArgs", "projectId");
            }
            return $;
        }
    }

}
