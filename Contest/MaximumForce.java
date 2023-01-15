package Assignments.Contest;

import java.util.Arrays;
import java.util.Scanner;

/*
Maximum Force
easy
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array A of size n, and an integer k. Find the maximum force by involving only k elements. Force of an element is the square of its value.

Note: Elements are not needed to be continuous.
Input
The first line of the input contains two integers denoting n and k.
Next line contains n integers denoting elements of the array.

Constraints:
1 < = k < = n < = 1000
-10^7 <= A[i] <= 10^7
Output
Output the maximum force.
Example
Sample Input:
4 4
1 2 3 4

Output:
30

Explanation:
Force = 1*1 + 2*2 + 3*3 + 4*4 = 30

Sample Input:
2 1
1 10

Sample Output:
100
 */

public class MaximumForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] arr = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        long force = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] < 0) {
                arr[i] *= -1;
            }
        }
        Arrays.sort(arr);
        for (int i = N - 1; i >= 0; i--) {
            if (K > 0) {
                K--;
                force += arr[i] * arr[i];
            } else {
                break;
            }
        }
        System.out.print(force);

    }

}
