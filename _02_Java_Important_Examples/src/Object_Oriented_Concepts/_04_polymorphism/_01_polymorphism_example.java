package Object_Oriented_Concepts._04_polymorphism;

class data //parent class
{
    //overriding method
    void username()
    {
        System.out.println("Enter the username: ");
    }
}
class org1 extends data //child class - 1
{
    String userName = "Nandan G N";
    void username() //overriding here
    {
        System.out.println("Username of org1: "+userName);
    }
}
class org2 extends data //child class - 2
{
    String userName = "gn.nandan";
    void username() //overriding here
    {
        System.out.println("Username of org2: "+userName);
    }
}
public class _01_polymorphism_example
{
    public static void main(String[] args)
    {
        data polymorphism; //parent reference
        polymorphism = new org1(); //child object
        polymorphism.username();
        polymorphism = new org2(); //child object
        polymorphism.username();
    }
}
//output
//Username of org1: Nandan G N
//Username of org2: gn.nandan
