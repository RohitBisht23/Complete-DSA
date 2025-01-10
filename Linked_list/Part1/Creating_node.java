/*  LINKED LIST(part 1)
Creating linked list
 */

public class Creating_node {
    public static class Node{
        int data;
        Node next;

        //constructor
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node Tail;
    public static void main(String[] args)
    {
        Creating_node LL = new Creating_node(10);
        LL.head = new Node(1);
        LL.head.next = new Node(2);
    }
    
}
