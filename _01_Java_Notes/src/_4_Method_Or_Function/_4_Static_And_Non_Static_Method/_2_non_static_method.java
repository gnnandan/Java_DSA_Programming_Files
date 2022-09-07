package _4_Method_Or_Function._4_Static_And_Non_Static_Method;

class nonStaticMethodExample
{
    //non-static method
    void result()
    {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("NON STATIC METHOD: The sum of " + a + " and " + b + " is: " + sum);
    }

    //static method
    static void sum()
    {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("STATIC METHOD: The sum of " + a + " and " + b + " is: " + sum);
    }
}
public class _2_non_static_method
{
    public static void main(String[] args)
    {
        nonStaticMethodExample referenceVariable = new nonStaticMethodExample(); //object creation
        referenceVariable.result(); //accessing non-static members

        nonStaticMethodExample.sum(); //accessing static member
    }
}
//output
//NON STATIC METHOD: The sum of 10 and 20 is: 30
//STATIC METHOD: The sum of 10 and 20 is: 30
