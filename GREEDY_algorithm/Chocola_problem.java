/*
Chocola problam
We are given a bar of chocolate composed of MxN squares pieces.One should break the chocolate into single
squares.Each break of a part of the chocolate is changed a cost expression by a positive integer.
This cose does not depends on the size of the part that is being broken but only depends on the line
break goes along. Let us denote the costs of breaking along consecutive vertical line with X1,X1,..Xm-1
and along horizontal lines with Y1,Y2....Yn-1.
Complete the minimal cost of breaking the wholte chocolate into single squares

 */

import java.util.*;

public class Chocola_problem {
    public static void main(String[] args)
    {
        int n = 4, m = 6;
        Integer verCost[] = {2,1,3,1,4};
        Integer horCost[] = {4,1,2};

        //sort in reverse order so expensive costcut will be happaned first
        Arrays.sort(verCost,Comparator.reverseOrder());
        Arrays.sort(horCost,Comparator.reverseOrder());

        int h=0;
        int v = 0;
        int hp = 1;//Horizontal pieces
        int vp = 1; //Vertical pieces
        int cost = 0;

        while( h < horCost.length && v < verCost.length)
        {
            //comparing the maximum costcut to use first
            if(horCost[h] <= verCost[v])
            {
                cost += (verCost[v] * hp); //the hp will be the parts that will made after cut by vertical cut
                vp++;
                v++;
            }else{
                cost += (horCost[h] * vp);//the vp will be the parts that will made after cut by horizontal cut
                hp++;
                h++;
            }
        }
        
        while(h < horCost.length)
        {
            cost += (horCost[h] * vp);//the vp will be the parts that will made after cut by horizontal cut
            hp++;
            h++;
        }

        while(v < verCost.length)
        {
            cost += (verCost[v] * hp); //the hp will be the parts that will made after cut by vertical cut
            vp++;
            v++;   
        }

        System.out.println("Min cost to get all broken pieces of chocolate:"+cost);
    }
}
