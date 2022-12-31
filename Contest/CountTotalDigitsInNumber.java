package Assignments.Contest;

import java.util.Scanner;

/*
Count Total Digits in a Number
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a number n. You need to find the count of digits in n.
Input
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase contains one line of input containing n.

For Python Language Just Complete the function.

Constraints:
1 <= T <= 100
1 <= n <= 10^8
Output
For each testcase, in a newline, print the count of digits in n.
Example
Input:
2
1
99999
Output:
1
5

Explanation:
Testcase 1: Number of digits in 1 is 1.
Testcase 2: Number of digits in 99999 is 5
 */

public class CountTotalDigitsInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int Num = sc.nextInt();
            int count = 0;
//            while (Num != 0) {
//                Num /= 10;
//                ++count;
//            }
            for (; Num != 0; Num /= 10, ++count) {
            }
            System.out.println(count);
        }
    }
}
