// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterV2RkeConfigMachineSelectorFileFileSourceConfigmapItem {
    /**
     * @return If ture, the file is ignored when determining whether the node should be drained before updating the node plan (default: true).
     * 
     */
    private @Nullable Boolean dynamic;
    /**
     * @return The base64 encoded value of the SHA256 checksum of the file&#39;s content
     * 
     */
    private @Nullable String hash;
    /**
     * @return The key of the item(file) to retrieve
     * 
     */
    private String key;
    /**
     * @return The path to put the file in the target node
     * 
     */
    private String path;
    /**
     * @return The numeric representation of the file permissions
     * 
     */
    private @Nullable String permissions;

    private ClusterV2RkeConfigMachineSelectorFileFileSourceConfigmapItem() {}
    /**
     * @return If ture, the file is ignored when determining whether the node should be drained before updating the node plan (default: true).
     * 
     */
    public Optional<Boolean> dynamic() {
        return Optional.ofNullable(this.dynamic);
    }
    /**
     * @return The base64 encoded value of the SHA256 checksum of the file&#39;s content
     * 
     */
    public Optional<String> hash() {
        return Optional.ofNullable(this.hash);
    }
    /**
     * @return The key of the item(file) to retrieve
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The path to put the file in the target node
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return The numeric representation of the file permissions
     * 
     */
    public Optional<String> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterV2RkeConfigMachineSelectorFileFileSourceConfigmapItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean dynamic;
        private @Nullable String hash;
        private String key;
        private String path;
        private @Nullable String permissions;
        public Builder() {}
        public Builder(ClusterV2RkeConfigMachineSelectorFileFileSourceConfigmapItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dynamic = defaults.dynamic;
    	      this.hash = defaults.hash;
    	      this.key = defaults.key;
    	      this.path = defaults.path;
    	      this.permissions = defaults.permissions;
        }

        @CustomType.Setter
        public Builder dynamic(@Nullable Boolean dynamic) {

            this.dynamic = dynamic;
            return this;
        }
        @CustomType.Setter
        public Builder hash(@Nullable String hash) {

            this.hash = hash;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("ClusterV2RkeConfigMachineSelectorFileFileSourceConfigmapItem", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            if (path == null) {
              throw new MissingRequiredPropertyException("ClusterV2RkeConfigMachineSelectorFileFileSourceConfigmapItem", "path");
            }
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder permissions(@Nullable String permissions) {

            this.permissions = permissions;
            return this;
        }
        public ClusterV2RkeConfigMachineSelectorFileFileSourceConfigmapItem build() {
            final var _resultValue = new ClusterV2RkeConfigMachineSelectorFileFileSourceConfigmapItem();
            _resultValue.dynamic = dynamic;
            _resultValue.hash = hash;
            _resultValue.key = key;
            _resultValue.path = path;
            _resultValue.permissions = permissions;
            return _resultValue;
        }
    }
}
