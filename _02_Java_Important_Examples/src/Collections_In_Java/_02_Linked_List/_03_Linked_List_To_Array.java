package Collections_In_Java._02_Linked_List;

import java.util.LinkedList;

public class _03_Linked_List_To_Array
{
    public static void main(String[] args)
    {
        LinkedList<Object> data = new LinkedList<>();
        data.add("zero");
        data.add("one");
        data.add("two");
        data.add("three");
        data.add("four");
        data.add("five");

        data.toArray();
        for(Object array:data)
        {
            System.out.println(array);
        }
    }
}
