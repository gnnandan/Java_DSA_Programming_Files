package Arrays_Examples;

import java.util.Arrays;

public class _01_copy_array_element
{
    public static void main(String[] args)
    {
        int array[] = {1,2,3,4,5,6,7};

        int copyArray[] = new int[array.length];

        for(int i=0;i< array.length;i++)
        {
            copyArray[i] = array[i];
        }
        System.out.println("Copied array: "+ Arrays.toString(copyArray));
    }
}
