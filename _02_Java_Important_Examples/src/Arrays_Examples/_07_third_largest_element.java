package Arrays_Examples;

public class _07_third_largest_element
{
    public static void main(String[] args)
    {
        int arr[] = {1,2,5,6,3,2};
        int total = arr.length;

        int thirdLargest = addInfo(arr,total);
        System.out.println("The third largest element is: "+thirdLargest);
    }

    static int addInfo(int arr[], int total)
    {
        int temp;
        for(int i=0;i<total;i++)
        {
            for(int j=i+1;j<total;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[total-3];
    }
}
