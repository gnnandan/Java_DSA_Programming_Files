package _6_Blocks._2_static_block;

public class staticBlock
{
    //NOTE
    //Static block execute before main method, constructor and method

    //static block
    static
    {
        System.out.println("STEP ONE >>> This is static block");
    }

    //multiple static block
    static
    {
        System.out.println("STEP TWO >>> Multiple static block is allowed");
    }

    //static block with static variable
    static String information;
    static
    {
        information = "Initializing static variable"; //Initialization
        System.out.println("STEP THREE >>> The information is: "+information);
    }

    //constructor
    staticBlock()
    {
        System.out.println("STEP FOUR >>> This is constructor with no parameter");
    }

    //method
    static void method()
    {
        System.out.println("STEP FIVE >>> This is method");
    }

    public static void main(String[] args)
    {
        System.out.println("STATED HERE >>> The Main Method");
        new staticBlock();
        method();
        System.out.println("STOPPED HERE >>> The Main Method");
    }
}

//output
//STEP ONE >>> This is static block
//STEP TWO >>> Multiple static block is allowed
//STEP THREE >>> The information is: Initializing static variable
//STATED HERE >>> The Main Method
//STEP FOUR >>> This is constructor with no parameter
//STEP FIVE >>> This is method
//STOPPED HERE >>> The Main Method
