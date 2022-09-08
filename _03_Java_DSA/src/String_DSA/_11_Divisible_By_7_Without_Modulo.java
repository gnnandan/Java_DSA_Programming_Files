package String_DSA;

public class _11_Divisible_By_7_Without_Modulo
{
    public static void main(String[] args)
    {
        int num = 700;

        if (isDivisible7(num))
        {
            System.out.println("Divisible");
        } else
        {
            System.out.println("Not Visible");
        }

        if(isDivisible7_way2(num))
        {
            System.out.println("Divisible");
        } else
        {
            System.out.println("Not Visible");
        }
    }

    static boolean isDivisible7(int num) //way 1
    {
        if (num < 0)
        {
            return isDivisible7(-num);
        } else if (num == 0 || num == 7)
        {
            return true;
        } else if (num < 10)
        {
            return false;
        }
        //Recur for ( num / 10 - 2 * num % 10 )
        return isDivisible7(num / 10 - 2 * (num - num / 10 * 10));
    }

    static boolean isDivisible7_way2(int num)
    {
        if(num%7==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
