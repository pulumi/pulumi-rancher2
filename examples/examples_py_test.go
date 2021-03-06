// Copyright 2016-2020, Pulumi Corporation.  All rights reserved.
// +build python all

package examples

import (
	"path"
	"path/filepath"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func TestAccUserPython(t *testing.T) {
	skipIfNoPulumiAccessToken(t)
	test := getPythonBaseOptions().
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "user", "python"),
		})

	integration.ProgramTest(t, &test)
}

func getPythonBaseOptions() integration.ProgramTestOptions {
	base := getBaseOptions()
	basePython := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			filepath.Join("..", "sdk", "python", "bin"),
		},
	})

	return basePython
}
