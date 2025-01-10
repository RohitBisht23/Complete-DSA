//Build a BST

public class Build_BST {
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

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    //Search in BST
    public static boolean Search(Node root,int key)
    {
        if(root == null)
        {
            return false;
        }

        if(root.data == key)
        {
            return true;
        }

        if(root.data > key)
        {
            return Search(root.left, key);
        }else{
            return Search(root.right, key);
        }
        
    }

    public static void main(String[] args) {
        int value[] = { 4,2,7,5,8,9,10,1,3,6 };

        Node root = null;

        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }

        inOrder(root);
        if(Search(root, 101))
        {
            System.out.println("\nFound");
        }else{
            System.out.println("\nNot found");
        }
    }
}
