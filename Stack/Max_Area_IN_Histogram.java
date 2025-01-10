/*
Given an array of integers heights representing the histogram's bar height where the width of each
bar is 1, return the area of the largest rectangle in the histogram.
ex: height= [2,1,5,6,2,3]
ans:10
 */

import java.util.Stack;

public class Max_Area_IN_Histogram {
    public static int MaxArea(int arr[])
    {   int maxArea = 0;
        Stack<Integer>s1 = new Stack<>();
        int NSR[] = new int [arr.length];
        //Calculating next smaller right
        for(int i=arr.length-1; i>=0; i--)
        {
            while(!s1.isEmpty() && arr[s1.peek()] >= arr[i])
            {
                s1.pop();
            }
            if(s1.isEmpty())
            {
                NSR[i] = arr.length;
            }else{
                NSR[i] = s1.peek();
            }
            s1.push(i);
        }
        

        //Calculating next smaller left
        s1 = new Stack<>(); //this will make stack empty
        int NSL[] = new int[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            while(!s1.isEmpty() && arr[s1.peek()] >= arr[i])
            {
                s1.pop();
            }
            if(s1.isEmpty())
            {
                NSL[i] = -1;
            }else{
                NSL[i] = s1.peek();
            }
            s1.push(i);
        }

        //Current area: widht= j-i-1 or it will be NSR[i]-NSL[i]-1;
        for(int i=0; i<arr.length; i++)
        {
            int height = arr[i];
            int widht = NSR[i] - NSL[i] - 1;
            int currentArea = height * widht;
            maxArea = Math.max(currentArea,maxArea);
        }
       
       
        return maxArea;
        
    }
    public static void main(String[] args)
    {
       int height[] = {2,1,5,6,2,3};
       int maxArea = MaxArea(height);
       System.out.println(maxArea);
    }
}
