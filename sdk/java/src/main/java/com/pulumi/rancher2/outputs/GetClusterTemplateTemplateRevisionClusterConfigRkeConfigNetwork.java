// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkCalicoNetworkProvider;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkCanalNetworkProvider;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkFlannelNetworkProvider;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkToleration;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkWeaveNetworkProvider;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetwork {
    private final @Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkCalicoNetworkProvider calicoNetworkProvider;
    private final @Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkCanalNetworkProvider canalNetworkProvider;
    private final @Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkFlannelNetworkProvider flannelNetworkProvider;
    private final @Nullable Integer mtu;
    private final Map<String,Object> options;
    private final String plugin;
    private final @Nullable List<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkToleration> tolerations;
    private final @Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkWeaveNetworkProvider weaveNetworkProvider;

    @CustomType.Constructor
    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetwork(
        @CustomType.Parameter("calicoNetworkProvider") @Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkCalicoNetworkProvider calicoNetworkProvider,
        @CustomType.Parameter("canalNetworkProvider") @Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkCanalNetworkProvider canalNetworkProvider,
        @CustomType.Parameter("flannelNetworkProvider") @Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkFlannelNetworkProvider flannelNetworkProvider,
        @CustomType.Parameter("mtu") @Nullable Integer mtu,
        @CustomType.Parameter("options") Map<String,Object> options,
        @CustomType.Parameter("plugin") String plugin,
        @CustomType.Parameter("tolerations") @Nullable List<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkToleration> tolerations,
        @CustomType.Parameter("weaveNetworkProvider") @Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkWeaveNetworkProvider weaveNetworkProvider) {
        this.calicoNetworkProvider = calicoNetworkProvider;
        this.canalNetworkProvider = canalNetworkProvider;
        this.flannelNetworkProvider = flannelNetworkProvider;
        this.mtu = mtu;
        this.options = options;
        this.plugin = plugin;
        this.tolerations = tolerations;
        this.weaveNetworkProvider = weaveNetworkProvider;
    }

    public Optional<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkCalicoNetworkProvider> calicoNetworkProvider() {
        return Optional.ofNullable(this.calicoNetworkProvider);
    }
    public Optional<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkCanalNetworkProvider> canalNetworkProvider() {
        return Optional.ofNullable(this.canalNetworkProvider);
    }
    public Optional<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkFlannelNetworkProvider> flannelNetworkProvider() {
        return Optional.ofNullable(this.flannelNetworkProvider);
    }
    public Optional<Integer> mtu() {
        return Optional.ofNullable(this.mtu);
    }
    public Map<String,Object> options() {
        return this.options;
    }
    public String plugin() {
        return this.plugin;
    }
    public List<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkToleration> tolerations() {
        return this.tolerations == null ? List.of() : this.tolerations;
    }
    public Optional<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkWeaveNetworkProvider> weaveNetworkProvider() {
        return Optional.ofNullable(this.weaveNetworkProvider);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetwork defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkCalicoNetworkProvider calicoNetworkProvider;
        private @Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkCanalNetworkProvider canalNetworkProvider;
        private @Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkFlannelNetworkProvider flannelNetworkProvider;
        private @Nullable Integer mtu;
        private Map<String,Object> options;
        private String plugin;
        private @Nullable List<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkToleration> tolerations;
        private @Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkWeaveNetworkProvider weaveNetworkProvider;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.calicoNetworkProvider = defaults.calicoNetworkProvider;
    	      this.canalNetworkProvider = defaults.canalNetworkProvider;
    	      this.flannelNetworkProvider = defaults.flannelNetworkProvider;
    	      this.mtu = defaults.mtu;
    	      this.options = defaults.options;
    	      this.plugin = defaults.plugin;
    	      this.tolerations = defaults.tolerations;
    	      this.weaveNetworkProvider = defaults.weaveNetworkProvider;
        }

        public Builder calicoNetworkProvider(@Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkCalicoNetworkProvider calicoNetworkProvider) {
            this.calicoNetworkProvider = calicoNetworkProvider;
            return this;
        }
        public Builder canalNetworkProvider(@Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkCanalNetworkProvider canalNetworkProvider) {
            this.canalNetworkProvider = canalNetworkProvider;
            return this;
        }
        public Builder flannelNetworkProvider(@Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkFlannelNetworkProvider flannelNetworkProvider) {
            this.flannelNetworkProvider = flannelNetworkProvider;
            return this;
        }
        public Builder mtu(@Nullable Integer mtu) {
            this.mtu = mtu;
            return this;
        }
        public Builder options(Map<String,Object> options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }
        public Builder plugin(String plugin) {
            this.plugin = Objects.requireNonNull(plugin);
            return this;
        }
        public Builder tolerations(@Nullable List<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkToleration> tolerations) {
            this.tolerations = tolerations;
            return this;
        }
        public Builder tolerations(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkToleration... tolerations) {
            return tolerations(List.of(tolerations));
        }
        public Builder weaveNetworkProvider(@Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkWeaveNetworkProvider weaveNetworkProvider) {
            this.weaveNetworkProvider = weaveNetworkProvider;
            return this;
        }        public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetwork build() {
            return new GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetwork(calicoNetworkProvider, canalNetworkProvider, flannelNetworkProvider, mtu, options, plugin, tolerations, weaveNetworkProvider);
        }
    }
}