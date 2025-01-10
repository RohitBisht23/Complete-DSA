/*
Delete N nodes after M nodes of a linked list:
We have a linked list and two integers M or N.Traverse the linked list such that you retian M nodes
then delete next N nodes, continue the same till end of the linked list.Defficulty level:Rookie
 */

import java.util.LinkedList;

public class Question2 {
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
    public  Node removeNnode(Node head, int M, int N) {
        Node current = head;
        Node prev = null;

        while (current != null) {
            // Skip M nodes
            for (int i = 0; i < M && current != null; i++) {
                prev = current;
                current = current.next;
            }

            // Delete N nodes
            for (int i = 0; i < N && current != null; i++) {
                current = current.next;
            }

            // Link the previous node to the next node after N nodes
            prev.next = current;
        }

        return head;
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
        Question2 l = new Question2();
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        l.addLast(4);
        l.addLast(5);
        l.addLast(6);
        l.addLast(7);
        l.addLast(8);
        l.addLast(9);

        l.Print();
        l.removeNnode(head,3,2);

        l.Print();
    }   
}
