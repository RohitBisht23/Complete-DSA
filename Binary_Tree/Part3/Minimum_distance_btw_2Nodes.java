//Minimum distance between 2 nodes



public class Minimum_distance_btw_2Nodes {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    }

    //helper function used for find the lca node that is require
    public static Node LCA2(Node root,int n1,int n2)
    {
        if(root == null)
        {
            return root;
        }

        if(root.data == n1 || root.data == n2)
        {
            return root;
        }

        Node leftLca = LCA2(root.left, n1, n2);
        Node rightLca = LCA2(root.right, n1, n2);

        if(leftLca == null)
        {
            return rightLca;
        }
        if(rightLca == null)
        {
            return leftLca;
        }

        return root;
    }

    //Helper function find the distance between lca node to the element data 
    public static int lcaDistance(Node root,int n)
    {
        if(root == null)
        {
            return -1;
        }
        if(root.data == n)
        {
            return 0;
        }

        int leftDistance = lcaDistance(root.left, n);
        int rightDistance = lcaDistance(root.right, n);

        if(leftDistance == -1 && rightDistance == -1)
        {
            return -1;
        }else if(leftDistance == -1)
        {
            return rightDistance +1;
        }else{
            return leftDistance +1;
        }

    }
    public static int MinDistance(Node root,int n1,int n2)
    {
        Node lca = LCA2(root,n1,n2);

        int distance1 = lcaDistance(lca,n1);
        int distance2 = lcaDistance(lca,n2);

        return distance1 + distance2;
    }
    public static void main(String[] args)
    {
        /*
             1
            / \
           2   3
          / \ / \
         4  5 6  7
         
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right = new Node(3);
        root.right.right = new Node(7);
        root.right.left = new Node(6);

        int n1 = 4, n2 = 3;

        int ans = MinDistance(root,n1,n2);
        System.out.println("The minimum distance is :"+ans);
        
    }
}
