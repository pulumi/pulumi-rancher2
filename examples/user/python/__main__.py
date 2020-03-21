from pulumi import export
import pulumi_rancher2 as rancher2

my_user = rancher2.User("python-user",
                            name="Python User",
                            username="foopython",
                            password="initialPassw0rd",
                            enabled="true",
                            )

export("username", my_user.name)
