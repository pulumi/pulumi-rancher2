// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterClusterAuthEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterClusterAuthEndpointArgs Empty = new ClusterClusterAuthEndpointArgs();

    /**
     * CA certs for the authorized cluster endpoint (string)
     * 
     */
    @Import(name="caCerts")
    private @Nullable Output<String> caCerts;

    /**
     * @return CA certs for the authorized cluster endpoint (string)
     * 
     */
    public Optional<Output<String>> caCerts() {
        return Optional.ofNullable(this.caCerts);
    }

    /**
     * Enable the authorized cluster endpoint. Default `true` (bool)
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enable the authorized cluster endpoint. Default `true` (bool)
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * FQDN for the authorized cluster endpoint (string)
     * 
     */
    @Import(name="fqdn")
    private @Nullable Output<String> fqdn;

    /**
     * @return FQDN for the authorized cluster endpoint (string)
     * 
     */
    public Optional<Output<String>> fqdn() {
        return Optional.ofNullable(this.fqdn);
    }

    private ClusterClusterAuthEndpointArgs() {}

    private ClusterClusterAuthEndpointArgs(ClusterClusterAuthEndpointArgs $) {
        this.caCerts = $.caCerts;
        this.enabled = $.enabled;
        this.fqdn = $.fqdn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterClusterAuthEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterClusterAuthEndpointArgs $;

        public Builder() {
            $ = new ClusterClusterAuthEndpointArgs();
        }

        public Builder(ClusterClusterAuthEndpointArgs defaults) {
            $ = new ClusterClusterAuthEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param caCerts CA certs for the authorized cluster endpoint (string)
         * 
         * @return builder
         * 
         */
        public Builder caCerts(@Nullable Output<String> caCerts) {
            $.caCerts = caCerts;
            return this;
        }

        /**
         * @param caCerts CA certs for the authorized cluster endpoint (string)
         * 
         * @return builder
         * 
         */
        public Builder caCerts(String caCerts) {
            return caCerts(Output.of(caCerts));
        }

        /**
         * @param enabled Enable the authorized cluster endpoint. Default `true` (bool)
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable the authorized cluster endpoint. Default `true` (bool)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param fqdn FQDN for the authorized cluster endpoint (string)
         * 
         * @return builder
         * 
         */
        public Builder fqdn(@Nullable Output<String> fqdn) {
            $.fqdn = fqdn;
            return this;
        }

        /**
         * @param fqdn FQDN for the authorized cluster endpoint (string)
         * 
         * @return builder
         * 
         */
        public Builder fqdn(String fqdn) {
            return fqdn(Output.of(fqdn));
        }

        public ClusterClusterAuthEndpointArgs build() {
            return $;
        }
    }

}
