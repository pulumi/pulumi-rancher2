// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.ClusterAlterRuleArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.ClusterAlterRuleState;
import com.pulumi.rancher2.outputs.ClusterAlterRuleEventRule;
import com.pulumi.rancher2.outputs.ClusterAlterRuleMetricRule;
import com.pulumi.rancher2.outputs.ClusterAlterRuleNodeRule;
import com.pulumi.rancher2.outputs.ClusterAlterRuleSystemServiceRule;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
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
 *  $ pulumi import rancher2:index/clusterAlterRule:ClusterAlterRule foo &amp;lt;CLUSTER_ALERT_GROUP_ID&amp;gt;
 * ```
 * 
 * @deprecated
 * rancher2.ClusterAlterRule has been deprecated in favor of rancher2.ClusterAlertRule
 * 
 */
@Deprecated /* rancher2.ClusterAlterRule has been deprecated in favor of rancher2.ClusterAlertRule */
@ResourceType(type="rancher2:index/clusterAlterRule:ClusterAlterRule")
public class ClusterAlterRule extends com.pulumi.resources.CustomResource {
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
     * Alert event rule
     * 
     */
    @Export(name="eventRule", type=ClusterAlterRuleEventRule.class, parameters={})
    private Output</* @Nullable */ ClusterAlterRuleEventRule> eventRule;

    /**
     * @return Alert event rule
     * 
     */
    public Output<Optional<ClusterAlterRuleEventRule>> eventRule() {
        return Codegen.optional(this.eventRule);
    }
    /**
     * Alert rule group ID
     * 
     */
    @Export(name="groupId", type=String.class, parameters={})
    private Output<String> groupId;

    /**
     * @return Alert rule group ID
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
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
     * Alert rule inherited
     * 
     */
    @Export(name="inherited", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> inherited;

    /**
     * @return Alert rule inherited
     * 
     */
    public Output<Optional<Boolean>> inherited() {
        return Codegen.optional(this.inherited);
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
     * Alert metric rule
     * 
     */
    @Export(name="metricRule", type=ClusterAlterRuleMetricRule.class, parameters={})
    private Output</* @Nullable */ ClusterAlterRuleMetricRule> metricRule;

    /**
     * @return Alert metric rule
     * 
     */
    public Output<Optional<ClusterAlterRuleMetricRule>> metricRule() {
        return Codegen.optional(this.metricRule);
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
     * Alert node rule
     * 
     */
    @Export(name="nodeRule", type=ClusterAlterRuleNodeRule.class, parameters={})
    private Output</* @Nullable */ ClusterAlterRuleNodeRule> nodeRule;

    /**
     * @return Alert node rule
     * 
     */
    public Output<Optional<ClusterAlterRuleNodeRule>> nodeRule() {
        return Codegen.optional(this.nodeRule);
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
     * Alert rule severity
     * 
     */
    @Export(name="severity", type=String.class, parameters={})
    private Output</* @Nullable */ String> severity;

    /**
     * @return Alert rule severity
     * 
     */
    public Output<Optional<String>> severity() {
        return Codegen.optional(this.severity);
    }
    /**
     * Alert system service rule
     * 
     */
    @Export(name="systemServiceRule", type=ClusterAlterRuleSystemServiceRule.class, parameters={})
    private Output</* @Nullable */ ClusterAlterRuleSystemServiceRule> systemServiceRule;

    /**
     * @return Alert system service rule
     * 
     */
    public Output<Optional<ClusterAlterRuleSystemServiceRule>> systemServiceRule() {
        return Codegen.optional(this.systemServiceRule);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterAlterRule(String name) {
        this(name, ClusterAlterRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterAlterRule(String name, ClusterAlterRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterAlterRule(String name, ClusterAlterRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/clusterAlterRule:ClusterAlterRule", name, args == null ? ClusterAlterRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ClusterAlterRule(String name, Output<String> id, @Nullable ClusterAlterRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/clusterAlterRule:ClusterAlterRule", name, state, makeResourceOptions(options, id));
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
    public static ClusterAlterRule get(String name, Output<String> id, @Nullable ClusterAlterRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClusterAlterRule(name, id, state, options);
    }
}