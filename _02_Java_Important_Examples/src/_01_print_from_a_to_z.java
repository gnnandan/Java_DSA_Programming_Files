public class _01_print_from_a_to_z
{
    public static void main(String[] args)
    {
        //way 1
        for(char i='a'; i<='z';i++)
        {
            System.out.print(i+" ");
        }

        System.out.println();
        //way 2
        char c = 'a';
        while (c<='z')
        {
            System.out.print(c+" ");
            c++;
        }

        System.out.println();
        //way 3
        char c1 = 'a';
        do
        {
            System.out.print(c1+" ");
            c1++;
        }while (c1<='z');
    }
}
