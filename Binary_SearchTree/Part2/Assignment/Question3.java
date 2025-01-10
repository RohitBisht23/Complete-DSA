/*
Find K-th smallest element in the BST
we have the root of a binary tree and k as input, find k-th smallest element in BST.
Ex:         
 */
public class Question3 {
    static class Node{
        int data;
        Node left,right;
        Node(int data )
        {
            this.data = data;
        }
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

    public static int count;
    public static int result;
    public static void InroderTraversal(Node root,int k)
    {
        if(root == null || count >= k)
        {
            return ;
        }

        InroderTraversal(root.left, k);

        count++;
        if(count == k)
        {
            result = root.data;
            return;
        }

        InroderTraversal(root.right, k);

    }

    public static int FindKthNode(Node root,int k)
    {
        count = 0;
        result = 0;
        InroderTraversal(root, k);
        return result;
    }

    public static void main(String[] args)
    {
        Node root = null;
        root = insert(root, 8);
        insert(root, 5);
        insert(root, 3);
        insert(root, 6);
        insert(root, 11);
        insert(root, 20);

        int k = 4;
        System.err.println(FindKthNode(root,k));
    }
}
