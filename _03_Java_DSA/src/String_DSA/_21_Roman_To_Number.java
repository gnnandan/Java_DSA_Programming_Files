package String_DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _21_Roman_To_Number
{
    public static void main(String[] args)
    {
        String s = "Mx".toUpperCase();
        //System.out.println("The roman equivalent of string s "+s+" is: "+romanToInt(s));
        System.out.println("The roman equivalent of string s "+s+" is: "+leetCodeApproach(s));
    }

    static int romanToInt(String s)
    {
        int total = 0;

        //getting value from symbol s1[i];
        for (int i = 0; i < s.length(); i++)
        {
            int s1 = romanEquivalent(s.charAt(i));
            //getting value from symbol s1[i+1];
            if(i+1<s.length())
            {
                int s2 = romanEquivalent(s.charAt(i+1));
                if(s1>=s2)
                {
                    total = total +s1;
                }
                else
                {
                    total = total -s1;
                }
            }
            else
            {
                total = total+s1;
            }
        }
        return total;
    }

    static int romanEquivalent(char c)
    {
        if (c == 'I')
        {
            return 1;
        }
        if (c == 'V')
        {
            return 5;
        }
        if (c == 'X')
        {
            return 10;
        }
        if (c == 'L')
        {
            return 50;
        }
        if (c == 'C')
        {
            return 100;
        }
        if (c == 'D')
        {
            return 500;
        }
        if (c == 'M')
        {
            return 1000;
        }
        return -1;
    }

    static int leetCodeApproach(String s)
    {
        Map<Character,Integer> map = new HashMap<>();

        // Fill the map
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        //store the length
        int len = s.length();

        //get the last length
        int num = map.get(s.charAt(len-1)) ;

        //loop should last 2nd element in a string
        for(int i=len-2;i>=0;i--)
        {
            if(map.get(s.charAt(i))>0)
            {
                num = num + map.get(s.charAt(i));
            }
            else
            {
                num = num - map.get(s.charAt(i));
            }
        }
//        System.out.println(num);
        return num;
    }
}
