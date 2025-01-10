/*
Sliding Window Maximum
Maximum of all subarray of size k
ex:1,2,3,4,5,6,7,8,9
k = 3
Ans:3,4,5,6,7,8,9
 */

import java.util.PriorityQueue;

public class Sliding_window_maximum {

    static class Pair implements Comparable<Pair>{
        int value;
        int idx;

        public Pair(int value,int idx)
        {
            this.value = value;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2)
        {
            //discending order
            return p2.value - this.value;
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,-1,2};
        int k = 3;//window size
        int result[] = new int[arr.length - k + 1];

        PriorityQueue<Pair>pq = new PriorityQueue<>();

        for(int i=0; i<k; i++)
        {
            pq.add(new Pair(arr[i], i));
        }

        result[0] = pq.peek().value;

        for(int i=k; i<arr.length; i++)
        {
            while(pq.size() > 0 && pq.peek().idx <= (i-k)){
                pq.remove();
            }

            pq.add(new Pair(arr[i], i));
            result[i-k+1] = pq.peek().value;
        }

        for(int i=0; i<result.length; i++)
        {
            System.out.print(result[i]+" ");
        }

    }
}
