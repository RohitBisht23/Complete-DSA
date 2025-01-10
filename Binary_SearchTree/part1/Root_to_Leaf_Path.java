import java.util.ArrayList;

public class Root_to_Leaf_Path {
    static class Node{
        int data ;
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
            root = new Node(val);
            return root;
        }

        if(root.data > val)
        {
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }

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

    public static void printPath(ArrayList<Integer>Path)
    {
        for(int i=0; i<Path.size(); i++)
        {
            System.err.print(Path.get(i)+"->");
        }
        System.out.println("null");
    }
    public static void PrintPAth(Node root,ArrayList<Integer>Path)
    {
        if(root == null)
        {
            return;
        }
        

        Path.add(root.data);

        if(root.left == null && root.right == null)
        {
            printPath(Path);
        }
        PrintPAth(root.left, Path);
        PrintPAth(root.right, Path);
        Path.remove(Path.size()-1);    
        
    }
    public static void main(String[] args){
            /*
                  8
                 / \
                5   10
               / \    \
              3   6    11
                        \
                         14   
         */
        int value[] = {8,5,10,3,6,11,14};
        Node root = null;

        for(int i=0; i<value.length; i++)
        {
            root = insert(root,value[i]);
        }

        // InOrder(root);

        ArrayList<Integer> Path = new ArrayList<>();
        PrintPAth(root,Path);
    }
}
