/*
Prefix Problem
Find shortest and unique prefix for every word in a given list.
Assume no word is prifex of another.
Ex: arr[] = {"zebra","dog","duck","dove"}
Ans: {"z","dog","du","dov"}
 */
public class Prefix_problem {
    static class Node{
        Node children[] = new Node[26];
        boolean EndOfWord = false;
        int frequency;

        public Node()
        {
            for(int i=0; i<children.length; i++)
            {
                children[i] = null;
            }
            frequency = 1;
        }
    }

    public static Node root = new Node();
    public static void Insert(String word)
    {
        Node curr = root;
        for(int i=0; i<word.length(); i++)
        {
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null)
            {
                curr.children[idx] = new Node();
            }else{
                curr.children[idx].frequency++;
            }
            curr = curr.children[idx];
        }
        curr.EndOfWord = true;
    }
    public static void findPrefix(Node root,String ans)
    {
        if(root == null)
        {
            return;
        }

        if(root.frequency == 1)
        {
            System.out.println(ans);
            return;
        }

        for(int i=0; i<26; i++)
        {
            if(root.children[i] != null)
            {
                findPrefix(root.children[i], ans+(char)(i+'a'));
            }
        }
    }

    public static void main(String[] args)
    {
        String arr[] = {"zebra","dog","duck","dove"};
        for(int i=0; i<arr.length; i++)
        {
            Insert(arr[i]);
        }

        root.frequency = -1;
        findPrefix(root, "");
    }
}
