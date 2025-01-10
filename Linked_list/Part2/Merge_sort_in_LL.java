/*
Merge sort in linked list
 */
import java.util.LinkedList;


public class Merge_sort_in_LL {
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

    private static Node getMid(Node head)
    {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public  Node mergeSort(Node head)
    {
        //Base case
        if(head == null || head.next == null)
        {
            return head;
        }

        //Mid
        Node mid = getMid(head);

        //Divide into two pieces :1->left half and 2->right half
        // Node lefthead = head;
        Node rightHead = mid.next;

        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft , newRight);//final LL head returning
    }

    private Node merge(Node head1,Node head2)
    {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null)
        {
            if(head2.data <= head1.data)
            {
                temp.next = head2;
                head2 = head2.next;
            }else{
                temp.next = head1;
                head1 = head1.next;
            }
            temp = temp.next;
        }
        while(head1 != null)
        {
            temp.next = head1;
            temp = temp.next;
            head1 = head1.next;
        }

        while(head2 != null)
        {
            temp.next = head2;
            temp = temp.next;
            head2 = head2.next;
        }
        mergedLL = mergedLL.next;
        return mergedLL;

    }

    public void Print()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args)
    {
        Merge_sort_in_LL ll = new Merge_sort_in_LL();
        ll.addLast(5);
        ll.addLast(1);
        ll.addLast(3);
        ll.addLast(8);
        ll.addLast(9);
        ll.Print();
        head = ll.mergeSort(head);
        /*asigning the new sorted list head(returned by mergeSort)
         to head so it will be updated*/
        ll.Print();
    }
}
