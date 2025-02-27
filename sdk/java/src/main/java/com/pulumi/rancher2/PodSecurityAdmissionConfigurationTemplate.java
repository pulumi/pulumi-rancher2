// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.PodSecurityAdmissionConfigurationTemplateArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.PodSecurityAdmissionConfigurationTemplateState;
import com.pulumi.rancher2.outputs.PodSecurityAdmissionConfigurationTemplateDefaults;
import com.pulumi.rancher2.outputs.PodSecurityAdmissionConfigurationTemplateExemptions;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="rancher2:index/podSecurityAdmissionConfigurationTemplate:PodSecurityAdmissionConfigurationTemplate")
public class PodSecurityAdmissionConfigurationTemplate extends com.pulumi.resources.CustomResource {
    /**
     * Annotations of the resource
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> annotations;

    /**
     * @return Annotations of the resource
     * 
     */
    public Output<Map<String,String>> annotations() {
        return this.annotations;
    }
    /**
     * defaults allows the user to define admission control mode for Pod Security
     * 
     */
    @Export(name="defaults", refs={PodSecurityAdmissionConfigurationTemplateDefaults.class}, tree="[0]")
    private Output<PodSecurityAdmissionConfigurationTemplateDefaults> defaults;

    /**
     * @return defaults allows the user to define admission control mode for Pod Security
     * 
     */
    public Output<PodSecurityAdmissionConfigurationTemplateDefaults> defaults() {
        return this.defaults;
    }
    /**
     * Pod Security Admission Configuration template description
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Pod Security Admission Configuration template description
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * exemptions allows the creation of pods for specific Usernames, RuntimeClassNames, and Namespaces that would otherwise be
     * prohibited
     * 
     */
    @Export(name="exemptions", refs={PodSecurityAdmissionConfigurationTemplateExemptions.class}, tree="[0]")
    private Output</* @Nullable */ PodSecurityAdmissionConfigurationTemplateExemptions> exemptions;

    /**
     * @return exemptions allows the creation of pods for specific Usernames, RuntimeClassNames, and Namespaces that would otherwise be
     * prohibited
     * 
     */
    public Output<Optional<PodSecurityAdmissionConfigurationTemplateExemptions>> exemptions() {
        return Codegen.optional(this.exemptions);
    }
    /**
     * Labels of the resource
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> labels;

    /**
     * @return Labels of the resource
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Pod Security Admission Configuration template name
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Pod Security Admission Configuration template name
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PodSecurityAdmissionConfigurationTemplate(java.lang.String name) {
        this(name, PodSecurityAdmissionConfigurationTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PodSecurityAdmissionConfigurationTemplate(java.lang.String name, PodSecurityAdmissionConfigurationTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PodSecurityAdmissionConfigurationTemplate(java.lang.String name, PodSecurityAdmissionConfigurationTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/podSecurityAdmissionConfigurationTemplate:PodSecurityAdmissionConfigurationTemplate", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private PodSecurityAdmissionConfigurationTemplate(java.lang.String name, Output<java.lang.String> id, @Nullable PodSecurityAdmissionConfigurationTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/podSecurityAdmissionConfigurationTemplate:PodSecurityAdmissionConfigurationTemplate", name, state, makeResourceOptions(options, id), false);
    }

    private static PodSecurityAdmissionConfigurationTemplateArgs makeArgs(PodSecurityAdmissionConfigurationTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? PodSecurityAdmissionConfigurationTemplateArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static PodSecurityAdmissionConfigurationTemplate get(java.lang.String name, Output<java.lang.String> id, @Nullable PodSecurityAdmissionConfigurationTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PodSecurityAdmissionConfigurationTemplate(name, id, state, options);
    }
}
