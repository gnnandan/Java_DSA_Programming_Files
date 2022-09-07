package _9_Object_Oriented_Concepts._2_Inheritance._1_Types_Of_Inheritance;

//parent class
class SLI_Parent
{
    String s = "Parent Class Instance Variable";
    void method()
    {
        System.out.println(s);
        System.out.println("Parent Class Method");
    }
}

//child class
class SLI_Child extends SLI_Parent
{
    String s = "Child Class Instance Variable";

    void method()
    {
        System.out.println(s);
        System.out.println("Child Class Method");
    }
}


public class _1_Single_Level_Inheritance
{
    public static void main(String[] args)
    {
        //object creation for child class
        SLI_Child childclass = new SLI_Child();

        //accessing member functions/fields of child class
        childclass.method();
    }
}

//output
//Child Class Instance Variable
//Child Class Method