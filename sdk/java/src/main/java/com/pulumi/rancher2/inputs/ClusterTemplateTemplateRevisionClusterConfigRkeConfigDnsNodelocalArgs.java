// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsNodelocalArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsNodelocalArgs Empty = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsNodelocalArgs();

    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    @Import(name="nodeSelector")
    private @Nullable Output<Map<String,Object>> nodeSelector;

    public Optional<Output<Map<String,Object>>> nodeSelector() {
        return Optional.ofNullable(this.nodeSelector);
    }

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsNodelocalArgs() {}

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsNodelocalArgs(ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsNodelocalArgs $) {
        this.ipAddress = $.ipAddress;
        this.nodeSelector = $.nodeSelector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsNodelocalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsNodelocalArgs $;

        public Builder() {
            $ = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsNodelocalArgs();
        }

        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsNodelocalArgs defaults) {
            $ = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsNodelocalArgs(Objects.requireNonNull(defaults));
        }

        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        public Builder nodeSelector(@Nullable Output<Map<String,Object>> nodeSelector) {
            $.nodeSelector = nodeSelector;
            return this;
        }

        public Builder nodeSelector(Map<String,Object> nodeSelector) {
            return nodeSelector(Output.of(nodeSelector));
        }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsNodelocalArgs build() {
            return $;
        }
    }

}