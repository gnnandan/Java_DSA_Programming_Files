package _7_Strings._1_Mutable_String;

public class _3_ensure_capacity
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("Curious Developers Community");

        System.out.println("Before ensuring the capacity: "+sb.capacity());

        //ensure capacity
        sb.ensureCapacity(100);

        System.out.println("After ensuring the capacity: "+sb.capacity());
    }
}
//output
//Before ensuring the capacity: 44
//After ensuring the capacity: 100
