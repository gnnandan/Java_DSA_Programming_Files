package _4_Method_Or_Function._3_Function_Overriding;

class parent_class //parent class
{
    public void sum()
    {
        int a =10;
        int b = 20;
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }
}
class child_class extends parent_class //child class
{
    //overriding happening here
    public void sum()
    {
        int a = 100;
        int b = 200;
        int sum = a+b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }
}
public class function_overriding
{
    public static void main(String[] args)
    {
        child_class reference_variable  = new child_class(); //object creation
        reference_variable.sum(); //accessing the members with reference variable
    }
}
//Output
//The sum of 100 and 200 is: 300