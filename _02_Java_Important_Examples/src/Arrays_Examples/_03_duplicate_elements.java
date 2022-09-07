package Arrays_Examples;

import java.util.ArrayList;

/*ISSUE: When the element is continuous it is not considering as one time repetition */
public class _03_duplicate_elements
{
    public static void main(String[] args)
    {
        int array[] =  {1, 2, 3, 4, 2, 7, 8, 5, 8, 3};

        ArrayList<Integer> duplicateArray = new ArrayList<>();
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j< array.length;j++)
            {
                if(array[i]==array[j])
                {
                    duplicateArray.add(array[j]);
                }
            }
        }
        System.out.println("The duplicate elements: "+ duplicateArray);
    }
}
