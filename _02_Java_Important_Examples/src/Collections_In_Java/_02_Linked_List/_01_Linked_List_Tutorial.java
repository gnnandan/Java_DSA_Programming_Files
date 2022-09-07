package Collections_In_Java._02_Linked_List;

import java.util.Iterator;
import java.util.LinkedList;

public class _01_Linked_List_Tutorial
{
    public static void main(String[] args)
    {
        //to create
        LinkedList<String> data = new LinkedList<>();

        //to add element
        data.add("zero");
        data.add("one");
        data.add("two");
        data.add("three");
        data.add("four");
        data.add("five");

        //adding elements at first and last
        data.addFirst("1");
        data.addLast("6");

        System.out.println("Initial Elements: "+data);
        System.out.println();

        //access the elements
        System.out.println(data.get(1));
        System.out.println("accessing the first element: "+data.getFirst());
        System.out.println("accessing the last element: "+data.getLast());

        //updating
        data.set(1,"ONE");
        data.set(3,"THREE");

        //remove
        data.remove(4);
        data.removeFirst();
        data.removeLast();

        System.out.println("<<< Way 1 Element Iteration >>>");
        //iterate over arraylist
        for(String elements:data)
        {
            System.out.println(elements);
        }

        System.out.println("<<< Way 2 Element Iteration >>>");
        Iterator<String> iteration = data.iterator();
        while(iteration.hasNext())
        {
            System.out.println(iteration.next());
        }
    }
}
