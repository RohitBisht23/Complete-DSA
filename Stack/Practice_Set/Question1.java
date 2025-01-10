/*
Palindrome Linked list
We have a singly linked list of characters, write a function that returns true if the given list is
 a palindrome , else false

 ex: A->B->c->B->A->
 output:true;
 */
import java.util.Stack;
public class Question1 {
    public static class Node{
        char ch;
        Node next;

        Node(char ch)
        {
            this.ch = ch;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addLast(char ch)
    {
        Node newnode = new Node(ch);
        if(head == null)
        {
            head = tail = newnode;
            return;
        }

        tail.next = newnode;
        tail = newnode;
    }

    public void Print()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.ch+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public boolean isPalindrome(Node head)
    {
        Node slow = head;
        boolean isPalin = true;
        Stack<Character>s =  new Stack<>();

        while(slow != null){
            s.push(slow.ch);
            slow = slow.next;
        }

        while(head != null)
        {
            int i = s.pop();
            if(head.ch == i)
            {
                isPalin = true;
            }else{
                isPalin = false;
                break;
            }
            head = head.next;
        }
        return isPalin;
    }
    public static void main(String args[])
    {
        Question1 l = new Question1();
        l.addLast('A');
        l.addLast('B');
        l.addLast('C');
        l.addLast('B');
        l.addLast('A');
        l.addLast('A');

        // l.Print();
        // System.out.println(l.mid(head).ch);
        System.out.println(l.isPalindrome(head));
    }
    
}
