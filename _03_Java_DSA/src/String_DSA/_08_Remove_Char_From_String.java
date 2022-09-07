package String_DSA;
public class _08_Remove_Char_From_String
{
    public static void main(String[] args)
    {
        String s = "This is good information";

        System.out.println("Before removing character: "+s);

        int position = 9; //position of a character to remove
        String finalString = s.substring(0,position)+s.substring(position+1);

        System.out.println("After removing character: "+finalString);
    }
}
