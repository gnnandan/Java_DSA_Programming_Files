package Object_Oriented_Concepts._06_interface;

interface userdata //interface class
{
    public static final String name = "Nandan"; //constants
    public abstract void UserName(); //abstract methods
}
class org1 implements userdata //interface implementation
{
    @Override
    public void UserName() //overriding here
    {
        System.out.println("My username is: "+name);
    }
}
public class _01_interface_example
{
    public static void main(String[] args)
    {
        org1 organization1 = new org1(); //object creation
        organization1.UserName(); //accessing the member functions
    }
}
//output
//My username is: Nandan