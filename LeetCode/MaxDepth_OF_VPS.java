//maximum nested depth of valid parenthesis string

import java.util.*;

public class MaxDepth_OF_VPS{
    public static int[] maxDepth(String str)
    {
        int arr[] = new int[str.length()];
        Stack<Character>s = new Stack<>();
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == '(')
            {
                s.push(str.charAt(i));
                i++;
            }
            if(str.charAt(i) == '(')
            {
                arr[i] = 1;
            }
        }
        return arr;
    }
    public static void main(String args[])
    {
        String str = "(()())";
        int result[] = maxDepth(str);
        for(int i=0; i<result.length; i++)
        {
            System.out.print(result[i]+" ");
        } 

    }

}