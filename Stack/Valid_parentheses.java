/*                    Valid parentheses
Given a string s containg just the characters '(',')','{','}','[',']', determine if the input string
is valid.
An input string is valid if:
1->Open brackets must be closed by the same type of brackets.
2->Open brackets must be closed in the correct order.
3->Every close bracket has a corresponding open brackets of the same type.

ex: S='()[]'
 */

import java.util.Stack;

public class Valid_parentheses {
    public static Boolean validParantheses(String str)
    {
        Stack<Character>s = new Stack<>();
        for(int i=0; i<str.length(); i++)
        {   
            char ch = str.charAt(i);
            //Opening
            if(ch == '(' || ch == '{' || ch == '[')
            {
                s.push(ch);
            }else{
                //Closing 
                if(s.isEmpty())
                {
                    return false;
                }
                if((s.peek() == '('  && ch == ')') || (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']'))
                {   
                    s.pop();
                    
                }else{
                    return false;
                }
            }
        }
        if(s.isEmpty())
        {
            return true;
        }else{
            return false;
        }
        
    }
    public static void main(String[] args)
    {
        String str = "([{}])";
        boolean result = validParantheses(str);
        System.out.println(result);   
    }
}
