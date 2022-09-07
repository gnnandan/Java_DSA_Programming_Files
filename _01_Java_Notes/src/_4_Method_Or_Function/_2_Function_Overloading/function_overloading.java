package _4_Method_Or_Function._2_Function_Overloading;

public class function_overloading
{
    public static void main(String[] args)
    {
        System.out.println("Function Overloading");
        sum();

        int intTypeResult_1 = sum(10, 20);
        int intTypeResult_2 = sum(10.0f, 20);
        float floatTypeResult = sum(10, 20.0f);

        System.out.println("Overloading 1: " + intTypeResult_1);
        System.out.println("Overloading 2: " + intTypeResult_2);
        System.out.println("Overloading 3: " + floatTypeResult);
    }

    //function with the name called "sum"
    static void sum()
    {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }

    static int sum(int a, int b) // overloading with number of parameters
    {
        int sum = a + b;
        return sum;
    }

    static int sum(float a, int b) //overloading by change in parameter
    {
        int sum = (int) a + b; //type casting
        return sum;
    }

    static float sum(int a, float b) //overloading by order of parameters
    {
        int sum = a + (int) b; //type casting
        return sum;
    }
}

//output
//Function Overloading
//The sum is: 30
//Overloading 1: 30
//Overloading 2: 30
//Overloading 3: 30.0
