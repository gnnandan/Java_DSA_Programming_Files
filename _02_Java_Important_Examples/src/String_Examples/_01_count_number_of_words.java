package String_Examples;
public class _01_count_number_of_words
{
    public static void main(String[] args)
    {
        String data = "Hello, World";
        int countWords = 1;

        for(int i=0;i<data.length()-1;i++)
        {
            if (data.charAt(i) == ' ' && data.charAt(i+1) != ' ')
            {
                countWords++;
            }
        }
        System.out.println("The total number of words: "+countWords);
    }
}
