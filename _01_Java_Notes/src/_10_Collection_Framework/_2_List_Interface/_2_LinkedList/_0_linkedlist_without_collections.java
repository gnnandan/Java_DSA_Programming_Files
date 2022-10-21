package _10_Collection_Framework._2_List_Interface._2_LinkedList;

//class linkedlist
class LinkedList
{
    public class Node
    {
        int data;
        Node next;

        public Node(int d)
        {
            this.data = d;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data)
    {
        Node newNode = new Node(data);

        if (head == null)
        {
            head = newNode;
            tail = newNode;
        } else
        {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display()
    {
        Node current = head;

        if (head == null)
        {
            System.out.println("List is empty");
        }

        System.out.print("Nodes/Elements of Singly Linked List: ");
        while (current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
public class _0_linkedlist_without_collections
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addNode(50);

        list.display();
    }
}


