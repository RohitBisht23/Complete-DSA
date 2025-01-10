/*
Two Sum BSTs
Given a BST, transform it into a greater sum tree where each node contain sum of all nodes greater
that that node
 */

import java.util.Stack;

public class Question4 {
    static class Node{
        int data;
        Node left,right;

        Node(int data)
        {
            this.data = data;
        }
    }

    public static int CountPair(Node root1,Node root2,int x)
    {
        if(root1 == null || root2 == null)
        {
            return 0;
        }

        Stack<Node>s1 = new Stack<>();
        Stack<Node>s2 = new Stack<>();
        Node top1,top2;

        int count = 0;
        while(true)
        {
            //inserting the left Nodes of tree 1 onto stack1
            while(root1 != null)
            {
                s1.push(root1);
                root1 = root1.left;
            }

            
            //inserting the right nodes of tree2 onto stack 2
            while(root2 != null)
            {
                s2.push(root2);
                root2 = root2.right;
            }

            if(s1.empty() || s2.empty())
            {
                break;
            }

            
            top1 = s1.peek();
            top2 = s2.peek();
            if((top1.data + top2.data) == x)
            {
                count++;
                s1.pop();
                s2.pop();

                root1 = top1.right;
                root2 = top2.left;
            }
            else if((top1.data + top2.data) < x)
            {
                s1.pop();
                root1 = top1.right;
            }else{
                s2.pop();
                root2 = top2.left;
            }

        }
        return count;
    }
    public static void main(String[] args)
    {

        /*  Tree 1
                    5
                  /   \
                 3     7
                / \   / \
               2  4  6   8
         */
        Node root1 = new Node(5);
        root1.left = new Node(3);
        root1.right = new Node(7);
        root1.left.left = new Node(2);
        root1.left.right = new Node(4);
        root1.right.left = new Node(6);
        root1.right.right = new Node(8);

        /* Tree 2
                   10
                  /  \
                 6    15
                / \   / \
               3  8  11  18
         */
        Node root2 = new Node(10);
        root2.left = new Node(6);
        root2.right =  new Node(15);
        root2.left.left = new Node(3);
        root2.left.right = new Node(8);
        root2.right.left = new Node(11);
        root2.right.right = new Node(18);

        int x = 16;
        System.out.println("Number of pairs:"+CountPair(root1,root2,x));
    }
}
