public class Check_palidrome {
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

    //Function to find the middle node of the list:step 1
    public Node middle(Node head)
    {   
        
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public boolean checkPalindrom()
    {
        //Base case
        if(head == null || head.next == null)
        {
            return true;
        }
        //step 1:find middle node
        Node middleNode = middle(head);

        //step 2:reverse right half
        Node prev = null;
        Node curr = middleNode;
        Node Next;
        while(curr != null)
        {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }

        Node right = prev; //Right half head
        Node left = head; //Left hald head

        //Step 3:check left half and right half
        while(right != null)
        {
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args)
    {   
        Check_palidrome ll = new Check_palidrome();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        ll.addLast(5);
        
        
        System.err.println(ll.checkPalindrom());
    }
}
