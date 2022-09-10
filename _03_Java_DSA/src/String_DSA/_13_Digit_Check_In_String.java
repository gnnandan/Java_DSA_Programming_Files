package String_DSA;

public class _13_Digit_Check_In_String
{
    public static void main(String[] args)
    {
        String s = "C123urious$^%^&Deve1234lopers";
        char c[] = s.toCharArray();

        StringBuilder digits = new StringBuilder();
        StringBuilder symbols = new StringBuilder();
        StringBuilder validMessage = new StringBuilder();

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

            if(Character.isAlphabetic(ch))
            {
                validMessage.append(ch);
            }
        }
        System.out.println("The digits in the string: "+digits);
        System.out.println("The special symbols in the string: "+symbols);
        System.out.println("The Valid message in the string: "+validMessage);
    }
}
