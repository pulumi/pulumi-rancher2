// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRkeConfigServicesKubeApiAdmissionConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRkeConfigServicesKubeApiAdmissionConfigurationArgs Empty = new ClusterRkeConfigServicesKubeApiAdmissionConfigurationArgs();

    /**
     * Admission configuration ApiVersion
     * 
     */
    @Import(name="apiVersion")
    private @Nullable Output<String> apiVersion;

    /**
     * @return Admission configuration ApiVersion
     * 
     */
    public Optional<Output<String>> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }

    /**
     * Admission configuration Kind
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Admission configuration Kind
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Admission configuration plugins
     * 
     */
    @Import(name="plugins")
    private @Nullable Output<List<ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs>> plugins;

    /**
     * @return Admission configuration plugins
     * 
     */
    public Optional<Output<List<ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs>>> plugins() {
        return Optional.ofNullable(this.plugins);
    }

    private ClusterRkeConfigServicesKubeApiAdmissionConfigurationArgs() {}

    private ClusterRkeConfigServicesKubeApiAdmissionConfigurationArgs(ClusterRkeConfigServicesKubeApiAdmissionConfigurationArgs $) {
        this.apiVersion = $.apiVersion;
        this.kind = $.kind;
        this.plugins = $.plugins;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRkeConfigServicesKubeApiAdmissionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRkeConfigServicesKubeApiAdmissionConfigurationArgs $;

        public Builder() {
            $ = new ClusterRkeConfigServicesKubeApiAdmissionConfigurationArgs();
        }

        public Builder(ClusterRkeConfigServicesKubeApiAdmissionConfigurationArgs defaults) {
            $ = new ClusterRkeConfigServicesKubeApiAdmissionConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiVersion Admission configuration ApiVersion
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            $.apiVersion = apiVersion;
            return this;
        }

        /**
         * @param apiVersion Admission configuration ApiVersion
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(String apiVersion) {
            return apiVersion(Output.of(apiVersion));
        }

        /**
         * @param kind Admission configuration Kind
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Admission configuration Kind
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param plugins Admission configuration plugins
         * 
         * @return builder
         * 
         */
        public Builder plugins(@Nullable Output<List<ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs>> plugins) {
            $.plugins = plugins;
            return this;
        }

        /**
         * @param plugins Admission configuration plugins
         * 
         * @return builder
         * 
         */
        public Builder plugins(List<ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs> plugins) {
            return plugins(Output.of(plugins));
        }

        /**
         * @param plugins Admission configuration plugins
         * 
         * @return builder
         * 
         */
        public Builder plugins(ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs... plugins) {
            return plugins(List.of(plugins));
        }

        public ClusterRkeConfigServicesKubeApiAdmissionConfigurationArgs build() {
            return $;
        }
    }

}
