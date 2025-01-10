import java.util.Scanner;

//print reverse of the number

public class print_number_for_loop {
    public static void main(Creation_string args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose reverse you want:");
        int number = sc.nextInt();
        while(number > 0)
        {
            int lastdigit = number % 10;
            System.out.print(lastdigit);
            number /= 10;
        }
        System.out.println();
    }
}
