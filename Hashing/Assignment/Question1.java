/*
Buttom view of binary  Tree
 */
import java.util.*;
public class Question1 {
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

    static class Info
    {
        Node node;
        int HD;

        public Info(Node node,int HD)
        {
            this.node = node;
            this.HD = HD;
        }
    }
    public static void bottomView(Node root)
    {
        HashMap<Integer,Node>map = new HashMap<>();
        Queue<Info>q = new LinkedList();
        int min = 0;
        int max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while(!q.isEmpty())
        {
            Info curr = q.remove();

            if(curr == null)
            {
                if(q.isEmpty())
                {
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!map.containsKey(curr.HD)){
                    map.put(curr.HD,curr.node);
                }else{
                    map.put(curr.HD,curr.node);
                }

                if(curr.node.left != null)
                {
                    q.add(new Info(curr.node.left, curr.HD-1));
                    min = Math.min(min,curr.HD-1);
                }

                if(curr.node.right != null)
                {
                    q.add(new Info(curr.node.right, curr.HD+1));
                    max = Math.max(max,curr.HD+1);
                }
            }
        }

        for(int i=min; i<= max; i++)
        {
            System.err.print(map.get(i).data+" ");
        }
    }
    public static void main(String[] args)
    {
        /*
                        10
                       /  \
                      5    11
                     / \     \ 
                    3   4     12
         */
        Node root = new Node(10);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right = new Node(11);
        root.right .right = new Node(12);

        bottomView(root);
    }
}
