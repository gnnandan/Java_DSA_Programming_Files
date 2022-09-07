package Object_Oriented_Concepts._05_inheritance;
class parentClass
{
    void data()
    {
        System.out.println("This is parent class");
    }
}
class childclass extends parentClass
{
    void information()
    {
        System.out.println("This is child class");
    }
}
public class _01_inheritance_example
{
    public static void main(String[] args)
    {
        childclass cc =new childclass();
        cc.data();
        cc.information();
    }
}
//output
//This is parent class
//This is child class