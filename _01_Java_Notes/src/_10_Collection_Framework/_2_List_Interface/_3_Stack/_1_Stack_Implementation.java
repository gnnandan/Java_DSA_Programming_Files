package _10_Collection_Framework._2_List_Interface._3_Stack;

import java.util.Iterator;
import java.util.Stack;

public class _1_Stack_Implementation
{
    public static void main(String[] args)
    {
        //declaring the stack
        Stack<String> data = new Stack<>();

        //adding element into the stack
        data.push("AAA");
        data.push("BBB");
        data.push("CCC");
        data.push("DDD");
        data.push("EEE");

        //printing the element
        System.out.println(data);

        //iterating the elements - way 1
        for (int i = data.size() - 1; i >= 0; i--)
        {
            System.out.print(data.get(i) + " ");
        }

        System.out.println();

        //iterating the elements - way 2
        Iterator<String> element = data.iterator();
        while (element.hasNext())
        {
            System.out.print(element.next() + " ");
        }

        System.out.println();

        //searching the element
        System.out.println(data.search("CCC"));

        //returns the top element
        System.out.println(data.peek());

        //return the size
        System.out.println(data.size());

        //updating the element
        data.set(3, "ddd");
        data.setElementAt("aaa", 0);
        System.out.println("After updating the element - " + data);

        //remove the element from the top
        System.out.println(data.pop());
    }
}
