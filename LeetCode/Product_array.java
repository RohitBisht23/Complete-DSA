/*
Given an array of integers, return a new array such that each element at index i of the new array is
the product of all the numbers in the original array except the one at i.
Ex: array:[1,2,3,4,5]
output:[120,60,40,30,24]
 */

import java.util.ArrayList;

public class Product_array {

    public static ArrayList<Integer> ProductArray(ArrayList<Integer>l)
    {
        ArrayList<Integer>l2 = new ArrayList<>();
        //BRUTE FORCE APPROACH
        /* 
        int result = 1;
        for(int i=0; i<l.size(); i++)
        {
            for(int j=0; j<l.size(); j++)
            {
                if(i == j)
                {
                    continue;
                }else{
                    result = result * l.get(j);
                }
            }
            l2.add(i, result);
            result = 1;
        }

        return l2;  */


        //OPTIMIZE CODE

        int n = l.size();

        int leftProduct[] = new int[n];
        int rightProduct[] = new int[n];
        
        leftProduct[0] = 1;
        //left product
        for(int i=1; i<n; i++)
        {
            leftProduct[i] = leftProduct[i-1] * l.get(i - 1);
        }

        rightProduct[n-1] = 1;
        //right product
        for(int i=n-2; i>=0; i--)
        {
            rightProduct[i] = rightProduct[i+1] * l.get(i+1);
        }

        for(int i=0; i<n; i++)
        {
            l2.add( leftProduct[i] * rightProduct[i]);
        }

        return l2;

    }
    public static void main(String[] args)
    {
        ArrayList<Integer>li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);

        System.out.println("Original array:"+li);

        ArrayList<Integer> result = ProductArray(li);
        System.out.println("Product array:"+result);
    }
}
