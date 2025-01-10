/*
Mirror BST
ex:        8           |            8
          / \          |           / \
         5  10         |          5   10
        /\    \        |         / \    \
       3  6    11      |        3   6   11
 */
public class Mirror_BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
        }
    }

    public static Node insert(Node root,int val)
    {
        if(root == null)
        {
            return root = new Node(val);
        }

        if(root.data < val)
        {
            root.right = insert(root.right, val);
        }else{
            root.left = insert(root.left, val);
        }

        return root;
    }

    public static void Inorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }

    //Mirror of BST
    public static void mirror(Node root)
    {
        if(root == null)
        {
            return;
        }

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirror(root.left);
        mirror(root.right);
    }
    public static void main(String[] args)
    {
        int val[] = {8,5,10,3,6,11};
        Node root = null;
        for(int i=0;i<val.length; i++)
        {
            root = insert(root,val[i]);
        }
        Inorder(root);

        mirror(root);
        System.out.println("After making its mirrot:\n");
        Inorder(root);
    }
}
