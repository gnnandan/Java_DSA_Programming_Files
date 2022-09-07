package Arrays_Examples;

import java.util.Arrays;

public class _11_sort_array
{
    public static <Char> void main(String[] args)
    {
        int array[] = {1, 2, 5, 6, 3, 2};

        for (int i = 0; i < array.length; i++)
        {
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[i] > array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Ascending Order Array: " + Arrays.toString(array));
    }
}
