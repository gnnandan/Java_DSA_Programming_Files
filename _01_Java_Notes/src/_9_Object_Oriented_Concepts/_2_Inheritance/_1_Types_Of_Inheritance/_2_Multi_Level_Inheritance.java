package _9_Object_Oriented_Concepts._2_Inheritance._1_Types_Of_Inheritance;
//parent class 1
class MLIParent_1
{
    String s;
    void method()
    {
        s = "Parent - 1 Class Instance Variable";
        System.out.println(s);
        System.out.println("Parent - 1 Class Method");
    }
}
//parent class 2
class MLIParent_2 extends MLIParent_1
{
    String s;
    void method()
    {
        s = "Parent - 2 Class Instance Variable";
        System.out.println(s);
        System.out.println("Parent - 2 Class Method");
    }
}
//child class 2
class MLIParent_3 extends MLIParent_2
{
    String s;
    void method()
    {
        s = "Child Class Instance Variable";
        System.out.println(s);
        System.out.println("Child Class Method");
    }
}

public class _2_Multi_Level_Inheritance
{
    public static void main(String[] args)
    {
        //object creation
        MLIParent_2 parent_2 = new MLIParent_2();
        //accessing members/ fields
        parent_2.method();

        //object creation
        MLIParent_3 parent_3 = new MLIParent_3();
        //accessing members/ fields
        parent_3.method();
    }
}
//output
//Parent - 2 Class Instance Variable
//Parent - 2 Class Method
//Child Class Instance Variable
//Child Class Method