/*Write a program to enter the set of integers from the user and print the
sum of odd and even numbers*/


import java.util.*;
public class odd_even_saperate_sum {
    public static void main(Creation_string args[])
    {
        int number;
        int evenSum = 0;
        int oddSum = 0;
        int choice;
        do{
            System.out.print("Enter the number:");
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            if(number % 2 ==0)
            {
                evenSum +=number;
            }
            else
            {
                oddSum+=number;
            }
            System.out.print("Do you want to continue? Press 1 for yes and 0 for no");
            choice = sc.nextInt();
        }while(choice == 1);
        System.out.println("Sum of even numbers are:"+evenSum);
        System.out.println("Sum of odd numbers are:"+oddSum);


    }
    
}
