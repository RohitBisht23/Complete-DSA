/*
Reverse the string using stack
 */
import java.util.*;
public class Reverse_String_using_stack {
    public static String reverseString(String str)
    {
        Stack<Character>s = new Stack<>();
        int idx = 0;
        while(idx <str.length())
        {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty())
        {
            char c = s.pop();
            result.append(c);
        }
        
        return result.toString();
    }
    public static void main(String[] args)
    {
        String str = "tihoR";
        System.out.println(reverseString(str));
       
    }
}
