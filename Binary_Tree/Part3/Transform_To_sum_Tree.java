//Transform to sum tree
public class Transform_To_sum_Tree {
   
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    }
   

    public static int Transform(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        /* 
        int Data = root.data; // Store the original data of the left subtree
        root.data = Transform(root.left) + Transform(root.right); // Update current node's data
        return root.data + Data;
        */
        //OR

        int leftChild = Transform(root.left);
        int rightChild = Transform(root.right);

        int Data = root.data; 
        int newLeft = root.left == null? 0 : root.left.data;
        int newRight = root.right == null? 0 : root.right.data;
        root.data = newLeft + leftChild + newRight + rightChild; 
        return Data;
    }

    public static void printInOrder(Node node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);
    }
    public static void main(String[] args)
    {
        /*
             1
            / \
           2   3
          / \ / \
         4  5 6  7
         
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right = new Node(3);
        root.right.right = new Node(7);
        root.right.left = new Node(6);

    //    Node ans = Transform(root);
    //    System.out.println(ans);
        
        Transform(root);
        printInOrder(root);
        System.out.println("\nroot data is:"+root.data);
    }
}


