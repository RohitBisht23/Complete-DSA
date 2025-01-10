/*
Decode a string
We have an encoded string s and the task is to decode it.The pattern in which the strings are 
encoded is as follows.
Sample input 1: c[cv]
Sample output: cvcv

Sample input 2: 3[b2[v]]L
Sample output: bvvbvvbvvL


NOTE:Please solve this question properly. You have'not solved it in your note book
 */

import java.util.Stack;

public class Question3 {
    public static String decodeString(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                stack.push(ch);
            } else if (Character.isDigit(ch)) {
                int count = ch - '0';
                while (str.charAt(i + 1) >= '0' && str.charAt(i + 1) <= '9') {
                    count = count * 10 + (str.charAt(i + 1) - '0');
                    i++;
                }
                stack.push((char) count);
            } else if (ch == '[') {
                stack.push(ch);
            } else if (ch == ']') {
                StringBuilder decodedString = new StringBuilder();
                while (!stack.isEmpty() && stack.peek() != '[') {
                    decodedString.insert(0, stack.pop());
                }
                stack.pop(); // Remove '['
                int repeat = (char) stack.pop(); // Get the repeat count
                String repeatedSegment = decodedString.toString().repeat(repeat);
                for (char c : repeatedSegment.toCharArray()) {
                    stack.push(c);
                }
            }
        }
        

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }
        return result.toString();
    }


    public static void main(String args[]) {
        String str = "3[b2[v]]L";
        System.out.println(decodeString(str));

    }
}
