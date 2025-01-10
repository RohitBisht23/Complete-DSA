// /*
// Find All Duplicate Subtree
// We have a binary tree, find all duplicate subtrees. For each duplicate subtree, we have only need to 
// return tje root node of any one of them. Two trees are duplicates if they have the same structure 
// with the same node values.
// ex:
//           1
//          / \
//         4   3
//        /   / \
//       3   4   3
//          /
//         3

// output:4-3,3
//  */

// import java.util.HashMap;

// public class Question4 {
//     static HashMap<String,Integer>map = new HashMap<>();
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data)
//         {
//             this.data = data;
//         }
//     }


//     public static String inOrder(Node root)
//     {
//         if(root == null)
//         {
//             return "";
//         }

//         String str = "(";
//         str += inOrder(root.left);
//         str += Integer.toString(root.data);
//         str += inOrder(root.right);
//         str += ")";

//         if(map.get(str) != null && map.get(str) == 1){
//             System.out.print(root.data+" ");
//         }

//         if(map.containsKey(str))
//         {
//             map.put(str,map.get(str)+1);
//         }else{
//             map.put(str,1);
//         }

//         return str;
//     }

//     public static void PRintAllDuplicate(Node root)
//     {
//         map = new HashMap<>();
//         inOrder(root);
//     }
//     public static void main(String[] args)
//     {/* 
//           1
//          / \
//         4   3
//        /   / \
//       3   4   3
//          /
//         3
        
//         */
//         Node root = new Node(1);
//         root.left = new Node(4);
//         root.left.left = new Node(3);
//         root.right = new Node(3);
//         root.right.right = new Node(3);
//         root.right.left = new Node(4);
//         root.right.left.left = new Node(3);

//         PRintAllDuplicate(root);
//     }
// }


//Below from chatGPT
import java.util.HashMap;

public class Question4 {
    static HashMap<String, Integer> map = new HashMap<>();
    static int identifier = 1; // Unique identifier for each subtree structure

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static String postOrder(Node root) {
        if (root == null) {
            return "#"; // Use "#" for null nodes
        }

        String left = postOrder(root.left);
        String right = postOrder(root.right);

        String subtreeStructure = left + "," + root.data + "," + right;
        // System.out.println("Subpath:"+subtreeStructure);

        map.put(subtreeStructure, map.getOrDefault(subtreeStructure, 0) + 1);

        if (map.get(subtreeStructure) == 2) {
            System.out.print(root.data + " ");
        }

        return subtreeStructure;
    }

    public static void printAllDuplicate(Node root) {
        map.clear();
        postOrder(root);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(4);
        root.left.left = new Node(3);
        root.right = new Node(3);
        root.right.right = new Node(3);
        root.right.left = new Node(4);
        root.right.left.left = new Node(3);

        printAllDuplicate(root);
    }
}
