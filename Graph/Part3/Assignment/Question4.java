/*
Find The Size Of The Largest Region In The Boolean Matrix.
We have a matrix where each cell contains either a 0 or 1 and any cell containing a 1 is called
filled cell. Two cell are said to be connected if they are ajacent to each other horizonatally,
vertically and diagonally.If one or more filled cell are also connected, they form a region.Find the
size of largest region
Ex : M[][] = {
             {0,0,1,1,0},
             {0,0,1,1,0},
             {0,0,0,0,0},
             {0,0,0,0,0},
             };
Ans = 4 
 */
public class Question4
{
    public static int LargestRegion(int[][]M)
    {
        if(M == null || M.length == 0 || M[0].length == 0 )
        {
            return 0;
        }

        int row = M.length;
        int col = M[0].length;

        boolean vis[][] = new boolean[row][col];

        int MaxRegion = 0;
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(M[i][j] == 1 && vis[i][j] == false)
                {
                    int region = DFS(M,i,j,vis);
                    MaxRegion = Math.max(MaxRegion, region);
                }
            }
        }
        return MaxRegion;
    }

    public static int DFS(int M[][],int x,int y,boolean vis[][])
    {
        if(x < 0 || x >= M.length || y <0 || y >= M[0].length || vis[x][y] || M[x][y] == 0)
        {
            return 0;
        }

        vis[x][y] = true;
        int size = 1;

        // int DirectionX[] = {-1,-1,-1,0,0,1,1,1};
        // int DirectionY[] = {-1,0,1,-1,1,-1,0,1};
        int DirectionX[] = {1,0,-1,-1,-1,0,1,1};
        int DirectionY[] = {-1,-1,-1,0,1,1,1,0};

        for(int i=0; i<8; i++)
        {
            int newX = x + DirectionX[i];
            int newY = y + DirectionY[i];
            size += DFS(M, newX, newY, vis);
        }
        return size;
    }
    public static void main(String[] args)
    {
        // int M[][] = {
        //      {0,0,1,1,0},
        //      {0,0,1,1,0},
        //      {0,0,0,0,0},
        //      {0,0,0,0,0},
        //      };
        // int M[][] = {
        //     {0,1,0},
        //     {1,1,1},
        //     {1,0,0}
        // };
        int  M[][] = {
            {1,0,0,0},
            {0,1,1,0},
            {0,1,0,1},
            {1,0,0,1}
        };
        int result = LargestRegion(M);
        System.out.println(result);
    }
}