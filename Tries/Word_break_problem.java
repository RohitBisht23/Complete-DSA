/*
Word break problem
Given an input string and a dictionary of words, find out if the input string can be broken into a 
space-separated sequence of dictionary words
EX: String:{i,like,sam,sung,mobile,ice};
key:"ilikesamsung"

output:true
 */

public class Word_break_problem {
    static class Node{
        Node children[] = new Node[26];
        boolean EndOfWord = false;

        public Node()
        {
            for(int i=0; i<children.length; i++)
            {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word)
    {
        Node curr = root;
        for(int level = 0; level<word.length(); level++)
        {
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null)
            {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.EndOfWord = true;
    }

    public static boolean search(String s)
    {
        Node curr = root;
        for(int i=0; i<s.length(); i++)
        {
            int idx = s.charAt(i) -'a';
            if(curr.children[idx] == null)
            {
                return false;
            } 
            curr = curr.children[idx];
        }
        return curr.EndOfWord == true;
    }

    public static boolean wordBreak(String key)
    {
        if(key.length() == 0)
        {
            return true;
        }
        
        for(int i=1; i<=key.length(); i++)
        {
            //substring(beg idx,last idx) //last index not included
            if(search(key.substring(0, i)) && wordBreak(key.substring(i)))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        String words[] = {"i","like","sam","samsung","mobile","ice"};
        String key = "ilikesamsung";
        
        for(int i=0; i<words.length; i++)
        {
            insert(words[i]);
        }
        boolean ans = wordBreak(key);
        System.out.println(ans);

    }
}
