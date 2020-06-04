import * as rancher2 from "@pulumi/rancher2";
import * as random from "@pulumi/random";

const username = new random.RandomString("random-username", {
    length: 10,
    special: false,
})

const myUser = new rancher2.User("typescript-user", {
    name: "TypeScript User",
    username: username.result,
    password: "initialPassw0rd",
    enabled: true,
});

export const userName = myUser.name;
