//Creating 2-D array

import java.util.*;

public class Creation {
    public static boolean searchKey(int matrix[][],int key)
    {
        for(int i=0;  i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if(matrix[i][j] == key)
                {
                    System.out.println("Found at cell:("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }   
    public static void main(Creation_string args[])
    {
        //memory allocating
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;//matrix[0] represent first row and we find its length
        

        Scanner sc = new Scanner(System.in);

        //input 
        for(int i=0; i<n; i++) //rows
        {
            for(int j=0; j<m; j++) //columns
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i=0; i<n; i++) //rows
        {
            for(int j=0; j<m; j++) //columns
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        int key = 7;
        searchKey(matrix,key);

        //Printing largest and smallest element in matrix
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                largest = Math.max(largest,matrix[i][j]);
                smallest = Math.min(smallest,matrix[i][j]);
            }
        }
        System.err.println("largest:"+largest);
        System.err.println("smallest:"+smallest);
        
    }
}
