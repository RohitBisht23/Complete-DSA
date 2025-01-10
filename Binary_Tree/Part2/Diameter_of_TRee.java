//Diameter of a tree

public class Diameter_of_TRee {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    /*/   TC:O(N^2)
    public static int Height(Node root)
    {
    
        if(root == null)
        {
            return 0;
        }

        int lh = Height(root.left);
        int rh = Height(root.right);
        return Math.max(lh, rh) +1;

    }

    public static int Diameter(Node root)//TC:O(N^2)
    {
        if(root == null)
        {
            return 0;
        }
        int LeftDiameter = Diameter(root.left);
        int LeftHeight = Height(root.left);
        int RightDiameter = Diameter(root.right);
        int RightHeight = Height(root.right);
        
        int selfDiameter = LeftHeight + RightHeight + 1;

        return Math.max(selfDiameter,Math.max(LeftDiameter, RightDiameter));
    }

    */
    //Second approach:TC:O(n)
    static class Info{
        int diameter;
        int height;

        Info(int d,int h)
        {
            this.diameter = d;
            this.height = h;
        }
    }
    public static Info Diameter(Node root)
    {
        if(root == null)
        {
            return new Info(0, 0);
        }

        Info leftInfo = Diameter(root.left);
        Info rightInfo = Diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter),leftInfo.height+rightInfo.height+1);
        int ht = Math.max(leftInfo.height,rightInfo.height) +1;

        return new Info(diam,ht);
    }
    public static void main(String args[]) {
        /*
                    1
                   /  \
                  2    3
                 / \  / \
                4  5 6   7
1         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // System.out.println("The maximum diameter is:"+Diameter(root));

        System.out.println("The maximum diameter is:"+Diameter(root).diameter);
        System.out.println("The maximum height is:"+Diameter(root).height);
    }
}
