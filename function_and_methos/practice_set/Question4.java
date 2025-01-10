import java.util.Scanner;

/*
Question 5:
Write a program to find sum of all digits in number
 */
public class Question4 {
    public static int NumSum(int n)
    {
        int sum = 0;
        while(n !=0)
        {
            int lastDigit = n%10;
            sum = sum+lastDigit;
            n /= 10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("The sum of the digit in the numbet is:"+NumSum(n));
    }
    
}
