#!/usr/bin/env bash
set -x -ef -o pipefail

# Wait for rancher2 to come up
./testing/wait-for-local-rancher.sh

# install requirements
pip install -r testing/requirements.txt
# this python script returns a token
# we use this python script because it hands retries for us if we get a 5xx response
APIRESPONSE=$(python testing/provision-rancher.py)

export RANCHER_ACCESS_KEY=$(echo $APIRESPONSE |cut -d ':' -f 1)
export RANCHER_SECRET_KEY=$(echo $APIRESPONSE | cut -d ':' -f 2)
echo "::set-env name=RANCHER_ACCESS_KEY::$RANCHER_ACCESS_KEY"
echo "::set-env name=RANCHER_SECRET_KEY::$RANCHER_SECRET_KEY"
