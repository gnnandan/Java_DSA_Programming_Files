package Collections_In_Java._01_Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_Array_List_Level_2_Understanding
{
    public static void main(String[] args)
    {
        Scanner element = new Scanner(System.in);
        System.out.print("Enter the size of arraylist: ");
        int size = element.nextInt();

        ArrayList<Object> data = new ArrayList<>(size);

        System.out.println("<<< Taking Int Elements Input >>>");
        //take int input
        for(int i=0;i<=size;i++)
        {
            System.out.print("Enter the int element at "+i+" ");
            int inputData = element.nextInt();
            data.add(inputData);
        }

        System.out.println("\nThe final Int data after taking input for size: "+size+" ="+data);

        System.out.println("<<< Taking String Elements Input >>>");
        //take int input
        for(int i=0;i<=size;i++)
        {
            System.out.print("Enter the String element at "+i+" ");
            String inputData = element.next();
            data.add(inputData);
        }
        System.out.println("\nThe final String data after taking input for size: "+size+" ="+data);
    }
}
