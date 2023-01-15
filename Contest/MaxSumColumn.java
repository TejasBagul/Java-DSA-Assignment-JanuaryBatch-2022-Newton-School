package Assignments.Contest;

import java.util.Arrays;
import java.util.Scanner;

/*
Max sum column
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a matrix of size M*N, your task is to find the maximum sum of a column.
Input
The first line of input contains two space- separated integers M and N. The next M lines of input contains N space- separated integers each depicting the values of the matrix.

Constraints:-
1 <= M, N <= 100
1 <= Matrix[][] <= 100000
Output
Print the maximum sum between the columns.
Example
Sample Input:-
3 3
1 2 3
4 5 6
7 8 9

Sample Output:-
18

Explanation:-
1 + 4 + 7 = 12
2 + 5 + 8 = 15
3 + 6 + 9 = 18
maximum = 18

Sample Input:-
3 2
1 4
9 6
9 1

Sample Output:-
19
 */

public class MaxSumColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[] maxSum = new int[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                maxSum[i] += arr[j][i];
            }
        }
        Arrays.sort(maxSum);
        System.out.println(maxSum[N - 1]);

    }
}
