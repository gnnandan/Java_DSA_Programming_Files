package _8_Arrays._1_Single_Dimensional_Array;

import java.util.Arrays;
import java.util.Scanner;
public class _3_taking_input_in_single_dimensional_array
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = input.nextInt();

        int element[] = new int[size];
        for (int i = 0; i < size; i++)
        {
            System.out.print("Enter element at: "+i+" = ");
            element[i] = input.nextInt();
        }

        System.out.println("The elements are: "+ Arrays.toString(element));
    }
}
//output
//Enter the size of array: 2
//Enter element at: 0 = 10
//Enter element at: 1 = 20
//The elements are: [10, 20]