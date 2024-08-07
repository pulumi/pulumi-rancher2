// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRkeConfigServicesKubeApiAuditLogConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRkeConfigServicesKubeApiAuditLogConfigurationArgs Empty = new ClusterRkeConfigServicesKubeApiAuditLogConfigurationArgs();

    /**
     * Audit log format. Default: &#39;json&#39; (string)
     * 
     */
    @Import(name="format")
    private @Nullable Output<String> format;

    /**
     * @return Audit log format. Default: &#39;json&#39; (string)
     * 
     */
    public Optional<Output<String>> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * Audit log max age. Default: `30` (int)
     * 
     */
    @Import(name="maxAge")
    private @Nullable Output<Integer> maxAge;

    /**
     * @return Audit log max age. Default: `30` (int)
     * 
     */
    public Optional<Output<Integer>> maxAge() {
        return Optional.ofNullable(this.maxAge);
    }

    /**
     * Audit log max backup. Default: `10` (int)
     * 
     */
    @Import(name="maxBackup")
    private @Nullable Output<Integer> maxBackup;

    /**
     * @return Audit log max backup. Default: `10` (int)
     * 
     */
    public Optional<Output<Integer>> maxBackup() {
        return Optional.ofNullable(this.maxBackup);
    }

    /**
     * The EKS node group maximum size. Default `2` (int)
     * 
     */
    @Import(name="maxSize")
    private @Nullable Output<Integer> maxSize;

    /**
     * @return The EKS node group maximum size. Default `2` (int)
     * 
     */
    public Optional<Output<Integer>> maxSize() {
        return Optional.ofNullable(this.maxSize);
    }

    /**
     * (Optional) Audit log path. Default: `/var/log/kube-audit/audit-log.json` (string)
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return (Optional) Audit log path. Default: `/var/log/kube-audit/audit-log.json` (string)
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Audit policy yaml encoded definition. `apiVersion` and `kind: Policy\nrules:&#34;` fields are required in the yaml. [More info](https://rancher.com/docs/rke/latest/en/config-options/audit-log/) (string) Ex:
     * 
     */
    @Import(name="policy")
    private @Nullable Output<String> policy;

    /**
     * @return Audit policy yaml encoded definition. `apiVersion` and `kind: Policy\nrules:&#34;` fields are required in the yaml. [More info](https://rancher.com/docs/rke/latest/en/config-options/audit-log/) (string) Ex:
     * 
     */
    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    private ClusterRkeConfigServicesKubeApiAuditLogConfigurationArgs() {}

    private ClusterRkeConfigServicesKubeApiAuditLogConfigurationArgs(ClusterRkeConfigServicesKubeApiAuditLogConfigurationArgs $) {
        this.format = $.format;
        this.maxAge = $.maxAge;
        this.maxBackup = $.maxBackup;
        this.maxSize = $.maxSize;
        this.path = $.path;
        this.policy = $.policy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRkeConfigServicesKubeApiAuditLogConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRkeConfigServicesKubeApiAuditLogConfigurationArgs $;

        public Builder() {
            $ = new ClusterRkeConfigServicesKubeApiAuditLogConfigurationArgs();
        }

        public Builder(ClusterRkeConfigServicesKubeApiAuditLogConfigurationArgs defaults) {
            $ = new ClusterRkeConfigServicesKubeApiAuditLogConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param format Audit log format. Default: &#39;json&#39; (string)
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format Audit log format. Default: &#39;json&#39; (string)
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        /**
         * @param maxAge Audit log max age. Default: `30` (int)
         * 
         * @return builder
         * 
         */
        public Builder maxAge(@Nullable Output<Integer> maxAge) {
            $.maxAge = maxAge;
            return this;
        }

        /**
         * @param maxAge Audit log max age. Default: `30` (int)
         * 
         * @return builder
         * 
         */
        public Builder maxAge(Integer maxAge) {
            return maxAge(Output.of(maxAge));
        }

        /**
         * @param maxBackup Audit log max backup. Default: `10` (int)
         * 
         * @return builder
         * 
         */
        public Builder maxBackup(@Nullable Output<Integer> maxBackup) {
            $.maxBackup = maxBackup;
            return this;
        }

        /**
         * @param maxBackup Audit log max backup. Default: `10` (int)
         * 
         * @return builder
         * 
         */
        public Builder maxBackup(Integer maxBackup) {
            return maxBackup(Output.of(maxBackup));
        }

        /**
         * @param maxSize The EKS node group maximum size. Default `2` (int)
         * 
         * @return builder
         * 
         */
        public Builder maxSize(@Nullable Output<Integer> maxSize) {
            $.maxSize = maxSize;
            return this;
        }

        /**
         * @param maxSize The EKS node group maximum size. Default `2` (int)
         * 
         * @return builder
         * 
         */
        public Builder maxSize(Integer maxSize) {
            return maxSize(Output.of(maxSize));
        }

        /**
         * @param path (Optional) Audit log path. Default: `/var/log/kube-audit/audit-log.json` (string)
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path (Optional) Audit log path. Default: `/var/log/kube-audit/audit-log.json` (string)
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param policy Audit policy yaml encoded definition. `apiVersion` and `kind: Policy\nrules:&#34;` fields are required in the yaml. [More info](https://rancher.com/docs/rke/latest/en/config-options/audit-log/) (string) Ex:
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy Audit policy yaml encoded definition. `apiVersion` and `kind: Policy\nrules:&#34;` fields are required in the yaml. [More info](https://rancher.com/docs/rke/latest/en/config-options/audit-log/) (string) Ex:
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        public ClusterRkeConfigServicesKubeApiAuditLogConfigurationArgs build() {
            return $;
        }
    }

}
