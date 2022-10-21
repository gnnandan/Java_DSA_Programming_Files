package String_DSA;

import java.util.Arrays;

public class _17_Shuffeling_Charcaters
{
    public static void main(String[] args)
    {
        String s = "abcde";

        char c[] = s.toCharArray();

        for(int i=1;i<c.length;i=i+2)
        {
            char temp = c[i];
            c[i] = c[i-1];
            c[i-1] = temp;
        }

        System.out.println(Arrays.toString(c));
    }
}
