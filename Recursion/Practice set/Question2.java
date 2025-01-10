/*
Question 2:You are given a number(eg:2019)converet it into english like
"two zero one nine". Use recursive function to solve this problem.
NOTE:The digit of the number will only be in range 0-9 and the last digit
can't be 0.
 */

public class Question2 {
    static String digit[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void ConvertDigit(int n)
    {
        if(n == 0)
        {
            return;
        }
        int lastDigit = n % 10;
        ConvertDigit(n / 10);
        System.out.print(digit[lastDigit]+" ");
    }
    public static void main(String args[])
    {
        int number = 2019;
        ConvertDigit(number);
    }
}
