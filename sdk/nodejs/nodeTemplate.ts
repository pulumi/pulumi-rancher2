// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Node Template resource. This can be used to create Node Template for Rancher v2 and retrieve their information.
 *
 * amazonec2, azure, digitalocean, harvester, linode, opennebula, openstack, outscale, hetzner and vsphere drivers are supported for node templates.
 *
 * **Note:** If you are upgrading to Rancher v2.3.3, please take a look to final section
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 Node Template up to Rancher 2.1.x
 * const foo = new rancher2.NodeTemplate("foo", {
 *     name: "foo",
 *     description: "foo test",
 *     amazonec2Config: {
 *         accessKey: "AWS_ACCESS_KEY",
 *         secretKey: "<AWS_SECRET_KEY>",
 *         ami: "<AMI_ID>",
 *         region: "<REGION>",
 *         securityGroups: ["<AWS_SECURITY_GROUP>"],
 *         subnetId: "<SUBNET_ID>",
 *         vpcId: "<VPC_ID>",
 *         zone: "<ZONE>",
 *     },
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 Node Template from Rancher 2.2.x
 * const foo = new rancher2.CloudCredential("foo", {
 *     name: "foo",
 *     description: "foo test",
 *     amazonec2CredentialConfig: {
 *         accessKey: "<AWS_ACCESS_KEY>",
 *         secretKey: "<AWS_SECRET_KEY>",
 *     },
 * });
 * const fooNodeTemplate = new rancher2.NodeTemplate("foo", {
 *     name: "foo",
 *     description: "foo test",
 *     cloudCredentialId: foo.id,
 *     amazonec2Config: {
 *         ami: "<AMI_ID>",
 *         region: "<REGION>",
 *         securityGroups: ["<AWS_SECURITY_GROUP>"],
 *         subnetId: "<SUBNET_ID>",
 *         vpcId: "<VPC_ID>",
 *         zone: "<ZONE>",
 *     },
 * });
 * ```
 *
 * ### Using the Harvester Node Driver
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Get imported harvester cluster info
 * const foo_harvester = rancher2.getClusterV2({
 *     name: "foo-harvester",
 * });
 * // Create a new Cloud Credential for an imported Harvester cluster
 * const foo_harvesterCloudCredential = new rancher2.CloudCredential("foo-harvester", {
 *     name: "foo-harvester",
 *     harvesterCredentialConfig: {
 *         clusterId: foo_harvester.then(foo_harvester => foo_harvester.clusterV1Id),
 *         clusterType: "imported",
 *         kubeconfigContent: foo_harvester.then(foo_harvester => foo_harvester.kubeConfig),
 *     },
 * });
 * // Create a new rancher2 Node Template using harvester node_driver
 * const foo_harvesterNodeTemplate = new rancher2.NodeTemplate("foo-harvester", {
 *     name: "foo-harvester",
 *     cloudCredentialId: foo_harvesterCloudCredential.id,
 *     engineInstallUrl: "https://releases.rancher.com/install-docker/20.10.sh",
 *     harvesterConfig: {
 *         vmNamespace: "default",
 *         cpuCount: "2",
 *         memorySize: "4",
 *         diskInfo: `    {
 *         "disks": [{
 *             "imageName": "harvester-public/image-57hzg",
 *             "size": 40,
 *             "bootOrder": 1
 *         }]
 *     }
 * `,
 *         networkInfo: `    {
 *         "interfaces": [{
 *             "networkName": "harvester-public/vlan1"
 *         }]
 *     }
 * `,
 *         sshUser: "ubuntu",
 *         userData: `    package_update: true
 *     packages:
 *       - qemu-guest-agent
 *       - iptables
 *     runcmd:
 *       - - systemctl
 *         - enable
 *         - '--now'
 *         - qemu-guest-agent.service
 * `,
 *     },
 * });
 * ```
 *
 * ### Using the Hetzner Node Driver
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 Node Template using hetzner node_driver
 * const hetznerNodeDriver = new rancher2.NodeDriver("hetzner_node_driver", {
 *     active: true,
 *     builtin: false,
 *     name: "Hetzner",
 *     uiUrl: "https://storage.googleapis.com/hcloud-rancher-v2-ui-driver/component.js",
 *     url: "https://github.com/JonasProgrammer/docker-machine-driver-hetzner/releases/download/3.6.0/docker-machine-driver-hetzner_3.6.0_linux_amd64.tar.gz",
 *     whitelistDomains: ["storage.googleapis.com"],
 * });
 * const myHetznerNodeTemplate = new rancher2.NodeTemplate("my_hetzner_node_template", {
 *     name: "my-hetzner-node-template",
 *     driverId: hetznerNodeDriver.id,
 *     hetznerConfig: {
 *         apiToken: "XXXXXXXXXX",
 *         image: "ubuntu-18.04",
 *         serverLocation: "nbg1",
 *         serverType: "cx11",
 *     },
 * });
 * ```
 *
 * ## Upgrading to Rancher v2.3.3
 *
 * **Important** This process could update `rancher2.NodeTemplate` data on tfstate file. Be sure to save a copy of tfstate file before proceed
 *
 * Due to [this feature](https://github.com/rancher/rancher/pull/23718) included on Rancher v2.3.3, `rancher2.NodeTemplate` are now global scoped objects with RBAC around them, instead of user scoped objects as they were. This means that existing node templates `id` field is changing on upgrade. Provider implements `fixNodeTemplateID()` that will update tfstate with proper id.
 *
 * ## Import
 *
 * Node Template can be imported using the Rancher Node Template ID
 *
 * ```sh
 * $ pulumi import rancher2:index/nodeTemplate:NodeTemplate foo &lt;node_template_id&gt;
 * ```
 */
export class NodeTemplate extends pulumi.CustomResource {
    /**
     * Get an existing NodeTemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NodeTemplateState, opts?: pulumi.CustomResourceOptions): NodeTemplate {
        return new NodeTemplate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/nodeTemplate:NodeTemplate';

    /**
     * Returns true if the given object is an instance of NodeTemplate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NodeTemplate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NodeTemplate.__pulumiType;
    }

    /**
     * AWS config for the Node Template (list maxitems:1)
     */
    public readonly amazonec2Config!: pulumi.Output<outputs.NodeTemplateAmazonec2Config | undefined>;
    /**
     * Annotations for Node Template object (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: string}>;
    /**
     * Auth certificate authority for the Node Template (string)
     */
    public readonly authCertificateAuthority!: pulumi.Output<string | undefined>;
    /**
     * Auth key for the Node Template (string)
     */
    public readonly authKey!: pulumi.Output<string | undefined>;
    /**
     * Azure config for the Node Template (list maxitems:1)
     */
    public readonly azureConfig!: pulumi.Output<outputs.NodeTemplateAzureConfig | undefined>;
    /**
     * Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
     */
    public readonly cloudCredentialId!: pulumi.Output<string | undefined>;
    /**
     * Description for the Node Template (string)
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Digitalocean config for the Node Template (list maxitems:1)
     */
    public readonly digitaloceanConfig!: pulumi.Output<outputs.NodeTemplateDigitaloceanConfig | undefined>;
    /**
     * (Computed) The driver of the node template (string)
     */
    public /*out*/ readonly driver!: pulumi.Output<string>;
    /**
     * The node driver id used by the node template. It's required if the node driver isn't built in Rancher (string)
     */
    public readonly driverId!: pulumi.Output<string>;
    /**
     * Engine environment for the node template (string)
     */
    public readonly engineEnv!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Insecure registry for the node template (list)
     */
    public readonly engineInsecureRegistries!: pulumi.Output<string[] | undefined>;
    /**
     * Docker engine install URL for the node template. Available install docker versions at `https://github.com/rancher/install-docker` (string)
     */
    public readonly engineInstallUrl!: pulumi.Output<string>;
    /**
     * Engine label for the node template (string)
     */
    public readonly engineLabel!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Engine options for the node template (map)
     */
    public readonly engineOpt!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Engine registry mirror for the node template (list)
     */
    public readonly engineRegistryMirrors!: pulumi.Output<string[] | undefined>;
    /**
     * Engine storage driver for the node template (string)
     */
    public readonly engineStorageDriver!: pulumi.Output<string | undefined>;
    /**
     * Harvester config for the Node Template (list maxitems:1)
     */
    public readonly harvesterConfig!: pulumi.Output<outputs.NodeTemplateHarvesterConfig | undefined>;
    /**
     * Hetzner config for the Node Template (list maxitems:1)
     */
    public readonly hetznerConfig!: pulumi.Output<outputs.NodeTemplateHetznerConfig | undefined>;
    /**
     * Labels for Node Template object (map)
     *
     * **Note:** `labels` and `nodeTaints` will be applied to nodes deployed using the Node Template
     */
    public readonly labels!: pulumi.Output<{[key: string]: string}>;
    /**
     * Linode config for the Node Template (list maxitems:1)
     */
    public readonly linodeConfig!: pulumi.Output<outputs.NodeTemplateLinodeConfig | undefined>;
    /**
     * The name of the Node Template (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Node taints. For Rancher v2.3.3 and above (List)
     */
    public readonly nodeTaints!: pulumi.Output<outputs.NodeTemplateNodeTaint[] | undefined>;
    /**
     * Opennebula config for the Node Template (list maxitems:1)
     */
    public readonly opennebulaConfig!: pulumi.Output<outputs.NodeTemplateOpennebulaConfig | undefined>;
    /**
     * Openstack config for the Node Template (list maxitems:1)
     */
    public readonly openstackConfig!: pulumi.Output<outputs.NodeTemplateOpenstackConfig | undefined>;
    /**
     * Outscale config for the Node Template (list maxitems:1)
     */
    public readonly outscaleConfig!: pulumi.Output<outputs.NodeTemplateOutscaleConfig | undefined>;
    /**
     * Engine storage driver for the node template (bool)
     */
    public readonly useInternalIpAddress!: pulumi.Output<boolean | undefined>;
    /**
     * vSphere config for the Node Template (list maxitems:1)
     */
    public readonly vsphereConfig!: pulumi.Output<outputs.NodeTemplateVsphereConfig | undefined>;

    /**
     * Create a NodeTemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: NodeTemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NodeTemplateArgs | NodeTemplateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NodeTemplateState | undefined;
            resourceInputs["amazonec2Config"] = state ? state.amazonec2Config : undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["authCertificateAuthority"] = state ? state.authCertificateAuthority : undefined;
            resourceInputs["authKey"] = state ? state.authKey : undefined;
            resourceInputs["azureConfig"] = state ? state.azureConfig : undefined;
            resourceInputs["cloudCredentialId"] = state ? state.cloudCredentialId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["digitaloceanConfig"] = state ? state.digitaloceanConfig : undefined;
            resourceInputs["driver"] = state ? state.driver : undefined;
            resourceInputs["driverId"] = state ? state.driverId : undefined;
            resourceInputs["engineEnv"] = state ? state.engineEnv : undefined;
            resourceInputs["engineInsecureRegistries"] = state ? state.engineInsecureRegistries : undefined;
            resourceInputs["engineInstallUrl"] = state ? state.engineInstallUrl : undefined;
            resourceInputs["engineLabel"] = state ? state.engineLabel : undefined;
            resourceInputs["engineOpt"] = state ? state.engineOpt : undefined;
            resourceInputs["engineRegistryMirrors"] = state ? state.engineRegistryMirrors : undefined;
            resourceInputs["engineStorageDriver"] = state ? state.engineStorageDriver : undefined;
            resourceInputs["harvesterConfig"] = state ? state.harvesterConfig : undefined;
            resourceInputs["hetznerConfig"] = state ? state.hetznerConfig : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["linodeConfig"] = state ? state.linodeConfig : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nodeTaints"] = state ? state.nodeTaints : undefined;
            resourceInputs["opennebulaConfig"] = state ? state.opennebulaConfig : undefined;
            resourceInputs["openstackConfig"] = state ? state.openstackConfig : undefined;
            resourceInputs["outscaleConfig"] = state ? state.outscaleConfig : undefined;
            resourceInputs["useInternalIpAddress"] = state ? state.useInternalIpAddress : undefined;
            resourceInputs["vsphereConfig"] = state ? state.vsphereConfig : undefined;
        } else {
            const args = argsOrState as NodeTemplateArgs | undefined;
            resourceInputs["amazonec2Config"] = args ? args.amazonec2Config : undefined;
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["authCertificateAuthority"] = args?.authCertificateAuthority ? pulumi.secret(args.authCertificateAuthority) : undefined;
            resourceInputs["authKey"] = args?.authKey ? pulumi.secret(args.authKey) : undefined;
            resourceInputs["azureConfig"] = args ? args.azureConfig : undefined;
            resourceInputs["cloudCredentialId"] = args ? args.cloudCredentialId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["digitaloceanConfig"] = args ? args.digitaloceanConfig : undefined;
            resourceInputs["driverId"] = args ? args.driverId : undefined;
            resourceInputs["engineEnv"] = args ? args.engineEnv : undefined;
            resourceInputs["engineInsecureRegistries"] = args ? args.engineInsecureRegistries : undefined;
            resourceInputs["engineInstallUrl"] = args ? args.engineInstallUrl : undefined;
            resourceInputs["engineLabel"] = args ? args.engineLabel : undefined;
            resourceInputs["engineOpt"] = args ? args.engineOpt : undefined;
            resourceInputs["engineRegistryMirrors"] = args ? args.engineRegistryMirrors : undefined;
            resourceInputs["engineStorageDriver"] = args ? args.engineStorageDriver : undefined;
            resourceInputs["harvesterConfig"] = args ? args.harvesterConfig : undefined;
            resourceInputs["hetznerConfig"] = args ? args.hetznerConfig : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["linodeConfig"] = args ? args.linodeConfig : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nodeTaints"] = args ? args.nodeTaints : undefined;
            resourceInputs["opennebulaConfig"] = args ? args.opennebulaConfig : undefined;
            resourceInputs["openstackConfig"] = args ? args.openstackConfig : undefined;
            resourceInputs["outscaleConfig"] = args ? args.outscaleConfig : undefined;
            resourceInputs["useInternalIpAddress"] = args ? args.useInternalIpAddress : undefined;
            resourceInputs["vsphereConfig"] = args ? args.vsphereConfig : undefined;
            resourceInputs["driver"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["authCertificateAuthority", "authKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(NodeTemplate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NodeTemplate resources.
 */
export interface NodeTemplateState {
    /**
     * AWS config for the Node Template (list maxitems:1)
     */
    amazonec2Config?: pulumi.Input<inputs.NodeTemplateAmazonec2Config>;
    /**
     * Annotations for Node Template object (map)
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Auth certificate authority for the Node Template (string)
     */
    authCertificateAuthority?: pulumi.Input<string>;
    /**
     * Auth key for the Node Template (string)
     */
    authKey?: pulumi.Input<string>;
    /**
     * Azure config for the Node Template (list maxitems:1)
     */
    azureConfig?: pulumi.Input<inputs.NodeTemplateAzureConfig>;
    /**
     * Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
     */
    cloudCredentialId?: pulumi.Input<string>;
    /**
     * Description for the Node Template (string)
     */
    description?: pulumi.Input<string>;
    /**
     * Digitalocean config for the Node Template (list maxitems:1)
     */
    digitaloceanConfig?: pulumi.Input<inputs.NodeTemplateDigitaloceanConfig>;
    /**
     * (Computed) The driver of the node template (string)
     */
    driver?: pulumi.Input<string>;
    /**
     * The node driver id used by the node template. It's required if the node driver isn't built in Rancher (string)
     */
    driverId?: pulumi.Input<string>;
    /**
     * Engine environment for the node template (string)
     */
    engineEnv?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Insecure registry for the node template (list)
     */
    engineInsecureRegistries?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Docker engine install URL for the node template. Available install docker versions at `https://github.com/rancher/install-docker` (string)
     */
    engineInstallUrl?: pulumi.Input<string>;
    /**
     * Engine label for the node template (string)
     */
    engineLabel?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Engine options for the node template (map)
     */
    engineOpt?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Engine registry mirror for the node template (list)
     */
    engineRegistryMirrors?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Engine storage driver for the node template (string)
     */
    engineStorageDriver?: pulumi.Input<string>;
    /**
     * Harvester config for the Node Template (list maxitems:1)
     */
    harvesterConfig?: pulumi.Input<inputs.NodeTemplateHarvesterConfig>;
    /**
     * Hetzner config for the Node Template (list maxitems:1)
     */
    hetznerConfig?: pulumi.Input<inputs.NodeTemplateHetznerConfig>;
    /**
     * Labels for Node Template object (map)
     *
     * **Note:** `labels` and `nodeTaints` will be applied to nodes deployed using the Node Template
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Linode config for the Node Template (list maxitems:1)
     */
    linodeConfig?: pulumi.Input<inputs.NodeTemplateLinodeConfig>;
    /**
     * The name of the Node Template (string)
     */
    name?: pulumi.Input<string>;
    /**
     * Node taints. For Rancher v2.3.3 and above (List)
     */
    nodeTaints?: pulumi.Input<pulumi.Input<inputs.NodeTemplateNodeTaint>[]>;
    /**
     * Opennebula config for the Node Template (list maxitems:1)
     */
    opennebulaConfig?: pulumi.Input<inputs.NodeTemplateOpennebulaConfig>;
    /**
     * Openstack config for the Node Template (list maxitems:1)
     */
    openstackConfig?: pulumi.Input<inputs.NodeTemplateOpenstackConfig>;
    /**
     * Outscale config for the Node Template (list maxitems:1)
     */
    outscaleConfig?: pulumi.Input<inputs.NodeTemplateOutscaleConfig>;
    /**
     * Engine storage driver for the node template (bool)
     */
    useInternalIpAddress?: pulumi.Input<boolean>;
    /**
     * vSphere config for the Node Template (list maxitems:1)
     */
    vsphereConfig?: pulumi.Input<inputs.NodeTemplateVsphereConfig>;
}

/**
 * The set of arguments for constructing a NodeTemplate resource.
 */
export interface NodeTemplateArgs {
    /**
     * AWS config for the Node Template (list maxitems:1)
     */
    amazonec2Config?: pulumi.Input<inputs.NodeTemplateAmazonec2Config>;
    /**
     * Annotations for Node Template object (map)
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Auth certificate authority for the Node Template (string)
     */
    authCertificateAuthority?: pulumi.Input<string>;
    /**
     * Auth key for the Node Template (string)
     */
    authKey?: pulumi.Input<string>;
    /**
     * Azure config for the Node Template (list maxitems:1)
     */
    azureConfig?: pulumi.Input<inputs.NodeTemplateAzureConfig>;
    /**
     * Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
     */
    cloudCredentialId?: pulumi.Input<string>;
    /**
     * Description for the Node Template (string)
     */
    description?: pulumi.Input<string>;
    /**
     * Digitalocean config for the Node Template (list maxitems:1)
     */
    digitaloceanConfig?: pulumi.Input<inputs.NodeTemplateDigitaloceanConfig>;
    /**
     * The node driver id used by the node template. It's required if the node driver isn't built in Rancher (string)
     */
    driverId?: pulumi.Input<string>;
    /**
     * Engine environment for the node template (string)
     */
    engineEnv?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Insecure registry for the node template (list)
     */
    engineInsecureRegistries?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Docker engine install URL for the node template. Available install docker versions at `https://github.com/rancher/install-docker` (string)
     */
    engineInstallUrl?: pulumi.Input<string>;
    /**
     * Engine label for the node template (string)
     */
    engineLabel?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Engine options for the node template (map)
     */
    engineOpt?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Engine registry mirror for the node template (list)
     */
    engineRegistryMirrors?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Engine storage driver for the node template (string)
     */
    engineStorageDriver?: pulumi.Input<string>;
    /**
     * Harvester config for the Node Template (list maxitems:1)
     */
    harvesterConfig?: pulumi.Input<inputs.NodeTemplateHarvesterConfig>;
    /**
     * Hetzner config for the Node Template (list maxitems:1)
     */
    hetznerConfig?: pulumi.Input<inputs.NodeTemplateHetznerConfig>;
    /**
     * Labels for Node Template object (map)
     *
     * **Note:** `labels` and `nodeTaints` will be applied to nodes deployed using the Node Template
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Linode config for the Node Template (list maxitems:1)
     */
    linodeConfig?: pulumi.Input<inputs.NodeTemplateLinodeConfig>;
    /**
     * The name of the Node Template (string)
     */
    name?: pulumi.Input<string>;
    /**
     * Node taints. For Rancher v2.3.3 and above (List)
     */
    nodeTaints?: pulumi.Input<pulumi.Input<inputs.NodeTemplateNodeTaint>[]>;
    /**
     * Opennebula config for the Node Template (list maxitems:1)
     */
    opennebulaConfig?: pulumi.Input<inputs.NodeTemplateOpennebulaConfig>;
    /**
     * Openstack config for the Node Template (list maxitems:1)
     */
    openstackConfig?: pulumi.Input<inputs.NodeTemplateOpenstackConfig>;
    /**
     * Outscale config for the Node Template (list maxitems:1)
     */
    outscaleConfig?: pulumi.Input<inputs.NodeTemplateOutscaleConfig>;
    /**
     * Engine storage driver for the node template (bool)
     */
    useInternalIpAddress?: pulumi.Input<boolean>;
    /**
     * vSphere config for the Node Template (list maxitems:1)
     */
    vsphereConfig?: pulumi.Input<inputs.NodeTemplateVsphereConfig>;
}
