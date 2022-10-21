package String_DSA;

public class _23_Running_1D_Array
{
    public static void main(String[] args)
    {
        int[] arr={1,1,1,1,1};

        int sum[] = new int[arr.length];

        int temp = 0;

        for(int i=0;i< arr.length;i++)
        {
            temp = temp + arr[i];
            sum[i]=temp;
        }

        //the latest value
        for(int i=0;i< sum.length;i++)
        {
            System.out.print(sum[i]+" ");
        }
    }
}
