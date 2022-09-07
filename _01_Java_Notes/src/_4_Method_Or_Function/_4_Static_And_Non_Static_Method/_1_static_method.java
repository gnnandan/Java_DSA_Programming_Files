package _4_Method_Or_Function._4_Static_And_Non_Static_Method;

class staticMethodExample
{
    static void sum() //static method
    {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("STATIC METHOD: The sum of " + a + " and " + b + " is: " + sum);
    }

    void result()//non-static method
    {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("NON STATIC METHOD: The sum of " + a + " and " + b + " is: " + sum);
    }
}

public class _1_static_method
{
    public static void main(String[] args)
    {

        staticMethodExample.sum(); //accessing the static method without instance or object creation

        //to access non-static method object creation is mandatory
        staticMethodExample referenceVariable = new staticMethodExample(); //object creation
        referenceVariable.result(); //accessing the non-static method
    }
}
//output
//STATIC METHOD: The sum of 10 and 20 is: 30
//NON STATIC METHOD: The sum of 10 and 20 is: 30
