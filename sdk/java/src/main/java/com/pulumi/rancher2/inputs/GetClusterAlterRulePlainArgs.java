// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterAlterRulePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterAlterRulePlainArgs Empty = new GetClusterAlterRulePlainArgs();

    /**
     * The cluster id where create cluster alert rule (string)
     * 
     */
    @Import(name="clusterId", required=true)
    private String clusterId;

    /**
     * @return The cluster id where create cluster alert rule (string)
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }

    /**
     * (Computed) The cluster alert rule labels (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Map<String,Object> labels;

    /**
     * @return (Computed) The cluster alert rule labels (map)
     * 
     */
    public Optional<Map<String,Object>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The cluster alert rule name (string)
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The cluster alert rule name (string)
     * 
     */
    public String name() {
        return this.name;
    }

    private GetClusterAlterRulePlainArgs() {}

    private GetClusterAlterRulePlainArgs(GetClusterAlterRulePlainArgs $) {
        this.clusterId = $.clusterId;
        this.labels = $.labels;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterAlterRulePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterAlterRulePlainArgs $;

        public Builder() {
            $ = new GetClusterAlterRulePlainArgs();
        }

        public Builder(GetClusterAlterRulePlainArgs defaults) {
            $ = new GetClusterAlterRulePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The cluster id where create cluster alert rule (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param labels (Computed) The cluster alert rule labels (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Map<String,Object> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param name The cluster alert rule name (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetClusterAlterRulePlainArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}