// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetNodeDriverResult {
    /**
     * @return (Computed) Specify if the node driver state (bool)
     * 
     */
    private Boolean active;
    /**
     * @return (Computed) Annotations of the resource (map)
     * 
     */
    private Map<String,String> annotations;
    /**
     * @return (Computed) Specify wheter the node driver is an internal cluster driver or not (bool)
     * 
     */
    private Boolean builtin;
    /**
     * @return (Computed) Verify that the downloaded driver matches the expected checksum (string)
     * 
     */
    private String checksum;
    /**
     * @return (Computed) Description of the node driver (string)
     * 
     */
    private String description;
    /**
     * @return (Computed) External ID (string)
     * 
     */
    private String externalId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (Computed) Labels of the resource (map)
     * 
     */
    private Map<String,String> labels;
    private String name;
    /**
     * @return (Computed) The URL to load for customized Add Node screen for this driver (string)
     * 
     */
    private String uiUrl;
    private String url;
    /**
     * @return (Computed) Domains to whitelist for the ui (list)
     * 
     */
    private List<String> whitelistDomains;

    private GetNodeDriverResult() {}
    /**
     * @return (Computed) Specify if the node driver state (bool)
     * 
     */
    public Boolean active() {
        return this.active;
    }
    /**
     * @return (Computed) Annotations of the resource (map)
     * 
     */
    public Map<String,String> annotations() {
        return this.annotations;
    }
    /**
     * @return (Computed) Specify wheter the node driver is an internal cluster driver or not (bool)
     * 
     */
    public Boolean builtin() {
        return this.builtin;
    }
    /**
     * @return (Computed) Verify that the downloaded driver matches the expected checksum (string)
     * 
     */
    public String checksum() {
        return this.checksum;
    }
    /**
     * @return (Computed) Description of the node driver (string)
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return (Computed) External ID (string)
     * 
     */
    public String externalId() {
        return this.externalId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Computed) Labels of the resource (map)
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return (Computed) The URL to load for customized Add Node screen for this driver (string)
     * 
     */
    public String uiUrl() {
        return this.uiUrl;
    }
    public String url() {
        return this.url;
    }
    /**
     * @return (Computed) Domains to whitelist for the ui (list)
     * 
     */
    public List<String> whitelistDomains() {
        return this.whitelistDomains;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeDriverResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean active;
        private Map<String,String> annotations;
        private Boolean builtin;
        private String checksum;
        private String description;
        private String externalId;
        private String id;
        private Map<String,String> labels;
        private String name;
        private String uiUrl;
        private String url;
        private List<String> whitelistDomains;
        public Builder() {}
        public Builder(GetNodeDriverResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.annotations = defaults.annotations;
    	      this.builtin = defaults.builtin;
    	      this.checksum = defaults.checksum;
    	      this.description = defaults.description;
    	      this.externalId = defaults.externalId;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.uiUrl = defaults.uiUrl;
    	      this.url = defaults.url;
    	      this.whitelistDomains = defaults.whitelistDomains;
        }

        @CustomType.Setter
        public Builder active(Boolean active) {
            if (active == null) {
              throw new MissingRequiredPropertyException("GetNodeDriverResult", "active");
            }
            this.active = active;
            return this;
        }
        @CustomType.Setter
        public Builder annotations(Map<String,String> annotations) {
            if (annotations == null) {
              throw new MissingRequiredPropertyException("GetNodeDriverResult", "annotations");
            }
            this.annotations = annotations;
            return this;
        }
        @CustomType.Setter
        public Builder builtin(Boolean builtin) {
            if (builtin == null) {
              throw new MissingRequiredPropertyException("GetNodeDriverResult", "builtin");
            }
            this.builtin = builtin;
            return this;
        }
        @CustomType.Setter
        public Builder checksum(String checksum) {
            if (checksum == null) {
              throw new MissingRequiredPropertyException("GetNodeDriverResult", "checksum");
            }
            this.checksum = checksum;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetNodeDriverResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder externalId(String externalId) {
            if (externalId == null) {
              throw new MissingRequiredPropertyException("GetNodeDriverResult", "externalId");
            }
            this.externalId = externalId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNodeDriverResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetNodeDriverResult", "labels");
            }
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetNodeDriverResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder uiUrl(String uiUrl) {
            if (uiUrl == null) {
              throw new MissingRequiredPropertyException("GetNodeDriverResult", "uiUrl");
            }
            this.uiUrl = uiUrl;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetNodeDriverResult", "url");
            }
            this.url = url;
            return this;
        }
        @CustomType.Setter
        public Builder whitelistDomains(List<String> whitelistDomains) {
            if (whitelistDomains == null) {
              throw new MissingRequiredPropertyException("GetNodeDriverResult", "whitelistDomains");
            }
            this.whitelistDomains = whitelistDomains;
            return this;
        }
        public Builder whitelistDomains(String... whitelistDomains) {
            return whitelistDomains(List.of(whitelistDomains));
        }
        public GetNodeDriverResult build() {
            final var _resultValue = new GetNodeDriverResult();
            _resultValue.active = active;
            _resultValue.annotations = annotations;
            _resultValue.builtin = builtin;
            _resultValue.checksum = checksum;
            _resultValue.description = description;
            _resultValue.externalId = externalId;
            _resultValue.id = id;
            _resultValue.labels = labels;
            _resultValue.name = name;
            _resultValue.uiUrl = uiUrl;
            _resultValue.url = url;
            _resultValue.whitelistDomains = whitelistDomains;
            return _resultValue;
        }
    }
}
