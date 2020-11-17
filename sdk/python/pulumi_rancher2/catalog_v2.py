# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['CatalogV2']


class CatalogV2(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 ca_bundle: Optional[pulumi.Input[str]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 git_branch: Optional[pulumi.Input[str]] = None,
                 git_repo: Optional[pulumi.Input[str]] = None,
                 insecure: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 secret_name: Optional[pulumi.Input[str]] = None,
                 secret_namespace: Optional[pulumi.Input[str]] = None,
                 service_account: Optional[pulumi.Input[str]] = None,
                 service_account_namespace: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Rancher Catalog v2 resource. This can be used to create cluster helm catalogs for Rancher v2 environments and retrieve their information. Catalog v2 resource is available at Rancher v2.5.x and above.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for the catalog v2 (map)
        :param pulumi.Input[str] ca_bundle: PEM encoded CA bundle which will be used to validate the repo's certificate (string)
        :param pulumi.Input[str] cluster_id: The cluster id of the catalog V2 (string)
        :param pulumi.Input[bool] enabled: If disabled the repo clone will not be updated or allowed to be installed from. Default: `true` (bool)
        :param pulumi.Input[str] git_branch: Git Repository branch containing Helm chart definitions. Default `master` (string)
        :param pulumi.Input[str] git_repo: The url of the catalog v2 repo (string)
        :param pulumi.Input[bool] insecure: Use insecure HTTPS to download the repo's index. Default: `false` (bool)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for the catalog v2 (map)
        :param pulumi.Input[str] name: The name of the catalog v2 (string)
        :param pulumi.Input[str] secret_name: K8s secret name to be used to connect to the repo (string)
        :param pulumi.Input[str] secret_namespace: K8s secret namespace (string)
        :param pulumi.Input[str] service_account: K8s service account used to deploy charts instead of the end users credentials (string)
        :param pulumi.Input[str] service_account_namespace: The username to access the catalog if needed (string)
        :param pulumi.Input[str] url: URL to an index generated by Helm (string)
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['annotations'] = annotations
            __props__['ca_bundle'] = ca_bundle
            if cluster_id is None:
                raise TypeError("Missing required property 'cluster_id'")
            __props__['cluster_id'] = cluster_id
            __props__['enabled'] = enabled
            __props__['git_branch'] = git_branch
            __props__['git_repo'] = git_repo
            __props__['insecure'] = insecure
            __props__['labels'] = labels
            __props__['name'] = name
            __props__['secret_name'] = secret_name
            __props__['secret_namespace'] = secret_namespace
            __props__['service_account'] = service_account
            __props__['service_account_namespace'] = service_account_namespace
            __props__['url'] = url
            __props__['resource_version'] = None
        super(CatalogV2, __self__).__init__(
            'rancher2:index/catalogV2:CatalogV2',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            ca_bundle: Optional[pulumi.Input[str]] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            git_branch: Optional[pulumi.Input[str]] = None,
            git_repo: Optional[pulumi.Input[str]] = None,
            insecure: Optional[pulumi.Input[bool]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            resource_version: Optional[pulumi.Input[str]] = None,
            secret_name: Optional[pulumi.Input[str]] = None,
            secret_namespace: Optional[pulumi.Input[str]] = None,
            service_account: Optional[pulumi.Input[str]] = None,
            service_account_namespace: Optional[pulumi.Input[str]] = None,
            url: Optional[pulumi.Input[str]] = None) -> 'CatalogV2':
        """
        Get an existing CatalogV2 resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for the catalog v2 (map)
        :param pulumi.Input[str] ca_bundle: PEM encoded CA bundle which will be used to validate the repo's certificate (string)
        :param pulumi.Input[str] cluster_id: The cluster id of the catalog V2 (string)
        :param pulumi.Input[bool] enabled: If disabled the repo clone will not be updated or allowed to be installed from. Default: `true` (bool)
        :param pulumi.Input[str] git_branch: Git Repository branch containing Helm chart definitions. Default `master` (string)
        :param pulumi.Input[str] git_repo: The url of the catalog v2 repo (string)
        :param pulumi.Input[bool] insecure: Use insecure HTTPS to download the repo's index. Default: `false` (bool)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for the catalog v2 (map)
        :param pulumi.Input[str] name: The name of the catalog v2 (string)
        :param pulumi.Input[str] resource_version: (Computed) The k8s resource version (string)
        :param pulumi.Input[str] secret_name: K8s secret name to be used to connect to the repo (string)
        :param pulumi.Input[str] secret_namespace: K8s secret namespace (string)
        :param pulumi.Input[str] service_account: K8s service account used to deploy charts instead of the end users credentials (string)
        :param pulumi.Input[str] service_account_namespace: The username to access the catalog if needed (string)
        :param pulumi.Input[str] url: URL to an index generated by Helm (string)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["annotations"] = annotations
        __props__["ca_bundle"] = ca_bundle
        __props__["cluster_id"] = cluster_id
        __props__["enabled"] = enabled
        __props__["git_branch"] = git_branch
        __props__["git_repo"] = git_repo
        __props__["insecure"] = insecure
        __props__["labels"] = labels
        __props__["name"] = name
        __props__["resource_version"] = resource_version
        __props__["secret_name"] = secret_name
        __props__["secret_namespace"] = secret_namespace
        __props__["service_account"] = service_account
        __props__["service_account_namespace"] = service_account_namespace
        __props__["url"] = url
        return CatalogV2(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Annotations for the catalog v2 (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="caBundle")
    def ca_bundle(self) -> pulumi.Output[Optional[str]]:
        """
        PEM encoded CA bundle which will be used to validate the repo's certificate (string)
        """
        return pulumi.get(self, "ca_bundle")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[str]:
        """
        The cluster id of the catalog V2 (string)
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        If disabled the repo clone will not be updated or allowed to be installed from. Default: `true` (bool)
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="gitBranch")
    def git_branch(self) -> pulumi.Output[Optional[str]]:
        """
        Git Repository branch containing Helm chart definitions. Default `master` (string)
        """
        return pulumi.get(self, "git_branch")

    @property
    @pulumi.getter(name="gitRepo")
    def git_repo(self) -> pulumi.Output[Optional[str]]:
        """
        The url of the catalog v2 repo (string)
        """
        return pulumi.get(self, "git_repo")

    @property
    @pulumi.getter
    def insecure(self) -> pulumi.Output[Optional[bool]]:
        """
        Use insecure HTTPS to download the repo's index. Default: `false` (bool)
        """
        return pulumi.get(self, "insecure")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Labels for the catalog v2 (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the catalog v2 (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="resourceVersion")
    def resource_version(self) -> pulumi.Output[str]:
        """
        (Computed) The k8s resource version (string)
        """
        return pulumi.get(self, "resource_version")

    @property
    @pulumi.getter(name="secretName")
    def secret_name(self) -> pulumi.Output[Optional[str]]:
        """
        K8s secret name to be used to connect to the repo (string)
        """
        return pulumi.get(self, "secret_name")

    @property
    @pulumi.getter(name="secretNamespace")
    def secret_namespace(self) -> pulumi.Output[Optional[str]]:
        """
        K8s secret namespace (string)
        """
        return pulumi.get(self, "secret_namespace")

    @property
    @pulumi.getter(name="serviceAccount")
    def service_account(self) -> pulumi.Output[Optional[str]]:
        """
        K8s service account used to deploy charts instead of the end users credentials (string)
        """
        return pulumi.get(self, "service_account")

    @property
    @pulumi.getter(name="serviceAccountNamespace")
    def service_account_namespace(self) -> pulumi.Output[Optional[str]]:
        """
        The username to access the catalog if needed (string)
        """
        return pulumi.get(self, "service_account_namespace")

    @property
    @pulumi.getter
    def url(self) -> pulumi.Output[Optional[str]]:
        """
        URL to an index generated by Helm (string)
        """
        return pulumi.get(self, "url")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
