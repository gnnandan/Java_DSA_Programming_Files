package _10_Collection_Framework._2_List_Interface._2_LinkedList;

import java.util.LinkedList;

public class _2_linkedlist_inbuilt_methods
{
    public static void main(String[] args)
    {
        //Declaring the array list
        LinkedList<String> data = new LinkedList<>();

        //adding element to the arraylist
        //add(), addFirst(), addList()
        data.add("aaa");
        data.add("bbb");
        data.add("ccc");
        data.add("ddd");
        data.add("eee");
        data.addFirst("AAA"); //addFirst()
        data.addLast("EEE"); //addLast()

        System.out.println("After adding the elements in the linked-list: "+data);

        //contains()
        System.out.println(data.contains("AAA"));

        //equals()
        System.out.println(data.equals("aaa"));

        //get(), getFirst(), getLast()
        System.out.println(data.get(2));
        System.out.println(data.getFirst());
        System.out.println(data.getLast());

        //getClass()
        System.out.println(data.getClass());

        //indexOf()
        System.out.println(data.indexOf("AAA"));

        //lastIndexxOf()
        System.out.println(data.lastIndexOf("BBB"));

        //offer() - add element to the last
        System.out.println(data.offer("111"));
        System.out.println(data.offerFirst("000")); //offerFirst()
        System.out.println(data.offerLast("777")); //offerLast()

        //peek() - Retrieves, but does not remove, the head (first element) of this list.
        System.out.println(data.peek());
        System.out.println(data.peekFirst()); //peekFirst()
        System.out.println(data.peekLast()); //peekLast()

        //pool() - Retrieves and removes the head (first element) of this list.
        System.out.println(data.poll());
        System.out.println(data.pollFirst()); //pollFirst() - Retrieves and removes the first element of this list, or returns null if this list is empty.
        System.out.println(data.pollLast()); //pollLast() - Retrieves and removes the last element of this list, or returns null if this list is empty.

        //push() - add element at first
        data.push("888");
        System.out.println("After pushing the element: "+data);

        //pop()
        data.pop();
        System.out.println("After popping the element: " + data);

        //remove(), removeFirst(), removeList(), removeFirstOccurrence(), removeListOccurrence()
        System.out.println(data.remove("aaa"));
        System.out.println(data.removeFirst());
        System.out.println(data.removeLast());
        System.out.println(data.removeFirstOccurrence("aaa"));
        System.out.println(data.removeLastOccurrence("111"));


        System.out.println("After remove all elements: "+data);
        
        //element()
        System.out.println(data.element());

        //final elements
        System.out.println("The final elements are: "+data);
    }
}
