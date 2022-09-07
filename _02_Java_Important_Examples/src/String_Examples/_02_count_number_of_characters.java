package String_Examples;

public class _02_count_number_of_characters
{
    public static void main(String[] args)
    {
        String str = "Hello, World";
        int charCount = 0;

        for (int i = 1; i < str.length(); i++)
        {
            System.out.println("Character: " + str.charAt(i) + " Count: " + i);
            charCount++;
        }
        System.out.println("Total charcters in string: "+str+" is: "+charCount);
    }
}
