/*
K'th largest element in a stream
We have an infinite stream of integers, find the k'th largest element at any point of time.
input:stream[] = {10,20,11,70,50,40,100,5,....} k =3
Output:{_, _, 10,11,20,40,50,50,...}
 */

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Question1 {
    public static int getAllKlargest(int arr[], int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (minHeap.size() < k) {
                minHeap.add(arr[i]);
                
            }
            else {
                if (arr[i] > minHeap.peek()) {
                    minHeap.remove();
                    minHeap.add(arr[i]);
                }

            }
        }
        if (minHeap.size() >= k) {
            result = minHeap.peek();
        } else {
            result = -1;
        }

        return result;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 9, 4, 8, 6 ,5};
        int k = 3;
        int result = getAllKlargest(arr, k);
         System.out.print(result);
    }
}
