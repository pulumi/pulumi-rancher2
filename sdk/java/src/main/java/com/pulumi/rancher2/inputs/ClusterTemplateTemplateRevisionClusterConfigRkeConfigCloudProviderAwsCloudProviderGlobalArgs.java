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


public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderGlobalArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderGlobalArgs Empty = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderGlobalArgs();

    @Import(name="disableSecurityGroupIngress")
    private @Nullable Output<Boolean> disableSecurityGroupIngress;

    public Optional<Output<Boolean>> disableSecurityGroupIngress() {
        return Optional.ofNullable(this.disableSecurityGroupIngress);
    }

    @Import(name="disableStrictZoneCheck")
    private @Nullable Output<Boolean> disableStrictZoneCheck;

    public Optional<Output<Boolean>> disableStrictZoneCheck() {
        return Optional.ofNullable(this.disableStrictZoneCheck);
    }

    @Import(name="elbSecurityGroup")
    private @Nullable Output<String> elbSecurityGroup;

    public Optional<Output<String>> elbSecurityGroup() {
        return Optional.ofNullable(this.elbSecurityGroup);
    }

    @Import(name="kubernetesClusterId")
    private @Nullable Output<String> kubernetesClusterId;

    public Optional<Output<String>> kubernetesClusterId() {
        return Optional.ofNullable(this.kubernetesClusterId);
    }

    @Import(name="kubernetesClusterTag")
    private @Nullable Output<String> kubernetesClusterTag;

    public Optional<Output<String>> kubernetesClusterTag() {
        return Optional.ofNullable(this.kubernetesClusterTag);
    }

    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    @Import(name="routeTableId")
    private @Nullable Output<String> routeTableId;

    public Optional<Output<String>> routeTableId() {
        return Optional.ofNullable(this.routeTableId);
    }

    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    @Import(name="vpc")
    private @Nullable Output<String> vpc;

    public Optional<Output<String>> vpc() {
        return Optional.ofNullable(this.vpc);
    }

    @Import(name="zone")
    private @Nullable Output<String> zone;

    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderGlobalArgs() {}

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderGlobalArgs(ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderGlobalArgs $) {
        this.disableSecurityGroupIngress = $.disableSecurityGroupIngress;
        this.disableStrictZoneCheck = $.disableStrictZoneCheck;
        this.elbSecurityGroup = $.elbSecurityGroup;
        this.kubernetesClusterId = $.kubernetesClusterId;
        this.kubernetesClusterTag = $.kubernetesClusterTag;
        this.roleArn = $.roleArn;
        this.routeTableId = $.routeTableId;
        this.subnetId = $.subnetId;
        this.vpc = $.vpc;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderGlobalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderGlobalArgs $;

        public Builder() {
            $ = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderGlobalArgs();
        }

        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderGlobalArgs defaults) {
            $ = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderGlobalArgs(Objects.requireNonNull(defaults));
        }

        public Builder disableSecurityGroupIngress(@Nullable Output<Boolean> disableSecurityGroupIngress) {
            $.disableSecurityGroupIngress = disableSecurityGroupIngress;
            return this;
        }

        public Builder disableSecurityGroupIngress(Boolean disableSecurityGroupIngress) {
            return disableSecurityGroupIngress(Output.of(disableSecurityGroupIngress));
        }

        public Builder disableStrictZoneCheck(@Nullable Output<Boolean> disableStrictZoneCheck) {
            $.disableStrictZoneCheck = disableStrictZoneCheck;
            return this;
        }

        public Builder disableStrictZoneCheck(Boolean disableStrictZoneCheck) {
            return disableStrictZoneCheck(Output.of(disableStrictZoneCheck));
        }

        public Builder elbSecurityGroup(@Nullable Output<String> elbSecurityGroup) {
            $.elbSecurityGroup = elbSecurityGroup;
            return this;
        }

        public Builder elbSecurityGroup(String elbSecurityGroup) {
            return elbSecurityGroup(Output.of(elbSecurityGroup));
        }

        public Builder kubernetesClusterId(@Nullable Output<String> kubernetesClusterId) {
            $.kubernetesClusterId = kubernetesClusterId;
            return this;
        }

        public Builder kubernetesClusterId(String kubernetesClusterId) {
            return kubernetesClusterId(Output.of(kubernetesClusterId));
        }

        public Builder kubernetesClusterTag(@Nullable Output<String> kubernetesClusterTag) {
            $.kubernetesClusterTag = kubernetesClusterTag;
            return this;
        }

        public Builder kubernetesClusterTag(String kubernetesClusterTag) {
            return kubernetesClusterTag(Output.of(kubernetesClusterTag));
        }

        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public Builder routeTableId(@Nullable Output<String> routeTableId) {
            $.routeTableId = routeTableId;
            return this;
        }

        public Builder routeTableId(String routeTableId) {
            return routeTableId(Output.of(routeTableId));
        }

        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public Builder vpc(@Nullable Output<String> vpc) {
            $.vpc = vpc;
            return this;
        }

        public Builder vpc(String vpc) {
            return vpc(Output.of(vpc));
        }

        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderGlobalArgs build() {
            return $;
        }
    }

}