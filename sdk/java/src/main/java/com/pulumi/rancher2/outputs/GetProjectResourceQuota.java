// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.outputs.GetProjectResourceQuotaNamespaceDefaultLimit;
import com.pulumi.rancher2.outputs.GetProjectResourceQuotaProjectLimit;
import java.util.Objects;

@CustomType
public final class GetProjectResourceQuota {
    private GetProjectResourceQuotaNamespaceDefaultLimit namespaceDefaultLimit;
    private GetProjectResourceQuotaProjectLimit projectLimit;

    private GetProjectResourceQuota() {}
    public GetProjectResourceQuotaNamespaceDefaultLimit namespaceDefaultLimit() {
        return this.namespaceDefaultLimit;
    }
    public GetProjectResourceQuotaProjectLimit projectLimit() {
        return this.projectLimit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectResourceQuota defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetProjectResourceQuotaNamespaceDefaultLimit namespaceDefaultLimit;
        private GetProjectResourceQuotaProjectLimit projectLimit;
        public Builder() {}
        public Builder(GetProjectResourceQuota defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespaceDefaultLimit = defaults.namespaceDefaultLimit;
    	      this.projectLimit = defaults.projectLimit;
        }

        @CustomType.Setter
        public Builder namespaceDefaultLimit(GetProjectResourceQuotaNamespaceDefaultLimit namespaceDefaultLimit) {
            if (namespaceDefaultLimit == null) {
              throw new MissingRequiredPropertyException("GetProjectResourceQuota", "namespaceDefaultLimit");
            }
            this.namespaceDefaultLimit = namespaceDefaultLimit;
            return this;
        }
        @CustomType.Setter
        public Builder projectLimit(GetProjectResourceQuotaProjectLimit projectLimit) {
            if (projectLimit == null) {
              throw new MissingRequiredPropertyException("GetProjectResourceQuota", "projectLimit");
            }
            this.projectLimit = projectLimit;
            return this;
        }
        public GetProjectResourceQuota build() {
            final var _resultValue = new GetProjectResourceQuota();
            _resultValue.namespaceDefaultLimit = namespaceDefaultLimit;
            _resultValue.projectLimit = projectLimit;
            return _resultValue;
        }
    }
}
