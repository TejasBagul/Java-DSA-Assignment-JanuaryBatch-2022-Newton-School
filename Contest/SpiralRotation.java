package Assignments.Contest;

/*
Spiral rotation
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There has been an attack on SHIELD. Nick Fury has given you the responsibility of protecting all the information but during the chaos he forgot to tell you how to login into the classified information. Just then a “secret code” appears on the screen.

Print the information in a 2D integer array of size (N x M) in a spiral form. That is, you need to print in the order followed for every iteration:
a. First row(left to right)
b. Last column(top to bottom)
c. Last row(right to left)
d. First column(bottom to top)
Mind that every element will be printed only once.
Input
The first line of input contains two integers N and M, the next N lines of input contains M space- separated integers each depicting the values of the matrix.

Constraints:-
2 <= N, M <= 500
1 <= Matrix[][] <= 1000000
Output
Print the matrix in spiral form as shown in the example.
Example
Sample Input:-
3 3
1 2 3
4 5 6
7 8 9

Sample Output:-
1 2 3 6 9 8 7 4 5

Sample Input:-
4 5
2 4 6 8 10
12 14 16 18 20
22 24 26 28 30
32 34 36 38 40

Sample Output:-
2 4 6 8 10 20 30 40 38 36 34 32 22 12 14 16 18 28 26 24
 */

import java.util.Scanner;

public class SpiralRotation {
    static void spiralMatrix(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        int direction = 1;

        while (top <= bottom && left <= right) {
            if (direction == 1) {
                for (int i = left; i <= right; ++i) {
                    System.out.print(arr[top][i] + " ");
                }
                ++top;
                direction = 2;
            } else if (direction == 2) {
                for (int i = top; i <= bottom; ++i) {
                    System.out.print(arr[i][right] + " ");
                }
                --right;
                direction = 3;
            } else if (direction == 3) {
                for (int i = right; i >= left; --i) {
                    System.out.print(arr[bottom][i] + " ");
                }
                --bottom;
                direction = 4;
            } else {
                for (int i = bottom; i >= top; --i) {
                    System.out.print(arr[i][left] + " ");
                }
                ++left;
                direction = 1;
            }
        }
    }

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
        spiralMatrix(arr);
    }
}
