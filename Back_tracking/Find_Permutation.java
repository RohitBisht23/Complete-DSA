/*
Find and print all permutation
 */
public class Find_Permutation {
    public static void FindPermutation(String str,String ans)
    {
        //Base case
        if(str.length() == 0)
        {
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0; i<str.length(); i++)
        {
            char curr = str.charAt(i);

            String newStr = str.substring(0, i) + str.substring(i+1);
            //From above line i th character is removed
            FindPermutation(newStr, ans+curr);
        }
    }
    public static void main(String[] args)
    {
        String str = "ab";
        FindPermutation(str,"");
    }
    
}
