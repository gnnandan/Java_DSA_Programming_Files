package _4_Method_Or_Function._1_Types_Of_Method;

public class _2_withParameterAndNoReturn
{
    public static void main(String[] args)
    {
        System.out.println("Function with parameter and no return type");
        sum(10, 20); //same type arguments must be passed when function is having parameter
    }

    static void sum(int a, int b) // function -> with parameter
    {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        // function -> no return type
    }
}
//output
//Function with parameter and no return type
//The sum of 10 and 20 is: 30
