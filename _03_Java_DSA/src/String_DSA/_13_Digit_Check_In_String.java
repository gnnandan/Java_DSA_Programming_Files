package String_DSA;

public class _13_Digit_Check_In_String
{
    public static void main(String[] args)
    {
        String s = "Nandan123";

        char arr[] = s.toCharArray();

        StringBuilder digits = new StringBuilder();

        for(char c: arr)
        {
            if(Character.isDigit(c))
            {
                digits.append(c);
            }
        }
        System.out.println("The digits in a string: "+digits);
    }
}
