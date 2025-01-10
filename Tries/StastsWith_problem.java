/*
StartsWith problem 
Create a function boolean startsWith(String prefix) for a trie.
Return true if there is a previously inserted string word that has the prefix and false otherwise.
Ex: word[] = {"apple","app","mango","man","woman"}
prefix: app ->output :true
prefix:moon ->output : false;
 */
public class StastsWith_problem {
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

    public static void insert(String str)
    {
        Node curr = root;
        for(int i=0; i<str.length(); i++)
        {
            int idx = str.charAt(i) - 'a';
            if(curr.children[idx] == null)
            {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.EndOfWord = true;
    }

    public static boolean StartsWith(String prefix)
    {
        Node curr = root;
        for(int i=0; i<prefix.length(); i++)
        {
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null)
            {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args)
    {
        String[]words = {"apple","app","mango","man","woman"};
        for(int i=0; i<words.length; i++)
        {
            insert(words[i]);
        }

        System.out.println(StartsWith("moon"));
    }
}
