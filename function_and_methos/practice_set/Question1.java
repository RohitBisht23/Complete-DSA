/*
Question 1->
Write a java method to compute the average of three numbers
 */
import java.util.*;
public class Question1 {
    public static int average(int x,int y,int z)
    {
        return (x+y+z)/3;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.print("The average of three number is:"+average(x,y,z));
    }
    
}
