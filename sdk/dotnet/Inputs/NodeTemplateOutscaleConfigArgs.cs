// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class NodeTemplateOutscaleConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessKey", required: true)]
        private Input<string>? _accessKey;

        /// <summary>
        /// AWS access key. Required on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
        /// </summary>
        public Input<string>? AccessKey
        {
            get => _accessKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accessKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("extraTagsAlls")]
        private InputList<string>? _extraTagsAlls;

        /// <summary>
        /// Extra tags for all created resources (e.g. key1=value1,key2=value2) (list)
        /// </summary>
        public InputList<string> ExtraTagsAlls
        {
            get => _extraTagsAlls ?? (_extraTagsAlls = new InputList<string>());
            set => _extraTagsAlls = value;
        }

        [Input("extraTagsInstances")]
        private InputList<string>? _extraTagsInstances;

        /// <summary>
        /// Extra tags only for instances (e.g. key1=value1,key2=value2) (list)
        /// </summary>
        public InputList<string> ExtraTagsInstances
        {
            get => _extraTagsInstances ?? (_extraTagsInstances = new InputList<string>());
            set => _extraTagsInstances = value;
        }

        /// <summary>
        /// AWS instance type. Default `t2.micro` (string)
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// AWS region. (string)
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Iops for io1 Root Disk. From 1 to 13000.
        /// </summary>
        [Input("rootDiskIops")]
        public Input<int>? RootDiskIops { get; set; }

        /// <summary>
        /// Size of the Root Disk (in GB). From 1 to 14901.
        /// </summary>
        [Input("rootDiskSize")]
        public Input<int>? RootDiskSize { get; set; }

        /// <summary>
        /// Type of the Root Disk. Possible values are :'standard', 'gp2' or 'io1'.
        /// </summary>
        [Input("rootDiskType")]
        public Input<string>? RootDiskType { get; set; }

        [Input("secretKey", required: true)]
        private Input<string>? _secretKey;

        /// <summary>
        /// AWS secret key. Required on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
        /// </summary>
        public Input<string>? SecretKey
        {
            get => _secretKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// Ids of user defined Security Groups to add to the machine. (list)
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        /// <summary>
        /// Outscale Machine Image to use as bootstrap for the VM. Default `ami-2cf1fa3e` (string)
        /// </summary>
        [Input("sourceOmi")]
        public Input<string>? SourceOmi { get; set; }

        public NodeTemplateOutscaleConfigArgs()
        {
        }
        public static new NodeTemplateOutscaleConfigArgs Empty => new NodeTemplateOutscaleConfigArgs();
    }
}