/*
Enter the cost 3 items from the user (using float data type)-a pencil,a pen
and an eraser.You have to output the total cost of the items back to the user
as their bill.
(Add on: You can also try adding 18% gst tax to the items in the bill as an 
advanced problem) 
*/
import java.util.*;
public class question3 {
 public static void main(String args[])
 {
    Scanner sc = new Scanner(System.in);
    float pen = sc.nextFloat();
    float pencil = sc.nextFloat();
    float eraser = sc.nextFloat();

    float total = pen+pencil+eraser;
    System.out.println("Bill is:" +total);

    //add on 18% gst
    float newTotal = total+(.18f*total);
    System.out.println("Bill with 18% gst:"+newTotal);

 }   
}
