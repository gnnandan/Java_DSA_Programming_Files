package Arrays_Examples;

public class _12_transpose_of_matrix
{
    public static void main(String[] args)
    {
        int arr[][] = {{1, 2, 3}, {11, 22, 33}};

        display(arr);

        int row = 2;
        int column = 3;

        int transposeMatrix[][] = new int[column][row];

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                transposeMatrix[j][i] = arr[i][j];
            }
        }
        display(transposeMatrix);
    }

    static void display(int arr[][])
    {
        System.out.println("The matrix: ");
        for (int row[] : arr)
        {
            for (int column : row)
            {
                System.out.print(column + "   ");
            }
            System.out.println();
        }
    }
}
