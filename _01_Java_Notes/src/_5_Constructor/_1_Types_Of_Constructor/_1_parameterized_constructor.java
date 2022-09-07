package _5_Constructor._1_Types_Of_Constructor;

public class _1_parameterized_constructor
{
    _1_parameterized_constructor(int a) //parameterized construction
    {
        System.out.println("The value of a is: "+a);
        System.out.println("Parameterized Constructor");
    }

    public static void main(String[] args)
    {
        //if any parameter is used means -> we need pass the arguments of same datatype
        new _1_parameterized_constructor(10);
        System.out.println("Main Method");
    }
}
//output
//The value of a is: 10
//Parameterized Constructor
//Main Method
