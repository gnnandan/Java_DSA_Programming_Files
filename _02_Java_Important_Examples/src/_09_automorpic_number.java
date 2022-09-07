public class _09_automorpic_number
{
    public static void main(String[] args)
    {
        System.out.println(checkAutomorphic(76)?"Automorphic":"Not Automorphic");
        System.out.println(checkAutomorphic(13)?"Automorphic":"Not Automorphic");
    }

    static boolean checkAutomorphic(int num)
    {
        int square = num * num;
        while(num>0)
        {
            if(num % 10!=square%10)
            {
                return false;
            }

            //reduce num and square by dividing those by 10
            num = num/10;
            square= square/10;
        }
        return true;
    }
}
