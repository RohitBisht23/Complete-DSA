/*
Given a string contain ing digits from 2-9 inclusive, print all possible letter
combinations that the number could represent.
You can print the answer in any order
EX:23
Output:'ad','ae','af','bd','be','bf','cd','ce','cf'.
 */
public class Keyboard_combination {
    final static char L[][] = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},
{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};

    public static void bfs(int pos,int len,StringBuilder sb,String D)
    {
        if(pos == len)
        {
            System.out.println(sb.toString());
            return;
        }else{
            char Letters[] = L[Character.getNumericValue(D.charAt(pos))];
            for(int i=0; i<Letters.length; i++)
            {
                bfs(pos+1,len,new StringBuilder(sb).append(Letters[i]),D);
            }
        }
    }
    public static void letterCombination(String D)
    {
        int len = D.length();
        if(len == 0)
        {
            System.out.println("");
            return;
        }
        bfs(0,len,new StringBuilder(),D);
    }
    public static void main(String args[])
    {
        letterCombination("23");
    }
}
