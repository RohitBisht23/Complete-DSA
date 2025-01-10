/*  FIND SUBSETS
Question2:Find and print all subsets of a given string
 */
public class Find_Subset{
    public static void subset(String str,String s,int i)
    {
        //Base case
        if(i == str.length())
        {
            System.out.println(s);
            return;
        }
        //Work
        //pick
        subset(str,s+str.charAt(i),i+1);
        
        //Not pick
        subset(str, s, i+1);
    }

    // USING STRINGBUILDER
    // public static void subset(String str,StringBuilder s,int i)
    // {
    //     if(i == str.length())
    //     {
    //         System.out.println(s);
    //         return;
    //     }

    //     subset(str, new StringBuilder(s).append(str.charAt(i)), i+1);

    //     subset(str, new StringBuilder(s), i+1);
    // }
    public static void main(String [] args)
    {
        String str = "abc";
        
        subset(str,"",0);
        // subset(str,new StringBuilder(" "),0);
    }
}