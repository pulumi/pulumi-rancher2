// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterRkeConfigIngressToleration;
import com.pulumi.rancher2.outputs.ClusterRkeConfigIngressUpdateStrategy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRkeConfigIngress {
    /**
     * @return Enable ingress default backend. Default: `true` (bool)
     * 
     */
    private final @Nullable Boolean defaultBackend;
    /**
     * @return Ingress controller DNS policy. `ClusterFirstWithHostNet`, `ClusterFirst`, `Default`, and `None` are supported. [K8S dns Policy](https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/#pod-s-dns-policy) (string)
     * 
     */
    private final @Nullable String dnsPolicy;
    /**
     * @return Extra arguments for scheduler service (map)
     * 
     */
    private final @Nullable Map<String,Object> extraArgs;
    /**
     * @return HTTP port for RKE Ingress (int)
     * 
     */
    private final @Nullable Integer httpPort;
    /**
     * @return HTTPS port for RKE Ingress (int)
     * 
     */
    private final @Nullable Integer httpsPort;
    /**
     * @return Network mode for RKE Ingress (string)
     * 
     */
    private final @Nullable String networkMode;
    /**
     * @return RKE monitoring node selector (map)
     * 
     */
    private final @Nullable Map<String,Object> nodeSelector;
    /**
     * @return RKE options for network (map)
     * 
     */
    private final @Nullable Map<String,Object> options;
    /**
     * @return RKE monitoring provider (string)
     * 
     */
    private final @Nullable String provider;
    /**
     * @return Network add-on tolerations (list)
     * 
     */
    private final @Nullable List<ClusterRkeConfigIngressToleration> tolerations;
    /**
     * @return RKE monitoring update strategy (list Maxitems: 1)
     * 
     */
    private final @Nullable ClusterRkeConfigIngressUpdateStrategy updateStrategy;

    @CustomType.Constructor
    private ClusterRkeConfigIngress(
        @CustomType.Parameter("defaultBackend") @Nullable Boolean defaultBackend,
        @CustomType.Parameter("dnsPolicy") @Nullable String dnsPolicy,
        @CustomType.Parameter("extraArgs") @Nullable Map<String,Object> extraArgs,
        @CustomType.Parameter("httpPort") @Nullable Integer httpPort,
        @CustomType.Parameter("httpsPort") @Nullable Integer httpsPort,
        @CustomType.Parameter("networkMode") @Nullable String networkMode,
        @CustomType.Parameter("nodeSelector") @Nullable Map<String,Object> nodeSelector,
        @CustomType.Parameter("options") @Nullable Map<String,Object> options,
        @CustomType.Parameter("provider") @Nullable String provider,
        @CustomType.Parameter("tolerations") @Nullable List<ClusterRkeConfigIngressToleration> tolerations,
        @CustomType.Parameter("updateStrategy") @Nullable ClusterRkeConfigIngressUpdateStrategy updateStrategy) {
        this.defaultBackend = defaultBackend;
        this.dnsPolicy = dnsPolicy;
        this.extraArgs = extraArgs;
        this.httpPort = httpPort;
        this.httpsPort = httpsPort;
        this.networkMode = networkMode;
        this.nodeSelector = nodeSelector;
        this.options = options;
        this.provider = provider;
        this.tolerations = tolerations;
        this.updateStrategy = updateStrategy;
    }

    /**
     * @return Enable ingress default backend. Default: `true` (bool)
     * 
     */
    public Optional<Boolean> defaultBackend() {
        return Optional.ofNullable(this.defaultBackend);
    }
    /**
     * @return Ingress controller DNS policy. `ClusterFirstWithHostNet`, `ClusterFirst`, `Default`, and `None` are supported. [K8S dns Policy](https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/#pod-s-dns-policy) (string)
     * 
     */
    public Optional<String> dnsPolicy() {
        return Optional.ofNullable(this.dnsPolicy);
    }
    /**
     * @return Extra arguments for scheduler service (map)
     * 
     */
    public Map<String,Object> extraArgs() {
        return this.extraArgs == null ? Map.of() : this.extraArgs;
    }
    /**
     * @return HTTP port for RKE Ingress (int)
     * 
     */
    public Optional<Integer> httpPort() {
        return Optional.ofNullable(this.httpPort);
    }
    /**
     * @return HTTPS port for RKE Ingress (int)
     * 
     */
    public Optional<Integer> httpsPort() {
        return Optional.ofNullable(this.httpsPort);
    }
    /**
     * @return Network mode for RKE Ingress (string)
     * 
     */
    public Optional<String> networkMode() {
        return Optional.ofNullable(this.networkMode);
    }
    /**
     * @return RKE monitoring node selector (map)
     * 
     */
    public Map<String,Object> nodeSelector() {
        return this.nodeSelector == null ? Map.of() : this.nodeSelector;
    }
    /**
     * @return RKE options for network (map)
     * 
     */
    public Map<String,Object> options() {
        return this.options == null ? Map.of() : this.options;
    }
    /**
     * @return RKE monitoring provider (string)
     * 
     */
    public Optional<String> provider() {
        return Optional.ofNullable(this.provider);
    }
    /**
     * @return Network add-on tolerations (list)
     * 
     */
    public List<ClusterRkeConfigIngressToleration> tolerations() {
        return this.tolerations == null ? List.of() : this.tolerations;
    }
    /**
     * @return RKE monitoring update strategy (list Maxitems: 1)
     * 
     */
    public Optional<ClusterRkeConfigIngressUpdateStrategy> updateStrategy() {
        return Optional.ofNullable(this.updateStrategy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigIngress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean defaultBackend;
        private @Nullable String dnsPolicy;
        private @Nullable Map<String,Object> extraArgs;
        private @Nullable Integer httpPort;
        private @Nullable Integer httpsPort;
        private @Nullable String networkMode;
        private @Nullable Map<String,Object> nodeSelector;
        private @Nullable Map<String,Object> options;
        private @Nullable String provider;
        private @Nullable List<ClusterRkeConfigIngressToleration> tolerations;
        private @Nullable ClusterRkeConfigIngressUpdateStrategy updateStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterRkeConfigIngress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultBackend = defaults.defaultBackend;
    	      this.dnsPolicy = defaults.dnsPolicy;
    	      this.extraArgs = defaults.extraArgs;
    	      this.httpPort = defaults.httpPort;
    	      this.httpsPort = defaults.httpsPort;
    	      this.networkMode = defaults.networkMode;
    	      this.nodeSelector = defaults.nodeSelector;
    	      this.options = defaults.options;
    	      this.provider = defaults.provider;
    	      this.tolerations = defaults.tolerations;
    	      this.updateStrategy = defaults.updateStrategy;
        }

        public Builder defaultBackend(@Nullable Boolean defaultBackend) {
            this.defaultBackend = defaultBackend;
            return this;
        }
        public Builder dnsPolicy(@Nullable String dnsPolicy) {
            this.dnsPolicy = dnsPolicy;
            return this;
        }
        public Builder extraArgs(@Nullable Map<String,Object> extraArgs) {
            this.extraArgs = extraArgs;
            return this;
        }
        public Builder httpPort(@Nullable Integer httpPort) {
            this.httpPort = httpPort;
            return this;
        }
        public Builder httpsPort(@Nullable Integer httpsPort) {
            this.httpsPort = httpsPort;
            return this;
        }
        public Builder networkMode(@Nullable String networkMode) {
            this.networkMode = networkMode;
            return this;
        }
        public Builder nodeSelector(@Nullable Map<String,Object> nodeSelector) {
            this.nodeSelector = nodeSelector;
            return this;
        }
        public Builder options(@Nullable Map<String,Object> options) {
            this.options = options;
            return this;
        }
        public Builder provider(@Nullable String provider) {
            this.provider = provider;
            return this;
        }
        public Builder tolerations(@Nullable List<ClusterRkeConfigIngressToleration> tolerations) {
            this.tolerations = tolerations;
            return this;
        }
        public Builder tolerations(ClusterRkeConfigIngressToleration... tolerations) {
            return tolerations(List.of(tolerations));
        }
        public Builder updateStrategy(@Nullable ClusterRkeConfigIngressUpdateStrategy updateStrategy) {
            this.updateStrategy = updateStrategy;
            return this;
        }        public ClusterRkeConfigIngress build() {
            return new ClusterRkeConfigIngress(defaultBackend, dnsPolicy, extraArgs, httpPort, httpsPort, networkMode, nodeSelector, options, provider, tolerations, updateStrategy);
        }
    }
}