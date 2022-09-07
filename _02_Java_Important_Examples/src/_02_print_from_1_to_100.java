public class _02_print_from_1_to_100
{
    public static void main(String[] args)
    {
        int count =0;

        while(count<=100)
        {
            System.out.print(count+" ");
            count++;
        }

        System.out.println();

        count =0;
        do
        {
            System.out.print(count+" ");
            count++;
        }while (count<=100);

        System.out.println();

        for(int i=0;i<=100;i++)
        {
            System.out.print(i+" ");
        }
    }
}
