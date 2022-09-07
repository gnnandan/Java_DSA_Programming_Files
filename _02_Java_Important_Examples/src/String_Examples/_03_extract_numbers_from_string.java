package String_Examples;

public class _03_extract_numbers_from_string
{
    public static void main(String[] args)
    {
        String str = "Hello, World123456763";
        String numbers ="";

        numbers = str.replaceAll("[^0-9]",""); //regex expression

        System.out.println("The numbers are: "+numbers);
    }
}
