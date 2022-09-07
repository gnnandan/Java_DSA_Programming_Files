package Arrays_Examples;
public class _06_smallest_element_in_array
{
    public static void main(String[] args)
    {
        int array[] = {44,66,99,77,33,22,55,11};

        int min = array[0];

        for(int i=1;i< array.length;i++)
        {
            if(min>array[i])
            {
                min = array[i];
            }
        }
        System.out.println("The smallest element in an array: "+min);
    }
}
