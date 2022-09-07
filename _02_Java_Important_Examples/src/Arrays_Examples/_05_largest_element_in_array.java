package Arrays_Examples;
public class _05_largest_element_in_array
{
    public static void main(String[] args)
    {
        int array[] = {25, 11, 7, 75, 56};

        int max = array[0];

        for(int i=0;i< array.length;i++)
        {
            if(array[i]>max)
            {
                max = array[i];
            }
        }
        System.out.println("The largest element in an array: "+max);
    }
}
