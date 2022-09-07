package _4_Method_Or_Function._1_Types_Of_Method;

public class _3_NoParameterAndWithReturn
{
    public static void main(String[] args)
    {
        System.out.println("Function with no parameter and with return type");
        System.out.println("The sum of is: " + sum()); //way 1

        // the returning value should be stored in same variable of matching data type
        int result = sum();
        System.out.println("The sum of is: " + result); //way 2
    }
    static int sum() //return type (int)
    {
        int a = 10;
        int b = 20;
        int sum = a + b;

        return sum; //returning the information
    }
}
//output
//Function with no parameter and with return type
//The sum of is: 30
//The sum of is: 30