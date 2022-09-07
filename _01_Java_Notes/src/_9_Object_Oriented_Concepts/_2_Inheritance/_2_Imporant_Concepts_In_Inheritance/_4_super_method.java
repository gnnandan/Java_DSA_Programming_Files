package _9_Object_Oriented_Concepts._2_Inheritance._2_Imporant_Concepts_In_Inheritance;

class patentData
{
    patentData()
    {
        System.out.println("Parent class default constructor with no parameter");
    }

    patentData(String s)
    {
        System.out.println("Parent class parameterized constructor");
        System.out.println("PARENT CLASS - Value of s: "+s);
    }
}

class childData extends patentData
{
    childData()
    {
        //accessing the parent class default constructor
        // if calling constructor is non parameterized then we need to use "super()"
        super(); //always should be first statement
        System.out.println("Child class default constructor with no parameter");
    }

    childData(String s)
    {
        // if calling constructor is parameterized then we need to use "super(datatype)"
        super("Java Programming");
        System.out.println("CHILD CLASS - Value of s: "+s);
        System.out.println("Child class parameterized constructor");
    }
}

public class _4_super_method
{
    public static void main(String[] args)
    {
        childData childData = new childData();
        new childData("Java Data Structures");
    }
}

//output
//Parent class default constructor with no parameter
//Child class default constructor with no parameter
//Parent class parameterized constructor
//PARENT CLASS - Value of s: Java Programming
//CHILD CLASS - Value of s: Java Data Structures
//Child class parameterized constructor