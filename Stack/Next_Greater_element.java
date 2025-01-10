/*
The nex greater element of the some element x in an array is the first greater element that is to the
right of x in the same array.
arr = [6,8,0,1,3]
next greater = [8,-1,1,3,-1]
 */

import java.util.*;

public class Next_Greater_element {
    // public static ArrayList<Integer> BruteForce(ArrayList<Integer>l,int n)
    // {
    //     ArrayList<Integer>l2  = new ArrayList<>();
    //     for(int i=0; i<n; i++){
    //         int nextGreater = -1;
    //         for(int j=i+1; j<n; j++)
    //         {
    //             if(l.get(i) < l.get(j))
    //             {
    //                 nextGreater = l.get(j);
    //                 break;
    //             }
    //         }
    //         l2.add(nextGreater);
    //     }
    //     return l2;
    // }

    public static void main(String[] args)
    {
        // ArrayList<Integer>l = new ArrayList<>();
        // l.add(6);
        // l.add(8);
        // l.add(0);
        // l.add(1);
        // l.add(3);
        // int n = l.size();

        // ArrayList<Integer>result = BruteForce(l,n);
        // System.out.println(result);

        //TC:O(n)
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for(int i = arr.length-1; i>=0; i--)
        {
            while(!s.empty() && arr[s.peek()] <= arr[i])
            {
                s.pop();
            }
            if(s.empty())
            {
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0; i<nextGreater.length; i++){
            System.out.print(nextGreater[i]+" ");
        }
    }
}
