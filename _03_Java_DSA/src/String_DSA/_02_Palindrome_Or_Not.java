package String_DSA;

public class _02_Palindrome_Or_Not
{
    public static void main(String[] args)
    {
        String s  = "madam";

        String rev_str = "";

        for(int i=s.length()-1;i>=0;i--)
        {
            rev_str = rev_str + s.charAt(i);
        }

        if(s.equals(rev_str))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }

    }
}
//output
//Palindrome