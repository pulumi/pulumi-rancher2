#!/usr/bin/env bash
set -x -ef -o pipefail

# Wait for rancher2 to come up
./testing/wait-for-local-rancher.sh

# install requirements
pip install -r testing/requirements.txt
# this python script sets environment variables
# we use this python script because it hands retries for us if we get a 5xx response
python testing/provision-rancher.py

# set the env vars to be used across the GitHub jobs
echo "::set-env name=RANCHER_ACCESS_KEY::$RANCHER_ACCESS_KEY"
echo "::set-env name=RANCHER_SECRET_KEY::$RANCHER_SECRET_KEY"
