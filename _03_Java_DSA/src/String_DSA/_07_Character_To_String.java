package String_DSA;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _07_Character_To_String
{
    public static void main(String[] args)
    {
        char c[] = {'c','u','r','i','o','u','s'};
        String s  = "";
        for(int i=0;i<c.length;i++)
        {
            s=s+c[i];
        }
        System.out.println("After converting into string: "+s);
    }
}
