/*
Generate Binary number
Given a number N.The task is to generate and print all binary numbers with decimal values from 1 to N.
 */

import java.util.*;

public class Question1 {
    public static void generatePrintBinary(int n)
    {
        Queue<String> q = new LinkedList<>();

        q.add("1");

        while(n --> 0)
        {
            String s1 = q.peek();
            q.remove();
            System.out.println(s1);

            String s2 = s1;
            q.add(s1+'0');
            q.add(s2+'1');
        }

    }
    public static void main(String[] args)
    {
        int n = 3;
        generatePrintBinary(n);
    }
}
