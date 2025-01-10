import java.util.Scanner;

/*
Question 3:
Write a program to check if a number is palindrome or not
*/
public class Question3 {
    public static boolean isPalindrome(int n)
    {   
        int palindrome =n;
        int reverse = 0;
        while(palindrome!=0)
        {
            int remainder = palindrome%10;
            reverse = reverse*10+remainder;
            palindrome = palindrome/10;

        }
        if(n==reverse)
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
        System.out.print("Is numebr palidrome? :"+isPalindrome(n));
    }
    
}
