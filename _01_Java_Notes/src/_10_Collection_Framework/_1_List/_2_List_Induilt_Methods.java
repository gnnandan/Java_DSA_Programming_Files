package _10_Collection_Framework._1_List;

import java.util.ArrayList;
import java.util.List;

public class _2_List_Induilt_Methods
{
    public static void main(String[] args)
    {
        List<Character> data = new ArrayList<>();

        //add() - adding individual elements in the list
        data.add('a');
        data.add('b');
        data.add('c');
        data.add('d');

        //contains()
        System.out.println(data.contains('a'));

        //clear()
//        data.clear();
//        System.out.println(data);

        //equals()
        System.out.println(data.equals('c'));

        //get()
        System.out.println(data.get(3));

        //indexOf()
        System.out.println(data.indexOf('a'));

        //isEmpty()
        System.out.println(data.isEmpty());

        //remove()
        System.out.println(data.remove(0));

        //set()
        data.set(2,'A');
        System.out.println(data);

        //size();
        System.out.println(data.size());

        //getClass()
        System.out.println(data.getClass());
    }
}
