// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsLinearAutoscalerParamsArgs;
import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsNodelocalArgs;
import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsTolerationArgs;
import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsUpdateStrategyArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsArgs Empty = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsArgs();

    /**
     * Linear Autoscaler Params
     * 
     */
    @Import(name="linearAutoscalerParams")
    private @Nullable Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsLinearAutoscalerParamsArgs> linearAutoscalerParams;

    /**
     * @return Linear Autoscaler Params
     * 
     */
    public Optional<Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsLinearAutoscalerParamsArgs>> linearAutoscalerParams() {
        return Optional.ofNullable(this.linearAutoscalerParams);
    }

    @Import(name="nodeSelector")
    private @Nullable Output<Map<String,String>> nodeSelector;

    public Optional<Output<Map<String,String>>> nodeSelector() {
        return Optional.ofNullable(this.nodeSelector);
    }

    /**
     * Nodelocal dns
     * 
     */
    @Import(name="nodelocal")
    private @Nullable Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsNodelocalArgs> nodelocal;

    /**
     * @return Nodelocal dns
     * 
     */
    public Optional<Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsNodelocalArgs>> nodelocal() {
        return Optional.ofNullable(this.nodelocal);
    }

    @Import(name="options")
    private @Nullable Output<Map<String,String>> options;

    public Optional<Output<Map<String,String>>> options() {
        return Optional.ofNullable(this.options);
    }

    @Import(name="provider")
    private @Nullable Output<String> provider;

    public Optional<Output<String>> provider() {
        return Optional.ofNullable(this.provider);
    }

    @Import(name="reverseCidrs")
    private @Nullable Output<List<String>> reverseCidrs;

    public Optional<Output<List<String>>> reverseCidrs() {
        return Optional.ofNullable(this.reverseCidrs);
    }

    /**
     * DNS service tolerations
     * 
     */
    @Import(name="tolerations")
    private @Nullable Output<List<ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsTolerationArgs>> tolerations;

    /**
     * @return DNS service tolerations
     * 
     */
    public Optional<Output<List<ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsTolerationArgs>>> tolerations() {
        return Optional.ofNullable(this.tolerations);
    }

    /**
     * Update deployment strategy
     * 
     */
    @Import(name="updateStrategy")
    private @Nullable Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsUpdateStrategyArgs> updateStrategy;

    /**
     * @return Update deployment strategy
     * 
     */
    public Optional<Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsUpdateStrategyArgs>> updateStrategy() {
        return Optional.ofNullable(this.updateStrategy);
    }

    @Import(name="upstreamNameservers")
    private @Nullable Output<List<String>> upstreamNameservers;

    public Optional<Output<List<String>>> upstreamNameservers() {
        return Optional.ofNullable(this.upstreamNameservers);
    }

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsArgs() {}

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsArgs(ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsArgs $) {
        this.linearAutoscalerParams = $.linearAutoscalerParams;
        this.nodeSelector = $.nodeSelector;
        this.nodelocal = $.nodelocal;
        this.options = $.options;
        this.provider = $.provider;
        this.reverseCidrs = $.reverseCidrs;
        this.tolerations = $.tolerations;
        this.updateStrategy = $.updateStrategy;
        this.upstreamNameservers = $.upstreamNameservers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsArgs $;

        public Builder() {
            $ = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsArgs();
        }

        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsArgs defaults) {
            $ = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param linearAutoscalerParams Linear Autoscaler Params
         * 
         * @return builder
         * 
         */
        public Builder linearAutoscalerParams(@Nullable Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsLinearAutoscalerParamsArgs> linearAutoscalerParams) {
            $.linearAutoscalerParams = linearAutoscalerParams;
            return this;
        }

        /**
         * @param linearAutoscalerParams Linear Autoscaler Params
         * 
         * @return builder
         * 
         */
        public Builder linearAutoscalerParams(ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsLinearAutoscalerParamsArgs linearAutoscalerParams) {
            return linearAutoscalerParams(Output.of(linearAutoscalerParams));
        }

        public Builder nodeSelector(@Nullable Output<Map<String,String>> nodeSelector) {
            $.nodeSelector = nodeSelector;
            return this;
        }

        public Builder nodeSelector(Map<String,String> nodeSelector) {
            return nodeSelector(Output.of(nodeSelector));
        }

        /**
         * @param nodelocal Nodelocal dns
         * 
         * @return builder
         * 
         */
        public Builder nodelocal(@Nullable Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsNodelocalArgs> nodelocal) {
            $.nodelocal = nodelocal;
            return this;
        }

        /**
         * @param nodelocal Nodelocal dns
         * 
         * @return builder
         * 
         */
        public Builder nodelocal(ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsNodelocalArgs nodelocal) {
            return nodelocal(Output.of(nodelocal));
        }

        public Builder options(@Nullable Output<Map<String,String>> options) {
            $.options = options;
            return this;
        }

        public Builder options(Map<String,String> options) {
            return options(Output.of(options));
        }

        public Builder provider(@Nullable Output<String> provider) {
            $.provider = provider;
            return this;
        }

        public Builder provider(String provider) {
            return provider(Output.of(provider));
        }

        public Builder reverseCidrs(@Nullable Output<List<String>> reverseCidrs) {
            $.reverseCidrs = reverseCidrs;
            return this;
        }

        public Builder reverseCidrs(List<String> reverseCidrs) {
            return reverseCidrs(Output.of(reverseCidrs));
        }

        public Builder reverseCidrs(String... reverseCidrs) {
            return reverseCidrs(List.of(reverseCidrs));
        }

        /**
         * @param tolerations DNS service tolerations
         * 
         * @return builder
         * 
         */
        public Builder tolerations(@Nullable Output<List<ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsTolerationArgs>> tolerations) {
            $.tolerations = tolerations;
            return this;
        }

        /**
         * @param tolerations DNS service tolerations
         * 
         * @return builder
         * 
         */
        public Builder tolerations(List<ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsTolerationArgs> tolerations) {
            return tolerations(Output.of(tolerations));
        }

        /**
         * @param tolerations DNS service tolerations
         * 
         * @return builder
         * 
         */
        public Builder tolerations(ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsTolerationArgs... tolerations) {
            return tolerations(List.of(tolerations));
        }

        /**
         * @param updateStrategy Update deployment strategy
         * 
         * @return builder
         * 
         */
        public Builder updateStrategy(@Nullable Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsUpdateStrategyArgs> updateStrategy) {
            $.updateStrategy = updateStrategy;
            return this;
        }

        /**
         * @param updateStrategy Update deployment strategy
         * 
         * @return builder
         * 
         */
        public Builder updateStrategy(ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsUpdateStrategyArgs updateStrategy) {
            return updateStrategy(Output.of(updateStrategy));
        }

        public Builder upstreamNameservers(@Nullable Output<List<String>> upstreamNameservers) {
            $.upstreamNameservers = upstreamNameservers;
            return this;
        }

        public Builder upstreamNameservers(List<String> upstreamNameservers) {
            return upstreamNameservers(Output.of(upstreamNameservers));
        }

        public Builder upstreamNameservers(String... upstreamNameservers) {
            return upstreamNameservers(List.of(upstreamNameservers));
        }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsArgs build() {
            return $;
        }
    }

}
