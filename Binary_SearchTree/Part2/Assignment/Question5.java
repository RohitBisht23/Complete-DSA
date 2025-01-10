/*
Maximum sum BST in binary tree
We have a binary tree, the task is to print the maximum sum of nodes of a sub tree which is also a 
binary search tree.
 */
public class Question5 {
    static class Node{
        int data;
        Node left,right;

        Node(int data)
        {
            this.data = data;
        }
    }

    static class info{
        int maxSum;
        int minSum;
        boolean isBST;
        int sum;
        int currSum;

        info(int maxSum,int minSum,int isBST,int sum,int currSum)
        {
            this.maxSum = maxSum;
            this.minSum = minSum;
            this.sum = sum;
            this.currSum = currSum;
        }
    }

    public static info MaxSumOfvalidBST(Node root){
        if(root == null)
        {
            return new info(Integer.MAX_VALUE, Integer.MIN_VALUE, true, 0, 0);
        }

        if(root.left == null && root.right == null)
        {
            return new info(root.data, root.data, true, root.data, root.data);
        }

        info L = MaxSumOfvalidBST(root.left);
    }
    public static void main(String[] args)
    {
        /* Binary tree
                     5
                    / \
                   9   2
                  / 
                 6
                / \
               8   7
        Output:8
         */
        Node root = new Node(5);
        root.right = new Node(2);
        root.left = new Node(9);
        root.left.left = new Node(6);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(7);
    
        int sum = 0;
        
    }
}
