package _9_Object_Oriented_Concepts._1_class_and_object;

class car
{
    String brandName; //data members =  variable
    {
        brandName = "TATA";
    }
    void brand() //member functions - 1
    {
        System.out.println("Car brand is: "+brandName);
    }

    void color() //member functions - 2
    {
        System.out.println("Car color is SILVER");
    }

    void carType() //member functions - 3
    {
        System.out.println("Car type is "+brandName+" Nexon EV");
    }
}
public class class_and_object
{
    public static void main(String[] args)
    {
        //object creation = className referenceVariable = new className();
        //calling member functions -> referenceVariable.functionName();

        car c1 = new car(); //object creation

        //member functions
        c1.brand();
        c1.color();
        c1.carType();
    }
}
//output
//Car brand is: TATA
//Car color is SILVER
//Car type is TATA Nexon EV
