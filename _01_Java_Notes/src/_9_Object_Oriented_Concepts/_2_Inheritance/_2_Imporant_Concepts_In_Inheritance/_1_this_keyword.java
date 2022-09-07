package _9_Object_Oriented_Concepts._2_Inheritance._2_Imporant_Concepts_In_Inheritance;

class data
{
    String name = "Nandan G N";
    int age = 23;

    void info()
    {
        String name = "Nandan";
        int age = 22;

        //without "this keyword" more preference will be given to local variable
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        //points the current execution object (to avoid shadow problem)
        System.out.println("Instance Variable Data Access: " + this.name+" ,and age is: "+this.age);
    }
}

public class _1_this_keyword
{
    public static void main(String[] args)
    {
        data d = new data();
        d.info();
    }
}
//output
//Name: Nandan
//Age: 22
//Instance Variable Data Access: Nandan G N ,and age is: 23