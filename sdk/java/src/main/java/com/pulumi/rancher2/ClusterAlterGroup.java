// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.ClusterAlterGroupArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.ClusterAlterGroupState;
import com.pulumi.rancher2.outputs.ClusterAlterGroupRecipient;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 Cluster Alert Group resource. This can be used to create Cluster Alert Group for Rancher v2 environments and retrieve their information.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Cluster Alert Group can be imported using the Rancher cluster alert group ID
 * 
 * ```sh
 *  $ pulumi import rancher2:index/clusterAlterGroup:ClusterAlterGroup foo &amp;lt;CLUSTER_ALERT_GROUP_ID&amp;gt;
 * ```
 * 
 * @deprecated
 * rancher2.ClusterAlterGroup has been deprecated in favor of rancher2.ClusterAlertGroup
 * 
 */
@Deprecated /* rancher2.ClusterAlterGroup has been deprecated in favor of rancher2.ClusterAlertGroup */
@ResourceType(type="rancher2:index/clusterAlterGroup:ClusterAlterGroup")
public class ClusterAlterGroup extends com.pulumi.resources.CustomResource {
    /**
     * The cluster alert group annotations (map)
     * 
     */
    @Export(name="annotations", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> annotations;

    /**
     * @return The cluster alert group annotations (map)
     * 
     */
    public Output<Map<String,Object>> annotations() {
        return this.annotations;
    }
    /**
     * The cluster id where create cluster alert group (string)
     * 
     */
    @Export(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    /**
     * @return The cluster id where create cluster alert group (string)
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * The cluster alert group description (string)
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The cluster alert group description (string)
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The cluster alert group interval seconds. Default: `180` (int)
     * 
     */
    @Export(name="groupIntervalSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> groupIntervalSeconds;

    /**
     * @return The cluster alert group interval seconds. Default: `180` (int)
     * 
     */
    public Output<Optional<Integer>> groupIntervalSeconds() {
        return Codegen.optional(this.groupIntervalSeconds);
    }
    /**
     * The cluster alert group wait seconds. Default: `180` (int)
     * 
     */
    @Export(name="groupWaitSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> groupWaitSeconds;

    /**
     * @return The cluster alert group wait seconds. Default: `180` (int)
     * 
     */
    public Output<Optional<Integer>> groupWaitSeconds() {
        return Codegen.optional(this.groupWaitSeconds);
    }
    /**
     * The cluster alert group labels (map)
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> labels;

    /**
     * @return The cluster alert group labels (map)
     * 
     */
    public Output<Map<String,Object>> labels() {
        return this.labels;
    }
    /**
     * The cluster alert group name (string)
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The cluster alert group name (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The cluster alert group recipients (list)
     * 
     */
    @Export(name="recipients", type=List.class, parameters={ClusterAlterGroupRecipient.class})
    private Output</* @Nullable */ List<ClusterAlterGroupRecipient>> recipients;

    /**
     * @return The cluster alert group recipients (list)
     * 
     */
    public Output<Optional<List<ClusterAlterGroupRecipient>>> recipients() {
        return Codegen.optional(this.recipients);
    }
    /**
     * The cluster alert group wait seconds. Default: `3600` (int)
     * 
     */
    @Export(name="repeatIntervalSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> repeatIntervalSeconds;

    /**
     * @return The cluster alert group wait seconds. Default: `3600` (int)
     * 
     */
    public Output<Optional<Integer>> repeatIntervalSeconds() {
        return Codegen.optional(this.repeatIntervalSeconds);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterAlterGroup(String name) {
        this(name, ClusterAlterGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterAlterGroup(String name, ClusterAlterGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterAlterGroup(String name, ClusterAlterGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/clusterAlterGroup:ClusterAlterGroup", name, args == null ? ClusterAlterGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ClusterAlterGroup(String name, Output<String> id, @Nullable ClusterAlterGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/clusterAlterGroup:ClusterAlterGroup", name, state, makeResourceOptions(options, id));
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
    public static ClusterAlterGroup get(String name, Output<String> id, @Nullable ClusterAlterGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClusterAlterGroup(name, id, state, options);
    }
}