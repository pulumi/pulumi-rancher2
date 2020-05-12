// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package rancher2

import (
	"strings"
	"unicode"

	"github.com/hashicorp/terraform-plugin-sdk/helper/schema"
	"github.com/hashicorp/terraform-plugin-sdk/terraform"
	"github.com/pulumi/pulumi-terraform-bridge/v2/pkg/tfbridge"
	"github.com/pulumi/pulumi/sdk/v2/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v2/go/common/tokens"
	"github.com/terraform-providers/terraform-provider-rancher2/rancher2"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "rancher2"
	// modules:
	mainMod = "index" // the Main module
)

var namespaceMap = map[string]string{
	mainPkg: "Rancher2",
}

func makeMember(moduleTitle string, mem string) tokens.ModuleMember {
	moduleName := strings.ToLower(moduleTitle)
	namespaceMap[moduleName] = moduleTitle
	fn := string(unicode.ToLower(rune(mem[0]))) + mem[1:]
	token := moduleName + "/" + fn
	return tokens.ModuleMember(mainPkg + ":" + token + ":" + mem)
}

func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

func makeDataSource(mod string, res string) tokens.ModuleMember {
	return makeMember(mod, res)
}

func makeResource(mod string, res string) tokens.Type {
	return makeType(mod, res)
}

