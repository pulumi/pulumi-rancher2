// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class CloudCredentialOpenstackCredentialConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudCredentialOpenstackCredentialConfigArgs Empty = new CloudCredentialOpenstackCredentialConfigArgs();

    /**
     * vSphere password (string)
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return vSphere password (string)
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    private CloudCredentialOpenstackCredentialConfigArgs() {}

    private CloudCredentialOpenstackCredentialConfigArgs(CloudCredentialOpenstackCredentialConfigArgs $) {
        this.password = $.password;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudCredentialOpenstackCredentialConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudCredentialOpenstackCredentialConfigArgs $;

        public Builder() {
            $ = new CloudCredentialOpenstackCredentialConfigArgs();
        }

        public Builder(CloudCredentialOpenstackCredentialConfigArgs defaults) {
            $ = new CloudCredentialOpenstackCredentialConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password vSphere password (string)
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password vSphere password (string)
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        public CloudCredentialOpenstackCredentialConfigArgs build() {
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            return $;
        }
    }

}