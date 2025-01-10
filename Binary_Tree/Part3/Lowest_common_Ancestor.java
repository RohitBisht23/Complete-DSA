//Lowest common ancestor

import java.util.ArrayList;

public class Lowest_common_Ancestor {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            data = d;
            left = null;
            right = null;
        }
    }

    //Approach 1:TC = O(n), SC:O(n)
/*     
    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }

        path.add(root);

        if (root.data == n) {
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if (foundLeft || foundRight) {
            return true;
        }

        path.remove(path.size() - 1);//remove the last added node

        return false;
    }

    public static Node LcommonAncestor(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1); //O(n)
        getPath(root, n2, path2);//O(n)

        // Last common ancestor
        int i = 0;
        for (i = 0; i < path1.size() && i < path2.size(); i++) {//O(n)
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }

        // last equal node is->i-1
        Node lca = path1.get(i - 1);

        return lca;
    }
*/

    //Approach 2:tc:O(n),sc:O(1)
    public static Node LCA2(Node root,int n1,int n2)
    {

        if(root == null)
        {
            return null;
        }
        if(root.data == n1 || root.data == n2)
        {
            return root;
        }

        Node leftLca = LCA2(root.left, n1, n2);
        Node rightLca = LCA2(root.right,n1,n2);

        //leftLCA = value(valid),rightLCA = null
        if(rightLca == null)
        {
            return leftLca;
        }
        if(leftLca == null)
        {
            return rightLca;
        }

        //when both leftLca and rightLca return valid value then
        return root;
    }
    public static void main(String[] args) {

        /*
             1
            / \
           2   3
          / \ / \
          4 5 6  7
         
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right = new Node(3);
        root.right.right = new Node(7);
        root.right.left = new Node(6);

        int n1 = 4, n2 = 5;
        // Node ans = LcommonAncestor(root, n1, n2);
        Node ans = LCA2(root, n1, n2);
        System.out.println("The lowest common ancesto is:"+ans.data);
    }
}
