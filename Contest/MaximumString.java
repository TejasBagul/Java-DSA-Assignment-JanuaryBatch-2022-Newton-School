package Assignments.Contest;

import java.util.Scanner;

/*
Maximum string
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string S, and an integer K your task is to find a lexicographically largest string by removing not more than K characters.
Input
The first line of input contains a single string S, the next line of input contains a single integer K.

Constraints:-
1 <= |S| <= 100000
1 <= K <= 100000

Note:- String will contain only lower case English letters.
Output
Print the lexicographically largest string possible after removing not more than K characters.
Example
Sample Input:-
abzccd
4

Sample Output:-
zd

Sample Input:-
dcba
5

Sample Output:-
dcba
 */

public class MaximumString {
    static String largestString(String num, int k) {

        // Final result String
        StringBuilder ans = new StringBuilder();

        for (char i : num.toCharArray()) {

            // If the current char exceeds the
            // character at the top of the stack
            while (ans.length() > 0 && ans.charAt(ans.length() - 1) < i && k > 0) {

                // Remove from the end of the String
                ans = new StringBuilder(ans.substring(0, ans.length() - 1));

                // Decrease k for the removal
                k--;
            }

            // Insert current character
            ans.append(i);
        }

        // Perform remaining K deletions
        // from the end of the String
        while (ans.length() > 0 && k-- > 0) {
            ans = new StringBuilder(ans.substring(0, ans.length() - 1));
        }

        // Return the String
        return ans.toString();
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int K = sc.nextInt();
        System.out.print(largestString(str, K));
    }
}
