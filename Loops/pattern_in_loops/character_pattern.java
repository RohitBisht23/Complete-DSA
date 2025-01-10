//character pattern
/*
 A
 BC
 DEF
 GHIJ
 */
import java.util.*;
public class character_pattern {
  public static void main(String args[])
  { 
    char ch = 'A';
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int line=1;line<=n;line++)
    {
        for(int character = 1;character<=line; character++)
        {
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
  }  
}
