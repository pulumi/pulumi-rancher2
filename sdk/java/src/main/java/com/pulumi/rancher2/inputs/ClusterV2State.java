// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.ClusterV2AgentEnvVarArgs;
import com.pulumi.rancher2.inputs.ClusterV2ClusterRegistrationTokenArgs;
import com.pulumi.rancher2.inputs.ClusterV2LocalAuthEndpointArgs;
import com.pulumi.rancher2.inputs.ClusterV2RkeConfigArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterV2State extends com.pulumi.resources.ResourceArgs {

    public static final ClusterV2State Empty = new ClusterV2State();

    /**
     * Optional Agent Env Vars for Rancher agent (list)
     * 
     */
    @Import(name="agentEnvVars")
    private @Nullable Output<List<ClusterV2AgentEnvVarArgs>> agentEnvVars;

    /**
     * @return Optional Agent Env Vars for Rancher agent (list)
     * 
     */
    public Optional<Output<List<ClusterV2AgentEnvVarArgs>>> agentEnvVars() {
        return Optional.ofNullable(this.agentEnvVars);
    }

    /**
     * Annotations for cluster registration token object (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for cluster registration token object (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Cluster V2 cloud credential secret name (string)
     * 
     */
    @Import(name="cloudCredentialSecretName")
    private @Nullable Output<String> cloudCredentialSecretName;

    /**
     * @return Cluster V2 cloud credential secret name (string)
     * 
     */
    public Optional<Output<String>> cloudCredentialSecretName() {
        return Optional.ofNullable(this.cloudCredentialSecretName);
    }

    /**
     * (Computed/Sensitive) Cluster Registration Token generated for the cluster v2 (list maxitems:1)
     * 
     */
    @Import(name="clusterRegistrationToken")
    private @Nullable Output<ClusterV2ClusterRegistrationTokenArgs> clusterRegistrationToken;

    /**
     * @return (Computed/Sensitive) Cluster Registration Token generated for the cluster v2 (list maxitems:1)
     * 
     */
    public Optional<Output<ClusterV2ClusterRegistrationTokenArgs>> clusterRegistrationToken() {
        return Optional.ofNullable(this.clusterRegistrationToken);
    }

    /**
     * (Computed) Cluster v1 id for cluster v2. (e.g to be used with `rancher2_sync`) (string)
     * 
     */
    @Import(name="clusterV1Id")
    private @Nullable Output<String> clusterV1Id;

    /**
     * @return (Computed) Cluster v1 id for cluster v2. (e.g to be used with `rancher2_sync`) (string)
     * 
     */
    public Optional<Output<String>> clusterV1Id() {
        return Optional.ofNullable(this.clusterV1Id);
    }

    /**
     * Cluster V2 default cluster role for project members (string)
     * 
     */
    @Import(name="defaultClusterRoleForProjectMembers")
    private @Nullable Output<String> defaultClusterRoleForProjectMembers;

    /**
     * @return Cluster V2 default cluster role for project members (string)
     * 
     */
    public Optional<Output<String>> defaultClusterRoleForProjectMembers() {
        return Optional.ofNullable(this.defaultClusterRoleForProjectMembers);
    }

    /**
     * Cluster V2 default pod security policy template name (string)
     * 
     */
    @Import(name="defaultPodSecurityPolicyTemplateName")
    private @Nullable Output<String> defaultPodSecurityPolicyTemplateName;

    /**
     * @return Cluster V2 default pod security policy template name (string)
     * 
     */
    public Optional<Output<String>> defaultPodSecurityPolicyTemplateName() {
        return Optional.ofNullable(this.defaultPodSecurityPolicyTemplateName);
    }

    /**
     * Enable k8s network policy at Cluster V2 (bool)
     * 
     */
    @Import(name="enableNetworkPolicy")
    private @Nullable Output<Boolean> enableNetworkPolicy;

    /**
     * @return Enable k8s network policy at Cluster V2 (bool)
     * 
     */
    public Optional<Output<Boolean>> enableNetworkPolicy() {
        return Optional.ofNullable(this.enableNetworkPolicy);
    }

    /**
     * The fleet namespace of the Cluster v2. Default: `\&#34;fleet-default\&#34;` (string)
     * 
     */
    @Import(name="fleetNamespace")
    private @Nullable Output<String> fleetNamespace;

    /**
     * @return The fleet namespace of the Cluster v2. Default: `\&#34;fleet-default\&#34;` (string)
     * 
     */
    public Optional<Output<String>> fleetNamespace() {
        return Optional.ofNullable(this.fleetNamespace);
    }

    /**
     * (Computed/Sensitive) Kube Config generated for the cluster v2. Note: When the cluster has `local_auth_endpoint` enabled, the kube_config will not be available until the cluster is `connected` (string)
     * 
     */
    @Import(name="kubeConfig")
    private @Nullable Output<String> kubeConfig;

    /**
     * @return (Computed/Sensitive) Kube Config generated for the cluster v2. Note: When the cluster has `local_auth_endpoint` enabled, the kube_config will not be available until the cluster is `connected` (string)
     * 
     */
    public Optional<Output<String>> kubeConfig() {
        return Optional.ofNullable(this.kubeConfig);
    }

    /**
     * The kubernetes version of the Cluster v2 (list maxitems:1)
     * 
     */
    @Import(name="kubernetesVersion")
    private @Nullable Output<String> kubernetesVersion;

    /**
     * @return The kubernetes version of the Cluster v2 (list maxitems:1)
     * 
     */
    public Optional<Output<String>> kubernetesVersion() {
        return Optional.ofNullable(this.kubernetesVersion);
    }

    /**
     * Labels for cluster registration token object (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return Labels for cluster registration token object (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Use rancher2_cluster_v2.local_auth_endpoint instead
     * 
     */
    @Import(name="localAuthEndpoint")
    private @Nullable Output<ClusterV2LocalAuthEndpointArgs> localAuthEndpoint;

    /**
     * @return Use rancher2_cluster_v2.local_auth_endpoint instead
     * 
     */
    public Optional<Output<ClusterV2LocalAuthEndpointArgs>> localAuthEndpoint() {
        return Optional.ofNullable(this.localAuthEndpoint);
    }

    /**
     * Name of cluster registration token (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of cluster registration token (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * (Computed) Cluster v2 k8s resource version (string)
     * 
     */
    @Import(name="resourceVersion")
    private @Nullable Output<String> resourceVersion;

    /**
     * @return (Computed) Cluster v2 k8s resource version (string)
     * 
     */
    public Optional<Output<String>> resourceVersion() {
        return Optional.ofNullable(this.resourceVersion);
    }

    /**
     * The RKE configuration for `k3s` and `rke2` Clusters v2. (list maxitems:1)
     * 
     */
    @Import(name="rkeConfig")
    private @Nullable Output<ClusterV2RkeConfigArgs> rkeConfig;

    /**
     * @return The RKE configuration for `k3s` and `rke2` Clusters v2. (list maxitems:1)
     * 
     */
    public Optional<Output<ClusterV2RkeConfigArgs>> rkeConfig() {
        return Optional.ofNullable(this.rkeConfig);
    }

    private ClusterV2State() {}

    private ClusterV2State(ClusterV2State $) {
        this.agentEnvVars = $.agentEnvVars;
        this.annotations = $.annotations;
        this.cloudCredentialSecretName = $.cloudCredentialSecretName;
        this.clusterRegistrationToken = $.clusterRegistrationToken;
        this.clusterV1Id = $.clusterV1Id;
        this.defaultClusterRoleForProjectMembers = $.defaultClusterRoleForProjectMembers;
        this.defaultPodSecurityPolicyTemplateName = $.defaultPodSecurityPolicyTemplateName;
        this.enableNetworkPolicy = $.enableNetworkPolicy;
        this.fleetNamespace = $.fleetNamespace;
        this.kubeConfig = $.kubeConfig;
        this.kubernetesVersion = $.kubernetesVersion;
        this.labels = $.labels;
        this.localAuthEndpoint = $.localAuthEndpoint;
        this.name = $.name;
        this.resourceVersion = $.resourceVersion;
        this.rkeConfig = $.rkeConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterV2State defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterV2State $;

        public Builder() {
            $ = new ClusterV2State();
        }

        public Builder(ClusterV2State defaults) {
            $ = new ClusterV2State(Objects.requireNonNull(defaults));
        }

        /**
         * @param agentEnvVars Optional Agent Env Vars for Rancher agent (list)
         * 
         * @return builder
         * 
         */
        public Builder agentEnvVars(@Nullable Output<List<ClusterV2AgentEnvVarArgs>> agentEnvVars) {
            $.agentEnvVars = agentEnvVars;
            return this;
        }

        /**
         * @param agentEnvVars Optional Agent Env Vars for Rancher agent (list)
         * 
         * @return builder
         * 
         */
        public Builder agentEnvVars(List<ClusterV2AgentEnvVarArgs> agentEnvVars) {
            return agentEnvVars(Output.of(agentEnvVars));
        }

        /**
         * @param agentEnvVars Optional Agent Env Vars for Rancher agent (list)
         * 
         * @return builder
         * 
         */
        public Builder agentEnvVars(ClusterV2AgentEnvVarArgs... agentEnvVars) {
            return agentEnvVars(List.of(agentEnvVars));
        }

        /**
         * @param annotations Annotations for cluster registration token object (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations for cluster registration token object (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param cloudCredentialSecretName Cluster V2 cloud credential secret name (string)
         * 
         * @return builder
         * 
         */
        public Builder cloudCredentialSecretName(@Nullable Output<String> cloudCredentialSecretName) {
            $.cloudCredentialSecretName = cloudCredentialSecretName;
            return this;
        }

        /**
         * @param cloudCredentialSecretName Cluster V2 cloud credential secret name (string)
         * 
         * @return builder
         * 
         */
        public Builder cloudCredentialSecretName(String cloudCredentialSecretName) {
            return cloudCredentialSecretName(Output.of(cloudCredentialSecretName));
        }

        /**
         * @param clusterRegistrationToken (Computed/Sensitive) Cluster Registration Token generated for the cluster v2 (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder clusterRegistrationToken(@Nullable Output<ClusterV2ClusterRegistrationTokenArgs> clusterRegistrationToken) {
            $.clusterRegistrationToken = clusterRegistrationToken;
            return this;
        }

        /**
         * @param clusterRegistrationToken (Computed/Sensitive) Cluster Registration Token generated for the cluster v2 (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder clusterRegistrationToken(ClusterV2ClusterRegistrationTokenArgs clusterRegistrationToken) {
            return clusterRegistrationToken(Output.of(clusterRegistrationToken));
        }

        /**
         * @param clusterV1Id (Computed) Cluster v1 id for cluster v2. (e.g to be used with `rancher2_sync`) (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterV1Id(@Nullable Output<String> clusterV1Id) {
            $.clusterV1Id = clusterV1Id;
            return this;
        }

        /**
         * @param clusterV1Id (Computed) Cluster v1 id for cluster v2. (e.g to be used with `rancher2_sync`) (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterV1Id(String clusterV1Id) {
            return clusterV1Id(Output.of(clusterV1Id));
        }

        /**
         * @param defaultClusterRoleForProjectMembers Cluster V2 default cluster role for project members (string)
         * 
         * @return builder
         * 
         */
        public Builder defaultClusterRoleForProjectMembers(@Nullable Output<String> defaultClusterRoleForProjectMembers) {
            $.defaultClusterRoleForProjectMembers = defaultClusterRoleForProjectMembers;
            return this;
        }

        /**
         * @param defaultClusterRoleForProjectMembers Cluster V2 default cluster role for project members (string)
         * 
         * @return builder
         * 
         */
        public Builder defaultClusterRoleForProjectMembers(String defaultClusterRoleForProjectMembers) {
            return defaultClusterRoleForProjectMembers(Output.of(defaultClusterRoleForProjectMembers));
        }

        /**
         * @param defaultPodSecurityPolicyTemplateName Cluster V2 default pod security policy template name (string)
         * 
         * @return builder
         * 
         */
        public Builder defaultPodSecurityPolicyTemplateName(@Nullable Output<String> defaultPodSecurityPolicyTemplateName) {
            $.defaultPodSecurityPolicyTemplateName = defaultPodSecurityPolicyTemplateName;
            return this;
        }

        /**
         * @param defaultPodSecurityPolicyTemplateName Cluster V2 default pod security policy template name (string)
         * 
         * @return builder
         * 
         */
        public Builder defaultPodSecurityPolicyTemplateName(String defaultPodSecurityPolicyTemplateName) {
            return defaultPodSecurityPolicyTemplateName(Output.of(defaultPodSecurityPolicyTemplateName));
        }

        /**
         * @param enableNetworkPolicy Enable k8s network policy at Cluster V2 (bool)
         * 
         * @return builder
         * 
         */
        public Builder enableNetworkPolicy(@Nullable Output<Boolean> enableNetworkPolicy) {
            $.enableNetworkPolicy = enableNetworkPolicy;
            return this;
        }

        /**
         * @param enableNetworkPolicy Enable k8s network policy at Cluster V2 (bool)
         * 
         * @return builder
         * 
         */
        public Builder enableNetworkPolicy(Boolean enableNetworkPolicy) {
            return enableNetworkPolicy(Output.of(enableNetworkPolicy));
        }

        /**
         * @param fleetNamespace The fleet namespace of the Cluster v2. Default: `\&#34;fleet-default\&#34;` (string)
         * 
         * @return builder
         * 
         */
        public Builder fleetNamespace(@Nullable Output<String> fleetNamespace) {
            $.fleetNamespace = fleetNamespace;
            return this;
        }

        /**
         * @param fleetNamespace The fleet namespace of the Cluster v2. Default: `\&#34;fleet-default\&#34;` (string)
         * 
         * @return builder
         * 
         */
        public Builder fleetNamespace(String fleetNamespace) {
            return fleetNamespace(Output.of(fleetNamespace));
        }

        /**
         * @param kubeConfig (Computed/Sensitive) Kube Config generated for the cluster v2. Note: When the cluster has `local_auth_endpoint` enabled, the kube_config will not be available until the cluster is `connected` (string)
         * 
         * @return builder
         * 
         */
        public Builder kubeConfig(@Nullable Output<String> kubeConfig) {
            $.kubeConfig = kubeConfig;
            return this;
        }

        /**
         * @param kubeConfig (Computed/Sensitive) Kube Config generated for the cluster v2. Note: When the cluster has `local_auth_endpoint` enabled, the kube_config will not be available until the cluster is `connected` (string)
         * 
         * @return builder
         * 
         */
        public Builder kubeConfig(String kubeConfig) {
            return kubeConfig(Output.of(kubeConfig));
        }

        /**
         * @param kubernetesVersion The kubernetes version of the Cluster v2 (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder kubernetesVersion(@Nullable Output<String> kubernetesVersion) {
            $.kubernetesVersion = kubernetesVersion;
            return this;
        }

        /**
         * @param kubernetesVersion The kubernetes version of the Cluster v2 (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder kubernetesVersion(String kubernetesVersion) {
            return kubernetesVersion(Output.of(kubernetesVersion));
        }

        /**
         * @param labels Labels for cluster registration token object (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for cluster registration token object (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param localAuthEndpoint Use rancher2_cluster_v2.local_auth_endpoint instead
         * 
         * @return builder
         * 
         */
        public Builder localAuthEndpoint(@Nullable Output<ClusterV2LocalAuthEndpointArgs> localAuthEndpoint) {
            $.localAuthEndpoint = localAuthEndpoint;
            return this;
        }

        /**
         * @param localAuthEndpoint Use rancher2_cluster_v2.local_auth_endpoint instead
         * 
         * @return builder
         * 
         */
        public Builder localAuthEndpoint(ClusterV2LocalAuthEndpointArgs localAuthEndpoint) {
            return localAuthEndpoint(Output.of(localAuthEndpoint));
        }

        /**
         * @param name Name of cluster registration token (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of cluster registration token (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceVersion (Computed) Cluster v2 k8s resource version (string)
         * 
         * @return builder
         * 
         */
        public Builder resourceVersion(@Nullable Output<String> resourceVersion) {
            $.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * @param resourceVersion (Computed) Cluster v2 k8s resource version (string)
         * 
         * @return builder
         * 
         */
        public Builder resourceVersion(String resourceVersion) {
            return resourceVersion(Output.of(resourceVersion));
        }

        /**
         * @param rkeConfig The RKE configuration for `k3s` and `rke2` Clusters v2. (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder rkeConfig(@Nullable Output<ClusterV2RkeConfigArgs> rkeConfig) {
            $.rkeConfig = rkeConfig;
            return this;
        }

        /**
         * @param rkeConfig The RKE configuration for `k3s` and `rke2` Clusters v2. (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder rkeConfig(ClusterV2RkeConfigArgs rkeConfig) {
            return rkeConfig(Output.of(rkeConfig));
        }

        public ClusterV2State build() {
            return $;
        }
    }

}