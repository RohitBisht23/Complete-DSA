/*
Fractional knapsack
Given the weigths and values on N items, put these items in a knapsack of capacity W to get the 
maximum total value in the knapsack
ex: 
value=[60,100,120]
weigth=[10,20,30]
W = 50 (capacity of the knapsack)
ans=240
 */

import java.util.*;
import java.util.Comparator;

public class Fractional_knapsack {
    public static int FK(int value[] , int weigth[], int capacity)
    {
        double ratio[][] = new double[value.length][2];

        for(int i=0; i<value.length; i++)//place in 2D array index vised
        {
            //0th col = index
            //1th col = items ratio
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weigth[i];
        }

        //ascending order sorted
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));//sorted based on ratio i.e column 1
        
        //As we need that sorting in descending order that's why we run loop backwork


        int maxValue = 0;
        for(int i=ratio.length-1; i>= 0; i--)
        {   
            int idx = (int)ratio[i][0];//index that has hish ration
            System.out.println("Index"+i+" is"+idx);
            if(capacity >= weigth[idx])
            {
                maxValue += value[idx];
                capacity -= weigth[idx];
            }else
            {
                //include fractional value
                maxValue +=  (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }

        }
        return maxValue;
    }
    public static void main(String[] args)
    {
        int value[] = {60,100,120};
        int weigth[] = {10,20,30};
        int capacity = 50;

        System.out.println("Maximum value:"+FK(value,weigth,capacity));
    }
}
