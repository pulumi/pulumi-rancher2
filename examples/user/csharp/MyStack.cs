using Pulumi;
using Rancher2 = Pulumi.Rancher2;
using Random = Pulumi.Random;

class UserStack : Stack
{
    public UserStack()
    {
        var randomUser = new Random.RandomString("random-username", new Random.RandomStringArgs
        {
            Length = 10,
            Special = false,
        });

        var user = new Rancher2.User("csharp-user", new Rancher2.UserArgs
        {
            Name = "CSharp User",
            Password = "initialPassw0rd",
            Username = randomUser.Result,
            Enabled = true,
        });
    }
}
