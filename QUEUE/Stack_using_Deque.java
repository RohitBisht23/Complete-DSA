//Stack using Dequq

import java.util.*;

public class Stack_using_Deque {
    static class Stack{
        Deque<Integer> dq = new LinkedList<>();

        public  void push(int data)
        {
            dq.addLast(data);
        }

        public  int pop()
        {
            return dq.removeLast();
        }

        public  int peek()
        {
            return dq.getLast();
        }
    }
    public static void main(String[] args)
    {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("Peek:"+s.peek());
        System.out.println(s.pop());
        System.out.println("Peek:"+s.peek());
    }
}
