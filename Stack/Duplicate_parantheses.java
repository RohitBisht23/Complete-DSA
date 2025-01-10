/*               Duplicate parantheses
Given a balanced expression, find if it contains duplicate parentheses or not. A set of parentheses
are duplicate if the same subexpression is surrounded by multiple parantheses.
Return a true if it contains duplicates else return false

ex:
1-->(((a+(b)))(c+d))     true
2-->((((a)+(b))+c+d))    true
3-->((a+b)(c+d))         false
4-->(((a+b))+c)          true
  */
import java.util.Stack;
public class Duplicate_parantheses {
  public static boolean isDuplicate(String str)
  {
    Stack<Character> s = new Stack<>();
    for(int i=0; i<str.length(); i++)
    {
      char ch = str.charAt(i);
      //Closing:if ch is not closing then it will budefault be opening and operator and operand
      if(ch == ')' || ch == '}' || ch == ']'){
        int count = 0;
        while(!s.isEmpty() && (s.peek() != '(' || s.peek() != '[' || s.peek() != '{'))
        {
          s.pop();
          count++;
        }
        if(count <1)
        {
          return false; //duplicate
        }else{
          return true;
        }
      }else{
        s.push(ch); //case 1 when we get ch is opening bracket or operator or operand
      }
    }
    return false;
  }
    public static void main(String args[])
    {
      String str = "(((a+(b)))(c+d))";
      boolean result = isDuplicate(str);
      System.out.println(result);
    }
}
