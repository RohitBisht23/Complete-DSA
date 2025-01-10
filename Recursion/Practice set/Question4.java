/*
Question 4:We are given a string s, we need to find the count of all contiguos
substrings starting and ending with the same character
Ex:S = "abcab"
Output = 7
there are 15 substring of "abcab":"a","ab","abc","abca","abcab","b","bc","bcab"
"c","ca","cab","a","ab","b",out of the above substring there are 7 substrings :
"a","abca","b","bcab","c","a" and "b", so only 7 constiguos substring start and
end with the same character
 */
public class Question4 {
    public static int countSubstring(String str,int i,int j,int n)
    {
        if(n == 1)
        {
            return 1;
        }
        if(n <= 0)
        {
            return 0;
        }
    
        // int res = countSubstring(str, i+1, j, n-1)+ countSubstring(str, i, j-1, n-1) - countSubstring(str, i+1, j-1, n-2);
        int first =countSubstring(str, i+1, j, n-1);
        // System.out.println("the value of first:"+first);
        
        int second = countSubstring(str, i, j-1, n-1);
        // System.out.println("the value of second:"+second);

        int third =  countSubstring(str, i+1, j-1, n-2);
        // System.out.println("the value of third:"+third);

        int res = first +  second - third;
        // System.out.println("the value of res:"+res);
        if(str.charAt(i) == str.charAt(j)){
            res++;
        }
        return res;
    }
    public static void main(String args[])
    {
        String str = "abcab";
        int n = str.length();
        System.out.println(countSubstring(str,0,n-1,n));
    }
}
