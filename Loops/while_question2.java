import java.util.Scanner;

//print number from 1 to 10

public class while_question2 {
  public static void main(Creation_string args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the range:");
    int n = sc.nextInt();
    int count = 1;
    while(count <= n)
    {
        System.out.println(count);
        count++;
    }
  }  
}
