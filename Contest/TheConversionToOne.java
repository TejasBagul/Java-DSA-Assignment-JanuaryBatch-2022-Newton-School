package Assignments.Contest;

import java.util.Scanner;

/*
The Conversion To One
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a number N. You need to convert it to 1 in minimum number of operations.
The operations allowed are as follows:

1. If N is even then divide the number by 2.
2. If N is odd then you can either add 1 to it or subtract 1 from it.

Using the above operations, find the minimum number of operations require to convert N to 1.
Input
The first line of input contains an integer T denoting the number of test cases. T test cases follow. Each test case contains 1 line of input containing integer N.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 107
Output
For each testcase, in a new line, print the minimum number of steps required.
Example
Sample Input:
4
1
2
3
4

Sample Output:
0
1
2
2

Explanation:
Test Case 1: 1 can be converted into 1 in 0 steps.
Test Case 2: 2 can be converted into 1 in 1 step: 2 -> 1
 */

public class TheConversionToOne {
    public static int conversionToOne(int N) {
        if (N == 1) {
            return 0;
        } else if (N % 2 == 0) {
            return 1 + conversionToOne(N / 2);
        } else {
            return 1 + Math.min(conversionToOne(N - 1), conversionToOne(N + 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            System.out.println(conversionToOne(N));
        }
    }
}
