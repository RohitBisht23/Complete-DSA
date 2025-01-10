/*
Find the minimum depth of the Binary Tree
 */
import java.util.*;
public class Question2 {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data = data;
            this.left = null; 
            this.right = null;
        }
    }

    static class Pair{
        Node node;
        int depth;
        public Pair(Node n,int d)
        {
            this.node = n;
            this.depth = d;
        }
    }

    public static int minDepth(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        while(!q.isEmpty())
        {
            Pair curr = q.remove();
            Node currNode = curr.node;
            if(currNode.left == null &&  currNode.right == null)
            {
                return curr.depth;
            }

            if(root.left != null)
            {
                q.add(new Pair(currNode.left,curr.depth +1));
            }

            if(root.right != null)
            {
                q.add (new Pair(currNode.right, curr.depth+1));
            }
        }
        return 0;
    }

    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(9);

        System.out.println("Minimum Depth is:"+minDepth(root));
    }
}
