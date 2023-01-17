package Assignments.Contest;

import java.util.Scanner;
/*
Packing Rectangles (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There are n rectangles of the same size: w in width and h in length. It is required to find a square of the smallest size into which these rectangles can be packed. Rectangles cannot be rotated.
Input
The first line of the input contains three space separated integers w, h and n.

Constraints
1 ≤ w, h, n ≤ 109
Output
Output the minimum length of a side of a square, into which the given rectangles can be packed.
Example
Sample Input
2 3 10
Sample Output
9
Explanation
9 is the minimum size of the square in which all these rectangles can be fit.

 */

public class PackingRectangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long w = sc.nextInt();
        long h = sc.nextInt();
        long n = sc.nextInt();
        long left = 1, right = (long) (1e18);
        long ans = -1;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long x = mid / w;
            long y = mid / h;
            if (((y > 0 && x >= ((n - 1) / y + 1)) || (x > 0 && y >= ((n - 1) / x + 1)))) {
                ans = mid;
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
