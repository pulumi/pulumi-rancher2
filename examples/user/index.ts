import * as pulumi from "@pulumi/pulumi";
import * as rancher2 from "@pulumi/rancher2";

const myUser = new rancher2.User("user", {
    name: "Foo user",
    username: "foo",
    password: "initialPassw0rd",
    enabled: true,
});

export const userName = myUser.name;
