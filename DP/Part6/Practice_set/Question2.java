/*
Print all combinations of balanced parentheses.
Write a function that generate all possible n pairs of balanced parentheses
Example: n =1
         output={}

n = 2;
output: {}{}, {{}}
 */
public class Question2 {
    public static void printParentheses(char str[],int pos,int n, int open,int close)
    {
        if (pos == 2 * n) {
            for (int i = 0; i < str.length; i++) {
                System.out.print(str[i]);
            }
            System.out.println();
            return;
        } else {
            if (open < n) {
                str[pos] = '{';
                printParentheses(str, pos + 1, n, open + 1, close);
            }
            if (close < open) {
                str[pos] = '}';
                printParentheses(str, pos + 1, n, open, close + 1);
            }
        }
    }
    public static void possibleCombination(int n)
    {
        char str[] = new char[n * 2];
        printParentheses(str, 0, n, 0, 0);
    }
    public static void main(String[] args)
    {
        int n = 3;
        
        possibleCombination(n);
    }
}
