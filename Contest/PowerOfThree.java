package Assignments.Contest;

import java.util.Scanner;

/*
Power of Three
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Swapnil is challenged to build a tower of height greater than or equal to N. To build the tower he is given blocks of heights which are powers of 3. He can only use one type of block only once and is given infinite types of blocks. Help him make a tower of minimum height just greater than or equal to N.
Input
The first line of the input contains one integer T the number of tests. Then T test cases follow.
Each test case contains a single integer N.

Constraints:-
1 ≤ t ≤ 100
0 ≤ N ≤ 1e18 (10 to the power 18)
Output
For each testcase, print height of minimum possible tower greater than equal to N.
Example
Sample Input
5
1
8
4
6
5

Sample Output
1
9
4
9
9

Explanation:
N=1 => use one brick of height 30
N=8 => use one brick of height 32
N=4 => use two bricks of heights 30 and 31
N=6 => use one brick of height 32 . We can not use 2 bricks of same type so can't use two bricks of height 31.
 */

public class PowerOfThree {
    static int size = 40;
    static long[] p = new long[size];
    static long[] sum = new long[size];

    static long isPowerOfThree(long n) {
        if (n <= 0) {
            return 0;
        }
        long ans = 0;
        for (int i = 0; i < size; i++) {
            if (sum[i] >= n) {
                ans = p[i] + isPowerOfThree(n - p[i]);
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        p[0] = 1;
        sum[0] = 1;
        for (int i = 1; i < size; i++) {
            p[i] = 3 * p[i - 1];
            sum[i] = sum[i - 1] + p[i];
        }
        int T = sc.nextInt();
        while (T-- > 0) {
            long N = sc.nextLong();

            System.out.println(isPowerOfThree(N));
        }
    }
}
