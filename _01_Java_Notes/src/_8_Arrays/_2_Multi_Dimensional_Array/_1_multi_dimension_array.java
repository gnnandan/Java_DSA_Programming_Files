package _8_Arrays._2_Multi_Dimensional_Array;

public class _1_multi_dimension_array
{
    public static void main(String[] args)
    {
        //multi dimension array = declaration, object creation and initialization
        /*
         * declaration - datatype arrayName[][]
         * * * ex: int data[][]
         *
         * object creation - datatype arrayName[] = new datatype[size][size]
         * * * ex: int data[] = new int[2][2]
         *
         * initialization - arrayName[position][position] = elements.....
         * * * ex: data[0][0] = 10;
         * * * ex: data[1][1] = 20;
         * */

        int data[][] = new int[2][2];
        data[0][0] = 10;
        data[0][1] = 20;
        data[1][0] = 30;
        data[1][1] = 40;

        //accessing element
        for (int i = 0; i < data.length; i++)
        {
            for(int j=0;j<data[i].length;j++)
            {
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
    }
}
//output
//10 20
//30 40