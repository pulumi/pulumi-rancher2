// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    /// <summary>
    /// Provides a Rancher V2 Global DNS Provider resource. This can be used to create Global DNS Providers for Rancher V2. Supported Global DNS Providers: `alidns, cloudflare, route53`
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Rancher2 = Pulumi.Rancher2;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         // Create a new rancher2 Global DNS Provider - alidns
    ///         var foo = new Rancher2.GlobalDnsProvider("foo", new Rancher2.GlobalDnsProviderArgs
    ///         {
    ///             AlidnsConfig = new Rancher2.Inputs.GlobalDnsProviderAlidnsConfigArgs
    ///             {
    ///                 AccessKey = "YYYYYYYYYYYYYYYYYYYY",
    ///                 SecretKey = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
    ///             },
    ///             RootDomain = "example.com",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Rancher2 = Pulumi.Rancher2;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         // Create a new rancher2 Global DNS Provider - cloudflare
    ///         var foo = new Rancher2.GlobalDnsProvider("foo", new Rancher2.GlobalDnsProviderArgs
    ///         {
    ///             CloudflareConfig = new Rancher2.Inputs.GlobalDnsProviderCloudflareConfigArgs
    ///             {
    ///                 ApiEmail = "test@test.local",
    ///                 ApiKey = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
    ///                 ProxySetting = true,
    ///             },
    ///             RootDomain = "example.com",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Rancher2 = Pulumi.Rancher2;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         // Create a new rancher2 Global DNS Provider - route53
    ///         var foo = new Rancher2.GlobalDnsProvider("foo", new Rancher2.GlobalDnsProviderArgs
    ///         {
    ///             RootDomain = "example.com",
    ///             Route53Config = new Rancher2.Inputs.GlobalDnsProviderRoute53ConfigArgs
    ///             {
    ///                 AccessKey = "YYYYYYYYYYYYYYYYYYYY",
    ///                 Region = "us-east-1",
    ///                 SecretKey = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
    ///                 ZoneType = "private",
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Global DNS Providers can be imported using the Rancher Global DNS Provider ID
    /// 
    /// ```sh
    ///  $ pulumi import rancher2:index/globalDnsProvider:GlobalDnsProvider foo &lt;global_dns_provider_id&gt;
    /// ```
    /// </summary>
    [Rancher2ResourceType("rancher2:index/globalDnsProvider:GlobalDnsProvider")]
    public partial class GlobalDnsProvider : Pulumi.CustomResource
    {
        [Output("alidnsConfig")]
        public Output<Outputs.GlobalDnsProviderAlidnsConfig?> AlidnsConfig { get; private set; } = null!;

        /// <summary>
        /// Annotations for Global DNS Provider (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        [Output("cloudflareConfig")]
        public Output<Outputs.GlobalDnsProviderCloudflareConfig?> CloudflareConfig { get; private set; } = null!;

        /// <summary>
        /// (Computed) The Global DNS Provider `alidns, cloudflare, route53` (string)
        /// </summary>
        [Output("dnsProvider")]
        public Output<string> DnsProvider { get; private set; } = null!;

        /// <summary>
        /// Labels for Global DNS Provider (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// The name of the Global DNS Provider (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The user ID to assign Global DNS Provider (string)
        /// </summary>
        [Output("rootDomain")]
        public Output<string> RootDomain { get; private set; } = null!;

        [Output("route53Config")]
        public Output<Outputs.GlobalDnsProviderRoute53Config?> Route53Config { get; private set; } = null!;


        /// <summary>
        /// Create a GlobalDnsProvider resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GlobalDnsProvider(string name, GlobalDnsProviderArgs args, CustomResourceOptions? options = null)
            : base("rancher2:index/globalDnsProvider:GlobalDnsProvider", name, args ?? new GlobalDnsProviderArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GlobalDnsProvider(string name, Input<string> id, GlobalDnsProviderState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/globalDnsProvider:GlobalDnsProvider", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing GlobalDnsProvider resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GlobalDnsProvider Get(string name, Input<string> id, GlobalDnsProviderState? state = null, CustomResourceOptions? options = null)
        {
            return new GlobalDnsProvider(name, id, state, options);
        }
    }

    public sealed class GlobalDnsProviderArgs : Pulumi.ResourceArgs
    {
        [Input("alidnsConfig")]
        public Input<Inputs.GlobalDnsProviderAlidnsConfigArgs>? AlidnsConfig { get; set; }

        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for Global DNS Provider (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        [Input("cloudflareConfig")]
        public Input<Inputs.GlobalDnsProviderCloudflareConfigArgs>? CloudflareConfig { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for Global DNS Provider (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the Global DNS Provider (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The user ID to assign Global DNS Provider (string)
        /// </summary>
        [Input("rootDomain", required: true)]
        public Input<string> RootDomain { get; set; } = null!;

        [Input("route53Config")]
        public Input<Inputs.GlobalDnsProviderRoute53ConfigArgs>? Route53Config { get; set; }

        public GlobalDnsProviderArgs()
        {
        }
    }

    public sealed class GlobalDnsProviderState : Pulumi.ResourceArgs
    {
        [Input("alidnsConfig")]
        public Input<Inputs.GlobalDnsProviderAlidnsConfigGetArgs>? AlidnsConfig { get; set; }

        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for Global DNS Provider (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        [Input("cloudflareConfig")]
        public Input<Inputs.GlobalDnsProviderCloudflareConfigGetArgs>? CloudflareConfig { get; set; }

        /// <summary>
        /// (Computed) The Global DNS Provider `alidns, cloudflare, route53` (string)
        /// </summary>
        [Input("dnsProvider")]
        public Input<string>? DnsProvider { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for Global DNS Provider (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the Global DNS Provider (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The user ID to assign Global DNS Provider (string)
        /// </summary>
        [Input("rootDomain")]
        public Input<string>? RootDomain { get; set; }

        [Input("route53Config")]
        public Input<Inputs.GlobalDnsProviderRoute53ConfigGetArgs>? Route53Config { get; set; }

        public GlobalDnsProviderState()
        {
        }
    }
}
