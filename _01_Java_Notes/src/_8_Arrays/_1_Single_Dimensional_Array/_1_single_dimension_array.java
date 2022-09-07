package _8_Arrays._1_Single_Dimensional_Array;

public class _1_single_dimension_array
{
    public static void main(String[] args)
    {
        //single dimension array = declaration, object creation and initialization
        /*
         * declaration - datatype arrayName[]
         * * * ex: int data[]
         *
         * object creation - datatype arrayName[] = new datatype[size]
         * * * ex: int data[] = new int[2]
         *
         * initialization - arrayName[position] = elements.....
         * * * ex: data[0] = 10;
         * * * ex: data[1] = 20;
         * */

        int data[] = new int[2];
        data[0] = 10;
        data[1] = 20;

        //accessing element
        for(int i=0;i< data.length;i++)
        {
            System.out.println(data[i]+" ");
        }
    }
}
//output
//10
//20