package String_DSA;

public class _15_Number_to_Word
{
    private static final String EMPTY = "";
    private static final String x[] = {
            EMPTY, "One ", "Two ", "Three ", "Four ", "Five ", "Six ",
            "Seven ", "Eight ", "Nine ", "Ten ", "Eleven ", "Twelve ",
            "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ",
            "Seventeen ", "Eighteen ", "Nineteen "
    };

    private static final String y[] = {
            EMPTY, EMPTY, "Twenty ", "Thirty ", "Forty ", "Fifty ",
            "Sixty ", "Seventy ", "Eighty ", "Ninety "
    };

    static String convertToDigit(int n, String units)
    {
        if (n == 0)
        {
            return EMPTY;
        }

        if (n > 19)
        {
            return y[n / 10] + x[n % 10] + units;
        }
        else
        {
            return x[n]+units;
        }
    }

    static String convert(int n)
    {
        StringBuilder result = new StringBuilder();

        //lakh
        result.append(convertToDigit(((n/100000)%100),"Lakh, "));

        //Thousands
        result.append(convertToDigit(((n/1000)%100),"Thousand, "));

        result.append(convertToDigit(((n/100)%10),"Hundred, "));

        if((n>100)&&(n%100!=0))
        {
            result.append("and ");
        }
        result.append(convertToDigit((n%100)," "));
        return result.toString();
    }

    public static void main(String[] args)
    {
        int num = 10;
        System.out.println("The word format of number "+num+" is = "+convert(num));
    }
}
