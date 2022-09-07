package String_Examples;

public class _04_extract_words_in_sentance
{
    public static void main(String[] args)
    {
        String str = "Hello, World Welcome To Programming";
        String word[] = str.split(" ");

        for(String words: word)
        {
            System.out.println(words);
        }
    }
}
