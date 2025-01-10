/*
Connent N ropes
Given are N ropes of different lengths, the task is to connect these ropes into one rope with
minimum cosr, such that connect two ropes is equal to the sum of their length.
ex: ropes:{4,3,2,6}
Ans:29
 */

import java.util.PriorityQueue;

public class Connect_N_ropes {
    public static void main(String[] args)
    {
        int ropes[] = {4,3,3,2,6};
        PriorityQueue<Integer>pq = new PriorityQueue<>();

        for(int i=0; i<ropes.length; i++)
        {
            pq.add(ropes[i]);
        }

        int cost = 0;
        while(pq.size() != 1)
        {
            int min1 = pq.remove();
            int min2 = pq.remove();
            cost += min1 + min2;
            pq.add(min1 + min2);
        }
        System.out.println("Total cost of connecting N ropes:"+cost);
    }
}
