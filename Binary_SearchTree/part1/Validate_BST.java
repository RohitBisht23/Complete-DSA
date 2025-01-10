
public class Validate_BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
        }
    }

    public static Node InsertBST(Node root,int val)
    {
        if(root == null)
        {
            root = new Node(val);
            return root;
        }

        if(root.data < val)
        {
            root.right = InsertBST(root.right, val);
        }
        else
        {
            root.left = InsertBST(root.left, val);
        }
        return root;
    }

    //Print tree
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

    //checking for valid or not
    public static boolean isValidBST(Node root, Node min,Node max)
    {
        if(root == null)
        {
            return true;
        }

        if(min != null && root.data <= min.data)
        {
            return false;
        }

        else if(max != null && root.data >= max.data)
        {
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }
    public static void main(String[] args) 
    {
        // int val[] = {8,5,3,6,10,11,14};//valid 
        int val[] = {1,1,1};//not valid
        Node root = null;

        for(int i=0; i<val.length; i++)
        {
            root = InsertBST(root, val[i]);
        }

        if(isValidBST(root,null,null))
        {
            System.out.println("Valid");
        }else{
            System.out.println("Not valid");
        }
    }   
}
