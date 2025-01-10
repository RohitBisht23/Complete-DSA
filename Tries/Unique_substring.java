/*
Count Unique Substring
Given a string og length n of lowercase alphabet characters, we need to count total number of unique
substring of this string
ex: String = ababa
ans:10
ex:a,b,ab,ba,aba,bab,abab,baba,ababa,""
 */
public class Unique_substring {
    static class Node{
        Node charater[] = new Node[26];
        boolean EndOfWord = false;

        public Node()
        {
            for(int i=0; i<26; i++)
            {
                charater[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insertTRIE(String str)
    {
        Node curr = root;
        for(int i=0; i<str.length(); i++)
        {
            int idx = str.charAt(i) - 'a';
            if(curr.charater[idx] == null)
            {
                curr.charater[idx] = new Node();
            }
            curr = curr.charater[idx];
        }
        curr.EndOfWord = true;
    }

    public static int CountNode(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int count = 0;
        for(int i=0; i<26; i++)
        {
            if(root.charater[i] != null)
            {
                count += CountNode(root.charater[i]);
            }
        }
        return count + 1;//Added one for its own node.  
    }

    public static int CountUniquesubstr(String str)
    {
        //Step 1:Find all suffix
        for(int i=0; i<str.length(); i++)
        {
            String suffix = str.substring(i);
            insertTRIE(suffix);
        }
        return CountNode(root);
    }
    public static void main(String[] args)
    {
        String str = "ababa";
        int ans = CountUniquesubstr(str);
        System.out.println(ans);
    }
}
