package _7_Strings._1_Mutable_String;

public class _1_comparing_mutable_string
{
    public static void main(String[] args)
    {
        StringBuffer string_s1 = new StringBuffer("Nandan");
        StringBuffer string_s2 = new StringBuffer("nandan");

        //comparison way 1
        boolean result = string_s1==string_s2;
        System.out.println("Both string are equal: "+result);

        //comparison way 2
        System.out.println("Both string are equal: "+string_s1.equals(string_s2));
    }
}
//output
//Both string are equal: false
//Both string are equal: false
