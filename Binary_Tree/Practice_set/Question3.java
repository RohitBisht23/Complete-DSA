/*
Delete leaf nodes with value as x
We have a binary tree and a target integer x, delete all the leaf nodes value as x.Also delete the 
newly formed leaves with the target value as x
ex:
             1                        1
            / \                      /
           3   3     ---->          3
          / \                        \ 
         3   2                        2

 */

public class Question3 {
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
    public static Node Delete(Node root,int x)
    {
        if(root == null)
        {
            return null;
        }

        root.left = Delete(root.left,x);
        root.right = Delete(root.right, x);

        if(root.data == x && root.left == null && root.right == null)
        {
            return null;
        }
        return root;
    }

    public static void InOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);
    }
    public static void main(String[] args)
    {
        /*
               1
              / \
             3   3
            / \
           3   2
         */
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.left.right = new Node(2);
       
        Delete(root,3);
        InOrder(root);
    }
}
