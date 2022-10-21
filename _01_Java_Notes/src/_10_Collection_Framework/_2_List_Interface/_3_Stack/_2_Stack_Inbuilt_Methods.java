package _10_Collection_Framework._2_List_Interface._3_Stack;

import java.util.Stack;

public class _2_Stack_Inbuilt_Methods
{
    public static void main(String[] args)
    {
        Stack<String> data = new Stack<>();

        //push()
        data.push("AAA");
        data.push("BBB");
        data.push("CCC");
        data.push("DDD");
        data.push("EEE");

        //pop()
        System.out.println("Popping the element - "+data.pop());

        //peek()
        System.out.println("Peeking the element - "+data.peek());

        //search()
        System.out.println("Searching - "+data.search("DDD"));

        //set()
        data.set(2,"ccc");
        System.out.println("After setting/updating - "+data);

        //setElementAt()
        data.setElementAt("ddd",3);
        System.out.println("After setting/updating at desired position - "+data);

        //setSize()
        System.out.println("Before setting the stack size - "+data.size());
        data.setSize(5);
        System.out.println("After setting new size of stack - "+data.size());

        //lastIndexOf()
        System.out.println("The last element of a stack - "+data.lastIndexOf("ddd"));

        //elementAt()
        System.out.println("Retrieved element - "+data.elementAt(3));

        //contains()
        System.out.println("checking presence of element - "+data.contains("ccc"));

        //capacity();
        System.out.println("capacity of a stack - "+data.capacity());

        //indexOf();
        System.out.println("index of a element - "+data.indexOf("AAA"));

        //getclass()
        System.out.println("class which we are working on - "+data.getClass());

        //isEmpty()
        System.out.println("Checking whether the stack is empty - "+data.isEmpty());
    }
}
