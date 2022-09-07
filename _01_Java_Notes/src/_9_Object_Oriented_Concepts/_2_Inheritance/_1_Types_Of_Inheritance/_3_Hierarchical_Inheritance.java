package _9_Object_Oriented_Concepts._2_Inheritance._1_Types_Of_Inheritance;

//parent class
class HI_Parent
{
    String s;
    void method()
    {
        s = "Parent Class Instance Variable";
        System.out.println(s);
        System.out.println("Parent Class Method");
    }
}

//sibling class 1 from same parent
class HI_Sibling_1 extends HI_Parent
{
    String s;
    void method()
    {
        s = "Sibling - 1 Class Instance Variable";
        System.out.println(s);
        System.out.println("Sibling - 1 Class Method");
    }
}

//sibling class 2 from same parent
class HI_Sibling_2 extends HI_Parent
{
    String s;
    void method()
    {
        s = "Sibling - 2 Class Instance Variable";
        System.out.println(s);
        System.out.println("Sibling - 2 Class Method");
    }
}

public class _3_Hierarchical_Inheritance
{
    public static void main(String[] args)
    {
        //object creation
        HI_Sibling_1 sibling_1 = new HI_Sibling_1();
        //accessing members/ fields
        sibling_1.method();

        //object creation
        HI_Sibling_2 sibling_2 = new HI_Sibling_2();
        //accessing members/ fields
        sibling_2.method();
    }
}
//output
//Sibling - 1 Class Instance Variable
//Sibling - 1 Class Method
//Sibling - 2 Class Instance Variable
//Sibling - 2 Class Method