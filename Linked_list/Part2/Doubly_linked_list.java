/*
Double linked list
 */
public class Doubly_linked_list {
    public static class Node 
    {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;
   
    //Add last
    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
            size++;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        size++;
        tail = newNode;
    }

    //printing:->forward and backward 
    public void Print()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");

        //backward traverse
        Node bt = tail;
        while(bt != null)
        {
            System.out.print(bt.data+"->");
            bt = bt.prev;
        }
        System.err.println("null");
    }

    //Add first
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
            size++;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        size++;
        head = newNode;
    }

    //Remove first
    public int removeFirst()
    {
        if(size == 0)
        {
            System.out.println("Nothing to delete");
            return 0;
        }else if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    //remove last
    public int removeLast()
    {
        if(size == 0)
        {
            System.out.println("Nothing to delete");
            return 0;
        }else if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        Node temp = head;
        int i = 0;
        while(i < size-2)
        {
            temp = temp.next;
            i++;
        } 
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    //Reversing Doubly Linked List
    public void reverse()
    {
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args)
    {
        Doubly_linked_list dl = new Doubly_linked_list();
        dl.addLast(1);
        dl.addLast(2);
        dl.addLast(3);
        dl.addLast(4);
        dl.addLast(5);
        dl.addLast(6);
        // System.out.println("size of the list:"+size);
        dl.Print();
        // System.out.println("size of the list:"+size);

        // dl.addFirst(0);
        // System.out.println("size of the list:"+size);
        // dl.Print();

        // dl.removeFirst();
        // System.out.println("size of the list:"+size);
        // dl.Print();

        // dl.removeLast();
        // System.out.println("size of the list:"+size);
        // dl.Print();

        dl.reverse();
        dl.Print();
    }
}
