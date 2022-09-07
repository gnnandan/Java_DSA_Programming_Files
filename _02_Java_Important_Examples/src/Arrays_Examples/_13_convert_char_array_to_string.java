package Arrays_Examples;

public class _13_convert_char_array_to_string
{
    public static void main(String[] args)
    {
        char ch[] = {'H','i',',',' ','N','a','n','d','a','n',' ','H','e','r','e'};

        //way 1
        String str1 = new String(ch);
        System.out.println(str1);

        String str2 = String.valueOf(ch);
        System.out.println(str2);
    }
}
