/*
Swapping Nodes in a Linked list
We have a Linked list and two keys in it, swap nodes for the given keys. Nodes should be swapped
by changing key links. Swapping data nodes may be expensive in many situation when data contains 
many fields. It may be assumed that all keys in the linked list are distinct.
ex:Input:1->2->3->4->  , keys: x = 2, y = 4
output:1->4->3->2
 */
import java.util.LinkedList;
public class Question3 {
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

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
        size++;
        tail = newNode;
    }

    //Printing the linked list
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
    public static void SwappingKeys(Node head, int x , int y)
    {
        Node curr = head;
        Node prev = null;

        while(curr != null)
        {
            for(int i=1; i<x && curr != null; i++)
            {
                prev = curr;
                curr = curr.next;
            }

            for(int i=0; i<y-x && curr != null; i++)
            {
                curr = curr.next;
            }

            //changing links
            if(prev != null && curr != null)
            {
                Node temp = prev.next;
                curr.next = temp.next;
                prev.next = curr;
                temp.next = temp;     
            }
        }
        
    }
    public static void main(String[] args)
    {
        Question3 list = new Question3();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        //Keys:Note that these keys are Node number not the data
        int x = 2;
        int y = 4;

        // list.Print();
        list.SwappingKeys(head,x,y);
        list.Print();
    }
}
