package _10_Collection_Framework._1_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _1_List_Implementation
{
    public static void main(String[] args)
    {
        List<String> data = new ArrayList<>(); //declaring a list

        //adding the elements to the list
        data.add("Java");
        data.add("C++");
        data.add("Python");
        data.add("C");

        //printing the elements
        System.out.println("The elements of the list: "+data);

        //iterating the list way - 1
        for(String datas:data)
        {
            System.out.print(datas + " ");
        }

        System.out.println();

        //iterating the list way - 2
        Iterator<String> iterate = data.iterator();
        while(iterate.hasNext())
        {
            System.out.print(iterate.next()+" ");
        }

        System.out.println();

        //iterating the list way - 3
        for(int i=0;i< data.size();i++)
        {
            System.out.print(data.get(i)+" ");
        }

        System.out.println();

        //accessing the elements in list
        System.out.println(data.get(2));

        //updating the element in list
        String ele = "C Programming";
        data.set(3, ele);
        System.out.println("Printing the list after updating: "+data);

        //deleting the element in list
        String del = data.remove(2);
        System.out.println("After deleting the element in a list: "+data);
    }
}
