// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.ClusterRkeConfigAuthenticationArgs;
import com.pulumi.rancher2.inputs.ClusterRkeConfigAuthorizationArgs;
import com.pulumi.rancher2.inputs.ClusterRkeConfigBastionHostArgs;
import com.pulumi.rancher2.inputs.ClusterRkeConfigCloudProviderArgs;
import com.pulumi.rancher2.inputs.ClusterRkeConfigDnsArgs;
import com.pulumi.rancher2.inputs.ClusterRkeConfigIngressArgs;
import com.pulumi.rancher2.inputs.ClusterRkeConfigMonitoringArgs;
import com.pulumi.rancher2.inputs.ClusterRkeConfigNetworkArgs;
import com.pulumi.rancher2.inputs.ClusterRkeConfigNodeArgs;
import com.pulumi.rancher2.inputs.ClusterRkeConfigPrivateRegistryArgs;
import com.pulumi.rancher2.inputs.ClusterRkeConfigServicesArgs;
import com.pulumi.rancher2.inputs.ClusterRkeConfigUpgradeStrategyArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRkeConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRkeConfigArgs Empty = new ClusterRkeConfigArgs();

    /**
     * Duration in seconds of addon job (int)
     * 
     */
    @Import(name="addonJobTimeout")
    private @Nullable Output<Integer> addonJobTimeout;

    /**
     * @return Duration in seconds of addon job (int)
     * 
     */
    public Optional<Output<Integer>> addonJobTimeout() {
        return Optional.ofNullable(this.addonJobTimeout);
    }

    /**
     * Addons descripton to deploy on RKE cluster.
     * 
     */
    @Import(name="addons")
    private @Nullable Output<String> addons;

    /**
     * @return Addons descripton to deploy on RKE cluster.
     * 
     */
    public Optional<Output<String>> addons() {
        return Optional.ofNullable(this.addons);
    }

    /**
     * Addons yaml manifests to deploy on RKE cluster (list)
     * 
     */
    @Import(name="addonsIncludes")
    private @Nullable Output<List<String>> addonsIncludes;

    /**
     * @return Addons yaml manifests to deploy on RKE cluster (list)
     * 
     */
    public Optional<Output<List<String>>> addonsIncludes() {
        return Optional.ofNullable(this.addonsIncludes);
    }

    /**
     * Kubernetes cluster authentication (list maxitems:1)
     * 
     */
    @Import(name="authentication")
    private @Nullable Output<ClusterRkeConfigAuthenticationArgs> authentication;

    /**
     * @return Kubernetes cluster authentication (list maxitems:1)
     * 
     */
    public Optional<Output<ClusterRkeConfigAuthenticationArgs>> authentication() {
        return Optional.ofNullable(this.authentication);
    }

    /**
     * Kubernetes cluster authorization (list maxitems:1)
     * 
     */
    @Import(name="authorization")
    private @Nullable Output<ClusterRkeConfigAuthorizationArgs> authorization;

    /**
     * @return Kubernetes cluster authorization (list maxitems:1)
     * 
     */
    public Optional<Output<ClusterRkeConfigAuthorizationArgs>> authorization() {
        return Optional.ofNullable(this.authorization);
    }

    /**
     * RKE bastion host (list maxitems:1)
     * 
     */
    @Import(name="bastionHost")
    private @Nullable Output<ClusterRkeConfigBastionHostArgs> bastionHost;

    /**
     * @return RKE bastion host (list maxitems:1)
     * 
     */
    public Optional<Output<ClusterRkeConfigBastionHostArgs>> bastionHost() {
        return Optional.ofNullable(this.bastionHost);
    }

    /**
     * RKE options for Calico network provider (string)
     * 
     */
    @Import(name="cloudProvider")
    private @Nullable Output<ClusterRkeConfigCloudProviderArgs> cloudProvider;

    /**
     * @return RKE options for Calico network provider (string)
     * 
     */
    public Optional<Output<ClusterRkeConfigCloudProviderArgs>> cloudProvider() {
        return Optional.ofNullable(this.cloudProvider);
    }

    /**
     * RKE dns add-on. Just for Rancher v2.2.x (list maxitems:1)
     * 
     */
    @Import(name="dns")
    private @Nullable Output<ClusterRkeConfigDnsArgs> dns;

    /**
     * @return RKE dns add-on. Just for Rancher v2.2.x (list maxitems:1)
     * 
     */
    public Optional<Output<ClusterRkeConfigDnsArgs>> dns() {
        return Optional.ofNullable(this.dns);
    }

    /**
     * Enable/disable using cri-dockerd. Deafult: `false` [enable_cri_dockerd](https://rancher.com/docs/rke/latest/en/config-options/#cri-dockerd) (bool)
     * 
     */
    @Import(name="enableCriDockerd")
    private @Nullable Output<Boolean> enableCriDockerd;

    /**
     * @return Enable/disable using cri-dockerd. Deafult: `false` [enable_cri_dockerd](https://rancher.com/docs/rke/latest/en/config-options/#cri-dockerd) (bool)
     * 
     */
    public Optional<Output<Boolean>> enableCriDockerd() {
        return Optional.ofNullable(this.enableCriDockerd);
    }

    /**
     * Ignore docker version. Default `true` (bool)
     * 
     */
    @Import(name="ignoreDockerVersion")
    private @Nullable Output<Boolean> ignoreDockerVersion;

    /**
     * @return Ignore docker version. Default `true` (bool)
     * 
     */
    public Optional<Output<Boolean>> ignoreDockerVersion() {
        return Optional.ofNullable(this.ignoreDockerVersion);
    }

    /**
     * Kubernetes ingress configuration (list maxitems:1)
     * 
     */
    @Import(name="ingress")
    private @Nullable Output<ClusterRkeConfigIngressArgs> ingress;

    /**
     * @return Kubernetes ingress configuration (list maxitems:1)
     * 
     */
    public Optional<Output<ClusterRkeConfigIngressArgs>> ingress() {
        return Optional.ofNullable(this.ingress);
    }

    /**
     * The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
     * 
     */
    @Import(name="kubernetesVersion")
    private @Nullable Output<String> kubernetesVersion;

    /**
     * @return The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
     * 
     */
    public Optional<Output<String>> kubernetesVersion() {
        return Optional.ofNullable(this.kubernetesVersion);
    }

    /**
     * Is AKS cluster monitoring enabled? (bool)
     * 
     */
    @Import(name="monitoring")
    private @Nullable Output<ClusterRkeConfigMonitoringArgs> monitoring;

    /**
     * @return Is AKS cluster monitoring enabled? (bool)
     * 
     */
    public Optional<Output<ClusterRkeConfigMonitoringArgs>> monitoring() {
        return Optional.ofNullable(this.monitoring);
    }

    /**
     * The GKE cluster network. Required for create new cluster (string)
     * 
     */
    @Import(name="network")
    private @Nullable Output<ClusterRkeConfigNetworkArgs> network;

    /**
     * @return The GKE cluster network. Required for create new cluster (string)
     * 
     */
    public Optional<Output<ClusterRkeConfigNetworkArgs>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * RKE cluster nodes (list)
     * 
     */
    @Import(name="nodes")
    private @Nullable Output<List<ClusterRkeConfigNodeArgs>> nodes;

    /**
     * @return RKE cluster nodes (list)
     * 
     */
    public Optional<Output<List<ClusterRkeConfigNodeArgs>>> nodes() {
        return Optional.ofNullable(this.nodes);
    }

    /**
     * Prefix to customize Kubernetes path (string)
     * 
     */
    @Import(name="prefixPath")
    private @Nullable Output<String> prefixPath;

    /**
     * @return Prefix to customize Kubernetes path (string)
     * 
     */
    public Optional<Output<String>> prefixPath() {
        return Optional.ofNullable(this.prefixPath);
    }

    /**
     * private registries for docker images (list)
     * 
     */
    @Import(name="privateRegistries")
    private @Nullable Output<List<ClusterRkeConfigPrivateRegistryArgs>> privateRegistries;

    /**
     * @return private registries for docker images (list)
     * 
     */
    public Optional<Output<List<ClusterRkeConfigPrivateRegistryArgs>>> privateRegistries() {
        return Optional.ofNullable(this.privateRegistries);
    }

    /**
     * Kubernetes cluster services (list maxitems:1)
     * 
     */
    @Import(name="services")
    private @Nullable Output<ClusterRkeConfigServicesArgs> services;

    /**
     * @return Kubernetes cluster services (list maxitems:1)
     * 
     */
    public Optional<Output<ClusterRkeConfigServicesArgs>> services() {
        return Optional.ofNullable(this.services);
    }

    /**
     * Use ssh agent auth. Default `false` (bool)
     * 
     */
    @Import(name="sshAgentAuth")
    private @Nullable Output<Boolean> sshAgentAuth;

    /**
     * @return Use ssh agent auth. Default `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> sshAgentAuth() {
        return Optional.ofNullable(this.sshAgentAuth);
    }

    /**
     * Cluster level SSH certificate path (string)
     * 
     */
    @Import(name="sshCertPath")
    private @Nullable Output<String> sshCertPath;

    /**
     * @return Cluster level SSH certificate path (string)
     * 
     */
    public Optional<Output<String>> sshCertPath() {
        return Optional.ofNullable(this.sshCertPath);
    }

    /**
     * Node SSH private key path (string)
     * 
     */
    @Import(name="sshKeyPath")
    private @Nullable Output<String> sshKeyPath;

    /**
     * @return Node SSH private key path (string)
     * 
     */
    public Optional<Output<String>> sshKeyPath() {
        return Optional.ofNullable(this.sshKeyPath);
    }

    /**
     * K3S upgrade strategy (List maxitems: 1)
     * 
     */
    @Import(name="upgradeStrategy")
    private @Nullable Output<ClusterRkeConfigUpgradeStrategyArgs> upgradeStrategy;

    /**
     * @return K3S upgrade strategy (List maxitems: 1)
     * 
     */
    public Optional<Output<ClusterRkeConfigUpgradeStrategyArgs>> upgradeStrategy() {
        return Optional.ofNullable(this.upgradeStrategy);
    }

    /**
     * Prefix to customize Kubernetes path for windows (string)
     * 
     */
    @Import(name="winPrefixPath")
    private @Nullable Output<String> winPrefixPath;

    /**
     * @return Prefix to customize Kubernetes path for windows (string)
     * 
     */
    public Optional<Output<String>> winPrefixPath() {
        return Optional.ofNullable(this.winPrefixPath);
    }

    private ClusterRkeConfigArgs() {}

    private ClusterRkeConfigArgs(ClusterRkeConfigArgs $) {
        this.addonJobTimeout = $.addonJobTimeout;
        this.addons = $.addons;
        this.addonsIncludes = $.addonsIncludes;
        this.authentication = $.authentication;
        this.authorization = $.authorization;
        this.bastionHost = $.bastionHost;
        this.cloudProvider = $.cloudProvider;
        this.dns = $.dns;
        this.enableCriDockerd = $.enableCriDockerd;
        this.ignoreDockerVersion = $.ignoreDockerVersion;
        this.ingress = $.ingress;
        this.kubernetesVersion = $.kubernetesVersion;
        this.monitoring = $.monitoring;
        this.network = $.network;
        this.nodes = $.nodes;
        this.prefixPath = $.prefixPath;
        this.privateRegistries = $.privateRegistries;
        this.services = $.services;
        this.sshAgentAuth = $.sshAgentAuth;
        this.sshCertPath = $.sshCertPath;
        this.sshKeyPath = $.sshKeyPath;
        this.upgradeStrategy = $.upgradeStrategy;
        this.winPrefixPath = $.winPrefixPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRkeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRkeConfigArgs $;

        public Builder() {
            $ = new ClusterRkeConfigArgs();
        }

        public Builder(ClusterRkeConfigArgs defaults) {
            $ = new ClusterRkeConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addonJobTimeout Duration in seconds of addon job (int)
         * 
         * @return builder
         * 
         */
        public Builder addonJobTimeout(@Nullable Output<Integer> addonJobTimeout) {
            $.addonJobTimeout = addonJobTimeout;
            return this;
        }

        /**
         * @param addonJobTimeout Duration in seconds of addon job (int)
         * 
         * @return builder
         * 
         */
        public Builder addonJobTimeout(Integer addonJobTimeout) {
            return addonJobTimeout(Output.of(addonJobTimeout));
        }

        /**
         * @param addons Addons descripton to deploy on RKE cluster.
         * 
         * @return builder
         * 
         */
        public Builder addons(@Nullable Output<String> addons) {
            $.addons = addons;
            return this;
        }

        /**
         * @param addons Addons descripton to deploy on RKE cluster.
         * 
         * @return builder
         * 
         */
        public Builder addons(String addons) {
            return addons(Output.of(addons));
        }

        /**
         * @param addonsIncludes Addons yaml manifests to deploy on RKE cluster (list)
         * 
         * @return builder
         * 
         */
        public Builder addonsIncludes(@Nullable Output<List<String>> addonsIncludes) {
            $.addonsIncludes = addonsIncludes;
            return this;
        }

        /**
         * @param addonsIncludes Addons yaml manifests to deploy on RKE cluster (list)
         * 
         * @return builder
         * 
         */
        public Builder addonsIncludes(List<String> addonsIncludes) {
            return addonsIncludes(Output.of(addonsIncludes));
        }

        /**
         * @param addonsIncludes Addons yaml manifests to deploy on RKE cluster (list)
         * 
         * @return builder
         * 
         */
        public Builder addonsIncludes(String... addonsIncludes) {
            return addonsIncludes(List.of(addonsIncludes));
        }

        /**
         * @param authentication Kubernetes cluster authentication (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder authentication(@Nullable Output<ClusterRkeConfigAuthenticationArgs> authentication) {
            $.authentication = authentication;
            return this;
        }

        /**
         * @param authentication Kubernetes cluster authentication (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder authentication(ClusterRkeConfigAuthenticationArgs authentication) {
            return authentication(Output.of(authentication));
        }

        /**
         * @param authorization Kubernetes cluster authorization (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder authorization(@Nullable Output<ClusterRkeConfigAuthorizationArgs> authorization) {
            $.authorization = authorization;
            return this;
        }

        /**
         * @param authorization Kubernetes cluster authorization (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder authorization(ClusterRkeConfigAuthorizationArgs authorization) {
            return authorization(Output.of(authorization));
        }

        /**
         * @param bastionHost RKE bastion host (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder bastionHost(@Nullable Output<ClusterRkeConfigBastionHostArgs> bastionHost) {
            $.bastionHost = bastionHost;
            return this;
        }

        /**
         * @param bastionHost RKE bastion host (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder bastionHost(ClusterRkeConfigBastionHostArgs bastionHost) {
            return bastionHost(Output.of(bastionHost));
        }

        /**
         * @param cloudProvider RKE options for Calico network provider (string)
         * 
         * @return builder
         * 
         */
        public Builder cloudProvider(@Nullable Output<ClusterRkeConfigCloudProviderArgs> cloudProvider) {
            $.cloudProvider = cloudProvider;
            return this;
        }

        /**
         * @param cloudProvider RKE options for Calico network provider (string)
         * 
         * @return builder
         * 
         */
        public Builder cloudProvider(ClusterRkeConfigCloudProviderArgs cloudProvider) {
            return cloudProvider(Output.of(cloudProvider));
        }

        /**
         * @param dns RKE dns add-on. Just for Rancher v2.2.x (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder dns(@Nullable Output<ClusterRkeConfigDnsArgs> dns) {
            $.dns = dns;
            return this;
        }

        /**
         * @param dns RKE dns add-on. Just for Rancher v2.2.x (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder dns(ClusterRkeConfigDnsArgs dns) {
            return dns(Output.of(dns));
        }

        /**
         * @param enableCriDockerd Enable/disable using cri-dockerd. Deafult: `false` [enable_cri_dockerd](https://rancher.com/docs/rke/latest/en/config-options/#cri-dockerd) (bool)
         * 
         * @return builder
         * 
         */
        public Builder enableCriDockerd(@Nullable Output<Boolean> enableCriDockerd) {
            $.enableCriDockerd = enableCriDockerd;
            return this;
        }

        /**
         * @param enableCriDockerd Enable/disable using cri-dockerd. Deafult: `false` [enable_cri_dockerd](https://rancher.com/docs/rke/latest/en/config-options/#cri-dockerd) (bool)
         * 
         * @return builder
         * 
         */
        public Builder enableCriDockerd(Boolean enableCriDockerd) {
            return enableCriDockerd(Output.of(enableCriDockerd));
        }

        /**
         * @param ignoreDockerVersion Ignore docker version. Default `true` (bool)
         * 
         * @return builder
         * 
         */
        public Builder ignoreDockerVersion(@Nullable Output<Boolean> ignoreDockerVersion) {
            $.ignoreDockerVersion = ignoreDockerVersion;
            return this;
        }

        /**
         * @param ignoreDockerVersion Ignore docker version. Default `true` (bool)
         * 
         * @return builder
         * 
         */
        public Builder ignoreDockerVersion(Boolean ignoreDockerVersion) {
            return ignoreDockerVersion(Output.of(ignoreDockerVersion));
        }

        /**
         * @param ingress Kubernetes ingress configuration (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder ingress(@Nullable Output<ClusterRkeConfigIngressArgs> ingress) {
            $.ingress = ingress;
            return this;
        }

        /**
         * @param ingress Kubernetes ingress configuration (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder ingress(ClusterRkeConfigIngressArgs ingress) {
            return ingress(Output.of(ingress));
        }

        /**
         * @param kubernetesVersion The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
         * 
         * @return builder
         * 
         */
        public Builder kubernetesVersion(@Nullable Output<String> kubernetesVersion) {
            $.kubernetesVersion = kubernetesVersion;
            return this;
        }

        /**
         * @param kubernetesVersion The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
         * 
         * @return builder
         * 
         */
        public Builder kubernetesVersion(String kubernetesVersion) {
            return kubernetesVersion(Output.of(kubernetesVersion));
        }

        /**
         * @param monitoring Is AKS cluster monitoring enabled? (bool)
         * 
         * @return builder
         * 
         */
        public Builder monitoring(@Nullable Output<ClusterRkeConfigMonitoringArgs> monitoring) {
            $.monitoring = monitoring;
            return this;
        }

        /**
         * @param monitoring Is AKS cluster monitoring enabled? (bool)
         * 
         * @return builder
         * 
         */
        public Builder monitoring(ClusterRkeConfigMonitoringArgs monitoring) {
            return monitoring(Output.of(monitoring));
        }

        /**
         * @param network The GKE cluster network. Required for create new cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<ClusterRkeConfigNetworkArgs> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The GKE cluster network. Required for create new cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder network(ClusterRkeConfigNetworkArgs network) {
            return network(Output.of(network));
        }

        /**
         * @param nodes RKE cluster nodes (list)
         * 
         * @return builder
         * 
         */
        public Builder nodes(@Nullable Output<List<ClusterRkeConfigNodeArgs>> nodes) {
            $.nodes = nodes;
            return this;
        }

        /**
         * @param nodes RKE cluster nodes (list)
         * 
         * @return builder
         * 
         */
        public Builder nodes(List<ClusterRkeConfigNodeArgs> nodes) {
            return nodes(Output.of(nodes));
        }

        /**
         * @param nodes RKE cluster nodes (list)
         * 
         * @return builder
         * 
         */
        public Builder nodes(ClusterRkeConfigNodeArgs... nodes) {
            return nodes(List.of(nodes));
        }

        /**
         * @param prefixPath Prefix to customize Kubernetes path (string)
         * 
         * @return builder
         * 
         */
        public Builder prefixPath(@Nullable Output<String> prefixPath) {
            $.prefixPath = prefixPath;
            return this;
        }

        /**
         * @param prefixPath Prefix to customize Kubernetes path (string)
         * 
         * @return builder
         * 
         */
        public Builder prefixPath(String prefixPath) {
            return prefixPath(Output.of(prefixPath));
        }

        /**
         * @param privateRegistries private registries for docker images (list)
         * 
         * @return builder
         * 
         */
        public Builder privateRegistries(@Nullable Output<List<ClusterRkeConfigPrivateRegistryArgs>> privateRegistries) {
            $.privateRegistries = privateRegistries;
            return this;
        }

        /**
         * @param privateRegistries private registries for docker images (list)
         * 
         * @return builder
         * 
         */
        public Builder privateRegistries(List<ClusterRkeConfigPrivateRegistryArgs> privateRegistries) {
            return privateRegistries(Output.of(privateRegistries));
        }

        /**
         * @param privateRegistries private registries for docker images (list)
         * 
         * @return builder
         * 
         */
        public Builder privateRegistries(ClusterRkeConfigPrivateRegistryArgs... privateRegistries) {
            return privateRegistries(List.of(privateRegistries));
        }

        /**
         * @param services Kubernetes cluster services (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder services(@Nullable Output<ClusterRkeConfigServicesArgs> services) {
            $.services = services;
            return this;
        }

        /**
         * @param services Kubernetes cluster services (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder services(ClusterRkeConfigServicesArgs services) {
            return services(Output.of(services));
        }

        /**
         * @param sshAgentAuth Use ssh agent auth. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder sshAgentAuth(@Nullable Output<Boolean> sshAgentAuth) {
            $.sshAgentAuth = sshAgentAuth;
            return this;
        }

        /**
         * @param sshAgentAuth Use ssh agent auth. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder sshAgentAuth(Boolean sshAgentAuth) {
            return sshAgentAuth(Output.of(sshAgentAuth));
        }

        /**
         * @param sshCertPath Cluster level SSH certificate path (string)
         * 
         * @return builder
         * 
         */
        public Builder sshCertPath(@Nullable Output<String> sshCertPath) {
            $.sshCertPath = sshCertPath;
            return this;
        }

        /**
         * @param sshCertPath Cluster level SSH certificate path (string)
         * 
         * @return builder
         * 
         */
        public Builder sshCertPath(String sshCertPath) {
            return sshCertPath(Output.of(sshCertPath));
        }

        /**
         * @param sshKeyPath Node SSH private key path (string)
         * 
         * @return builder
         * 
         */
        public Builder sshKeyPath(@Nullable Output<String> sshKeyPath) {
            $.sshKeyPath = sshKeyPath;
            return this;
        }

        /**
         * @param sshKeyPath Node SSH private key path (string)
         * 
         * @return builder
         * 
         */
        public Builder sshKeyPath(String sshKeyPath) {
            return sshKeyPath(Output.of(sshKeyPath));
        }

        /**
         * @param upgradeStrategy K3S upgrade strategy (List maxitems: 1)
         * 
         * @return builder
         * 
         */
        public Builder upgradeStrategy(@Nullable Output<ClusterRkeConfigUpgradeStrategyArgs> upgradeStrategy) {
            $.upgradeStrategy = upgradeStrategy;
            return this;
        }

        /**
         * @param upgradeStrategy K3S upgrade strategy (List maxitems: 1)
         * 
         * @return builder
         * 
         */
        public Builder upgradeStrategy(ClusterRkeConfigUpgradeStrategyArgs upgradeStrategy) {
            return upgradeStrategy(Output.of(upgradeStrategy));
        }

        /**
         * @param winPrefixPath Prefix to customize Kubernetes path for windows (string)
         * 
         * @return builder
         * 
         */
        public Builder winPrefixPath(@Nullable Output<String> winPrefixPath) {
            $.winPrefixPath = winPrefixPath;
            return this;
        }

        /**
         * @param winPrefixPath Prefix to customize Kubernetes path for windows (string)
         * 
         * @return builder
         * 
         */
        public Builder winPrefixPath(String winPrefixPath) {
            return winPrefixPath(Output.of(winPrefixPath));
        }

        public ClusterRkeConfigArgs build() {
            return $;
        }
    }

}