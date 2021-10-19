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
	"fmt"
	"path/filepath"
	"strings"
	"unicode"

	"github.com/hashicorp/terraform-plugin-sdk/helper/schema"
	"github.com/pulumi/pulumi-rancher2/provider/v3/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shim "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim"
	shimv1 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v1"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
	"github.com/rancher/terraform-provider-rancher2/rancher2"
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
func preConfigureCallback(vars resource.PropertyMap, c shim.ResourceConfig) error {
	return nil
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv1.NewProvider(rancher2.Provider().(*schema.Provider))

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "rancher2",
		Description: "A Pulumi package for creating and managing rancher2 resources.",
		Keywords:    []string{"pulumi", "rancher2"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		Repository:  "https://github.com/pulumi/pulumi-rancher2",
		GitHubOrg:   "rancher",
		Config: map[string]*tfbridge.SchemaInfo{
			"bootstrap": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"RANCHER_BOOTSTRAP"},
					Value:   false,
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
			"rancher2_app":                           {Tok: makeResource(mainMod, "App")},
			"rancher2_auth_config_adfs":              {Tok: makeResource(mainMod, "AuthConfigAdfs")},
			"rancher2_auth_config_azuread":           {Tok: makeResource(mainMod, "AuthConfigAzureAd")},
			"rancher2_auth_config_freeipa":           {Tok: makeResource(mainMod, "AuthConfigFreeIpa")},
			"rancher2_auth_config_github":            {Tok: makeResource(mainMod, "AuthConfigGithub")},
			"rancher2_auth_config_keycloak":          {Tok: makeResource(mainMod, "AuthConfigKeycloak")},
			"rancher2_auth_config_okta":              {Tok: makeResource(mainMod, "AuthConfigOkta")},
			"rancher2_auth_config_openldap":          {Tok: makeResource(mainMod, "AuthConfigOpenLdap")},
			"rancher2_auth_config_ping":              {Tok: makeResource(mainMod, "AuthConfigPing")},
			"rancher2_bootstrap":                     {Tok: makeResource(mainMod, "Bootstrap")},
			"rancher2_catalog":                       {Tok: makeResource(mainMod, "Catalog")},
			"rancher2_certificate":                   {Tok: makeResource(mainMod, "Certificate")},
			"rancher2_cloud_credential":              {Tok: makeResource(mainMod, "CloudCredential")},
			"rancher2_cluster":                       {Tok: makeResource(mainMod, "Cluster")},
			"rancher2_cluster_v2":                    {Tok: makeResource(mainMod, "ClusterV2")},
			"rancher2_cluster_driver":                {Tok: makeResource(mainMod, "ClusterDriver")},
			"rancher2_cluster_logging":               {Tok: makeResource(mainMod, "ClusterLogging")},
			"rancher2_cluster_role_template_binding": {Tok: makeResource(mainMod, "ClusterRoleTemplateBinding")},
			"rancher2_cluster_sync":                  {Tok: makeResource(mainMod, "ClusterSync")},
			"rancher2_cluster_template":              {Tok: makeResource(mainMod, "ClusterTemplate")},
			"rancher2_etcd_backup":                   {Tok: makeResource(mainMod, "EtcdBackup")},
			"rancher2_global_role_binding":           {Tok: makeResource(mainMod, "GlobalRoleBinding")},
			"rancher2_multi_cluster_app":             {Tok: makeResource(mainMod, "MultiClusterApp")},
			"rancher2_namespace":                     {Tok: makeResource(mainMod, "Namespace")},
			"rancher2_node_driver":                   {Tok: makeResource(mainMod, "NodeDriver")},
			"rancher2_node_pool":                     {Tok: makeResource(mainMod, "NodePool")},
			"rancher2_node_template":                 {Tok: makeResource(mainMod, "NodeTemplate")},
			"rancher2_notifier":                      {Tok: makeResource(mainMod, "Notifier")},
			"rancher2_project":                       {Tok: makeResource(mainMod, "Project")},
			"rancher2_project_alert_group":           {Tok: makeResource(mainMod, "ProjectAlertGroup")},
			"rancher2_project_alert_rule":            {Tok: makeResource(mainMod, "ProjectAlertRule")},
			"rancher2_project_logging":               {Tok: makeResource(mainMod, "ProjectLogging")},
			"rancher2_project_role_template_binding": {Tok: makeResource(mainMod, "ProjectRoleTemplateBinding")},
			"rancher2_registry":                      {Tok: makeResource(mainMod, "Registry")},
			"rancher2_secret":                        {Tok: makeResource(mainMod, "Secret")},
			"rancher2_setting":                       {Tok: makeResource(mainMod, "Setting")},
			"rancher2_token": {
				Tok: makeResource(mainMod, "Token"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"token": {
						CSharpName: "TokenName",
					},
				},
			},
			"rancher2_user":                         {Tok: makeResource(mainMod, "User")},
			"rancher2_pod_security_policy_template": {Tok: makeResource(mainMod, "PodSecurityPolicyTemplate")},
			"rancher2_catalog_v2":                   {Tok: makeResource(mainMod, "CatalogV2")},
			"rancher2_app_v2":                       {Tok: makeResource(mainMod, "AppV2")},
			"rancher2_global_dns":                   {Tok: makeResource(mainMod, "GlobalDns")},
			"rancher2_global_dns_provider":          {Tok: makeResource(mainMod, "GlobalDnsProvider")},
			"rancher2_global_role":                  {Tok: makeResource(mainMod, "GlobalRole")},
			"rancher2_feature":                      {Tok: makeResource(mainMod, "Feature")},
			"rancher2_secret_v2":                    {Tok: makeResource(mainMod, "SecretV2")},
			"rancher2_machine_config_v2":            {Tok: makeResource(mainMod, "MachineConfigV2")},
			"rancher2_storage_class_v2":             {Tok: makeResource(mainMod, "StorageClassV2")},
			"rancher2_config_map_v2":                {Tok: makeResource(mainMod, "ConfigMapV2")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"rancher2_app":                           {Tok: makeDataSource(mainMod, "getApp")},
			"rancher2_catalog":                       {Tok: makeDataSource(mainMod, "getCatalog")},
			"rancher2_certificate":                   {Tok: makeDataSource(mainMod, "getCertificate")},
			"rancher2_cloud_credential":              {Tok: makeDataSource(mainMod, "getCloudCredential")},
			"rancher2_cluster":                       {Tok: makeDataSource(mainMod, "getCluster")},
			"rancher2_cluster_alert_group":           {Tok: makeDataSource(mainMod, "getClusterAlertGroup")},
			"rancher2_cluster_alert_rule":            {Tok: makeDataSource(mainMod, "getClusterAlterRule")},
			"rancher2_cluster_driver":                {Tok: makeDataSource(mainMod, "getClusterDriver")},
			"rancher2_cluster_logging":               {Tok: makeDataSource(mainMod, "getClusterLogging")},
			"rancher2_cluster_role_template_binding": {Tok: makeDataSource(mainMod, "getClusterRoleTemplateBinding")},
			"rancher2_cluster_template":              {Tok: makeDataSource(mainMod, "getClusterTemplate")},
			"rancher2_etcd_backup":                   {Tok: makeDataSource(mainMod, "getEtcdBackup")},
			"rancher2_global_role_binding":           {Tok: makeDataSource(mainMod, "getGlobalRoleBinding")},
			"rancher2_multi_cluster_app":             {Tok: makeDataSource(mainMod, "getMultiClusterApp")},
			"rancher2_namespace":                     {Tok: makeDataSource(mainMod, "getNamespace")},
			"rancher2_node_driver":                   {Tok: makeDataSource(mainMod, "getNodeDriver")},
			"rancher2_node_pool":                     {Tok: makeDataSource(mainMod, "getNodePool")},
			"rancher2_node_template":                 {Tok: makeDataSource(mainMod, "getNodeTemplate")},
			"rancher2_notifier":                      {Tok: makeDataSource(mainMod, "getNotifier")},
			"rancher2_project":                       {Tok: makeDataSource(mainMod, "getProject")},
			"rancher2_project_alert_group":           {Tok: makeDataSource(mainMod, "getProjectAlertGroup")},
			"rancher2_project_alert_rule":            {Tok: makeDataSource(mainMod, "getProjectAlertRule")},
			"rancher2_project_logging":               {Tok: makeDataSource(mainMod, "getProjectLogging")},
			"rancher2_project_role_template_binding": {Tok: makeDataSource(mainMod, "getProjectRoleTemplateBinding")},
			"rancher2_registry":                      {Tok: makeDataSource(mainMod, "getRegistry")},
			"rancher2_secret":                        {Tok: makeDataSource(mainMod, "getSecret")},
			"rancher2_setting":                       {Tok: makeDataSource(mainMod, "getSetting")},
			"rancher2_user":                          {Tok: makeDataSource(mainMod, "getUser")},
			"rancher2_pod_security_policy_template":  {Tok: makeDataSource(mainMod, "getPodSecurityPolicyTemplate")},
			"rancher2_cluster_scan":                  {Tok: makeDataSource(mainMod, "getClusterScan")},
			"rancher2_catalog_v2":                    {Tok: makeDataSource(mainMod, "getCatalogV2")},
			"rancher2_global_dns_provider":           {Tok: makeDataSource(mainMod, "getGlobalDnsProvider")},
			"rancher2_global_role":                   {Tok: makeDataSource(mainMod, "getGlobalRole")},
			"rancher2_secret_v2":                     {Tok: makeDataSource(mainMod, "getSecretV2")},
			"rancher2_cluster_v2":                    {Tok: makeDataSource(mainMod, "getClusterV2")},
			"rancher2_storage_class_v2":              {Tok: makeDataSource(mainMod, "getStorageClassV2")},
			"rancher2_config_map_v2":                 {Tok: makeDataSource(mainMod, "getConfigMapV2")},
			"rancher2_principal":                     {Tok: makeDataSource(mainMod, "getPrincipal")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: namespaceMap,
		},
	}

	prov.RenameDataSource("rancher2_role_template", makeDataSource(mainMod, "getRoleTempalte"),
		makeDataSource(mainMod, "getRoleTemplate"), mainMod, mainMod, &tfbridge.DataSourceInfo{
			Docs: &tfbridge.DocInfo{Source: "roleTemplate.html.markdown"},
		})

	prov.RenameResourceWithAlias("rancher2_cluster_alert_group", makeResource(mainMod, "ClusterAlterGroup"),
		makeResource(mainMod, "ClusterAlertGroup"), mainMod, mainMod, &tfbridge.ResourceInfo{
			Docs: &tfbridge.DocInfo{Source: "clusterAlertGroup.html.markdown"},
		})
	prov.RenameResourceWithAlias("rancher2_cluster_alert_rule", makeResource(mainMod, "ClusterAlterRule"),
		makeResource(mainMod, "ClusterAlertRule"), mainMod, mainMod, &tfbridge.ResourceInfo{
			Docs: &tfbridge.DocInfo{Source: "clusterAlertRule.html.markdown"},
		})
	prov.RenameResourceWithAlias("rancher2_role_template", makeResource(mainMod, "RoleTempalte"),
		makeResource(mainMod, "RoleTemplate"), mainMod, mainMod, nil)
	prov.RenameResourceWithAlias("rancher2_auth_config_activedirectory", makeResource(mainMod, "ActiveDirectory"),
		makeResource(mainMod, "AuthConfigActiveDirectory"), mainMod, mainMod, nil)

	prov.SetAutonaming(255, "-")

	return prov
}
