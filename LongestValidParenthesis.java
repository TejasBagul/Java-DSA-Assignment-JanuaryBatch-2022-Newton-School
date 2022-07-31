package Assignments;


import java.util.Scanner;
import java.util.Stack;

public class LongestValidParenthesis {
    public static int longestValidParentheses(String s) {
        if (s.length() == 0) return 0; //If given String is Empty, then return 0

        Stack<Integer> stack = new Stack<>();
        stack.push(-1); //push value -1 to stack

        int requiredLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    requiredLength = Math.max(requiredLength, i - stack.peek());
                }
            }
        }

        return requiredLength;
    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int result = longestValidParentheses(S);
        System.out.println(result);
    }

}
