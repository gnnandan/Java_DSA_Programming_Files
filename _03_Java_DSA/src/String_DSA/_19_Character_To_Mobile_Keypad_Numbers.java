package String_DSA;

public class _19_Character_To_Mobile_Keypad_Numbers
{
    public static void main(String[] args)
    {
        String str[] = {
                "2","22","222",
                "3","33","333",
                "4","44","444",
                "5","55","555",
                "6","66","666",
                "7","77","777","7777",
                "8","88","888",
                "9","99","999","9999"
        };
        String input = "Nandan".toUpperCase();

        String result = keypadEquivalent(str,input);

        System.out.println("The mobile keypad equivalent of string "+input+" is: "+result);
    }

    static String keypadEquivalent(String arr[], String input)
    {
        String output = "";

        int len = input.length();

        for(int i=0;i<len;i++)
        {
            if(input.charAt(i)==' ')
            {
                output = output+'0';
            }
            else
            {
                int position = input.charAt(i)-'A';
                output = output+arr[position];
            }
        }
        return output;
    }
}
