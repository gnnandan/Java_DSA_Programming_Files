package _8_Arrays._2_Multi_Dimensional_Array;

import java.util.Scanner;
public class _3_taking_input_in_multi_dimensional_array
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the row size of array: ");
        int row_size = input.nextInt();
        System.out.print("Enter the column size of array: ");
        int column_size = input.nextInt();

        int element[][] = new int[row_size][column_size];
        for (int i = 0; i < element.length; i++)
        {
            for (int j = 0; j < element[i].length; j++)
            {
                System.out.print("Enter element at row: " + i + " and column: "+j+" = ");
                element[i][j]= input.nextInt();
            }
        }

        //display element
        for (int i = 0; i < element.length; i++)
        {
            for (int j = 0; j < element[i].length; j++)
            {
                System.out.print(element[i][j]+" ");
            }
            System.out.println();
        }
    }
}
//output
//1 2 3
//11 22 33