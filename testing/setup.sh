#!/usr/bin/env bash

# Wait for rancher2 to come up
./testing/wait-for-local-rancher.sh

# Login
LOGINRESPONSE=$(curl -s "${RANCHER_URL}/v3-public/localProviders/local?action=login" -H "content-type: application/json" --data-binary '{"username":"admin","password":"admin"}' --insecure)
LOGINTOKEN=`echo $LOGINRESPONSE | jq -r .token`

# Create API key
APIRESPONSE=$(curl -s "${RANCHER_URL}/v3/token" -H "content-type: application/json" -H "Authorization: Bearer $LOGINTOKEN" --data-binary '{"type":"token","description":"automation"}' --insecure)
# Extract and store token
export RANCHER_ACCESS_KEY=$(echo $APIRESPONSE | jq -r .token | cut -d ':' -f 1)
export RANCHER_SECRET_KEY=$(echo $APIRESPONSE | jq -r .token | cut -d ':' -f 2)
echo "::set-env name=RANCHER_ACCESS_KEY::$RANCHER_ACCESS_KEY"
echo "::set-env name=RANCHER_SECRET_KEY::$RANCHER_SECRET_KEY"
