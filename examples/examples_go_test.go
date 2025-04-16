// Copyright 2016-2020, Pulumi Corporation.  All rights reserved.
//go:build go || all
// +build go all

package examples

import (
	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func getGoBaseOptions() integration.ProgramTestOptions {
	base := getBaseOptions()
	goBase := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"github.com/pulumi/pulumi-rancher2/sdk/v9",
		},
	})

	return goBase
}
