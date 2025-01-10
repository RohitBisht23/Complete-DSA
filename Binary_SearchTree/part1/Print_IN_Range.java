/*
Print in range
ex: BSt

                  8
                 / \
                5   10
               / \    \
              3   6    11
             / \        \
            1  4        14   

k1 = 5, k2 = 12 
output:5,6,8,10,11     
*/
public class Print_IN_Range {
 
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    } 

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) { 
            // left subtree
            root.left = insert(root.left, val);
        } else {
            //right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void PrintINRange(Node root, int k1 , int k2)
    {
        if(root == null)
        {
            return;
        }
        if(root.data >= k1 && root.data <= k2)
        {
            PrintINRange(root.left, k1, k2);
            System.out.print(root.data+", ");
            PrintINRange(root.right, k1, k2);
        }

        else if(root.data < k1)
        {
            PrintINRange(root.left, k1, k2);
        }else{
            PrintINRange(root.right, k1, k2);
        }
    }
    public static void main(String[] args)
    {
        /*
                  8
                 / \
                5   10
               / \    \
              3   6    11
             / \        \
            1  4        14   
         */
        int value[] = { 8,5,10,3,6,11,1,4,14};

        Node root = null;

        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }

        // System.out.println("Real tree inorder traversal");
        // inOrder(root);

        int k1 = 5;
        int k2 = 12;
        PrintINRange(root,k1,k2);
    }
}


