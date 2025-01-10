/*
 StringBuilder instead using string we use StringBuilder for conviency
 */
public class String_builder {
    public static void main(String args[])
    {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++)
        {
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }

    //Time Complexity: O(26) because 26 times loop has runned
}
