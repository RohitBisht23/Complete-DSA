import java.util.Scanner;

/*     Practice pattern
       * 
       * *
       *  *
       *   *
       *    *
       *    *
       *   *
       *  *
       * *
       * 
  
 */
public class Practice_1 {
    public static void Practice(int n)
    {
        //1st half:->
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.err.println();
        }

        //2nd half:->
        // for(int i=n;i>=1;i--)
        // {
        //     for(int j=1;j<=i;j++)
        //     {  
        //         // if(i==1||i==n||j==1||j==n){
        //         //     System.out.print("*");
        //         // }else{
        //         //     System.out.print(" ");

        //         }
        //     }
        //     System.err.println();
        // }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Practice(n);
    }
    
}
