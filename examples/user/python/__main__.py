from pulumi import export
import pulumi_rancher2 as rancher2
import pulumi_random as random

username = random.RandomString("random-username",
                               length=10,
                               special=False)

my_user = rancher2.User("python-user",
                            name="Python User",
                            username=username.result,
                            password="initialPassw0rd",
                            enabled="true",
                            )

export("username", my_user.name)
