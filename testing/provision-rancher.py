#!/usr/bin/env python
import requests
import os
import urllib3
import logging
import retry_requests
from http.client import HTTPConnection  # py3
import configargparse


def debug():
    log = logging.getLogger('urllib3')
    log.setLevel(logging.DEBUG)
    # logging from urllib3 to console
    ch = logging.StreamHandler()
    ch.setLevel(logging.DEBUG)
    log.addHandler(ch)
    # print statements from `http.client.HTTPConnection` to console/stdout
    HTTPConnection.debuglevel = 1


def main():
    # set up some arguments
    parser = configargparse.ArgumentParser(description='rancher2-provisioner')
    parser.add_argument('--url', env_var='RANCHER_URL', required=True)
    parser.add_argument('--retries', env_var='RANCHER_PROVISION_RETRIES', default=100)
    parser.add_argument('--backoff', env_var='RANCHER_PROVISION_BACKOFF', default=10)
    parser.add_argument('--debug', env_var='RANCHER_PROVISION_DEBUG', action='store_true')
    args = parser.parse_args()

    urllib3.disable_warnings(urllib3.exceptions.InsecureRequestWarning)
    http = retry_requests.retry(requests.Session(), retries=args.retries, backoff_factor=args.backoff)

    if args.debug:
        debug()
        print(parser.format_values())
    # get a token
    login_uri = f"{args.url}/v3-public/localProviders/local?action=login"
    r = http.post(url=login_uri,
                  json={"username": "admin", "password": "admin"},
                  headers={'Content-Type': 'application/json'},
                  verify=False)
    token = r.json()['token'].split(':')
    if args.debug:
        print(token)
    os.environ['RANCHER_ACCESS_KEY'] = token[0]
    os.environ['RANCHER_SECRET_KEY'] = token[1]



if __name__ == '__main__':
    main()
