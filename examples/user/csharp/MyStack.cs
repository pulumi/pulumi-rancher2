using Pulumi;
using Rancher2 = Pulumi.Rancher2;

class UserStack : Stack
{
    public UserStack()
    {
        var user = new Rancher2.User("csharp-user", new Rancher2.UserArgs
        {
            Name = "CSharp User",
            Password = "initialPassw0rd",
            Username = "foocsharp",
            Enabled = true,
        });
    }
}
