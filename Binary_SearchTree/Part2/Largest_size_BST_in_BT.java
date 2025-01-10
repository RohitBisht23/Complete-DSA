/*
Size of largest BST in BT
ex:
          50
         /  \
        30   60
       /  \  /  \
      5   20 45  70
                /  \ 
               65  80

Ans:5

 */
public class Largest_size_BST_in_BT {
    static class Node {
        int data;
        Node left;
        Node right;
        Node (int data)
        {
            this.data = data;
        }
    }

    public static class Info{
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean b,int s,int min,int max)
        {
            this.isBST = b;
            this.size = s;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxBST = 0;
    public static Node maxRoot = null;
    public static Info lasrgestBST(Node root)
    {
        if(root == null)
        {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftInfo = lasrgestBST(root.left);
        Info rightInfo = lasrgestBST(root.right);

        int size = leftInfo.size + rightInfo.size +1;
        int min = Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max,rightInfo.max));

        //Invalid condition
        if(root.data <= leftInfo.max || root.data >= rightInfo.min)
        {
            return new Info(false,size,min,max);
        }


        if(leftInfo.isBST && rightInfo.isBST)
        {
            maxBST = Math.max(maxBST,size);
            maxRoot = root;
            return new Info(true,size,min,max);
        }

        return new Info(false, size, min, max);
    }
    public static void main(String args[])
    {
        /*
        
          50
         /  \
        30   60
       /  \  /  \
      5   20 45  70
                /  \ 
               65  80
         */
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        lasrgestBST(root);
        System.out.print("Lasgest BST size:"+maxBST);
        System.out.println("\nNode data:"+maxRoot.data);
    }
}
