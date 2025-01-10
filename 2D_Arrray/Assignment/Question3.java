/*
Question 3:Write a program to find Trapose of the matrix.
Example: original matrix: 1 2 3
                          4 5 6
                          7 8 9

Ita tranpose:  1 4 7
               2 5 8
               3 6 9
*/

public class Question3 {

    //print transpose matrix
    public static void printTranpose(int matrix[][])
    {   
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {  
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int matrix[][] ={
                        {11,12,13},
                        {21,22,23},
                        };
        
        
        int row = 2 ;
        int col = 3 ;
        int transpose[][] = new int[col][row];
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Tranpose matrix:");
        printTranpose(transpose);

        System.out.print("Original matrix:\n");
        printTranpose(matrix);
    }
    
}
