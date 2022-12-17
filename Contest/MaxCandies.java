package Assignments.Contest;

/*
Max Candies
easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a 2*N matrix in which each cell contains some candies in it. You are at the top left corner of the matrix and want to reach to the bottom right corner of the matrix i. e from (1, 1) to (2, N). You can only move right or down. You have to find the maximum number of candies you can collect in you journey.
Input
The first line of input contains a single integer N. The second line of input contains N spaces separated integers. The last line of input contains N space separated integers.

Constraints:-
2 <= N <= 10000
1 <= Matrix[i][j] <= 100000
Output
Print the maximum amount of candies you can have at the end of your journey.
Example
Sample Input:-
5
1 3 5 6 2
2 4 8 4 2

Sample Output:-
23

Sample Input:-
4
1 1 1 1
1 1 1 1

Sample Output:-
5
 */


import java.util.Scanner;

public class MaxCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] mat = new int[2][N];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int[][] res = new int[2][N];
        res[0][0] = mat[0][0];

        for (int i = 1; i < N; i++) {
            res[0][i] = mat[0][i] + res[0][i - 1];
        }
        mat[1][0] = mat[0][0] + mat[1][0];

        for (int i = 1; i < N; i++) {
            res[1][i] = mat[1][i] + Math.max(res[0][i], res[1][i - 1]); // self + max(top result, left result)
        }

        System.out.print(res[1][N - 1]);

    }
}
