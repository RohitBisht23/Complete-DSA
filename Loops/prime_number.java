import java.util.Scanner;

//Prime number
import java.util.*;

public class prime_number {
    public static void main(Creation_string args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("n is prime");
        } else {
            boolean isPrime = true;
            // for (int i = 2; i < n - 1; i++) {
                for(int i=2;i<Math.sqrt(n);i++){
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.print("prime number\n");
            } else {
                System.out.print("Not a prime number\n");
            }
        }

    }
}
