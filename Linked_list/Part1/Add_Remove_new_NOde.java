/*ADD IN LINKED LIST
Adding new node 
1->Add first
2->Add last
 */
public class Add_Remove_new_NOde {
    public static lass Node{
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
    public static int size;

    //Methods->add in linked list
    //1->Add at first
    public void addFirst(int data)
    {
        //Step 1:Create a new node
        Node newNode = new Node(data);
        size++; //Here when new node created when size value will be increamented by 1
        //when linked list is empty
        if(head == null)
        {
            head = tail = newNode; //Head and tail both points to only one node
        }
        //Step 2:newNode's next = head
        newNode.next = head;

        //Step 3:Head = newNode
        head = newNode;
    }

    //2->Add at last of the list
    public void addLast(int data)
    {
        //Step 1:Create a newNode
        Node newNode = new Node(data);
        size++;

        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        //Step 2:Tail node's next point to newNode
        tail.next = newNode;

        //Step 3:Tail should point to last node i.e newNode
        tail = newNode;
    }

    //secong method :Print a Linked List
    public void PrintLL()
    {   
        Node ptr = head;
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        while(ptr != null)
        {
            System.out.print(ptr.data+"->");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    //Forth method:->Add at middle of the list
    public void addMiddle(int idx,int data)
    {   
        //When no node is present
        if(idx == 0)
        {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i < idx-1)
        {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }


    //REMOVE IN LINKED LIST
    //1->Remove at first
    public int removeFirst()
    {
        if(size == 0)//No Node is present
        {
            System.out.println("There is no Node to delete");
            return Integer.MAX_VALUE;//infinity value has returned also can be -infinity.
        }else if(size == 1)//only one Node present
        {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int temp = head.data;
        head = head.next;//There is no way to access the previous Node in singly LL
        size--;
        return temp;
    }

    //2:->Remove at last
    public int removeLast()
    {
        if(size == 0)
        {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size --;
            return val;
        }

        int i=0; 
        Node temp = head;
        while(i < size -2)
        {
            temp = temp.next;
            i++;
        }
        int val = tail.data; //temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;

    }
    public static void main(String[] args)
    {
        Add_Remove_new_NOde LL = new Add_Remove_new_NOde();
        LL.PrintLL();
        LL.addFirst(1);
    
        LL.addFirst(2);
        

        LL.addLast(3);
       
        LL.addLast(4);
        

        LL.addMiddle(1,9);
        LL.PrintLL();
        System.out.println("the sieze of the linked list:"+LL.size);//only size for print can also work instead LL.size
        
        LL.removeFirst();
        LL.PrintLL();
        System.out.println("the sieze of the linked list:"+LL.size);//only size for print can also work instead LL.size


        LL.removeLast();
        LL.PrintLL();
        System.out.println("the sieze of the linked list:"+LL.size);//only size for print can also work instead LL.size
    }
}
