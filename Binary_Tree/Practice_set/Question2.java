/*
Invert Binary Tree
Mirror of a Tree: Mirror of a Binary Tree T is another Binary Tree M(t) with left and right children
of all non leaf nodes interchanged
ex:
         1                 |            1
        / \                |           / \
       2   3               |          3   2
      / \ / \              |         / \ / \
     4  5 6  7             |        7  6 5  4
 */

public class Question2 {
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

    public static void InvertedTree(Node root)
    {
        if(root == null)
        {
            return;
        }

        /*Swappping the subtrees */
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        InvertedTree(root.left);
        InvertedTree(root.right);
    }
    public static void PrintInOrder(Node root)
    {
        if(root == null)
        {
            return;
        }

        PrintInOrder(root.left);
        System.out.print(root.data+" ");
        PrintInOrder(root.right);
    }
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        InvertedTree(root);
        PrintInOrder(root);
    }
}
