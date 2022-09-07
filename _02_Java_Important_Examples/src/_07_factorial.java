public class _07_factorial
{
    public static void main(String[] args)
    {
        int num = 5;
        int fact=1;
        if(num==0)
        {
            System.out.println(1);
        }
        else
        {
            for(int i=1;i<=num;i++)
            {
                fact = fact * i;
            }
            System.out.println(fact);
        }
    }
}
