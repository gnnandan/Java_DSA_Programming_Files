package Arrays_Examples;

import java.util.Arrays;

public class _09_concat_2_arrays
{
    public static void main(String[] args)
    {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7};
        int arr2[] = {11, 22, 33, 44, 55, 66, 77};

        int alen = arr1.length;
        int blen = arr2.length;
        int newArr[] = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, newArr, 0, alen);
        System.arraycopy(arr2,0,newArr,alen,blen);
    }
}
