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
	"path"

	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"

	"github.com/hashicorp/terraform-plugin-sdk/helper/schema"
	"github.com/rancher/terraform-provider-rancher2/rancher2"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tks "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shimv1 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v1"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"

	"github.com/pulumi/pulumi-rancher2/provider/v11/pkg/version"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "rancher2"
	// modules:
	mainMod = "index" // the Main module
)

func makeResource(res string) tokens.Type {
	return tfbridge.MakeResource(mainPkg, mainMod, res)
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv1.NewProvider(rancher2.Provider().(*schema.Provider))

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:            p,
		Name:         "rancher2",
		Description:  "A Pulumi package for creating and managing rancher2 resources.",
		Keywords:     []string{"pulumi", "rancher2"},
		License:      "Apache-2.0",
		Homepage:     "https://pulumi.io",
		Repository:   "https://github.com/pulumi/pulumi-rancher2",
		GitHubOrg:    "rancher",
		Version:      version.Version,
		MetadataInfo: tfbridge.NewProviderMetadata(metadata),
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
		Resources: map[string]*tfbridge.ResourceInfo{
			"rancher2_auth_config_azuread":  {Tok: makeResource("AuthConfigAzureAd")},
			"rancher2_auth_config_freeipa":  {Tok: makeResource("AuthConfigFreeIpa")},
			"rancher2_auth_config_openldap": {Tok: makeResource("AuthConfigOpenLdap")},
			"rancher2_token": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"token": {
						CSharpName: "TokenName",
					},
				},
			},

			// Override capitalization for backwards compatibility.
			"rancher2_auth_config_activedirectory": {Tok: makeResource("AuthConfigActiveDirectory")},

			"rancher2_pod_security_admission_configuration_template": {
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"rancher2_pod_security_admission_configuration_template": {
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions

			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			RespectSchemaVersion: true,
		},
		Python: &tfbridge.PythonInfo{
			RespectSchemaVersion: true,

			PyProject: struct{ Enabled bool }{true},
		},

		Golang: &tfbridge.GolangInfo{
			ImportBasePath: path.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		},
	}

	prov.MustComputeTokens(tks.SingleModule("rancher2_", mainMod, tks.MakeStandard(mainPkg)))
	prov.MustApplyAutoAliases()
	prov.SetAutonaming(255, "-")

	return prov
}

//go:embed cmd/pulumi-resource-rancher2/bridge-metadata.json
var metadata []byte
