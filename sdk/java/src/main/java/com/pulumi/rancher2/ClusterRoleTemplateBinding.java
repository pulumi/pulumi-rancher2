// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.ClusterRoleTemplateBindingArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.ClusterRoleTemplateBindingState;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 Cluster Role Template Binding resource. This can be used to create Cluster Role Template Bindings for Rancher v2 environments and retrieve their information.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Cluster Role Template Bindings can be imported using the Rancher cluster Role Template Binding ID
 * 
 * ```sh
 *  $ pulumi import rancher2:index/clusterRoleTemplateBinding:ClusterRoleTemplateBinding foo &amp;lt;CLUSTER_ROLE_TEMPLATE_BINDING_ID&amp;gt;
 * ```
 * 
 */
@ResourceType(type="rancher2:index/clusterRoleTemplateBinding:ClusterRoleTemplateBinding")
public class ClusterRoleTemplateBinding extends com.pulumi.resources.CustomResource {
    /**
     * Annotations for cluster role template binding (map)
     * 
     */
    @Export(name="annotations", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for cluster role template binding (map)
     * 
     */
    public Output<Map<String,Object>> annotations() {
        return this.annotations;
    }
    /**
     * The cluster id where bind cluster role template binding (string)
     * 
     */
    @Export(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    /**
     * @return The cluster id where bind cluster role template binding (string)
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * The group ID to assign cluster role template binding (string)
     * 
     */
    @Export(name="groupId", type=String.class, parameters={})
    private Output<String> groupId;

    /**
     * @return The group ID to assign cluster role template binding (string)
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }
    /**
     * The group_principal ID to assign cluster role template binding (string)
     * 
     */
    @Export(name="groupPrincipalId", type=String.class, parameters={})
    private Output<String> groupPrincipalId;

    /**
     * @return The group_principal ID to assign cluster role template binding (string)
     * 
     */
    public Output<String> groupPrincipalId() {
        return this.groupPrincipalId;
    }
    /**
     * Labels for cluster role template binding (map)
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> labels;

    /**
     * @return Labels for cluster role template binding (map)
     * 
     */
    public Output<Map<String,Object>> labels() {
        return this.labels;
    }
    /**
     * The name of the cluster role template binding (string)
     * 
     */
    @Export(name="name", type=String.class, parameters={})
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
    @Export(name="roleTemplateId", type=String.class, parameters={})
    private Output<String> roleTemplateId;

    /**
     * @return The role template id from create cluster role template binding (string)
     * 
     */
    public Output<String> roleTemplateId() {
        return this.roleTemplateId;
    }
    /**
     * The user ID to assign cluster role template binding (string)
     * 
     */
    @Export(name="userId", type=String.class, parameters={})
    private Output<String> userId;

    /**
     * @return The user ID to assign cluster role template binding (string)
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }
    /**
     * The user_principal ID to assign cluster role template binding (string)
     * 
     */
    @Export(name="userPrincipalId", type=String.class, parameters={})
    private Output<String> userPrincipalId;

    /**
     * @return The user_principal ID to assign cluster role template binding (string)
     * 
     */
    public Output<String> userPrincipalId() {
        return this.userPrincipalId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterRoleTemplateBinding(String name) {
        this(name, ClusterRoleTemplateBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterRoleTemplateBinding(String name, ClusterRoleTemplateBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterRoleTemplateBinding(String name, ClusterRoleTemplateBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/clusterRoleTemplateBinding:ClusterRoleTemplateBinding", name, args == null ? ClusterRoleTemplateBindingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ClusterRoleTemplateBinding(String name, Output<String> id, @Nullable ClusterRoleTemplateBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/clusterRoleTemplateBinding:ClusterRoleTemplateBinding", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ClusterRoleTemplateBinding get(String name, Output<String> id, @Nullable ClusterRoleTemplateBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClusterRoleTemplateBinding(name, id, state, options);
    }
}