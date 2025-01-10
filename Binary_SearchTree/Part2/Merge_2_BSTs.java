/*
Merge 2 BST
ex:
    BST1->     2              BSTt2->   9        BSt1 + BST2->         3
              / \                      / \                            / \
             1   4                    3   12                         1   9
                                                                      \  / \
                                                                      2 4  12
*/
 

import java.util.*;

public class Merge_2_BSTs {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
        }
    }

    public static Node SumTree(ArrayList<Integer>arr,int s,int e)
    {
        if(s > e)
        {
            return null;
        }

        int mid = (s + e)/2;
        Node root = new Node(arr.get(mid));

        root.left = SumTree(arr, s, mid-1);
        root.right = SumTree(arr, mid+1, e);
        return root;
    }

    public static void getInorder(Node root,ArrayList<Integer>arr)
    {
        if(root == null)
        {
            return;
        }
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }

    public static Node MergeBSTS(Node root1,Node root2)
    {
        //step 1
        ArrayList<Integer>arr1 = new ArrayList<>();
        getInorder(root1,arr1);

        //step 2
        ArrayList<Integer>arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        //step 3 merge
        int i=0; int j=0;
        ArrayList<Integer>FinalArr = new ArrayList<>();
        while(i != arr1.size() && j != arr2.size())
        {
            if(arr1.get(i) <= arr2.get(j))
            {
                FinalArr.add(arr1.get(i));
                i++;
            }else{
                {
                    FinalArr.add(arr2.get(j));
                    j++;
                }
            }
        }

        while(i<arr1.size())
        {
            FinalArr.add(arr1.get(i));
            i++;
        }

        while(j<arr2.size())
        {
            FinalArr.add(arr2.get(j));
            j++;
            
        }
        Node finalRoot = SumTree(FinalArr, 0, FinalArr.size()-1);
        return finalRoot;
        
    }

    //Print final tree preorder sequence
    public static void preorder(Node root)
    {
        if(root == null)
        {
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
   
    public static void main(String[] args)
    {
        /* 
                 2
                / \
               1   3
         */
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(4);

        /*
               9
              / \
             3   12
         */
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        
        /* 
          EXPECTED TREE:
                  3
                 / \
                1   9
                \  / \
                 2 4  12
        
        Ite preOrder sequence: 
        */
        Node RootFinal = MergeBSTS(root,root2);
        preorder(RootFinal);
    }
}
