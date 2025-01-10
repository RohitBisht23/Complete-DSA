/*      SUDOKO SOLVE
Write a function to co,plete a sudoko
 */
public class Sudoko_solve {
    public static boolean IsSafe(int sudoko[][], int row, int col,int digit) {
        // Checkin for column
        for (int i = 0; i<=8; i++) {
            if (sudoko[i][col] == digit) {
                return false;
            }
        }

        //Checking for row
        for(int j=0; j<=8; j++)
        {
            if(sudoko[row][j] == digit)
            {
                return false;
            }
        }

        //Checking for grid
        int sr = (row/3) *3;
        int sc = (col/3) *3;

        for(int i = sr; i<=sr+3; i++)
        {
            for(int j = sc; j<=sc+3; j++)
            {
                if(sudoko[sr][sc] == digit)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean SolveSudoko(int sudoko[][], int row, int col) {
        // Base case
        if (row == 9 ) {
            return true;
        }

        // Recursion
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (sudoko[row][col] != 0) {
            return SolveSudoko(sudoko, nextRow, nextCol);
        } else {
            for (int digit = 1; digit <= 9; digit++) {
                if (IsSafe(sudoko, row, col, digit)) {
                    sudoko[row][col] = digit;
                    if (SolveSudoko(sudoko, nextRow, nextCol)) {// Solution exist
                        return true;
                    } else {
                        sudoko[row][col] = 0;// Backtracking
                    }
                }
            }
        }
        return false;

    }

    public static void printSudoku(int sudoko[][])
    {
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                System.out.print(sudoko[i][j]+" ");
            }
            System.err.println();
        }
    }

    public static void main(String[] args) {
        int sudoko[][] = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 },
        };
        if(SolveSudoko(sudoko, 0, 0)){
            System.out.println("Solution exits");
            printSudoku(sudoko);
        }else{
            System.out.println("Solution does not exits");
        }
    }
}