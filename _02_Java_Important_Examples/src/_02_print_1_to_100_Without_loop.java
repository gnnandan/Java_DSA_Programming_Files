public class _02_print_1_to_100_Without_loop
{
    public static void main(String[] args)
    {
        int num =1;
        number(num);
    }
    static void number(int num)
    {
        if(num<=100)
        {
            System.out.print(num+" ");
            number(num+1);
        }
    }
}
