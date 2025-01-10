/*
Connect N ropes with minimum cost
Given are N ropes of different length, the task is to connect these rope into one rope with minimum
cost, such that the cost to connect two ropes equal to the sum of their lenths
Sample input: N=4, arr=[4,3,2,6]
sample output:29
 */

import java.util.PriorityQueue;

public class Question2 {
    public static int RopeConnect(int arr[], int n)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<n; i++)
        {
            pq.add(arr[i]);
        }
        int result = 0;
        while(pq.size() > 1)
        {
            int first = pq.poll();
            int second = pq.poll();

            result += first + second;
            pq.add((first + second));
        }
        return result;
    }
    public static void main(String[] args)
    {
        int n = 4;
        int arr[] = {4,3,2,6};
        int minCost = RopeConnect(arr,n);
        System.out.println("Minimum cost:"+minCost);
    }
}
