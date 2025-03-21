// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.CloudCredentialArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.CloudCredentialState;
import com.pulumi.rancher2.outputs.CloudCredentialAmazonec2CredentialConfig;
import com.pulumi.rancher2.outputs.CloudCredentialAzureCredentialConfig;
import com.pulumi.rancher2.outputs.CloudCredentialDigitaloceanCredentialConfig;
import com.pulumi.rancher2.outputs.CloudCredentialGoogleCredentialConfig;
import com.pulumi.rancher2.outputs.CloudCredentialHarvesterCredentialConfig;
import com.pulumi.rancher2.outputs.CloudCredentialLinodeCredentialConfig;
import com.pulumi.rancher2.outputs.CloudCredentialOpenstackCredentialConfig;
import com.pulumi.rancher2.outputs.CloudCredentialS3CredentialConfig;
import com.pulumi.rancher2.outputs.CloudCredentialVsphereCredentialConfig;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 Cloud Credential resource. This can be used to create Cloud Credential for Rancher v2.2.x and retrieve their information.
 * 
 * amazonec2, azure, digitalocean, harvester, linode, openstack and vsphere credentials config are supported for Cloud Credential.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.CloudCredential;
 * import com.pulumi.rancher2.CloudCredentialArgs;
 * import com.pulumi.rancher2.inputs.CloudCredentialAmazonec2CredentialConfigArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         // Create a new rancher2 Cloud Credential
 *         var foo = new CloudCredential("foo", CloudCredentialArgs.builder()
 *             .name("foo")
 *             .description("foo test")
 *             .amazonec2CredentialConfig(CloudCredentialAmazonec2CredentialConfigArgs.builder()
 *                 .accessKey("<AWS_ACCESS_KEY>")
 *                 .secretKey("<AWS_SECRET_KEY>")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.Rancher2Functions;
 * import com.pulumi.rancher2.inputs.GetClusterV2Args;
 * import com.pulumi.rancher2.CloudCredential;
 * import com.pulumi.rancher2.CloudCredentialArgs;
 * import com.pulumi.rancher2.inputs.CloudCredentialHarvesterCredentialConfigArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         // Get imported harvester cluster info
 *         final var foo-harvester = Rancher2Functions.getClusterV2(GetClusterV2Args.builder()
 *             .name("foo-harvester")
 *             .build());
 * 
 *         // Create a new Cloud Credential for an imported Harvester cluster
 *         var foo_harvesterCloudCredential = new CloudCredential("foo-harvesterCloudCredential", CloudCredentialArgs.builder()
 *             .name("foo-harvester")
 *             .harvesterCredentialConfig(CloudCredentialHarvesterCredentialConfigArgs.builder()
 *                 .clusterId(foo_harvester.clusterV1Id())
 *                 .clusterType("imported")
 *                 .kubeconfigContent(foo_harvester.kubeConfig())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Cloud Credential can be imported using the Cloud Credential ID and the Driver name.
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import rancher2:index/cloudCredential:CloudCredential foo &amp;lt;CLOUD_CREDENTIAL_ID&amp;gt;.&amp;lt;DRIVER&amp;gt;
 * ```
 * 
 * The following drivers are supported:
 * 
 * * amazonec2
 * 
 * * azure
 * 
 * * digitalocean
 * 
 * * googlekubernetesengine
 * 
 * * linode
 * 
 * * openstack
 * 
 * * s3
 * 
 * * vmwarevsphere
 * 
 */
@ResourceType(type="rancher2:index/cloudCredential:CloudCredential")
public class CloudCredential extends com.pulumi.resources.CustomResource {
    /**
     * AWS config for the Cloud Credential (list maxitems:1)
     * 
     */
    @Export(name="amazonec2CredentialConfig", refs={CloudCredentialAmazonec2CredentialConfig.class}, tree="[0]")
    private Output</* @Nullable */ CloudCredentialAmazonec2CredentialConfig> amazonec2CredentialConfig;

    /**
     * @return AWS config for the Cloud Credential (list maxitems:1)
     * 
     */
    public Output<Optional<CloudCredentialAmazonec2CredentialConfig>> amazonec2CredentialConfig() {
        return Codegen.optional(this.amazonec2CredentialConfig);
    }
    /**
     * Annotations for Cloud Credential object (map)
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> annotations;

    /**
     * @return Annotations for Cloud Credential object (map)
     * 
     */
    public Output<Map<String,String>> annotations() {
        return this.annotations;
    }
    /**
     * Azure config for the Cloud Credential (list maxitems:1)
     * 
     */
    @Export(name="azureCredentialConfig", refs={CloudCredentialAzureCredentialConfig.class}, tree="[0]")
    private Output</* @Nullable */ CloudCredentialAzureCredentialConfig> azureCredentialConfig;

    /**
     * @return Azure config for the Cloud Credential (list maxitems:1)
     * 
     */
    public Output<Optional<CloudCredentialAzureCredentialConfig>> azureCredentialConfig() {
        return Codegen.optional(this.azureCredentialConfig);
    }
    /**
     * Description for the Cloud Credential (string)
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description for the Cloud Credential (string)
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * DigitalOcean config for the Cloud Credential (list maxitems:1)
     * 
     */
    @Export(name="digitaloceanCredentialConfig", refs={CloudCredentialDigitaloceanCredentialConfig.class}, tree="[0]")
    private Output</* @Nullable */ CloudCredentialDigitaloceanCredentialConfig> digitaloceanCredentialConfig;

    /**
     * @return DigitalOcean config for the Cloud Credential (list maxitems:1)
     * 
     */
    public Output<Optional<CloudCredentialDigitaloceanCredentialConfig>> digitaloceanCredentialConfig() {
        return Codegen.optional(this.digitaloceanCredentialConfig);
    }
    /**
     * (Computed) The driver of the Cloud Credential (string)
     * 
     */
    @Export(name="driver", refs={String.class}, tree="[0]")
    private Output<String> driver;

    /**
     * @return (Computed) The driver of the Cloud Credential (string)
     * 
     */
    public Output<String> driver() {
        return this.driver;
    }
    /**
     * Google config for the Cloud Credential (list maxitems:1)
     * 
     */
    @Export(name="googleCredentialConfig", refs={CloudCredentialGoogleCredentialConfig.class}, tree="[0]")
    private Output</* @Nullable */ CloudCredentialGoogleCredentialConfig> googleCredentialConfig;

    /**
     * @return Google config for the Cloud Credential (list maxitems:1)
     * 
     */
    public Output<Optional<CloudCredentialGoogleCredentialConfig>> googleCredentialConfig() {
        return Codegen.optional(this.googleCredentialConfig);
    }
    /**
     * Harvester config for the Cloud Credential (list maxitems:1)
     * 
     */
    @Export(name="harvesterCredentialConfig", refs={CloudCredentialHarvesterCredentialConfig.class}, tree="[0]")
    private Output</* @Nullable */ CloudCredentialHarvesterCredentialConfig> harvesterCredentialConfig;

    /**
     * @return Harvester config for the Cloud Credential (list maxitems:1)
     * 
     */
    public Output<Optional<CloudCredentialHarvesterCredentialConfig>> harvesterCredentialConfig() {
        return Codegen.optional(this.harvesterCredentialConfig);
    }
    /**
     * Labels for Cloud Credential object (map)
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> labels;

    /**
     * @return Labels for Cloud Credential object (map)
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Linode config for the Cloud Credential (list maxitems:1)
     * 
     */
    @Export(name="linodeCredentialConfig", refs={CloudCredentialLinodeCredentialConfig.class}, tree="[0]")
    private Output</* @Nullable */ CloudCredentialLinodeCredentialConfig> linodeCredentialConfig;

    /**
     * @return Linode config for the Cloud Credential (list maxitems:1)
     * 
     */
    public Output<Optional<CloudCredentialLinodeCredentialConfig>> linodeCredentialConfig() {
        return Codegen.optional(this.linodeCredentialConfig);
    }
    /**
     * The name of the Cloud Credential (string)
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Cloud Credential (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * OpenStack config for the Cloud Credential (list maxitems:1)
     * 
     */
    @Export(name="openstackCredentialConfig", refs={CloudCredentialOpenstackCredentialConfig.class}, tree="[0]")
    private Output</* @Nullable */ CloudCredentialOpenstackCredentialConfig> openstackCredentialConfig;

    /**
     * @return OpenStack config for the Cloud Credential (list maxitems:1)
     * 
     */
    public Output<Optional<CloudCredentialOpenstackCredentialConfig>> openstackCredentialConfig() {
        return Codegen.optional(this.openstackCredentialConfig);
    }
    /**
     * S3 config for the Cloud Credential. For Rancher 2.6.0 and above (list maxitems:1)
     * 
     */
    @Export(name="s3CredentialConfig", refs={CloudCredentialS3CredentialConfig.class}, tree="[0]")
    private Output</* @Nullable */ CloudCredentialS3CredentialConfig> s3CredentialConfig;

    /**
     * @return S3 config for the Cloud Credential. For Rancher 2.6.0 and above (list maxitems:1)
     * 
     */
    public Output<Optional<CloudCredentialS3CredentialConfig>> s3CredentialConfig() {
        return Codegen.optional(this.s3CredentialConfig);
    }
    /**
     * vSphere config for the Cloud Credential (list maxitems:1)
     * 
     */
    @Export(name="vsphereCredentialConfig", refs={CloudCredentialVsphereCredentialConfig.class}, tree="[0]")
    private Output</* @Nullable */ CloudCredentialVsphereCredentialConfig> vsphereCredentialConfig;

    /**
     * @return vSphere config for the Cloud Credential (list maxitems:1)
     * 
     */
    public Output<Optional<CloudCredentialVsphereCredentialConfig>> vsphereCredentialConfig() {
        return Codegen.optional(this.vsphereCredentialConfig);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CloudCredential(java.lang.String name) {
        this(name, CloudCredentialArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CloudCredential(java.lang.String name, @Nullable CloudCredentialArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CloudCredential(java.lang.String name, @Nullable CloudCredentialArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/cloudCredential:CloudCredential", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private CloudCredential(java.lang.String name, Output<java.lang.String> id, @Nullable CloudCredentialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/cloudCredential:CloudCredential", name, state, makeResourceOptions(options, id), false);
    }

    private static CloudCredentialArgs makeArgs(@Nullable CloudCredentialArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CloudCredentialArgs.Empty : args;
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
    public static CloudCredential get(java.lang.String name, Output<java.lang.String> id, @Nullable CloudCredentialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CloudCredential(name, id, state, options);
    }
}
