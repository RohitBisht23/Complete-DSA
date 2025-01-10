//Queue using Deque

import java.util.*;

public class Queue_using_Deque {
    static class Queue
    {
        Deque<Integer> dq = new LinkedList<>();

        public  void add(int data)
        {
            dq.addLast(data);
        }

        public  int remove()
        {
            return dq.removeFirst();
        }

        public  int peek()
        {
            return dq.getFirst();
        }
    }
    public static void main(String[] args)
    {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println("Peek:"+q.peek());
        q.remove();
        System.out.println("Peek:"+q.peek());
    }
}
