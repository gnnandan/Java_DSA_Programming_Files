public class _04_reverse_string
{
    public static void main(String[] args)
    {
        String s1 = "abcd";
        String rev_s1 = "";

        for(int i=s1.length()-1;i>=0;i--)
        {
            rev_s1 = rev_s1+(s1.charAt(i));
        }

        System.out.println("Reversed string: "+rev_s1);
    }
}
