package String_DSA;

public class _06_Count_Vowels_Consonants
{
    public static void main(String[] args)
    {
        String s = "Nandan";
        int a_count =0;
        int e_count =0;
        int i_count =0;
        int o_count =0;
        int u_count =0;
        int consonant_count = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            {
                a_count++;
            }
            else if(s.charAt(i)=='e')
            {
                e_count++;
            }
            else if (s.charAt(i)=='i')
            {
                i_count++;
            }
            else if(s.charAt(i)=='o')
            {
                o_count++;
            }
            else if(s.charAt(i)=='u')
            {
                u_count++;
            }
            else
            {
                consonant_count++;
            }
        }
        System.out.println("a count: "+a_count);
        System.out.println("e count: "+e_count);
        System.out.println("i count: "+i_count);
        System.out.println("o count: "+o_count);
        System.out.println("u count: "+u_count);

        int vowel_count = a_count+e_count+i_count+o_count+u_count;

        int total_letters_count = vowel_count+consonant_count;
        System.out.println("vowel count: "+ vowel_count);
        System.out.println("consonant count: "+consonant_count);
        System.out.println("Total letters: "+total_letters_count);

    }
}
