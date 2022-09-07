package Arrays_Examples;

public class _02_find_frequency_of_element
{
    public static void main(String[] args)
    {
        int array[] = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};

        int frequency[] = new int[array.length];

        int visited = -1;
        for(int i=0;i< array.length;i++)
        {
            int count =0;
            for(int j=i+1;j< array.length;j++)
            {
                if(array[i]==array[j])
                {
                    count++;

                    //to avoid counting same element again and again
                    frequency[j] = visited;
                }
            }
            if(frequency[i]!=visited)
            {
                frequency[i] = count;
            }
        }
//Displays the frequency of each element present in array
        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for(int i = 1; i < frequency.length; i++){
            if(frequency[i] != visited)
                System.out.println("    " + frequency[i] + "    |    " + frequency[i]+" times");
        }
        System.out.println("----------------------------------------");
    }
}
