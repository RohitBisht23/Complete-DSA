//Delete Node
public class Delete_Node {
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

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) { 
            // left subtree
            root.left = insert(root.left, val);
        } else {
            //right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    //Finding InOrderSuccessor
    public static Node FindInOrderSuccessor(Node root)
    {
        while(root.left != null)
        {
            root = root.left;
        }
        return root;
    }

    public static Node Delete(Node root, int val)
    {
        //Search node
        if(root.data < val)
        {
            root.right = Delete(root.right, val);
        }else if(root.data >  val)
        {
            root.left = Delete(root.left, val);
        }else{//voila ->when root data is our deleting node

            //case 1:Node child (leaf NOde delete)
            if(root.left == null && root.right == null)
            {
                return null;//By returning null the rool will store null in its subtree so data will be deleted automatically
            }

            //Case 2:One child
            if(root.left == null)
            {
                return root.right;
            }
            else if(root.right == null)
            {
                return root.left;
            }


            //Case 3:Two children
            //findInOrder successor if deleting node
            Node IS = FindInOrderSuccessor(root.right);//Because IS always be leftMost node in right subtree
            
            //Replace value of root data with Is
            root.data = IS.data;
            root.right = Delete(root.right, IS.data);
        }
        return root;
    }
    public static void main(String[] args)
    {
        /*
                  8
                 / \
                5   10
               / \    \
              3   6    11
             / \        \
            1  4        14   
         */
        int value[] = { 8,5,10,3,6,11,1,4,14 };

        Node root = null;

        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }

        System.out.println("Real tree inorder traversal");
        inOrder(root);

        System.out.println("\nAfter deleting one node");
        Delete(root, 4);
        inOrder(root);
    }
}
