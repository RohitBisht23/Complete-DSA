    {
        //Base case
        if(row == board.length)
        {
            PrintBoard(board);
            return;
        }
        //Recursion
        //column loop
        for(int j=0; j<board.length; j++)
        {
            board[row][j] = 'Q';
            NQueen(board, row+1);
            board[row][j] = 'X'; //Backtraking
        }
    }

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
        int n = 2;
        char board[][] = new char[n][n];
        //Initializing
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board.length; j++)
            {
                board[i][j] = '.';
            }
        }

        NQueen(board,0);
    }