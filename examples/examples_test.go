package examples

import (
	"os"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

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

func skipIfNoPulumiAccessToken(t *testing.T) {
	_, ok := os.LookupEnv("PULUMI_ACCESS_TOKEN")
	if !ok {
		t.Skipf("Skipping: PULUMI_ACCESS_TOKEN is not set")
	}
}
