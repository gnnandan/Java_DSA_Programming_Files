package _9_Object_Oriented_Concepts._2_Inheritance._2_Imporant_Concepts_In_Inheritance;

class Information
{
    Information()
    {
        System.out.println("This is default constructor");
    }

    Information(String s)
    {
        /*
        *  calling one constructor from another constructor
        *  use "this() method"
        *  if the calling constructor is not parameterized then use only "this()"
        *  else use parameter "this(respective data type)"
        * */
        this(); //calls non parameterized default constructor
        System.out.println("Parameterized constructor");
        System.out.println("Value of s: "+s);
    }

    Information(String s, int a)
    {
        this("Java Programming"); //calls parameterized constructor

        System.out.println("Value of s: "+s);
        System.out.println("Value of a: "+a);
        System.out.println("Parameterized constructor with use of 'this(datatype)'");
    }
}

public class _3_this_method
{
    public static void main(String[] args)
    {
//        Information data = new Information("Java & Data Structures",7);
        new Information("Java & Data Structures",7);
    }
}

//output
//This is default constructor
//Parameterized constructor
//Value of s: Java Programming
//Value of s: Java & Data Structures
//Value of a: 7
//Parameterized constructor with use of 'this(datatype)'