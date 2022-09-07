package Arrays_Examples;

import java.util.ArrayList;

public class _04_separate_even_odd_numbers
{
    public static void main(String[] args)
    {
        int array[] = {1, 2, 3, 4, 5};

        ArrayList<Integer> evenArray = new ArrayList<>();
        ArrayList<Integer> oddArray = new ArrayList<>();

        for(int i=1;i< array.length;i++)
        {
            if(array[i]%2!=0)
            {
                evenArray.add(i);
            }
            else
            {
                oddArray.add(i);
            }
        }

        System.out.println("Even Array: "+evenArray);
        System.out.println("Odd Array: "+oddArray);
    }
}
