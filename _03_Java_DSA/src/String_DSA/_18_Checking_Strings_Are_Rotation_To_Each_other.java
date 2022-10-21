package String_DSA;

public class _18_Checking_Strings_Are_Rotation_To_Each_other
{
    public static void main(String[] args)
    {
        //Step - 1 define string 1 and string 2
        //Step - 2 check the length of string 1 and string 2 weather they are equal
        //step - 3 if length of string 1 and string 2 matching -> inorder to check valid rotation "concatenate string 1 itself with string 1 and assign to string 1"
        //step - 4 check the index of string 2 in string 1, if it presents then it's a valid rotation of each other
        String s1 = "abcde";
        String s2 = "bcade";


        if(s1.length() != s2.length())
        {
            System.out.println("The second string length is not matching");
        }
        else
        {
            s1 = s1.concat(s1);

            if(s1.indexOf(s2)!=-1)
            {
                System.out.println("The string 2 is a valid rotation of s1");
            }
            else
            {
                System.out.println("The string 2 is not a valid rotation of s1");
            }
        }
    }
}
