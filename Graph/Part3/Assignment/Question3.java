/*
Minimum Time Required To Rot All Oranges.
We have a matrix of m*n where each cell in the matrix can have values, 0,1, or 2 which has the following
meaning.
0:Empty cell, 1:cells have fresh oranges and 2:cells hace rotted oranges.
We have to detemine what is the minimum time required so that all the oranges become rotted.A rotted
oranges ai index[i,j] can rot other fresh orange at index[i-1,j],[i+1,j],[i,j-1],[i,j+1](up,down,left
right).If it is impossible to rot evety orange then simply return -1.
ex: arr[][c] ={
               {2,1,0,2,1},
               {0,0,1,2,1},
               {1,0,0,2,1},
               } 
OutputAll oranges cannot be rotten
 */
import java.util.*;
public class Question3 {
    static class Pair{
        int row;
        int col;
        int time;
        public Pair(int r,int c,int t)
        {
            this.row = r;
            this.col = c;
            this.time = t;
        }
    }
    public static int orangeRotting(int grid[][])
    {
        int n = grid.length; 
        int m = grid[0].length;

        Queue<Pair>q = new LinkedList<>();
        int vis[][] = new int[n][m];

        int countFresh = 0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(grid[i][j] == 2)
                {
                    q.add(new Pair(i,j,0));
                    vis[i][j] = 2;
                }else{
                    vis[i][j] = 0;
                }
                if(grid[i][j] == 1)
                {
                    countFresh++;
                }
            }
        }

        int time = 0;
        int drow[] = {-1,0,1,0};
        int dcol[] = {0,1,0,-1};
        int count = 0;

        while(!q.isEmpty())
        {
            Pair curr = q.remove();
            time = Math.max(time,curr.time);

            for(int i=0; i<4; i++)
            {
                int nRow = curr.row + drow[i];
                int nCol = curr.col + dcol[i];

                //Check for valid coodinates & then for unvisited fresh orange
                if(nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && vis[nRow][nCol] == 0 && grid[nRow][nCol] == 1)
                {
                    q.add(new Pair(nRow, nCol, curr.time+1));
                    vis[nRow][nCol] = 2;
                    count++;
                }
            }
        }
        if(count != countFresh)
        {
            return -1;
        }else{
            return time;
        }
    }
    public static void main(String[] args)
    {
        // int grid[][] = {
        //        {2,1,0,2,1},
        //        {0,0,1,2,1},
        //        {1,0,0,2,1},
        //        };

        int grid[][] = {
                       {0,1,2},
                       {0,1,2},
                       {2,1,1}
        };
        
        int ans = orangeRotting(grid);
        if(ans == -1)
        {
            System.out.println("Not all oranges can be rotted");
        }else{
            System.out.println("Min time required to rotting all oranges are:"+ans);
        }
    }
}
