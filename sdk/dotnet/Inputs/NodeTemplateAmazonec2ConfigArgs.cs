// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class NodeTemplateAmazonec2ConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// AWS access key. Required on Rancher v2.0.x and v2.1.x. Use `rancher2..CloudCredential` from Rancher v2.2.x (string)
        /// </summary>
        [Input("accessKey")]
        public Input<string>? AccessKey { get; set; }

        /// <summary>
        /// AWS machine image (string)
        /// </summary>
        [Input("ami", required: true)]
        public Input<string> Ami { get; set; } = null!;

        /// <summary>
        /// AWS spot instance duration in minutes (60, 120, 180, 240, 300, or 360). Default `0` (string)
        /// </summary>
        [Input("blockDurationMinutes")]
        public Input<string>? BlockDurationMinutes { get; set; }

        /// <summary>
        /// AWS root device name. Default `/dev/sda1` (string)
        /// </summary>
        [Input("deviceName")]
        public Input<string>? DeviceName { get; set; }

        /// <summary>
        /// Optional endpoint URL (hostname only or fully qualified URI) (string)
        /// </summary>
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        /// <summary>
        /// AWS IAM Instance Profile (string)
        /// </summary>
        [Input("iamInstanceProfile")]
        public Input<string>? IamInstanceProfile { get; set; }

        /// <summary>
        /// Disable SSL when sending requests (bool)
        /// </summary>
        [Input("insecureTransport")]
        public Input<bool>? InsecureTransport { get; set; }

        /// <summary>
        /// Specifies the Linode Instance type which determines CPU, memory, disk size, etc. Default `g6-standard-4` (string)
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// OpenStack keypair to use to SSH to the instance (string)
        /// </summary>
        [Input("keypairName")]
        public Input<string>? KeypairName { get; set; }

        /// <summary>
        /// Enable monitoring for droplet. Default `false` (bool)
        /// </summary>
        [Input("monitoring")]
        public Input<bool>? Monitoring { get; set; }

        [Input("openPorts")]
        private InputList<string>? _openPorts;

        /// <summary>
        /// Make the specified port number accessible from the Internet. (list)
        /// </summary>
        public InputList<string> OpenPorts
        {
            get => _openPorts ?? (_openPorts = new InputList<string>());
            set => _openPorts = value;
        }

        /// <summary>
        /// Only use a private IP address. Default `false` (bool)
        /// </summary>
        [Input("privateAddressOnly")]
        public Input<bool>? PrivateAddressOnly { get; set; }

        /// <summary>
        /// OpenStack region name (string)
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// Set this flag to request spot instance. Default `false` (bool)
        /// </summary>
        [Input("requestSpotInstance")]
        public Input<bool>? RequestSpotInstance { get; set; }

        /// <summary>
        /// Set retry count for recoverable failures (use -1 to disable). Default `5` (string)
        /// </summary>
        [Input("retries")]
        public Input<string>? Retries { get; set; }

        /// <summary>
        /// AWS root disk size (in GB). Default `16` (string)
        /// </summary>
        [Input("rootSize")]
        public Input<string>? RootSize { get; set; }

        /// <summary>
        /// AWS secret key. Required on Rancher v2.0.x and v2.1.x. Use `rancher2..CloudCredential` from Rancher v2.2.x (string)
        /// </summary>
        [Input("secretKey")]
        public Input<string>? SecretKey { get; set; }

        /// <summary>
        /// Skip adding default rules to security groups (bool)
        /// </summary>
        [Input("securityGroupReadonly")]
        public Input<bool>? SecurityGroupReadonly { get; set; }

        [Input("securityGroups", required: true)]
        private InputList<string>? _securityGroups;

        /// <summary>
        /// AWS VPC security group. (list)
        /// </summary>
        public InputList<string> SecurityGroups
        {
            get => _securityGroups ?? (_securityGroups = new InputList<string>());
            set => _securityGroups = value;
        }

        /// <summary>
        /// AWS Session Token (string)
        /// </summary>
        [Input("sessionToken")]
        public Input<string>? SessionToken { get; set; }

        /// <summary>
        /// AWS spot instance bid price (in dollar). Default `0.50` (string)
        /// </summary>
        [Input("spotPrice")]
        public Input<string>? SpotPrice { get; set; }

        /// <summary>
        /// SSH Key for Instance (string)
        /// </summary>
        [Input("sshKeypath")]
        public Input<string>? SshKeypath { get; set; }

        /// <summary>
        /// If using a non-B2D image you can specify the ssh user. Default `docker`. From Rancher v2.3.3 (string)
        /// </summary>
        [Input("sshUser")]
        public Input<string>? SshUser { get; set; }

        /// <summary>
        /// AWS VPC subnet id (string)
        /// </summary>
        [Input("subnetId", required: true)]
        public Input<string> SubnetId { get; set; } = null!;

        /// <summary>
        /// vSphere tags id e.g. `urn:xxx`. From Rancher v2.3.3 (list)
        /// </summary>
        [Input("tags")]
        public Input<string>? Tags { get; set; }

        /// <summary>
        /// Create an EBS optimized instance. Default `false` (bool)
        /// </summary>
        [Input("useEbsOptimizedInstance")]
        public Input<bool>? UseEbsOptimizedInstance { get; set; }

        /// <summary>
        /// Force the usage of private IP address. Default `false` (bool)
        /// </summary>
        [Input("usePrivateAddress")]
        public Input<bool>? UsePrivateAddress { get; set; }

        /// <summary>
        /// Path to file with cloud-init user-data (string)
        /// </summary>
        [Input("userdata")]
        public Input<string>? Userdata { get; set; }

        /// <summary>
        /// Amazon EBS volume type. Default `gp2` (string)
        /// </summary>
        [Input("volumeType")]
        public Input<string>? VolumeType { get; set; }

        /// <summary>
        /// AWS VPC id. (string)
        /// </summary>
        [Input("vpcId", required: true)]
        public Input<string> VpcId { get; set; } = null!;

        /// <summary>
        /// AWS zone for instance (i.e. a,b,c,d,e) (string)
        /// </summary>
        [Input("zone", required: true)]
        public Input<string> Zone { get; set; } = null!;

        public NodeTemplateAmazonec2ConfigArgs()
        {
        }
    }
}