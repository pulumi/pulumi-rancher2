// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

package examples

import (
	"os"
	"path"
	"path/filepath"
	"testing"

	"github.com/pulumi/pulumi/pkg/testing/integration"
)

func TestAccUserTs(t *testing.T) {
	test := getJSBaseOptions().
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "user", "ts"),
		})

	integration.ProgramTest(t, &test)
}

func TestAccUserPython(t *testing.T) {
	test := getPythonBaseOptions().
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "user", "python"),
		})

	integration.ProgramTest(t, &test)
}

func TestAccUserCsharp(t *testing.T) {
	test := getCSBaseOptions().
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "user", "csharp"),
		})

	integration.ProgramTest(t, &test)
}

func getCwd(t *testing.T) string {
	cwd, err := os.Getwd()
	if err != nil {
		t.FailNow()
	}

	return cwd
}

func getBaseOptions() integration.ProgramTestOptions {
	return integration.ProgramTestOptions{}
}

func getJSBaseOptions() integration.ProgramTestOptions {
	base := getBaseOptions()
	baseJS := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"@pulumi/rancher2",
		},
	})

	return baseJS
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

func getPythonBaseOptions() integration.ProgramTestOptions {
	base := getBaseOptions()
	basePython := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			filepath.Join("..", "sdk", "python", "bin"),
		},
	})

	return basePython
}
