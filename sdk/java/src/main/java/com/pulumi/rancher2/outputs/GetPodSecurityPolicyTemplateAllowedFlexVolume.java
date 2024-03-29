// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPodSecurityPolicyTemplateAllowedFlexVolume {
    /**
     * @return driver is the name of the Flexvolume driver.
     * 
     */
    private String driver;

    private GetPodSecurityPolicyTemplateAllowedFlexVolume() {}
    /**
     * @return driver is the name of the Flexvolume driver.
     * 
     */
    public String driver() {
        return this.driver;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPodSecurityPolicyTemplateAllowedFlexVolume defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String driver;
        public Builder() {}
        public Builder(GetPodSecurityPolicyTemplateAllowedFlexVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driver = defaults.driver;
        }

        @CustomType.Setter
        public Builder driver(String driver) {
            if (driver == null) {
              throw new MissingRequiredPropertyException("GetPodSecurityPolicyTemplateAllowedFlexVolume", "driver");
            }
            this.driver = driver;
            return this;
        }
        public GetPodSecurityPolicyTemplateAllowedFlexVolume build() {
            final var _resultValue = new GetPodSecurityPolicyTemplateAllowedFlexVolume();
            _resultValue.driver = driver;
            return _resultValue;
        }
    }
}
