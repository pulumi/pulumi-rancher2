// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterAksConfigV2NodePool {
    /**
     * @return The AKS node pool availability zones (list)
     * 
     */
    private final @Nullable List<String> availabilityZones;
    /**
     * @return The AKS node pool count. Default: `1` (int)
     * 
     */
    private final @Nullable Integer count;
    /**
     * @return Is AKS node pool auto scaling enabled? Default: `false` (bool)
     * 
     */
    private final @Nullable Boolean enableAutoScaling;
    /**
     * @return The AKS node pool max count. Required if `enable_auto_scaling=true` (int)
     * 
     */
    private final @Nullable Integer maxCount;
    /**
     * @return The AKS node pool max pods. Default: `110` (int)
     * 
     */
    private final @Nullable Integer maxPods;
    /**
     * @return The AKS node pool min count. Required if `enable_auto_scaling=true` (int)
     * 
     */
    private final @Nullable Integer minCount;
    /**
     * @return The AKS node group mode. Default: `System` (string)
     * 
     */
    private final @Nullable String mode;
    /**
     * @return Name of cluster registration token (string)
     * 
     */
    private final String name;
    /**
     * @return The AKS node pool orchestrator version (string)
     * 
     */
    private final @Nullable String orchestratorVersion;
    /**
     * @return The AKS node pool os disk size gb. Default: `128` (int)
     * 
     */
    private final @Nullable Integer osDiskSizeGb;
    /**
     * @return The AKS node pool os disk type. Default: `Managed` (string)
     * 
     */
    private final @Nullable String osDiskType;
    /**
     * @return The AKS node pool os type. Default: `Linux` (string)
     * 
     */
    private final @Nullable String osType;
    /**
     * @return The AKS node pool orchestrator version (string)
     * 
     */
    private final @Nullable String vmSize;

    @CustomType.Constructor
    private ClusterAksConfigV2NodePool(
        @CustomType.Parameter("availabilityZones") @Nullable List<String> availabilityZones,
        @CustomType.Parameter("count") @Nullable Integer count,
        @CustomType.Parameter("enableAutoScaling") @Nullable Boolean enableAutoScaling,
        @CustomType.Parameter("maxCount") @Nullable Integer maxCount,
        @CustomType.Parameter("maxPods") @Nullable Integer maxPods,
        @CustomType.Parameter("minCount") @Nullable Integer minCount,
        @CustomType.Parameter("mode") @Nullable String mode,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("orchestratorVersion") @Nullable String orchestratorVersion,
        @CustomType.Parameter("osDiskSizeGb") @Nullable Integer osDiskSizeGb,
        @CustomType.Parameter("osDiskType") @Nullable String osDiskType,
        @CustomType.Parameter("osType") @Nullable String osType,
        @CustomType.Parameter("vmSize") @Nullable String vmSize) {
        this.availabilityZones = availabilityZones;
        this.count = count;
        this.enableAutoScaling = enableAutoScaling;
        this.maxCount = maxCount;
        this.maxPods = maxPods;
        this.minCount = minCount;
        this.mode = mode;
        this.name = name;
        this.orchestratorVersion = orchestratorVersion;
        this.osDiskSizeGb = osDiskSizeGb;
        this.osDiskType = osDiskType;
        this.osType = osType;
        this.vmSize = vmSize;
    }

    /**
     * @return The AKS node pool availability zones (list)
     * 
     */
    public List<String> availabilityZones() {
        return this.availabilityZones == null ? List.of() : this.availabilityZones;
    }
    /**
     * @return The AKS node pool count. Default: `1` (int)
     * 
     */
    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }
    /**
     * @return Is AKS node pool auto scaling enabled? Default: `false` (bool)
     * 
     */
    public Optional<Boolean> enableAutoScaling() {
        return Optional.ofNullable(this.enableAutoScaling);
    }
    /**
     * @return The AKS node pool max count. Required if `enable_auto_scaling=true` (int)
     * 
     */
    public Optional<Integer> maxCount() {
        return Optional.ofNullable(this.maxCount);
    }
    /**
     * @return The AKS node pool max pods. Default: `110` (int)
     * 
     */
    public Optional<Integer> maxPods() {
        return Optional.ofNullable(this.maxPods);
    }
    /**
     * @return The AKS node pool min count. Required if `enable_auto_scaling=true` (int)
     * 
     */
    public Optional<Integer> minCount() {
        return Optional.ofNullable(this.minCount);
    }
    /**
     * @return The AKS node group mode. Default: `System` (string)
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * @return Name of cluster registration token (string)
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The AKS node pool orchestrator version (string)
     * 
     */
    public Optional<String> orchestratorVersion() {
        return Optional.ofNullable(this.orchestratorVersion);
    }
    /**
     * @return The AKS node pool os disk size gb. Default: `128` (int)
     * 
     */
    public Optional<Integer> osDiskSizeGb() {
        return Optional.ofNullable(this.osDiskSizeGb);
    }
    /**
     * @return The AKS node pool os disk type. Default: `Managed` (string)
     * 
     */
    public Optional<String> osDiskType() {
        return Optional.ofNullable(this.osDiskType);
    }
    /**
     * @return The AKS node pool os type. Default: `Linux` (string)
     * 
     */
    public Optional<String> osType() {
        return Optional.ofNullable(this.osType);
    }
    /**
     * @return The AKS node pool orchestrator version (string)
     * 
     */
    public Optional<String> vmSize() {
        return Optional.ofNullable(this.vmSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAksConfigV2NodePool defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> availabilityZones;
        private @Nullable Integer count;
        private @Nullable Boolean enableAutoScaling;
        private @Nullable Integer maxCount;
        private @Nullable Integer maxPods;
        private @Nullable Integer minCount;
        private @Nullable String mode;
        private String name;
        private @Nullable String orchestratorVersion;
        private @Nullable Integer osDiskSizeGb;
        private @Nullable String osDiskType;
        private @Nullable String osType;
        private @Nullable String vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterAksConfigV2NodePool defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.count = defaults.count;
    	      this.enableAutoScaling = defaults.enableAutoScaling;
    	      this.maxCount = defaults.maxCount;
    	      this.maxPods = defaults.maxPods;
    	      this.minCount = defaults.minCount;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.orchestratorVersion = defaults.orchestratorVersion;
    	      this.osDiskSizeGb = defaults.osDiskSizeGb;
    	      this.osDiskType = defaults.osDiskType;
    	      this.osType = defaults.osType;
    	      this.vmSize = defaults.vmSize;
        }

        public Builder availabilityZones(@Nullable List<String> availabilityZones) {
            this.availabilityZones = availabilityZones;
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        public Builder count(@Nullable Integer count) {
            this.count = count;
            return this;
        }
        public Builder enableAutoScaling(@Nullable Boolean enableAutoScaling) {
            this.enableAutoScaling = enableAutoScaling;
            return this;
        }
        public Builder maxCount(@Nullable Integer maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public Builder maxPods(@Nullable Integer maxPods) {
            this.maxPods = maxPods;
            return this;
        }
        public Builder minCount(@Nullable Integer minCount) {
            this.minCount = minCount;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder orchestratorVersion(@Nullable String orchestratorVersion) {
            this.orchestratorVersion = orchestratorVersion;
            return this;
        }
        public Builder osDiskSizeGb(@Nullable Integer osDiskSizeGb) {
            this.osDiskSizeGb = osDiskSizeGb;
            return this;
        }
        public Builder osDiskType(@Nullable String osDiskType) {
            this.osDiskType = osDiskType;
            return this;
        }
        public Builder osType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }
        public Builder vmSize(@Nullable String vmSize) {
            this.vmSize = vmSize;
            return this;
        }        public ClusterAksConfigV2NodePool build() {
            return new ClusterAksConfigV2NodePool(availabilityZones, count, enableAutoScaling, maxCount, maxPods, minCount, mode, name, orchestratorVersion, osDiskSizeGb, osDiskType, osType, vmSize);
        }
    }
}