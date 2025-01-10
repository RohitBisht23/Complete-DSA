/* 
Range sum of BST
We have a binary search tree consiting of N nodes and two positive integers L and R, the task is to 
find the sum of values of all the nodes that lie in the range[L,R].
Example:              8
                    /   \
                   5     11
                  / \      \
                 3   6     20
Output: 11

 */

public class Question1 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
        }
    }

    public static int rangeSum(Node root,int low,int high)
    {
        if(root == null)
        {
            return 0;
        }

        if(root.data >= low && root.data <= high)
        {
            return root.data + rangeSum(root.left, low, high) + rangeSum(root.right, low, high);
        }

        else if(root.data < low)
        {
            return rangeSum(root.right, low, high);
        }else {
            return rangeSum(root.left, low, high);
        }
        // return sum;
    }

    public static Node insert(Node root,int key)
    {
        if(root == null)
        {
            return new Node(key);
        }
        if(key <= root.data)
        {
            root.left = insert(root.left, key);
        }else{
            root.right = insert(root.right, key);
        }

        return root;
    }
    public static void main(String[] args)
    {
        Node root = null;
        root = insert(root, 10);
        insert(root, 5);
        insert(root, 15);
        insert(root, 3);
        insert(root, 7);
        insert(root, 18);

        int L = 7;
        int  R = 15;
        System.out.println(rangeSum(root,L,R));
    }
}
