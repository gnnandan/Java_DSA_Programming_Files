package String_DSA;

public class _10_FIZZ_BUZZ
{
    public static void main(String[] args)
    {
        int start_num = 1;
        int end_num = 100;

        //iteration
        for (int i = start_num; i <= end_num; i++)
        {
            if (i % 3 == 0&& i%5!=0)
            {
                System.out.println("FIZZ");
            }
            else if(i%5==0&& i%3!=0)
            {
                System.out.println("BUZZ");
            }
            else if(i%3==0 && i%5==0)
            {
                System.out.println(i + " FIZZ - BUZZ");
            }
            else
            {
                System.out.println(i);
            }
//            else if (i % 5 == 0 && i % 3 != 0)
//            {
//                System.out.println("BUZZ");
//            } else if (i % 3 == 0 && (i & 5) == 0)
//            {
//                System.out.println("FIZZ-BUZZ");
//            } else
//            {
//                System.out.println(i);
//            }
        }
    }
}
