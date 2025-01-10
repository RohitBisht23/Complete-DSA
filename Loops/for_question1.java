import java.util.Scanner;

//Print the Square pattern

public class for_question1 {
    public static void main(Creation_string args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println(" * * * * ");
        }
    }
}
