// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterRoleTemplateBindingArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterRoleTemplateBindingArgs Empty = new GetClusterRoleTemplateBindingArgs();

    /**
     * The cluster id where bind cluster role template (string)
     * 
     */
    @Import(name="clusterId", required=true)
    private Output<String> clusterId;

    /**
     * @return The cluster id where bind cluster role template (string)
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }

    /**
     * The name of the cluster role template binding (string)
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the cluster role template binding (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The role template id from create cluster role template binding (string)
     * 
     */
    @Import(name="roleTemplateId")
    private @Nullable Output<String> roleTemplateId;

    /**
     * @return The role template id from create cluster role template binding (string)
     * 
     */
    public Optional<Output<String>> roleTemplateId() {
        return Optional.ofNullable(this.roleTemplateId);
    }

    private GetClusterRoleTemplateBindingArgs() {}

    private GetClusterRoleTemplateBindingArgs(GetClusterRoleTemplateBindingArgs $) {
        this.clusterId = $.clusterId;
        this.name = $.name;
        this.roleTemplateId = $.roleTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterRoleTemplateBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterRoleTemplateBindingArgs $;

        public Builder() {
            $ = new GetClusterRoleTemplateBindingArgs();
        }

        public Builder(GetClusterRoleTemplateBindingArgs defaults) {
            $ = new GetClusterRoleTemplateBindingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The cluster id where bind cluster role template (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The cluster id where bind cluster role template (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param name The name of the cluster role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the cluster role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param roleTemplateId The role template id from create cluster role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder roleTemplateId(@Nullable Output<String> roleTemplateId) {
            $.roleTemplateId = roleTemplateId;
            return this;
        }

        /**
         * @param roleTemplateId The role template id from create cluster role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder roleTemplateId(String roleTemplateId) {
            return roleTemplateId(Output.of(roleTemplateId));
        }

        public GetClusterRoleTemplateBindingArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}