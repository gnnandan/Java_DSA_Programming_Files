package Collections_In_Java._02_Linked_List;

import java.util.LinkedList;

public class _04_Linked_List_To_Array
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
        String stringData = data.toString();
        for(int i=0;i<stringData.length();i++)
        {
            System.out.print(stringData.charAt(i)+" ");
        }

    }
}
