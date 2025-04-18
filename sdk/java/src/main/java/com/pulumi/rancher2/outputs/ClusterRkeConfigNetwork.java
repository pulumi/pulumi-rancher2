// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterRkeConfigNetworkAciNetworkProvider;
import com.pulumi.rancher2.outputs.ClusterRkeConfigNetworkCalicoNetworkProvider;
import com.pulumi.rancher2.outputs.ClusterRkeConfigNetworkCanalNetworkProvider;
import com.pulumi.rancher2.outputs.ClusterRkeConfigNetworkFlannelNetworkProvider;
import com.pulumi.rancher2.outputs.ClusterRkeConfigNetworkToleration;
import com.pulumi.rancher2.outputs.ClusterRkeConfigNetworkWeaveNetworkProvider;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRkeConfigNetwork {
    /**
     * @return ACI provider config for RKE network (list maxitems:63)
     * 
     */
    private @Nullable ClusterRkeConfigNetworkAciNetworkProvider aciNetworkProvider;
    /**
     * @return Calico provider config for RKE network (list maxitems:1)
     * 
     */
    private @Nullable ClusterRkeConfigNetworkCalicoNetworkProvider calicoNetworkProvider;
    /**
     * @return Canal provider config for RKE network (list maxitems:1)
     * 
     */
    private @Nullable ClusterRkeConfigNetworkCanalNetworkProvider canalNetworkProvider;
    /**
     * @return Flannel provider config for RKE network (list maxitems:1)
     * 
     */
    private @Nullable ClusterRkeConfigNetworkFlannelNetworkProvider flannelNetworkProvider;
    /**
     * @return Network provider MTU. Default `0` (int)
     * 
     */
    private @Nullable Integer mtu;
    /**
     * @return RKE options for network (map)
     * 
     */
    private @Nullable Map<String,String> options;
    /**
     * @return Plugin for RKE network. `canal` (default), `flannel`, `calico`, `none` and `weave` are supported. (string)
     * 
     */
    private @Nullable String plugin;
    /**
     * @return Network add-on tolerations
     * 
     */
    private @Nullable List<ClusterRkeConfigNetworkToleration> tolerations;
    /**
     * @return Weave provider config for RKE network (list maxitems:1)
     * 
     */
    private @Nullable ClusterRkeConfigNetworkWeaveNetworkProvider weaveNetworkProvider;

    private ClusterRkeConfigNetwork() {}
    /**
     * @return ACI provider config for RKE network (list maxitems:63)
     * 
     */
    public Optional<ClusterRkeConfigNetworkAciNetworkProvider> aciNetworkProvider() {
        return Optional.ofNullable(this.aciNetworkProvider);
    }
    /**
     * @return Calico provider config for RKE network (list maxitems:1)
     * 
     */
    public Optional<ClusterRkeConfigNetworkCalicoNetworkProvider> calicoNetworkProvider() {
        return Optional.ofNullable(this.calicoNetworkProvider);
    }
    /**
     * @return Canal provider config for RKE network (list maxitems:1)
     * 
     */
    public Optional<ClusterRkeConfigNetworkCanalNetworkProvider> canalNetworkProvider() {
        return Optional.ofNullable(this.canalNetworkProvider);
    }
    /**
     * @return Flannel provider config for RKE network (list maxitems:1)
     * 
     */
    public Optional<ClusterRkeConfigNetworkFlannelNetworkProvider> flannelNetworkProvider() {
        return Optional.ofNullable(this.flannelNetworkProvider);
    }
    /**
     * @return Network provider MTU. Default `0` (int)
     * 
     */
    public Optional<Integer> mtu() {
        return Optional.ofNullable(this.mtu);
    }
    /**
     * @return RKE options for network (map)
     * 
     */
    public Map<String,String> options() {
        return this.options == null ? Map.of() : this.options;
    }
    /**
     * @return Plugin for RKE network. `canal` (default), `flannel`, `calico`, `none` and `weave` are supported. (string)
     * 
     */
    public Optional<String> plugin() {
        return Optional.ofNullable(this.plugin);
    }
    /**
     * @return Network add-on tolerations
     * 
     */
    public List<ClusterRkeConfigNetworkToleration> tolerations() {
        return this.tolerations == null ? List.of() : this.tolerations;
    }
    /**
     * @return Weave provider config for RKE network (list maxitems:1)
     * 
     */
    public Optional<ClusterRkeConfigNetworkWeaveNetworkProvider> weaveNetworkProvider() {
        return Optional.ofNullable(this.weaveNetworkProvider);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterRkeConfigNetworkAciNetworkProvider aciNetworkProvider;
        private @Nullable ClusterRkeConfigNetworkCalicoNetworkProvider calicoNetworkProvider;
        private @Nullable ClusterRkeConfigNetworkCanalNetworkProvider canalNetworkProvider;
        private @Nullable ClusterRkeConfigNetworkFlannelNetworkProvider flannelNetworkProvider;
        private @Nullable Integer mtu;
        private @Nullable Map<String,String> options;
        private @Nullable String plugin;
        private @Nullable List<ClusterRkeConfigNetworkToleration> tolerations;
        private @Nullable ClusterRkeConfigNetworkWeaveNetworkProvider weaveNetworkProvider;
        public Builder() {}
        public Builder(ClusterRkeConfigNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aciNetworkProvider = defaults.aciNetworkProvider;
    	      this.calicoNetworkProvider = defaults.calicoNetworkProvider;
    	      this.canalNetworkProvider = defaults.canalNetworkProvider;
    	      this.flannelNetworkProvider = defaults.flannelNetworkProvider;
    	      this.mtu = defaults.mtu;
    	      this.options = defaults.options;
    	      this.plugin = defaults.plugin;
    	      this.tolerations = defaults.tolerations;
    	      this.weaveNetworkProvider = defaults.weaveNetworkProvider;
        }

        @CustomType.Setter
        public Builder aciNetworkProvider(@Nullable ClusterRkeConfigNetworkAciNetworkProvider aciNetworkProvider) {

            this.aciNetworkProvider = aciNetworkProvider;
            return this;
        }
        @CustomType.Setter
        public Builder calicoNetworkProvider(@Nullable ClusterRkeConfigNetworkCalicoNetworkProvider calicoNetworkProvider) {

            this.calicoNetworkProvider = calicoNetworkProvider;
            return this;
        }
        @CustomType.Setter
        public Builder canalNetworkProvider(@Nullable ClusterRkeConfigNetworkCanalNetworkProvider canalNetworkProvider) {

            this.canalNetworkProvider = canalNetworkProvider;
            return this;
        }
        @CustomType.Setter
        public Builder flannelNetworkProvider(@Nullable ClusterRkeConfigNetworkFlannelNetworkProvider flannelNetworkProvider) {

            this.flannelNetworkProvider = flannelNetworkProvider;
            return this;
        }
        @CustomType.Setter
        public Builder mtu(@Nullable Integer mtu) {

            this.mtu = mtu;
            return this;
        }
        @CustomType.Setter
        public Builder options(@Nullable Map<String,String> options) {

            this.options = options;
            return this;
        }
        @CustomType.Setter
        public Builder plugin(@Nullable String plugin) {

            this.plugin = plugin;
            return this;
        }
        @CustomType.Setter
        public Builder tolerations(@Nullable List<ClusterRkeConfigNetworkToleration> tolerations) {

            this.tolerations = tolerations;
            return this;
        }
        public Builder tolerations(ClusterRkeConfigNetworkToleration... tolerations) {
            return tolerations(List.of(tolerations));
        }
        @CustomType.Setter
        public Builder weaveNetworkProvider(@Nullable ClusterRkeConfigNetworkWeaveNetworkProvider weaveNetworkProvider) {

            this.weaveNetworkProvider = weaveNetworkProvider;
            return this;
        }
        public ClusterRkeConfigNetwork build() {
            final var _resultValue = new ClusterRkeConfigNetwork();
            _resultValue.aciNetworkProvider = aciNetworkProvider;
            _resultValue.calicoNetworkProvider = calicoNetworkProvider;
            _resultValue.canalNetworkProvider = canalNetworkProvider;
            _resultValue.flannelNetworkProvider = flannelNetworkProvider;
            _resultValue.mtu = mtu;
            _resultValue.options = options;
            _resultValue.plugin = plugin;
            _resultValue.tolerations = tolerations;
            _resultValue.weaveNetworkProvider = weaveNetworkProvider;
            return _resultValue;
        }
    }
}
