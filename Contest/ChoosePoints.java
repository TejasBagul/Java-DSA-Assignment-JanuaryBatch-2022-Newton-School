package Assignments.Contest;

/*
Choose points
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given N points on a horizontal axis. Find the number of ways you can choose 3 points such that maximum distance between those points is not greater than d.
Input
The first line contains two integers: N and d. The next line contains N space-separated integers x1, x2, ..., xN, — the x-coordinates of the points that Petya has got.

Constraints:
1 ≤ N ≤ 1e5
1 ≤ d ≤ 1e9
1 ≤ |x[i]| ≤ 1e9

It is guaranteed that the coordinates of the points in the input strictly increase.
Output
Print the number of ways to choose 3 points.
Example
Sample Input:
4 3
1 2 3 4

Sample Output:
4

Explanation:
1 2 3
1 2 4
2 3 4
1 3 4
are the required triplets

Sample Input:
4 2
-3 -2 -1 0

Sample Output:
2
 */

import java.util.Arrays;
import java.util.Scanner;

public class ChoosePoints {
    public static long countTriplet(int[] arr, int N, long d) {

        Arrays.sort(arr);
        long ways = 0;
        for (int i = 0; i < N; i++) {
/*
             for (int j = i + 1; j < N; j++) {
                 for (int k = j + 1; k < N; k++) {
                     int distance = arr[k] = arr[i];
                     if (distance <= d) {
                         ways++;
                     }
                 }
             }
 */
            long idx = solve(arr, 0, N, arr[i] + d);

            long numOfEle = idx - (i + 1);

            if (numOfEle >= 2) {
                ways += (numOfEle * (numOfEle - 1) / 2);
            }
        }
        return ways;
    }

    static int solve(int[] arr, int low, int high, long element) {
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > element) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long d = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(countTriplet(arr, N, d));
    }
}
