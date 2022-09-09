package String_DSA;

public class _14_First_Repeated_Word
{
    public static void main(String[] args)
    {
        String s = "ab aba ab ab abcd aba";

        String word[] = s.split(" ");

        int count = 0;

        StringBuilder repeatedWord = new StringBuilder();

        for (int i = 0; i < word.length; i++)
        {
            count = 1;
            for (int j = i + 1; j < word.length; j++)
            {
                if (word[i].equals(word[j]))
                {
                    count++;
                    word[j] = "0";
                }
            }
            if (count > 1 && word[i] != "0")
            {
                repeatedWord.append(word[i] + " ");
            }
        }

        System.out.println("The first repeated word in a string: " + repeatedWord);
    }
}
