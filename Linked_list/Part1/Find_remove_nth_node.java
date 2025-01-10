/*
Find and remove Nth node from End(iterative appraoch)
 */
public class Find_remove_nth_node {
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

    public void deleteNthNodeFromENd(int n)
    {
        //calculating size
        int size = 0;
        Node temp = head;
        while(temp != null)
        {
            temp = temp.next;
            size++;
        }

        //if we have to delete head node
        if(n == size)
        {
            head = head.next;
            return;
        }

        int i=1;
        int iToFind = size - n; //deleting node
        Node prev = head;
        while( i < iToFind)
        {
            prev = prev.next;
            i++;
        }
        prev.next= prev.next.next;
        return;
    }

    public static void main(String[] args)
    {   
        Find_remove_nth_node ll = new Find_remove_nth_node();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.PrintList();

        ll.deleteNthNodeFromENd(5);
        ll.PrintList();
    }
}
