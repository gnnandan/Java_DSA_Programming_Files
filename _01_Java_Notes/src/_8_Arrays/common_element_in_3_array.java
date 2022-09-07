package _8_Arrays;

import sun.swing.BakedArrayList;

import java.util.ArrayList;

public class common_element_in_3_array
{
    public static void main(String[] args)
    {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {2, 3, 1};
        int[] arr3 = {2, 3, 4, 5, 4};

        int i = 0;
        int j = 0;
        int k = 0;

        ArrayList<Integer> ele = new ArrayList<>();

        while (i < arr1.length && j < arr2.length && k < arr3.length)
        {
            if(arr1[i] ==arr2[j]&&arr2[j]==arr3[k])
            {
//                System.out.println(arr1[i]+" ");
                ele.add(arr1[i]);
                i++;
                j++;
                k++;
            }
            else if(arr1[i]<arr2[j])
            {
                i++;
            }
            else if (arr2[j]<arr3[k])
            {
                j++;
            }
            else
            {
                k++;
            }
        }

        System.out.println("The common element in 3 sorted array: "+ele);
    }
}
