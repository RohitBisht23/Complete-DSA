/*
In a system there are two singly linked list. By some programming error, the end node of one of the 
list got linked to other list, forming an inverted Y-shaped list. 
Write a program to get the point where two list got merged.
 */
import java.util.LinkedList;
public class Question1 {
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public Node getInterSectionNode(Node head1,Node head2)
    {
        while(head2 != null)
        {
            Node temp = head1;
            while(temp != null)
            {
                if(temp == head2)
                {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }
    public static void main(String[] args) {
       Question1 list = new Question1();
       Node head1 = new Node(1);
       head1.next = new Node(2);
       head1.next.next = new Node(3);
       head1.next.next.next = new Node(6);

       Node head2 = new Node(4);
       head2.next = new Node(5);

       head2.next.next = head1.next.next.next; //Settinf the intersection point

       head1.next.next.next.next = new Node(7);


       Node interSectionPoint = list.getInterSectionNode(head1,head2);

       if(interSectionPoint == null)
       {
        System.out.println("Intersection point does not exists");
       }else{
        System.out.println("Intersection Node is:"+interSectionPoint.data);
       }

       Node temp = head1;
       System.out.print("list 1:");
       while(temp != null)
       {
        System.out.print(temp.data+"->");
        temp = temp.next;
       }
       System.out.println("null");
      
       Node temp2 = head2;
       System.out.print("list 2:");
       while(temp2 != null)
       {
        System.out.print(temp2.data+"->");
        temp2 = temp2.next;
       }
       System.out.println("null");
    }
}
