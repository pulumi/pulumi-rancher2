// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetGlobalDnsProviderAlidnsConfig;
import com.pulumi.rancher2.outputs.GetGlobalDnsProviderCloudflareConfig;
import com.pulumi.rancher2.outputs.GetGlobalDnsProviderRoute53Config;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetGlobalDnsProviderResult {
    private final GetGlobalDnsProviderAlidnsConfig alidnsConfig;
    /**
     * @return (Computed) Annotations of the resource (map)
     * 
     */
    private final Map<String,Object> annotations;
    private final GetGlobalDnsProviderCloudflareConfig cloudflareConfig;
    private final String dnsProvider;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return (Computed) Labels of the resource (map)
     * 
     */
    private final Map<String,Object> labels;
    /**
     * @return (Computed) The name of the global DNS provider (string)
     * 
     */
    private final String name;
    private final String rootDomain;
    private final GetGlobalDnsProviderRoute53Config route53Config;

    @CustomType.Constructor
    private GetGlobalDnsProviderResult(
        @CustomType.Parameter("alidnsConfig") GetGlobalDnsProviderAlidnsConfig alidnsConfig,
        @CustomType.Parameter("annotations") Map<String,Object> annotations,
        @CustomType.Parameter("cloudflareConfig") GetGlobalDnsProviderCloudflareConfig cloudflareConfig,
        @CustomType.Parameter("dnsProvider") String dnsProvider,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("labels") Map<String,Object> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("rootDomain") String rootDomain,
        @CustomType.Parameter("route53Config") GetGlobalDnsProviderRoute53Config route53Config) {
        this.alidnsConfig = alidnsConfig;
        this.annotations = annotations;
        this.cloudflareConfig = cloudflareConfig;
        this.dnsProvider = dnsProvider;
        this.id = id;
        this.labels = labels;
        this.name = name;
        this.rootDomain = rootDomain;
        this.route53Config = route53Config;
    }

    public GetGlobalDnsProviderAlidnsConfig alidnsConfig() {
        return this.alidnsConfig;
    }
    /**
     * @return (Computed) Annotations of the resource (map)
     * 
     */
    public Map<String,Object> annotations() {
        return this.annotations;
    }
    public GetGlobalDnsProviderCloudflareConfig cloudflareConfig() {
        return this.cloudflareConfig;
    }
    public String dnsProvider() {
        return this.dnsProvider;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Computed) Labels of the resource (map)
     * 
     */
    public Map<String,Object> labels() {
        return this.labels;
    }
    /**
     * @return (Computed) The name of the global DNS provider (string)
     * 
     */
    public String name() {
        return this.name;
    }
    public String rootDomain() {
        return this.rootDomain;
    }
    public GetGlobalDnsProviderRoute53Config route53Config() {
        return this.route53Config;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalDnsProviderResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGlobalDnsProviderAlidnsConfig alidnsConfig;
        private Map<String,Object> annotations;
        private GetGlobalDnsProviderCloudflareConfig cloudflareConfig;
        private String dnsProvider;
        private String id;
        private Map<String,Object> labels;
        private String name;
        private String rootDomain;
        private GetGlobalDnsProviderRoute53Config route53Config;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalDnsProviderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alidnsConfig = defaults.alidnsConfig;
    	      this.annotations = defaults.annotations;
    	      this.cloudflareConfig = defaults.cloudflareConfig;
    	      this.dnsProvider = defaults.dnsProvider;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.rootDomain = defaults.rootDomain;
    	      this.route53Config = defaults.route53Config;
        }

        public Builder alidnsConfig(GetGlobalDnsProviderAlidnsConfig alidnsConfig) {
            this.alidnsConfig = Objects.requireNonNull(alidnsConfig);
            return this;
        }
        public Builder annotations(Map<String,Object> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }
        public Builder cloudflareConfig(GetGlobalDnsProviderCloudflareConfig cloudflareConfig) {
            this.cloudflareConfig = Objects.requireNonNull(cloudflareConfig);
            return this;
        }
        public Builder dnsProvider(String dnsProvider) {
            this.dnsProvider = Objects.requireNonNull(dnsProvider);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder labels(Map<String,Object> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder rootDomain(String rootDomain) {
            this.rootDomain = Objects.requireNonNull(rootDomain);
            return this;
        }
        public Builder route53Config(GetGlobalDnsProviderRoute53Config route53Config) {
            this.route53Config = Objects.requireNonNull(route53Config);
            return this;
        }        public GetGlobalDnsProviderResult build() {
            return new GetGlobalDnsProviderResult(alidnsConfig, annotations, cloudflareConfig, dnsProvider, id, labels, name, rootDomain, route53Config);
        }
    }
}