package _10_Collection_Framework._2_List_Interface._1_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class _1_arraylist_implementation
{
    public static void main(String[] args)
    {
        //Declaring the array list
        ArrayList<String> data = new ArrayList<>();

        //adding element to the arraylist
        data.add("aaa");
        data.add("bbb");
        data.add("ccc");
        data.add("ddd");
        data.add("eee");

        //printing the elements
        System.out.println(data);

        //iterating the element way 1
        for(String s: data)
        {
            System.out.print(s+" ");
        }

        System.out.println();

        //iterating the element way 2
        for(int i=0;i<data.size();i++)
        {
            System.out.print(data.get(i)+" ");
        }

        System.out.println();

        //iterating the element way 3
        Iterator<String> elements = data.iterator();
        while(elements.hasNext())
        {
            System.out.print(elements.next()+" ");
        }

        //accessing the element in a arraylist
        System.out.println(data.get(0));

        //updating the element in a arraylist
        data.set(0,"AAA");
        System.out.println(data);

        //removing the element
        data.remove("AAA");
        System.out.println("After removing the element in a arraylist: "+data);


    }
}
