package String_DSA;

public class _01_Reverse_String
{
    public static void main(String[] args)
    {
        String s = "Nandan";

        String rev_s = "";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev_s =  rev_s + s.charAt(i);
        }

        System.out.println(rev_s);
    }
}
//output
//nadnaN