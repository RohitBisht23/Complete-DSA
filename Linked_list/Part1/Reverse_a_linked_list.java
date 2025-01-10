//Reverse a linked list(iterative approach)
public class Reverse_a_linked_list {
    public static class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public void addLast(int data)
    {   
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    } 

    public void PrintList()
    {   
        if(head == null)
        {
            System.out.println("Nothing to print");
            return;
        }

        
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp .next;
        }
        System.out.println("null");
    }

    //Reversing the list
    public void reverse()
    {   
        Node prev = null;
        Node curr = tail = head; //tail value is updated 
        Node Next;

        while(curr != null)
        {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        head = prev;
    }
    
    public static void main(String args[])
    {
        Reverse_a_linked_list ll = new Reverse_a_linked_list();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.PrintList();

        ll.reverse();
        ll.PrintList();
    }
}
