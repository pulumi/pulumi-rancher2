import * as rancher2 from "@pulumi/rancher2";

const myUser = new rancher2.User("typescript-user", {
    name: "TypeScript User",
    username: "foots",
    password: "initialPassw0rd",
    enabled: true,
});

export const userName = myUser.name;
