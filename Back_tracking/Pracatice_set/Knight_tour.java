/*
Given a N*N board with the knight placed on the first block of an emoty board. Moving according
to the rules of chess knights must visit each square exactly once. Print the order of each cell in
wichi they are visited
 */


public class Knight_tour {
    static int n = 8;
    public static boolean isSafe(int x,int y,int sol[][])
    {
        if(x >= 0 && x < n && y >= 0 && y < n && sol[x][y] == -1)
        { 
            return true;
        }
        return false;
    }
    public static boolean solveKTTour(int i,int j,int step,int sol[][],int xMove[],int yMove[])
    {
        int k, nextX, nextY;
        if(step == n*n)
        {
            return true;
        }
        for(k=0; k<n;k++)
        {   
            nextX = i + xMove[k];
            nextY = j + yMove[k];
            if(isSafe(nextX,nextY,sol) == true)
            {
                sol[nextX][nextY] = step;
                if(solveKTTour(nextX, nextY, step+1, sol, xMove, yMove))
                {
                    return true;
                }else{
                    sol[nextX][nextY] = -1;
                }
             }
        }
        return false;
    }
    public static boolean solveKT(){
        int sol[][] = new int[8][8];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                sol[i][j] = -1;
            }
        }
        //8 directions coordinates of knight
        int xMove[] = {-2, -1, 1, 2, 2, 1, -1, -2};
        int yMove[] =  {1,  2, 2, 1, -1,-2,-2,-1};
        
        //as  the knight starts from cell(0,0)
        sol[0][0] = 0;

        if(!solveKTTour(0,0,1,sol,xMove,yMove))
        {
            System.out.println("Solution deos not exists");
            return false;
        }else{
            printSolution(sol);
            // return true;
        }
        return false;
    }
    public static void printSolution(int sol[][])
    {
        for(int i=0; i<sol.length; i++)
        {
            for(int j=0; j<sol.length; j++)
            {
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        solveKT();
    }
}

    