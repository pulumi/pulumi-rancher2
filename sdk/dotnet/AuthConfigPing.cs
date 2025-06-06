// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    /// <summary>
    /// Provides a Rancher v2 Auth Config Ping resource. This can be used to configure and enable Auth Config Ping for Rancher v2 RKE clusters and retrieve their information.
    /// 
    /// In addition to the built-in local auth, only one external auth config provider can be enabled at a time.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Rancher2 = Pulumi.Rancher2;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create a new rancher2 Auth Config Ping
    ///     var ping = new Rancher2.AuthConfigPing("ping", new()
    ///     {
    ///         DisplayNameField = "&lt;DISPLAY_NAME_FIELD&gt;",
    ///         GroupsField = "&lt;GROUPS_FIELD&gt;",
    ///         IdpMetadataContent = "&lt;IDP_METADATA_CONTENT&gt;",
    ///         RancherApiHost = "https://&lt;RANCHER_API_HOST&gt;",
    ///         SpCert = "&lt;SP_CERT&gt;",
    ///         SpKey = "&lt;SP_KEY&gt;",
    ///         UidField = "&lt;UID_FIELD&gt;",
    ///         UserNameField = "&lt;USER_NAME_FIELD&gt;",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [Rancher2ResourceType("rancher2:index/authConfigPing:AuthConfigPing")]
    public partial class AuthConfigPing : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        /// </summary>
        [Output("accessMode")]
        public Output<string?> AccessMode { get; private set; } = null!;

        /// <summary>
        /// Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `ping_user://&lt;USER_ID&gt;`  `ping_group://&lt;GROUP_ID&gt;` (list)
        /// </summary>
        [Output("allowedPrincipalIds")]
        public Output<ImmutableArray<string>> AllowedPrincipalIds { get; private set; } = null!;

        /// <summary>
        /// Annotations of the resource (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, string>> Annotations { get; private set; } = null!;

        /// <summary>
        /// Ping display name field (string)
        /// </summary>
        [Output("displayNameField")]
        public Output<string> DisplayNameField { get; private set; } = null!;

        /// <summary>
        /// Enable auth config provider. Default `true` (bool)
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// Ping entity ID field (string)
        /// </summary>
        [Output("entityIdField")]
        public Output<string?> EntityIdField { get; private set; } = null!;

        /// <summary>
        /// Ping group field (string)
        /// </summary>
        [Output("groupsField")]
        public Output<string> GroupsField { get; private set; } = null!;

        /// <summary>
        /// Ping IDP metadata content (string)
        /// </summary>
        [Output("idpMetadataContent")]
        public Output<string> IdpMetadataContent { get; private set; } = null!;

        /// <summary>
        /// Labels of the resource (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>> Labels { get; private set; } = null!;

        /// <summary>
        /// (Computed) The name of the resource (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Rancher URL. URL scheme needs to be specified, `https://&lt;RANCHER_API_HOST&gt;` (string)
        /// </summary>
        [Output("rancherApiHost")]
        public Output<string> RancherApiHost { get; private set; } = null!;

        /// <summary>
        /// Ping SP cert (string)
        /// </summary>
        [Output("spCert")]
        public Output<string> SpCert { get; private set; } = null!;

        /// <summary>
        /// Ping SP key (string)
        /// </summary>
        [Output("spKey")]
        public Output<string> SpKey { get; private set; } = null!;

        /// <summary>
        /// (Computed) The type of the resource (string)
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// Ping UID field (string)
        /// </summary>
        [Output("uidField")]
        public Output<string> UidField { get; private set; } = null!;

        /// <summary>
        /// Ping user name field (string)
        /// </summary>
        [Output("userNameField")]
        public Output<string> UserNameField { get; private set; } = null!;


        /// <summary>
        /// Create a AuthConfigPing resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AuthConfigPing(string name, AuthConfigPingArgs args, CustomResourceOptions? options = null)
            : base("rancher2:index/authConfigPing:AuthConfigPing", name, args ?? new AuthConfigPingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AuthConfigPing(string name, Input<string> id, AuthConfigPingState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/authConfigPing:AuthConfigPing", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "idpMetadataContent",
                    "spCert",
                    "spKey",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AuthConfigPing resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AuthConfigPing Get(string name, Input<string> id, AuthConfigPingState? state = null, CustomResourceOptions? options = null)
        {
            return new AuthConfigPing(name, id, state, options);
        }
    }

    public sealed class AuthConfigPingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        /// </summary>
        [Input("accessMode")]
        public Input<string>? AccessMode { get; set; }

        [Input("allowedPrincipalIds")]
        private InputList<string>? _allowedPrincipalIds;

        /// <summary>
        /// Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `ping_user://&lt;USER_ID&gt;`  `ping_group://&lt;GROUP_ID&gt;` (list)
        /// </summary>
        public InputList<string> AllowedPrincipalIds
        {
            get => _allowedPrincipalIds ?? (_allowedPrincipalIds = new InputList<string>());
            set => _allowedPrincipalIds = value;
        }

        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Annotations of the resource (map)
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// Ping display name field (string)
        /// </summary>
        [Input("displayNameField", required: true)]
        public Input<string> DisplayNameField { get; set; } = null!;

        /// <summary>
        /// Enable auth config provider. Default `true` (bool)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Ping entity ID field (string)
        /// </summary>
        [Input("entityIdField")]
        public Input<string>? EntityIdField { get; set; }

        /// <summary>
        /// Ping group field (string)
        /// </summary>
        [Input("groupsField", required: true)]
        public Input<string> GroupsField { get; set; } = null!;

        [Input("idpMetadataContent", required: true)]
        private Input<string>? _idpMetadataContent;

        /// <summary>
        /// Ping IDP metadata content (string)
        /// </summary>
        public Input<string>? IdpMetadataContent
        {
            get => _idpMetadataContent;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _idpMetadataContent = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels of the resource (map)
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Rancher URL. URL scheme needs to be specified, `https://&lt;RANCHER_API_HOST&gt;` (string)
        /// </summary>
        [Input("rancherApiHost", required: true)]
        public Input<string> RancherApiHost { get; set; } = null!;

        [Input("spCert", required: true)]
        private Input<string>? _spCert;

        /// <summary>
        /// Ping SP cert (string)
        /// </summary>
        public Input<string>? SpCert
        {
            get => _spCert;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _spCert = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("spKey", required: true)]
        private Input<string>? _spKey;

        /// <summary>
        /// Ping SP key (string)
        /// </summary>
        public Input<string>? SpKey
        {
            get => _spKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _spKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Ping UID field (string)
        /// </summary>
        [Input("uidField", required: true)]
        public Input<string> UidField { get; set; } = null!;

        /// <summary>
        /// Ping user name field (string)
        /// </summary>
        [Input("userNameField", required: true)]
        public Input<string> UserNameField { get; set; } = null!;

        public AuthConfigPingArgs()
        {
        }
        public static new AuthConfigPingArgs Empty => new AuthConfigPingArgs();
    }

    public sealed class AuthConfigPingState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        /// </summary>
        [Input("accessMode")]
        public Input<string>? AccessMode { get; set; }

        [Input("allowedPrincipalIds")]
        private InputList<string>? _allowedPrincipalIds;

        /// <summary>
        /// Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `ping_user://&lt;USER_ID&gt;`  `ping_group://&lt;GROUP_ID&gt;` (list)
        /// </summary>
        public InputList<string> AllowedPrincipalIds
        {
            get => _allowedPrincipalIds ?? (_allowedPrincipalIds = new InputList<string>());
            set => _allowedPrincipalIds = value;
        }

        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Annotations of the resource (map)
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// Ping display name field (string)
        /// </summary>
        [Input("displayNameField")]
        public Input<string>? DisplayNameField { get; set; }

        /// <summary>
        /// Enable auth config provider. Default `true` (bool)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Ping entity ID field (string)
        /// </summary>
        [Input("entityIdField")]
        public Input<string>? EntityIdField { get; set; }

        /// <summary>
        /// Ping group field (string)
        /// </summary>
        [Input("groupsField")]
        public Input<string>? GroupsField { get; set; }

        [Input("idpMetadataContent")]
        private Input<string>? _idpMetadataContent;

        /// <summary>
        /// Ping IDP metadata content (string)
        /// </summary>
        public Input<string>? IdpMetadataContent
        {
            get => _idpMetadataContent;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _idpMetadataContent = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels of the resource (map)
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// (Computed) The name of the resource (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Rancher URL. URL scheme needs to be specified, `https://&lt;RANCHER_API_HOST&gt;` (string)
        /// </summary>
        [Input("rancherApiHost")]
        public Input<string>? RancherApiHost { get; set; }

        [Input("spCert")]
        private Input<string>? _spCert;

        /// <summary>
        /// Ping SP cert (string)
        /// </summary>
        public Input<string>? SpCert
        {
            get => _spCert;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _spCert = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("spKey")]
        private Input<string>? _spKey;

        /// <summary>
        /// Ping SP key (string)
        /// </summary>
        public Input<string>? SpKey
        {
            get => _spKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _spKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// (Computed) The type of the resource (string)
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Ping UID field (string)
        /// </summary>
        [Input("uidField")]
        public Input<string>? UidField { get; set; }

        /// <summary>
        /// Ping user name field (string)
        /// </summary>
        [Input("userNameField")]
        public Input<string>? UserNameField { get; set; }

        public AuthConfigPingState()
        {
        }
        public static new AuthConfigPingState Empty => new AuthConfigPingState();
    }
}
