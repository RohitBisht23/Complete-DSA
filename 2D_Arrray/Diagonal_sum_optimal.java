/*  DIALGONAL SUM
OPTIMUM SOLUTION(Time complexity:O(n))
 */
public class Diagonal_sum_optimal {
    public static int DiagonalSum(int matrix[][])
    {
        int  sum = 0;
        for(int i=0; i<matrix.length; i++)
        {
            //primary diagonal
            sum += matrix[i][i];
            //secondary diagonal
            if(i != matrix.length -1 -i)
            {
                sum += matrix[i][matrix.length -1-i];
            }
        }
        return sum;
    }
    public static void main(Creation_string args[])
    {
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };

        System.out.print(DiagonalSum(matrix));
    }
    
}
