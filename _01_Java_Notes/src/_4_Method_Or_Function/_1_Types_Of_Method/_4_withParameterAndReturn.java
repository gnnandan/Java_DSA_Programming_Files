package _4_Method_Or_Function._1_Types_Of_Method;

public class _4_withParameterAndReturn
{
    public static void main(String[] args)
    {
        System.out.println("Function with parameter and with return type");

        int result = sum(10, 20); //arguments should be passed of same type which is used as parameter

        System.out.println("The sum of is: " + result);
    }

    static int sum(int a, int b) // function -> with parameter and return type
    {
        int sum = a + b;
        return sum; // return type called int
    }
}
//output
//Function with parameter and with return type
//The sum of is: 30