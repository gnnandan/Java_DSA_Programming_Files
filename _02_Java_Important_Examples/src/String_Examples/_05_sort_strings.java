package String_Examples;

import java.util.Arrays;

public class _05_sort_strings
{
    public static void main(String[] args)
    {
        String data[] = {"Mango", "Cherry", "Apple", "Banana", "Orange"};

        for (int i = 0; i < data.length - 1; i++)
        {
            for (int j = i + 1; j < data.length; j++)
            {
                if (data[i].compareToIgnoreCase(data[j]) > 0)
                {
                    String temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        System.out.println("The sorted string array is: "+ Arrays.toString(data));
    }
}
