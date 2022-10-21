package _9_Object_Oriented_Concepts._3_polymorphism;

//specialized method (to access we use down-casting)

abstract class tata
{
    abstract void industry();
}
class tataMoters extends tata
{
    void industry()
    {
        System.out.println("Tata Moters Work On Automobile Area/Sector");
    }

    void car1()
    {
        System.out.println("Model - Nexon EV");
    }

    void car2()
    {
        System.out.println("Model - Range Rover");
    }
}

class tcs extends tata
{
    void industry()
    {
        System.out.println("TCS Work on Information Technology");
    }

    void work2()
    {
        System.out.println("TCS work for the TCS Only");
    }

    void work1()
    {
        System.out.println("TCS work for the client");
    }

}

public class _1_polymorphism_example
{
    public static void main(String[] args)
    {
        //parent reference = child object
        tata tataMotorsBrand = new tataMoters();
        tataMotorsBrand.industry();

        //downcasting = ((child_class) parent_reference_variable).specialized method();

        ((tataMoters) tataMotorsBrand).car1();
        ((tataMoters) tataMotorsBrand).car2();

        tata tataTCSBrand = new tcs();
        tataTCSBrand.industry();

        ((tcs) tataTCSBrand).work1();
        ((tcs) tataTCSBrand).work2();

    }
}
