// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetClusterAlertGroupRecipient;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetClusterAlertGroupResult {
    /**
     * @return (Computed) The cluster alert group annotations (map)
     * 
     */
    private final Map<String,Object> annotations;
    private final String clusterId;
    /**
     * @return (Computed) The cluster alert group description (string)
     * 
     */
    private final String description;
    /**
     * @return (Computed) The cluster alert group interval seconds. Default: `180` (int)
     * 
     */
    private final Integer groupIntervalSeconds;
    /**
     * @return (Computed) The cluster alert group wait seconds. Default: `180` (int)
     * 
     */
    private final Integer groupWaitSeconds;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return (Computed) The cluster alert group labels (map)
     * 
     */
    private final Map<String,Object> labels;
    private final String name;
    /**
     * @return (Computed) The cluster alert group recipients (list)
     * 
     */
    private final List<GetClusterAlertGroupRecipient> recipients;
    /**
     * @return (Computed) The cluster alert group wait seconds. Default: `3600` (int)
     * 
     */
    private final Integer repeatIntervalSeconds;

    @CustomType.Constructor
    private GetClusterAlertGroupResult(
        @CustomType.Parameter("annotations") Map<String,Object> annotations,
        @CustomType.Parameter("clusterId") String clusterId,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("groupIntervalSeconds") Integer groupIntervalSeconds,
        @CustomType.Parameter("groupWaitSeconds") Integer groupWaitSeconds,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("labels") Map<String,Object> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("recipients") List<GetClusterAlertGroupRecipient> recipients,
        @CustomType.Parameter("repeatIntervalSeconds") Integer repeatIntervalSeconds) {
        this.annotations = annotations;
        this.clusterId = clusterId;
        this.description = description;
        this.groupIntervalSeconds = groupIntervalSeconds;
        this.groupWaitSeconds = groupWaitSeconds;
        this.id = id;
        this.labels = labels;
        this.name = name;
        this.recipients = recipients;
        this.repeatIntervalSeconds = repeatIntervalSeconds;
    }

    /**
     * @return (Computed) The cluster alert group annotations (map)
     * 
     */
    public Map<String,Object> annotations() {
        return this.annotations;
    }
    public String clusterId() {
        return this.clusterId;
    }
    /**
     * @return (Computed) The cluster alert group description (string)
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return (Computed) The cluster alert group interval seconds. Default: `180` (int)
     * 
     */
    public Integer groupIntervalSeconds() {
        return this.groupIntervalSeconds;
    }
    /**
     * @return (Computed) The cluster alert group wait seconds. Default: `180` (int)
     * 
     */
    public Integer groupWaitSeconds() {
        return this.groupWaitSeconds;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Computed) The cluster alert group labels (map)
     * 
     */
    public Map<String,Object> labels() {
        return this.labels;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return (Computed) The cluster alert group recipients (list)
     * 
     */
    public List<GetClusterAlertGroupRecipient> recipients() {
        return this.recipients;
    }
    /**
     * @return (Computed) The cluster alert group wait seconds. Default: `3600` (int)
     * 
     */
    public Integer repeatIntervalSeconds() {
        return this.repeatIntervalSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterAlertGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,Object> annotations;
        private String clusterId;
        private String description;
        private Integer groupIntervalSeconds;
        private Integer groupWaitSeconds;
        private String id;
        private Map<String,Object> labels;
        private String name;
        private List<GetClusterAlertGroupRecipient> recipients;
        private Integer repeatIntervalSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterAlertGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.clusterId = defaults.clusterId;
    	      this.description = defaults.description;
    	      this.groupIntervalSeconds = defaults.groupIntervalSeconds;
    	      this.groupWaitSeconds = defaults.groupWaitSeconds;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.recipients = defaults.recipients;
    	      this.repeatIntervalSeconds = defaults.repeatIntervalSeconds;
        }

        public Builder annotations(Map<String,Object> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }
        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder groupIntervalSeconds(Integer groupIntervalSeconds) {
            this.groupIntervalSeconds = Objects.requireNonNull(groupIntervalSeconds);
            return this;
        }
        public Builder groupWaitSeconds(Integer groupWaitSeconds) {
            this.groupWaitSeconds = Objects.requireNonNull(groupWaitSeconds);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder labels(Map<String,Object> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder recipients(List<GetClusterAlertGroupRecipient> recipients) {
            this.recipients = Objects.requireNonNull(recipients);
            return this;
        }
        public Builder recipients(GetClusterAlertGroupRecipient... recipients) {
            return recipients(List.of(recipients));
        }
        public Builder repeatIntervalSeconds(Integer repeatIntervalSeconds) {
            this.repeatIntervalSeconds = Objects.requireNonNull(repeatIntervalSeconds);
            return this;
        }        public GetClusterAlertGroupResult build() {
            return new GetClusterAlertGroupResult(annotations, clusterId, description, groupIntervalSeconds, groupWaitSeconds, id, labels, name, recipients, repeatIntervalSeconds);
        }
    }
}