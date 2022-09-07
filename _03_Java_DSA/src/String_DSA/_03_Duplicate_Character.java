package String_DSA;
public class _03_Duplicate_Character
{
    public static void main(String[] args)
    {
        String s = "Nandan";

        char dup[] = s.toCharArray();
        for(int c =0; c<= dup.length-1;c++)
        {
            for(int ch = c+1;ch<= dup.length-1;ch++)
            {
                if(dup[c]==dup[ch])
                {
                    System.out.println(dup[c]);
                }
            }
        }

    }
}
