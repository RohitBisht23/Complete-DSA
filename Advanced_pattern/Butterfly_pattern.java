import java.util.Scanner;

/*   BUTERFLY PATTERN
     *             *
     * *         * *
     * * *     * * *
     * * * * * * * *
     * * * * * * * *
     * * *     * * *
     * *         * *
     *             *

 */
public class Butterfly_pattern {
    public static void Butterfly(int n) { 
        // for 1st half
        for (int i = 1; i <= n; i++) {
            // stars-i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces-2(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars-i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = n; i >= 1; i--) {
            // stars-i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces-2(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars-i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(Creation_string args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Butterfly(n);
    }
}
