public class _11_reverse_number
{
    public static void main(String[] args)
    {
        int number = 123459;
        int reversedNumber = 0;
        while (number > 0)
        {
            reversedNumber = (reversedNumber * 10) + number % 10;
            number = number / 10;
        }
        System.out.println("Reversed Number is: " + reversedNumber);
    }
}
