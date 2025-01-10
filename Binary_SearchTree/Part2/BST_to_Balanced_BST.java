/*
Convert BST to balanced BST
ex:
given->         8                       |output->    8
               / \                      |           / \
              6   10                    |          5   11
             /     \                    |         / \  / \
            5       11                  |        3  6 10  12
           /         \                  |
          3            12               |
 */

import java.util.ArrayList;

public class BST_to_Balanced_BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
        }
    }
   
    public static void Inorder(Node root,ArrayList<Integer>arr)
    {
        if(root == null)
        {
            return ;
        }
        Inorder(root.left,arr);
        arr.add(root.data);
        Inorder(root.right,arr);
    }

    //Creating Balanced BST
    public static Node CreateBalanceBST(ArrayList<Integer>arr,int s,int e)
    {
        if(s > e)
        {
            return null;
        }
        int mid = (s + e)/2;
        Node root = new Node(arr.get(mid));

        root.left = CreateBalanceBST(arr, s, mid-1);
        root.right = CreateBalanceBST(arr, mid+1, e);
        return root;
    }
    
    public static void PreOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.err.print(root.data+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    public static void main(String args[])
    {
        /*
                 8
                / \
               6   10
              /     \
             5       11
            /          \ 
           3            12
         */
        Node root = new Node(8);
        root.left = new Node(6);
        root.right = new Node(10);
        root.left.left = new Node(5);
        root.right.right = new Node(11);
        root.left.left.left = new Node(3);
        root.right.right.right = new Node(12);

        
        ArrayList<Integer>arr = new ArrayList<>();
        Inorder(root,arr);
        Node root2 = CreateBalanceBST(arr,0,arr.size()-1);
        PreOrder(root2);
        /*
        expected output:      
                            8
                           / \
                          5   11
                         / \ /  \
                        3  6 10  12
         */
    }
}
