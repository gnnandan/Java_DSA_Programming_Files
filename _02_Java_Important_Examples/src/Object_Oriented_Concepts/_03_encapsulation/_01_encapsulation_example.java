package Object_Oriented_Concepts._03_encapsulation;

class data
{
    private String name;
    private String designation;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getDesignation()
    {
        return designation;
    }
    public void setDesignation(String designation)
    {
        this.designation = designation;
    }
}
public class _01_encapsulation_example
{
    public static void main(String[] args)
    {
        data information = new data();
        information.setName("Nandan");
        information.setDesignation("Software Engineer");

        System.out.println("Name is: "+information.getName());
        System.out.println("Designation is: "+information.getDesignation());
    }
}
//output
//Name is: Nandan
//Designation is: Software Engineer