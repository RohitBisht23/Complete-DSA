/*
Sorted array to balanced BST
You will have a sorted array and you need to create the balanced bst with hieght should be minimum.
ex:arr = {3,5,6,8,10,11,12}
output:       8
             / \
            5   11
           / \  / \
          3  6 10  12
 */

public class Sorted_Array_to_balanced_BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
        }
    }

    public static Node createBST(int arr[], int s,int e)
    {
        if(s > e)
        {
            return null;
        }
        int mid = (s + e)/2;
        Node root = new Node(arr[mid]);

        root.left = createBST(arr, s, mid-1);
        root.right = createBST(arr, mid+1, e);
        return root;
    }

    public static Node BST(int arr[])
    {
        Node root = null;
        root = createBST(arr,0,arr.length-1);
        return root;
    }

    public static void PostOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data+" ");
        PostOrder(root.left);
        PostOrder(root.right);
        // System.out.print(root.data+" ");
    }
    public static void main(String args[])
    {
        int arr[] = {3,5,6,8,10,11,12};
        Node root = BST(arr);
        PostOrder(root);
    }
}
