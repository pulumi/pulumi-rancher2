// Copyright 2016-2020, Pulumi Corporation.  All rights reserved.
// +build dotnet all

package examples

import (
	"path"
	"testing"

	"github.com/pulumi/pulumi/pkg/v2/testing/integration"
)

func TestAccUserCsharp(t *testing.T) {
	skipIfNoPulumiAccessToken(t)
	test := getCSBaseOptions().
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "user", "csharp"),
		})

	integration.ProgramTest(t, &test)
}

func getCSBaseOptions() integration.ProgramTestOptions {
	base := getBaseOptions()
	csharpBase := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"Pulumi.Rancher2",
		},
	})

	return csharpBase
}
