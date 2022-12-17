package Assignments.Contest;

/*
Mod Square
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array P of size N. You have to find the maximum value of Pi % Pj for all possible i, j pairs.
Input
First line contains a single integer N.
The second line of the input contains N space separated integers.

Constraints:
2 <= N <= 105
1 <= Pi <= 109
Output
Print the maximum value of Pi % Pj for all possible i, j pairs in the array.
Example
Sample Input:
5
8 6 7 9 4

Sample Output:
8

Explanation:
i = 1, j = 4 (1-based indexing) will give the maximum possible result over all (i, j) pairs.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ModSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }
        Arrays.sort(P);
        int result = 0;

        for (int i = N - 1; i >= 1; i--) {
            if (P[i] != P[i - 1]) {
                result = P[i - 1];
                break;
            }
        }
        System.out.println(result);
    }
}
