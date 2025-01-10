/*
Trapping Rain water
We have an array of N non-negative integers arr[] representing an elevatio map where the width of 
each bar is 1, compute how much water it is able to trap after raining.

ex: arr[] = {7,0,4,2,5,0,6,4,0,5}
 */

import java.util.Stack;

public class Question4 {
    
        public static int MaxWater(int[] height) {
            int totalWater = 0;
            Stack<Integer> stack = new Stack<>();
            
            for (int current = 0; current < height.length; current++) {
                while (!stack.isEmpty() && height[current] > height[stack.peek()]) {
                    int top = stack.pop();
                    if (stack.isEmpty()) {
                        break;
                    }
                    int distance = current - stack.peek() - 1;
                    int boundedHeight = Math.min(height[current], height[stack.peek()]) - height[top];
                    totalWater += distance * boundedHeight;
                }
                stack.push(current);
            }
            
            return totalWater;
        }
    public static void main(String[] args)
    {
        int Bar[] = {7,0,4,2,5,0,6,4,0,5};
        System.out.println(MaxWater(Bar));
    }
}
