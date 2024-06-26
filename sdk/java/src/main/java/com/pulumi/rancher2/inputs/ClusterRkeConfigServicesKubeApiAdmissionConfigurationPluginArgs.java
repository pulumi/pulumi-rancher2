// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs Empty = new ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs();

    /**
     * Plugin configuration
     * 
     */
    @Import(name="configuration")
    private @Nullable Output<String> configuration;

    /**
     * @return Plugin configuration
     * 
     */
    public Optional<Output<String>> configuration() {
        return Optional.ofNullable(this.configuration);
    }

    /**
     * The name of the Cluster (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Cluster (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Plugin path
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return Plugin path
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    private ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs() {}

    private ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs(ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs $) {
        this.configuration = $.configuration;
        this.name = $.name;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs $;

        public Builder() {
            $ = new ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs();
        }

        public Builder(ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs defaults) {
            $ = new ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configuration Plugin configuration
         * 
         * @return builder
         * 
         */
        public Builder configuration(@Nullable Output<String> configuration) {
            $.configuration = configuration;
            return this;
        }

        /**
         * @param configuration Plugin configuration
         * 
         * @return builder
         * 
         */
        public Builder configuration(String configuration) {
            return configuration(Output.of(configuration));
        }

        /**
         * @param name The name of the Cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param path Plugin path
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Plugin path
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs build() {
            return $;
        }
    }

}
