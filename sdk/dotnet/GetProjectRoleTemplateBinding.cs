// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    public static class GetProjectRoleTemplateBinding
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 project role template binding.
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
        ///     var foo = Rancher2.GetProjectRoleTemplateBinding.Invoke(new()
        ///     {
        ///         Name = "foo",
        ///         ProjectId = "foo_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetProjectRoleTemplateBindingResult> InvokeAsync(GetProjectRoleTemplateBindingArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetProjectRoleTemplateBindingResult>("rancher2:index/getProjectRoleTemplateBinding:getProjectRoleTemplateBinding", args ?? new GetProjectRoleTemplateBindingArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 project role template binding.
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
        ///     var foo = Rancher2.GetProjectRoleTemplateBinding.Invoke(new()
        ///     {
        ///         Name = "foo",
        ///         ProjectId = "foo_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetProjectRoleTemplateBindingResult> Invoke(GetProjectRoleTemplateBindingInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetProjectRoleTemplateBindingResult>("rancher2:index/getProjectRoleTemplateBinding:getProjectRoleTemplateBinding", args ?? new GetProjectRoleTemplateBindingInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 project role template binding.
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
        ///     var foo = Rancher2.GetProjectRoleTemplateBinding.Invoke(new()
        ///     {
        ///         Name = "foo",
        ///         ProjectId = "foo_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetProjectRoleTemplateBindingResult> Invoke(GetProjectRoleTemplateBindingInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetProjectRoleTemplateBindingResult>("rancher2:index/getProjectRoleTemplateBinding:getProjectRoleTemplateBinding", args ?? new GetProjectRoleTemplateBindingInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetProjectRoleTemplateBindingArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the project role template binding (string)
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The project id where bind project role template (string)
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        /// <summary>
        /// The role template id from create project role template binding (string)
        /// </summary>
        [Input("roleTemplateId")]
        public string? RoleTemplateId { get; set; }

        public GetProjectRoleTemplateBindingArgs()
        {
        }
        public static new GetProjectRoleTemplateBindingArgs Empty => new GetProjectRoleTemplateBindingArgs();
    }

    public sealed class GetProjectRoleTemplateBindingInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the project role template binding (string)
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The project id where bind project role template (string)
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// The role template id from create project role template binding (string)
        /// </summary>
        [Input("roleTemplateId")]
        public Input<string>? RoleTemplateId { get; set; }

        public GetProjectRoleTemplateBindingInvokeArgs()
        {
        }
        public static new GetProjectRoleTemplateBindingInvokeArgs Empty => new GetProjectRoleTemplateBindingInvokeArgs();
    }


    [OutputType]
    public sealed class GetProjectRoleTemplateBindingResult
    {
        /// <summary>
        /// (Computed) Annotations of the resource (map)
        /// </summary>
        public readonly ImmutableDictionary<string, string> Annotations;
        /// <summary>
        /// (Computed) The group ID to assign project role template binding (string)
        /// </summary>
        public readonly string GroupId;
        /// <summary>
        /// (Computed) The group_principal ID to assign project role template binding (string)
        /// </summary>
        public readonly string GroupPrincipalId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Computed) Labels of the resource (map)
        /// </summary>
        public readonly ImmutableDictionary<string, string> Labels;
        public readonly string Name;
        public readonly string ProjectId;
        public readonly string RoleTemplateId;
        /// <summary>
        /// (Computed) The user ID to assign project role template binding (string)
        /// </summary>
        public readonly string UserId;
        /// <summary>
        /// (Computed) The user_principal ID to assign project role template binding (string)
        /// </summary>
        public readonly string UserPrincipalId;

        [OutputConstructor]
        private GetProjectRoleTemplateBindingResult(
            ImmutableDictionary<string, string> annotations,

            string groupId,

            string groupPrincipalId,

            string id,

            ImmutableDictionary<string, string> labels,

            string name,

            string projectId,

            string roleTemplateId,

            string userId,

            string userPrincipalId)
        {
            Annotations = annotations;
            GroupId = groupId;
            GroupPrincipalId = groupPrincipalId;
            Id = id;
            Labels = labels;
            Name = name;
            ProjectId = projectId;
            RoleTemplateId = roleTemplateId;
            UserId = userId;
            UserPrincipalId = userPrincipalId;
        }
    }
}
