//Diagonal sum  
/*All primary diagonal and secondary diagonal sum we have to find 
note:
1: primary sum diagonal condition are if(i==j) then cell element will added
2: secondary sum diagonal condition are if(i+j==n-1)the cell element will added

NOTE: THIS APPROACH IS NOT OPTIMAL ITS TIME COMPLEXITY IS O(N^2).
 */
public class Diagonal_sum {
    public static int DiagonalSum(int matrix[][])
    {
        int sum = 0;
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if(i == j)
                {
                    sum += matrix[i][j];
                }
                else if(i + j == matrix.length -1)
                {
                    sum += matrix[i][j];
                }
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
