public class _08_swap_number
{
    public static void main(String[] args)
    {
        int num1=12;
        int num2=34;

        int temp=0;

        temp = num1;
        num1=num2;
        num2=temp;

        System.out.println("After swapping: "+num1+""+num2);

    }
}
