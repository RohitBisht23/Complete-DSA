/*
Find the longest common prefix
Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */
public class Longest_Common_prefix {
    static class Node{
        Node []children = new Node[26];
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

    public static void insert(String str)
    {
        Node curr = root;
        for(int i=0; i<str.length(); i++)
        {
            int idx = str.charAt(i) - 'a';
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

    public static String getlongestPrefix(Node root,String str)
    {
       for(int i=0; i<root.l)
    }
    public static void main(String[] args)
    {
        String[] words = {"flower","flow","flight"};
        for(int i=0; i<words.length; i++)
        {
            insert(words[i]);
        }
        root.frequency = -1;
        System.out.println("longest prefix is:"+getlongestPrefix(root,""));
        // getlongestPrefix(root,"");
    }
}
