public class _03_palindrome
{
    public static void main(String[] args)
    {
        String s1 = "abbabc".toLowerCase();
        String revStr="";

        for(int i=s1.length()-1;i>=0;i--)
        {
            revStr = revStr+(s1.charAt(i));
        }

        if(s1.equals(revStr))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
