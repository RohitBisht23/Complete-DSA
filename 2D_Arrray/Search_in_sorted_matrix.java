//Search in sorted matrix
/*
matrix looks like sorted in row wise also in column wise
10 20 30 40
15 25 35 45
27 29 37 48
32 33 39 50
this matrix is sorted in row wise ald in column wise
 */
public class Search_in_sorted_matrix {
    public static boolean SearchKey(int matrix[][],int key)
    {   //THIS COMMENETED PART IS BRUTE FORCE APPROACH ITS TC:O(N^2)
        // for(int i=0; i<matrix.length; i++)
        // {
        //     for(int j=0; j<matrix[0].length; j++)
        //     {
        //         if(matrix[i][j] == key)
        //         {
        //             System.out.println("Found at cell:"+ i+","+j);
        //             return true;
        //         }
        //     }
        // }
        // System.out.print("Not found");
        // return false;

        //OPTIMUM SOLUTION IS TC:O(n)->
        int row = 0; 
        int column = matrix[0].length -1;
        while(row <= matrix.length -1 && column >= 0)
        {
            if(matrix[row][column] == key)
            {
                System.out.println("Found at cell:"+row+","+column);
                return true;
            }
            if(matrix[row][column] > key)
            {
                column--;
            }else{
                row++;
            }
        }
        System.out.print("Not found!");
        return false;
    }
    public static void main(Creation_string args[])
    {
        int matrix[][]={
                        {10, 20, 30, 40},
                        {15, 25, 35, 45},
                        { 27, 29, 37, 48},
                        { 32, 33, 39, 50},
                      };
        
        int key = 39;
        SearchKey(matrix,key);
    }
    
}
