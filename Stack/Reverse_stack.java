/*
Reverse the stack
 */

import java.util.Stack;

public class Reverse_stack {
    public static void pushAtBottom(Stack<Integer>s,int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void ReverseStack(Stack<Integer>s)
    {
        if(s.isEmpty())
        {
            return;
        }

        int top = s.pop();
        ReverseStack(s);
        pushAtBottom(s, top);
        
    }

    public static void printStack(Stack<Integer>s)
    {
        while(!s.empty())
        {
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args)
    {
        Stack<Integer>s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        printStack(s);
        ReverseStack(s);
        printStack(s);
    }
}
