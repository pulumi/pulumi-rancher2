// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterScheduledClusterScanScheduleConfig {
    private final String cronSchedule;
    private final Integer retention;

    @CustomType.Constructor
    private GetClusterScheduledClusterScanScheduleConfig(
        @CustomType.Parameter("cronSchedule") String cronSchedule,
        @CustomType.Parameter("retention") Integer retention) {
        this.cronSchedule = cronSchedule;
        this.retention = retention;
    }

    public String cronSchedule() {
        return this.cronSchedule;
    }
    public Integer retention() {
        return this.retention;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterScheduledClusterScanScheduleConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cronSchedule;
        private Integer retention;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterScheduledClusterScanScheduleConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cronSchedule = defaults.cronSchedule;
    	      this.retention = defaults.retention;
        }

        public Builder cronSchedule(String cronSchedule) {
            this.cronSchedule = Objects.requireNonNull(cronSchedule);
            return this;
        }
        public Builder retention(Integer retention) {
            this.retention = Objects.requireNonNull(retention);
            return this;
        }        public GetClusterScheduledClusterScanScheduleConfig build() {
            return new GetClusterScheduledClusterScanScheduleConfig(cronSchedule, retention);
        }
    }
}