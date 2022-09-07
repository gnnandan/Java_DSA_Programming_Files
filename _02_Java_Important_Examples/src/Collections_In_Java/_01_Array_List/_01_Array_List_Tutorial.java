package Collections_In_Java._01_Array_List;

import java.util.ArrayList;
import java.util.Iterator;

public class _01_Array_List_Tutorial
{
    public static void main(String[] args)
    {
        //to create
        ArrayList<String> data = new ArrayList<>();

        //to add element
        data.add("zero");
        data.add("one");
        data.add("two");
        data.add("three");
        data.add("four");
        data.add("five");

        System.out.println("Initial Elements: "+data);
        System.out.println();

        //accessing arraylist element
        System.out.println(data.get(2));
        System.out.println(data.get(5));

        //updating arraylist element
        data.set(1,"ONE");
        data.set(2,"TWO");

        //to delete
        data.remove(4);

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
