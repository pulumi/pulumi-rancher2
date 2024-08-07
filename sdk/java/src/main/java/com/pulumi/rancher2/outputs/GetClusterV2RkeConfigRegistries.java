// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetClusterV2RkeConfigRegistriesConfig;
import com.pulumi.rancher2.outputs.GetClusterV2RkeConfigRegistriesMirror;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterV2RkeConfigRegistries {
    /**
     * @return Registry config
     * 
     */
    private @Nullable List<GetClusterV2RkeConfigRegistriesConfig> configs;
    /**
     * @return Registry mirrors
     * 
     */
    private @Nullable List<GetClusterV2RkeConfigRegistriesMirror> mirrors;

    private GetClusterV2RkeConfigRegistries() {}
    /**
     * @return Registry config
     * 
     */
    public List<GetClusterV2RkeConfigRegistriesConfig> configs() {
        return this.configs == null ? List.of() : this.configs;
    }
    /**
     * @return Registry mirrors
     * 
     */
    public List<GetClusterV2RkeConfigRegistriesMirror> mirrors() {
        return this.mirrors == null ? List.of() : this.mirrors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterV2RkeConfigRegistries defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetClusterV2RkeConfigRegistriesConfig> configs;
        private @Nullable List<GetClusterV2RkeConfigRegistriesMirror> mirrors;
        public Builder() {}
        public Builder(GetClusterV2RkeConfigRegistries defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configs = defaults.configs;
    	      this.mirrors = defaults.mirrors;
        }

        @CustomType.Setter
        public Builder configs(@Nullable List<GetClusterV2RkeConfigRegistriesConfig> configs) {

            this.configs = configs;
            return this;
        }
        public Builder configs(GetClusterV2RkeConfigRegistriesConfig... configs) {
            return configs(List.of(configs));
        }
        @CustomType.Setter
        public Builder mirrors(@Nullable List<GetClusterV2RkeConfigRegistriesMirror> mirrors) {

            this.mirrors = mirrors;
            return this;
        }
        public Builder mirrors(GetClusterV2RkeConfigRegistriesMirror... mirrors) {
            return mirrors(List.of(mirrors));
        }
        public GetClusterV2RkeConfigRegistries build() {
            final var _resultValue = new GetClusterV2RkeConfigRegistries();
            _resultValue.configs = configs;
            _resultValue.mirrors = mirrors;
            return _resultValue;
        }
    }
}
