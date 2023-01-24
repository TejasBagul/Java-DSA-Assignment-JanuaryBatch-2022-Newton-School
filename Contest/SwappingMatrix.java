package Assignments.Contest;

/*
Swapping Matrix (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a 7 * 7 matrix of 48 zeroes and a single 1. In one move, you can swap any two adjacent rows or columns. Find the minimum number of moves required to bring the single 1 to the middle of the matrix.
Input
The input consists of 7 lines where each line contains 7 space seperated integers.

Constraints:
48 zeroes and a single one is present in the matrix.
Output
Print the minimum number of moves required to bring the single 1 to the middle of the matrix.
Example
Sample Input:
0 0 0 0 0 0 0
0 0 0 0 0 0 0
0 0 1 0 0 0 0
0 0 0 0 0 0 0
0 0 0 0 0 0 0
0 0 0 0 0 0 0
0 0 0 0 0 0 0

Sample Output:
2
 */

import java.util.Scanner;

public class SwappingMatrix {
    static int N = 7;

    static int moves(int[][] arr) {
        int c1 = N / 2, cj = N / 2;

        int oneI = 0, oneJ = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 1) {
                    oneI = i;
                    oneJ = j;
                    break;
                }
            }
        }
        return (Math.abs(c1 - oneI) + Math.abs(cj - oneJ));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 7;
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(moves(arr));
    }
}
