package Arrays_Examples;

public class _08_sum_of_array
{
    public static void main(String[] args)
    {
        int arr[] = {1,2,5,6,3,2};
        int sum = 0;

        for(int i=0;i< arr.length;i++)
        {
            sum = sum+arr[i];
        }

        System.out.println("The sum of array is: "+sum);
    }
}
