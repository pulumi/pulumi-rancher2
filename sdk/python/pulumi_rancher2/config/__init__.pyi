# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

accessKey: Optional[str]
"""
API Key used to authenticate with the rancher server
"""

apiUrl: Optional[str]
"""
The URL to the rancher API
"""

bootstrap: bool
"""
Bootstrap rancher server
"""

caCerts: Optional[str]
"""
CA certificates used to sign rancher server tls certificates. Mandatory if self signed tls and insecure option false
"""

insecure: bool
"""
Allow insecure connections to Rancher. Mandatory if self signed tls and not ca_certs provided
"""

retries: Optional[int]
"""
Rancher connection retries
"""

secretKey: Optional[str]
"""
API secret used to authenticate with the rancher server
"""

timeout: Optional[str]
"""
Rancher connection timeout (retry every 5s). Golang duration format, ex: "60s"
"""

tokenKey: Optional[str]
"""
API token used to authenticate with the rancher server
"""

