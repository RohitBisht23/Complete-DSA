/*  Search(Iterative)
Search for a key in linked list. Return the position where it is found, if not
return -1.
 */
public class Search_key_Iterative {
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
    public void addFirst(int data)
    {   
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

  /*   public int findKey(int key)
    {
        if(head == null)
        {
            return -1;
        }

        Node temp;
        int i;
        for(temp = head,i=0; temp != null; temp= temp.next,i++)
        {
            if(temp.data == key)
            {
                return i;
            }
        }
        return -1;
    }
 */
    /*Note:only by recursiveSearch function we cant perform the recursion 
    so we'll use helper function*/

    public int helper(Node head,int key)
    {
        //Base case
        if(head == null)
        {
            return -1;
        }

        if(head.data == key)
        {
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1)
        {
            return -1;
        }
        return idx + 1;
    }

    public int recursiveSearch(int key)
    {   
        return helper(head,key);
    }
    public static void main(String[] args)
    {
        Search_key_Iterative ll = new Search_key_Iterative();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);

        // int result = ll.findKey(4);
        int result  = ll.recursiveSearch(4);
        System.out.println("Key found at index:"+result);
    }
}
