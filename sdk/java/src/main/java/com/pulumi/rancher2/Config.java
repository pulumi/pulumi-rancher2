// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;

public final class Config {

    private static final com.pulumi.Config config = com.pulumi.Config.of("rancher2");
/**
 * API Key used to authenticate with the rancher server
 * 
 */
    public Optional<String> accessKey() {
        return Codegen.stringProp("accessKey").config(config).get();
    }
/**
 * The URL to the rancher API
 * 
 */
    public String apiUrl() {
        return Codegen.stringProp("apiUrl").config(config).require();
    }
/**
 * Bootstrap rancher server
 * 
 */
    public Optional<Boolean> bootstrap() {
        return Codegen.booleanProp("bootstrap").config(config).env("RANCHER_BOOTSTRAP").def(false).get();
    }
/**
 * CA certificates used to sign rancher server tls certificates. Mandatory if self signed tls and insecure option false
 * 
 */
    public Optional<String> caCerts() {
        return Codegen.stringProp("caCerts").config(config).get();
    }
/**
 * Allow insecure connections to Rancher. Mandatory if self signed tls and not ca_certs provided
 * 
 */
    public Optional<Boolean> insecure() {
        return Codegen.booleanProp("insecure").config(config).env("RANCHER_INSECURE").def(false).get();
    }
/**
 * Rancher connection retries
 * 
 */
    public Integer retries() {
        return Codegen.integerProp("retries").config(config).require();
    }
/**
 * API secret used to authenticate with the rancher server
 * 
 */
    public Optional<String> secretKey() {
        return Codegen.stringProp("secretKey").config(config).get();
    }
/**
 * Rancher connection timeout (retry every 5s). Golang duration format, ex: &#34;60s&#34;
 * 
 */
    public Optional<String> timeout() {
        return Codegen.stringProp("timeout").config(config).get();
    }
/**
 * API token used to authenticate with the rancher server
 * 
 */
    public Optional<String> tokenKey() {
        return Codegen.stringProp("tokenKey").config(config).get();
    }
}
