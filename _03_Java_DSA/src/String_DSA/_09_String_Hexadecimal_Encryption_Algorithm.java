package String_DSA;
public class _09_String_Hexadecimal_Encryption_Algorithm
{
    public static void main(String[] args)
    {
        //message
        String message = "Hello World";
        String encrypted_message = "";
        //iteration
        for(int i=0;i<message.length();i++)
        {
            //take each character in a message
            char ch = message.charAt(i); //System.out.println(ch);
            //find the ascii value
            int ascii_val = (int)ch; //System.out.println(ascii_val);
            //convert int to hexdecimal
            String encrypt = Integer.toHexString(ascii_val);
            //concatenate the with empty string
            encrypted_message = encrypted_message+encrypt;
        }
        System.out.println("The encrypted hexadecimal value is: "+encrypted_message);
    }
}
//The encrypted value is: 48656c6c6f20576f726c64