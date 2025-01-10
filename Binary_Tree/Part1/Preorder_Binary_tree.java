//PreOrder binary tree creation

import java.util.*;

public class Preorder_Binary_tree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node BuildTree(int Nodes[])//Returning root node of the trree
        {
            idx++;
            if(Nodes[idx] == -1)
            {
                return null;
            }

            Node newNode = new Node(Nodes[idx]);
            newNode.left = BuildTree(Nodes);//left subtree creating
            newNode.right = BuildTree(Nodes);//right subtree creating

            return newNode;
        }

        //PreOrder travbersal
        public static void PreOrder(Node root)//root node will be passed
        {   
            //base case
            if(root == null)
            {
                return;
            }

            //Rule 1: print root
            System.err.print(root.data+" ");

            //Rule 2:print left subtree
            PreOrder(root.left);

            //Rule 3:print right subtree
            PreOrder(root.right);
        }

        //InOrder traversal
        public static void InOrder(Node root)
        {
            //Base case
            if(root == null)
            {
                return;
            }

            //Rule 1:Print left subtree
            InOrder(root.left);

            //Rule 2:Print root
            System.out.print(root.data+" ");

            //Rule 3:Print right subtree
            InOrder(root.right);

        }

        //PostOrder traverse
        public static void PostOrder(Node root)
        {
            //Base case
            if(root == null)
            {
                return;
            }

            //Left tree
            PostOrder(root.left);

            //Right tree
            PostOrder(root.right);

            //Node data
            System.out.print(root.data+" ");
        }

        //Level order traversal(iteratively)
        public static void LevelOrder(Node root)
        {
            if(root == null)
            {
                return;
            }

            Queue<Node> q = new LinkedList<>();

            q.add(root);
            q.add(null);

            while(! q.isEmpty())
            {
                Node currNode = q.remove();
                if(currNode == null)
                {
                    System.err.println();
                    if(q.isEmpty())//check if queue become empty
                    {
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.err.print(currNode.data+" ");
                    if(currNode.left != null)
                    {
                        q.add(currNode.left);
                    }
                    if(currNode.right != null)
                    {
                        q.add(currNode.right);
                    }
                }
            }
        }




        //Height of the tree
        public static int Height(Node root)
        {
            //Base case
            if(root == null)
            {
               return 0;
                
            }
            int LH = Height(root.left);
            int RH = Height(root.right);

            return Math.max(LH, RH) + 1;

        }

        //TOtal nodes in tree
        public static int CountNode(Node root)
        {
            //Base case 
            if(root == null)
            {
                return 0;
            }

            int LCount = CountNode(root.left);
            int RCount = CountNode(root.right);

            return LCount + RCount + 1;
        }
    }

    //Sum of Nodes
    public static int sum(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int LSum = sum(root.left);
        int RSum = sum(root.right);

        return LSum + RSum + root.data;
    }
    
    public static void main(String[] args)
    {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();

        Node root = tree.BuildTree(nodes);
        System.out.println("Root data:"+root.data);

        System.out.println("\nPreOrder traversal:->");
        //PreOrder traversal
        tree.PreOrder(root);

        System.out.println("\nInOrder traversal:->");
        //InOrder traversal
        tree.InOrder(root);

        System.out.println("\nPostOrder traversal:->");
        //PostOrder traversal
        tree.PostOrder(root);

        System.out.println("\nLevel Order traversal:->");
        tree.LevelOrder(root);

        //Height of the tree
        System.out.println("Height of the tree:"+tree.Height(root));

        //Total Nodes count
        System.out.println("Total number of nodes in tree are:"+tree.CountNode(root));

        //Total NOdes data sum
        System.out.println("Total nodes sum will be:"+ sum(root));
        
    }
}
