/*
Nearly cars
We are given N points in a 2D plane, which are locations of N cars.If we are at the origin print the
nearest K cars.
ex:
c0(3,3)
c1(5,-1)
c2(-2,4)
k=2 (two nearest cars find)
and:c0,c2
 */

import java.util.PriorityQueue;

public class Nearly_cars {
    static class Points implements Comparable<Points>{
        int x;
        int y;
        int DisSquare;
        int idx;

        Points(int x,int y,int DisSquare,int idx)
        {
            this.x = x;
            this.y = y;
            this.DisSquare = DisSquare;
            this.idx = idx;
        }

        @Override
        public int compareTo(Points p2)
        {
            return  this.DisSquare - p2.DisSquare ;//ascending order
        }
    }

    public static void main(String[] args)
    {
        int pts[][] = {{3,3},{5,-1},{-2,4}};
        int k = 2;
       
        PriorityQueue<Points> pq = new PriorityQueue<>();

        for(int i=0; i<pts.length; i++)
        {
            int DisSquare = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new Points(pts[i][0], pts[i][1], DisSquare,i));
        }


        //Nearest cats
        for(int i=0; i<k; i++)
        {
            System.out.println("C"+pq.remove().idx);
        }
    }
}
