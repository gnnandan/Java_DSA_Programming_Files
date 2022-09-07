package Object_Oriented_Concepts._02_abstraction;

abstract class remoteFunction //abstract class
{
    abstract void buttonOn(); //abstract method
    abstract void buttonOff(); //abstract method
}
class tvRemote extends remoteFunction
{
    @Override
    void buttonOn() //overriding the abstract method
    {
        System.out.println("TV is On");
    }
    @Override
    void buttonOff() //overriding the abstract method
    {
        System.out.println("TV is Off");
    }
}
public class abstraction_example
{
    public static void main(String[] args)
    {
        tvRemote function = new tvRemote();
        function.buttonOn();
        function.buttonOff();
    }
}
//output
//TV is On
//TV is Off