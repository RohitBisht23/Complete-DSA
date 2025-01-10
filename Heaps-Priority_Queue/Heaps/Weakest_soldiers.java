/*
Weakest Soldiers
We are given an mxn binary matrix of 1's(soldiers) and 0's(civilians).The soldiers are positioned
in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each
row.
A row i is weaker than a row j if one of the followin g is true
1->The number of soldiers in row i is less than the number of civilians in row j.
2->Both rows have the same number of soldiers and i<j.
Find the k weakest rows.
ex: m = 4 , n = 2, k = 2
1 0 0 0 
1 1 1 1
1 0 0 0
1 0 0 0

Ans:row 0 and row 2
 */

import java.util.PriorityQueue;

public class Weakest_soldiers {
    static class Row implements Comparable<Row>{
        int SoldierAmount;
        int idx;

        public Row(int SA,int i)
        {
            this.SoldierAmount = SA;
            this.idx = i;
        }

        @Override
        public int compareTo(Row R2)
        {
            if(this.SoldierAmount == R2.SoldierAmount)
            {
                return this.idx - R2.idx;
            }else{
                return this.SoldierAmount - R2.SoldierAmount;
            }
        }
    }
    public static void main(String args[])
    {
        int army[][] = {{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int k = 2;

        PriorityQueue<Row> pq = new PriorityQueue<>();

        for(int i=0; i<army.length; i++)
        {
            int count = 0;
            //for soldier count
            for(int j=0; j<army[0].length; j++)
            {
                count += army[i][j] == 1 ? 1:0;
            }

            pq.add(new Row(count, i));
        }

        for(int i=0; i<k; i++)
        {
            System.out.println("R"+pq.remove().idx);
        }
    }
}
