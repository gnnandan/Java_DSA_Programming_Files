package _9_Object_Oriented_Concepts._1_class_and_object;

//class
class Person
{
    //data members/attributes
    String name;
    int age;
    String gender;

    //behaviour/member function
    void sleep()
    {
        if (age < 10)
        {
            System.out.println(name +", "+gender+ " -  will sleep more than 12 hours a day");
        } else if (age >= 10 && age <= 50)
        {
            System.out.println(name +", "+gender+ " -  will sleep less than 10 hours a day");
        }
        else
        {
            System.out.println(name +", "+gender+ " -  will sleep 10 hours a day");
        }
    }
}


public class ClassObjExample_2
{
    //main method
    public static void main(String[] args)
    {
        //object creation 1 and accessing the behaviours
        Person Rajesh = new Person(); //object creation
        Rajesh.name = "Rajesh";
        Rajesh.age=20;
        Rajesh.gender = "Male";
        Rajesh.sleep();//calling behaviours

        //object creation 2 and accessing the behaviours
        Person Ranju = new Person();
        Ranju.name = "Ranju";
        Ranju.age=9;
        Ranju.gender="Female";
        Ranju.sleep();//calling behaviours

        //object creation 3 and accessing the behaviours
        Person Harish = new Person();
        Harish.name = "Harish";
        Harish.age=70;
        Harish.gender="Male";
        Harish.sleep();//calling behaviours
    }
}
