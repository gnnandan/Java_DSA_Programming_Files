package Arrays_Examples;

public class _14_sum_and_average_of_array
{
    public static void main(String[] args)
    {
        int array[] = {1, 2, 5, 6, 3, 2};

        int sum = 0;
        int average = 0;

        for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }
        average = sum / array.length;
        System.out.println("The sum is: "+sum);
        System.out.println("The average is: "+average);
    }
}
