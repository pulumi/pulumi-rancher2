CHANGELOG
=========

## HEAD (Unreleased)
* Upgrade to v1.13.0 of the Rancher2 Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.23.0

---

## 2.9.1 (2021-03-23)
* Upgrade to pulumi-terraform-bridge v2.22.1  
  **Please Note:** This includes a bug fix to the refresh operation regarding arrays

## 2.9.0 (2021-03-16)
* Upgrade to pulumi-terraform-bridge v2.21.0
* Release macOS arm64 binary

## 2.8.0 (2021-03-10)
* Upgrade to v1.12.0 of the Rancher2 Terraform Provider

## 2.7.1 (2021-02-16)
* Upgrade to pulumi-terraform-bridge v2.19.0  
  **Please Note:** This includes a bug fix that stops mutating resources options in the nodejs provider
* Avoid storing config from the environment into the state

## 2.7.0 (2021-02-01)
* Upgrade to pulumi-terraform-bridge v2.18.1

## 2.6.1 (2021-01-13)
* Upgrade to pulumi-terraform-bridge v2.17.0
* Upgrade to Pulumi v2.17.0

## 2.6.0 (2021-01-11)
* Upgrade to v1.11.0 of the Rancher2 Terraform Provider

## 2.5.3 (2020-11-24)
* Upgrade to pulumi-terraform-bridge v2.13.2  
  * This adds support for import specific examples in documentation

## 2.5.2 (2020-11-17)
* Upgrade to v1.10.6 of the Rancher2 Terraform Provider

## 2.5.1 (2020-11-03)
* Upgrade to v1.10.4 of the Rancher2 Terraform Provider

## 2.5.0 (2020-10-26)
* Upgrade to Pulumi v2.12.0 and pulumi-terraform-bridge v2.11.0
* Improving the accuracy of previews leading to a more accurate understanding of what will actually change rather than assuming all output properties will change.  
  ** PLEASE NOTE:**  
  This new preview functionality can be disabled by setting `PULUMI_DISABLE_PROVIDER_PREVIEW` to `1` or `false`.

## 2.4.1 (2020-09-20)
* Upgrade to v1.10.3 of the Rancher2 Terraform Provider

## 2.4.0 (2020-09-14)
* Upgrade to v1.10.2 of the Rancher2 Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.8.0
* Upgrade to Pulumi v2.10.0

## 2.3.0 (2020-08-31)
* Upgrade to pulumi-terraform-bridge v2.7.3
* Upgrade to Pulumi v2.9.0, which adds type annotations and input/output classes to Python

## 2.2.0 (2020-06-30)
* Rename `rancher2.ClusterAlterGroup` to be `rancher2.ClusterAlertGroup`
* Rename `rancher2.ClusterAlterRule` to be `rancher2.ClusterAlertRule`
* Upgrade to v1.9.0 of the Rancher2 Terraform Provider

## 2.1.3 (2020-06-10)
* Switch to GitHub actions for build

## 2.1.2 (2020-05-28)
* Upgrade to Pulumi v2.3.0
* Upgrade to pulumi-terraform-bridge v2.4.0

## 2.1.1 (2020-05-12)
* Upgrade to pulumi-terraform-bridge v2.3.1

## 2.1.0 (2020-04-28)
* Regenerate datasource examples to be async
* Upgrade to pulumi-terraform-bridge v2.1.0

## 2.0.0 (2020-04-18)
* Upgrade to pulumi-terraform-bridge v2.0.0
* Upgrade to Pulumi v2.0.0

## 1.6.0 (2020-04-14)
* Upgrade to v1.8.3 of the Rancher2 Terraform Provider
* Rename datasource `getRoleTempalte` to `getRoleTemplate`

## 1.5.0 (2020-04-02)
* Upgrade to pulumi-terraform-bridge v1.8.2
* Upgrade to Pulumi v1.13.1
* Change layout to support Go modules

## 1.4.0 (2020-03-31)
* Upgrade to v1.8.0 of the Rancher2 Terraform Provider

## 1.3.0 (2020-03-31)
* Upgrade to v1.7.3 of the Rancher2 Terraform Provider

## 1.2.0 (2020-03-21)
* Upgrade to v1.7.2 of the Rancher2 Terraform Provider
* Upgrade to Pulumi v1.12.1
* Upgrade to pulumi-terraform-bridge v1.8.2

## 1.1.0 (2020-01-29)
* Upgrade to v1.6.4 of pulumi-terraform-bridge

## 1.0.0 (2020-01-16)
* Initial release of the provider against v1.7.1 of the Rancher2 Terraform Provider
