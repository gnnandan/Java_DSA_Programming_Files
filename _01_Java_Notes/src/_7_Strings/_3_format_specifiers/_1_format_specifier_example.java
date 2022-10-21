package _7_Strings._3_format_specifiers;

//format() - Returns a formatted string using the specified format string and arguments.
public class _1_format_specifier_example
{
    public static void main(String[] args)
    {
        String str = "Nandan";

        String name = String.format("My name is %s",str);
        System.out.println(name);
    }
}

//output
//My name is Nandan