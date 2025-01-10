//Stack implementation using Linked List

public class Stack_using_LL {
    static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{
        static Node head = null;

        //isEmpty()
        static boolean isEmpty()
        {
            return head == null;
        }

        //push
        static void push(int data)
        {
            Node newnode = new Node(data);
            if(head == null)
            {
                head = newnode;
                return;
            }

            newnode.next = head;
            head = newnode;
        }

        static int pop()
        {
            if(head == null)
            {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        //peel()
        static int peek()
        {
            if(head == null)
            {
                return -1;
            }

            return head.data;
        }
    }
    public static void main(String[] args)
    {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
