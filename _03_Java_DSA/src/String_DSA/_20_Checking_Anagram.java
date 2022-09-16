package String_DSA;

import java.util.Arrays;

public class _20_Checking_Anagram
{
    public static void main(String[] args)
    {
        String s1 = "Race".toLowerCase();
        String s2 = "care".toLowerCase();

        boolean flag = true;

        if(s1.length()!=s2.length())
        {
            flag = false;
        }
        else
        {
            char[] arrayS1 = s1.toCharArray();
            char[] arrayS2 = s2.toCharArray();

            Arrays.sort(arrayS1);
            Arrays.sort(arrayS2);
            flag = Arrays.equals(arrayS1,arrayS2);
        }

        if(flag)
        {
            System.out.println(s1 +" and "+s2+" are anagrams");
        }
        else
        {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }
}
