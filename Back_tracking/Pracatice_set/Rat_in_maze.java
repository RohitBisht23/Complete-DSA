/*        RAT IN THE MAZE
You are given a starting position for a rat which is stuck in a maze at an 
initial point(0,0), (The maze can be thought of as a 2-dimensional plane).The
maze would be given in the form of a square matrix of order N*N where cells 
with value 0 represent the maze's blocked locations while value 1 is the open/
available path that the rat can take to reach its destination. The rat's 
destination is at(N-1,N-1).
Your task is to find all the posible paths that the rat can take to reach from 
source to destination in the maze.
The posible direction that it can take to move in the maze are 'U'(up) i.e.(x,y-1),
'D'(down) i.e(x,y+1),'L'(left)i.e(x-1,y) and 'R'(right)i.e.(x+1,y).
 */

public class Rat_in_maze {
    // THE SOLUTION OF APNA COLLEGE 
    // public static boolean isSafe(int maze[][],int x,int y)
    // {
    //     //if (x,y out of maze) return false
    //     return (x>=0 && x <maze.length && y >=0 && y<maze.length && maze[x][y] ==1);
    // }

    // public static boolean solveMaze(int maze[][],int x,int y,int sol[][])
    // {
    //     if(x == maze.length-1 && y == maze.length-1 && maze[x][y] == 1)
    //     {
    //         sol[x][y] = 1;
    //         return true;
    //     }

    //     //check if maze[x][y] is valid
    //     if(isSafe(maze,x,y) == true)
    //     {
    //         if(sol[x][y]==1)
    //         {
    //             return false;
    //         }else{
    //             sol[x][y] = 1;
    //         }

    //         if(solveMaze(maze, x+1, y, sol)){
    //             return true;
    //         }
    //         if(solveMaze(maze, x, y+1, sol))
    //         {
    //             return true;
    //         }else{
    //             sol[x][y] = 0;
    //             return false;
    //         }
    //     }
    //     return false;
    // }
    // public static void Rat_move(int maze[][])
    // {
    //     int n = maze.length;
    //     int sol[][] = new int[n][n];

    //     if(solveMaze(maze,0,0,sol) == false)
    //     {
    //         System.out.println("Solution doesn't exists");
    //         return ;
    //     }else{
    //         printMaze(sol);
    //     return ;
    //     }
    // }

    // THE SOLUTION THAT YOU MADE WITH THE HELP PF STRIVER
    public static void solve(int maze[][],int i,int j,int sol[][])
    {
        if(i == maze.length -1 && j == maze.length-1)
        {   
            printMaze(sol);
            return;
        }

        // //downword
        // if(i+1<maze.length && sol[i+1][j] != 1 && maze[i+1][j] == 1)
        // {
        //     sol[i][j] = 1;
        //     solve(maze, i+1, j, sol);
        //     sol[i][j] = 0;
        // }

        // //uptword
        // if(i-1 >= 0 && sol[i-1][j]!=1 && maze[i-1][j] == 1)
        // {
        //     sol[i][j] =1;
        //     solve(maze, i-1, j, sol);
        //     sol[i][j] = 0;
        // }

        // //leftword
        // if(j-1>= 0 && sol[i][j-1] !=1 && maze[i][j-1]==1)
        // {
        //     sol[i][j] = 1;
        //     solve(maze, i, j-1, sol);
        //     sol[i][j] = 0;
        // }

        // //rightword
        // if(j+1<maze.length && sol[i][j+1] !=1 && maze[i][j+1]==1)
        // {
        //     sol[i][j] = 1;
        //     solve(maze, i, j+1, sol);
        //     sol[i][j] = 0;
        // }
        if(i >= 0 && i < maze.length && j >=0 && j <maze.length && maze[i][j] == 1 && sol[i][j]!=1)
        {
            sol[i][j] = 1;
            solve(maze, i+1, j, sol);//downword

            solve(maze, i-1, j, sol);//upword

            solve(maze, i, j+1, sol);//rightword

            solve(maze, i, j-1, sol);//leftword

            sol[i][j] = 0;
        }
    }

    public static void findPath(int maze[][])
    {
        int sol[][] = new int[maze.length][maze.length];
        if(maze[0][0] == 1)
        {
            solve(maze,0,0,sol);
            return;
        }
        // printMaze(sol);
    }
    public static void printMaze(int maze[][])
    {   System.out.println("--------Rat can take path-------");
        for(int i=0; i<maze.length;i++)
        {
            for(int j=0; j<maze.length; j++)
            {
                System.out.print(maze[i][j]+" ");
            }
            System.err.println();
        }
    }
    public static void main(String[] args)
    {
        int maze[][] = {
            {1,0,0,0},
            {1,1,0,1},
            {1,1,0,0},
            {0,1,1,1},
        };
        findPath(maze);
    }
}


