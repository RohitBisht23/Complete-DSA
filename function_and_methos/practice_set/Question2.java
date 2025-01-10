import java.util.Scanner;

/*
Question 2:
Write a method names "isEven" that accepts an int argument. The method should 
return true if the argument is even otherwise false. Also write a program to
test your method.
 */

public class Question2 {
    public static boolean isEven(int n)
    {
        if(n%2==0)
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

        if(isEven(n))
        {
            System.out.print("Number is even");
        }
        else{
            System.out.print("Number is odd");
        }
    }
    
}
