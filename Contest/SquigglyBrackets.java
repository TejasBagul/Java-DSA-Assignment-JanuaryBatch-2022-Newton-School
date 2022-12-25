package Assignments.Contest;

/*
Squiggly brackets
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Morgan Stark asks Peter for help in her HW. She is given an integer n representing the number of pairs of squiggly brackets. Her task is to find the number of all combinations of well- formed(balanced) squiggly brackets.
Input
The input contains only a single integer denoting the value of n.

Constraints:-
0 <= n <= 7
Output
Print the number of squiggly brackets.
Example
Sample Input:-
1

Sample Output:-
1

Explanation:-
{}

Sample Input:-
2

Sample Output:-
2

Explanation:-
{}{}
{{}}
 */

import java.util.Scanner;

public class SquigglyBrackets {
    public static int ans = 0;

    public static int solve(int n1, int n2) {
        if (n1 == 0 && n2 == 0) {
            ans++;
        }
        if (n1 > n2) {
            return 0;
        }
        if (n1 > 0) {
            solve(n1 - 1, n2);
        }
        if (n2 > 0) {
            solve(n1, n2 - 1);
        }
        return ans;
    }

    public static int count(int n) {
        if ((n&1) != 0) {
            return 0;
        }

        return solve(n / 2, n / 2);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n * 2));
    }
}
