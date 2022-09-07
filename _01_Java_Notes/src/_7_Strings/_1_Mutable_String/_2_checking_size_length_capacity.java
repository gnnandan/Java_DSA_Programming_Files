package _7_Strings._1_Mutable_String;

public class _2_checking_size_length_capacity
{
    public static void main(String[] args)
    {
        StringBuffer data = new StringBuffer("He who help others, will be helped by GOD");

        //capacity
        System.out.println("The capacity of a string: "+data.capacity());

        //length
        System.out.println("The length of a string: "+data.length());
    }
}
//output
//The capacity of a string: 57
//The length of a string: 41
