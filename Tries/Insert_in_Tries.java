//Insert in Tries also search in Tries
public class Insert_in_Tries {

    static class Node{
        Node children[] = new Node[26];
        boolean EndOfWord = false;

        Node()
        {
            for(int i=0; i<children.length; i++)
            {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    //Insert in trie
    public static void Insert(String word)//O(L) where is length of word
    {
        Node curr = root;
        for(int level = 0; level <word.length(); level++)
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

    //Search in Trie
    public static boolean search(String word)
    {
        Node curr = root;
        for(int level = 0; level<word.length(); level++)
        {
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null)
            {
                return false;
            }
            curr = curr.children[idx];
        }
        if(curr.EndOfWord == true)
        {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args)
    {
        String words[] = {"the","a","there","their","any","thee"};
        for(int i=0; i<words.length; i++)
        {
            Insert(words[i]);
        }
        System.out.println("Word exixts:"+search("there"));
    }
}
