// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRkeConfigCloudProviderOpenstackCloudProviderRouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRkeConfigCloudProviderOpenstackCloudProviderRouteArgs Empty = new ClusterRkeConfigCloudProviderOpenstackCloudProviderRouteArgs();

    /**
     * (string)
     * 
     */
    @Import(name="routerId")
    private @Nullable Output<String> routerId;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> routerId() {
        return Optional.ofNullable(this.routerId);
    }

    private ClusterRkeConfigCloudProviderOpenstackCloudProviderRouteArgs() {}

    private ClusterRkeConfigCloudProviderOpenstackCloudProviderRouteArgs(ClusterRkeConfigCloudProviderOpenstackCloudProviderRouteArgs $) {
        this.routerId = $.routerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRkeConfigCloudProviderOpenstackCloudProviderRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRkeConfigCloudProviderOpenstackCloudProviderRouteArgs $;

        public Builder() {
            $ = new ClusterRkeConfigCloudProviderOpenstackCloudProviderRouteArgs();
        }

        public Builder(ClusterRkeConfigCloudProviderOpenstackCloudProviderRouteArgs defaults) {
            $ = new ClusterRkeConfigCloudProviderOpenstackCloudProviderRouteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param routerId (string)
         * 
         * @return builder
         * 
         */
        public Builder routerId(@Nullable Output<String> routerId) {
            $.routerId = routerId;
            return this;
        }

        /**
         * @param routerId (string)
         * 
         * @return builder
         * 
         */
        public Builder routerId(String routerId) {
            return routerId(Output.of(routerId));
        }

        public ClusterRkeConfigCloudProviderOpenstackCloudProviderRouteArgs build() {
            return $;
        }
    }

}