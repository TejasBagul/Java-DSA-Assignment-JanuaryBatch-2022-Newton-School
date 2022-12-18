package Assignments.Contest;

/*
Longest valid Parenthesis
easy
asked in interviews by 1 company
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string S consisting of opening and closing parenthesis '(' and ')'. Find length of the longest valid parenthesis substring.
Input
Each test case have one line string S of character '(' and ')' of length N.

Constraints:
1 <= N <= 10^5
Output
Print the length of the longest valid parenthesis substring.
Example
Input
((()

Output
2

Input
)()())

Output
4
 */

import java.util.Scanner;
import java.util.Stack;

public class LongestValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int max = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') st.push(i);
            else {
                st.pop();
                if (st.empty()) st.push(i);
                else max = Math.max(max, i - st.peek());
            }
        }
        System.out.println(max);
    }
}