// preConfigureCallback is called before the providerConfigure function of the underlying provider.
// It should validate that the provider can be configured, and provide actionable errors in the case
// it cannot be. Configuration variables can be read from `vars` using the `stringValue` function -
// for example `stringValue(vars, "accessKey")`.
func preConfigureCallback(vars resource.PropertyMap, c *terraform.ResourceConfig) error {
	return nil
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := rancher2.Provider().(*schema.Provider)

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "rancher2",
		Description: "A Pulumi package for creating and managing rancher2 resources.",
		Keywords:    []string{"pulumi", "rancher2"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		Repository:  "https://github.com/pulumi/pulumi-rancher2",
		Config: map[string]*tfbridge.SchemaInfo{
			"api_url": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"RANCHER_URL"},
				},
			},
			"access_key": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"RANCHER_ACCESS_KEY"},
				},
			},
			"bootstrap": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"RANCHER_BOOTSTRAP"},
					Value:   false,
				},
			},
			"secret_key": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"RANCHER_SECRET_KEY"},
				},
			},
			"token_key": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"RANCHER_TOKEN_KEY"},
				},
			},
			"ca_certs": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"RANCHER_CA_CERTS"},
				},
			},
			"insecure": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"RANCHER_INSECURE"},
					Value:   false,
				},
			},
		},
		PreConfigureCallback: preConfigureCallback,
		Resources: map[string]*tfbridge.ResourceInfo{
			"rancher2_app": {Tok: makeResource(mainMod, "App")},
			"rancher2_auth_config_activedirectory": {
				Tok:  makeResource(mainMod, "ActiveDirectory"),
				Docs: &tfbridge.DocInfo{Source: "authConfigActiveDirectory.html.markdown"},
			},
			"rancher2_auth_config_adfs": {
				Tok:  makeResource(mainMod, "AuthConfigAdfs"),
				Docs: &tfbridge.DocInfo{Source: "authConfigADFS.html.markdown"},
			},
			"rancher2_auth_config_azuread": {
				Tok:  makeResource(mainMod, "AuthConfigAzureAd"),
				Docs: &tfbridge.DocInfo{Source: "authConfigAzureAD.html.markdown"},
			},
			"rancher2_auth_config_freeipa": {
				Tok:  makeResource(mainMod, "AuthConfigFreeIpa"),
				Docs: &tfbridge.DocInfo{Source: "authConfigFreeIpa.html.markdown"},
			},
			"rancher2_auth_config_github": {
				Tok:  makeResource(mainMod, "AuthConfigGithub"),
				Docs: &tfbridge.DocInfo{Source: "authConfigGithub.html.markdown"},
			},
			"rancher2_auth_config_keycloak": {
				Tok:  makeResource(mainMod, "AuthConfigKeycloak"),
				Docs: &tfbridge.DocInfo{Source: "authConfigKeyCloak.html.markdown"},
			},
			"rancher2_auth_config_okta": {
				Tok:  makeResource(mainMod, "AuthConfigOkta"),
				Docs: &tfbridge.DocInfo{Source: "authConfigOKTA.html.markdown"},
			},
			"rancher2_auth_config_openldap": {
				Tok:  makeResource(mainMod, "AuthConfigOpenLdap"),
				Docs: &tfbridge.DocInfo{Source: "authConfigOpenLdap.html.markdown"},
			},
			"rancher2_auth_config_ping": {
				Tok:  makeResource(mainMod, "AuthConfigPing"),
				Docs: &tfbridge.DocInfo{Source: "authConfigPing.html.markdown"},
			},
			"rancher2_bootstrap":   {Tok: makeResource(mainMod, "Bootstrap")},
			"rancher2_catalog":     {Tok: makeResource(mainMod, "Catalog")},
			"rancher2_certificate": {Tok: makeResource(mainMod, "Certificate")},
			"rancher2_cloud_credential": {
				Tok:  makeResource(mainMod, "CloudCredential"),
				Docs: &tfbridge.DocInfo{Source: "cloudCredential.html.markdown"},
			},
			"rancher2_cluster": {Tok: makeResource(mainMod, "Cluster")},
			"rancher2_cluster_alert_group": {
				Tok:  makeResource(mainMod, "ClusterAlterGroup"),
				Docs: &tfbridge.DocInfo{Source: "clusterAlertGroup.html.markdown"},
			},
			"rancher2_cluster_alert_rule": {
				Tok:  makeResource(mainMod, "ClusterAlterRule"),
				Docs: &tfbridge.DocInfo{Source: "clusterAlertRule.html.markdown"},
			},
			"rancher2_cluster_driver": {
				Tok:  makeResource(mainMod, "ClusterDriver"),
				Docs: &tfbridge.DocInfo{Source: "clusterDriver.html.markdown"},
			},
			"rancher2_cluster_logging": {
				Tok:  makeResource(mainMod, "ClusterLogging"),
				Docs: &tfbridge.DocInfo{Source: "clusterLogging.html.markdown"},
			},
			"rancher2_cluster_role_template_binding": {
				Tok:  makeResource(mainMod, "ClusterRoleTemplateBinding"),
				Docs: &tfbridge.DocInfo{Source: "clusterRole.html.markdown"},
			},
			"rancher2_cluster_sync": {
				Tok:  makeResource(mainMod, "ClusterSync"),
				Docs: &tfbridge.DocInfo{Source: "clusterSync.html.markdown"},
			},
			"rancher2_cluster_template": {
				Tok:  makeResource(mainMod, "ClusterTemplate"),
				Docs: &tfbridge.DocInfo{Source: "clusterTemplate.html.markdown"},
			},
			"rancher2_etcd_backup": {
				Tok:  makeResource(mainMod, "EtcdBackup"),
				Docs: &tfbridge.DocInfo{Source: "etcdBackup.html.markdown"},
			},
			"rancher2_global_role_binding": {
				Tok:  makeResource(mainMod, "GlobalRoleBinding"),
				Docs: &tfbridge.DocInfo{Source: "globalRole.html.markdown"},
			},
			"rancher2_multi_cluster_app": {
				Tok:  makeResource(mainMod, "MultiClusterApp"),
				Docs: &tfbridge.DocInfo{Source: "multiClusterApp.html.markdown"},
			},
			"rancher2_namespace": {Tok: makeResource(mainMod, "Namespace")},
			"rancher2_node_driver": {
				Tok:  makeResource(mainMod, "NodeDriver"),
				Docs: &tfbridge.DocInfo{Source: "nodeDriver.html.markdown"},
			},
			"rancher2_node_pool": {
				Tok:  makeResource(mainMod, "NodePool"),
				Docs: &tfbridge.DocInfo{Source: "nodePool.html.markdown"},
			},
			"rancher2_node_template": {
				Tok:  makeResource(mainMod, "NodeTemplate"),
				Docs: &tfbridge.DocInfo{Source: "nodeTemplate.html.markdown"},
			},
			"rancher2_notifier": {Tok: makeResource(mainMod, "Notifier")},
			"rancher2_project":  {Tok: makeResource(mainMod, "Project")},
			"rancher2_project_alert_group": {
				Tok:  makeResource(mainMod, "ProjectAlertGroup"),
				Docs: &tfbridge.DocInfo{Source: "projectAlertGroup.html.markdown"},
			},
			"rancher2_project_alert_rule": {
				Tok:  makeResource(mainMod, "ProjectAlertRule"),
				Docs: &tfbridge.DocInfo{Source: "projectAlertRule.html.markdown"},
			},
			"rancher2_project_logging": {
				Tok:  makeResource(mainMod, "ProjectLogging"),
				Docs: &tfbridge.DocInfo{Source: "projectLogging.html.markdown"},
			},
			"rancher2_project_role_template_binding": {
				Tok:  makeResource(mainMod, "ProjectRoleTemplateBinding"),
				Docs: &tfbridge.DocInfo{Source: "projectRole.html.markdown"},
			},
			"rancher2_registry": {Tok: makeResource(mainMod, "Registry")},
			"rancher2_role_template": {
				Tok:  makeResource(mainMod, "RoleTempalte"),
				Docs: &tfbridge.DocInfo{Source: "roleTemplate.html.markdown"},
			},
			"rancher2_secret":  {Tok: makeResource(mainMod, "Secret")},
			"rancher2_setting": {Tok: makeResource(mainMod, "Setting")},
			"rancher2_token": {
				Tok: makeResource(mainMod, "Token"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"token": {
						CSharpName: "TokenName",
					},
				},
			},
			"rancher2_user": {Tok: makeResource(mainMod, "User")},
			"rancher2_pod_security_policy_template": {
				Tok:  makeResource(mainMod, "PodSecurityPolicyTemplate"),
				Docs: &tfbridge.DocInfo{Source: "podSecurityPolicyTemplate.html.markdown"},
			},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"rancher2_app":         {Tok: makeDataSource(mainMod, "getApp")},
			"rancher2_catalog":     {Tok: makeDataSource(mainMod, "getCatalog")},
			"rancher2_certificate": {Tok: makeDataSource(mainMod, "getCertificate")},
			"rancher2_cloud_credential": {
				Tok:  makeDataSource(mainMod, "getCloudCredential"),
				Docs: &tfbridge.DocInfo{Source: "cloudCredential.html.markdown"},
			},
			"rancher2_cluster": {Tok: makeDataSource(mainMod, "getCluster")},
			"rancher2_cluster_alert_group": {
				Tok:  makeDataSource(mainMod, "getClusterAlertGroup"),
				Docs: &tfbridge.DocInfo{Source: "clusterAlertGroup.html.markdown"},
			},
			"rancher2_cluster_alert_rule": {
				Tok:  makeDataSource(mainMod, "getClusterAlterRule"),
				Docs: &tfbridge.DocInfo{Source: "clusterAlertRule.html.markdown"},
			},
			"rancher2_cluster_driver": {
				Tok:  makeDataSource(mainMod, "getClusterDriver"),
				Docs: &tfbridge.DocInfo{Source: "clusterDriver.html.markdown"},
			},
			"rancher2_cluster_logging": {
				Tok:  makeDataSource(mainMod, "getClusterLogging"),
				Docs: &tfbridge.DocInfo{Source: "clusterLogging.html.markdown"},
			},
			"rancher2_cluster_role_template_binding": {
				Tok:  makeDataSource(mainMod, "getClusterRoleTemplateBinding"),
				Docs: &tfbridge.DocInfo{Source: "clusterRole.html.markdown"},
			},
			"rancher2_cluster_template": {
				Tok:  makeDataSource(mainMod, "getClusterTemplate"),
				Docs: &tfbridge.DocInfo{Source: "clusterTemplate.html.markdown"},
			},
			"rancher2_etcd_backup": {
				Tok:  makeDataSource(mainMod, "getEtcdBackup"),
				Docs: &tfbridge.DocInfo{Source: "etcdBackup.html.markdown"},
			},
			"rancher2_global_role_binding": {
				Tok:  makeDataSource(mainMod, "getGlobalRoleBinding"),
				Docs: &tfbridge.DocInfo{Source: "globalRole.html.markdown"},
			},
			"rancher2_multi_cluster_app": {
				Tok:  makeDataSource(mainMod, "getMultiClusterApp"),
				Docs: &tfbridge.DocInfo{Source: "multiClusterApp.html.markdown"},
			},
			"rancher2_namespace": {Tok: makeDataSource(mainMod, "getNamespace")},
			"rancher2_node_driver": {
				Tok:  makeDataSource(mainMod, "getNodeDriver"),
				Docs: &tfbridge.DocInfo{Source: "nodeDriver.html.markdown"},
			},
			"rancher2_node_pool": {
				Tok:  makeDataSource(mainMod, "getNodePool"),
				Docs: &tfbridge.DocInfo{Source: "nodePool.html.markdown"},
			},
			"rancher2_node_template": {
				Tok:  makeDataSource(mainMod, "getNodeTemplate"),
				Docs: &tfbridge.DocInfo{Source: "nodeTemplate.html.markdown"},
			},
			"rancher2_notifier": {Tok: makeDataSource(mainMod, "getNotifier")},
			"rancher2_project":  {Tok: makeDataSource(mainMod, "getProject")},
			"rancher2_project_alert_group": {
				Tok:  makeDataSource(mainMod, "getProjectAlertGroup"),
				Docs: &tfbridge.DocInfo{Source: "projectAlertGroup.html.markdown"},
			},
			"rancher2_project_alert_rule": {
				Tok:  makeDataSource(mainMod, "getProjectAlertRule"),
				Docs: &tfbridge.DocInfo{Source: "projectAlertRule.html.markdown"},
			},
			"rancher2_project_logging": {
				Tok:  makeDataSource(mainMod, "getProjectLogging"),
				Docs: &tfbridge.DocInfo{Source: "projectLogging.html.markdown"},
			},
			"rancher2_project_role_template_binding": {
				Tok:  makeDataSource(mainMod, "getProjectRoleTemplateBinding"),
				Docs: &tfbridge.DocInfo{Source: "projectRole.html.markdown"},
			},
			"rancher2_registry": {Tok: makeDataSource(mainMod, "getRegistry")},
			"rancher2_secret":   {Tok: makeDataSource(mainMod, "getSecret")},
			"rancher2_setting":  {Tok: makeDataSource(mainMod, "getSetting")},
			"rancher2_user":     {Tok: makeDataSource(mainMod, "getUser")},
			"rancher2_pod_security_policy_template": {
				Tok:  makeDataSource(mainMod, "getPodSecurityPolicyTemplate"),
				Docs: &tfbridge.DocInfo{Source: "podSecurityPolicyTemplate.html.markdown"},
			},
			"rancher2_cluster_scan": {Tok: makeDataSource(mainMod, "getClusterScan")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^2.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^8.0.25", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			// List any Python dependencies and their version ranges
			Requires: map[string]string{
				"pulumi": ">=2.0.0,<3.0.0",
			},
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi":                       "2.*",
				"System.Collections.Immutable": "1.6.0",
			},
			Namespaces: namespaceMap,
		},
	}

	prov.RenameDataSource("rancher2_role_template", makeDataSource(mainMod, "getRoleTempalte"),
		makeDataSource(mainMod, "getRoleTemplate"), mainMod, mainMod, &tfbridge.DataSourceInfo{
			Docs: &tfbridge.DocInfo{Source: "roleTemplate.html.markdown"},
		})

	// For all resources with name properties, we will add an auto-name property.  Make sure to skip those that
	// already have a name mapping entry, since those may have custom overrides set above (e.g., for length).
	const nameProperty = "name"
	for resname, res := range prov.Resources {
		if schema := p.ResourcesMap[resname]; schema != nil {
			// Only apply auto-name to input properties (Optional || Required) named `name`
			if tfs, has := schema.Schema[nameProperty]; has && (tfs.Optional || tfs.Required) {
				if _, hasfield := res.Fields[nameProperty]; !hasfield {
					if res.Fields == nil {
						res.Fields = make(map[string]*tfbridge.SchemaInfo)
					}
					res.Fields[nameProperty] = tfbridge.AutoName(nameProperty, 255)
				}
			}
		}
	}

	return prov
}
