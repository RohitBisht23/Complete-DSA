/* 
Question 1: Print the number of 7's that are in the 2D array.
example:->
input:int[][] array={{4,7,8},{8,8,7}};
output:2
 */

public class Question1 {
    public static int Presence(int matrix[][],int key)
    {
        int presence = 0;
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if(matrix[i][j] == key)
                {
                    presence++;
                }
            }
        }
        return presence;
    }
    public static void main(String args[])
    {
        int matrix[][] = {{4,7,8},
                          {8,8,7},
                         
                        };
        int key = 7;
        int result = Presence(matrix,key);
        System.out.print("7 present at:"+result+" Times");
    }
}
