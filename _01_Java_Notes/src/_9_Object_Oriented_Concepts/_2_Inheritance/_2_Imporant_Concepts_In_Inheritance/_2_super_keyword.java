package _9_Object_Oriented_Concepts._2_Inheritance._2_Imporant_Concepts_In_Inheritance;

class info
{
    String name="Nandan G N";
    int age = 22;
    String email = "gnnandan7@gmail.com";
}

class myInfo extends info
{
    void access()
    {
        System.out.println(">>> Accessing the instance variable of parent class");

        //accessing the parent class variables,
        /*
        if the variable name of both parent and child class are same,
        then preference will be given to child class
        in order to avoid this we use "super keyword"
        */
        System.out.println("Name: "+super.name);
        System.out.println("Age: "+super.age);
        System.out.println("Email: "+super.email);
    }
}


public class _2_super_keyword
{
    public static void main(String[] args)
    {
        myInfo nandan = new myInfo();
        nandan.access();
    }
}
//output
//>>> Accessing the instance variable of parent class
//Name: Nandan G N
//Age: 22
//Email: gnnandan7@gmail.com