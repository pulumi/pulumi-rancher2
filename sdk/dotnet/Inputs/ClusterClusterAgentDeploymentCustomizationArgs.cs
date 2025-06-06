// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterClusterAgentDeploymentCustomizationArgs : global::Pulumi.ResourceArgs
    {
        [Input("appendTolerations")]
        private InputList<Inputs.ClusterClusterAgentDeploymentCustomizationAppendTolerationArgs>? _appendTolerations;

        /// <summary>
        /// User defined tolerations to append to agent
        /// </summary>
        public InputList<Inputs.ClusterClusterAgentDeploymentCustomizationAppendTolerationArgs> AppendTolerations
        {
            get => _appendTolerations ?? (_appendTolerations = new InputList<Inputs.ClusterClusterAgentDeploymentCustomizationAppendTolerationArgs>());
            set => _appendTolerations = value;
        }

        /// <summary>
        /// User defined affinity to override default agent affinity
        /// </summary>
        [Input("overrideAffinity")]
        public Input<string>? OverrideAffinity { get; set; }

        [Input("overrideResourceRequirements")]
        private InputList<Inputs.ClusterClusterAgentDeploymentCustomizationOverrideResourceRequirementArgs>? _overrideResourceRequirements;

        /// <summary>
        /// User defined resource requirements to set on the agent
        /// </summary>
        public InputList<Inputs.ClusterClusterAgentDeploymentCustomizationOverrideResourceRequirementArgs> OverrideResourceRequirements
        {
            get => _overrideResourceRequirements ?? (_overrideResourceRequirements = new InputList<Inputs.ClusterClusterAgentDeploymentCustomizationOverrideResourceRequirementArgs>());
            set => _overrideResourceRequirements = value;
        }

        [Input("schedulingCustomizations")]
        private InputList<Inputs.ClusterClusterAgentDeploymentCustomizationSchedulingCustomizationArgs>? _schedulingCustomizations;

        /// <summary>
        /// User defined scheduling customization for the cattle cluster agent
        /// </summary>
        public InputList<Inputs.ClusterClusterAgentDeploymentCustomizationSchedulingCustomizationArgs> SchedulingCustomizations
        {
            get => _schedulingCustomizations ?? (_schedulingCustomizations = new InputList<Inputs.ClusterClusterAgentDeploymentCustomizationSchedulingCustomizationArgs>());
            set => _schedulingCustomizations = value;
        }

        public ClusterClusterAgentDeploymentCustomizationArgs()
        {
        }
        public static new ClusterClusterAgentDeploymentCustomizationArgs Empty => new ClusterClusterAgentDeploymentCustomizationArgs();
    }
}
