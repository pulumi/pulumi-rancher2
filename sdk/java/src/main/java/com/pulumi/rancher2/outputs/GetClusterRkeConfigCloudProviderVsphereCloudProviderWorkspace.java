// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterRkeConfigCloudProviderVsphereCloudProviderWorkspace {
    private final String datacenter;
    private final String defaultDatastore;
    private final String folder;
    private final String resourcepoolPath;
    private final String server;

    @CustomType.Constructor
    private GetClusterRkeConfigCloudProviderVsphereCloudProviderWorkspace(
        @CustomType.Parameter("datacenter") String datacenter,
        @CustomType.Parameter("defaultDatastore") String defaultDatastore,
        @CustomType.Parameter("folder") String folder,
        @CustomType.Parameter("resourcepoolPath") String resourcepoolPath,
        @CustomType.Parameter("server") String server) {
        this.datacenter = datacenter;
        this.defaultDatastore = defaultDatastore;
        this.folder = folder;
        this.resourcepoolPath = resourcepoolPath;
        this.server = server;
    }

    public String datacenter() {
        return this.datacenter;
    }
    public String defaultDatastore() {
        return this.defaultDatastore;
    }
    public String folder() {
        return this.folder;
    }
    public String resourcepoolPath() {
        return this.resourcepoolPath;
    }
    public String server() {
        return this.server;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterRkeConfigCloudProviderVsphereCloudProviderWorkspace defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datacenter;
        private String defaultDatastore;
        private String folder;
        private String resourcepoolPath;
        private String server;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterRkeConfigCloudProviderVsphereCloudProviderWorkspace defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datacenter = defaults.datacenter;
    	      this.defaultDatastore = defaults.defaultDatastore;
    	      this.folder = defaults.folder;
    	      this.resourcepoolPath = defaults.resourcepoolPath;
    	      this.server = defaults.server;
        }

        public Builder datacenter(String datacenter) {
            this.datacenter = Objects.requireNonNull(datacenter);
            return this;
        }
        public Builder defaultDatastore(String defaultDatastore) {
            this.defaultDatastore = Objects.requireNonNull(defaultDatastore);
            return this;
        }
        public Builder folder(String folder) {
            this.folder = Objects.requireNonNull(folder);
            return this;
        }
        public Builder resourcepoolPath(String resourcepoolPath) {
            this.resourcepoolPath = Objects.requireNonNull(resourcepoolPath);
            return this;
        }
        public Builder server(String server) {
            this.server = Objects.requireNonNull(server);
            return this;
        }        public GetClusterRkeConfigCloudProviderVsphereCloudProviderWorkspace build() {
            return new GetClusterRkeConfigCloudProviderVsphereCloudProviderWorkspace(datacenter, defaultDatastore, folder, resourcepoolPath, server);
        }
    }
}