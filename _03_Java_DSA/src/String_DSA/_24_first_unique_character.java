package String_DSA;

public class _24_first_unique_character
{
    public static void main(String[] args)
    {

        System.out.println(bruteForceApproach("aabb"));
        System.out.println(simpleApproach("leetcode"));
    }

    static int bruteForceApproach(String s)
    {
        char c[] = s.toCharArray();

        for(int i=0;i<s.length();i++)
        {
            boolean flag = true;
            for(int j=0;j<s.length();j++)
            {
                if(c[i]==c[j])
                {
                    flag = false;
                    break;
                }
            }
            if(flag==true)
            {
                return i;
            }
        }
        return -1;
    }

    static int simpleApproach(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            char c  = s.charAt(i);
            System.out.print("Logic:  "+c);
            if(s.indexOf(c)==s.lastIndexOf(c))
            {
                return i;
            }
        }
        return -1;
    }
}
