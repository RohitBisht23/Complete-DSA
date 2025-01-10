/* SPIRAL METRIX
 give array:
 1 2 3 4
 5 6 7 8
 9 10 11 12
 13 14 15 16

 output should be:
 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 (spiral form of the metrix)
 */

public class spiral_matrix {
    public static void PrintSpiral(int matrix[][])
    {
        int StartRow = 0;
        int EndRow = matrix.length-1;
        int StartColumn = 0;
        int EndColumn = matrix.length -1;

        while(StartRow <= EndRow && StartColumn <= EndColumn)
        {
            //top boundary
            for(int j=StartColumn; j<=EndColumn; j++)
            {
                System.out.print(matrix[StartRow][j]+" ");
            }
            //right boundary
            for(int i=StartRow+1; i<= EndRow; i++)
            {
                System.out.print(matrix[i][EndColumn]+" ");
            }
            //bottom boundary
            for(int j=EndColumn-1; j>= StartColumn; j--)
            {   
                if(StartRow == EndRow)
                {
                    break;
                }
                System.out.print(matrix[EndRow][j]+" ");
            }
            //left boundary
            for(int i=EndRow-1; i>=StartRow+1; i--)
            {   
                if(StartColumn == EndColumn)
                {
                    break;
                }
                System.out.print(matrix[i][StartColumn]+" ");
            }

            StartColumn++;
            StartRow++;
            EndColumn--;
            EndRow--;
        }
    }
    public static void main(Creation_string args[])
    {
        int matrix[][] = {
                            {1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16},
                        };
        
        PrintSpiral(matrix);

    }
}
