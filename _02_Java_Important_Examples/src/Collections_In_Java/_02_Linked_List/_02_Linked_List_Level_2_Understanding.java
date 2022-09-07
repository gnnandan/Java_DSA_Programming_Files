package Collections_In_Java._02_Linked_List;

import java.util.LinkedList;
import java.util.Scanner;

//taking input in Linked List
public class _02_Linked_List_Level_2_Understanding
{
    public static void main(String[] args)
    {
        LinkedList<Object> data = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the linked list: ");
        int size = scanner.nextInt();

        System.out.println();

        System.out.print("Where do you want to insert the element [front or rare or sequence]: ");
        char c = scanner.next().charAt(0);

        System.out.println();

        for (int i = 0; i <= size; i++)
        {
            System.out.print("Enter the elements at position: "+i+" = ");
            Object object = scanner.next();
            if(c == 'f')
            {
                data.addFirst(object);
            }
            else if(c=='r')
            {
                data.addLast(object);
            }
            else if(c=='s')
            {
                data.add(object);
            }
            else
            {
                System.out.println("Please specify the input properly");
            }
        }
        System.out.println();
        System.out.println("Final elements after inserting from: "+c+" = "+data);
    }
}
