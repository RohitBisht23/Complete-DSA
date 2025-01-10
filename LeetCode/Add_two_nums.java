public class Add_two_nums {
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
    public static void main(String[] args)
    {
        Add_two_nums l1 = new Add_two_nums();
        l1.AddTail(2);
        l1.AddTail(4);
        l1.AddTail(3);

        Add_two_nums l2 = new Add_two_nums();
        l2.AddTail(5);
        l2.AddTail(6);
        l2.AddTail(4);
        
        l1.Print();
        l2.Print();
    }
}
