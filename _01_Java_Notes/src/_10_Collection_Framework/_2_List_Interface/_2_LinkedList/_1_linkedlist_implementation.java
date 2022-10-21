package _10_Collection_Framework._2_List_Interface._2_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class _1_linkedlist_implementation
{
    public static void main(String[] args)
    {
        //declaring the linked-list
        LinkedList<String> data = new LinkedList<>();

        //adding element to the linked-list addFirst, addList, add
        data.add("AAA"); //adding element
        data.add("BBB");
        data.add("CCC");
        data.addFirst("DDD"); //adding element at first
        data.addLast("EEE"); //adding element at last

        //printing
        System.out.println(data);

        //iterating element way 1
        for(String info:data)
        {
            System.out.print(info+" ");
        }

        System.out.println();

        //iterating element way 2
        Iterator<String> iterate = data.iterator();
        while ((iterate.hasNext()))
        {
            System.out.print(iterate.next());
        }

        System.out.println();

        //iterating element way 3
        for(int i=0;i<data.size();i++)
        {
            System.out.print(data.get(i));
        }

        //accessing the element
        System.out.println(data.get(2)); //access based on the index
        System.out.println(data.getFirst()); //access the first element
        System.out.println(data.getLast()); //access the last element

        //updating the element
        System.out.println(data.set(3,"BBB"));
        System.out.println("After updating the list: "+data);

        //removing the element
        System.out.println(data.removeFirst()); //removing element at first
        System.out.println(data.removeLast()); //removing element at last
        System.out.println(data.remove(0));
        System.out.println(data.remove("BBB"));

        //the elements
        System.out.println(data);
    }
}
