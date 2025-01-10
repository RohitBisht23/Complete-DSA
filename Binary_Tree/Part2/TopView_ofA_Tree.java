//Top view of a tree

import java.util.*;

public class TopView_ofA_Tree {
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

    static class Info {
        Node node;
        int HD; // Horizontal distance

        public Info(Node n, int hd) {
            this.node = n;
            this.HD = hd;
        }
    }

    public static void TopView(Node root) {
        // Level order traversal
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0;
        int max = 0;

        q.add(new Info(root, 0));// HD=0 of root because it is bydefault root node HD is 0
        // HD->Horizontal Distance
        q.add(null);
        
        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.HD))// first time my hd is occuring
                {
                    map.put(curr.HD, curr.node);
                }

                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.HD - 1));
                    min = Math.min(min, curr.HD - 1);
                }

                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.HD + 1));
                    max = Math.max(max, curr.HD + 1);
                }
            }

        }

        // Printing top view
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }

    public static void main(String[] args) {

        /*
         *   1
         *  / \
         * 2   3
          / \ / \
         4  5 4  6
         * 
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(6);

        /*
         *  1
         * / \
         *2   3
         * \
         *  4
         *   \
         *    5
         *     \
         *      6
         */
        Node secRoot = new Node(1);
        secRoot.left = new Node(2);
        secRoot.right = new Node(3);
        secRoot.left.right = new Node(4);
        secRoot.left.right.right = new Node(5);
        secRoot.left.right.right.right = new Node(6);

        TopView(root);
    }
}
