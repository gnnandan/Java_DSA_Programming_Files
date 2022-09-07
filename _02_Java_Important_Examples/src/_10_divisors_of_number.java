public class _10_divisors_of_number
{
    public static void main(String[] args)
    {
        int number = 100;
        int totalDivisors = 0;

        System.out.print("Divisors: ");
        for(int i=1;i<=number;i++)
        {
            if(number%i==0)
            {
                System.out.print(i+" ");
                totalDivisors++;
            }
        }
        System.out.println("\nThe total divisors of number: "+number+" = "+totalDivisors);

    }
}
