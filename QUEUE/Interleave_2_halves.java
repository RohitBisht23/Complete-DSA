/*
Interleave of two halves of a queue(even length)
ex:1,2,3,4,5,6,7,8,9,10
1,6,2,7,3,8,4,9,5,10
 */

import java.util.*;

public class Interleave_2_halves {
    public static void Interleave(Queue<Integer> Q,int size)
    {
        Queue<Integer>Qfirst =new LinkedList<>();
        for(int i=0; i<size/2; i++)
        {
            Qfirst.add(Q.remove());
        }

       while(!Qfirst.isEmpty())
       {
            Q.add(Qfirst.remove());
            int x = Q.remove();
            Q.add(x);
       }
       System.out.print(Q+" ");
    }
    public static void main(String[] args)
    {
        Queue<Integer>Q = new LinkedList<>();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);
        Q.add(6);
        Q.add(7);
        Q.add(8);
        Q.add(9);
        Q.add(10);
        
        int size = Q.size();
        Interleave(Q,size);
    }
}
