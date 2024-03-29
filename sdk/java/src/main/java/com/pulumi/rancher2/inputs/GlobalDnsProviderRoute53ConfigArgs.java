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


public final class GlobalDnsProviderRoute53ConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalDnsProviderRoute53ConfigArgs Empty = new GlobalDnsProviderRoute53ConfigArgs();

    /**
     * The AWS Access key (string)
     * 
     */
    @Import(name="accessKey", required=true)
    private Output<String> accessKey;

    /**
     * @return The AWS Access key (string)
     * 
     */
    public Output<String> accessKey() {
        return this.accessKey;
    }

    /**
     * The AWS credentials path. Default: `&#34;/.aws&#34;` (string)
     * 
     */
    @Import(name="credentialsPath")
    private @Nullable Output<String> credentialsPath;

    /**
     * @return The AWS credentials path. Default: `&#34;/.aws&#34;` (string)
     * 
     */
    public Optional<Output<String>> credentialsPath() {
        return Optional.ofNullable(this.credentialsPath);
    }

    /**
     * The AWS Region. Default: `&#34;us-west-2&#34;` (string)
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The AWS Region. Default: `&#34;us-west-2&#34;` (string)
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The AWS Role ARN (string)
     * 
     */
    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    /**
     * @return The AWS Role ARN (string)
     * 
     */
    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    /**
     * The AWS Secret key (string)
     * 
     */
    @Import(name="secretKey", required=true)
    private Output<String> secretKey;

    /**
     * @return The AWS Secret key (string)
     * 
     */
    public Output<String> secretKey() {
        return this.secretKey;
    }

    /**
     * The Route53 zone type `public, private`. Default: `&#34;public&#34;` (string)
     * 
     */
    @Import(name="zoneType")
    private @Nullable Output<String> zoneType;

    /**
     * @return The Route53 zone type `public, private`. Default: `&#34;public&#34;` (string)
     * 
     */
    public Optional<Output<String>> zoneType() {
        return Optional.ofNullable(this.zoneType);
    }

    private GlobalDnsProviderRoute53ConfigArgs() {}

    private GlobalDnsProviderRoute53ConfigArgs(GlobalDnsProviderRoute53ConfigArgs $) {
        this.accessKey = $.accessKey;
        this.credentialsPath = $.credentialsPath;
        this.region = $.region;
        this.roleArn = $.roleArn;
        this.secretKey = $.secretKey;
        this.zoneType = $.zoneType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalDnsProviderRoute53ConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalDnsProviderRoute53ConfigArgs $;

        public Builder() {
            $ = new GlobalDnsProviderRoute53ConfigArgs();
        }

        public Builder(GlobalDnsProviderRoute53ConfigArgs defaults) {
            $ = new GlobalDnsProviderRoute53ConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKey The AWS Access key (string)
         * 
         * @return builder
         * 
         */
        public Builder accessKey(Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        /**
         * @param accessKey The AWS Access key (string)
         * 
         * @return builder
         * 
         */
        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        /**
         * @param credentialsPath The AWS credentials path. Default: `&#34;/.aws&#34;` (string)
         * 
         * @return builder
         * 
         */
        public Builder credentialsPath(@Nullable Output<String> credentialsPath) {
            $.credentialsPath = credentialsPath;
            return this;
        }

        /**
         * @param credentialsPath The AWS credentials path. Default: `&#34;/.aws&#34;` (string)
         * 
         * @return builder
         * 
         */
        public Builder credentialsPath(String credentialsPath) {
            return credentialsPath(Output.of(credentialsPath));
        }

        /**
         * @param region The AWS Region. Default: `&#34;us-west-2&#34;` (string)
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The AWS Region. Default: `&#34;us-west-2&#34;` (string)
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param roleArn The AWS Role ARN (string)
         * 
         * @return builder
         * 
         */
        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The AWS Role ARN (string)
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param secretKey The AWS Secret key (string)
         * 
         * @return builder
         * 
         */
        public Builder secretKey(Output<String> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        /**
         * @param secretKey The AWS Secret key (string)
         * 
         * @return builder
         * 
         */
        public Builder secretKey(String secretKey) {
            return secretKey(Output.of(secretKey));
        }

        /**
         * @param zoneType The Route53 zone type `public, private`. Default: `&#34;public&#34;` (string)
         * 
         * @return builder
         * 
         */
        public Builder zoneType(@Nullable Output<String> zoneType) {
            $.zoneType = zoneType;
            return this;
        }

        /**
         * @param zoneType The Route53 zone type `public, private`. Default: `&#34;public&#34;` (string)
         * 
         * @return builder
         * 
         */
        public Builder zoneType(String zoneType) {
            return zoneType(Output.of(zoneType));
        }

        public GlobalDnsProviderRoute53ConfigArgs build() {
            if ($.accessKey == null) {
                throw new MissingRequiredPropertyException("GlobalDnsProviderRoute53ConfigArgs", "accessKey");
            }
            if ($.secretKey == null) {
                throw new MissingRequiredPropertyException("GlobalDnsProviderRoute53ConfigArgs", "secretKey");
            }
            return $;
        }
    }

}
