//Zig Zag Linked List
/*
For a linked lust of the form:L(1)->L(2)->L(3)->L(4)->....L(n-1)->L(n),convert it into a zig zag form
i.e:L(1)->L(n)->L(2)->L(n-1)->L(3)->L(n-2)....
ex:  1->2->3->4->5
output:1->5->2->4->3
 */
public class zig_zag_linked_list {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void Print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.err.println("null");
    }

    private Node getmid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;// Mid node
    }

    public void Zig_zag() {
        // getMid
        Node mid = getmid(head);

        // @2nd half reverse
        Node curr = mid.next;
        mid.next = null;

        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node LeftHead = head;
        Node RightHead = prev;
        // Alternate mergind
        Node nextL;
        Node nextR;
        while (LeftHead != null && RightHead != null) {
            nextL = LeftHead.next;
            nextR = RightHead.next;

            LeftHead.next = RightHead;
            RightHead.next = nextL;

            LeftHead = nextL;
            RightHead = nextR;
        }

    }

    public static void main(String[] args) {
        zig_zag_linked_list ll = new zig_zag_linked_list();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.Print();
        ll.Zig_zag();
        ll.Print();
    }
}