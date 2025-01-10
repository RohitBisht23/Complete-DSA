/* 
Find the closest element in Binary Search Tree
We have a binary tree and a target node k.The task is to find the node with minimum absolute difference
with given target value k.
ex:                    8
                     /   \
                    5     11
                   / \      \
                  3   6      20
sample input1: 19
sample output:20(difference is 1)

 */

public class Question2 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
        }
    }

    public static int min_diff ;
    public static int min_diff_node;

    public static void minDefference(Node root,int key)
    {
        if(root == null)
        {
            return;
        }

        if(root.data == key)
        {
            min_diff = key;
            return;
        }

        if(min_diff > Math.abs(root.data - key))
        {
            min_diff = Math.abs(root.data - key);
            min_diff_node = root.data;
        }

        if(key < root.data)
        {
            minDefference(root.left, key);
        }else{
            minDefference(root.right, key);
        }
    }

    public static int FindDefference(Node root,int key)
    {
        min_diff = 999999;
        min_diff_node = -1;
        minDefference(root, key);
        return min_diff_node;
    }

    public static void main(String[] args)
    {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(19);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(20);

        int key = 20;
        System.out.println(FindDefference(root,key));
    }
}
