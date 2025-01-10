/*
N-Queen problem
 */
public class NQueen_problem {
    public static boolean isSafe(char board[][],int row,int col)
    {
        //Verticle up direction cheching
        for(int i=row-1; i>=0;i--)
        {
            if(board[i][col] == 'Q')
            {
                return false;
            }
        }

        //Diagonal Up left direction checking
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--)
        {
            if(board[i][j] == 'Q')
            {
                return false;
            }
        }

        //Diagonal Up right direction checking
        for(int i=row-1, j=col+1; i>=0 && j< board.length; i--,j++)
        {
            if(board[i][j] == 'Q')
            {
                return false;
            }
        }

        return true;
    }
    public static void NQueen(char board[][],int row)
    {
        //Base case
        if(row == board.length)
        {
            // PrintBoard(board);
            //Printing total ways to solve N-Queen problem
            count++;
            return;
        }
        //Recursion
        //column loop
        for(int j=0; j<board.length; j++)
        {
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                NQueen(board, row+1);
                board[row][j] = 'X'; //Backtraking
            }
           
        }
    }

    static int count=0;

    //Printing Board
    public static void PrintBoard(char board[][])
    {   System.out.println("----------Chess Board------------");
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board.length; j++)
            {
                System.err.print(board[i][j]+" ");
            }
            System.err.println();
        }
    }
    public static void main(String args[])
    {
        int n = 4;
        char board[][] = new char[n][n];
        //Initializing
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                board[i][j] = 'X';
            }
        }

        NQueen(board,0);
        System.out.println("Total ways to solve the N-Queen problem:"+count);
    }
}
