package _5_Constructor._2_Constructor_Overloading;

public class constructorOverloading
{
    constructorOverloading()
    {
        System.out.println("This is default constructor");
    }

    constructorOverloading(int a) //constructor overloading with number of parameter
    {
        System.out.println("Constructor overloading (With number of parameter): "+a);
    }

    constructorOverloading(int a, float b) //constructor overloading with type of parameter
    {
        System.out.println("Constructor overloading (With type of parameter): "+a+", "+b);
    }

    constructorOverloading(float a, int b) //constructor overloading with change in order of parameter
    {
        System.out.println("Constructor overloading (With change in order of parameter): "+a+", "+b);
    }

    public static void main(String[] args)
    {
        new constructorOverloading(10);//constructor overloading with number of parameter
        new constructorOverloading(10, 10.0f);//constructor overloading with type of parameter
        new constructorOverloading(10.0f,20);//constructor overloading with change in order of parameter
    }
}

//output
//Constructor overloading (With number of parameter): 10
//Constructor overloading (With type of parameter): 10, 10.0
//Constructor overloading (With change in order of parameter): 10.0, 20
