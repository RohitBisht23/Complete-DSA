/*
Detect a loop/cycle in a linked list
 */

public class Detect_cycle_in_LL {
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

    public void AddTail(int data)
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

    public void Print()
    {
        Node temp = head;
        if(head == null)
        {
            System.out.println("Nothing to print");
            return;
        }
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //Checking is cycle present or not
    public boolean isCycle(){
        Node slow = head;
        Node fast = head;
        if(head == null)
        {
            System.out.println("Nothing in the linked list");
            return false;
        }

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
            {
                return true;//cycle exist
            }
        }
        return false;
    }

    //Creating cycle
    public void cycle(Node head,int pos)
    {
        Node temp = head;
        Node startNode = null;

        int count = 1;
        while(temp.next != null)
        {
            if(count == pos)
            {
                startNode = temp;
            }
            temp = temp.next;
            count++;
        }
        temp.next = startNode;
    }

    //Removing a cycle in a linked list if present
    public void removeCycle()
    {   
        //DEtect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow)
            {
                cycle = true;
                break;
            }
        }

        if(cycle == false)
        {
            return;
        }

        //Find meeting point
        slow = head;

        Node prev = null;
        while(slow != fast)
        {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }

        //Remove cycle
        prev.next = null;
    }
    public static void main(String[] args)
    {
        Detect_cycle_in_LL ll = new Detect_cycle_in_LL();
        ll.AddTail(0);
        ll.AddTail(1);
        ll.AddTail(2);
        ll.AddTail(3);
        ll.AddTail(4);
        ll.AddTail(5);
        ll.AddTail(6);
        ll.AddTail(7);
        ll.AddTail(8);
        ll.AddTail(9);

        ll.Print();
        ll.cycle(head,5);
        System.out.println("Cycle present:"+ll.isCycle());
        ll.removeCycle();
        // ll.Print();
        System.out.println("Cycle present:"+ll.isCycle());
    }
}
