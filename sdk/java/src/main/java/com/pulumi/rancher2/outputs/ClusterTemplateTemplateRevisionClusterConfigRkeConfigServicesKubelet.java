// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubelet {
    private final @Nullable String clusterDnsServer;
    private final @Nullable String clusterDomain;
    private final @Nullable Map<String,Object> extraArgs;
    private final @Nullable List<String> extraBinds;
    private final @Nullable List<String> extraEnvs;
    private final @Nullable Boolean failSwapOn;
    private final @Nullable Boolean generateServingCertificate;
    private final @Nullable String image;
    private final @Nullable String infraContainerImage;

    @CustomType.Constructor
    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubelet(
        @CustomType.Parameter("clusterDnsServer") @Nullable String clusterDnsServer,
        @CustomType.Parameter("clusterDomain") @Nullable String clusterDomain,
        @CustomType.Parameter("extraArgs") @Nullable Map<String,Object> extraArgs,
        @CustomType.Parameter("extraBinds") @Nullable List<String> extraBinds,
        @CustomType.Parameter("extraEnvs") @Nullable List<String> extraEnvs,
        @CustomType.Parameter("failSwapOn") @Nullable Boolean failSwapOn,
        @CustomType.Parameter("generateServingCertificate") @Nullable Boolean generateServingCertificate,
        @CustomType.Parameter("image") @Nullable String image,
        @CustomType.Parameter("infraContainerImage") @Nullable String infraContainerImage) {
        this.clusterDnsServer = clusterDnsServer;
        this.clusterDomain = clusterDomain;
        this.extraArgs = extraArgs;
        this.extraBinds = extraBinds;
        this.extraEnvs = extraEnvs;
        this.failSwapOn = failSwapOn;
        this.generateServingCertificate = generateServingCertificate;
        this.image = image;
        this.infraContainerImage = infraContainerImage;
    }

    public Optional<String> clusterDnsServer() {
        return Optional.ofNullable(this.clusterDnsServer);
    }
    public Optional<String> clusterDomain() {
        return Optional.ofNullable(this.clusterDomain);
    }
    public Map<String,Object> extraArgs() {
        return this.extraArgs == null ? Map.of() : this.extraArgs;
    }
    public List<String> extraBinds() {
        return this.extraBinds == null ? List.of() : this.extraBinds;
    }
    public List<String> extraEnvs() {
        return this.extraEnvs == null ? List.of() : this.extraEnvs;
    }
    public Optional<Boolean> failSwapOn() {
        return Optional.ofNullable(this.failSwapOn);
    }
    public Optional<Boolean> generateServingCertificate() {
        return Optional.ofNullable(this.generateServingCertificate);
    }
    public Optional<String> image() {
        return Optional.ofNullable(this.image);
    }
    public Optional<String> infraContainerImage() {
        return Optional.ofNullable(this.infraContainerImage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubelet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clusterDnsServer;
        private @Nullable String clusterDomain;
        private @Nullable Map<String,Object> extraArgs;
        private @Nullable List<String> extraBinds;
        private @Nullable List<String> extraEnvs;
        private @Nullable Boolean failSwapOn;
        private @Nullable Boolean generateServingCertificate;
        private @Nullable String image;
        private @Nullable String infraContainerImage;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubelet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterDnsServer = defaults.clusterDnsServer;
    	      this.clusterDomain = defaults.clusterDomain;
    	      this.extraArgs = defaults.extraArgs;
    	      this.extraBinds = defaults.extraBinds;
    	      this.extraEnvs = defaults.extraEnvs;
    	      this.failSwapOn = defaults.failSwapOn;
    	      this.generateServingCertificate = defaults.generateServingCertificate;
    	      this.image = defaults.image;
    	      this.infraContainerImage = defaults.infraContainerImage;
        }

        public Builder clusterDnsServer(@Nullable String clusterDnsServer) {
            this.clusterDnsServer = clusterDnsServer;
            return this;
        }
        public Builder clusterDomain(@Nullable String clusterDomain) {
            this.clusterDomain = clusterDomain;
            return this;
        }
        public Builder extraArgs(@Nullable Map<String,Object> extraArgs) {
            this.extraArgs = extraArgs;
            return this;
        }
        public Builder extraBinds(@Nullable List<String> extraBinds) {
            this.extraBinds = extraBinds;
            return this;
        }
        public Builder extraBinds(String... extraBinds) {
            return extraBinds(List.of(extraBinds));
        }
        public Builder extraEnvs(@Nullable List<String> extraEnvs) {
            this.extraEnvs = extraEnvs;
            return this;
        }
        public Builder extraEnvs(String... extraEnvs) {
            return extraEnvs(List.of(extraEnvs));
        }
        public Builder failSwapOn(@Nullable Boolean failSwapOn) {
            this.failSwapOn = failSwapOn;
            return this;
        }
        public Builder generateServingCertificate(@Nullable Boolean generateServingCertificate) {
            this.generateServingCertificate = generateServingCertificate;
            return this;
        }
        public Builder image(@Nullable String image) {
            this.image = image;
            return this;
        }
        public Builder infraContainerImage(@Nullable String infraContainerImage) {
            this.infraContainerImage = infraContainerImage;
            return this;
        }        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubelet build() {
            return new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubelet(clusterDnsServer, clusterDomain, extraArgs, extraBinds, extraEnvs, failSwapOn, generateServingCertificate, image, infraContainerImage);
        }
    }
}