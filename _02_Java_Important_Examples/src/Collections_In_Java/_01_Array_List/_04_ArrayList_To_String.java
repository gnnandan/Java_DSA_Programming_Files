package Collections_In_Java._01_Array_List;

import java.util.ArrayList;

public class _04_ArrayList_To_String
{
    public static void main(String[] args)
    {
        ArrayList<Object> data  = new ArrayList<>();
        data.add("zero");
        data.add("one");
        data.add("two");
        data.add("three");
        data.add("four");
        data.add("five");

        String stringData = data.toString();
        System.out.println(stringData);

        for(int i=0;i<stringData.length();i++)
        {
            System.out.print(stringData.charAt(i)+" ");
        }
    }
}
