package Collections_In_Java._01_Array_List;

import java.util.ArrayList;

public class _03_ArrayList_To_Array
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

        Object[] array = new Object[data.size()];
        data.toArray(array);

        for(Object element:array)
        {
            System.out.println(element);
        }
    }
}
