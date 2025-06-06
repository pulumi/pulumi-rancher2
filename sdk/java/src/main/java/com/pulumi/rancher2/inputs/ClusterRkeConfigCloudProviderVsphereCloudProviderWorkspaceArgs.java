// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs Empty = new ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs();

    /**
     * (string)
     * 
     */
    @Import(name="datacenter", required=true)
    private Output<String> datacenter;

    /**
     * @return (string)
     * 
     */
    public Output<String> datacenter() {
        return this.datacenter;
    }

    /**
     * (string)
     * 
     */
    @Import(name="defaultDatastore")
    private @Nullable Output<String> defaultDatastore;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> defaultDatastore() {
        return Optional.ofNullable(this.defaultDatastore);
    }

    /**
     * Folder for S3 service. Available from Rancher v2.2.7 (string)
     * 
     */
    @Import(name="folder", required=true)
    private Output<String> folder;

    /**
     * @return Folder for S3 service. Available from Rancher v2.2.7 (string)
     * 
     */
    public Output<String> folder() {
        return this.folder;
    }

    /**
     * (string)
     * 
     */
    @Import(name="resourcepoolPath")
    private @Nullable Output<String> resourcepoolPath;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> resourcepoolPath() {
        return Optional.ofNullable(this.resourcepoolPath);
    }

    /**
     * (string)
     * 
     */
    @Import(name="server", required=true)
    private Output<String> server;

    /**
     * @return (string)
     * 
     */
    public Output<String> server() {
        return this.server;
    }

    private ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs() {}

    private ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs(ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs $) {
        this.datacenter = $.datacenter;
        this.defaultDatastore = $.defaultDatastore;
        this.folder = $.folder;
        this.resourcepoolPath = $.resourcepoolPath;
        this.server = $.server;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs $;

        public Builder() {
            $ = new ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs();
        }

        public Builder(ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs defaults) {
            $ = new ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datacenter (string)
         * 
         * @return builder
         * 
         */
        public Builder datacenter(Output<String> datacenter) {
            $.datacenter = datacenter;
            return this;
        }

        /**
         * @param datacenter (string)
         * 
         * @return builder
         * 
         */
        public Builder datacenter(String datacenter) {
            return datacenter(Output.of(datacenter));
        }

        /**
         * @param defaultDatastore (string)
         * 
         * @return builder
         * 
         */
        public Builder defaultDatastore(@Nullable Output<String> defaultDatastore) {
            $.defaultDatastore = defaultDatastore;
            return this;
        }

        /**
         * @param defaultDatastore (string)
         * 
         * @return builder
         * 
         */
        public Builder defaultDatastore(String defaultDatastore) {
            return defaultDatastore(Output.of(defaultDatastore));
        }

        /**
         * @param folder Folder for S3 service. Available from Rancher v2.2.7 (string)
         * 
         * @return builder
         * 
         */
        public Builder folder(Output<String> folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param folder Folder for S3 service. Available from Rancher v2.2.7 (string)
         * 
         * @return builder
         * 
         */
        public Builder folder(String folder) {
            return folder(Output.of(folder));
        }

        /**
         * @param resourcepoolPath (string)
         * 
         * @return builder
         * 
         */
        public Builder resourcepoolPath(@Nullable Output<String> resourcepoolPath) {
            $.resourcepoolPath = resourcepoolPath;
            return this;
        }

        /**
         * @param resourcepoolPath (string)
         * 
         * @return builder
         * 
         */
        public Builder resourcepoolPath(String resourcepoolPath) {
            return resourcepoolPath(Output.of(resourcepoolPath));
        }

        /**
         * @param server (string)
         * 
         * @return builder
         * 
         */
        public Builder server(Output<String> server) {
            $.server = server;
            return this;
        }

        /**
         * @param server (string)
         * 
         * @return builder
         * 
         */
        public Builder server(String server) {
            return server(Output.of(server));
        }

        public ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs build() {
            if ($.datacenter == null) {
                throw new MissingRequiredPropertyException("ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs", "datacenter");
            }
            if ($.folder == null) {
                throw new MissingRequiredPropertyException("ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs", "folder");
            }
            if ($.server == null) {
                throw new MissingRequiredPropertyException("ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs", "server");
            }
            return $;
        }
    }

}
