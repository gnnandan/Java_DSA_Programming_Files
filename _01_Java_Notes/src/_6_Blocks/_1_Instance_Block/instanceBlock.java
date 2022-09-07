package _6_Blocks._1_Instance_Block;

public class instanceBlock
{
    //instance block
    {
        System.out.println("STEP TWO >>> Inside Instance Block");
    }

    //instance block
    {
        System.out.println("STEP THREE >>> We can have multiple instance block");
    }

    //multiple instance block
    //instance block with instance variable
    String information; //instance variable
    {
        information = "Initializing instance variable"; //Initialization
        System.out.println("STEP FOUR >>> The information is: "+information);
    }

    //constructor because the name is same as class name
    instanceBlock()
    {
        System.out.println("STEP FIVE >>> This is constructor with no parameter");
    }

    //method
    static void method()
    {
        System.out.println("STEP SIX AFTER CALLING >>> This is user defined method");
    }

    public static void main(String[] args)
    {
        System.out.println("STARTS FROM HERE >>> The Main Method");
        new instanceBlock();
        method(); //calling method
        System.out.println("STOPPED HERE >>> The Main Method");
    }
}
//output
//The Main Method
//Inside Instance Block
//We can have multiple instance block
//The information is: Initializing instance variable