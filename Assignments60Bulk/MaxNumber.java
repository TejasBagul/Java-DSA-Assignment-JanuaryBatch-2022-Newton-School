package Assignments.Assignments60Bulk;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        // Your code here
        Scanner scn = new Scanner(System.in);
        long t = scn.nextLong();
        while (t > 0) {
            int n = scn.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scn.nextInt();
            }
            Arrays.sort(a);
            System.out.println(a[n - 1] + " " + a[n - 2] + " " + a[n - 3]);
            t--;
        }
    }
}
