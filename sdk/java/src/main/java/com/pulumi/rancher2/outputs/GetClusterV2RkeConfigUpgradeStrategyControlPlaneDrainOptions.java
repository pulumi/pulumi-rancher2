// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterV2RkeConfigUpgradeStrategyControlPlaneDrainOptions {
    private final @Nullable Boolean deleteEmptyDirData;
    private final @Nullable Boolean disableEviction;
    private final @Nullable Boolean enabled;
    private final @Nullable Boolean force;
    private final Integer gracePeriod;
    private final @Nullable Boolean ignoreDaemonSets;
    private final @Nullable Boolean ignoreErrors;
    private final Integer skipWaitForDeleteTimeoutSeconds;
    private final Integer timeout;

    @CustomType.Constructor
    private GetClusterV2RkeConfigUpgradeStrategyControlPlaneDrainOptions(
        @CustomType.Parameter("deleteEmptyDirData") @Nullable Boolean deleteEmptyDirData,
        @CustomType.Parameter("disableEviction") @Nullable Boolean disableEviction,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("force") @Nullable Boolean force,
        @CustomType.Parameter("gracePeriod") Integer gracePeriod,
        @CustomType.Parameter("ignoreDaemonSets") @Nullable Boolean ignoreDaemonSets,
        @CustomType.Parameter("ignoreErrors") @Nullable Boolean ignoreErrors,
        @CustomType.Parameter("skipWaitForDeleteTimeoutSeconds") Integer skipWaitForDeleteTimeoutSeconds,
        @CustomType.Parameter("timeout") Integer timeout) {
        this.deleteEmptyDirData = deleteEmptyDirData;
        this.disableEviction = disableEviction;
        this.enabled = enabled;
        this.force = force;
        this.gracePeriod = gracePeriod;
        this.ignoreDaemonSets = ignoreDaemonSets;
        this.ignoreErrors = ignoreErrors;
        this.skipWaitForDeleteTimeoutSeconds = skipWaitForDeleteTimeoutSeconds;
        this.timeout = timeout;
    }

    public Optional<Boolean> deleteEmptyDirData() {
        return Optional.ofNullable(this.deleteEmptyDirData);
    }
    public Optional<Boolean> disableEviction() {
        return Optional.ofNullable(this.disableEviction);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<Boolean> force() {
        return Optional.ofNullable(this.force);
    }
    public Integer gracePeriod() {
        return this.gracePeriod;
    }
    public Optional<Boolean> ignoreDaemonSets() {
        return Optional.ofNullable(this.ignoreDaemonSets);
    }
    public Optional<Boolean> ignoreErrors() {
        return Optional.ofNullable(this.ignoreErrors);
    }
    public Integer skipWaitForDeleteTimeoutSeconds() {
        return this.skipWaitForDeleteTimeoutSeconds;
    }
    public Integer timeout() {
        return this.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterV2RkeConfigUpgradeStrategyControlPlaneDrainOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean deleteEmptyDirData;
        private @Nullable Boolean disableEviction;
        private @Nullable Boolean enabled;
        private @Nullable Boolean force;
        private Integer gracePeriod;
        private @Nullable Boolean ignoreDaemonSets;
        private @Nullable Boolean ignoreErrors;
        private Integer skipWaitForDeleteTimeoutSeconds;
        private Integer timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterV2RkeConfigUpgradeStrategyControlPlaneDrainOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteEmptyDirData = defaults.deleteEmptyDirData;
    	      this.disableEviction = defaults.disableEviction;
    	      this.enabled = defaults.enabled;
    	      this.force = defaults.force;
    	      this.gracePeriod = defaults.gracePeriod;
    	      this.ignoreDaemonSets = defaults.ignoreDaemonSets;
    	      this.ignoreErrors = defaults.ignoreErrors;
    	      this.skipWaitForDeleteTimeoutSeconds = defaults.skipWaitForDeleteTimeoutSeconds;
    	      this.timeout = defaults.timeout;
        }

        public Builder deleteEmptyDirData(@Nullable Boolean deleteEmptyDirData) {
            this.deleteEmptyDirData = deleteEmptyDirData;
            return this;
        }
        public Builder disableEviction(@Nullable Boolean disableEviction) {
            this.disableEviction = disableEviction;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder force(@Nullable Boolean force) {
            this.force = force;
            return this;
        }
        public Builder gracePeriod(Integer gracePeriod) {
            this.gracePeriod = Objects.requireNonNull(gracePeriod);
            return this;
        }
        public Builder ignoreDaemonSets(@Nullable Boolean ignoreDaemonSets) {
            this.ignoreDaemonSets = ignoreDaemonSets;
            return this;
        }
        public Builder ignoreErrors(@Nullable Boolean ignoreErrors) {
            this.ignoreErrors = ignoreErrors;
            return this;
        }
        public Builder skipWaitForDeleteTimeoutSeconds(Integer skipWaitForDeleteTimeoutSeconds) {
            this.skipWaitForDeleteTimeoutSeconds = Objects.requireNonNull(skipWaitForDeleteTimeoutSeconds);
            return this;
        }
        public Builder timeout(Integer timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }        public GetClusterV2RkeConfigUpgradeStrategyControlPlaneDrainOptions build() {
            return new GetClusterV2RkeConfigUpgradeStrategyControlPlaneDrainOptions(deleteEmptyDirData, disableEviction, enabled, force, gracePeriod, ignoreDaemonSets, ignoreErrors, skipWaitForDeleteTimeoutSeconds, timeout);
        }
    }
}