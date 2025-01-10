//Kth level of the tree

import java.util.*;

public class Kth_levelOF_Tree {
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

    // Iterative i.e Level order traversal
    //NEED TO CALCULATE THROUGH ITERATIVE METHOD< RECURSIVE WE HAVE DONE
    // public static void kthlevel(Node root, int level, int k) {
    //     Queue<Node> q = new LinkedList<>();
    //     q.add(root);
    //     q.add(null);

    //     while (!q.isEmpty()) {
    //         Node currNode = q.remove();

    //         // if(level == k)
    //         // {
    //         // System.out.print(currNode.data+" ");
    //         // return;
    //         // }

    //         if (currNode == null) {
    //             if (q.isEmpty()) {
    //                 break;
    //             } else {
    //                 q.add(null);
    //             }
    //         } else {

    //             if (level == k) {
    //                 System.out.print(currNode.data + " ");
    //                 q.remove();
    //                 level++;
    //             }

    //             if (currNode.left != null) {
    //                 q.add(currNode.left);

    //             }

    //             if (currNode.right != null) {
    //                 q.add(currNode.right);

    //             }
    //             level++;
    //         }
    //     }
    //     // System.out.print("\nLevel is:"+level);

    // }

    // Recursive method
    public static void Klevel(Node root,int level,int k)
    {
    //Base case
    if(root == null)
    {
    return;
    }

    if(level == k)
    {
    System.out.print(root.data+" ");
    return;//for not check for its child node if level matched with k
    }

    Klevel(root.left,level+1,k);
    Klevel(root.right,level+1,k);
    }
    public static void main(String[] args) {

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

        Klevel(root, 1, 3);
        // kthlevel(root, 1, 2);
    }
}
