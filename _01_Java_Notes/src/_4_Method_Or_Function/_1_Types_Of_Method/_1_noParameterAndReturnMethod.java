package _4_Method_Or_Function._1_Types_Of_Method;

public class _1_noParameterAndReturnMethod
{
    public static void main(String[] args)
    {
        System.out.println("Function with no parameter and return type");
        sum();
    }
    static void sum() // function -> no parameter
    {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("The sum of "+a+" and "+b+" is: "+sum);

        // function -> no return type
    }
}

//output
//Function with no parameter and return type
//The sum of 10 and 20 is: 30
