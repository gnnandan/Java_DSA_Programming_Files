package _10_Collection_Framework._2_List_Interface._1_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class _2_arraylist_inbuilt_methods
{
    public static void main(String[] args)
    {
        //Declaring the array list
        ArrayList<String> data = new ArrayList<>();

        //add()
        data.add("aaa");
        data.add("bbb");
        data.add("ccc");
        data.add("ddd");
        data.add("eee");

        //clone()
        System.out.println(data.clone());

        //contains()
        System.out.println(data.contains("aaa"));

        //equals()
        System.out.println(data.equals("aaa"));

        //get()
        System.out.println(data.get(2));

        //getClass()
        System.out.println(data.getClass());

        //indexOf()
        System.out.println(data.indexOf("ccc"));

        //isEmpty()
        System.out.println(data.isEmpty());

        //lastIndexOf()
        System.out.println(data.lastIndexOf("ccc"));

        //set();
        System.out.println(data.set(4,"eee"));
        System.out.println("After setting the element: "+data);

        //size()
        System.out.println(data.size());

        //subList()
        System.out.println(data.subList(0,2));

        //data.toArray();
        Object info[] = data.toArray();
        System.out.println(Arrays.toString(info));

        //toString()
        System.out.println(data.toString());

        //trimToSize()
        data.trimToSize();
        System.out.println("After trimming the size: "+data);

        //remove()
        data.remove("eee");
        System.out.println("After removing data: "+data);

        //clone()
        System.out.println( data.clone());

        //removeAll()
        data.removeAll(data);
        System.out.println(data);

        //clear()
        data.clear();
        System.out.println(data);
    }
}
