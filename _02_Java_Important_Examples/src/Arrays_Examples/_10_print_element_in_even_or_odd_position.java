package Arrays_Examples;

import java.util.ArrayList;

public class _10_print_element_in_even_or_odd_position
{
    public static void main(String[] args)
    {
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7};
        ArrayList<Integer> evenData = new ArrayList<>();
        ArrayList<Integer> oddData = new ArrayList<>();

        int findingElement = 10;

        boolean flag = false;

        for (int data : arr)
        {
            if (data % 2 == 0)
            {
                evenData.add(arr[data]);
            } else
            {
                oddData.add(arr[data]);
            }
        }


        System.out.println("Even position data: " + evenData);
        System.out.println("Odd position data: " + oddData);

        if(evenData.contains(findingElement))
        {
            System.out.println("The finding element: "+findingElement+" present in even position");
        }
        else if(oddData.contains(findingElement))
        {
            System.out.println("The finding element: "+findingElement+" present in odd position");
        }
        else
        {
            System.out.println("The finding element: "+findingElement+" is not present in odd or even position");
        }
    }
}
