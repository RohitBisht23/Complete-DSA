/*
Push at bottom of the stack
 */

import java.util.*;
public class Push_bottom_at_stack {
    public static void pushAtBottom(Stack<Integer>s,int data)
    {   
        //Base case
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args)
    {
        Stack<Integer>s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s,4);
    }
}
