//Palindrome 

import java.util.Scanner;

public class Palindrome
{
    public static boolean isPalindrome(int n)
    {
        int palidrome = n;
        int reverse = 0;
        while(palidrome >0)
        {
            int lastDigit = palidrome % 10;
            reverse = reverse * 10 + lastDigit;
            palidrome /= 10;
        }
        if(reverse == n)
        {
            return true;
        }else{
            return false;
        }

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }
}