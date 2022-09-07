package _8_Arrays._2_Multi_Dimensional_Array;

public class _2_looping_over_Multi_dimensional_array
{
    public static void main(String[] args)
    {
        int data[][] = {{1, 2, 3, 4, 5, 6, 7}, {10, 20, 30, 40, 50, 60, 70}}; //single line declaration, object creation, initialization

        //way 1
        for (int i = 0; i < data.length; i++)
        {
            for (int j = 0; j < data[i].length; j++)
            {
                System.out.println("In [row] and [column]: " + i + " " + j + " : " + data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//output
//In [row] and [column]: 0 0 : 1
//In [row] and [column]: 0 1 : 2
//In [row] and [column]: 0 2 : 3
//In [row] and [column]: 0 3 : 4
//In [row] and [column]: 0 4 : 5
//In [row] and [column]: 0 5 : 6
//In [row] and [column]: 0 6 : 7
//
//In [row] and [column]: 1 0 : 10
//In [row] and [column]: 1 1 : 20
//In [row] and [column]: 1 2 : 30
//In [row] and [column]: 1 3 : 40
//In [row] and [column]: 1 4 : 50
//In [row] and [column]: 1 5 : 60
//In [row] and [column]: 1 6 : 70