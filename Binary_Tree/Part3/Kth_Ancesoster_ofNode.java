//Kth ancesoster of node
public class Kth_Ancesoster_ofNode {
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


    public static int KAncesoster(Node root,int n,int k)
    {
        if(root == null)
        {
            return -1;
        }
        if(root.data == n)
        {
            return 0;
        }

        int Leftdist = KAncesoster(root.left, n, k);
        int Rightdist = KAncesoster(root.right, n, k);

        if(Leftdist == -1 && Rightdist == -1)
        {
            return -1;
        }

        int max = Math.max(Leftdist, Rightdist);
        if(max + 1 == k)
        {
            System.out.println(root.data);
        }
        return max+1;
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

        int n = 5, k = 2;

        int ans = KAncesoster(root,n,k);
        // System.out.println("The Kth ancessor of Node is :"+ans);
        
    }
}


