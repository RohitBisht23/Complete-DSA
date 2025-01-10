/*
Longest Word With Prefix
Find the longest String in word such that every prefix of it is also in word.
Ex: word = {"a","banana","app","ap","appl","apple"}
Ans:apple
 */
public class Longest_word_With_prefix {
    static class Node{
        Node character[] = new Node[26];
        boolean EndOfWord = false;

        public Node()
        {
            for(int i=0; i<26; i++)
            {
                character[i] = null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String str)
    {
        Node curr = root;
        for(int i=0;i<str.length(); i++)
        {
            int idx = str.charAt(i) - 'a';
            if(curr.character[idx] == null)
            {
                curr.character[idx] = new Node();
            }
            curr = curr.character[idx];
        }
        curr.EndOfWord = true;
    }

    public static String ans = "";
    public static void longestWord(Node root,StringBuilder temp)
    {
        if(root == null)
        {
            return;
        }

        for(int i=0; i<26; i++)
        {
            if(root.character[i] != null && root.character[i].EndOfWord == true)
            {
                char ch = (char)(i+'a');
                temp.append(ch);
                if(temp.length() > ans.length())
                {
                    ans = temp.toString();
                }
                longestWord(root.character[i],temp);
                temp.deleteCharAt(temp.length()-1);//backTrack
            }
        }
    }
    public static void main(String[] args)
    {
        String words[] = {"a","banana","app","ap","apply","appl","apple"};
        for(int i=0; i<words.length; i++)
        {
            insert(words[i]);
        }
        longestWord(root,new StringBuilder(""));
        System.out.println(ans);
    }
}
