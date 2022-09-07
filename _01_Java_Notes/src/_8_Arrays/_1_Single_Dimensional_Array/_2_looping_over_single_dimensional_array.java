package _8_Arrays._1_Single_Dimensional_Array;

public class _2_looping_over_single_dimensional_array
{
    public static void main(String[] args)
    {
        int data[] = {10, 20, 30, 40, 50, 60, 70}; //single line declaration, object creation, initialization

        //way 1
        for (int i = 0; i < data.length; i++)
        {
            System.out.println("Element at position : "+i+": "+data[i]+" ");
        }

        //way 2
        for(int i: data)
        {
            System.out.println("Element "+ i);
        }
    }
}
//output
//Element at position : 0: 10
//Element at position : 1: 20
//Element at position : 2: 30
//Element at position : 3: 40
//Element at position : 4: 50
//Element at position : 5: 60
//Element at position : 6: 70
//Element 10
//Element 20
//Element 30
//Element 40
//Element 50
//Element 60
//Element 70
