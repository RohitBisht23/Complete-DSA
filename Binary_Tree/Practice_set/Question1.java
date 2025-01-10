/*
Check if a Binary tree  is univalued or not
We have a binary tree, the task is to check if a binary tree is univalued or not.If found to be true
then print "yes" else "No"
 */

public class Question1 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Boolean univaluedTree(Node root)
    {
        if(root == null)
        {
            return true;
        }

       if(root.left != null && root.data != root.left.data)
       {
        return false;
       }
       if(root.right != null && root.data != root.right.data)
       {
        return false;
       }
       return univaluedTree(root.left) && univaluedTree(root.right);
       
    }
    public static void main(String args[])
    {
        /*
                2
               / \
              2   2
             / \
            5   2
         */
        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(5);
        root.left.right = new Node(2);

        boolean result = univaluedTree(root);
        if(result == true)
        {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
