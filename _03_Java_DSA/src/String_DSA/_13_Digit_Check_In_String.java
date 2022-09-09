package String_DSA;

public class _13_Digit_Check_In_String
{
    public static void main(String[] args)
    {
        String s = "Nandan123@<>";
        char c[] = s.toCharArray();

        StringBuilder digits = new StringBuilder();
        StringBuilder symbols = new StringBuilder();


        for(char ch: c)
        {
            //logic extracts the digit
            if(Character.isDigit(ch))
            {
                digits.append(ch);
            }

            //logic extracts the special symbols
            if (!Character.isAlphabetic(ch)&&!Character.isDigit(ch))
            {
                symbols.append(ch);
            }
        }
        System.out.println("The digits in the string: "+digits);
        System.out.println("The special symbols in the string: "+symbols);

    }
}
