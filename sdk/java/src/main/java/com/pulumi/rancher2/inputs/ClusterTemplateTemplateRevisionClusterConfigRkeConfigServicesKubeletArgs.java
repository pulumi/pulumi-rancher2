// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeletArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeletArgs Empty = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeletArgs();

    @Import(name="clusterDnsServer")
    private @Nullable Output<String> clusterDnsServer;

    public Optional<Output<String>> clusterDnsServer() {
        return Optional.ofNullable(this.clusterDnsServer);
    }

    @Import(name="clusterDomain")
    private @Nullable Output<String> clusterDomain;

    public Optional<Output<String>> clusterDomain() {
        return Optional.ofNullable(this.clusterDomain);
    }

    @Import(name="extraArgs")
    private @Nullable Output<Map<String,Object>> extraArgs;

    public Optional<Output<Map<String,Object>>> extraArgs() {
        return Optional.ofNullable(this.extraArgs);
    }

    @Import(name="extraBinds")
    private @Nullable Output<List<String>> extraBinds;

    public Optional<Output<List<String>>> extraBinds() {
        return Optional.ofNullable(this.extraBinds);
    }

    @Import(name="extraEnvs")
    private @Nullable Output<List<String>> extraEnvs;

    public Optional<Output<List<String>>> extraEnvs() {
        return Optional.ofNullable(this.extraEnvs);
    }

    @Import(name="failSwapOn")
    private @Nullable Output<Boolean> failSwapOn;

    public Optional<Output<Boolean>> failSwapOn() {
        return Optional.ofNullable(this.failSwapOn);
    }

    @Import(name="generateServingCertificate")
    private @Nullable Output<Boolean> generateServingCertificate;

    public Optional<Output<Boolean>> generateServingCertificate() {
        return Optional.ofNullable(this.generateServingCertificate);
    }

    @Import(name="image")
    private @Nullable Output<String> image;

    public Optional<Output<String>> image() {
        return Optional.ofNullable(this.image);
    }

    @Import(name="infraContainerImage")
    private @Nullable Output<String> infraContainerImage;

    public Optional<Output<String>> infraContainerImage() {
        return Optional.ofNullable(this.infraContainerImage);
    }

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeletArgs() {}

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeletArgs(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeletArgs $) {
        this.clusterDnsServer = $.clusterDnsServer;
        this.clusterDomain = $.clusterDomain;
        this.extraArgs = $.extraArgs;
        this.extraBinds = $.extraBinds;
        this.extraEnvs = $.extraEnvs;
        this.failSwapOn = $.failSwapOn;
        this.generateServingCertificate = $.generateServingCertificate;
        this.image = $.image;
        this.infraContainerImage = $.infraContainerImage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeletArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeletArgs $;

        public Builder() {
            $ = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeletArgs();
        }

        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeletArgs defaults) {
            $ = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeletArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterDnsServer(@Nullable Output<String> clusterDnsServer) {
            $.clusterDnsServer = clusterDnsServer;
            return this;
        }

        public Builder clusterDnsServer(String clusterDnsServer) {
            return clusterDnsServer(Output.of(clusterDnsServer));
        }

        public Builder clusterDomain(@Nullable Output<String> clusterDomain) {
            $.clusterDomain = clusterDomain;
            return this;
        }

        public Builder clusterDomain(String clusterDomain) {
            return clusterDomain(Output.of(clusterDomain));
        }

        public Builder extraArgs(@Nullable Output<Map<String,Object>> extraArgs) {
            $.extraArgs = extraArgs;
            return this;
        }

        public Builder extraArgs(Map<String,Object> extraArgs) {
            return extraArgs(Output.of(extraArgs));
        }

        public Builder extraBinds(@Nullable Output<List<String>> extraBinds) {
            $.extraBinds = extraBinds;
            return this;
        }

        public Builder extraBinds(List<String> extraBinds) {
            return extraBinds(Output.of(extraBinds));
        }

        public Builder extraBinds(String... extraBinds) {
            return extraBinds(List.of(extraBinds));
        }

        public Builder extraEnvs(@Nullable Output<List<String>> extraEnvs) {
            $.extraEnvs = extraEnvs;
            return this;
        }

        public Builder extraEnvs(List<String> extraEnvs) {
            return extraEnvs(Output.of(extraEnvs));
        }

        public Builder extraEnvs(String... extraEnvs) {
            return extraEnvs(List.of(extraEnvs));
        }

        public Builder failSwapOn(@Nullable Output<Boolean> failSwapOn) {
            $.failSwapOn = failSwapOn;
            return this;
        }

        public Builder failSwapOn(Boolean failSwapOn) {
            return failSwapOn(Output.of(failSwapOn));
        }

        public Builder generateServingCertificate(@Nullable Output<Boolean> generateServingCertificate) {
            $.generateServingCertificate = generateServingCertificate;
            return this;
        }

        public Builder generateServingCertificate(Boolean generateServingCertificate) {
            return generateServingCertificate(Output.of(generateServingCertificate));
        }

        public Builder image(@Nullable Output<String> image) {
            $.image = image;
            return this;
        }

        public Builder image(String image) {
            return image(Output.of(image));
        }

        public Builder infraContainerImage(@Nullable Output<String> infraContainerImage) {
            $.infraContainerImage = infraContainerImage;
            return this;
        }

        public Builder infraContainerImage(String infraContainerImage) {
            return infraContainerImage(Output.of(infraContainerImage));
        }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeletArgs build() {
            return $;
        }
    }

}